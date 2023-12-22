import java.io.PrintStream;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import semantic.impl.TypeClass;
import semantic.interfaces.SemanticSymbol;
import semantic.interfaces.SymbolConstant;
import semantic.interfaces.SymbolTable;
import semantic.interfaces.SymbolVariable;


/**
 * 
 * Siga as instru��es e complete os c�digos quando solicitado.
 *
 */

/**
 * Listener que gera c�digo para MIcroJava.
 */
public class CodeGeneratorListener extends MicroJavaBaseListener {

	/**
	 * Tabela de s�mbolos constru�da pela an�lise sem�ntica.
	 */
	private SymbolTable symbolTable;
	
	/**
	 * Mapeamento que associa n�s da �rvore sint�tica com s�mbolos
	 * da tabela de s�mbolos. Esse mapeamento tamb�m � constru�do na
	 * fase de an�lise sem�ntica.
	 */
    private ParseTreeProperty<SemanticSymbol> mapNodeToSymbol;
    
    /**
     * Arquivo de sa�da, onde o c�digo ser� gerado.
     */
	private PrintStream out;
	
	private int numPars; // para calcular n�mero de par�metros de cada m�todo
	private int numVars; // para calcular n�mero de vari�veis em cada m�todo
	
	/**
	 * Pilha usada para comunica��o de informa��es entre os m�todos do Listener.
	 */
	private StringStack stack;
	
	/**
	 * Grupo de templates a ser carregado.
	 */
	private STGroup stGroup;
	
	/**
	 * Contador para gerar labels diferentes.
	 */
	private int labelCounter;

	/**
	 * Construtor.
	 * @param symbolTable Tabela de s�mbolos, constru�da na an�lise sem�ntica.
	 * @param ptp Mapeamento entre n�s da �rvore e s�mbolos da tabela de s�mbolos.
	 * @param out Arquivo de sa�da onde ser� gerado o c�digo.
	 */
	public CodeGeneratorListener(SymbolTable symbolTable,
		    ParseTreeProperty<SemanticSymbol> ptp, PrintStream out) {
		this.symbolTable = symbolTable;
		this.mapNodeToSymbol = ptp;
		this.out = out;
		stGroup = new STGroupFile("templates/MJ.stg");
		stack = new StringStack();
		labelCounter = 1;
	}

	/**
	 * Gera novo label.
	 * @return Label gerado (usa n�meros sequenciais para gera label diferente,
	 * a cada chamada.
	 */
	private String genLabel() {
		return "LAB" + labelCounter++;
	}

	
	/**
	 * Abra o arquivo templates/MJ.stg. Esse arquivo cont�m os templates
	 * que iremos usar para produzir o texto dos c�digos.
	 * 
	 * Observe o primeiro template, de nome "prog". Esse template define
	 * o formato geral de todo o c�digo a ser gerado. Os par�metros s�o
	 * o n�mero de vari�veis globais e o c�digo gerado para os m�todos.
	 * 
	 * Observe abaixo o m�todo que visita um programa na �rvore de sintaxe.
	 * Ele ser� chamado pelo Listener quando todo o programa j� tiver sido
	 * processado.
	 * 
	 * O template "prog" � carregado, depois � usado para gerar um texto
	 * e esse texto � ent�o apresentado no arquivo de sa�da (o programa piloto
	 * est� usando System.out). Por enquanto ainda n�o definimos valores para
	 * os par�metros do template.
	 * 
	 * Rode o programa Piloto e observe a sa�da produzida.
	 * Compare com o template "prog".
	 */

	public void exitProgram(MicroJavaParser.ProgramContext ctx) {
		ST stProg = stGroup.getInstanceOf("prog");
		
		int k = symbolTable.popEnvironment().numVariaveis();
		stProg.add("numvars", k);
		String m = stack.popList("\n---------\n");
		stProg.add("methods", m);
		
		String result = stProg.render();
		out.println(result);
	}


	/**
	 * No m�todo exitProgram, defina o valor para o par�metro "numvars"
	 * do template, da seguinte forma:
	 * 
	 * 	 int k = symbolTable.popEnvironment().numVariaveis();
	 *   stProg.add("numvars", k);
	 *   
	 * O valor k ser� o n�mero de vari�veis definidas no ambiente que
	 * est� no topo da tabela de s�mbolos (ambiente global).
	 * Esses comandos devem aparecer depois que o template for carregado,
	 * e antes de ser usado para construir o c�digo.
	 * 
	 * Rode novamente o piloto e observe o c�digo gerado, agora contendo
	 * o n�mero de vari�veis globais correto. Insira outras vari�veis globais
	 * no programa em teste01.txt e observe as altera��es no c�digo gerado.
	 */
	
	
	/**
	 * Agora vamos iniciar a gera��o de c�digo para os m�todos.
	 * 
	 * Observe o template "method" no arquivo MJ.stg.
	 * Os par�metros s�o o nome do m�todo, o n�mero de par�metros e de
	 * vari�veis locais, e o c�digo das instru��es. Veja como o template
	 * usa essas informa��es para construir o c�digo completo para um m�todo.
	 * 
	 * Retire o coment�rio do m�todo abaixo, que � chamado ap�s visitar cada
	 * n� da �rvore de sintaxe associdado a um m�todo do programa de entrada.
	 * Ele carrega o template "method" e o usa para gerar c�digo.
	 * Rode o programa piloto e observe que, mesmo assim, ainda n�o foi gerado
	 * nenhum c�digo para os m�todos.
	 */
	
	public void exitMethodDecl(MicroJavaParser.MethodDeclContext ctx) {
		ST stMethod = stGroup.getInstanceOf("method");
		stMethod.add("name", ctx.IDENT().getText());
		
		stMethod.add("params",numPars);
		stMethod.add("vars", numVars);
		stMethod.add("instructions", stack.popString());
		
		stack.pushString(stMethod.render());
	}
	
	/**
	 * Para ver o que est� acontecendo na pilha, insira o seguinte comando
	 * no final do m�todo exitProgram:
	 * 
	 *   System.out.println(stack);
	 * 
	 * Rode de novo o programa piloto e observe que o conte�do da pilha
	 * ser� impresso ap�s o c�digo gerado em exitProgram.
	 * Veja que a pilha cont�m 2 n�s, um com c�digo gerado para o m�todo main
	 * e outro com c�digo gerado para o m�todo f.
	 * Falta coletar esses c�digos e passar tudo para o par�metro "methods"
	 * do template "prog". Para isso, vamos usar um servi�o da classe
	 * StringStack que facilita essa tarefa.
	 * 
	 * Retire o coment�rio do m�todo enterProgram, a seguir.
	 * Esse m�todo � executado logo antes de visitar o programa de entrada,
	 * ou seja, bem no in�cio do caminhamento na �rvore.
	 * Um programa pode ter v�rios m�todos, assim n�o se sabe a priori
	 * quantos elementos da pilha estar�o representando os c�digos desses
	 * m�todos. Assim, pushList insere uma "marca" na pilha indicando que
	 * uma sequ�ncia de elementos ser� empilhada, e depois podemos utilizar
	 * um m�todo especial para desempilhar toda essa sequ�ncia.
	 * 
	 * Ap�s retirar o coment�rio do m�todo abaixo, apague o comando 
	 * 
	 *   System.out.println(stack);
	 * 
	 * no m�todo exitProgram e insira os comandos abaixo:
	 * 
	 * 	  String m = stack.popList("\n---------\n");
	 *    stProg.add("methods", m);
	 *    
	 * ap�s ter carregado o template "prog", mas antes de us�-lo para
	 * gerar o c�digo. O m�todo popList desempilha tudo que estiver na
	 * pilha at� encontrar a "marca" que foi inserida quando usamos pushList.
	 * Uma �nica String � constru�da concatenando tudo o que foi desempilhado,
	 * com os elementos separados pelo par�metro usado em popList
	 * (nesse caso, "\n---------\n").
	 * 
	 * Rode o programa piloto novamente e veja o in�cio da gera��o de
	 * c�digo para os m�todos f e main, nessa ordem.
	 */

	public void enterProgram(MicroJavaParser.ProgramContext ctx) {
		stack.pushList();
	}

	
	/**
	 * Agora vamos nos ocupar de definir os valores para a instru��o enter
	 * que aparece no in�cio do c�digo de m�todos. Devem ser definidos:
	 * - o n�mero de par�metros do m�todo ("numpars");
	 * - o n�mero total de vari�veis locais, incluindo par�metros ("numvars").
	 * 
	 * Veja as produ��es da gram�tica que podem nos ajudar:
	 * 
	 *   methodDecl : typeOrVoid IDENT '(' formPars ')' varDecl* block ;
	 *   varDecl : type IDENT (',' IDENT)* ';' ;
	 *   formPars : ( formPar (',' formPar)* )?;
	 *   formPar: type IDENT ;
	 *   
	 * Estrat�gia:
	 * - Iniciar as vari�veis numPars e numVars com 0, antes de iniciar
	 * a visita de um m�todo ("enterMethoDecl").
	 * - Cada vez que um par�metro for visitado, incrementar a vari�vel
	 * numPars de 1 unidade ("exitFormPar").
	 * - A cada lista de vari�veis declaradas, incrementar a vari�vel numVars
	 * ("exitVarDecl").
	 * 
	 * Finalmente, em "exitMethodDecl", definir os valores para "numPars"
	 * e "numVars" no template, usando as vari�veis numPars e numVars:
	 *   stMethod.add("params", ...);
	 *   stMethod.add("vars", ...);
	 * 
	 * Complete os m�todos a seguir (retirando coment�rio), e n�o se
	 * esque�a de tamb�m inseriros comandos corretos em "exitMethodDecl".
	 * Depois rode o piloto novamente e confira se a instru��o enter
	 * no in�cio de cada m�todo est� com os valores corretos.
	 * Em f, deve ser "enter 2,5" e em main, deve ser "enter 0, 2".
	 */

	
	public void enterMethodDecl(MicroJavaParser.MethodDeclContext ctx) {
		numPars = 0;
		numVars = 0;
	}

	public void exitFormPar(MicroJavaParser.FormParContext ctx) {
		// incrementar numPars
		numPars++;
	}
	
	public void exitVarDecl(MicroJavaParser.VarDeclContext ctx) {
	    int n = ctx.IDENT().size(); // n�mero de vari�veis nesta declara��o
	    // incrementar numVars
	    numVars += n;
	}

	
	/**
	 * Vamos come�ar agora a gera��o de c�digo para comandos e express�es.
	 * 
	 * As constantes usadas em express�es est�o associadas � seguinte produ��o,
	 * na gram�tica de MicroJava:
	 * 
	 *   factor:
	 *     valConst    # Value
	 * 
	 * Complete o m�todo exitValue a seguir, para gerar c�digo para constantes.
	 * Ser� usado o template "const". Observe em MJ.stg que � um template
	 * bem simples. N�o rode o programa piloto ainda.
	 */

	public void exitValue(MicroJavaParser.ValueContext ctx) {
//		ST stConst = carrega o template de nome "const"
		ST stConst = stGroup.getInstanceOf("const");
		String s = ctx.valConst().getText(); // este � o valor da constante
//		no template stConst, fa�a o par�metro "val" ser igual a s
		stConst.add("val", s);
//		empilhe o resultado da impress�o desse template
		stack.pushString(stConst.render());
	}

	/**
	 * Na gram�tica de MicroJava, o corpo de um m�todo � um bloco, e um bloco
	 * � uma sequ�ncia de comandos:
	 * 
	 *   methodDecl : typeOrVoid IDENT '(' formPars ')' varDecl* block ;
	 *   block : '{' statement* '}' ;
	 *   
	 * Para que os c�digos dentro de um bloco sejam inseridos na posi��o
	 * correta na gera��o de c�digo de m�todos, � necess�rio reunir os c�digos
	 * de todos os comandos do bloco e pass�-los para o template que gera
	 * c�digo para m�todo. Assim, insira o seguinte comando em exitMethodDecl:
	 * 
	 *   stMethod.add("instructions", stack.popString());
	 *   
	 * Em seguida, retire o coment�rio dos m�todos a seguir e rode o programa
	 * piloto. Voc� dever� ver o c�digo para constantes dentro dos m�todos que
	 * usam constantes. Ainda n�o est� sendo gerado c�digo para comando de
	 * atribui��o.
	 */
	
	// Marca na pilha o in�cio de sequ�ncia de comandos (bloco).
	public void enterBlock(MicroJavaParser.BlockContext ctx) {
		stack.pushList();
	}

    // Desempilha o c�digo dos comandos do bloco e concatena todos,
    // separados por fim de linha.
	public void exitBlock(MicroJavaParser.BlockContext ctx) {
		stack.pushString(stack.popList("\n"));
	}

	
	/**
	 * Um identificador simples � definido na gram�tica de MicroJava
	 * pela produ��o:
	 * 
	 *   designator :
	 *     IDENT        # DesigId
	 * 
	 * O m�todo abaixo trata todos os casos de gera��o de c�digo para
	 * um idetificador simples:
	 * - pode ser constante, m�todo ou vari�vel;
	 * - se for vari�vel, pode ser local ou global;
	 * - se for local, pode ser leitura (load) ou escrita (store),
	 * dependendo se for a �ltima instru��o de um comando de atribui��o;
	 * - se for global, pode ser leitura (getStatic) ou escrita (putstatic),
	 * dependendo se for a �ltima instru��o de um comando de atribui��o.
	 * 
	 * Procure entender o c�digo.
	 * Retire o coment�rio e rode o programa piloto.
	 * Observe que o c�digo gerado para os identificadores est� correto,
	 * embora possa aparecer fora da ordem correta em comandos de atribui��o.
	 */

	public void exitDesigId(MicroJavaParser.DesigIdContext ctx) {
		TerminalNode treeNode = ctx.IDENT();
		SemanticSymbol s = mapNodeToSymbol.get(treeNode);
		if (s.isConstant()) {
			SymbolConstant sc = (SymbolConstant) s;
			ST stConst = stGroup.getInstanceOf("const");
			stConst.add("val", sc.getValue());
			stack.pushString(stConst.render());			
		} else if (s.isMethod()) {
			// tratado na alternativa Desig
		} else { // is variable
			SymbolVariable sv = (SymbolVariable) s;
			boolean isGlobal = sv.getLevel() == 1;
			int i = sv.getOffset();
			ParserRuleContext prc = ctx.getParent();
			ST stIdent;
			if (prc instanceof MicroJavaParser.AssignContext) {
				stIdent = stGroup.getInstanceOf("identWrite");
			} else {
				stIdent = stGroup.getInstanceOf("identRead");
			}
			stIdent.add("global", isGlobal);
			stIdent.add("offset", i);
			stack.pushString(stIdent.render());
		}
	}

	
	/**
	 * As opera��es de soma e subtra��o s�o representadas na gram�tica por:
	 * 
	 *   expr:
	 *     expr op=('+'|'-') term     # AddSub
	 * 
	 * O m�todo abaixo implementa a gera��o de c�digo para some e subtra��o.
	 * Retire o coment�rio, rode o programa piloto e verifique se o c�digo
	 * est� sendo gerado corretamente para este caso.
	 */

	public void exitAddSub(MicroJavaParser.AddSubContext ctx) {
		String op = ctx.op.getText();
		String op2;
		if (op.equals("+")) {
			op2 = "add";
		} else {
			op2 = "sub";
		}
		ST stOpArit = stGroup.getInstanceOf("opArit");
		String s2 = stack.popString();
		String s1 = stack.popString();
		stOpArit.add("op", op2);
		stOpArit.add("exp1", s1);
		stOpArit.add("exp2", s2);
		stack.pushString(stOpArit.render());
	}

	
	/**
	 * As opera��es *, / e % s�o representadas na gram�tica por:
	 * 
	 *   term:
	 *     term op=('*'|'/'|'%') factor   # MulDiv
	 * 
	 * Usando o m�todo exitAddSub como modelo, construa um m�todo exitMulDiv
	 * para gerar c�digo para essas opera��es. Rode o programa piloto e
	 * verifique se o c�digo est� sendo gerado corretamente para este caso.
	 */

	public void exitMulDiv (MicroJavaParser.MulDivContext ctx) {
		String op = ctx.op.getText();
		String op2;
		if(op.equals("*")) {
			op2 = "mul";
		}
		else {
			op2 = "div";
		}
		
		ST stOpArit = stGroup.getInstanceOf("opArit");
		String s2 = stack.popString();
		String s1 = stack.popString();
		stOpArit.add("op", op2);
		stOpArit.add("exp1", s1);
		stOpArit.add("exp2", s2);
		stack.pushString(stOpArit.render());
	}

	/**
	 * Em um comando de atribui��o simples como "d = 12", o c�digo para
	 * a express�o do lado direito deve ser gerado primeiro, e depois gerado
	 * um c�digo para alterar o valor da mem�ria.
	 * 
	 * O m�todo abaixo implementa esse comportamento. Ele usa o template
	 * "assign", sem definir ainda o par�metro "read", que ser� usado com
	 * designadores mais complexos como "x1.prox" ou "V[i]".
	 * Retire o coment�rio, rode o programa piloto e observe que agora
	 * as instru��es devem estar na ordem esperada para o c�digo de
	 * comandos de atribui��o.
	 */
	/*
	public void exitAssign(MicroJavaParser.AssignContext ctx) {
		String s1 = stack.popString();
		String s2 = stack.popString();
		ST stAssign = stGroup.getInstanceOf("assign");
		stAssign.add("exp", s1);
		stAssign.add("write", s2);
		stack.pushString(stAssign.render());
	}
	*/
	/**
	 * Quando designadores mais complexos como "x1.prox" ou "V[i]" s�o usados
	 * no lado esquerdo de uma atribui��o, o c�digo deve estar preparado para
	 * processar mais um elemento na pilha, associado a instru��es que realizam
	 * leitura na mem�ria antes da escrita. Assim, o m�todo exitAssign dever�
	 * sofrer pequenas altera��es, como apresentado abaixo.
	 * Antes de iniciarmos o tratamento de designadores mais complexos, troque
	 * o c�digo de exitAssign.
	 */

	public void exitAssign(MicroJavaParser.AssignContext ctx) {
		String s1 = stack.popString();
		String s2 = stack.popString();
		String s3 = "";
		ParseTree node = ctx.getChild(0); // lado esquerdo da atribui��o
		if (node instanceof MicroJavaParser.DesigDotContext ||
				node instanceof MicroJavaParser.DesigArrayContext) {
			s3 = stack.popString();
		}
		ST stAssign = stGroup.getInstanceOf("assign");
		stAssign.add("read", s3);
		stAssign.add("exp", s1);
		stAssign.add("write", s2);
		stack.pushString(stAssign.render());
	}
	
	/**
	 * Os m�todos abaixo geram c�digo para designadores envolvendo
	 * acesso a campos de classes e arrays.
	 * Retire o coment�rio, insira no arquivo teste01.txt casos de
	 * uso desses designadores, rode o programa piloto e confira se
	 * o c�digo est� sendo gerado corretamente.
	 */

	public void exitDesigDot(MicroJavaParser.DesigDotContext ctx) {
		TerminalNode treeNode = ctx.IDENT();
		SemanticSymbol s = mapNodeToSymbol.get(treeNode);
		SymbolVariable sv = (SymbolVariable) s;
		int i = sv.getOffset();
		ParserRuleContext prc = ctx.getParent();
		ST stDot;
		if (prc instanceof MicroJavaParser.AssignContext) {
			stDot = stGroup.getInstanceOf("dotWrite");
		} else {
			String s1 = stack.popString();
			stDot = stGroup.getInstanceOf("dotRead");
			stDot.add("desig", s1);
		}
		stDot.add("offset", i);
		stack.pushString(stDot.render());		
	}

	public void exitDesigArray(MicroJavaParser.DesigArrayContext ctx) {
		ParserRuleContext prc = ctx.getParent();
		boolean b = prc instanceof MicroJavaParser.AssignContext;
		String s2 = stack.popString();
		String s1 = stack.popString();
		ST stArray = stGroup.getInstanceOf("array");
		stArray.add("desig", s1);
		stArray.add("index", s2);
		stArray.add("isWrite", b);
		stack.pushString(stArray.render());
		if (b) {
			ST stArrayWrite = stGroup.getInstanceOf("arrayWrite");
			stack.pushString(stArrayWrite.render());			
		}
	}
	

	/**
	 * Uma condi��o em MicroJava pode aparecer dentro de um comando condicional
	 * ou dentro de um comando de repeti��o. Na gram�tica, tem a forma:
	 * 
	 *   condition : expr relop expr ;
	 *   
	 * Independente se a condi��o for usada em comando IF ou WHILE, o c�digo
	 * a ser gerado deve avaliar as 2 express�es envolvidas e depois realizar
	 * um desvio condicional. O desvio tem 2 componentes:
	 * - a opera��o de compara��o (eq, ne, gt, ge, lt, le);
	 * - o label para onde ir� desviar, caso a opera��o seja avaliada com
	 * resultado verdadeiro.
	 * 
	 * O m�todo exitCondition a seguir gera c�digo para condi��es.
	 * Para saber qual opera��o de compara��o � utilizada, consulta relop.
	 * Espera que o c�digo de ambas as express�es estejam na pilha.
	 * E espera que o nome do label para onde dever� desviar tamb�m esteja
	 * na pilha.
	 * 
	 * Em seguida, � apresentada a gera��o de c�digo para comando WHILE,
	 * que usa o c�digo de condi��o discutido acima. Produ��o na gram�tica:
	 * 
	 *   'while' '(' condition ')' statement       # While
	 * 
	 * No in�cio da visita a um n� que representa comando WHILE na �rvore,
	 * s�o gerados 3 labels diferentes, que s�o empilhados.
	 * Os labels ir�o estar associados a:
	 * - posi��o antes de testar a condi��o;
	 * - posi��o depois do t�rmino do while;
	 * - posi��o onde come�a o bloco de comandos que pertence ao while.
	 * 
	 * Como os r�tulos s�o diferentes, poderiam estar associados a qualquer
	 * uma das 3 posi��es que devem ser marcadas em um comando while.
	 * Entretanto, fica mais f�cil assumir que o �ltimo r�tulo a ser empilhado
	 * est� associado � posi��o onde come�a o bloco de comandos que pertence
	 * ao while, porque o primeiro componente do while a ser processado � sua
	 * condi��o. Quando a condi��o � processada, como discutimos acima, pega-se
	 * na pilha um label que indica a posi��o do desvio condicional. E em um
	 * comando while, caso a condi��o resulte em verdadeiro, deve-se fazer um
	 * desvio para o in�cio do bloco de comandos que pertence ao while.
	 * 
	 *  Retire os coment�rios, definindo os m�todos para gera��o de c�digo
	 *  para condi��es e comandos WHILE. Insira comandos while no arquivo de
	 *  entrada e rode o programa piloto. Verifique se o c�digo gerado est�
	 *  correto.
	 */
	
	public void exitCondition(MicroJavaParser.ConditionContext ctx) {
		String op = ctx.relop().getText();
		String op2;
		if (op.equals("<")) {
			op2 = "lt";
		} else if (op.equals(">")) {
			op2 = "gt";
		} else if (op.equals("==")) {
			op2 = "eq";
		} else if (op.equals("!=")) {
			op2 = "ne";
		} else if (op.equals("<=")) {
			op2 = "le";
		} else {
			op2 = "ge";
		}
		String exp2 = stack.popString();      // c�digo segunda express�o
		String exp1 = stack.popString();      // c�digo primeira express�o
		String label = stack.peekString();    // label para onde desviar
		ST stCond = stGroup.getInstanceOf("cond");
		stCond.add("op", op2);
		stCond.add("exp1", exp1);
		stCond.add("exp2", exp2);
		stCond.add("label", label);
		stack.pushString(stCond.render());
	}
	
	public void enterWhile(MicroJavaParser.WhileContext ctx) {
		stack.pushString(genLabel()); // label antes da condi��o
		stack.pushString(genLabel()); // label depois do while
		stack.pushString(genLabel()); // label in�cio do bloco
	}

	public void exitWhile(MicroJavaParser.WhileContext ctx) {
		String statement = stack.popString(); // c�digo do bloco
		String cond = stack.popString();      // c�digo da condi��o 
		String label1 = stack.popString();    // label in�cio do bloco
		String label2 = stack.popString();    // label depois do while
		String label3 = stack.popString();    // label antes da condi��o
		ST stWhile = stGroup.getInstanceOf("while");
		stWhile.add("init", label3);
		stWhile.add("cond", cond);
		stWhile.add("iftrue", label1);
		stWhile.add("statement", statement);
		stWhile.add("iffalse", label2);
		stack.pushString(stWhile.render());
	}
	
	
	/**
	 * Tomando como base os m�todos para gera��o de c�digo para WHILE,
	 * implemente a gera��o de c�digo para comando IF e IF-ELSE.
	 * A gera��o de c�digo para a condi��o j� es� implementada, mas para
	 * os comandos IF e IF-ELSE, dever�o ser criados tamb�m novos templates
	 * no arquivo MJ.stg.
	 * Retire os coment�rios dos m�todos a seguir, implemente o que for
	 * pedido e finalmente teste se funcionou a gera��o de c�digo para
	 * IF e IF-ELSE, inserindo exemplos desses comandos no arquivo de entrada.
	 */
	
	// Este m�todo j� est� completo, verificando se deve empilhar
	// 2 ou 3 r�tulos, dependendo se o comando � IF ou IF-ELSE.
	public void enterIf(MicroJavaParser.IfContext ctx) {
		stack.pushString(genLabel()); // label posi��o ap�s o IF
		if (ctx.st2 != null) {
			// somente se tiver cl�usula ELSE...
			stack.pushString(genLabel()); // label posi��o comando FALSE
		}
		stack.pushString(genLabel()); // label posi��o comando TRUE
		// Da mesma forma que no comando WHILE, � interessante assumir
		// que o �ltimo label empilhado se refere ao in�cio do bloco
		// a ser executado se a condi��o dor verdadeira, pois esse label
		// ser� usado pelo m�todo que gera c�digo para condi��o.
	}

	public void exitIf(MicroJavaParser.IfContext ctx) {
		if (ctx.st2 == null) {
			// se n�o tiver cl�usula ELSE...
			ST stIf = stGroup.getInstanceOf("if");
			// ...COMPLETAR O C�DIGO
			// ...E N�O ESQUECER DE CRIAR O TEMPLATE "if"
			String statement = stack.popString();
			String cond = stack.popString();
			String label1 = stack.popString();
			String label2 = stack.popString();
			stIf.add("cond", cond);
			stIf.add("iftrue", label1);
			stIf.add("statement", statement);
			stIf.add("iffalse", label2);
			stack.pushString(stIf.render());
			
		} else {
			// somente se tiver cl�usula ELSE...
			ST stIf = stGroup.getInstanceOf("ifelse");
			// ...COMPLETAR O C�DIGO
			// ...E N�O ESQUECER DE CRIAR O TEMPLATE "ifelse"
			String statementelse = stack.popString();
			String statementif = stack.popString();
			String cond = stack.popString();
			String label1 = stack.popString();
			String label2 = stack.popString();
			stIf.add("cond", cond);
			stIf.add("iftrue", label1);
			stIf.add("statementif", statementif);
			stIf.add("iffalse", label2);
			stIf.add("statementelse", statementelse);
			stack.pushString(stIf.render());
		}
	}
	
	/**
	 * A tarefa de implementar gera��o de c�digo para comando condicional
	 * foi a �ltima deste tutorial. A seguir, s�o apresentados m�todos para
	 * gerar c�digo para quase todos os demais comandos da linguagem MicroJava.
	 * Basta tirar os coment�rios para usar.
	 */
	
	public void enterDesig(MicroJavaParser.DesigContext ctx) {
		if (ctx.actPars() != null) {
			stack.pushList();
		}
	}
	
	public void exitDesig(MicroJavaParser.DesigContext ctx) {
		if (ctx.actPars() != null) {
			String args = stack.popList("\n");
			ST stFuncall = stGroup.getInstanceOf("call");
			stFuncall.add("params", args);
			stFuncall.add("name", ctx.start.getText());
			stack.pushString(stFuncall.render());
		}
	}
	
	public void exitNew(MicroJavaParser.NewContext ctx) {
		TerminalNode treeNode = ctx.IDENT();
		TypeClass type = (TypeClass) (mapNodeToSymbol.get(treeNode).getSemanticType());
		int size = type.getEnvironment().numVariaveis() * 4;
		ST stArray;
		if (ctx.expr() != null) {
			String numExp = stack.popString();
			stArray = stGroup.getInstanceOf("newarray");
			stArray.add("numexp", numExp);
		} else {
			stArray = stGroup.getInstanceOf("new");
			stArray.add("size", size);
		}
		stack.pushString(stArray.render());			
	}

	public void exitReturn(MicroJavaParser.ReturnContext ctx) {
		String exp = stack.popString();
		ST stReturn = stGroup.getInstanceOf("return");
		stReturn.add("exp", exp);
		stack.pushString(stReturn.render());
	}

	public void enterFuncall(MicroJavaParser.FuncallContext ctx) {
		stack.pushList();
	}

	public void exitFuncall(MicroJavaParser.FuncallContext ctx) {
		String args = stack.popList("\n");
		ST stFuncall = stGroup.getInstanceOf("call");
		stFuncall.add("params", args);
		stFuncall.add("name", ctx.start.getText());
		stack.pushString(stFuncall.render());
	}
}
