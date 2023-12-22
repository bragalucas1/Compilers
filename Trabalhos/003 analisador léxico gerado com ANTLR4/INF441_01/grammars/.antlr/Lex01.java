// Generated from /home/nilson/Área de Trabalho/EAD/Compiladores/Trabalhos/003 analisador léxico gerado com ANTLR4/INF441_01/grammars/Lex01.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lex01 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_CLASS=1, KW_IF=2, KW_WHILE=3, SEMICOLON=4, OPEN_PAR=5, CLOSE_PAR=6, 
		PERIOD=7, KW_PROGRAM=8, IDENT=9, FLOAT=10, INTEGER_LITERAL=11, WS=12, 
		COMMENT=13, LINE_COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KW_CLASS", "KW_IF", "KW_WHILE", "SEMICOLON", "OPEN_PAR", "CLOSE_PAR", 
			"PERIOD", "LETTER", "DIGIT", "KW_PROGRAM", "IDENT", "FLOAT", "INTEGER_LITERAL", 
			"WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'if'", "'while'", "';'", "'('", "')'", "'.'", "'program'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_CLASS", "KW_IF", "KW_WHILE", "SEMICOLON", "OPEN_PAR", "CLOSE_PAR", 
			"PERIOD", "KW_PROGRAM", "IDENT", "FLOAT", "INTEGER_LITERAL", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public Lex01(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lex01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\7\fJ\n\f\f\f\16\fM\13\f\3\r\7\rP\n\r\f\r\16\rS\13\r\3"+
		"\r\3\r\6\rW\n\r\r\r\16\rX\3\r\7\r\\\n\r\f\r\16\r_\13\r\3\r\3\r\3\r\5\r"+
		"d\n\r\3\r\6\rg\n\r\r\r\16\rh\3\r\7\rl\n\r\f\r\16\ro\13\r\3\r\3\r\6\rs"+
		"\n\r\r\r\16\rt\3\r\3\r\3\r\5\rz\n\r\3\r\6\r}\n\r\r\r\16\r~\5\r\u0081\n"+
		"\r\3\16\6\16\u0084\n\16\r\16\16\16\u0085\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\7\20\u0090\n\20\f\20\16\20\u0093\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\7\21\u009e\n\21\f\21\16\21\u00a1\13\21\3\21"+
		"\5\21\u00a4\n\21\3\21\3\21\3\21\3\21\3\u0091\2\22\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\2\23\2\25\n\27\13\31\f\33\r\35\16\37\17!\20\3\2\7\4\2C\\"+
		"c|\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00b7\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5)\3\2\2\2\7,\3\2\2\2\t\62\3\2\2"+
		"\2\13\64\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>"+
		"\3\2\2\2\27F\3\2\2\2\31\u0080\3\2\2\2\33\u0083\3\2\2\2\35\u0087\3\2\2"+
		"\2\37\u008b\3\2\2\2!\u0099\3\2\2\2#$\7e\2\2$%\7n\2\2%&\7c\2\2&\'\7u\2"+
		"\2\'(\7u\2\2(\4\3\2\2\2)*\7k\2\2*+\7h\2\2+\6\3\2\2\2,-\7y\2\2-.\7j\2\2"+
		"./\7k\2\2/\60\7n\2\2\60\61\7g\2\2\61\b\3\2\2\2\62\63\7=\2\2\63\n\3\2\2"+
		"\2\64\65\7*\2\2\65\f\3\2\2\2\66\67\7+\2\2\67\16\3\2\2\289\7\60\2\29\20"+
		"\3\2\2\2:;\t\2\2\2;\22\3\2\2\2<=\4\62;\2=\24\3\2\2\2>?\7r\2\2?@\7t\2\2"+
		"@A\7q\2\2AB\7i\2\2BC\7t\2\2CD\7c\2\2DE\7o\2\2E\26\3\2\2\2FK\5\21\t\2G"+
		"J\5\21\t\2HJ\5\23\n\2IG\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2"+
		"\2L\30\3\2\2\2MK\3\2\2\2NP\5\23\n\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3"+
		"\2\2\2RT\3\2\2\2SQ\3\2\2\2TV\7\60\2\2UW\5\23\n\2VU\3\2\2\2WX\3\2\2\2X"+
		"V\3\2\2\2XY\3\2\2\2Y\u0081\3\2\2\2Z\\\5\23\n\2[Z\3\2\2\2\\_\3\2\2\2]["+
		"\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`c\t\3\2\2ad\t\4\2\2bd\3\2\2\2c"+
		"a\3\2\2\2cb\3\2\2\2df\3\2\2\2eg\5\23\n\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2"+
		"hi\3\2\2\2i\u0081\3\2\2\2jl\5\23\n\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2np\3\2\2\2om\3\2\2\2pr\7\60\2\2qs\5\23\n\2rq\3\2\2\2st\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2uv\3\2\2\2vy\t\3\2\2wz\t\4\2\2xz\3\2\2\2yw\3\2\2\2"+
		"yx\3\2\2\2z|\3\2\2\2{}\5\23\n\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177\u0081\3\2\2\2\u0080Q\3\2\2\2\u0080]\3\2\2\2\u0080m\3\2\2\2\u0081"+
		"\32\3\2\2\2\u0082\u0084\5\23\n\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\34\3\2\2\2\u0087\u0088"+
		"\t\5\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\17\2\2\u008a\36\3\2\2\2\u008b"+
		"\u008c\7\61\2\2\u008c\u008d\7,\2\2\u008d\u0091\3\2\2\2\u008e\u0090\13"+
		"\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7,"+
		"\2\2\u0095\u0096\7\61\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\20\2\2\u0098"+
		" \3\2\2\2\u0099\u009a\7\61\2\2\u009a\u009b\7\61\2\2\u009b\u009f\3\2\2"+
		"\2\u009c\u009e\n\6\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a4\7\17\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\21\2\2\u00a8"+
		"\"\3\2\2\2\23\2IKQX]chmty~\u0080\u0085\u0091\u009f\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}