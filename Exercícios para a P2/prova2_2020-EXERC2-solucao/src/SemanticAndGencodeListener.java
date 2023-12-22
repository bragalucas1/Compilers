import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;


public class SemanticAndGencodeListener extends SimpleBaseListener {
	
	TabSimb tab;
	StringStack stack;
	
	public SemanticAndGencodeListener() {
		tab = new TabSimb();
		stack = new StringStack();
	}
	
	private void error(String s) {
		System.out.println(s);
	}
	
	void printStack() {
		System.out.println(stack);
		System.out.println();
	}
	
	public void exitP(SimpleParser.PContext ctx) {
		// desempilha c�digo de comandos e declara��es
		// imprime o c�digo completo: declara��es + comandos
		String b = stack.popString();
		String v = stack.popString();
		System.out.println(v + "\n" + b);
	}
	
	public void exitV(SimpleParser.VContext ctx) {
		stack.pushString("data " + tab.getSize());
		printStack();
	}

	
	public void exitZ(SimpleParser.ZContext ctx) {
		// processa declara��es de vari�veis
		String n = ctx.ID().getText();
		if (tab.getSymbol(n) != -1) {
			error("Identificador repetido: " + n);			
		}
		if (ctx.NUM() == null) {
			tab.addSymbol(n);
		} else {
			int k = Integer.parseInt(ctx.NUM().getText());
			tab.addSymbol(n, k);
		}
	}

	
	public void enterB(SimpleParser.BContext ctx) {
		// ao entrar em bloco, insere "marca" na pilha para saber depois
		// quantos elementos (cada um � um comando) dever� desempilhar
		stack.pushList();
		printStack();
	}
	
	public void exitB(SimpleParser.BContext ctx) {
		// ao sair de bloco, desempilha os comandos empilhados
		// e constr�i uma sequ�ncia, separados por '\n'
		stack.pushString(stack.popList("\n"));
		printStack();
	}
		
	public void exitA(SimpleParser.AContext ctx) {
		String n = ctx.ID().getText();
		int i = tab.getSymbol(n);
		if (i == -1) {
			error("Identificador n�o declarado: " + n);
			tab.addSymbol(n);
		}
		String e2 = stack.popString();
		if (ctx.e1 == null) {
			e2 += "\nstore " + i;
			stack.pushString(e2);
		} else {
			String e1 = stack.popString();
			e1 += "\n" + e2 + "\nstoreA " + i;
			stack.pushString(e1);
		}
		printStack();	
	}
	
	public void exitW(SimpleParser.WContext ctx) {
		String e = stack.popString();
		e += "\nprint"; 
		stack.pushString(e);
		printStack();
	}
	
		
	public void exitC(SimpleParser.CContext ctx) {
		// desempilha as duas express�es da express�o condicional
		String e2 = stack.popString();
		String e1 = stack.popString();
		String op;
		if (ctx.x().getText().equals("<=")) {
			op = "jleq ";
		} else {
			op = "jgeq ";
		}
		// desempilha as dois labels da condi��o
		String labF = stack.popString();
		String labT = stack.popString();
		// constr�i c�digo, usando labT
		String code = e1 + "\n" + e2 + "\n"
				+ op + labT + "\njump " + labF;
		// retorna os labels da condi��o para a pilha
		stack.pushString(labT);
		stack.pushString(labF);
		// empilha c�digo constru�do
		stack.pushString(code);
		printStack();
	}
	
	public void enterI(SimpleParser.IContext ctx) {
		// Ao entrar no IF, gera os 2 labels necess�rios,
		// que ser�o usados no c�digo da condi��o e depois
		// no c�digo do pr�prio IF
		String lab1 = tab.genLabel(); // in�cio do comando s do IF
		String lab2 = tab.genLabel(); // depois do comando s do IF
		stack.pushString(lab1);
		stack.pushString(lab2);//
		printStack();
	}
	
	public void exitI(SimpleParser.IContext ctx) {
		String s = stack.popString(); // comando s, dentro do IF
		String c = stack.popString(); // condi��o
		String lab2 = stack.popString(); // label p/ depois do comando s
		String lab1 = stack.popString(); // label p/ in�cio do comando s
		String i = c  + "\nlabel " + lab1 + "\n"
				+ s + "\n" + "label " + lab2;
		stack.pushString(i);
		printStack();
	}
	
	public void enterI2(SimpleParser.I2Context ctx) {
		// Ao entrar no IF-ELSE, gera os 3 labels necess�rios,
		// que ser�o usados no c�digo da condi��o e depois
		// no c�digo do pr�prio IF-ELSE
		String lab1 = tab.genLabel(); // in�cio do comando True do IF
		String lab2 = tab.genLabel(); // in�cio do comando False do IF
		String lab3 = tab.genLabel(); // depois do comando IF
		stack.pushString(lab3);
		stack.pushString(lab1);
		stack.pushString(lab2);//
		printStack();
	}
		
	public void exitI2(SimpleParser.I2Context ctx) {
		String s2 = stack.popString(); // comando False, dentro do IF-ELSE
		String s1 = stack.popString(); // comando True, dentro do IF-ELSE
		String c = stack.popString(); // condi��o
		String lab2 = stack.popString(); // label p/ in�cio do comando False
		String lab1 = stack.popString(); // label p/ in�cio do comando True
		String lab3 = stack.popString(); // label p/ depois do comando IF-ELSE
		String i = c + "\nlabel " + lab1 + "\n"
				+ s1 + "\njump " + lab3
				+ "\nlabel " + lab2 + "\n" + s2 + "\nlabel " + lab3;
		stack.pushString(i);
		printStack();
	}
	
	
	public void exitAddsub(SimpleParser.AddsubContext ctx) {
		String e2 = stack.popString();
		String e1 = stack.popString();
		String op;
		if (ctx.y().getText().equals("+")) {
			op = "add";
		} else {
			op = "sub";
		}
		stack.pushString(e1 + "\n" + e2 + "\n" + op);
		printStack();
	}

	public void exitT1(SimpleParser.T1Context ctx) {
		stack.pushString("const " + ctx.NUM().getText());
		printStack();
	}

	public void exitT2(SimpleParser.T2Context ctx) {
		String n = ctx.ID().getText();
		int i = tab.getSymbol(n);
		if (i == -1) {
			error("Identificador n�o declarado: " + n);
			tab.addSymbol(n);
		}
		if (ctx.e() == null) {
			stack.pushString("load " + i);	
		} else {
			String e = stack.popString();
			stack.pushString(e + "\nloadA " + i);
		}
		printStack();
	}

	public void enterW2(SimpleParser.W2Context ctx) {
		// Ao entrar no WHILE, gera os 3 labels necess�rios,
		// que ser�o usados no c�digo da condi��o e depois
		// no c�digo do pr�prio WHILE
		String lab3 = tab.genLabel(); // in�cio do WHILE
		String lab1 = tab.genLabel(); // in�cio do comando s do WHILE
		String lab2 = tab.genLabel(); // depois do comando s do WHILE
		stack.pushString(lab3);
		stack.pushString(lab1);
		stack.pushString(lab2);//
		printStack();
	}

	
	public void exitW2(SimpleParser.W2Context ctx) {
		String s = stack.popString(); // comando s, dentro do WHILE
		String c = stack.popString(); // condi��o
		String lab2 = stack.popString(); // depois do comando s do WHILE
		String lab1 = stack.popString(); // in�cio do comando s do WHILE
		String lab3 = stack.popString(); // in�cio do WHILE
		String w = "label " + lab3 + "\n" + c 
				+ "\nlabel " + lab1 + "\n" + s
				+ "\njump " + lab3 + "\nlabel " + lab2;
		stack.pushString(w);
		printStack();
	}


	
}
