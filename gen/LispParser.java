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
		WS=1, COMMENT=2, BLOCK_COMMENT=3, MULTI_LINE_COMMENT=4, SPECIAL_VARIABLE=5, 
		COMMA=6, SEMI_COLON=7, COLON=8, DOT=9, QUESTION_MARK=10, HASH_TAG=11, 
		NUMBER=12, INTEGER=13, FLOAT=14, SCIENTIFIC=15, COMPLEX=16, CONSTANT=17, 
		NULL=18, EQUALS=19, ASSING=20, NOT_EQUALS=21, IDENTITY_EQUALS=22, IDENTITY_NOT_EQUALS=23, 
		LESS_THAN=24, GREATER_THAN=25, LESS_THAN_EQUALS=26, GREATER_THAN_EQUALS=27, 
		OPEN_BRACE=28, CLOSE_BRACE=29, OPEN_BRACKET=30, CLOSE_BRACKET=31, OPEN_PAREN=32, 
		CLOSE_PAREN=33, LOOP=34, DOLIST=35, DOTIMES=36, TO=37, DO=38, DO_STAR=39, 
		WHILE=40, CONST=41, VAR=42, IMPORT=43, EXPORT=44, PRINT=45, FORMAT=46, 
		PLUS=47, MINUS=48, MULTIPLY=49, DIV=50, MODULUS=51, FLOOR=52, CEILING=53, 
		MOD=54, SIN=55, COS=56, TAN=57, SQRT=58, EXP=59, EXPT=60, CONS=61, CAR=62, 
		CDR=63, BIT_AND=64, BIT_XOR=65, BIT_OR=66, SETQ=67, SETF=68, PUSH=69, 
		POP=70, DEFVAR=71, DEFPARAMETER=72, DEFCONSTANT=73, DEFUN=74, DEFMARCO=75, 
		DEFSTRUCT=76, MAKE=77, LET=78, LET_STAR=79, LETR=80, QUOTE=81, MAKE_ARRAY=82, 
		AREF=83, T=84, NIL=85, IF=86, WHEN=87, UNLESS=88, COND=89, CASE=90, AND=91, 
		OR=92, NOT=93, RETURN=94, RETURN_FROM=95, ERROR=96, BLOCK=97, FUNCTION=98, 
		APPLY=99, FUNCALL=100, MAPCAR=101, LAMBDA=102, SORT=103, EQ=104, EQUAL=105, 
		EQL=106, APPEND=107, REVERSE=108, MEMBER=109, FIND=110, SUBSETP=111, INTERSECTION=112, 
		UNION=113, SETDIFFERENCE=114, LIST=115, REST=116, KEY=117, STRING=118, 
		FORMAT_STRING=119, DIRECTIVE_NEWLINE=120, DIRECTIVE_TAB=121, DIRECTIVE_LITERAL=122, 
		DIRECTIVE_DECIMAL=123, DIRECTIVE_STRING=124, DIRECTIVE_FLOAT=125, DIRECTIVE_EXPONENT=126, 
		DIRECTIVE_PERCENT=127, DIRECTIVE=128, IDENTIFIER=129;
	public static final int
		RULE_program = 0, RULE_temporary_assigment = 1, RULE_setq = 2, RULE_let = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "temporary_assigment", "setq", "let"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "','", "';'", "':'", "'.'", "'?'", 
			"'#'", null, null, null, null, null, null, null, "'=='", "'='", "'!='", 
			"'==='", "'!=='", "'<'", "'>'", "'<='", "'>='", "'{'", "'}'", "'['", 
			"']'", "'('", "')'", "'loop'", "'dolist'", "'dotimes'", "'to'", "'do'", 
			"'do*'", "'while'", "'const'", "'var'", "'import'", "'export'", "'print'", 
			"'format'", "'+'", "'-'", "'*'", "'/'", "'%'", "'floor'", "'ceiling'", 
			"'mod'", "'sin'", "'cos'", "'tan'", "'sqrt'", "'exp'", "'expt'", "'cons'", 
			"'car'", "'cdr'", "'&'", "'^'", "'|'", "'setq'", "'setf'", "'push'", 
			"'pop'", "'defvar'", "'defparameter'", "'defconstant'", "'defun'", "'defmarco'", 
			"'defstruct'", "'make-'", "'let'", "'let*'", "'letrec'", "'quote'", "'make-array'", 
			"'aref'", "'t'", "'nil'", "'if'", "'when'", "'unless'", "'cond'", "'case'", 
			null, null, null, "'return'", "'return-from'", "'error'", "'block'", 
			"'function'", "'apply'", "'funcall'", "'mapcar'", "'lambda'", "'sort'", 
			"'eq'", "'equal'", "'eql'", "'append'", "'reverse'", "'member'", "'find'", 
			"'subsetp'", "'intersection'", "'union'", "'set-difference'", "'list'", 
			"'&rest'", "'&key'", null, null, "'~%'", "'~T'", "'~~'", "'~D'", "'~A'", 
			"'~F'", "'~E'", "'~S'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "BLOCK_COMMENT", "MULTI_LINE_COMMENT", "SPECIAL_VARIABLE", 
			"COMMA", "SEMI_COLON", "COLON", "DOT", "QUESTION_MARK", "HASH_TAG", "NUMBER", 
			"INTEGER", "FLOAT", "SCIENTIFIC", "COMPLEX", "CONSTANT", "NULL", "EQUALS", 
			"ASSING", "NOT_EQUALS", "IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", "LESS_THAN", 
			"GREATER_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", "OPEN_BRACE", 
			"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAREN", "CLOSE_PAREN", 
			"LOOP", "DOLIST", "DOTIMES", "TO", "DO", "DO_STAR", "WHILE", "CONST", 
			"VAR", "IMPORT", "EXPORT", "PRINT", "FORMAT", "PLUS", "MINUS", "MULTIPLY", 
			"DIV", "MODULUS", "FLOOR", "CEILING", "MOD", "SIN", "COS", "TAN", "SQRT", 
			"EXP", "EXPT", "CONS", "CAR", "CDR", "BIT_AND", "BIT_XOR", "BIT_OR", 
			"SETQ", "SETF", "PUSH", "POP", "DEFVAR", "DEFPARAMETER", "DEFCONSTANT", 
			"DEFUN", "DEFMARCO", "DEFSTRUCT", "MAKE", "LET", "LET_STAR", "LETR", 
			"QUOTE", "MAKE_ARRAY", "AREF", "T", "NIL", "IF", "WHEN", "UNLESS", "COND", 
			"CASE", "AND", "OR", "NOT", "RETURN", "RETURN_FROM", "ERROR", "BLOCK", 
			"FUNCTION", "APPLY", "FUNCALL", "MAPCAR", "LAMBDA", "SORT", "EQ", "EQUAL", 
			"EQL", "APPEND", "REVERSE", "MEMBER", "FIND", "SUBSETP", "INTERSECTION", 
			"UNION", "SETDIFFERENCE", "LIST", "REST", "KEY", "STRING", "FORMAT_STRING", 
			"DIRECTIVE_NEWLINE", "DIRECTIVE_TAB", "DIRECTIVE_LITERAL", "DIRECTIVE_DECIMAL", 
			"DIRECTIVE_STRING", "DIRECTIVE_FLOAT", "DIRECTIVE_EXPONENT", "DIRECTIVE_PERCENT", 
			"DIRECTIVE", "IDENTIFIER"
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
		public List<Temporary_assigmentContext> temporary_assigment() {
			return getRuleContexts(Temporary_assigmentContext.class);
		}
		public Temporary_assigmentContext temporary_assigment(int i) {
			return getRuleContext(Temporary_assigmentContext.class,i);
		}
		public List<LetContext> let() {
			return getRuleContexts(LetContext.class);
		}
		public LetContext let(int i) {
			return getRuleContext(LetContext.class,i);
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
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAREN) {
					{
					setState(11);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(8);
						setq();
						}
						break;
					case 2:
						{
						setState(9);
						temporary_assigment();
						}
						break;
					case 3:
						{
						setState(10);
						let();
						}
						break;
					}
					}
					setState(15);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
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
	public static class Temporary_assigmentContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(LispParser.OPEN_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(LispParser.NUMBER, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(LispParser.CLOSE_PAREN, 0); }
		public Temporary_assigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporary_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).enterTemporary_assigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LispParserListener ) ((LispParserListener)listener).exitTemporary_assigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LispParserVisitor ) return ((LispParserVisitor<? extends T>)visitor).visitTemporary_assigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temporary_assigmentContext temporary_assigment() throws RecognitionException {
		Temporary_assigmentContext _localctx = new Temporary_assigmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_temporary_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(OPEN_PAREN);
			setState(20);
			match(IDENTIFIER);
			setState(21);
			match(NUMBER);
			setState(22);
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
		enterRule(_localctx, 4, RULE_setq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(OPEN_PAREN);
			setState(25);
			match(SETQ);
			setState(26);
			match(IDENTIFIER);
			setState(27);
			match(NUMBER);
			setState(28);
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
		public TerminalNode OPEN_PAREN() { return getToken(LispParser.OPEN_PAREN, 0); }
		public TerminalNode LET() { return getToken(LispParser.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(LispParser.NUMBER, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(LispParser.CLOSE_PAREN, 0); }
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
		enterRule(_localctx, 6, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(OPEN_PAREN);
			setState(31);
			match(LET);
			setState(32);
			match(IDENTIFIER);
			setState(33);
			match(NUMBER);
			setState(34);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0081%\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0003\u0000\u0012\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0000$\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000"+
		"\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006\u001e\u0001\u0000\u0000"+
		"\u0000\b\f\u0003\u0004\u0002\u0000\t\f\u0003\u0002\u0001\u0000\n\f\u0003"+
		"\u0006\u0003\u0000\u000b\b\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000"+
		"\u0000\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000"+
		"\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000"+
		"\u000e\u0012\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010"+
		"\u0012\u0005\u0000\u0000\u0001\u0011\r\u0001\u0000\u0000\u0000\u0011\u0010"+
		"\u0001\u0000\u0000\u0000\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005 \u0000\u0000\u0014\u0015\u0005\u0081\u0000\u0000\u0015\u0016\u0005"+
		"\f\u0000\u0000\u0016\u0017\u0005!\u0000\u0000\u0017\u0003\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005 \u0000\u0000\u0019\u001a\u0005C\u0000\u0000"+
		"\u001a\u001b\u0005\u0081\u0000\u0000\u001b\u001c\u0005\f\u0000\u0000\u001c"+
		"\u001d\u0005!\u0000\u0000\u001d\u0005\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005 \u0000\u0000\u001f \u0005N\u0000\u0000 !\u0005\u0081\u0000\u0000"+
		"!\"\u0005\f\u0000\u0000\"#\u0005!\u0000\u0000#\u0007\u0001\u0000\u0000"+
		"\u0000\u0003\u000b\r\u0011";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}