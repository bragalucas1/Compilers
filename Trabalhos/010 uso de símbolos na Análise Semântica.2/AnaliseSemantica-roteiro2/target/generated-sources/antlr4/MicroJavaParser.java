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
		RULE_program = 0, RULE_type = 1, RULE_constDecl = 2, RULE_varDecl = 3, 
		RULE_classDecl = 4, RULE_typeOrVoid = 5, RULE_methodDecl = 6, RULE_formPars = 7, 
		RULE_formPar = 8, RULE_block = 9, RULE_statement = 10, RULE_actPars = 11, 
		RULE_condition = 12, RULE_relop = 13, RULE_expr = 14, RULE_term = 15, 
		RULE_factor = 16, RULE_valConst = 17, RULE_designator = 18;
	public static final String[] ruleNames = {
		"program", "type", "constDecl", "varDecl", "classDecl", "typeOrVoid", 
		"methodDecl", "formPars", "formPar", "block", "statement", "actPars", 
		"condition", "relop", "expr", "term", "factor", "valConst", "designator"
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
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new TypeWithoutArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(IDENT);
				}
				break;
			case 2:
				_localctx = new TypeWithArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(IDENT);
				setState(59); match(T__9);
				setState(60); match(T__6);
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
		enterRule(_localctx, 4, RULE_constDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(T__0);
			setState(64); type();
			setState(65); match(IDENT);
			setState(66); match(T__18);
			setState(67); valConst();
			setState(68); match(T__20);
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
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); type();
			setState(71); match(IDENT);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(72); match(T__12);
				setState(73); match(IDENT);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 8, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(T__23);
			setState(82); match(IDENT);
			setState(83); match(T__19);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(84); varDecl();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); match(T__17);
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
		enterRule(_localctx, 10, RULE_typeOrVoid);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); type();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(T__21);
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
		enterRule(_localctx, 12, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); typeOrVoid();
			setState(97); match(IDENT);
			setState(98); match(T__13);
			setState(99); formPars();
			setState(100); match(T__1);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(101); varDecl();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107); block();
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
		enterRule(_localctx, 14, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(109); formPar();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(110); match(T__12);
					setState(111); formPar();
					}
					}
					setState(116);
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
		enterRule(_localctx, 16, RULE_formPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); type();
			setState(120); match(IDENT);
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(T__19);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__22) | (1L << T__20) | (1L << T__19) | (1L << T__16) | (1L << T__14) | (1L << T__3) | (1L << IDENT))) != 0)) {
				{
				{
				setState(123); statement();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129); match(T__17);
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
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131); designator(0);
				setState(132); match(T__18);
				setState(133); expr(0);
				setState(134); match(T__20);
				}
				break;
			case 2:
				_localctx = new FuncallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136); designator(0);
				setState(137); actPars();
				setState(138); match(T__20);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140); match(T__16);
				setState(141); match(T__13);
				setState(142); condition();
				setState(143); match(T__1);
				setState(144); statement();
				setState(147);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(145); match(T__2);
					setState(146); statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(149); match(T__22);
				setState(150); match(T__13);
				setState(151); condition();
				setState(152); match(T__1);
				setState(153); statement();
				}
				break;
			case 5:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(155); match(T__25);
				setState(157);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__13) | (1L << SUB) | (1L << IDENT) | (1L << INT_NUMBER) | (1L << REAL_NUMBER) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(156); expr(0);
					}
				}

				setState(159); match(T__20);
				}
				break;
			case 6:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(160); match(T__3);
				setState(161); match(T__13);
				setState(162); designator(0);
				setState(163); match(T__1);
				setState(164); match(T__20);
				}
				break;
			case 7:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(166); match(T__14);
				setState(167); match(T__13);
				setState(168); expr(0);
				setState(171);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(169); match(T__12);
					setState(170); match(INT_NUMBER);
					}
				}

				setState(173); match(T__1);
				setState(174); match(T__20);
				}
				break;
			case 8:
				_localctx = new StblockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(176); block();
				}
				break;
			case 9:
				_localctx = new SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(177); match(T__20);
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
		enterRule(_localctx, 22, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(T__13);
			setState(189);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__13) | (1L << SUB) | (1L << IDENT) | (1L << INT_NUMBER) | (1L << REAL_NUMBER) | (1L << CHAR_CONST))) != 0)) {
				{
				setState(181); expr(0);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(182); match(T__12);
					setState(183); expr(0);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(191); match(T__1);
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
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); expr(0);
			setState(194); relop();
			setState(195); expr(0);
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
		enterRule(_localctx, 26, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OneTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(201);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(200); ((OneTermContext)_localctx).op = match(SUB);
				}
			}

			setState(203); term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(205);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(206);
					((AddSubContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(207); term(0);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OneFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(214); factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(216);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(217);
					((MulDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << REM))) != 0)) ) {
						((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(218); factor();
					}
					} 
				}
				setState(223);
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
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case INT_NUMBER:
			case REAL_NUMBER:
			case CHAR_CONST:
				_localctx = new ValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224); valConst();
				}
				break;
			case T__26:
				_localctx = new NewContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225); match(T__26);
				setState(226); match(IDENT);
				setState(231);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(227); match(T__9);
					setState(228); expr(0);
					setState(229); match(T__6);
					}
					break;
				}
				}
				break;
			case IDENT:
				_localctx = new DesigContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233); designator(0);
				setState(235);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(234); actPars();
					}
					break;
				}
				}
				break;
			case T__13:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(237); match(T__13);
				setState(238); expr(0);
				setState(239); match(T__1);
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
		enterRule(_localctx, 34, RULE_valConst);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				_localctx = new ConstIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243); match(INT_NUMBER);
				}
				break;
			case REAL_NUMBER:
				_localctx = new ConstRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244); match(REAL_NUMBER);
				}
				break;
			case CHAR_CONST:
				_localctx = new ConstStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(245); match(CHAR_CONST);
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
		case 14: return expr_sempred((ExprContext)_localctx, predIndex);
		case 15: return term_sempred((TermContext)_localctx, predIndex);
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
		"\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3@\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\7\3\7\5\7a\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\b\3\b\3\t\3\t\3\t\7\ts"+
		"\n\t\f\t\16\tv\13\t\5\tx\n\t\3\n\3\n\3\n\3\13\3\13\7\13\177\n\13\f\13"+
		"\16\13\u0082\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u0096\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00a0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ae"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b5\n\f\3\r\3\r\3\r\3\r\7\r\u00bb\n\r\f"+
		"\r\16\r\u00be\13\r\5\r\u00c0\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\5\20\u00cc\n\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d3\n\20\f"+
		"\20\16\20\u00d6\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00de\n\21\f"+
		"\21\16\21\u00e1\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ea\n"+
		"\22\3\22\3\22\5\22\u00ee\n\22\3\22\3\22\3\22\3\22\5\22\u00f4\n\22\3\23"+
		"\3\23\3\23\5\23\u00f9\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0106\n\24\f\24\16\24\u0109\13\24\3\24\2\5\36 &\25\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\7\2\5\5\16\16\23\23\25\26"+
		"\30\30\3\2\36\37\3\2 \"\u011c\2(\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bH\3\2"+
		"\2\2\nS\3\2\2\2\f`\3\2\2\2\16b\3\2\2\2\20w\3\2\2\2\22y\3\2\2\2\24|\3\2"+
		"\2\2\26\u00b4\3\2\2\2\30\u00b6\3\2\2\2\32\u00c3\3\2\2\2\34\u00c7\3\2\2"+
		"\2\36\u00c9\3\2\2\2 \u00d7\3\2\2\2\"\u00f3\3\2\2\2$\u00f8\3\2\2\2&\u00fa"+
		"\3\2\2\2()\7\31\2\2)/\7#\2\2*.\5\6\4\2+.\5\b\5\2,.\5\n\6\2-*\3\2\2\2-"+
		"+\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61"+
		"/\3\2\2\2\62\66\7\n\2\2\63\65\5\16\b\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\f\2\2:\3\3\2\2\2;@"+
		"\7#\2\2<=\7#\2\2=>\7\24\2\2>@\7\27\2\2?;\3\2\2\2?<\3\2\2\2@\5\3\2\2\2"+
		"AB\7\35\2\2BC\5\4\3\2CD\7#\2\2DE\7\13\2\2EF\5$\23\2FG\7\t\2\2G\7\3\2\2"+
		"\2HI\5\4\3\2IN\7#\2\2JK\7\21\2\2KM\7#\2\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\t\2\2R\t\3\2\2\2ST\7\6\2\2TU\7#\2"+
		"\2UY\7\n\2\2VX\5\b\5\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2"+
		"\2\2[Y\3\2\2\2\\]\7\f\2\2]\13\3\2\2\2^a\5\4\3\2_a\7\b\2\2`^\3\2\2\2`_"+
		"\3\2\2\2a\r\3\2\2\2bc\5\f\7\2cd\7#\2\2de\7\20\2\2ef\5\20\t\2fj\7\34\2"+
		"\2gi\5\b\5\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2"+
		"\2mn\5\24\13\2n\17\3\2\2\2ot\5\22\n\2pq\7\21\2\2qs\5\22\n\2rp\3\2\2\2"+
		"sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wo\3\2\2\2wx\3\2\2\2"+
		"x\21\3\2\2\2yz\5\4\3\2z{\7#\2\2{\23\3\2\2\2|\u0080\7\n\2\2}\177\5\26\f"+
		"\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\f\2\2\u0084\25\3\2\2"+
		"\2\u0085\u0086\5&\24\2\u0086\u0087\7\13\2\2\u0087\u0088\5\36\20\2\u0088"+
		"\u0089\7\t\2\2\u0089\u00b5\3\2\2\2\u008a\u008b\5&\24\2\u008b\u008c\5\30"+
		"\r\2\u008c\u008d\7\t\2\2\u008d\u00b5\3\2\2\2\u008e\u008f\7\r\2\2\u008f"+
		"\u0090\7\20\2\2\u0090\u0091\5\32\16\2\u0091\u0092\7\34\2\2\u0092\u0095"+
		"\5\26\f\2\u0093\u0094\7\33\2\2\u0094\u0096\5\26\f\2\u0095\u0093\3\2\2"+
		"\2\u0095\u0096\3\2\2\2\u0096\u00b5\3\2\2\2\u0097\u0098\7\7\2\2\u0098\u0099"+
		"\7\20\2\2\u0099\u009a\5\32\16\2\u009a\u009b\7\34\2\2\u009b\u009c\5\26"+
		"\f\2\u009c\u00b5\3\2\2\2\u009d\u009f\7\4\2\2\u009e\u00a0\5\36\20\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00b5\7\t"+
		"\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\5&\24\2\u00a5"+
		"\u00a6\7\34\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00b5\3\2\2\2\u00a8\u00a9\7"+
		"\17\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ad\5\36\20\2\u00ab\u00ac\7\21\2"+
		"\2\u00ac\u00ae\7$\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\7\34\2\2\u00b0\u00b1\7\t\2\2\u00b1\u00b5\3\2\2\2"+
		"\u00b2\u00b5\5\24\13\2\u00b3\u00b5\7\t\2\2\u00b4\u0085\3\2\2\2\u00b4\u008a"+
		"\3\2\2\2\u00b4\u008e\3\2\2\2\u00b4\u0097\3\2\2\2\u00b4\u009d\3\2\2\2\u00b4"+
		"\u00a2\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5\27\3\2\2\2\u00b6\u00bf\7\20\2\2\u00b7\u00bc\5\36\20\2\u00b8"+
		"\u00b9\7\21\2\2\u00b9\u00bb\5\36\20\2\u00ba\u00b8\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\7\34\2\2\u00c2\31\3\2\2\2\u00c3\u00c4\5\36\20\2\u00c4"+
		"\u00c5\5\34\17\2\u00c5\u00c6\5\36\20\2\u00c6\33\3\2\2\2\u00c7\u00c8\t"+
		"\2\2\2\u00c8\35\3\2\2\2\u00c9\u00cb\b\20\1\2\u00ca\u00cc\7\37\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\5 "+
		"\21\2\u00ce\u00d4\3\2\2\2\u00cf\u00d0\f\3\2\2\u00d0\u00d1\t\3\2\2\u00d1"+
		"\u00d3\5 \21\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\37\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8"+
		"\b\21\1\2\u00d8\u00d9\5\"\22\2\u00d9\u00df\3\2\2\2\u00da\u00db\f\3\2\2"+
		"\u00db\u00dc\t\4\2\2\u00dc\u00de\5\"\22\2\u00dd\u00da\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0!\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00f4\5$\23\2\u00e3\u00e4\7\3\2\2\u00e4\u00e9\7#"+
		"\2\2\u00e5\u00e6\7\24\2\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8\7\27\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f4\3\2"+
		"\2\2\u00eb\u00ed\5&\24\2\u00ec\u00ee\5\30\r\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f4\3\2\2\2\u00ef\u00f0\7\20\2\2\u00f0\u00f1\5"+
		"\36\20\2\u00f1\u00f2\7\34\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e2\3\2\2\2"+
		"\u00f3\u00e3\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4#\3"+
		"\2\2\2\u00f5\u00f9\7$\2\2\u00f6\u00f9\7%\2\2\u00f7\u00f9\7&\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9%\3\2\2\2"+
		"\u00fa\u00fb\b\24\1\2\u00fb\u00fc\7#\2\2\u00fc\u0107\3\2\2\2\u00fd\u00fe"+
		"\f\4\2\2\u00fe\u00ff\7\22\2\2\u00ff\u0106\7#\2\2\u0100\u0101\f\3\2\2\u0101"+
		"\u0102\7\24\2\2\u0102\u0103\5\36\20\2\u0103\u0104\7\27\2\2\u0104\u0106"+
		"\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u0100\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\'\3\2\2\2\u0109\u0107\3\2\2\2"+
		"\34-/\66?NY`jtw\u0080\u0095\u009f\u00ad\u00b4\u00bc\u00bf\u00cb\u00d4"+
		"\u00df\u00e9\u00ed\u00f3\u00f8\u0105\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}