// Generated from C:/Users/11388/IdeaProjects/demo/src/main/java/ANTLR\SimpleExprRules.g4 by ANTLR 4.12.0
package ANTLR_code;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleExprRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, IF=2, MUL=3, DIV=4, ADD=5, MINUS=6, LPAREN=7, RPAREN=8, BIGGER=9, 
		SMALLER=10, BIGGER_EQUAL=11, SMALLER_EQUAL=12, EQUAL=13, ELSE=14, ASSIGN=15, 
		NOT_EQUAL=16, RETURN=17, FOR=18, WHILE=19, BREAK=20, INT_KEYWORD=21, DOUBLE_KEYWORD=22, 
		FLOAT_KEYWORD=23, CHAR_KEYWORD=24, VOID_KEYWORD=25, STRING_KEYWORD=26, 
		BOOL_KEYWORD=27, TRUE_KEYWORD=28, FALSE_KEYWORD=29, CLASS_KEYWORD=30, 
		THIS_KEYWORD=31, NEW_KEYWORD=32, NULL_KEYWORD=33, PUBLIC_KEYWORD=34, PRIVATE_KEYWORD=35, 
		PROTECTED_KEYWORD=36, ID=37, INT=38, FLOAT=39, WS=40, Sl_COMMENT=41, DOC_COMMENT=42, 
		ML_COMMENT=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMI", "IF", "MUL", "DIV", "ADD", "MINUS", "LPAREN", "RPAREN", "BIGGER", 
			"SMALLER", "BIGGER_EQUAL", "SMALLER_EQUAL", "EQUAL", "ELSE", "ASSIGN", 
			"NOT_EQUAL", "RETURN", "FOR", "WHILE", "BREAK", "INT_KEYWORD", "DOUBLE_KEYWORD", 
			"FLOAT_KEYWORD", "CHAR_KEYWORD", "VOID_KEYWORD", "STRING_KEYWORD", "BOOL_KEYWORD", 
			"TRUE_KEYWORD", "FALSE_KEYWORD", "CLASS_KEYWORD", "THIS_KEYWORD", "NEW_KEYWORD", 
			"NULL_KEYWORD", "PUBLIC_KEYWORD", "PRIVATE_KEYWORD", "PROTECTED_KEYWORD", 
			"ID", "INT", "FLOAT", "WS", "Sl_COMMENT", "DOC_COMMENT", "ML_COMMENT", 
			"DIGIT", "LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'>'", 
			"'<'", "'>='", "'<='", "'=='", "'else'", "'='", "'!='", "'return'", "'for'", 
			"'while'", "'break'", "'int'", "'double'", "'float'", "'char'", "'void'", 
			"'string'", "'bool'", "'true'", "'false'", "'class'", "'this'", "'new'", 
			"'null'", "'public'", "'private'", "'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMI", "IF", "MUL", "DIV", "ADD", "MINUS", "LPAREN", "RPAREN", 
			"BIGGER", "SMALLER", "BIGGER_EQUAL", "SMALLER_EQUAL", "EQUAL", "ELSE", 
			"ASSIGN", "NOT_EQUAL", "RETURN", "FOR", "WHILE", "BREAK", "INT_KEYWORD", 
			"DOUBLE_KEYWORD", "FLOAT_KEYWORD", "CHAR_KEYWORD", "VOID_KEYWORD", "STRING_KEYWORD", 
			"BOOL_KEYWORD", "TRUE_KEYWORD", "FALSE_KEYWORD", "CLASS_KEYWORD", "THIS_KEYWORD", 
			"NEW_KEYWORD", "NULL_KEYWORD", "PUBLIC_KEYWORD", "PRIVATE_KEYWORD", "PROTECTED_KEYWORD", 
			"ID", "INT", "FLOAT", "WS", "Sl_COMMENT", "DOC_COMMENT", "ML_COMMENT"
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


	public SimpleExprRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleExprRules.g4"; }

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
		"\u0004\u0000+\u0152\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0003$\u00fc\b$\u0001$\u0001$\u0001$\u0005$\u0101\b$\n$\f$\u0104\t$"+
		"\u0001%\u0001%\u0001%\u0005%\u0109\b%\n%\f%\u010c\t%\u0003%\u010e\b%\u0001"+
		"&\u0001&\u0001&\u0005&\u0113\b&\n&\f&\u0116\t&\u0001&\u0001&\u0004&\u011a"+
		"\b&\u000b&\f&\u011b\u0003&\u011e\b&\u0001\'\u0004\'\u0121\b\'\u000b\'"+
		"\f\'\u0122\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0005(\u012b\b"+
		"(\n(\f(\u012e\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u0137\b)\n)\f)\u013a\t)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u0145\b*\n*\f*\u0148\t*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001,\u0001,\u0002\u0138\u0146\u0000-\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O("+
		"Q)S*U+W\u0000Y\u0000\u0001\u0000\u0005\u0001\u000019\u0003\u0000\t\n\r"+
		"\r  \u0002\u0000\n\n\r\r\u0001\u000009\u0003\u0000AZ__az\u015c\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001"+
		"\u0000\u0000\u0000\u0001[\u0001\u0000\u0000\u0000\u0003]\u0001\u0000\u0000"+
		"\u0000\u0005`\u0001\u0000\u0000\u0000\u0007b\u0001\u0000\u0000\u0000\t"+
		"d\u0001\u0000\u0000\u0000\u000bf\u0001\u0000\u0000\u0000\rh\u0001\u0000"+
		"\u0000\u0000\u000fj\u0001\u0000\u0000\u0000\u0011l\u0001\u0000\u0000\u0000"+
		"\u0013n\u0001\u0000\u0000\u0000\u0015p\u0001\u0000\u0000\u0000\u0017s"+
		"\u0001\u0000\u0000\u0000\u0019v\u0001\u0000\u0000\u0000\u001by\u0001\u0000"+
		"\u0000\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u0080\u0001\u0000\u0000"+
		"\u0000!\u0083\u0001\u0000\u0000\u0000#\u008a\u0001\u0000\u0000\u0000%"+
		"\u008e\u0001\u0000\u0000\u0000\'\u0094\u0001\u0000\u0000\u0000)\u009a"+
		"\u0001\u0000\u0000\u0000+\u009e\u0001\u0000\u0000\u0000-\u00a5\u0001\u0000"+
		"\u0000\u0000/\u00ab\u0001\u0000\u0000\u00001\u00b0\u0001\u0000\u0000\u0000"+
		"3\u00b5\u0001\u0000\u0000\u00005\u00bc\u0001\u0000\u0000\u00007\u00c1"+
		"\u0001\u0000\u0000\u00009\u00c6\u0001\u0000\u0000\u0000;\u00cc\u0001\u0000"+
		"\u0000\u0000=\u00d2\u0001\u0000\u0000\u0000?\u00d7\u0001\u0000\u0000\u0000"+
		"A\u00db\u0001\u0000\u0000\u0000C\u00e0\u0001\u0000\u0000\u0000E\u00e7"+
		"\u0001\u0000\u0000\u0000G\u00ef\u0001\u0000\u0000\u0000I\u00fb\u0001\u0000"+
		"\u0000\u0000K\u010d\u0001\u0000\u0000\u0000M\u011d\u0001\u0000\u0000\u0000"+
		"O\u0120\u0001\u0000\u0000\u0000Q\u0126\u0001\u0000\u0000\u0000S\u0131"+
		"\u0001\u0000\u0000\u0000U\u0140\u0001\u0000\u0000\u0000W\u014e\u0001\u0000"+
		"\u0000\u0000Y\u0150\u0001\u0000\u0000\u0000[\\\u0005;\u0000\u0000\\\u0002"+
		"\u0001\u0000\u0000\u0000]^\u0005i\u0000\u0000^_\u0005f\u0000\u0000_\u0004"+
		"\u0001\u0000\u0000\u0000`a\u0005*\u0000\u0000a\u0006\u0001\u0000\u0000"+
		"\u0000bc\u0005/\u0000\u0000c\b\u0001\u0000\u0000\u0000de\u0005+\u0000"+
		"\u0000e\n\u0001\u0000\u0000\u0000fg\u0005-\u0000\u0000g\f\u0001\u0000"+
		"\u0000\u0000hi\u0005(\u0000\u0000i\u000e\u0001\u0000\u0000\u0000jk\u0005"+
		")\u0000\u0000k\u0010\u0001\u0000\u0000\u0000lm\u0005>\u0000\u0000m\u0012"+
		"\u0001\u0000\u0000\u0000no\u0005<\u0000\u0000o\u0014\u0001\u0000\u0000"+
		"\u0000pq\u0005>\u0000\u0000qr\u0005=\u0000\u0000r\u0016\u0001\u0000\u0000"+
		"\u0000st\u0005<\u0000\u0000tu\u0005=\u0000\u0000u\u0018\u0001\u0000\u0000"+
		"\u0000vw\u0005=\u0000\u0000wx\u0005=\u0000\u0000x\u001a\u0001\u0000\u0000"+
		"\u0000yz\u0005e\u0000\u0000z{\u0005l\u0000\u0000{|\u0005s\u0000\u0000"+
		"|}\u0005e\u0000\u0000}\u001c\u0001\u0000\u0000\u0000~\u007f\u0005=\u0000"+
		"\u0000\u007f\u001e\u0001\u0000\u0000\u0000\u0080\u0081\u0005!\u0000\u0000"+
		"\u0081\u0082\u0005=\u0000\u0000\u0082 \u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005r\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005t"+
		"\u0000\u0000\u0086\u0087\u0005u\u0000\u0000\u0087\u0088\u0005r\u0000\u0000"+
		"\u0088\u0089\u0005n\u0000\u0000\u0089\"\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005f\u0000\u0000\u008b\u008c\u0005o\u0000\u0000\u008c\u008d\u0005"+
		"r\u0000\u0000\u008d$\u0001\u0000\u0000\u0000\u008e\u008f\u0005w\u0000"+
		"\u0000\u008f\u0090\u0005h\u0000\u0000\u0090\u0091\u0005i\u0000\u0000\u0091"+
		"\u0092\u0005l\u0000\u0000\u0092\u0093\u0005e\u0000\u0000\u0093&\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005b\u0000\u0000\u0095\u0096\u0005r\u0000"+
		"\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0098\u0005a\u0000\u0000\u0098"+
		"\u0099\u0005k\u0000\u0000\u0099(\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"i\u0000\u0000\u009b\u009c\u0005n\u0000\u0000\u009c\u009d\u0005t\u0000"+
		"\u0000\u009d*\u0001\u0000\u0000\u0000\u009e\u009f\u0005d\u0000\u0000\u009f"+
		"\u00a0\u0005o\u0000\u0000\u00a0\u00a1\u0005u\u0000\u0000\u00a1\u00a2\u0005"+
		"b\u0000\u0000\u00a2\u00a3\u0005l\u0000\u0000\u00a3\u00a4\u0005e\u0000"+
		"\u0000\u00a4,\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005f\u0000\u0000\u00a6"+
		"\u00a7\u0005l\u0000\u0000\u00a7\u00a8\u0005o\u0000\u0000\u00a8\u00a9\u0005"+
		"a\u0000\u0000\u00a9\u00aa\u0005t\u0000\u0000\u00aa.\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005c\u0000\u0000\u00ac\u00ad\u0005h\u0000\u0000\u00ad"+
		"\u00ae\u0005a\u0000\u0000\u00ae\u00af\u0005r\u0000\u0000\u00af0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005v\u0000\u0000\u00b1\u00b2\u0005o\u0000"+
		"\u0000\u00b2\u00b3\u0005i\u0000\u0000\u00b3\u00b4\u0005d\u0000\u0000\u00b4"+
		"2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005s\u0000\u0000\u00b6\u00b7\u0005"+
		"t\u0000\u0000\u00b7\u00b8\u0005r\u0000\u0000\u00b8\u00b9\u0005i\u0000"+
		"\u0000\u00b9\u00ba\u0005n\u0000\u0000\u00ba\u00bb\u0005g\u0000\u0000\u00bb"+
		"4\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005b\u0000\u0000\u00bd\u00be\u0005"+
		"o\u0000\u0000\u00be\u00bf\u0005o\u0000\u0000\u00bf\u00c0\u0005l\u0000"+
		"\u0000\u00c06\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005t\u0000\u0000\u00c2"+
		"\u00c3\u0005r\u0000\u0000\u00c3\u00c4\u0005u\u0000\u0000\u00c4\u00c5\u0005"+
		"e\u0000\u0000\u00c58\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005f\u0000"+
		"\u0000\u00c7\u00c8\u0005a\u0000\u0000\u00c8\u00c9\u0005l\u0000\u0000\u00c9"+
		"\u00ca\u0005s\u0000\u0000\u00ca\u00cb\u0005e\u0000\u0000\u00cb:\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005c\u0000\u0000\u00cd\u00ce\u0005l\u0000"+
		"\u0000\u00ce\u00cf\u0005a\u0000\u0000\u00cf\u00d0\u0005s\u0000\u0000\u00d0"+
		"\u00d1\u0005s\u0000\u0000\u00d1<\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"t\u0000\u0000\u00d3\u00d4\u0005h\u0000\u0000\u00d4\u00d5\u0005i\u0000"+
		"\u0000\u00d5\u00d6\u0005s\u0000\u0000\u00d6>\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005n\u0000\u0000\u00d8\u00d9\u0005e\u0000\u0000\u00d9\u00da\u0005"+
		"w\u0000\u0000\u00da@\u0001\u0000\u0000\u0000\u00db\u00dc\u0005n\u0000"+
		"\u0000\u00dc\u00dd\u0005u\u0000\u0000\u00dd\u00de\u0005l\u0000\u0000\u00de"+
		"\u00df\u0005l\u0000\u0000\u00dfB\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005"+
		"p\u0000\u0000\u00e1\u00e2\u0005u\u0000\u0000\u00e2\u00e3\u0005b\u0000"+
		"\u0000\u00e3\u00e4\u0005l\u0000\u0000\u00e4\u00e5\u0005i\u0000\u0000\u00e5"+
		"\u00e6\u0005c\u0000\u0000\u00e6D\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"p\u0000\u0000\u00e8\u00e9\u0005r\u0000\u0000\u00e9\u00ea\u0005i\u0000"+
		"\u0000\u00ea\u00eb\u0005v\u0000\u0000\u00eb\u00ec\u0005a\u0000\u0000\u00ec"+
		"\u00ed\u0005t\u0000\u0000\u00ed\u00ee\u0005e\u0000\u0000\u00eeF\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005p\u0000\u0000\u00f0\u00f1\u0005r\u0000"+
		"\u0000\u00f1\u00f2\u0005o\u0000\u0000\u00f2\u00f3\u0005t\u0000\u0000\u00f3"+
		"\u00f4\u0005e\u0000\u0000\u00f4\u00f5\u0005c\u0000\u0000\u00f5\u00f6\u0005"+
		"t\u0000\u0000\u00f6\u00f7\u0005e\u0000\u0000\u00f7\u00f8\u0005d\u0000"+
		"\u0000\u00f8H\u0001\u0000\u0000\u0000\u00f9\u00fc\u0003Y,\u0000\u00fa"+
		"\u00fc\u0005_\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u0102\u0001\u0000\u0000\u0000\u00fd\u0101"+
		"\u0003Y,\u0000\u00fe\u0101\u0003W+\u0000\u00ff\u0101\u0005_\u0000\u0000"+
		"\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103J\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105"+
		"\u010e\u00050\u0000\u0000\u0106\u010a\u0007\u0000\u0000\u0000\u0107\u0109"+
		"\u0003W+\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010d\u0106\u0001\u0000"+
		"\u0000\u0000\u010eL\u0001\u0000\u0000\u0000\u010f\u0110\u0003K%\u0000"+
		"\u0110\u0114\u0005.\u0000\u0000\u0111\u0113\u0003W+\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u011e"+
		"\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0119"+
		"\u0005.\u0000\u0000\u0118\u011a\u0003W+\u0000\u0119\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000"+
		"\u0000\u0000\u011d\u010f\u0001\u0000\u0000\u0000\u011d\u0117\u0001\u0000"+
		"\u0000\u0000\u011eN\u0001\u0000\u0000\u0000\u011f\u0121\u0007\u0001\u0000"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0006\'\u0000\u0000"+
		"\u0125P\u0001\u0000\u0000\u0000\u0126\u0127\u0005/\u0000\u0000\u0127\u0128"+
		"\u0005/\u0000\u0000\u0128\u012c\u0001\u0000\u0000\u0000\u0129\u012b\b"+
		"\u0002\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012e\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0006(\u0000\u0000\u0130R\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005/\u0000\u0000\u0132\u0133\u0005*\u0000\u0000\u0133"+
		"\u0134\u0005*\u0000\u0000\u0134\u0138\u0001\u0000\u0000\u0000\u0135\u0137"+
		"\t\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005*\u0000\u0000\u013c\u013d\u0005/\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0006)\u0000\u0000"+
		"\u013fT\u0001\u0000\u0000\u0000\u0140\u0141\u0005/\u0000\u0000\u0141\u0142"+
		"\u0005*\u0000\u0000\u0142\u0146\u0001\u0000\u0000\u0000\u0143\u0145\t"+
		"\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0005*\u0000\u0000\u014a\u014b\u0005/\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0006*\u0000\u0000"+
		"\u014dV\u0001\u0000\u0000\u0000\u014e\u014f\u0007\u0003\u0000\u0000\u014f"+
		"X\u0001\u0000\u0000\u0000\u0150\u0151\u0007\u0004\u0000\u0000\u0151Z\u0001"+
		"\u0000\u0000\u0000\r\u0000\u00fb\u0100\u0102\u010a\u010d\u0114\u011b\u011d"+
		"\u0122\u012c\u0138\u0146\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}