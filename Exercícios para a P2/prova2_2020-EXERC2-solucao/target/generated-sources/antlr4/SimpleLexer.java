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
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, ID=18, NUM=19, CHAR_CONST=20, COMMENT=21, LINE_COMMENT=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"LETTER", "DIGIT", "ID", "NUM", "CHAR_CONST", "COMMENT", "LINE_COMMENT", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25o\n\25"+
		"\f\25\16\25r\13\25\3\26\6\26u\n\26\r\26\16\26v\3\27\3\27\7\27{\n\27\f"+
		"\27\16\27~\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0086\n\30\f\30\16"+
		"\30\u0089\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0094"+
		"\n\31\f\31\16\31\u0097\13\31\3\31\5\31\u009a\n\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\u0087\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\2)\24+\25-\26/\27\61"+
		"\30\63\31\3\2\6\4\2C\\c|\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\3\65\3\2\2\2\59\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13D\3\2\2"+
		"\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27Q\3\2"+
		"\2\2\31T\3\2\2\2\33Y\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2!c\3\2\2\2#e\3\2\2"+
		"\2%g\3\2\2\2\'i\3\2\2\2)k\3\2\2\2+t\3\2\2\2-x\3\2\2\2/\u0081\3\2\2\2\61"+
		"\u008f\3\2\2\2\63\u009f\3\2\2\2\65\66\7x\2\2\66\67\7c\2\2\678\7t\2\28"+
		"\4\3\2\2\29:\7@\2\2:;\7?\2\2;\6\3\2\2\2<=\7=\2\2=\b\3\2\2\2>?\7y\2\2?"+
		"@\7j\2\2@A\7k\2\2AB\7n\2\2BC\7g\2\2C\n\3\2\2\2DE\7}\2\2E\f\3\2\2\2FG\7"+
		"]\2\2G\16\3\2\2\2HI\7?\2\2I\20\3\2\2\2JK\7\177\2\2K\22\3\2\2\2LM\7_\2"+
		"\2M\24\3\2\2\2NO\7k\2\2OP\7h\2\2P\26\3\2\2\2QR\7>\2\2RS\7?\2\2S\30\3\2"+
		"\2\2TU\7g\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2X\32\3\2\2\2YZ\7r\2\2Z[\7t\2\2"+
		"[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\34\3\2\2\2_`\7*\2\2`\36\3\2\2\2ab\7+\2"+
		"\2b \3\2\2\2cd\7-\2\2d\"\3\2\2\2ef\7/\2\2f$\3\2\2\2gh\t\2\2\2h&\3\2\2"+
		"\2ij\4\62;\2j(\3\2\2\2kp\5%\23\2lo\5%\23\2mo\5\'\24\2nl\3\2\2\2nm\3\2"+
		"\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q*\3\2\2\2rp\3\2\2\2su\5\'\24\2ts\3"+
		"\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w,\3\2\2\2x|\7$\2\2y{\n\3\2\2zy\3"+
		"\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7$\2\2\u0080.\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7,\2\2\u0083\u0087"+
		"\3\2\2\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\7,\2\2\u008b\u008c\7\61\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\30\2\2\u008e\60\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7\61"+
		"\2\2\u0091\u0095\3\2\2\2\u0092\u0094\n\4\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u009a\7\17\2\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\f\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\b\31\2\2\u009e\62\3\2\2\2\u009f\u00a0\t\5\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\b\32\2\2\u00a2\64\3\2\2\2\n\2npv|\u0087\u0095\u0099"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}