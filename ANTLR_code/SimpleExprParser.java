// Generated from C:/Users/11388/IdeaProjects/demo/src/main/java/ANTLR_code\SimpleExpr.g4 by ANTLR 4.12.0
package ANTLR_code;


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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, SEMI=6, IF=7, MUL=8, DIV=9, ADD=10, 
		MINUS=11, LPAREN=12, RPAREN=13, BIGGER=14, SMALLER=15, BIGGER_EQUAL=16, 
		SMALLER_EQUAL=17, EQUAL=18, ELSE=19, ASSIGN=20, NOT_EQUAL=21, RETURN=22, 
		FOR=23, WHILE=24, BREAK=25, INT_KEYWORD=26, DOUBLE_KEYWORD=27, FLOAT_KEYWORD=28, 
		CHAR_KEYWORD=29, VOID_KEYWORD=30, STRING_KEYWORD=31, BOOL_KEYWORD=32, 
		TRUE_KEYWORD=33, FALSE_KEYWORD=34, CLASS_KEYWORD=35, THIS_KEYWORD=36, 
		NEW_KEYWORD=37, NULL_KEYWORD=38, PUBLIC_KEYWORD=39, PRIVATE_KEYWORD=40, 
		PROTECTED_KEYWORD=41, COMMA=42, LBRACE=43, RBRACE=44, ID=45, INT=46, FLOAT=47, 
		WS=48, Sl_COMMENT=49, DOC_COMMENT=50, ML_COMMENT=51;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_multiplyExpr = 3, RULE_atomicExpr = 4, 
		RULE_assignStatement = 5, RULE_postIncrementStatement = 6, RULE_postDecrementStatement = 7, 
		RULE_preIncrementStatement = 8, RULE_preDecrementStatement = 9, RULE_condi = 10, 
		RULE_loop = 11, RULE_forInit = 12, RULE_forIter = 13, RULE_declaration = 14, 
		RULE_functionDefinition = 15, RULE_mainFunction = 16, RULE_normalFunction = 17, 
		RULE_parameter = 18, RULE_type = 19, RULE_block = 20, RULE_paramList = 21, 
		RULE_parameterList = 22, RULE_param = 23, RULE_varDeclaration = 24, RULE_functionDeclaration = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "multiplyExpr", "atomicExpr", "assignStatement", 
			"postIncrementStatement", "postDecrementStatement", "preIncrementStatement", 
			"preDecrementStatement", "condi", "loop", "forInit", "forIter", "declaration", 
			"functionDefinition", "mainFunction", "normalFunction", "parameter", 
			"type", "block", "paramList", "parameterList", "param", "varDeclaration", 
			"functionDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'println'", "'++'", "'--'", "'main'", "';'", "'if'", 
			"'*'", "'/'", "'+'", "'-'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'else'", "'='", "'!='", "'return'", "'for'", "'while'", "'break'", 
			"'int'", "'double'", "'float'", "'char'", "'void'", "'string'", "'bool'", 
			"'true'", "'false'", "'class'", "'this'", "'new'", "'null'", "'public'", 
			"'private'", "'protected'", "','", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "SEMI", "IF", "MUL", "DIV", "ADD", 
			"MINUS", "LPAREN", "RPAREN", "BIGGER", "SMALLER", "BIGGER_EQUAL", "SMALLER_EQUAL", 
			"EQUAL", "ELSE", "ASSIGN", "NOT_EQUAL", "RETURN", "FOR", "WHILE", "BREAK", 
			"INT_KEYWORD", "DOUBLE_KEYWORD", "FLOAT_KEYWORD", "CHAR_KEYWORD", "VOID_KEYWORD", 
			"STRING_KEYWORD", "BOOL_KEYWORD", "TRUE_KEYWORD", "FALSE_KEYWORD", "CLASS_KEYWORD", 
			"THIS_KEYWORD", "NEW_KEYWORD", "NULL_KEYWORD", "PUBLIC_KEYWORD", "PRIVATE_KEYWORD", 
			"PROTECTED_KEYWORD", "COMMA", "LBRACE", "RBRACE", "ID", "INT", "FLOAT", 
			"WS", "Sl_COMMENT", "DOC_COMMENT", "ML_COMMENT"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246298485723294L) != 0)) {
				{
				{
				setState(52);
				stat();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimpleExprParser.SEMI, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public PostIncrementStatementContext postIncrementStatement() {
			return getRuleContext(PostIncrementStatementContext.class,0);
		}
		public PostDecrementStatementContext postDecrementStatement() {
			return getRuleContext(PostDecrementStatementContext.class,0);
		}
		public PreIncrementStatementContext preIncrementStatement() {
			return getRuleContext(PreIncrementStatementContext.class,0);
		}
		public PreDecrementStatementContext preDecrementStatement() {
			return getRuleContext(PreDecrementStatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public List<TerminalNode> IF() { return getTokens(SimpleExprParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SimpleExprParser.IF, i);
		}
		public List<CondiContext> condi() {
			return getRuleContexts(CondiContext.class);
		}
		public CondiContext condi(int i) {
			return getRuleContext(CondiContext.class,i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(SimpleExprParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(SimpleExprParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(SimpleExprParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(SimpleExprParser.RBRACE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(SimpleExprParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(SimpleExprParser.ELSE, i);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SimpleExprParser.RETURN, 0); }
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
			int _alt;
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				functionDeclaration();
				setState(61);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				varDeclaration();
				setState(64);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				assignStatement();
				setState(67);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				postIncrementStatement();
				setState(70);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				postDecrementStatement();
				setState(73);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				preIncrementStatement();
				setState(76);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				preDecrementStatement();
				setState(79);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				expr(0);
				setState(82);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				functionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				match(IF);
				setState(86);
				condi();
				setState(87);
				match(LBRACE);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246298485723294L) != 0)) {
					{
					{
					setState(88);
					stat();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				match(RBRACE);
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						match(ELSE);
						setState(96);
						match(IF);
						setState(97);
						condi();
						setState(98);
						match(LBRACE);
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246298485723294L) != 0)) {
							{
							{
							setState(99);
							stat();
							}
							}
							setState(104);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(105);
						match(RBRACE);
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(112);
					match(ELSE);
					setState(113);
					match(LBRACE);
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246298485723294L) != 0)) {
						{
						{
						setState(114);
						stat();
						}
						}
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(120);
					match(RBRACE);
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(123);
				loop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(124);
				match(T__0);
				setState(125);
				expr(0);
				setState(126);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(128);
				match(T__1);
				setState(129);
				expr(0);
				setState(130);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(132);
				match(RETURN);
				setState(133);
				expr(0);
				setState(134);
				match(SEMI);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseExprContext extends ExprContext {
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public BaseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterBaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitBaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitBaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SimpleExprParser.ADD, 0); }
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SimpleExprParser.MINUS, 0); }
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public SubtractExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterSubtractExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitSubtractExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitSubtractExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BaseExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(139);
			multiplyExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(142);
						match(ADD);
						setState(143);
						multiplyExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(145);
						match(MINUS);
						setState(146);
						multiplyExpr(0);
						}
						break;
					}
					} 
				}
				setState(151);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExprContext extends ParserRuleContext {
		public MultiplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpr; }
	 
		public MultiplyExprContext() { }
		public void copyFrom(MultiplyExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseMultiplyExprContext extends MultiplyExprContext {
		public AtomicExprContext atomicExpr() {
			return getRuleContext(AtomicExprContext.class,0);
		}
		public BaseMultiplyExprContext(MultiplyExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterBaseMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitBaseMultiplyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitBaseMultiplyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationExpressionContext extends MultiplyExprContext {
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public TerminalNode MUL() { return getToken(SimpleExprParser.MUL, 0); }
		public AtomicExprContext atomicExpr() {
			return getRuleContext(AtomicExprContext.class,0);
		}
		public MultiplicationExpressionContext(MultiplyExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitMultiplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideExprContext extends MultiplyExprContext {
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public TerminalNode DIV() { return getToken(SimpleExprParser.DIV, 0); }
		public AtomicExprContext atomicExpr() {
			return getRuleContext(AtomicExprContext.class,0);
		}
		public DivideExprContext(MultiplyExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterDivideExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitDivideExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitDivideExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		return multiplyExpr(0);
	}

	private MultiplyExprContext multiplyExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, _parentState);
		MultiplyExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_multiplyExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BaseMultiplyExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(153);
			atomicExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpressionContext(new MultiplyExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
						setState(155);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(156);
						match(MUL);
						setState(157);
						atomicExpr();
						}
						break;
					case 2:
						{
						_localctx = new DivideExprContext(new MultiplyExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159);
						match(DIV);
						setState(160);
						atomicExpr();
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicExprContext extends ParserRuleContext {
		public AtomicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpr; }
	 
		public AtomicExprContext() { }
		public void copyFrom(AtomicExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends AtomicExprContext {
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public IdExprContext(AtomicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatLiteralContext extends AtomicExprContext {
		public TerminalNode FLOAT() { return getToken(SimpleExprParser.FLOAT, 0); }
		public FloatLiteralContext(AtomicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends AtomicExprContext {
		public TerminalNode INT() { return getToken(SimpleExprParser.INT, 0); }
		public IntLiteralContext(AtomicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends AtomicExprContext {
		public TerminalNode LPAREN() { return getToken(SimpleExprParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimpleExprParser.RPAREN, 0); }
		public ParenExprContext(AtomicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExprContext atomicExpr() throws RecognitionException {
		AtomicExprContext _localctx = new AtomicExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atomicExpr);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(ID);
				}
				break;
			case INT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(FLOAT);
				}
				break;
			case LPAREN:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(LPAREN);
				setState(170);
				expr(0);
				setState(171);
				match(RPAREN);
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
	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
			setState(176);
			match(ASSIGN);
			setState(177);
			expr(0);
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
	public static class PostIncrementStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public PostIncrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterPostIncrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitPostIncrementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitPostIncrementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementStatementContext postIncrementStatement() throws RecognitionException {
		PostIncrementStatementContext _localctx = new PostIncrementStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_postIncrementStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(180);
			match(T__2);
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
	public static class PostDecrementStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public PostDecrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterPostDecrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitPostDecrementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitPostDecrementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementStatementContext postDecrementStatement() throws RecognitionException {
		PostDecrementStatementContext _localctx = new PostDecrementStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_postDecrementStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ID);
			setState(183);
			match(T__3);
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
	public static class PreIncrementStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public PreIncrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterPreIncrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitPreIncrementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitPreIncrementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementStatementContext preIncrementStatement() throws RecognitionException {
		PreIncrementStatementContext _localctx = new PreIncrementStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_preIncrementStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__2);
			setState(186);
			match(ID);
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
	public static class PreDecrementStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public PreDecrementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterPreDecrementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitPreDecrementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitPreDecrementStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementStatementContext preDecrementStatement() throws RecognitionException {
		PreDecrementStatementContext _localctx = new PreDecrementStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_preDecrementStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__3);
			setState(189);
			match(ID);
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
		enterRule(_localctx, 20, RULE_condi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			expr(0);
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2605056L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(193);
			expr(0);
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
		public TerminalNode LBRACE() { return getToken(SimpleExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleExprParser.RBRACE, 0); }
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
		enterRule(_localctx, 22, RULE_loop);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(WHILE);
				setState(196);
				expr(0);
				setState(197);
				match(LBRACE);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246298485723294L) != 0)) {
					{
					{
					setState(198);
					stat();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(RBRACE);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(FOR);
				setState(207);
				match(LPAREN);
				setState(208);
				forInit();
				setState(209);
				match(SEMI);
				setState(210);
				condi();
				setState(211);
				match(SEMI);
				setState(212);
				forIter();
				setState(213);
				match(RPAREN);
				setState(214);
				match(LBRACE);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246298485723294L) != 0)) {
					{
					{
					setState(215);
					stat();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(RBRACE);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
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
		enterRule(_localctx, 24, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			declaration();
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
		enterRule(_localctx, 26, RULE_forIter);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(ID);
				setState(228);
				match(ASSIGN);
				setState(229);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(ID);
				setState(231);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__2);
				setState(233);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(ID);
				setState(235);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__3);
				setState(237);
				match(ID);
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
		enterRule(_localctx, 28, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			type();
			setState(241);
			match(ID);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(242);
				match(ASSIGN);
				setState(243);
				expr(0);
				}
			}

			setState(246);
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public NormalFunctionContext normalFunction() {
			return getRuleContext(NormalFunctionContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDefinition);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				mainFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				normalFunction();
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
	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode INT_KEYWORD() { return getToken(SimpleExprParser.INT_KEYWORD, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleExprParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(SimpleExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleExprParser.RBRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(INT_KEYWORD);
			setState(253);
			match(T__4);
			setState(254);
			match(LPAREN);
			setState(255);
			match(RPAREN);
			setState(256);
			match(LBRACE);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246298485723294L) != 0)) {
				{
				{
				setState(257);
				stat();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(RBRACE);
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
	public static class NormalFunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleExprParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(SimpleExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleExprParser.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public NormalFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterNormalFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitNormalFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitNormalFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFunctionContext normalFunction() throws RecognitionException {
		NormalFunctionContext _localctx = new NormalFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_normalFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			type();
			setState(266);
			match(ID);
			setState(267);
			match(LPAREN);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35192223825920L) != 0)) {
				{
				setState(268);
				parameterList();
				}
			}

			setState(271);
			match(RPAREN);
			setState(272);
			match(LBRACE);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246298485723294L) != 0)) {
				{
				{
				setState(273);
				stat();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(RBRACE);
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
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			type();
			setState(282);
			match(ID);
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
		public TerminalNode VOID_KEYWORD() { return getToken(SimpleExprParser.VOID_KEYWORD, 0); }
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
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
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35192223825920L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SimpleExprParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SimpleExprParser.RBRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LBRACE);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246298485723294L) != 0)) {
				{
				{
				setState(287);
				stat();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(RBRACE);
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
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleExprParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			param();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				param();
				}
				}
				setState(302);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleExprParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			parameter();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(304);
				match(COMMA);
				setState(305);
				parameter();
				}
				}
				setState(310);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			type();
			setState(312);
			match(ID);
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimpleExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			type();
			setState(315);
			match(ID);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(316);
				match(ASSIGN);
				setState(317);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleExprParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SimpleExprParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SimpleExprParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleExprListener ) ((SimpleExprListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleExprVisitor ) return ((SimpleExprVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			type();
			setState(321);
			match(ID);
			setState(322);
			match(LPAREN);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35192223825920L) != 0)) {
				{
				setState(323);
				paramList();
				}
			}

			setState(326);
			match(RPAREN);
			setState(327);
			block();
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 3:
			return multiplyExpr_sempred((MultiplyExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplyExpr_sempred(MultiplyExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u014a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001Z\b\u0001\n\u0001\f\u0001]\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001e\b\u0001\n\u0001\f\u0001h\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001l\b\u0001\n\u0001\f\u0001o\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001t\b\u0001\n\u0001\f\u0001w\t\u0001\u0001\u0001"+
		"\u0003\u0001z\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0089\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u0094\b\u0002\n\u0002\f\u0002\u0097"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00a2\b\u0003\n"+
		"\u0003\f\u0003\u00a5\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ae\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00c8\b\u000b\n\u000b\f\u000b\u00cb"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00d9\b\u000b\n\u000b\f\u000b\u00dc\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00e0\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00ef\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00f5\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00fb\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0103\b\u0010\n\u0010\f\u0010\u0106\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u010e\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0113\b\u0011\n\u0011\f\u0011\u0116\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0121\b\u0014\n\u0014\f\u0014\u0124\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u012b\b\u0015"+
		"\n\u0015\f\u0015\u012e\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0133\b\u0016\n\u0016\f\u0016\u0136\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u013f\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0145\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0002"+
		"\u0004\u0006\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0002\u0002\u0000\u000e"+
		"\u0012\u0015\u0015\u0004\u0000\u001a\u001a\u001c\u001c\u001e --\u015a"+
		"\u00007\u0001\u0000\u0000\u0000\u0002\u0088\u0001\u0000\u0000\u0000\u0004"+
		"\u008a\u0001\u0000\u0000\u0000\u0006\u0098\u0001\u0000\u0000\u0000\b\u00ad"+
		"\u0001\u0000\u0000\u0000\n\u00af\u0001\u0000\u0000\u0000\f\u00b3\u0001"+
		"\u0000\u0000\u0000\u000e\u00b6\u0001\u0000\u0000\u0000\u0010\u00b9\u0001"+
		"\u0000\u0000\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00bf\u0001"+
		"\u0000\u0000\u0000\u0016\u00df\u0001\u0000\u0000\u0000\u0018\u00e1\u0001"+
		"\u0000\u0000\u0000\u001a\u00ee\u0001\u0000\u0000\u0000\u001c\u00f0\u0001"+
		"\u0000\u0000\u0000\u001e\u00fa\u0001\u0000\u0000\u0000 \u00fc\u0001\u0000"+
		"\u0000\u0000\"\u0109\u0001\u0000\u0000\u0000$\u0119\u0001\u0000\u0000"+
		"\u0000&\u011c\u0001\u0000\u0000\u0000(\u011e\u0001\u0000\u0000\u0000*"+
		"\u0127\u0001\u0000\u0000\u0000,\u012f\u0001\u0000\u0000\u0000.\u0137\u0001"+
		"\u0000\u0000\u00000\u013a\u0001\u0000\u0000\u00002\u0140\u0001\u0000\u0000"+
		"\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u000069\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0000\u0000\u0001"+
		";\u0001\u0001\u0000\u0000\u0000<=\u00032\u0019\u0000=>\u0005\u0006\u0000"+
		"\u0000>\u0089\u0001\u0000\u0000\u0000?@\u00030\u0018\u0000@A\u0005\u0006"+
		"\u0000\u0000A\u0089\u0001\u0000\u0000\u0000BC\u0003\n\u0005\u0000CD\u0005"+
		"\u0006\u0000\u0000D\u0089\u0001\u0000\u0000\u0000EF\u0003\f\u0006\u0000"+
		"FG\u0005\u0006\u0000\u0000G\u0089\u0001\u0000\u0000\u0000HI\u0003\u000e"+
		"\u0007\u0000IJ\u0005\u0006\u0000\u0000J\u0089\u0001\u0000\u0000\u0000"+
		"KL\u0003\u0010\b\u0000LM\u0005\u0006\u0000\u0000M\u0089\u0001\u0000\u0000"+
		"\u0000NO\u0003\u0012\t\u0000OP\u0005\u0006\u0000\u0000P\u0089\u0001\u0000"+
		"\u0000\u0000QR\u0003\u0004\u0002\u0000RS\u0005\u0006\u0000\u0000S\u0089"+
		"\u0001\u0000\u0000\u0000T\u0089\u0003\u001e\u000f\u0000UV\u0005\u0007"+
		"\u0000\u0000VW\u0003\u0014\n\u0000W[\u0005+\u0000\u0000XZ\u0003\u0002"+
		"\u0001\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^m\u0005,\u0000\u0000_`\u0005\u0013\u0000\u0000"+
		"`a\u0005\u0007\u0000\u0000ab\u0003\u0014\n\u0000bf\u0005+\u0000\u0000"+
		"ce\u0003\u0002\u0001\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005,\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000k_\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000ny\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pq\u0005\u0013\u0000\u0000qu\u0005+\u0000\u0000"+
		"rt\u0003\u0002\u0001\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u0005,\u0000\u0000yp\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0089\u0001\u0000\u0000\u0000"+
		"{\u0089\u0003\u0016\u000b\u0000|}\u0005\u0001\u0000\u0000}~\u0003\u0004"+
		"\u0002\u0000~\u007f\u0005\u0006\u0000\u0000\u007f\u0089\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081\u0082\u0003\u0004\u0002"+
		"\u0000\u0082\u0083\u0005\u0006\u0000\u0000\u0083\u0089\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005\u0016\u0000\u0000\u0085\u0086\u0003\u0004\u0002"+
		"\u0000\u0086\u0087\u0005\u0006\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088<\u0001\u0000\u0000\u0000\u0088?\u0001\u0000\u0000\u0000\u0088"+
		"B\u0001\u0000\u0000\u0000\u0088E\u0001\u0000\u0000\u0000\u0088H\u0001"+
		"\u0000\u0000\u0000\u0088K\u0001\u0000\u0000\u0000\u0088N\u0001\u0000\u0000"+
		"\u0000\u0088Q\u0001\u0000\u0000\u0000\u0088T\u0001\u0000\u0000\u0000\u0088"+
		"U\u0001\u0000\u0000\u0000\u0088{\u0001\u0000\u0000\u0000\u0088|\u0001"+
		"\u0000\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0084\u0001"+
		"\u0000\u0000\u0000\u0089\u0003\u0001\u0000\u0000\u0000\u008a\u008b\u0006"+
		"\u0002\uffff\uffff\u0000\u008b\u008c\u0003\u0006\u0003\u0000\u008c\u0095"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\n\u0003\u0000\u0000\u008e\u008f\u0005"+
		"\n\u0000\u0000\u008f\u0094\u0003\u0006\u0003\u0000\u0090\u0091\n\u0002"+
		"\u0000\u0000\u0091\u0092\u0005\u000b\u0000\u0000\u0092\u0094\u0003\u0006"+
		"\u0003\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0005\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0006\u0003"+
		"\uffff\uffff\u0000\u0099\u009a\u0003\b\u0004\u0000\u009a\u00a3\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\n\u0003\u0000\u0000\u009c\u009d\u0005\b\u0000"+
		"\u0000\u009d\u00a2\u0003\b\u0004\u0000\u009e\u009f\n\u0002\u0000\u0000"+
		"\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a2\u0003\b\u0004\u0000\u00a1"+
		"\u009b\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u0007\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00ae\u0005-\u0000\u0000\u00a7\u00ae"+
		"\u0005.\u0000\u0000\u00a8\u00ae\u0005/\u0000\u0000\u00a9\u00aa\u0005\f"+
		"\u0000\u0000\u00aa\u00ab\u0003\u0004\u0002\u0000\u00ab\u00ac\u0005\r\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a6\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ae\t\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005-\u0000\u0000\u00b0\u00b1\u0005\u0014\u0000\u0000\u00b1"+
		"\u00b2\u0003\u0004\u0002\u0000\u00b2\u000b\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005-\u0000\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000\u00b5\r"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005-\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0004\u0000\u0000\u00b8\u000f\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0003\u0000\u0000\u00ba\u00bb\u0005-\u0000\u0000\u00bb\u0011\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000\u0000\u00bd\u00be\u0005-\u0000"+
		"\u0000\u00be\u0013\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003\u0004\u0002"+
		"\u0000\u00c0\u00c1\u0007\u0000\u0000\u0000\u00c1\u00c2\u0003\u0004\u0002"+
		"\u0000\u00c2\u0015\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0018\u0000"+
		"\u0000\u00c4\u00c5\u0003\u0004\u0002\u0000\u00c5\u00c9\u0005+\u0000\u0000"+
		"\u00c6\u00c8\u0003\u0002\u0001\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005,\u0000\u0000\u00cd"+
		"\u00e0\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0017\u0000\u0000\u00cf"+
		"\u00d0\u0005\f\u0000\u0000\u00d0\u00d1\u0003\u0018\f\u0000\u00d1\u00d2"+
		"\u0005\u0006\u0000\u0000\u00d2\u00d3\u0003\u0014\n\u0000\u00d3\u00d4\u0005"+
		"\u0006\u0000\u0000\u00d4\u00d5\u0003\u001a\r\u0000\u00d5\u00d6\u0005\r"+
		"\u0000\u0000\u00d6\u00da\u0005+\u0000\u0000\u00d7\u00d9\u0003\u0002\u0001"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005,\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000"+
		"\u00df\u00c3\u0001\u0000\u0000\u0000\u00df\u00ce\u0001\u0000\u0000\u0000"+
		"\u00e0\u0017\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u001c\u000e\u0000"+
		"\u00e2\u0019\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005-\u0000\u0000\u00e4"+
		"\u00e5\u0005\u0014\u0000\u0000\u00e5\u00ef\u0003\u0004\u0002\u0000\u00e6"+
		"\u00e7\u0005-\u0000\u0000\u00e7\u00ef\u0005\u0003\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0003\u0000\u0000\u00e9\u00ef\u0005-\u0000\u0000\u00ea\u00eb\u0005"+
		"-\u0000\u0000\u00eb\u00ef\u0005\u0004\u0000\u0000\u00ec\u00ed\u0005\u0004"+
		"\u0000\u0000\u00ed\u00ef\u0005-\u0000\u0000\u00ee\u00e3\u0001\u0000\u0000"+
		"\u0000\u00ee\u00e6\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ef\u001b\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003&\u0013\u0000"+
		"\u00f1\u00f4\u0005-\u0000\u0000\u00f2\u00f3\u0005\u0014\u0000\u0000\u00f3"+
		"\u00f5\u0003\u0004\u0002\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005\u0006\u0000\u0000\u00f7\u001d\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fb\u0003 \u0010\u0000\u00f9\u00fb\u0003\"\u0011\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u001f"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u001a\u0000\u0000\u00fd\u00fe"+
		"\u0005\u0005\u0000\u0000\u00fe\u00ff\u0005\f\u0000\u0000\u00ff\u0100\u0005"+
		"\r\u0000\u0000\u0100\u0104\u0005+\u0000\u0000\u0101\u0103\u0003\u0002"+
		"\u0001\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005,\u0000\u0000\u0108!\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0003&\u0013\u0000\u010a\u010b\u0005-\u0000\u0000\u010b\u010d"+
		"\u0005\f\u0000\u0000\u010c\u010e\u0003,\u0016\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\r\u0000\u0000\u0110\u0114\u0005+"+
		"\u0000\u0000\u0111\u0113\u0003\u0002\u0001\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0005,\u0000"+
		"\u0000\u0118#\u0001\u0000\u0000\u0000\u0119\u011a\u0003&\u0013\u0000\u011a"+
		"\u011b\u0005-\u0000\u0000\u011b%\u0001\u0000\u0000\u0000\u011c\u011d\u0007"+
		"\u0001\u0000\u0000\u011d\'\u0001\u0000\u0000\u0000\u011e\u0122\u0005+"+
		"\u0000\u0000\u011f\u0121\u0003\u0002\u0001\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0005,\u0000"+
		"\u0000\u0126)\u0001\u0000\u0000\u0000\u0127\u012c\u0003.\u0017\u0000\u0128"+
		"\u0129\u0005*\u0000\u0000\u0129\u012b\u0003.\u0017\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d+\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0134\u0003$\u0012"+
		"\u0000\u0130\u0131\u0005*\u0000\u0000\u0131\u0133\u0003$\u0012\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"-\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0003&\u0013\u0000\u0138\u0139\u0005-\u0000\u0000\u0139/\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0003&\u0013\u0000\u013b\u013e\u0005-\u0000\u0000"+
		"\u013c\u013d\u0005\u0014\u0000\u0000\u013d\u013f\u0003\u0004\u0002\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000"+
		"\u013f1\u0001\u0000\u0000\u0000\u0140\u0141\u0003&\u0013\u0000\u0141\u0142"+
		"\u0005-\u0000\u0000\u0142\u0144\u0005\f\u0000\u0000\u0143\u0145\u0003"+
		"*\u0015\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0005\r\u0000"+
		"\u0000\u0147\u0148\u0003(\u0014\u0000\u01483\u0001\u0000\u0000\u0000\u001a"+
		"7[fmuy\u0088\u0093\u0095\u00a1\u00a3\u00ad\u00c9\u00da\u00df\u00ee\u00f4"+
		"\u00fa\u0104\u010d\u0114\u0122\u012c\u0134\u013e\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}