// Generated from MicroJava.g4 by ANTLR 4.4

package srcparser;

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
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, TYPE=24, 
		IDENT=25, INT_NUMBER=26, REAL_NUMBER=27, CHAR_CONST=28, COMMENT=29, LINE_COMMENT=30, 
		WS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'return'", "'!='", "'>='", "'{'", "';'", "'void'", 
		"'=='", "'<'", "'='", "'}'", "'>'", "'if'", "'<='", "'program'", "'%'", 
		"'else'", "'('", "')'", "'*'", "'+'", "','", "'-'", "TYPE", "IDENT", "INT_NUMBER", 
		"REAL_NUMBER", "CHAR_CONST", "COMMENT", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_typeOrVoid = 1, RULE_methodDecl = 2, RULE_methodDeclVariable = 3, 
		RULE_block = 4, RULE_statement = 5, RULE_condition = 6, RULE_relOp = 7, 
		RULE_expr = 8, RULE_term = 9, RULE_factor = 10, RULE_addOp = 11, RULE_mulOp = 12;
	public static final String[] ruleNames = {
		"program", "typeOrVoid", "methodDecl", "methodDeclVariable", "block", 
		"statement", "condition", "relOp", "expr", "term", "factor", "addOp", 
		"mulOp"
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
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
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
			setState(26); match(T__8);
			setState(27); match(IDENT);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==TYPE) {
				{
				{
				setState(28); methodDecl();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeOrVoidContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MicroJavaParser.TYPE, 0); }
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
		enterRule(_localctx, 2, RULE_typeOrVoid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==TYPE) ) {
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

	public static class MethodDeclContext extends ParserRuleContext {
		public MethodDeclVariableContext methodDeclVariable(int i) {
			return getRuleContext(MethodDeclVariableContext.class,i);
		}
		public TypeOrVoidContext typeOrVoid() {
			return getRuleContext(TypeOrVoidContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public List<MethodDeclVariableContext> methodDeclVariable() {
			return getRuleContexts(MethodDeclVariableContext.class);
		}
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
		enterRule(_localctx, 4, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); typeOrVoid();
			setState(37); match(IDENT);
			setState(38); match(T__5);
			setState(39); match(T__4);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(40); methodDeclVariable();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46); block();
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

	public static class MethodDeclVariableContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MicroJavaParser.TYPE, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(MicroJavaParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MicroJavaParser.IDENT); }
		public MethodDeclVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterMethodDeclVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitMethodDeclVariable(this);
		}
	}

	public final MethodDeclVariableContext methodDeclVariable() throws RecognitionException {
		MethodDeclVariableContext _localctx = new MethodDeclVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDeclVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(TYPE);
			setState(49); match(IDENT);
			setState(58);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(50); match(T__17);
				}
				break;
			case T__1:
				{
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51); match(T__1);
					setState(52); match(IDENT);
					}
					}
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(57); match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(T__18);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__18) | (1L << T__10) | (1L << IDENT))) != 0)) {
				{
				{
				setState(61); statement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67); match(T__12);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(89);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(IDENT);
				setState(70); match(T__13);
				setState(71); expr();
				setState(72); match(T__17);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); match(T__21);
				setState(76);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__0) | (1L << IDENT) | (1L << INT_NUMBER) | (1L << REAL_NUMBER) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(75); expr();
					}
				}

				setState(78); match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); block();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); match(T__10);
				setState(81); match(T__5);
				setState(82); condition();
				setState(83); match(T__4);
				setState(84); statement();
				setState(87);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(85); match(T__6);
					setState(86); statement();
					}
					break;
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
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
		enterRule(_localctx, 12, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); expr();
			setState(92); relOp();
			setState(93); expr();
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

	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitRelOp(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__15) | (1L << T__14) | (1L << T__11) | (1L << T__9))) != 0)) ) {
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
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(97); match(T__0);
				}
			}

			setState(100); term();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__0) {
				{
				{
				setState(101); addOp();
				setState(102); term();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); factor();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__7) | (1L << T__3))) != 0)) {
				{
				{
				setState(110); mulOp();
				setState(111); factor();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(MicroJavaParser.REAL_NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CHAR_CONST() { return getToken(MicroJavaParser.CHAR_CONST, 0); }
		public TerminalNode IDENT() { return getToken(MicroJavaParser.IDENT, 0); }
		public TerminalNode INT_NUMBER() { return getToken(MicroJavaParser.INT_NUMBER, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case INT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(INT_NUMBER);
				}
				break;
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(REAL_NUMBER);
				}
				break;
			case CHAR_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); match(CHAR_CONST);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(121); match(IDENT);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122); match(T__5);
				setState(123); expr();
				setState(124); match(T__4);
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

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitAddOp(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__0) ) {
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

	public static class MulOpContext extends ParserRuleContext {
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroJavaListener ) ((MicroJavaListener)listener).exitMulOp(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__7) | (1L << T__3))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u0087\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\6\58\n\5\r\5\16\59\3\5\5\5=\n\5\3\6\3\6\7\6A\n\6\f\6\16\6D\13\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7Z\n\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\5\ne\n\n\3"+
		"\n\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\13\3\13\3\13\3\13\7\13t\n\13"+
		"\f\13\16\13w\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3\r\3"+
		"\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\4\2\t\t"+
		"\32\32\6\2\5\6\n\13\16\16\20\20\4\2\27\27\31\31\5\2\3\3\22\22\26\26\u008a"+
		"\2\34\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b\62\3\2\2\2\n>\3\2\2\2\f[\3\2\2\2"+
		"\16]\3\2\2\2\20a\3\2\2\2\22d\3\2\2\2\24o\3\2\2\2\26\u0080\3\2\2\2\30\u0082"+
		"\3\2\2\2\32\u0084\3\2\2\2\34\35\7\21\2\2\35!\7\33\2\2\36 \5\6\4\2\37\36"+
		"\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$%\t\2"+
		"\2\2%\5\3\2\2\2&\'\5\4\3\2\'(\7\33\2\2()\7\24\2\2)-\7\25\2\2*,\5\b\5\2"+
		"+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\5"+
		"\n\6\2\61\7\3\2\2\2\62\63\7\32\2\2\63<\7\33\2\2\64=\7\b\2\2\65\66\7\30"+
		"\2\2\668\7\33\2\2\67\65\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2"+
		"\2\2;=\7\b\2\2<\64\3\2\2\2<\67\3\2\2\2=\t\3\2\2\2>B\7\7\2\2?A\5\f\7\2"+
		"@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\r\2\2"+
		"F\13\3\2\2\2GH\7\33\2\2HI\7\f\2\2IJ\5\22\n\2JK\7\b\2\2K\\\3\2\2\2LN\7"+
		"\4\2\2MO\5\22\n\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2P\\\7\b\2\2Q\\\5\n\6\2"+
		"RS\7\17\2\2ST\7\24\2\2TU\5\16\b\2UV\7\25\2\2VY\5\f\7\2WX\7\23\2\2XZ\5"+
		"\f\7\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[G\3\2\2\2[L\3\2\2\2[Q\3\2\2\2[R"+
		"\3\2\2\2\\\r\3\2\2\2]^\5\22\n\2^_\5\20\t\2_`\5\22\n\2`\17\3\2\2\2ab\t"+
		"\3\2\2b\21\3\2\2\2ce\7\31\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fl\5\24\13"+
		"\2gh\5\30\r\2hi\5\24\13\2ik\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2m\23\3\2\2\2nl\3\2\2\2ou\5\26\f\2pq\5\32\16\2qr\5\26\f\2rt\3\2\2"+
		"\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\25\3\2\2\2wu\3\2\2\2x\u0081"+
		"\7\34\2\2y\u0081\7\35\2\2z\u0081\7\36\2\2{\u0081\7\33\2\2|}\7\24\2\2}"+
		"~\5\22\n\2~\177\7\25\2\2\177\u0081\3\2\2\2\u0080x\3\2\2\2\u0080y\3\2\2"+
		"\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081\27\3\2\2\2\u0082"+
		"\u0083\t\4\2\2\u0083\31\3\2\2\2\u0084\u0085\t\5\2\2\u0085\33\3\2\2\2\16"+
		"!-9<BNY[dlu\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}