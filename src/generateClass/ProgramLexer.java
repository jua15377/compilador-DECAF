// Generated from C:/Users/Alejandro-PC/Documents/UVG 2018/COMPILADORES/EL PROYECTO/compilador-DECAF\Program.g4 by ANTLR 4.7
package generateClass;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, STRUCT=26, TRUE=27, FALSE=28, VOID=29, IF=30, ELSE=31, WHILE=32, 
		RETURN=33, INT=34, CHAR=35, BOOLEAN=36, ID=37, NUM=38, Char=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"STRUCT", "TRUE", "FALSE", "VOID", "IF", "ELSE", "WHILE", "RETURN", "INT", 
		"CHAR", "BOOLEAN", "LETTER", "DIGIT", "ID", "NUM", "Char", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'}'", "';'", "'['", "']'", "'('", "','", "')'", 
		"'='", "'.'", "'-'", "'!'", "'+'", "'*'", "'/'", "'%'", "'<'", "'>'", 
		"'<='", "'>='", "'=='", "'!='", "'||'", "'&&'", "'struct'", "'true'", 
		"'false'", "'void'", "'if'", "'else'", "'while'", "'return'", "'int'", 
		"'char'", "'boolean'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "STRUCT", "TRUE", "FALSE", "VOID", "IF", "ELSE", "WHILE", 
		"RETURN", "INT", "CHAR", "BOOLEAN", "ID", "NUM", "Char", "WS"
	};
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


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\5\'\u00d4\n\'\3\'\3\'\3(\3(\3(\7("+
		"\u00db\n(\f(\16(\u00de\13(\3)\5)\u00e1\n)\3)\3)\7)\u00e5\n)\f)\16)\u00e8"+
		"\13)\3*\3*\3*\3*\3+\6+\u00ef\n+\r+\16+\u00f0\3+\3+\2\2,\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\2M\2O\'Q(S)U*\3\2\4\4\2C\\c|\5\2\13\f\16\17\"\"\2\u00f7\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5]\3\2\2\2\7"+
		"_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23"+
		"k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2"+
		"\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%}\3\2\2\2\'\177\3\2\2\2)\u0081\3\2\2"+
		"\2+\u0084\3\2\2\2-\u0087\3\2\2\2/\u008a\3\2\2\2\61\u008d\3\2\2\2\63\u0090"+
		"\3\2\2\2\65\u0093\3\2\2\2\67\u009a\3\2\2\29\u009f\3\2\2\2;\u00a5\3\2\2"+
		"\2=\u00aa\3\2\2\2?\u00ad\3\2\2\2A\u00b2\3\2\2\2C\u00b8\3\2\2\2E\u00bf"+
		"\3\2\2\2G\u00c3\3\2\2\2I\u00c8\3\2\2\2K\u00d0\3\2\2\2M\u00d3\3\2\2\2O"+
		"\u00d7\3\2\2\2Q\u00e0\3\2\2\2S\u00e9\3\2\2\2U\u00ee\3\2\2\2WX\7e\2\2X"+
		"Y\7n\2\2YZ\7c\2\2Z[\7u\2\2[\\\7u\2\2\\\4\3\2\2\2]^\7}\2\2^\6\3\2\2\2_"+
		"`\7\177\2\2`\b\3\2\2\2ab\7=\2\2b\n\3\2\2\2cd\7]\2\2d\f\3\2\2\2ef\7_\2"+
		"\2f\16\3\2\2\2gh\7*\2\2h\20\3\2\2\2ij\7.\2\2j\22\3\2\2\2kl\7+\2\2l\24"+
		"\3\2\2\2mn\7?\2\2n\26\3\2\2\2op\7\60\2\2p\30\3\2\2\2qr\7/\2\2r\32\3\2"+
		"\2\2st\7#\2\2t\34\3\2\2\2uv\7-\2\2v\36\3\2\2\2wx\7,\2\2x \3\2\2\2yz\7"+
		"\61\2\2z\"\3\2\2\2{|\7\'\2\2|$\3\2\2\2}~\7>\2\2~&\3\2\2\2\177\u0080\7"+
		"@\2\2\u0080(\3\2\2\2\u0081\u0082\7>\2\2\u0082\u0083\7?\2\2\u0083*\3\2"+
		"\2\2\u0084\u0085\7@\2\2\u0085\u0086\7?\2\2\u0086,\3\2\2\2\u0087\u0088"+
		"\7?\2\2\u0088\u0089\7?\2\2\u0089.\3\2\2\2\u008a\u008b\7#\2\2\u008b\u008c"+
		"\7?\2\2\u008c\60\3\2\2\2\u008d\u008e\7~\2\2\u008e\u008f\7~\2\2\u008f\62"+
		"\3\2\2\2\u0090\u0091\7(\2\2\u0091\u0092\7(\2\2\u0092\64\3\2\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7w\2\2"+
		"\u0097\u0098\7e\2\2\u0098\u0099\7v\2\2\u0099\66\3\2\2\2\u009a\u009b\7"+
		"v\2\2\u009b\u009c\7t\2\2\u009c\u009d\7w\2\2\u009d\u009e\7g\2\2\u009e8"+
		"\3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4:\3\2\2\2\u00a5\u00a6\7x\2\2\u00a6"+
		"\u00a7\7q\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7f\2\2\u00a9<\3\2\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7h\2\2\u00ac>\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1@\3\2\2\2\u00b2"+
		"\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7n\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7B\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2"+
		"\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be"+
		"\7p\2\2\u00beD\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2F\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6"+
		"\7c\2\2\u00c6\u00c7\7t\2\2\u00c7H\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca"+
		"\7q\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7p\2\2\u00cfJ\3\2\2\2\u00d0\u00d1\t\2\2\2\u00d1"+
		"L\3\2\2\2\u00d2\u00d4\7/\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\4\62;\2\u00d6N\3\2\2\2\u00d7\u00dc\5K&\2\u00d8"+
		"\u00db\5K&\2\u00d9\u00db\5M\'\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2"+
		"\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddP"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\7/\2\2\u00e0\u00df\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6\5M\'\2\u00e3\u00e5\5M\'"+
		"\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7R\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7)\2\2\u00ea\u00eb"+
		"\5K&\2\u00eb\u00ec\7)\2\2\u00ecT\3\2\2\2\u00ed\u00ef\t\3\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\b+\2\2\u00f3V\3\2\2\2\t\2\u00d3\u00da\u00dc"+
		"\u00e0\u00e6\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}