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
		OPEN_PAREN=1, SETQ=2, IDENTIFIER=3, NUMEBER=4, CLOSE_PAREN=5, NUMBER=6, 
		SYMBOL=7;
	public static final int
		RULE_setq = 0, RULE_list = 1, RULE_expression = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"setq", "list", "expression"
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
			null, "OPEN_PAREN", "SETQ", "IDENTIFIER", "NUMEBER", "CLOSE_PAREN", "NUMBER", 
			"SYMBOL"
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
	public static class SetqContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(LispParser.OPEN_PAREN, 0); }
		public TerminalNode SETQ() { return getToken(LispParser.SETQ, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public TerminalNode NUMEBER() { return getToken(LispParser.NUMEBER, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(LispParser.CLOSE_PAREN, 0); }
		public TerminalNode EOF() { return getToken(LispParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_setq);
		try {
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(OPEN_PAREN);
				setState(7);
				match(SETQ);
				setState(8);
				match(IDENTIFIER);
				setState(9);
				match(NUMEBER);
				setState(10);
				match(CLOSE_PAREN);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(EOF);
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
		enterRule(_localctx, 2, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(OPEN_PAREN);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 194L) != 0)) {
				{
				{
				setState(15);
				expression();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
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
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				list();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(NUMBER);
				}
				break;
			case SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
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
		"\u0004\u0001\u0007\u001d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0011\b\u0001\n\u0001\f\u0001\u0014\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001b\b\u0002\u0001"+
		"\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0000\u001d\u0000\f\u0001"+
		"\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u001a\u0001"+
		"\u0000\u0000\u0000\u0006\u0007\u0005\u0001\u0000\u0000\u0007\b\u0005\u0002"+
		"\u0000\u0000\b\t\u0005\u0003\u0000\u0000\t\n\u0005\u0004\u0000\u0000\n"+
		"\r\u0005\u0005\u0000\u0000\u000b\r\u0005\u0000\u0000\u0001\f\u0006\u0001"+
		"\u0000\u0000\u0000\f\u000b\u0001\u0000\u0000\u0000\r\u0001\u0001\u0000"+
		"\u0000\u0000\u000e\u0012\u0005\u0001\u0000\u0000\u000f\u0011\u0003\u0004"+
		"\u0002\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0014\u0001\u0000"+
		"\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0015\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0005\u0005\u0000\u0000\u0016\u0003\u0001\u0000"+
		"\u0000\u0000\u0017\u001b\u0003\u0002\u0001\u0000\u0018\u001b\u0005\u0006"+
		"\u0000\u0000\u0019\u001b\u0005\u0007\u0000\u0000\u001a\u0017\u0001\u0000"+
		"\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001b\u0005\u0001\u0000\u0000\u0000\u0003\f\u0012\u001a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}