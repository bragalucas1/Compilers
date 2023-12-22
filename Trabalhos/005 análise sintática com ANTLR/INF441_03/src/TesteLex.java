import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import srcparser.*;

public class TesteLex {

	public static void testeLex(String fileName) throws Exception {
		ANTLRInputStream input = new ANTLRFileStream(fileName);
		MicroJavaLexer lexer = new MicroJavaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		while (true) {
			Token t = tokens.LT(1);
			if (t.getType() == MicroJavaLexer.EOF) {
				break;
			}
			System.out.println(t);
			tokens.consume();	
		}
	}
	
	public static void main(String args[]) throws Exception {
//		testeLex("input/teste01.txt");
//		testeLex("input/Atividade2.txt");
		testeLex("input/Atividade3.txt");
		
	}
}
