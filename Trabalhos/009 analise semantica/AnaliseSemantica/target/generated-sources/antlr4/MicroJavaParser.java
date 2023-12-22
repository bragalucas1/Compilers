// Generated from MicroJava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, ADD=28, SUB=29, MUL=30, DIV=31, REM=32, IDENT=33, 
		INT_NUMBER=34, REAL_NUMBER=35, CHAR_CONST=36, COMMENT=37, LINE_COMMENT=38, 
		WS=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'new'", "'return'", "'!='", "'class'", "'while'", "'void'", 
		"';'", "'{'", "'='", "'}'", "'if'", "'<='", "'print'", "'('", "','", "'.'", 
		"'>='", "'['", "'=='", "'<'", "']'", "'>'", "'program'", "'read'", "'else'", 
		"')'", "'final'", "'+'", "'-'", "'*'", "'/'", "'%'", "IDENT", "INT_NUMBER", 
		"REAL_NUMBER", "CHAR_CONST", "COMMENT", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_varDecl = 1, RULE_type = 2, RULE_constDecl = 3, 
		RULE_valConst = 4, RULE_classDecl = 5, RULE_typeOrVoid = 6, RULE_methodDecl = 7, 
		RULE_formPars = 8, RULE_formPar = 9, RULE_block = 10, RULE_statement = 11, 
		RULE_actPars = 12, RULE_condition = 13, RULE_relop = 14, RULE_expr = 15, 
		RULE_term = 16, RULE_factor = 17, RULE_designator = 18;
	public static final String[] ruleNames = {
		"program", "varDecl", "type", "constDecl", "valConst", "classDecl", "typeOrVoid", 
		"methodDecl", "formPars", "formPar", "block", "statement", "actPars", 
		"condition", "relop", "expr", "term", "factor", "designator"
	};

	@Override
	public String getGrammarFileName() { return "MicroJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MicroJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(T__4);
			setState(39); match(IDENT);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__0) | (1L << IDENT))) != 0)) {
				{
				setState(43);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(40); constDecl();
					}
					break;
				case IDENT:
					{
					setState(41); varDecl();
					}
					break;
				case T__23:
					{
					setState(42); classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48); match(T__19);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==IDENT) {
				{
				{
				setState(49); methodDecl();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode IDENT(int i) {
			return getToken(MicroJavaParser.IDENT, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MicroJavaParser.IDENT); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); type();
			setState(58); match(IDENT);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(59); match(T__12);
				setState(60); match(IDENT);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeWithArrayContext extends TypeContext {
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public TypeWithArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterTypeWithArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitTypeWithArray(this);
		}
	}
	public static class TypeWithoutArrayContext extends TypeContext {
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public TypeWithoutArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterTypeWithoutArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitTypeWithoutArray(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new TypeWithoutArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(IDENT);
				}
				break;
			case 2:
				_localctx = new TypeWithArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69); match(IDENT);
				setState(70); match(T__9);
				setState(71); match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public ValConstContext valConst() {
			return getRuleContext(ValConstContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitConstDecl(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__0);
			setState(75); type();
			setState(76); match(IDENT);
			setState(77); match(T__18);
			setState(78); valConst();
			setState(79); match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValConstContext extends ParserRuleContext {
		public ValConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valConst; }
	 
		public ValConstContext() { }
		public void copyFrom(ValConstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstStrContext extends ValConstContext {
		public TerminalNode CHAR_CONST() { return getToken(MicroJavaParser.CHAR_CONST, 0); }
		public ConstStrContext(ValConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterConstStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitConstStr(this);
		}
	}
	public static class ConstIntContext extends ValConstContext {
		public TerminalNode INT_NUMBER() { return getToken(MicroJavaParser.INT_NUMBER, 0); }
		public ConstIntContext(ValConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterConstInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitConstInt(this);
		}
	}
	public static class ConstRealContext extends ValConstContext {
		public TerminalNode REAL_NUMBER() { return getToken(MicroJavaParser.REAL_NUMBER, 0); }
		public ConstRealContext(ValConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterConstReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitConstReal(this);
		}
	}

	public final ValConstContext valConst() throws RecognitionException {
		ValConstContext _localctx = new ValConstContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valConst);
		try {
			setState(84);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				_localctx = new ConstIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(INT_NUMBER);
				}
				break;
			case REAL_NUMBER:
				_localctx = new ConstRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(REAL_NUMBER);
				}
				break;
			case CHAR_CONST:
				_localctx = new ConstStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83); match(CHAR_CONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(T__23);
			setState(87); match(IDENT);
			setState(88); match(T__19);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(89); varDecl();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95); match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeOrVoidContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitTypeOrVoid(this);
		}
	}

	public final TypeOrVoidContext typeOrVoid() throws RecognitionException {
		TypeOrVoidContext _localctx = new TypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeOrVoid);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); type();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); typeOrVoid();
			setState(102); match(IDENT);
			setState(103); match(T__13);
			setState(104); formPars();
			setState(105); match(T__1);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(106); varDecl();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormParsContext extends ParserRuleContext {
		public FormParContext formPar(int i) {
			return getRuleContext(FormParContext.class,i);
		}
		public List<FormParContext> formPar() {
			return getRuleContexts(FormParContext.class);
		}
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterFormPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitFormPars(this);
		}
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(114); formPar();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(115); match(T__12);
					setState(116); formPar();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormParContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public FormParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterFormPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitFormPar(this);
		}
	}

	public final FormParContext formPar() throws RecognitionException {
		FormParContext _localctx = new FormParContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); type();
			setState(125); match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(T__19);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__22) | (1L << T__20) | (1L << T__19) | (1L << T__16) | (1L << T__14) | (1L << T__3) | (1L << IDENT))) != 0)) {
				{
				{
				setState(128); statement();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134); match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ReadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitRead(this);
		}
	}
	public static class SemicolonContext extends StatementContext {
		public SemicolonContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitSemicolon(this);
		}
	}
	public static class PrintContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT_NUMBER() { return getToken(MicroJavaParser.INT_NUMBER, 0); }
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitPrint(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitReturn(this);
		}
	}
	public static class StblockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StblockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterStblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitStblock(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitAssign(this);
		}
	}
	public static class FuncallContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public FuncallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterFuncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitFuncall(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitWhile(this);
		}
	}
	public static class IfContext extends StatementContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitIf(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136); designator(0);
				setState(137); match(T__18);
				setState(138); expr(0);
				setState(139); match(T__20);
				}
				break;
			case 2:
				_localctx = new FuncallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141); designator(0);
				setState(142); actPars();
				setState(143); match(T__20);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145); match(T__16);
				setState(146); match(T__13);
				setState(147); condition();
				setState(148); match(T__1);
				setState(149); statement();
				setState(152);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(150); match(T__2);
					setState(151); statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154); match(T__22);
				setState(155); match(T__13);
				setState(156); condition();
				setState(157); match(T__1);
				setState(158); statement();
				}
				break;
			case 5:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(160); match(T__25);
				setState(162);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__13) | (1L << SUB) | (1L << IDENT) | (1L << INT_NUMBER) | (1L << REAL_NUMBER) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(161); expr(0);
					}
				}

				setState(164); match(T__20);
				}
				break;
			case 6:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(165); match(T__3);
				setState(166); match(T__13);
				setState(167); designator(0);
				setState(168); match(T__1);
				setState(169); match(T__20);
				}
				break;
			case 7:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(171); match(T__14);
				setState(172); match(T__13);
				setState(173); expr(0);
				setState(176);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(174); match(T__12);
					setState(175); match(INT_NUMBER);
					}
				}

				setState(178); match(T__1);
				setState(179); match(T__20);
				}
				break;
			case 8:
				_localctx = new StblockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(181); block();
				}
				break;
			case 9:
				_localctx = new SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(182); match(T__20);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActParsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterActPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitActPars(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(T__13);
			setState(194);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__13) | (1L << SUB) | (1L << IDENT) | (1L << INT_NUMBER) | (1L << REAL_NUMBER) | (1L << CHAR_CONST))) != 0)) {
				{
				setState(186); expr(0);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(187); match(T__12);
					setState(188); expr(0);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(196); match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); expr(0);
			setState(199); relop();
			setState(200); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__15) | (1L << T__10) | (1L << T__8) | (1L << T__7) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitAddSub(this);
		}
	}
	public static class OneTermContext extends ExprContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OneTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterOneTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitOneTerm(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OneTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(206);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(205); ((OneTermContext)_localctx).op = match(SUB);
				}
			}

			setState(208); term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(210);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(211);
					((AddSubContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(212); term(0);
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulDivContext extends TermContext {
		public Token op;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MulDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitMulDiv(this);
		}
	}
	public static class OneFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public OneFactorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterOneFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitOneFactor(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OneFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(219); factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(221);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(222);
					((MulDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << REM))) != 0)) ) {
						((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(223); factor();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public NewContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitNew(this);
		}
	}
	public static class ParensContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitParens(this);
		}
	}
	public static class ValueContext extends FactorContext {
		public ValConstContext valConst() {
			return getRuleContext(ValConstContext.class,0);
		}
		public ValueContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitValue(this);
		}
	}
	public static class DesigContext extends FactorContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public DesigContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterDesig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitDesig(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case INT_NUMBER:
			case REAL_NUMBER:
			case CHAR_CONST:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229); valConst();
				}
				break;
			case IDENT:
				_localctx = new DesigContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230); designator(0);
				setState(232);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(231); actPars();
					}
					break;
				}
				}
				break;
			case T__26:
				_localctx = new NewContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234); match(T__26);
				setState(235); match(IDENT);
				setState(240);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(236); match(T__9);
					setState(237); expr(0);
					setState(238); match(T__6);
					}
					break;
				}
				}
				break;
			case T__13:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242); match(T__13);
				setState(243); expr(0);
				setState(244); match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	 
		public DesignatorContext() { }
		public void copyFrom(DesignatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DesigDotContext extends DesignatorContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public DesigDotContext(DesignatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterDesigDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitDesigDot(this);
		}
	}
	public static class DesigArrayContext extends DesignatorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesigArrayContext(DesignatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterDesigArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitDesigArray(this);
		}
	}
	public static class DesigIdContext extends DesignatorContext {
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public DesigIdContext(DesignatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterDesigId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitDesigId(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		return designator(0);
	}

	private DesignatorContext designator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorContext _localctx = new DesignatorContext(_ctx, _parentState);
		DesignatorContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_designator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DesigIdContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(249); match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new DesigDotContext(new DesignatorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_designator);
						setState(251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(252); match(T__11);
						setState(253); match(IDENT);
						}
						break;
					case 2:
						{
						_localctx = new DesigArrayContext(new DesignatorContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_designator);
						setState(254);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(255); match(T__9);
						setState(256); expr(0);
						setState(257); match(T__6);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15: return expr_sempred((ExprContext)_localctx, predIndex);
		case 16: return term_sempred((TermContext)_localctx, predIndex);
		case 18: return designator_sempred((DesignatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean designator_sempred(DesignatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\2"+
		"\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3@\n\3\f\3\16"+
		"\3C\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\7\3\7"+
		"\3\b\3\b\5\bf\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t"+
		"\3\t\3\n\3\n\3\n\7\nx\n\n\f\n\16\n{\13\n\5\n}\n\n\3\13\3\13\3\13\3\f\3"+
		"\f\7\f\u0084\n\f\f\f\16\f\u0087\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009b\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00b3\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\16\3\16\3\16"+
		"\3\16\7\16\u00c0\n\16\f\16\16\16\u00c3\13\16\5\16\u00c5\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u00d1\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00d8\n\21\f\21\16\21\u00db\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00e3\n\22\f\22\16\22\u00e6\13\22\3\23\3\23\3\23\5\23"+
		"\u00eb\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f3\n\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00f9\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0106\n\24\f\24\16\24\u0109\13\24\3\24\2\5 \"&\25\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\7\2\5\5\16\16\23\23\25\26"+
		"\30\30\3\2\36\37\3\2 \"\u011c\2(\3\2\2\2\4;\3\2\2\2\6J\3\2\2\2\bL\3\2"+
		"\2\2\nV\3\2\2\2\fX\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22|\3\2\2\2\24~\3\2"+
		"\2\2\26\u0081\3\2\2\2\30\u00b9\3\2\2\2\32\u00bb\3\2\2\2\34\u00c8\3\2\2"+
		"\2\36\u00cc\3\2\2\2 \u00ce\3\2\2\2\"\u00dc\3\2\2\2$\u00f8\3\2\2\2&\u00fa"+
		"\3\2\2\2()\7\31\2\2)/\7#\2\2*.\5\b\5\2+.\5\4\3\2,.\5\f\7\2-*\3\2\2\2-"+
		"+\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61"+
		"/\3\2\2\2\62\66\7\n\2\2\63\65\5\20\t\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\f\2\2:\3\3\2\2\2;<"+
		"\5\6\4\2<A\7#\2\2=>\7\21\2\2>@\7#\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB"+
		"\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\t\2\2E\5\3\2\2\2FK\7#\2\2GH\7#\2\2HI"+
		"\7\24\2\2IK\7\27\2\2JF\3\2\2\2JG\3\2\2\2K\7\3\2\2\2LM\7\35\2\2MN\5\6\4"+
		"\2NO\7#\2\2OP\7\13\2\2PQ\5\n\6\2QR\7\t\2\2R\t\3\2\2\2SW\7$\2\2TW\7%\2"+
		"\2UW\7&\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\13\3\2\2\2XY\7\6\2\2YZ\7#\2"+
		"\2Z^\7\n\2\2[]\5\4\3\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2"+
		"\2\2`^\3\2\2\2ab\7\f\2\2b\r\3\2\2\2cf\5\6\4\2df\7\b\2\2ec\3\2\2\2ed\3"+
		"\2\2\2f\17\3\2\2\2gh\5\16\b\2hi\7#\2\2ij\7\20\2\2jk\5\22\n\2ko\7\34\2"+
		"\2ln\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2"+
		"\2rs\5\26\f\2s\21\3\2\2\2ty\5\24\13\2uv\7\21\2\2vx\5\24\13\2wu\3\2\2\2"+
		"x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|t\3\2\2\2|}\3\2\2\2"+
		"}\23\3\2\2\2~\177\5\6\4\2\177\u0080\7#\2\2\u0080\25\3\2\2\2\u0081\u0085"+
		"\7\n\2\2\u0082\u0084\5\30\r\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\7\f\2\2\u0089\27\3\2\2\2\u008a\u008b\5&\24\2\u008b"+
		"\u008c\7\13\2\2\u008c\u008d\5 \21\2\u008d\u008e\7\t\2\2\u008e\u00ba\3"+
		"\2\2\2\u008f\u0090\5&\24\2\u0090\u0091\5\32\16\2\u0091\u0092\7\t\2\2\u0092"+
		"\u00ba\3\2\2\2\u0093\u0094\7\r\2\2\u0094\u0095\7\20\2\2\u0095\u0096\5"+
		"\34\17\2\u0096\u0097\7\34\2\2\u0097\u009a\5\30\r\2\u0098\u0099\7\33\2"+
		"\2\u0099\u009b\5\30\r\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u00ba\3\2\2\2\u009c\u009d\7\7\2\2\u009d\u009e\7\20\2\2\u009e\u009f\5"+
		"\34\17\2\u009f\u00a0\7\34\2\2\u00a0\u00a1\5\30\r\2\u00a1\u00ba\3\2\2\2"+
		"\u00a2\u00a4\7\4\2\2\u00a3\u00a5\5 \21\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ba\7\t\2\2\u00a7\u00a8\7\32\2\2"+
		"\u00a8\u00a9\7\20\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ab\7\34\2\2\u00ab\u00ac"+
		"\7\t\2\2\u00ac\u00ba\3\2\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00af\7\20\2\2"+
		"\u00af\u00b2\5 \21\2\u00b0\u00b1\7\21\2\2\u00b1\u00b3\7$\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\34\2\2"+
		"\u00b5\u00b6\7\t\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00ba\5\26\f\2\u00b8\u00ba"+
		"\7\t\2\2\u00b9\u008a\3\2\2\2\u00b9\u008f\3\2\2\2\u00b9\u0093\3\2\2\2\u00b9"+
		"\u009c\3\2\2\2\u00b9\u00a2\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9\u00ad\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\31\3\2\2\2\u00bb\u00c4"+
		"\7\20\2\2\u00bc\u00c1\5 \21\2\u00bd\u00be\7\21\2\2\u00be\u00c0\5 \21\2"+
		"\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\34\2\2\u00c7\33\3\2\2"+
		"\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\5 \21\2\u00cb"+
		"\35\3\2\2\2\u00cc\u00cd\t\2\2\2\u00cd\37\3\2\2\2\u00ce\u00d0\b\21\1\2"+
		"\u00cf\u00d1\7\37\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d9\3\2\2\2\u00d4\u00d5\f\3\2\2"+
		"\u00d5\u00d6\t\3\2\2\u00d6\u00d8\5\"\22\2\u00d7\u00d4\3\2\2\2\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da!\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00dd\b\22\1\2\u00dd\u00de\5$\23\2\u00de\u00e4\3"+
		"\2\2\2\u00df\u00e0\f\3\2\2\u00e0\u00e1\t\4\2\2\u00e1\u00e3\5$\23\2\u00e2"+
		"\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5#\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00f9\5\n\6\2\u00e8\u00ea"+
		"\5&\24\2\u00e9\u00eb\5\32\16\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2"+
		"\u00eb\u00f9\3\2\2\2\u00ec\u00ed\7\3\2\2\u00ed\u00f2\7#\2\2\u00ee\u00ef"+
		"\7\24\2\2\u00ef\u00f0\5 \21\2\u00f0\u00f1\7\27\2\2\u00f1\u00f3\3\2\2\2"+
		"\u00f2\u00ee\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f9\3\2\2\2\u00f4\u00f5"+
		"\7\20\2\2\u00f5\u00f6\5 \21\2\u00f6\u00f7\7\34\2\2\u00f7\u00f9\3\2\2\2"+
		"\u00f8\u00e7\3\2\2\2\u00f8\u00e8\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00f4"+
		"\3\2\2\2\u00f9%\3\2\2\2\u00fa\u00fb\b\24\1\2\u00fb\u00fc\7#\2\2\u00fc"+
		"\u0107\3\2\2\2\u00fd\u00fe\f\4\2\2\u00fe\u00ff\7\22\2\2\u00ff\u0106\7"+
		"#\2\2\u0100\u0101\f\3\2\2\u0101\u0102\7\24\2\2\u0102\u0103\5 \21\2\u0103"+
		"\u0104\7\27\2\2\u0104\u0106\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u0100\3"+
		"\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\'\3\2\2\2\u0109\u0107\3\2\2\2\34-/\66AJV^eoy|\u0085\u009a\u00a4\u00b2"+
		"\u00b9\u00c1\u00c4\u00d0\u00d9\u00e4\u00ea\u00f2\u00f8\u0105\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}