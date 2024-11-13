// Generated from First.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class First extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, DEF=3, IF=4, LAMBDA=5, QUOTE=6, LOOP_FOR=7, DO=8, 
		SYMBOL=9, ID=10, NUMBER=11, STRING=12, COMMENT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAREN", "RPAREN", "DEF", "IF", "LAMBDA", "QUOTE", "LOOP_FOR", "DO", 
			"SYMBOL", "ID", "NUMBER", "STRING", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'def'", "'if'", "'lambda'", "'quote'", "'loop for'", 
			"'do'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "DEF", "IF", "LAMBDA", "QUOTE", "LOOP_FOR", 
			"DO", "SYMBOL", "ID", "NUMBER", "STRING", "COMMENT", "WS"
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


	public First(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "First.g4"; }

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
		"\u0004\u0000\u000ep\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0005\tF\b\t\n\t\f\tI\t\t\u0001\n\u0004\nL\b\n\u000b\n\f\nM\u0001\n"+
		"\u0001\n\u0004\nR\b\n\u000b\n\f\nS\u0003\nV\b\n\u0001\u000b\u0001\u000b"+
		"\u0005\u000bZ\b\u000b\n\u000b\f\u000b]\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0005\fc\b\f\n\f\f\ff\t\f\u0001\f\u0001\f\u0001\r\u0004"+
		"\rk\b\r\u000b\r\f\rl\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0007\u0004"+
		"\u0000*+--//<?\u0003\u0000AZ__az\u0005\u000009??AZ__az\u0001\u000009\u0001"+
		"\u0000\"\"\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  v\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000"+
		"\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000"+
		"\u0007%\u0001\u0000\u0000\u0000\t(\u0001\u0000\u0000\u0000\u000b/\u0001"+
		"\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000"+
		"\u0000\u0011A\u0001\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000\u0015"+
		"K\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019`\u0001"+
		"\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001d\u001e\u0005(\u0000"+
		"\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005)\u0000\u0000 "+
		"\u0004\u0001\u0000\u0000\u0000!\"\u0005d\u0000\u0000\"#\u0005e\u0000\u0000"+
		"#$\u0005f\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005i\u0000\u0000"+
		"&\'\u0005f\u0000\u0000\'\b\u0001\u0000\u0000\u0000()\u0005l\u0000\u0000"+
		")*\u0005a\u0000\u0000*+\u0005m\u0000\u0000+,\u0005b\u0000\u0000,-\u0005"+
		"d\u0000\u0000-.\u0005a\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005"+
		"q\u0000\u000001\u0005u\u0000\u000012\u0005o\u0000\u000023\u0005t\u0000"+
		"\u000034\u0005e\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005l\u0000"+
		"\u000067\u0005o\u0000\u000078\u0005o\u0000\u000089\u0005p\u0000\u0000"+
		"9:\u0005 \u0000\u0000:;\u0005f\u0000\u0000;<\u0005o\u0000\u0000<=\u0005"+
		"r\u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005d\u0000\u0000?@\u0005"+
		"o\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AB\u0007\u0000\u0000\u0000"+
		"B\u0012\u0001\u0000\u0000\u0000CG\u0007\u0001\u0000\u0000DF\u0007\u0002"+
		"\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0014\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JL\u0007\u0003\u0000\u0000KJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NU\u0001\u0000\u0000\u0000OQ\u0005.\u0000\u0000PR\u0007"+
		"\u0003\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000"+
		"\u0000UO\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0016\u0001"+
		"\u0000\u0000\u0000W[\u0005\"\u0000\u0000XZ\b\u0004\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^_\u0005\"\u0000\u0000_\u0018\u0001\u0000\u0000\u0000`d\u0005;\u0000"+
		"\u0000ac\b\u0005\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0006\f\u0000\u0000h\u001a\u0001"+
		"\u0000\u0000\u0000ik\u0007\u0006\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0006\r\u0000\u0000o\u001c\u0001\u0000"+
		"\u0000\u0000\b\u0000GMSU[dl\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}