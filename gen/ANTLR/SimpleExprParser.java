// Generated from C:/Users/11388/IdeaProjects/demo/src/main/java/ANTLR\SimpleExpr.g4 by ANTLR 4.12.0
package ANTLR_code;

    package SimpleExpr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SEMI=8, IF=9, 
		MUL=10, DIV=11, ADD=12, MINUS=13, LPAREN=14, RPAREN=15, BIGGER=16, SMALLER=17, 
		BIGGER_EQUAL=18, SMALLER_EQUAL=19, EQUAL=20, ELSE=21, ASSIGN=22, NOT_EQUAL=23, 
		RETURN=24, FOR=25, WHILE=26, BREAK=27, INT_KEYWORD=28, DOUBLE_KEYWORD=29, 
		FLOAT_KEYWORD=30, CHAR_KEYWORD=31, VOID_KEYWORD=32, STRING_KEYWORD=33, 
		BOOL_KEYWORD=34, TRUE_KEYWORD=35, FALSE_KEYWORD=36, CLASS_KEYWORD=37, 
		THIS_KEYWORD=38, NEW_KEYWORD=39, NULL_KEYWORD=40, PUBLIC_KEYWORD=41, PRIVATE_KEYWORD=42, 
		PROTECTED_KEYWORD=43, ID=44, INT=45, FLOAT=46, WS=47, Sl_COMMENT=48, DOC_COMMENT=49, 
		ML_COMMENT=50;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_additionExpr = 3, RULE_multiplyExpr = 4, 
		RULE_atomicExpr = 5, RULE_condi = 6, RULE_loop = 7, RULE_forInit = 8, 
		RULE_forIter = 9, RULE_declaration = 10, RULE_type = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "additionExpr", "multiplyExpr", "atomicExpr", 
			"condi", "loop", "forInit", "forIter", "declaration", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'elseif'", "'print'", "'println'", "'++'", "'--'", 
			"';'", "'if'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'else'", "'='", "'!='", "'return'", "'for'", 
			"'while'", "'break'", "'int'", "'double'", "'float'", "'char'", "'void'", 
			"'string'", "'bool'", "'true'", "'false'", "'class'", "'this'", "'new'", 
			"'null'", "'public'", "'private'", "'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SEMI", "IF", "MUL", 
			"DIV", "ADD", "MINUS", "LPAREN", "RPAREN", "BIGGER", "SMALLER", "BIGGER_EQUAL", 
			"SMALLER_EQUAL", "EQUAL", "ELSE", "ASSIGN", "NOT_EQUAL", "RETURN", "FOR", 
			"WHILE", "BREAK", "INT_KEYWORD", "DOUBLE_KEYWORD", "FLOAT_KEYWORD", "CHAR_KEYWORD", 
			"VOID_KEYWORD", "STRING_KEYWORD", "BOOL_KEYWORD", "TRUE_KEYWORD", "FALSE_KEYWORD", 
			"CLASS_KEYWORD", "THIS_KEYWORD", "NEW_KEYWORD", "NULL_KEYWORD", "PUBLIC_KEYWORD", 
			"PRIVATE_KEYWORD", "PROTECTED_KEYWORD", "ID", "INT", "FLOAT", "WS", "Sl_COMMENT", 
			"DOC_COMMENT", "ML_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "SimpleExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleExprParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123172531749616L) != 0)) {
				{
				{
				setState(24);
				stat();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleExprParser.SEMI, 0); }
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleExprParser.ASSIGN, 0); }
		public TerminalNode IF() { return getToken(SimpleExprParser.IF, 0); }
		public List<CondiContext> condi() {
			return getRuleContexts(CondiContext.class);
		}
		public CondiContext condi(int i) {
			return getRuleContext(CondiContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleExprParser.ELSE, 0); }
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SimpleExprParser.RETURN, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				expr();
				setState(33);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(ID);
				setState(36);
				match(ASSIGN);
				setState(37);
				expr();
				setState(38);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(IF);
				setState(41);
				condi();
				setState(42);
				match(T__0);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123172531749616L) != 0)) {
					{
					{
					setState(43);
					stat();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(T__1);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(50);
					match(T__2);
					setState(51);
					condi();
					setState(52);
					match(T__0);
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123172531749616L) != 0)) {
						{
						{
						setState(53);
						stat();
						}
						}
						setState(58);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(59);
					match(T__1);
					}
				}

				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(63);
					match(ELSE);
					setState(64);
					match(T__0);
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123172531749616L) != 0)) {
						{
						{
						setState(65);
						stat();
						}
						}
						setState(70);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(71);
					match(T__1);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(T__3);
				setState(76);
				expr();
				setState(77);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				match(T__4);
				setState(80);
				expr();
				setState(81);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				match(RETURN);
				setState(84);
				expr();
				setState(85);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				declaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public AdditionExprContext additionExpr() {
			return getRuleContext(AdditionExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			additionExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditionExprContext extends ParserRuleContext {
		public List<MultiplyExprContext> multiplyExpr() {
			return getRuleContexts(MultiplyExprContext.class);
		}
		public MultiplyExprContext multiplyExpr(int i) {
			return getRuleContext(MultiplyExprContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(SimpleExprParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(SimpleExprParser.ADD, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SimpleExprParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SimpleExprParser.MINUS, i);
		}
		public AdditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitAdditionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitAdditionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExprContext additionExpr() throws RecognitionException {
		AdditionExprContext _localctx = new AdditionExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_additionExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			multiplyExpr();
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(94);
					multiplyExpr();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExprContext extends ParserRuleContext {
		public List<AtomicExprContext> atomicExpr() {
			return getRuleContexts(AtomicExprContext.class);
		}
		public AtomicExprContext atomicExpr(int i) {
			return getRuleContext(AtomicExprContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(SimpleExprParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(SimpleExprParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(SimpleExprParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SimpleExprParser.DIV, i);
		}
		public MultiplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitMultiplyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitMultiplyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiplyExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			atomicExpr();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(102);
					atomicExpr();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(SimpleExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SimpleExprParser.FLOAT, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleExprParser.RPAREN, 0); }
		public AtomicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterAtomicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitAtomicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitAtomicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExprContext atomicExpr() throws RecognitionException {
		AtomicExprContext _localctx = new AtomicExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atomicExpr);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(ID);
				setState(109);
				match(ASSIGN);
				setState(110);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(ID);
				setState(112);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(ID);
				setState(114);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(T__5);
				setState(116);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				match(T__6);
				setState(118);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				match(INT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				match(FLOAT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				match(LPAREN);
				setState(123);
				expr();
				setState(124);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondiContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIGGER() { return getToken(SimpleExprParser.BIGGER, 0); }
		public TerminalNode SMALLER() { return getToken(SimpleExprParser.SMALLER, 0); }
		public TerminalNode BIGGER_EQUAL() { return getToken(SimpleExprParser.BIGGER_EQUAL, 0); }
		public TerminalNode SMALLER_EQUAL() { return getToken(SimpleExprParser.SMALLER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(SimpleExprParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SimpleExprParser.NOT_EQUAL, 0); }
		public CondiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterCondi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitCondi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitCondi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondiContext condi() throws RecognitionException {
		CondiContext _localctx = new CondiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			expr();
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 10420224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimpleExprParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SimpleExprParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleExprParser.LPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(SimpleExprParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SimpleExprParser.SEMI, i);
		}
		public CondiContext condi() {
			return getRuleContext(CondiContext.class,0);
		}
		public ForIterContext forIter() {
			return getRuleContext(ForIterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleExprParser.RPAREN, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(WHILE);
				setState(133);
				expr();
				setState(134);
				match(T__0);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123172531749616L) != 0)) {
					{
					{
					setState(135);
					stat();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__1);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(FOR);
				setState(144);
				match(LPAREN);
				setState(145);
				forInit();
				setState(146);
				match(SEMI);
				setState(147);
				condi();
				setState(148);
				match(SEMI);
				setState(149);
				forIter();
				setState(150);
				match(RPAREN);
				setState(151);
				match(T__0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123172531749616L) != 0)) {
					{
					{
					setState(152);
					stat();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(163);
			match(ASSIGN);
			setState(164);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForIterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForIterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterForIter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitForIter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitForIter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIterContext forIter() throws RecognitionException {
		ForIterContext _localctx = new ForIterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forIter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
			match(ASSIGN);
			setState(168);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(SimpleExprParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			type();
			setState(171);
			match(ID);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(172);
				match(ASSIGN);
				setState(173);
				expr();
				}
			}

			setState(176);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_KEYWORD() { return getToken(SimpleExprParser.INT_KEYWORD, 0); }
		public TerminalNode FLOAT_KEYWORD() { return getToken(SimpleExprParser.FLOAT_KEYWORD, 0); }
		public TerminalNode STRING_KEYWORD() { return getToken(SimpleExprParser.STRING_KEYWORD, 0); }
		public TerminalNode BOOL_KEYWORD() { return getToken(SimpleExprParser.BOOL_KEYWORD, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 27111981056L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u00012\u00b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001"+
		"\n\u0001\f\u0001:\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001C\b\u0001\n\u0001\f\u0001"+
		"F\t\u0001\u0001\u0001\u0003\u0001I\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001Y\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003`\b\u0003\n\u0003\f\u0003c\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004h\b\u0004\n\u0004\f\u0004k\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u007f\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0089\b\u0007\n"+
		"\u0007\f\u0007\u008c\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009a\b\u0007\n\u0007\f\u0007"+
		"\u009d\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a1\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00af\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0000\u0004\u0001\u0000\f\r\u0001\u0000\n\u000b\u0002"+
		"\u0000\u0010\u0014\u0017\u0017\u0003\u0000\u001c\u001c\u001e\u001e!\""+
		"\u00c3\u0000\u001b\u0001\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000"+
		"\u0004Z\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\bd\u0001"+
		"\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000\u0000"+
		"\u0000\u000e\u00a0\u0001\u0000\u0000\u0000\u0010\u00a2\u0001\u0000\u0000"+
		"\u0000\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00aa\u0001\u0000\u0000"+
		"\u0000\u0016\u00b2\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001"+
		"\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000"+
		"\u0000 !\u0003\u0004\u0002\u0000!\"\u0005\b\u0000\u0000\"Y\u0001\u0000"+
		"\u0000\u0000#$\u0005,\u0000\u0000$%\u0005\u0016\u0000\u0000%&\u0003\u0004"+
		"\u0002\u0000&\'\u0005\b\u0000\u0000\'Y\u0001\u0000\u0000\u0000()\u0005"+
		"\t\u0000\u0000)*\u0003\f\u0006\u0000*.\u0005\u0001\u0000\u0000+-\u0003"+
		"\u0002\u0001\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u00001=\u0005\u0002\u0000\u000023\u0005\u0003"+
		"\u0000\u000034\u0003\f\u0006\u000048\u0005\u0001\u0000\u000057\u0003\u0002"+
		"\u0001\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000;<\u0005\u0002\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=2\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>H\u0001\u0000"+
		"\u0000\u0000?@\u0005\u0015\u0000\u0000@D\u0005\u0001\u0000\u0000AC\u0003"+
		"\u0002\u0001\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GI\u0005\u0002\u0000\u0000H?\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IY\u0001\u0000\u0000\u0000JY\u0003"+
		"\u000e\u0007\u0000KL\u0005\u0004\u0000\u0000LM\u0003\u0004\u0002\u0000"+
		"MN\u0005\b\u0000\u0000NY\u0001\u0000\u0000\u0000OP\u0005\u0005\u0000\u0000"+
		"PQ\u0003\u0004\u0002\u0000QR\u0005\b\u0000\u0000RY\u0001\u0000\u0000\u0000"+
		"ST\u0005\u0018\u0000\u0000TU\u0003\u0004\u0002\u0000UV\u0005\b\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WY\u0003\u0014\n\u0000X \u0001\u0000\u0000\u0000"+
		"X#\u0001\u0000\u0000\u0000X(\u0001\u0000\u0000\u0000XJ\u0001\u0000\u0000"+
		"\u0000XK\u0001\u0000\u0000\u0000XO\u0001\u0000\u0000\u0000XS\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0003\u0001\u0000\u0000\u0000"+
		"Z[\u0003\u0006\u0003\u0000[\u0005\u0001\u0000\u0000\u0000\\a\u0003\b\u0004"+
		"\u0000]^\u0007\u0000\u0000\u0000^`\u0003\b\u0004\u0000_]\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\u0007\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"di\u0003\n\u0005\u0000ef\u0007\u0001\u0000\u0000fh\u0003\n\u0005\u0000"+
		"ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000lm\u0005,\u0000\u0000mn\u0005\u0016\u0000\u0000n\u007f\u0003"+
		"\u0004\u0002\u0000op\u0005,\u0000\u0000p\u007f\u0005\u0006\u0000\u0000"+
		"qr\u0005,\u0000\u0000r\u007f\u0005\u0007\u0000\u0000st\u0005\u0006\u0000"+
		"\u0000t\u007f\u0005,\u0000\u0000uv\u0005\u0007\u0000\u0000v\u007f\u0005"+
		",\u0000\u0000w\u007f\u0005,\u0000\u0000x\u007f\u0005-\u0000\u0000y\u007f"+
		"\u0005.\u0000\u0000z{\u0005\u000e\u0000\u0000{|\u0003\u0004\u0002\u0000"+
		"|}\u0005\u000f\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~l\u0001\u0000"+
		"\u0000\u0000~o\u0001\u0000\u0000\u0000~q\u0001\u0000\u0000\u0000~s\u0001"+
		"\u0000\u0000\u0000~u\u0001\u0000\u0000\u0000~w\u0001\u0000\u0000\u0000"+
		"~x\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000"+
		"\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u0004\u0002"+
		"\u0000\u0081\u0082\u0007\u0002\u0000\u0000\u0082\u0083\u0003\u0004\u0002"+
		"\u0000\u0083\r\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u001a\u0000\u0000"+
		"\u0085\u0086\u0003\u0004\u0002\u0000\u0086\u008a\u0005\u0001\u0000\u0000"+
		"\u0087\u0089\u0003\u0002\u0001\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0002\u0000\u0000"+
		"\u008e\u00a1\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0019\u0000\u0000"+
		"\u0090\u0091\u0005\u000e\u0000\u0000\u0091\u0092\u0003\u0010\b\u0000\u0092"+
		"\u0093\u0005\b\u0000\u0000\u0093\u0094\u0003\f\u0006\u0000\u0094\u0095"+
		"\u0005\b\u0000\u0000\u0095\u0096\u0003\u0012\t\u0000\u0096\u0097\u0005"+
		"\u000f\u0000\u0000\u0097\u009b\u0005\u0001\u0000\u0000\u0098\u009a\u0003"+
		"\u0002\u0001\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005\u0002\u0000\u0000\u009f\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a0\u0084\u0001\u0000\u0000\u0000\u00a0\u008f\u0001"+
		"\u0000\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		",\u0000\u0000\u00a3\u00a4\u0005\u0016\u0000\u0000\u00a4\u00a5\u0003\u0004"+
		"\u0002\u0000\u00a5\u0011\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005,\u0000"+
		"\u0000\u00a7\u00a8\u0005\u0016\u0000\u0000\u00a8\u00a9\u0003\u0004\u0002"+
		"\u0000\u00a9\u0013\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0016\u000b"+
		"\u0000\u00ab\u00ae\u0005,\u0000\u0000\u00ac\u00ad\u0005\u0016\u0000\u0000"+
		"\u00ad\u00af\u0003\u0004\u0002\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005\b\u0000\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0007\u0003\u0000\u0000\u00b3\u0017\u0001\u0000\u0000\u0000\u000e"+
		"\u001b.8=DHXai~\u008a\u009b\u00a0\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}