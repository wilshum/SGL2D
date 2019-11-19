// Generated from C:/Users/William Luo/Desktop/University/CPSC 311/sgl2d/starter/src\SGL2D.g4 by ANTLR 4.7.2
package SGL2DANTLR;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SGL2DLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ENVIRONMENT=7, GOAL=8, 
		PLAYER=9, SPRITE=10, COUNTER=11, EVENT=12, SET=13, ARROW=14, INT=15, XINT=16, 
		YINT=17, COLOR=18, SOLID=19, COMMAND=20, WHITESPACE=21, BOOLEAN=22, WORD=23, 
		NEWLINE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
			"T", "U", "V", "W", "X", "Y", "Z", "EQUALS", "LOWERCASE", "UPPERCASE", 
			"ROYGBIV", "ACTIONS", "ENVIRONMENT", "GOAL", "PLAYER", "SPRITE", "COUNTER", 
			"EVENT", "SET", "ARROW", "INT", "XINT", "YINT", "COLOR", "SOLID", "COMMAND", 
			"WHITESPACE", "BOOLEAN", "WORD", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'1'", "'2'", "'3'", "'('", "','", "')'", null, null, null, null, 
			null, null, null, "'>'", null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ENVIRONMENT", "GOAL", "PLAYER", 
			"SPRITE", "COUNTER", "EVENT", "SET", "ARROW", "INT", "XINT", "YINT", 
			"COLOR", "SOLID", "COMMAND", "WHITESPACE", "BOOLEAN", "WORD", "NEWLINE"
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


	public SGL2DLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SGL2D.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0288\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00f4\n%\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u01f5"+
		"\n&\f&\16&\u01f8\13&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0206\n&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3.\3.\3/\5/\u023c\n/\3/\6/\u023f\n/\r/\16/\u0240\3"+
		"\60\3\60\3\60\6\60\u0246\n\60\r\60\16\60\u0247\3\61\3\61\3\61\6\61\u024d"+
		"\n\61\r\61\16\61\u024e\3\62\3\62\3\62\3\62\3\62\5\62\u0256\n\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u0277\n\66\3\67\3\67\3\67\6\67\u027c\n\67\r\67\16\67\u027d"+
		"\38\58\u0281\n8\38\38\68\u0285\n8\r8\168\u0286\2\29\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2"+
		"-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\tO\nQ\13S\f"+
		"U\rW\16Y\17[\20]\21_\22a\23c\24e\25g\26i\27k\30m\31o\32\3\2\36\4\2CCc"+
		"c\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2c"+
		"|\3\2C\\\2\u0290\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3"+
		"\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27"+
		"\u0085\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2\2\35\u008b\3\2\2\2\37\u008d"+
		"\3\2\2\2!\u008f\3\2\2\2#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0095\3\2\2\2"+
		")\u0097\3\2\2\2+\u0099\3\2\2\2-\u009b\3\2\2\2/\u009d\3\2\2\2\61\u009f"+
		"\3\2\2\2\63\u00a1\3\2\2\2\65\u00a3\3\2\2\2\67\u00a5\3\2\2\29\u00a7\3\2"+
		"\2\2;\u00a9\3\2\2\2=\u00ab\3\2\2\2?\u00ad\3\2\2\2A\u00af\3\2\2\2C\u00b1"+
		"\3\2\2\2E\u00b3\3\2\2\2G\u00b5\3\2\2\2I\u00f3\3\2\2\2K\u0205\3\2\2\2M"+
		"\u0207\3\2\2\2O\u0213\3\2\2\2Q\u0218\3\2\2\2S\u021f\3\2\2\2U\u0226\3\2"+
		"\2\2W\u022e\3\2\2\2Y\u0234\3\2\2\2[\u0238\3\2\2\2]\u023b\3\2\2\2_\u0242"+
		"\3\2\2\2a\u0249\3\2\2\2c\u0250\3\2\2\2e\u025b\3\2\2\2g\u0263\3\2\2\2i"+
		"\u0265\3\2\2\2k\u0276\3\2\2\2m\u027b\3\2\2\2o\u0284\3\2\2\2qr\7\63\2\2"+
		"r\4\3\2\2\2st\7\64\2\2t\6\3\2\2\2uv\7\65\2\2v\b\3\2\2\2wx\7*\2\2x\n\3"+
		"\2\2\2yz\7.\2\2z\f\3\2\2\2{|\7+\2\2|\16\3\2\2\2}~\t\2\2\2~\20\3\2\2\2"+
		"\177\u0080\t\3\2\2\u0080\22\3\2\2\2\u0081\u0082\t\4\2\2\u0082\24\3\2\2"+
		"\2\u0083\u0084\t\5\2\2\u0084\26\3\2\2\2\u0085\u0086\t\6\2\2\u0086\30\3"+
		"\2\2\2\u0087\u0088\t\7\2\2\u0088\32\3\2\2\2\u0089\u008a\t\b\2\2\u008a"+
		"\34\3\2\2\2\u008b\u008c\t\t\2\2\u008c\36\3\2\2\2\u008d\u008e\t\n\2\2\u008e"+
		" \3\2\2\2\u008f\u0090\t\13\2\2\u0090\"\3\2\2\2\u0091\u0092\t\f\2\2\u0092"+
		"$\3\2\2\2\u0093\u0094\t\r\2\2\u0094&\3\2\2\2\u0095\u0096\t\16\2\2\u0096"+
		"(\3\2\2\2\u0097\u0098\t\17\2\2\u0098*\3\2\2\2\u0099\u009a\t\20\2\2\u009a"+
		",\3\2\2\2\u009b\u009c\t\21\2\2\u009c.\3\2\2\2\u009d\u009e\t\22\2\2\u009e"+
		"\60\3\2\2\2\u009f\u00a0\t\23\2\2\u00a0\62\3\2\2\2\u00a1\u00a2\t\24\2\2"+
		"\u00a2\64\3\2\2\2\u00a3\u00a4\t\25\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\t"+
		"\26\2\2\u00a68\3\2\2\2\u00a7\u00a8\t\27\2\2\u00a8:\3\2\2\2\u00a9\u00aa"+
		"\t\30\2\2\u00aa<\3\2\2\2\u00ab\u00ac\t\31\2\2\u00ac>\3\2\2\2\u00ad\u00ae"+
		"\t\32\2\2\u00ae@\3\2\2\2\u00af\u00b0\t\33\2\2\u00b0B\3\2\2\2\u00b1\u00b2"+
		"\7?\2\2\u00b2D\3\2\2\2\u00b3\u00b4\t\34\2\2\u00b4F\3\2\2\2\u00b5\u00b6"+
		"\t\35\2\2\u00b6H\3\2\2\2\u00b7\u00b8\5\61\31\2\u00b8\u00b9\5\27\f\2\u00b9"+
		"\u00ba\5\25\13\2\u00ba\u00f4\3\2\2\2\u00bb\u00bc\5+\26\2\u00bc\u00bd\5"+
		"\61\31\2\u00bd\u00be\5\17\b\2\u00be\u00bf\5)\25\2\u00bf\u00c0\5\33\16"+
		"\2\u00c0\u00c1\5\27\f\2\u00c1\u00f4\3\2\2\2\u00c2\u00c3\5? \2\u00c3\u00c4"+
		"\5\27\f\2\u00c4\u00c5\5%\23\2\u00c5\u00c6\5%\23\2\u00c6\u00c7\5+\26\2"+
		"\u00c7\u00c8\5;\36\2\u00c8\u00f4\3\2\2\2\u00c9\u00ca\5\33\16\2\u00ca\u00cb"+
		"\5\61\31\2\u00cb\u00cc\5\27\f\2\u00cc\u00cd\5\27\f\2\u00cd\u00ce\5)\25"+
		"\2\u00ce\u00f4\3\2\2\2\u00cf\u00d0\5\21\t\2\u00d0\u00d1\5%\23\2\u00d1"+
		"\u00d2\5\67\34\2\u00d2\u00d3\5\27\f\2\u00d3\u00f4\3\2\2\2\u00d4\u00d5"+
		"\5\37\20\2\u00d5\u00d6\5)\25\2\u00d6\u00d7\5\25\13\2\u00d7\u00d8\5\37"+
		"\20\2\u00d8\u00d9\5\33\16\2\u00d9\u00da\5+\26\2\u00da\u00f4\3\2\2\2\u00db"+
		"\u00dc\59\35\2\u00dc\u00dd\5\37\20\2\u00dd\u00de\5+\26\2\u00de\u00df\5"+
		"%\23\2\u00df\u00e0\5\27\f\2\u00e0\u00e1\5\65\33\2\u00e1\u00f4\3\2\2\2"+
		"\u00e2\u00e3\5\21\t\2\u00e3\u00e4\5%\23\2\u00e4\u00e5\5\17\b\2\u00e5\u00e6"+
		"\5\23\n\2\u00e6\u00e7\5#\22\2\u00e7\u00f4\3\2\2\2\u00e8\u00e9\5;\36\2"+
		"\u00e9\u00ea\5\35\17\2\u00ea\u00eb\5\37\20\2\u00eb\u00ec\5\65\33\2\u00ec"+
		"\u00ed\5\27\f\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\5\33\16\2\u00ef\u00f0"+
		"\5\61\31\2\u00f0\u00f1\5\27\f\2\u00f1\u00f2\5? \2\u00f2\u00f4\3\2\2\2"+
		"\u00f3\u00b7\3\2\2\2\u00f3\u00bb\3\2\2\2\u00f3\u00c2\3\2\2\2\u00f3\u00c9"+
		"\3\2\2\2\u00f3\u00cf\3\2\2\2\u00f3\u00d4\3\2\2\2\u00f3\u00db\3\2\2\2\u00f3"+
		"\u00e2\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4J\3\2\2\2"+
		"\u00f5\u00f6\5\37\20\2\u00f6\u00f7\5)\25\2\u00f7\u00f8\5\23\n\2\u00f8"+
		"\u00f9\5\23\n\2\u00f9\u00fa\5+\26\2\u00fa\u00fb\5\67\34\2\u00fb\u00fc"+
		"\5)\25\2\u00fc\u00fd\5\65\33\2\u00fd\u00fe\5\27\f\2\u00fe\u00ff\5\61\31"+
		"\2\u00ff\u0100\7\63\2\2\u0100\u0101\5C\"\2\u0101\u0102\5]/\2\u0102\u0206"+
		"\3\2\2\2\u0103\u0104\5\25\13\2\u0104\u0105\5\27\f\2\u0105\u0106\5\23\n"+
		"\2\u0106\u0107\5\23\n\2\u0107\u0108\5+\26\2\u0108\u0109\5\67\34\2\u0109"+
		"\u010a\5)\25\2\u010a\u010b\5\65\33\2\u010b\u010c\5\27\f\2\u010c\u010d"+
		"\5\61\31\2\u010d\u010e\7\63\2\2\u010e\u010f\5C\"\2\u010f\u0110\5]/\2\u0110"+
		"\u0206\3\2\2\2\u0111\u0112\5\37\20\2\u0112\u0113\5)\25\2\u0113\u0114\5"+
		"\23\n\2\u0114\u0115\5\23\n\2\u0115\u0116\5+\26\2\u0116\u0117\5\67\34\2"+
		"\u0117\u0118\5)\25\2\u0118\u0119\5\65\33\2\u0119\u011a\5\27\f\2\u011a"+
		"\u011b\5\61\31\2\u011b\u011c\7\64\2\2\u011c\u011d\5C\"\2\u011d\u011e\5"+
		"]/\2\u011e\u0206\3\2\2\2\u011f\u0120\5\25\13\2\u0120\u0121\5\27\f\2\u0121"+
		"\u0122\5\23\n\2\u0122\u0123\5\23\n\2\u0123\u0124\5+\26\2\u0124\u0125\5"+
		"\67\34\2\u0125\u0126\5)\25\2\u0126\u0127\5\65\33\2\u0127\u0128\5\27\f"+
		"\2\u0128\u0129\5\61\31\2\u0129\u012a\7\64\2\2\u012a\u012b\5C\"\2\u012b"+
		"\u012c\5]/\2\u012c\u0206\3\2\2\2\u012d\u012e\5\37\20\2\u012e\u012f\5)"+
		"\25\2\u012f\u0130\5\23\n\2\u0130\u0131\5\23\n\2\u0131\u0132\5+\26\2\u0132"+
		"\u0133\5\67\34\2\u0133\u0134\5)\25\2\u0134\u0135\5\65\33\2\u0135\u0136"+
		"\5\27\f\2\u0136\u0137\5\61\31\2\u0137\u0138\7\65\2\2\u0138\u0139\5C\""+
		"\2\u0139\u013a\5]/\2\u013a\u0206\3\2\2\2\u013b\u013c\5\25\13\2\u013c\u013d"+
		"\5\27\f\2\u013d\u013e\5\23\n\2\u013e\u013f\5\23\n\2\u013f\u0140\5+\26"+
		"\2\u0140\u0141\5\67\34\2\u0141\u0142\5)\25\2\u0142\u0143\5\65\33\2\u0143"+
		"\u0144\5\27\f\2\u0144\u0145\5\61\31\2\u0145\u0146\7\65\2\2\u0146\u0147"+
		"\5C\"\2\u0147\u0148\5]/\2\u0148\u0206\3\2\2\2\u0149\u014a\5\37\20\2\u014a"+
		"\u014b\5)\25\2\u014b\u014c\5\23\n\2\u014c\u014d\5\63\32\2\u014d\u014e"+
		"\5-\27\2\u014e\u014f\5\61\31\2\u014f\u0150\5\37\20\2\u0150\u0151\5\65"+
		"\33\2\u0151\u0152\5\27\f\2\u0152\u0153\5\23\n\2\u0153\u0154\5+\26\2\u0154"+
		"\u0155\5\67\34\2\u0155\u0156\5)\25\2\u0156\u0157\5\65\33\2\u0157\u0158"+
		"\5\27\f\2\u0158\u0159\5\61\31\2\u0159\u015a\5C\"\2\u015a\u015b\5]/\2\u015b"+
		"\u0206\3\2\2\2\u015c\u015d\5\25\13\2\u015d\u015e\5\27\f\2\u015e\u015f"+
		"\5\23\n\2\u015f\u0160\5\63\32\2\u0160\u0161\5-\27\2\u0161\u0162\5\61\31"+
		"\2\u0162\u0163\5\37\20\2\u0163\u0164\5\65\33\2\u0164\u0165\5\27\f\2\u0165"+
		"\u0166\5\23\n\2\u0166\u0167\5+\26\2\u0167\u0168\5\67\34\2\u0168\u0169"+
		"\5)\25\2\u0169\u016a\5\65\33\2\u016a\u016b\5\27\f\2\u016b\u016c\5\61\31"+
		"\2\u016c\u016d\5C\"\2\u016d\u016e\5]/\2\u016e\u0206\3\2\2\2\u016f\u0170"+
		"\5\63\32\2\u0170\u0171\5\27\f\2\u0171\u0172\5\65\33\2\u0172\u0173\5\63"+
		"\32\2\u0173\u0174\5-\27\2\u0174\u0175\5\61\31\2\u0175\u0176\5\37\20\2"+
		"\u0176\u0177\5\65\33\2\u0177\u0178\5\27\f\2\u0178\u0179\5\23\n\2\u0179"+
		"\u017a\5+\26\2\u017a\u017b\5\67\34\2\u017b\u017c\5)\25\2\u017c\u017d\5"+
		"\65\33\2\u017d\u017e\5\27\f\2\u017e\u017f\5\61\31\2\u017f\u0180\5C\"\2"+
		"\u0180\u0181\5]/\2\u0181\u0206\3\2\2\2\u0182\u0183\5\65\33\2\u0183\u0184"+
		"\5\61\31\2\u0184\u0185\5\17\b\2\u0185\u0186\5)\25\2\u0186\u0187\5\63\32"+
		"\2\u0187\u0188\5\31\r\2\u0188\u0189\5+\26\2\u0189\u018a\5\61\31\2\u018a"+
		"\u018b\5\'\24\2\u018b\u018c\5+\26\2\u018c\u018d\5)\25\2\u018d\u018e\5"+
		"A!\2\u018e\u018f\5\27\f\2\u018f\u0190\5\61\31\2\u0190\u0191\5+\26\2\u0191"+
		"\u0192\5\23\n\2\u0192\u0193\5+\26\2\u0193\u0194\5\67\34\2\u0194\u0195"+
		"\5)\25\2\u0195\u0196\5\65\33\2\u0196\u0197\5\27\f\2\u0197\u0198\5\61\31"+
		"\2\u0198\u0199\5C\"\2\u0199\u019a\5m\67\2\u019a\u0206\3\2\2\2\u019b\u019c"+
		"\5\33\16\2\u019c\u019d\5\17\b\2\u019d\u019e\5\'\24\2\u019e\u019f\5\27"+
		"\f\2\u019f\u01a0\5+\26\2\u01a0\u01a1\59\35\2\u01a1\u01a2\5\27\f\2\u01a2"+
		"\u01a3\5\61\31\2\u01a3\u01a4\5+\26\2\u01a4\u01a5\5)\25\2\u01a5\u01a6\5"+
		"A!\2\u01a6\u01a7\5\27\f\2\u01a7\u01a8\5\61\31\2\u01a8\u01a9\5+\26\2\u01a9"+
		"\u01aa\5\23\n\2\u01aa\u01ab\5+\26\2\u01ab\u01ac\5\67\34\2\u01ac\u01ad"+
		"\5)\25\2\u01ad\u01ae\5\65\33\2\u01ae\u01af\5\27\f\2\u01af\u01b0\5\61\31"+
		"\2\u01b0\u0206\3\2\2\2\u01b1\u01b2\5;\36\2\u01b2\u01b3\5\37\20\2\u01b3"+
		"\u01b4\5)\25\2\u01b4\u01b5\5+\26\2\u01b5\u01b6\5)\25\2\u01b6\u01b7\5A"+
		"!\2\u01b7\u01b8\5\27\f\2\u01b8\u01b9\5\61\31\2\u01b9\u01ba\5+\26\2\u01ba"+
		"\u01bb\5\23\n\2\u01bb\u01bc\5+\26\2\u01bc\u01bd\5\67\34\2\u01bd\u01be"+
		"\5)\25\2\u01be\u01bf\5\65\33\2\u01bf\u01c0\5\27\f\2\u01c0\u01c1\5\61\31"+
		"\2\u01c1\u0206\3\2\2\2\u01c2\u01c3\5\'\24\2\u01c3\u01c4\5+\26\2\u01c4"+
		"\u01c5\59\35\2\u01c5\u01c6\5\27\f\2\u01c6\u01c7\5\65\33\2\u01c7\u01c8"+
		"\5+\26\2\u01c8\u01c9\5\61\31\2\u01c9\u01ca\5\17\b\2\u01ca\u01cb\5)\25"+
		"\2\u01cb\u01cc\5\25\13\2\u01cc\u01cd\5+\26\2\u01cd\u01ce\5\'\24\2\u01ce"+
		"\u01cf\5C\"\2\u01cf\u01d0\5m\67\2\u01d0\u0206\3\2\2\2\u01d1\u01d2\5\65"+
		"\33\2\u01d2\u01d3\5\61\31\2\u01d3\u01d4\5\17\b\2\u01d4\u01d5\5)\25\2\u01d5"+
		"\u01d6\5\63\32\2\u01d6\u01d7\5\31\r\2\u01d7\u01d8\5+\26\2\u01d8\u01d9"+
		"\5\61\31\2\u01d9\u01da\5\'\24\2\u01da\u01db\5\65\33\2\u01db\u01dc\5+\26"+
		"\2\u01dc\u01dd\5\63\32\2\u01dd\u01de\5-\27\2\u01de\u01df\5\61\31\2\u01df"+
		"\u01e0\5\37\20\2\u01e0\u01e1\5\65\33\2\u01e1\u01e2\5\27\f\2\u01e2\u01e3"+
		"\5C\"\2\u01e3\u01e4\5m\67\2\u01e4\u0206\3\2\2\2\u01e5\u01e6\5\'\24\2\u01e6"+
		"\u01e7\5+\26\2\u01e7\u01e8\59\35\2\u01e8\u01e9\5\27\f\2\u01e9\u01ea\5"+
		"-\27\2\u01ea\u01eb\5%\23\2\u01eb\u01ec\5\17\b\2\u01ec\u01ed\5? \2\u01ed"+
		"\u01ee\5\27\f\2\u01ee\u01ef\5\61\31\2\u01ef\u01f0\5\65\33\2\u01f0\u01f1"+
		"\5+\26\2\u01f1\u01f6\5C\"\2\u01f2\u01f5\5_\60\2\u01f3\u01f5\5a\61\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0206\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u01fa\5\33\16\2\u01fa\u01fb\5\17\b\2\u01fb\u01fc\5\'\24\2\u01fc\u01fd"+
		"\5\27\f\2\u01fd\u01fe\5+\26\2\u01fe\u01ff\59\35\2\u01ff\u0200\5\27\f\2"+
		"\u0200\u0201\5\61\31\2\u0201\u0202\5;\36\2\u0202\u0203\5\37\20\2\u0203"+
		"\u0204\5)\25\2\u0204\u0206\3\2\2\2\u0205\u00f5\3\2\2\2\u0205\u0103\3\2"+
		"\2\2\u0205\u0111\3\2\2\2\u0205\u011f\3\2\2\2\u0205\u012d\3\2\2\2\u0205"+
		"\u013b\3\2\2\2\u0205\u0149\3\2\2\2\u0205\u015c\3\2\2\2\u0205\u016f\3\2"+
		"\2\2\u0205\u0182\3\2\2\2\u0205\u019b\3\2\2\2\u0205\u01b1\3\2\2\2\u0205"+
		"\u01c2\3\2\2\2\u0205\u01d1\3\2\2\2\u0205\u01e5\3\2\2\2\u0205\u01f9\3\2"+
		"\2\2\u0206L\3\2\2\2\u0207\u0208\5\27\f\2\u0208\u0209\5)\25\2\u0209\u020a"+
		"\59\35\2\u020a\u020b\5\37\20\2\u020b\u020c\5\61\31\2\u020c\u020d\5+\26"+
		"\2\u020d\u020e\5)\25\2\u020e\u020f\5\'\24\2\u020f\u0210\5\27\f\2\u0210"+
		"\u0211\5)\25\2\u0211\u0212\5\65\33\2\u0212N\3\2\2\2\u0213\u0214\5\33\16"+
		"\2\u0214\u0215\5+\26\2\u0215\u0216\5\17\b\2\u0216\u0217\5%\23\2\u0217"+
		"P\3\2\2\2\u0218\u0219\5-\27\2\u0219\u021a\5%\23\2\u021a\u021b\5\17\b\2"+
		"\u021b\u021c\5? \2\u021c\u021d\5\27\f\2\u021d\u021e\5\61\31\2\u021eR\3"+
		"\2\2\2\u021f\u0220\5\63\32\2\u0220\u0221\5-\27\2\u0221\u0222\5\61\31\2"+
		"\u0222\u0223\5\37\20\2\u0223\u0224\5\65\33\2\u0224\u0225\5\27\f\2\u0225"+
		"T\3\2\2\2\u0226\u0227\5\23\n\2\u0227\u0228\5+\26\2\u0228\u0229\5\67\34"+
		"\2\u0229\u022a\5)\25\2\u022a\u022b\5\65\33\2\u022b\u022c\5\27\f\2\u022c"+
		"\u022d\5\61\31\2\u022dV\3\2\2\2\u022e\u022f\5\27\f\2\u022f\u0230\59\35"+
		"\2\u0230\u0231\5\27\f\2\u0231\u0232\5)\25\2\u0232\u0233\5\65\33\2\u0233"+
		"X\3\2\2\2\u0234\u0235\5\63\32\2\u0235\u0236\5\27\f\2\u0236\u0237\5\65"+
		"\33\2\u0237Z\3\2\2\2\u0238\u0239\7@\2\2\u0239\\\3\2\2\2\u023a\u023c\7"+
		"/\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u023f\4\62;\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241^\3\2\2\2\u0242\u0243\5=\37\2\u0243\u0245"+
		"\5C\"\2\u0244\u0246\4\62;\2\u0245\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248`\3\2\2\2\u0249\u024a\5? \2\u024a"+
		"\u024c\5C\"\2\u024b\u024d\4\62;\2\u024c\u024b\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fb\3\2\2\2\u0250\u0251"+
		"\5\23\n\2\u0251\u0252\5+\26\2\u0252\u0253\5%\23\2\u0253\u0255\5+\26\2"+
		"\u0254\u0256\5\67\34\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257"+
		"\3\2\2\2\u0257\u0258\5\61\31\2\u0258\u0259\5C\"\2\u0259\u025a\5I%\2\u025a"+
		"d\3\2\2\2\u025b\u025c\5\63\32\2\u025c\u025d\5+\26\2\u025d\u025e\5%\23"+
		"\2\u025e\u025f\5\37\20\2\u025f\u0260\5\25\13\2\u0260\u0261\5C\"\2\u0261"+
		"\u0262\5k\66\2\u0262f\3\2\2\2\u0263\u0264\5K&\2\u0264h\3\2\2\2\u0265\u0266"+
		"\7\"\2\2\u0266\u0267\3\2\2\2\u0267\u0268\b\65\2\2\u0268j\3\2\2\2\u0269"+
		"\u026a\5\65\33\2\u026a\u026b\5\61\31\2\u026b\u026c\5\67\34\2\u026c\u026d"+
		"\5\27\f\2\u026d\u0277\3\2\2\2\u026e\u026f\5\31\r\2\u026f\u0270\5\17\b"+
		"\2\u0270\u0271\5%\23\2\u0271\u0272\5\63\32\2\u0272\u0273\5\27\f\2\u0273"+
		"\u0277\3\2\2\2\u0274\u0277\5\65\33\2\u0275\u0277\5\31\r\2\u0276\u0269"+
		"\3\2\2\2\u0276\u026e\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277"+
		"l\3\2\2\2\u0278\u027c\5E#\2\u0279\u027c\5G$\2\u027a\u027c\7a\2\2\u027b"+
		"\u0278\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027a\3\2\2\2\u027c\u027d\3\2"+
		"\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027en\3\2\2\2\u027f\u0281"+
		"\7\17\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2"+
		"\u0282\u0285\7\f\2\2\u0283\u0285\7\17\2\2\u0284\u0280\3\2\2\2\u0284\u0283"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"p\3\2\2\2\22\2\u00f3\u01f4\u01f6\u0205\u023b\u0240\u0247\u024e\u0255\u0276"+
		"\u027b\u027d\u0280\u0284\u0286\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}