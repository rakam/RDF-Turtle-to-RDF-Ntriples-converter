// $ANTLR 3.5.1 /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g 2014-10-12 23:05:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprASTLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int Doc=4;
	public static final int ID=5;
	public static final int O=6;
	public static final int P=7;
	public static final int S=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprASTLexer() {} 
	public ExprASTLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprASTLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g"; }

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:69:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:69:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:69:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:70:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '&' | ' ' )+ )
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:70:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '&' | ' ' )+
			{
			// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:70:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' | '&' | ' ' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==' '||LA2_0=='&'||LA2_0=='-'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:
					{
					if ( input.LA(1)==' '||input.LA(1)=='&'||input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:1:8: ( WS | ID )
		int alt3=2;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:1:10: WS
				{
				mWS(); 

				}
				break;
			case 2 :
				// /home/matthias/ISTIC/COMP/tp1/v2/ExprAST.g:1:13: ID
				{
				mID(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\1\uffff\1\2\2\uffff";
	static final String DFA3_eofS =
		"\4\uffff";
	static final String DFA3_minS =
		"\1\11\1\40\2\uffff";
	static final String DFA3_maxS =
		"\2\172\2\uffff";
	static final String DFA3_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA3_specialS =
		"\4\uffff}>";
	static final String[] DFA3_transitionS = {
			"\2\2\2\uffff\1\2\22\uffff\1\1\5\uffff\1\3\6\uffff\1\3\2\uffff\12\3\7"+
			"\uffff\32\3\4\uffff\1\3\1\uffff\32\3",
			"\1\1\5\uffff\1\3\6\uffff\1\3\2\uffff\12\3\7\uffff\32\3\4\uffff\1\3\1"+
			"\uffff\32\3",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | ID );";
		}
	}

}
