// Generated from C:/Users/Masa/Downloads/spring-security-test/compiler/src/LispParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_PAREN=1, SETQ=2, IDENTIFIER=3, NUMBER=4, CLOSE_PAREN=5, LET=6, NUMEBER=7, 
		SYMBOL=8;
	public static final int
		RULE_program = 0, RULE_setq = 1, RULE_let = 2, RULE_list = 3, RULE_expression = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "setq", "let", "list", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_PAREN", "SETQ", "IDENTIFIER", "NUMBER", "CLOSE_PAREN", "LET", 
			"NUMEBER", "SYMBOL"
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
	public String getGrammarFileName() { return "LispParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<SetqContext> setq() {
			return getRuleContexts(SetqContext.class);
		}
		public SetqContext setq(int i) {
			return getRuleContext(SetqContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode EOF() { return getToken(LispParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAREN) {
					{
					setState(12);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(10);
						setq();
						}
						break;
					case 2:
						{
						setState(11);
						list();
						}
						break;
					}
					}
					setState(16);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(EOF);
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
	public static class SetqContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(LispParser.OPEN_PAREN, 0); }
		public TerminalNode SETQ() { return getToken(LispParser.SETQ, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(LispParser.NUMBER, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(LispParser.CLOSE_PAREN, 0); }
		public SetqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterSetq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitSetq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitSetq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetqContext setq() throws RecognitionException {
		SetqContext _localctx = new SetqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(OPEN_PAREN);
			setState(21);
			match(SETQ);
			setState(22);
			match(IDENTIFIER);
			setState(23);
			match(NUMBER);
			setState(24);
			match(CLOSE_PAREN);
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
	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(LispParser.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public TerminalNode NUMEBER() { return getToken(LispParser.NUMEBER, 0); }
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(LET);
			setState(27);
			match(IDENTIFIER);
			setState(28);
			match(NUMEBER);
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(LispParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(LispParser.CLOSE_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(OPEN_PAREN);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274L) != 0)) {
				{
				{
				setState(31);
				expression();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(CLOSE_PAREN);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(LispParser.NUMBER, 0); }
		public TerminalNode SYMBOL() { return getToken(LispParser.SYMBOL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				list();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(NUMBER);
				}
				break;
			case SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(SYMBOL);
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

	public static final String _serializedATN =
		"\u0004\u0001\b-\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\r\b\u0000\n\u0000\f\u0000\u0010\t\u0000"+
		"\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003!\b\u0003\n\u0003\f\u0003"+
		"$\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004+\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004"+
		"\u0006\b\u0000\u0000-\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0014"+
		"\u0001\u0000\u0000\u0000\u0004\u001a\u0001\u0000\u0000\u0000\u0006\u001e"+
		"\u0001\u0000\u0000\u0000\b*\u0001\u0000\u0000\u0000\n\r\u0003\u0002\u0001"+
		"\u0000\u000b\r\u0003\u0006\u0003\u0000\f\n\u0001\u0000\u0000\u0000\f\u000b"+
		"\u0001\u0000\u0000\u0000\r\u0010\u0001\u0000\u0000\u0000\u000e\f\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0013\u0001"+
		"\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0013\u0005"+
		"\u0000\u0000\u0001\u0012\u000e\u0001\u0000\u0000\u0000\u0012\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0005"+
		"\u0001\u0000\u0000\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0005"+
		"\u0003\u0000\u0000\u0017\u0018\u0005\u0004\u0000\u0000\u0018\u0019\u0005"+
		"\u0005\u0000\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0006\u0000\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c\u001d\u0005"+
		"\u0007\u0000\u0000\u001d\u0005\u0001\u0000\u0000\u0000\u001e\"\u0005\u0001"+
		"\u0000\u0000\u001f!\u0003\b\u0004\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#%\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0005\u0005"+
		"\u0000\u0000&\u0007\u0001\u0000\u0000\u0000\'+\u0003\u0006\u0003\u0000"+
		"(+\u0005\u0004\u0000\u0000)+\u0005\b\u0000\u0000*\'\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\t\u0001\u0000"+
		"\u0000\u0000\u0005\f\u000e\u0012\"*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}