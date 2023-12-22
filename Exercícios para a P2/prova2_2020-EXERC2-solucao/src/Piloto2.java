
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Piloto2 {
	
	public static void testeinput(String fileName) throws Exception {
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRFileStream(fileName);
		// create a lexer that feeds off of input CharStream
		SimpleLexer lexer = new SimpleLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		SimpleParser parser = new SimpleParser(tokens);
		ParseTree tree = parser.p(); // begin parsing at init rule
		
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		SemanticAndGencodeListener listener = new SemanticAndGencodeListener();
		walker.walk(listener, tree); // initiate walk of tree with listener
	}
	
	public static void main(String args[]) throws Exception {
		testeinput("input/teste1.txt");
	}
	
}
