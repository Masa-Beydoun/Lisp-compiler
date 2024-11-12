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
		LPAREN=1, RPAREN=2, LBRACK=3, RBRACK=4, LBRACE=5, RBRACE=6, DEF=7, IF=8, 
		LAMBDA=9, QUOTE=10, BEGIN=11, ID=12, NUMBER=13, STRING=14, COMMENT=15, 
		WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "DEF", "IF", 
			"LAMBDA", "QUOTE", "BEGIN", "ID", "NUMBER", "STRING", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'def'", "'if'", "'lambda'", 
			"'quote'", "'begin'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "DEF", 
			"IF", "LAMBDA", "QUOTE", "BEGIN", "ID", "NUMBER", "STRING", "COMMENT", 
			"WS"
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
		"\u0004\u0000\u0010t\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000bJ\b\u000b\n\u000b\f\u000bM\t\u000b\u0001\f\u0004\fP\b\f\u000b\f"+
		"\f\fQ\u0001\f\u0001\f\u0004\fV\b\f\u000b\f\f\fW\u0003\fZ\b\f\u0001\r\u0001"+
		"\r\u0005\r^\b\r\n\r\f\ra\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005"+
		"\u000eg\b\u000e\n\u000e\f\u000ej\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0004\u000fo\b\u000f\u000b\u000f\f\u000fp\u0001\u000f\u0001\u000f"+
		"\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0006\u0003\u0000A"+
		"Z__az\u0005\u0000*9??AZ__az\u0001\u000009\u0001\u0000\"\"\u0002\u0000"+
		"\n\n\r\r\u0003\u0000\t\n\r\r  z\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000"+
		"\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000"+
		"\t)\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000\u0000\r-\u0001\u0000"+
		"\u0000\u0000\u000f1\u0001\u0000\u0000\u0000\u00114\u0001\u0000\u0000\u0000"+
		"\u0013;\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017G"+
		"\u0001\u0000\u0000\u0000\u0019O\u0001\u0000\u0000\u0000\u001b[\u0001\u0000"+
		"\u0000\u0000\u001dd\u0001\u0000\u0000\u0000\u001fn\u0001\u0000\u0000\u0000"+
		"!\"\u0005(\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005)\u0000"+
		"\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005[\u0000\u0000&\u0006\u0001"+
		"\u0000\u0000\u0000\'(\u0005]\u0000\u0000(\b\u0001\u0000\u0000\u0000)*"+
		"\u0005{\u0000\u0000*\n\u0001\u0000\u0000\u0000+,\u0005}\u0000\u0000,\f"+
		"\u0001\u0000\u0000\u0000-.\u0005d\u0000\u0000./\u0005e\u0000\u0000/0\u0005"+
		"f\u0000\u00000\u000e\u0001\u0000\u0000\u000012\u0005i\u0000\u000023\u0005"+
		"f\u0000\u00003\u0010\u0001\u0000\u0000\u000045\u0005l\u0000\u000056\u0005"+
		"a\u0000\u000067\u0005m\u0000\u000078\u0005b\u0000\u000089\u0005d\u0000"+
		"\u00009:\u0005a\u0000\u0000:\u0012\u0001\u0000\u0000\u0000;<\u0005q\u0000"+
		"\u0000<=\u0005u\u0000\u0000=>\u0005o\u0000\u0000>?\u0005t\u0000\u0000"+
		"?@\u0005e\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AB\u0005b\u0000\u0000"+
		"BC\u0005e\u0000\u0000CD\u0005g\u0000\u0000DE\u0005i\u0000\u0000EF\u0005"+
		"n\u0000\u0000F\u0016\u0001\u0000\u0000\u0000GK\u0007\u0000\u0000\u0000"+
		"HJ\u0007\u0001\u0000\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0018\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0007\u0002\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RY\u0001\u0000\u0000\u0000SU\u0005.\u0000"+
		"\u0000TV\u0007\u0002\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001"+
		"\u0000\u0000\u0000YS\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u001a\u0001\u0000\u0000\u0000[_\u0005\"\u0000\u0000\\^\b\u0003\u0000"+
		"\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000bc\u0005\"\u0000\u0000c\u001c\u0001\u0000\u0000\u0000"+
		"dh\u0005;\u0000\u0000eg\b\u0004\u0000\u0000fe\u0001\u0000\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0006\u000e"+
		"\u0000\u0000l\u001e\u0001\u0000\u0000\u0000mo\u0007\u0005\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u000f"+
		"\u0000\u0000s \u0001\u0000\u0000\u0000\b\u0000KQWY_hp\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}