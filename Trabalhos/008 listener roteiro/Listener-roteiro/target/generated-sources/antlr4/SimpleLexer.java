// Generated from Simple.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ADD=6, SUB=7, MUL=8, DIV=9, IDENT=10, 
		REAL_NUMBER=11, COMMENT=12, LINE_COMMENT=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "ADD", "SUB", "MUL", "DIV", "LETTER", 
		"DIGIT", "IDENT", "REAL_NUMBER", "EXPONENT", "COMMENT", "LINE_COMMENT", 
		"WS"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\rC\n\r\f\r\16"+
		"\rF\13\r\3\16\6\16I\n\16\r\16\16\16J\3\16\3\16\7\16O\n\16\f\16\16\16R"+
		"\13\16\5\16T\n\16\3\16\5\16W\n\16\3\16\3\16\6\16[\n\16\r\16\16\16\\\3"+
		"\16\5\16`\n\16\5\16b\n\16\3\17\3\17\5\17f\n\17\3\17\6\17i\n\17\r\17\16"+
		"\17j\3\20\3\20\3\20\3\20\7\20q\n\20\f\20\16\20t\13\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\7\21\177\n\21\f\21\16\21\u0082\13\21\3\21"+
		"\5\21\u0085\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3r\2\23\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\f\33\r\35\2\37\16!\17"+
		"#\20\3\2\7\4\2C\\c|\4\2GGgg\4\2--//\4\2\f\f\17\17\5\2\13\f\17\17\"\"\u0098"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t"+
		"/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3"+
		"\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31?\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37"+
		"l\3\2\2\2!z\3\2\2\2#\u008a\3\2\2\2%&\7r\2\2&\'\7t\2\2\'(\7k\2\2()\7p\2"+
		"\2)*\7v\2\2*\4\3\2\2\2+,\7*\2\2,\6\3\2\2\2-.\7+\2\2.\b\3\2\2\2/\60\7="+
		"\2\2\60\n\3\2\2\2\61\62\7?\2\2\62\f\3\2\2\2\63\64\7-\2\2\64\16\3\2\2\2"+
		"\65\66\7/\2\2\66\20\3\2\2\2\678\7,\2\28\22\3\2\2\29:\7\61\2\2:\24\3\2"+
		"\2\2;<\t\2\2\2<\26\3\2\2\2=>\4\62;\2>\30\3\2\2\2?D\5\25\13\2@C\5\25\13"+
		"\2AC\5\27\f\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\32\3"+
		"\2\2\2FD\3\2\2\2GI\5\27\f\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KS"+
		"\3\2\2\2LP\7\60\2\2MO\5\27\f\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QT\3\2\2\2RP\3\2\2\2SL\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5\35\17\2VU\3\2\2"+
		"\2VW\3\2\2\2Wb\3\2\2\2XZ\7\60\2\2Y[\5\27\f\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3"+
		"\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\5\35\17\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2"+
		"aH\3\2\2\2aX\3\2\2\2b\34\3\2\2\2ce\t\3\2\2df\t\4\2\2ed\3\2\2\2ef\3\2\2"+
		"\2fh\3\2\2\2gi\5\27\f\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\36\3"+
		"\2\2\2lm\7\61\2\2mn\7,\2\2nr\3\2\2\2oq\13\2\2\2po\3\2\2\2qt\3\2\2\2rs"+
		"\3\2\2\2rp\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7,\2\2vw\7\61\2\2wx\3\2\2\2x"+
		"y\b\20\2\2y \3\2\2\2z{\7\61\2\2{|\7\61\2\2|\u0080\3\2\2\2}\177\n\5\2\2"+
		"~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\7\17\2\2\u0084\u0083\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\f\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\b\21\2\2\u0089\"\3\2\2\2\u008a\u008b\t\6\2"+
		"\2\u008b\u008c\3\2\2\2\u008c\u008d\b\22\2\2\u008d$\3\2\2\2\21\2BDJPSV"+
		"\\_aejr\u0080\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}