// Generated from Simple.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, ID=18, NUM=19, CHAR_CONST=20, COMMENT=21, LINE_COMMENT=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "'>='", "';'", "'while'", "'{'", "'['", "'='", "'}'", 
		"']'", "'if'", "'<='", "'else'", "'print'", "'('", "')'", "'+'", "'-'", 
		"ID", "NUM", "CHAR_CONST", "COMMENT", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_p = 0, RULE_v = 1, RULE_z = 2, RULE_b = 3, RULE_s = 4, RULE_w2 = 5, 
		RULE_a = 6, RULE_w = 7, RULE_i = 8, RULE_i2 = 9, RULE_c = 10, RULE_x = 11, 
		RULE_e = 12, RULE_y = 13, RULE_t = 14, RULE_t1 = 15, RULE_t2 = 16;
	public static final String[] ruleNames = {
		"p", "v", "z", "b", "s", "w2", "a", "w", "i", "i2", "c", "x", "e", "y", 
		"t", "t1", "t2"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitP(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); v();
			setState(35); b();
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

	public static class VContext extends ParserRuleContext {
		public ZContext z(int i) {
			return getRuleContext(ZContext.class,i);
		}
		public List<ZContext> z() {
			return getRuleContexts(ZContext.class);
		}
		public VContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(T__16);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); z();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class ZContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public ZContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitZ(this);
		}
	}

	public final ZContext z() throws RecognitionException {
		ZContext _localctx = new ZContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_z);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(ID);
			setState(47);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(44); match(T__11);
				setState(45); match(NUM);
				setState(46); match(T__8);
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

	public static class BContext extends ParserRuleContext {
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_b);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(T__12);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__7) | (1L << T__4) | (1L << ID))) != 0)) {
				{
				{
				setState(50); s();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56); match(T__9);
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

	public static class SContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public I2Context i2() {
			return getRuleContext(I2Context.class,0);
		}
		public W2Context w2() {
			return getRuleContext(W2Context.class,0);
		}
		public WContext w() {
			return getRuleContext(WContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_s);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); b();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); a();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); w();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61); i();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62); i2();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63); w2();
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

	public static class W2Context extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public W2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterW2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitW2(this);
		}
	}

	public final W2Context w2() throws RecognitionException {
		W2Context _localctx = new W2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_w2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(T__13);
			setState(67); match(T__3);
			setState(68); c();
			setState(69); match(T__2);
			setState(70); s();
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

	public static class AContext extends ParserRuleContext {
		public EContext e1;
		public EContext e2;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(ID);
			setState(77);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(73); match(T__11);
				setState(74); ((AContext)_localctx).e1 = e(0);
				setState(75); match(T__8);
				}
			}

			setState(79); match(T__10);
			setState(80); ((AContext)_localctx).e2 = e(0);
			setState(81); match(T__14);
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

	public static class WContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public WContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitW(this);
		}
	}

	public final WContext w() throws RecognitionException {
		WContext _localctx = new WContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_w);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(T__4);
			setState(84); e(0);
			setState(85); match(T__14);
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

	public static class IContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(T__7);
			setState(88); match(T__3);
			setState(89); c();
			setState(90); match(T__2);
			setState(91); s();
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

	public static class I2Context extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public I2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterI2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitI2(this);
		}
	}

	public final I2Context i2() throws RecognitionException {
		I2Context _localctx = new I2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_i2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(T__7);
			setState(94); match(T__3);
			setState(95); c();
			setState(96); match(T__2);
			setState(97); s();
			setState(98); match(T__5);
			setState(99); s();
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

	public static class CContext extends ParserRuleContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); e(0);
			setState(102); x();
			setState(103); e(0);
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

	public static class XContext extends ParserRuleContext {
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitX(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__6) ) {
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

	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddsubContext extends EContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public AddsubContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAddsub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAddsub(this);
		}
	}
	public static class TermContext extends EContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TermContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitTerm(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(108); t();
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddsubContext(new EContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_e);
					setState(110);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(111); y();
					setState(112); t();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class YContext extends ParserRuleContext {
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitY(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__0) ) {
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

	public static class TContext extends ParserRuleContext {
		public T2Context t2() {
			return getRuleContext(T2Context.class,0);
		}
		public T1Context t1() {
			return getRuleContext(T1Context.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_t);
		try {
			setState(123);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); t1();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); t2();
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

	public static class T1Context extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public T1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitT1(this);
		}
	}

	public final T1Context t1() throws RecognitionException {
		T1Context _localctx = new T1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_t1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(NUM);
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

	public static class T2Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public T2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterT2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitT2(this);
		}
	}

	public final T2Context t2() throws RecognitionException {
		T2Context _localctx = new T2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_t2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(ID);
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(128); match(T__11);
				setState(129); e(0);
				setState(130); match(T__8);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12: return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\6\3*\n\3\r\3\16\3+\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5"+
		"\3\5\7\5\66\n\5\f\5\16\59\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6C\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16u\n\16\f\16\16\16x\13\16\3\17\3\17\3\20\3\20\5\20~\n\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\5\22\u0087\n\22\3\22\2\3\32\23\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"\2\4\4\2\4\4\r\r\3\2\22\23\u0083\2$\3"+
		"\2\2\2\4\'\3\2\2\2\6-\3\2\2\2\b\63\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16J\3"+
		"\2\2\2\20U\3\2\2\2\22Y\3\2\2\2\24_\3\2\2\2\26g\3\2\2\2\30k\3\2\2\2\32"+
		"m\3\2\2\2\34y\3\2\2\2\36}\3\2\2\2 \177\3\2\2\2\"\u0081\3\2\2\2$%\5\4\3"+
		"\2%&\5\b\5\2&\3\3\2\2\2\')\7\3\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2"+
		"\2\2+,\3\2\2\2,\5\3\2\2\2-\61\7\24\2\2./\7\b\2\2/\60\7\25\2\2\60\62\7"+
		"\13\2\2\61.\3\2\2\2\61\62\3\2\2\2\62\7\3\2\2\2\63\67\7\7\2\2\64\66\5\n"+
		"\6\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67"+
		"\3\2\2\2:;\7\n\2\2;\t\3\2\2\2<C\5\b\5\2=C\5\16\b\2>C\5\20\t\2?C\5\22\n"+
		"\2@C\5\24\13\2AC\5\f\7\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2"+
		"\2\2BA\3\2\2\2C\13\3\2\2\2DE\7\6\2\2EF\7\20\2\2FG\5\26\f\2GH\7\21\2\2"+
		"HI\5\n\6\2I\r\3\2\2\2JO\7\24\2\2KL\7\b\2\2LM\5\32\16\2MN\7\13\2\2NP\3"+
		"\2\2\2OK\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\t\2\2RS\5\32\16\2ST\7\5\2\2T"+
		"\17\3\2\2\2UV\7\17\2\2VW\5\32\16\2WX\7\5\2\2X\21\3\2\2\2YZ\7\f\2\2Z[\7"+
		"\20\2\2[\\\5\26\f\2\\]\7\21\2\2]^\5\n\6\2^\23\3\2\2\2_`\7\f\2\2`a\7\20"+
		"\2\2ab\5\26\f\2bc\7\21\2\2cd\5\n\6\2de\7\16\2\2ef\5\n\6\2f\25\3\2\2\2"+
		"gh\5\32\16\2hi\5\30\r\2ij\5\32\16\2j\27\3\2\2\2kl\t\2\2\2l\31\3\2\2\2"+
		"mn\b\16\1\2no\5\36\20\2ov\3\2\2\2pq\f\4\2\2qr\5\34\17\2rs\5\36\20\2su"+
		"\3\2\2\2tp\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\33\3\2\2\2xv\3\2\2\2"+
		"yz\t\3\2\2z\35\3\2\2\2{~\5 \21\2|~\5\"\22\2}{\3\2\2\2}|\3\2\2\2~\37\3"+
		"\2\2\2\177\u0080\7\25\2\2\u0080!\3\2\2\2\u0081\u0086\7\24\2\2\u0082\u0083"+
		"\7\b\2\2\u0083\u0084\5\32\16\2\u0084\u0085\7\13\2\2\u0085\u0087\3\2\2"+
		"\2\u0086\u0082\3\2\2\2\u0086\u0087\3\2\2\2\u0087#\3\2\2\2\n+\61\67BOv"+
		"}\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}