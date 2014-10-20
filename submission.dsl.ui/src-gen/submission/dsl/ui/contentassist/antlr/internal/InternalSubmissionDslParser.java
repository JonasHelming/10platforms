package submission.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import submission.dsl.services.SubmissionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSubmissionDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'A'", "'B'", "'Submission'", "'{'", "'}'", "'eMail'", "'answer'"
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
    public String getGrammarFileName() { return "../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g"; }


     
     	private SubmissionDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SubmissionDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSubmission"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:60:1: entryRuleSubmission : ruleSubmission EOF ;
    public final void entryRuleSubmission() throws RecognitionException {
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:61:1: ( ruleSubmission EOF )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:62:1: ruleSubmission EOF
            {
             before(grammarAccess.getSubmissionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubmission_in_entryRuleSubmission61);
            ruleSubmission();

            state._fsp--;

             after(grammarAccess.getSubmissionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubmission68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubmission"


    // $ANTLR start "ruleSubmission"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:69:1: ruleSubmission : ( ( rule__Submission__Group__0 ) ) ;
    public final void ruleSubmission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:73:2: ( ( ( rule__Submission__Group__0 ) ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:74:1: ( ( rule__Submission__Group__0 ) )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:74:1: ( ( rule__Submission__Group__0 ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:75:1: ( rule__Submission__Group__0 )
            {
             before(grammarAccess.getSubmissionAccess().getGroup()); 
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:76:1: ( rule__Submission__Group__0 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:76:2: rule__Submission__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__0_in_ruleSubmission94);
            rule__Submission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubmissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubmission"


    // $ANTLR start "entryRuleEString"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:89:1: ( ruleEString EOF )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:104:1: ( rule__EString__Alternatives )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleAnswer"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:117:1: ruleAnswer : ( ( rule__Answer__Alternatives ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:121:1: ( ( ( rule__Answer__Alternatives ) ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:122:1: ( ( rule__Answer__Alternatives ) )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:122:1: ( ( rule__Answer__Alternatives ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:123:1: ( rule__Answer__Alternatives )
            {
             before(grammarAccess.getAnswerAccess().getAlternatives()); 
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:124:1: ( rule__Answer__Alternatives )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:124:2: rule__Answer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Alternatives_in_ruleAnswer191);
            rule__Answer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "rule__EString__Alternatives"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:135:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:139:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:140:1: ( RULE_STRING )
                    {
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:140:1: ( RULE_STRING )
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:141:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives226); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:146:6: ( RULE_ID )
                    {
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:146:6: ( RULE_ID )
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:147:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives243); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Answer__Alternatives"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:157:1: rule__Answer__Alternatives : ( ( ( 'A' ) ) | ( ( 'B' ) ) );
    public final void rule__Answer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:161:1: ( ( ( 'A' ) ) | ( ( 'B' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:162:1: ( ( 'A' ) )
                    {
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:162:1: ( ( 'A' ) )
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:163:1: ( 'A' )
                    {
                     before(grammarAccess.getAnswerAccess().getAEnumLiteralDeclaration_0()); 
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:164:1: ( 'A' )
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:164:3: 'A'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Answer__Alternatives276); 

                    }

                     after(grammarAccess.getAnswerAccess().getAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:169:6: ( ( 'B' ) )
                    {
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:169:6: ( ( 'B' ) )
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:170:1: ( 'B' )
                    {
                     before(grammarAccess.getAnswerAccess().getBEnumLiteralDeclaration_1()); 
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:171:1: ( 'B' )
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:171:3: 'B'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Answer__Alternatives297); 

                    }

                     after(grammarAccess.getAnswerAccess().getBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Alternatives"


    // $ANTLR start "rule__Submission__Group__0"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:183:1: rule__Submission__Group__0 : rule__Submission__Group__0__Impl rule__Submission__Group__1 ;
    public final void rule__Submission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:187:1: ( rule__Submission__Group__0__Impl rule__Submission__Group__1 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:188:2: rule__Submission__Group__0__Impl rule__Submission__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__0__Impl_in_rule__Submission__Group__0330);
            rule__Submission__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__1_in_rule__Submission__Group__0333);
            rule__Submission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__0"


    // $ANTLR start "rule__Submission__Group__0__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:195:1: rule__Submission__Group__0__Impl : ( () ) ;
    public final void rule__Submission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:199:1: ( ( () ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:200:1: ( () )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:200:1: ( () )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:201:1: ()
            {
             before(grammarAccess.getSubmissionAccess().getSubmissionAction_0()); 
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:202:1: ()
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:204:1: 
            {
            }

             after(grammarAccess.getSubmissionAccess().getSubmissionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__0__Impl"


    // $ANTLR start "rule__Submission__Group__1"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:214:1: rule__Submission__Group__1 : rule__Submission__Group__1__Impl rule__Submission__Group__2 ;
    public final void rule__Submission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:218:1: ( rule__Submission__Group__1__Impl rule__Submission__Group__2 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:219:2: rule__Submission__Group__1__Impl rule__Submission__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__1__Impl_in_rule__Submission__Group__1391);
            rule__Submission__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__2_in_rule__Submission__Group__1394);
            rule__Submission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__1"


    // $ANTLR start "rule__Submission__Group__1__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:226:1: rule__Submission__Group__1__Impl : ( 'Submission' ) ;
    public final void rule__Submission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:230:1: ( ( 'Submission' ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:231:1: ( 'Submission' )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:231:1: ( 'Submission' )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:232:1: 'Submission'
            {
             before(grammarAccess.getSubmissionAccess().getSubmissionKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Submission__Group__1__Impl422); 
             after(grammarAccess.getSubmissionAccess().getSubmissionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__1__Impl"


    // $ANTLR start "rule__Submission__Group__2"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:245:1: rule__Submission__Group__2 : rule__Submission__Group__2__Impl rule__Submission__Group__3 ;
    public final void rule__Submission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:249:1: ( rule__Submission__Group__2__Impl rule__Submission__Group__3 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:250:2: rule__Submission__Group__2__Impl rule__Submission__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__2__Impl_in_rule__Submission__Group__2453);
            rule__Submission__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__3_in_rule__Submission__Group__2456);
            rule__Submission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__2"


    // $ANTLR start "rule__Submission__Group__2__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:257:1: rule__Submission__Group__2__Impl : ( ( rule__Submission__NameAssignment_2 ) ) ;
    public final void rule__Submission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:261:1: ( ( ( rule__Submission__NameAssignment_2 ) ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:262:1: ( ( rule__Submission__NameAssignment_2 ) )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:262:1: ( ( rule__Submission__NameAssignment_2 ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:263:1: ( rule__Submission__NameAssignment_2 )
            {
             before(grammarAccess.getSubmissionAccess().getNameAssignment_2()); 
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:264:1: ( rule__Submission__NameAssignment_2 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:264:2: rule__Submission__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__NameAssignment_2_in_rule__Submission__Group__2__Impl483);
            rule__Submission__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubmissionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__2__Impl"


    // $ANTLR start "rule__Submission__Group__3"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:274:1: rule__Submission__Group__3 : rule__Submission__Group__3__Impl rule__Submission__Group__4 ;
    public final void rule__Submission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:278:1: ( rule__Submission__Group__3__Impl rule__Submission__Group__4 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:279:2: rule__Submission__Group__3__Impl rule__Submission__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__3__Impl_in_rule__Submission__Group__3513);
            rule__Submission__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__4_in_rule__Submission__Group__3516);
            rule__Submission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__3"


    // $ANTLR start "rule__Submission__Group__3__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:286:1: rule__Submission__Group__3__Impl : ( '{' ) ;
    public final void rule__Submission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:290:1: ( ( '{' ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:291:1: ( '{' )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:291:1: ( '{' )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:292:1: '{'
            {
             before(grammarAccess.getSubmissionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Submission__Group__3__Impl544); 
             after(grammarAccess.getSubmissionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__3__Impl"


    // $ANTLR start "rule__Submission__Group__4"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:305:1: rule__Submission__Group__4 : rule__Submission__Group__4__Impl rule__Submission__Group__5 ;
    public final void rule__Submission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:309:1: ( rule__Submission__Group__4__Impl rule__Submission__Group__5 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:310:2: rule__Submission__Group__4__Impl rule__Submission__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__4__Impl_in_rule__Submission__Group__4575);
            rule__Submission__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__5_in_rule__Submission__Group__4578);
            rule__Submission__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__4"


    // $ANTLR start "rule__Submission__Group__4__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:317:1: rule__Submission__Group__4__Impl : ( ( rule__Submission__Group_4__0 )? ) ;
    public final void rule__Submission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:321:1: ( ( ( rule__Submission__Group_4__0 )? ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:322:1: ( ( rule__Submission__Group_4__0 )? )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:322:1: ( ( rule__Submission__Group_4__0 )? )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:323:1: ( rule__Submission__Group_4__0 )?
            {
             before(grammarAccess.getSubmissionAccess().getGroup_4()); 
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:324:1: ( rule__Submission__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:324:2: rule__Submission__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Submission__Group_4__0_in_rule__Submission__Group__4__Impl605);
                    rule__Submission__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmissionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__4__Impl"


    // $ANTLR start "rule__Submission__Group__5"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:334:1: rule__Submission__Group__5 : rule__Submission__Group__5__Impl rule__Submission__Group__6 ;
    public final void rule__Submission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:338:1: ( rule__Submission__Group__5__Impl rule__Submission__Group__6 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:339:2: rule__Submission__Group__5__Impl rule__Submission__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__5__Impl_in_rule__Submission__Group__5636);
            rule__Submission__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__6_in_rule__Submission__Group__5639);
            rule__Submission__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__5"


    // $ANTLR start "rule__Submission__Group__5__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:346:1: rule__Submission__Group__5__Impl : ( ( rule__Submission__Group_5__0 )? ) ;
    public final void rule__Submission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:350:1: ( ( ( rule__Submission__Group_5__0 )? ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:351:1: ( ( rule__Submission__Group_5__0 )? )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:351:1: ( ( rule__Submission__Group_5__0 )? )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:352:1: ( rule__Submission__Group_5__0 )?
            {
             before(grammarAccess.getSubmissionAccess().getGroup_5()); 
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:353:1: ( rule__Submission__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:353:2: rule__Submission__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Submission__Group_5__0_in_rule__Submission__Group__5__Impl666);
                    rule__Submission__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubmissionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__5__Impl"


    // $ANTLR start "rule__Submission__Group__6"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:363:1: rule__Submission__Group__6 : rule__Submission__Group__6__Impl ;
    public final void rule__Submission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:367:1: ( rule__Submission__Group__6__Impl )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:368:2: rule__Submission__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group__6__Impl_in_rule__Submission__Group__6697);
            rule__Submission__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__6"


    // $ANTLR start "rule__Submission__Group__6__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:374:1: rule__Submission__Group__6__Impl : ( '}' ) ;
    public final void rule__Submission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:378:1: ( ( '}' ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:379:1: ( '}' )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:379:1: ( '}' )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:380:1: '}'
            {
             before(grammarAccess.getSubmissionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Submission__Group__6__Impl725); 
             after(grammarAccess.getSubmissionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group__6__Impl"


    // $ANTLR start "rule__Submission__Group_4__0"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:407:1: rule__Submission__Group_4__0 : rule__Submission__Group_4__0__Impl rule__Submission__Group_4__1 ;
    public final void rule__Submission__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:411:1: ( rule__Submission__Group_4__0__Impl rule__Submission__Group_4__1 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:412:2: rule__Submission__Group_4__0__Impl rule__Submission__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group_4__0__Impl_in_rule__Submission__Group_4__0770);
            rule__Submission__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group_4__1_in_rule__Submission__Group_4__0773);
            rule__Submission__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group_4__0"


    // $ANTLR start "rule__Submission__Group_4__0__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:419:1: rule__Submission__Group_4__0__Impl : ( 'eMail' ) ;
    public final void rule__Submission__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:423:1: ( ( 'eMail' ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:424:1: ( 'eMail' )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:424:1: ( 'eMail' )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:425:1: 'eMail'
            {
             before(grammarAccess.getSubmissionAccess().getEMailKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Submission__Group_4__0__Impl801); 
             after(grammarAccess.getSubmissionAccess().getEMailKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group_4__0__Impl"


    // $ANTLR start "rule__Submission__Group_4__1"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:438:1: rule__Submission__Group_4__1 : rule__Submission__Group_4__1__Impl ;
    public final void rule__Submission__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:442:1: ( rule__Submission__Group_4__1__Impl )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:443:2: rule__Submission__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group_4__1__Impl_in_rule__Submission__Group_4__1832);
            rule__Submission__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group_4__1"


    // $ANTLR start "rule__Submission__Group_4__1__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:449:1: rule__Submission__Group_4__1__Impl : ( ( rule__Submission__EMailAssignment_4_1 ) ) ;
    public final void rule__Submission__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:453:1: ( ( ( rule__Submission__EMailAssignment_4_1 ) ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:454:1: ( ( rule__Submission__EMailAssignment_4_1 ) )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:454:1: ( ( rule__Submission__EMailAssignment_4_1 ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:455:1: ( rule__Submission__EMailAssignment_4_1 )
            {
             before(grammarAccess.getSubmissionAccess().getEMailAssignment_4_1()); 
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:456:1: ( rule__Submission__EMailAssignment_4_1 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:456:2: rule__Submission__EMailAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__EMailAssignment_4_1_in_rule__Submission__Group_4__1__Impl859);
            rule__Submission__EMailAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubmissionAccess().getEMailAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group_4__1__Impl"


    // $ANTLR start "rule__Submission__Group_5__0"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:470:1: rule__Submission__Group_5__0 : rule__Submission__Group_5__0__Impl rule__Submission__Group_5__1 ;
    public final void rule__Submission__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:474:1: ( rule__Submission__Group_5__0__Impl rule__Submission__Group_5__1 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:475:2: rule__Submission__Group_5__0__Impl rule__Submission__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group_5__0__Impl_in_rule__Submission__Group_5__0893);
            rule__Submission__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group_5__1_in_rule__Submission__Group_5__0896);
            rule__Submission__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group_5__0"


    // $ANTLR start "rule__Submission__Group_5__0__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:482:1: rule__Submission__Group_5__0__Impl : ( 'answer' ) ;
    public final void rule__Submission__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:486:1: ( ( 'answer' ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:487:1: ( 'answer' )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:487:1: ( 'answer' )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:488:1: 'answer'
            {
             before(grammarAccess.getSubmissionAccess().getAnswerKeyword_5_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Submission__Group_5__0__Impl924); 
             after(grammarAccess.getSubmissionAccess().getAnswerKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group_5__0__Impl"


    // $ANTLR start "rule__Submission__Group_5__1"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:501:1: rule__Submission__Group_5__1 : rule__Submission__Group_5__1__Impl ;
    public final void rule__Submission__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:505:1: ( rule__Submission__Group_5__1__Impl )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:506:2: rule__Submission__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__Group_5__1__Impl_in_rule__Submission__Group_5__1955);
            rule__Submission__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group_5__1"


    // $ANTLR start "rule__Submission__Group_5__1__Impl"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:512:1: rule__Submission__Group_5__1__Impl : ( ( rule__Submission__AnswerAssignment_5_1 ) ) ;
    public final void rule__Submission__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:516:1: ( ( ( rule__Submission__AnswerAssignment_5_1 ) ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:517:1: ( ( rule__Submission__AnswerAssignment_5_1 ) )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:517:1: ( ( rule__Submission__AnswerAssignment_5_1 ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:518:1: ( rule__Submission__AnswerAssignment_5_1 )
            {
             before(grammarAccess.getSubmissionAccess().getAnswerAssignment_5_1()); 
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:519:1: ( rule__Submission__AnswerAssignment_5_1 )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:519:2: rule__Submission__AnswerAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Submission__AnswerAssignment_5_1_in_rule__Submission__Group_5__1__Impl982);
            rule__Submission__AnswerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubmissionAccess().getAnswerAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__Group_5__1__Impl"


    // $ANTLR start "rule__Submission__NameAssignment_2"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:534:1: rule__Submission__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Submission__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:538:1: ( ( ruleEString ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:539:1: ( ruleEString )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:539:1: ( ruleEString )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:540:1: ruleEString
            {
             before(grammarAccess.getSubmissionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Submission__NameAssignment_21021);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubmissionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__NameAssignment_2"


    // $ANTLR start "rule__Submission__EMailAssignment_4_1"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:549:1: rule__Submission__EMailAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Submission__EMailAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:553:1: ( ( ruleEString ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:554:1: ( ruleEString )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:554:1: ( ruleEString )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:555:1: ruleEString
            {
             before(grammarAccess.getSubmissionAccess().getEMailEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Submission__EMailAssignment_4_11052);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubmissionAccess().getEMailEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__EMailAssignment_4_1"


    // $ANTLR start "rule__Submission__AnswerAssignment_5_1"
    // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:564:1: rule__Submission__AnswerAssignment_5_1 : ( ruleAnswer ) ;
    public final void rule__Submission__AnswerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:568:1: ( ( ruleAnswer ) )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:569:1: ( ruleAnswer )
            {
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:569:1: ( ruleAnswer )
            // ../submission.dsl.ui/src-gen/submission/dsl/ui/contentassist/antlr/internal/InternalSubmissionDsl.g:570:1: ruleAnswer
            {
             before(grammarAccess.getSubmissionAccess().getAnswerAnswerEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Submission__AnswerAssignment_5_11083);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSubmissionAccess().getAnswerAnswerEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Submission__AnswerAssignment_5_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSubmission_in_entryRuleSubmission61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubmission68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group__0_in_ruleSubmission94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Alternatives_in_ruleAnswer191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Answer__Alternatives276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Answer__Alternatives297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group__0__Impl_in_rule__Submission__Group__0330 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Submission__Group__1_in_rule__Submission__Group__0333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group__1__Impl_in_rule__Submission__Group__1391 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Submission__Group__2_in_rule__Submission__Group__1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Submission__Group__1__Impl422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group__2__Impl_in_rule__Submission__Group__2453 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Submission__Group__3_in_rule__Submission__Group__2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__NameAssignment_2_in_rule__Submission__Group__2__Impl483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group__3__Impl_in_rule__Submission__Group__3513 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_rule__Submission__Group__4_in_rule__Submission__Group__3516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Submission__Group__3__Impl544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group__4__Impl_in_rule__Submission__Group__4575 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_rule__Submission__Group__5_in_rule__Submission__Group__4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group_4__0_in_rule__Submission__Group__4__Impl605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group__5__Impl_in_rule__Submission__Group__5636 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_rule__Submission__Group__6_in_rule__Submission__Group__5639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group_5__0_in_rule__Submission__Group__5__Impl666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group__6__Impl_in_rule__Submission__Group__6697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Submission__Group__6__Impl725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group_4__0__Impl_in_rule__Submission__Group_4__0770 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Submission__Group_4__1_in_rule__Submission__Group_4__0773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Submission__Group_4__0__Impl801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group_4__1__Impl_in_rule__Submission__Group_4__1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__EMailAssignment_4_1_in_rule__Submission__Group_4__1__Impl859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group_5__0__Impl_in_rule__Submission__Group_5__0893 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Submission__Group_5__1_in_rule__Submission__Group_5__0896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Submission__Group_5__0__Impl924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__Group_5__1__Impl_in_rule__Submission__Group_5__1955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Submission__AnswerAssignment_5_1_in_rule__Submission__Group_5__1__Impl982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Submission__NameAssignment_21021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Submission__EMailAssignment_4_11052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Submission__AnswerAssignment_5_11083 = new BitSet(new long[]{0x0000000000000002L});
    }


}