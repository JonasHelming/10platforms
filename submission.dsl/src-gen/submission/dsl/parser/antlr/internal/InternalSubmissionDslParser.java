package submission.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import submission.dsl.services.SubmissionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSubmissionDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Submission'", "'{'", "'eMail'", "'answer'", "'}'", "'A'", "'B'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSubmissionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSubmissionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSubmissionDslParser.tokenNames; }
    public String getGrammarFileName() { return "../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g"; }



     	private SubmissionDslGrammarAccess grammarAccess;
     	
        public InternalSubmissionDslParser(TokenStream input, SubmissionDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Submission";	
       	}
       	
       	@Override
       	protected SubmissionDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSubmission"
    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:68:1: entryRuleSubmission returns [EObject current=null] : iv_ruleSubmission= ruleSubmission EOF ;
    public final EObject entryRuleSubmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubmission = null;


        try {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:69:2: (iv_ruleSubmission= ruleSubmission EOF )
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:70:2: iv_ruleSubmission= ruleSubmission EOF
            {
             newCompositeNode(grammarAccess.getSubmissionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubmission_in_entryRuleSubmission75);
            iv_ruleSubmission=ruleSubmission();

            state._fsp--;

             current =iv_ruleSubmission; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubmission85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubmission"


    // $ANTLR start "ruleSubmission"
    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:77:1: ruleSubmission returns [EObject current=null] : ( () otherlv_1= 'Submission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eMail' ( (lv_eMail_5_0= ruleEString ) ) )? (otherlv_6= 'answer' ( (lv_answer_7_0= ruleAnswer ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleSubmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_eMail_5_0 = null;

        Enumerator lv_answer_7_0 = null;


         enterRule(); 
            
        try {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:80:28: ( ( () otherlv_1= 'Submission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eMail' ( (lv_eMail_5_0= ruleEString ) ) )? (otherlv_6= 'answer' ( (lv_answer_7_0= ruleAnswer ) ) )? otherlv_8= '}' ) )
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:81:1: ( () otherlv_1= 'Submission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eMail' ( (lv_eMail_5_0= ruleEString ) ) )? (otherlv_6= 'answer' ( (lv_answer_7_0= ruleAnswer ) ) )? otherlv_8= '}' )
            {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:81:1: ( () otherlv_1= 'Submission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eMail' ( (lv_eMail_5_0= ruleEString ) ) )? (otherlv_6= 'answer' ( (lv_answer_7_0= ruleAnswer ) ) )? otherlv_8= '}' )
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:81:2: () otherlv_1= 'Submission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eMail' ( (lv_eMail_5_0= ruleEString ) ) )? (otherlv_6= 'answer' ( (lv_answer_7_0= ruleAnswer ) ) )? otherlv_8= '}'
            {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:81:2: ()
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubmissionAccess().getSubmissionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSubmission131); 

                	newLeafNode(otherlv_1, grammarAccess.getSubmissionAccess().getSubmissionKeyword_1());
                
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:92:1: (lv_name_2_0= ruleEString )
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubmissionAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubmission152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubmissionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSubmission164); 

                	newLeafNode(otherlv_3, grammarAccess.getSubmissionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:113:1: (otherlv_4= 'eMail' ( (lv_eMail_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:113:3: otherlv_4= 'eMail' ( (lv_eMail_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSubmission177); 

                        	newLeafNode(otherlv_4, grammarAccess.getSubmissionAccess().getEMailKeyword_4_0());
                        
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:117:1: ( (lv_eMail_5_0= ruleEString ) )
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:118:1: (lv_eMail_5_0= ruleEString )
                    {
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:118:1: (lv_eMail_5_0= ruleEString )
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:119:3: lv_eMail_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubmissionAccess().getEMailEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubmission198);
                    lv_eMail_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubmissionRule());
                    	        }
                           		set(
                           			current, 
                           			"eMail",
                            		lv_eMail_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:135:4: (otherlv_6= 'answer' ( (lv_answer_7_0= ruleAnswer ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:135:6: otherlv_6= 'answer' ( (lv_answer_7_0= ruleAnswer ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSubmission213); 

                        	newLeafNode(otherlv_6, grammarAccess.getSubmissionAccess().getAnswerKeyword_5_0());
                        
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:139:1: ( (lv_answer_7_0= ruleAnswer ) )
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:140:1: (lv_answer_7_0= ruleAnswer )
                    {
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:140:1: (lv_answer_7_0= ruleAnswer )
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:141:3: lv_answer_7_0= ruleAnswer
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubmissionAccess().getAnswerAnswerEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleSubmission234);
                    lv_answer_7_0=ruleAnswer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubmissionRule());
                    	        }
                           		set(
                           			current, 
                           			"answer",
                            		lv_answer_7_0, 
                            		"Answer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSubmission248); 

                	newLeafNode(otherlv_8, grammarAccess.getSubmissionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubmission"


    // $ANTLR start "entryRuleEString"
    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:169:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:170:2: (iv_ruleEString= ruleEString EOF )
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:171:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString285);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString296); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:178:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:181:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:182:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:182:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:182:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString336); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:190:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString362); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleAnswer"
    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:205:1: ruleAnswer returns [Enumerator current=null] : ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) ) ;
    public final Enumerator ruleAnswer() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:207:28: ( ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) ) )
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:208:1: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) )
            {
            // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:208:1: ( (enumLiteral_0= 'A' ) | (enumLiteral_1= 'B' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:208:2: (enumLiteral_0= 'A' )
                    {
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:208:2: (enumLiteral_0= 'A' )
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:208:4: enumLiteral_0= 'A'
                    {
                    enumLiteral_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnswer421); 

                            current = grammarAccess.getAnswerAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAnswerAccess().getAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:214:6: (enumLiteral_1= 'B' )
                    {
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:214:6: (enumLiteral_1= 'B' )
                    // ../submission.dsl/src-gen/submission/dsl/parser/antlr/internal/InternalSubmissionDsl.g:214:8: enumLiteral_1= 'B'
                    {
                    enumLiteral_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnswer438); 

                            current = grammarAccess.getAnswerAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAnswerAccess().getBEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSubmission_in_entryRuleSubmission75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubmission85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleSubmission131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubmission152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSubmission164 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_13_in_ruleSubmission177 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubmission198 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSubmission213 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleSubmission234 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSubmission248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString285 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAnswer421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAnswer438 = new BitSet(new long[]{0x0000000000000002L});
    }


}