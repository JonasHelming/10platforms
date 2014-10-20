/*
* generated by Xtext
*/
grammar InternalSubmissionDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package submission.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSubmission
entryRuleSubmission returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSubmissionRule()); }
	 iv_ruleSubmission=ruleSubmission 
	 { $current=$iv_ruleSubmission.current; } 
	 EOF 
;

// Rule Submission
ruleSubmission returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSubmissionAccess().getSubmissionAction_0(),
            $current);
    }
)	otherlv_1='Submission' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSubmissionAccess().getSubmissionKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSubmissionAccess().getNameEStringParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubmissionRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSubmissionAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='eMail' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSubmissionAccess().getEMailKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSubmissionAccess().getEMailEStringParserRuleCall_4_1_0()); 
	    }
		lv_eMail_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubmissionRule());
	        }
       		set(
       			$current, 
       			"eMail",
        		lv_eMail_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_6='answer' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSubmissionAccess().getAnswerKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSubmissionAccess().getAnswerAnswerEnumRuleCall_5_1_0()); 
	    }
		lv_answer_7_0=ruleAnswer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubmissionRule());
	        }
       		set(
       			$current, 
       			"answer",
        		lv_answer_7_0, 
        		"Answer");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSubmissionAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Rule Answer
ruleAnswer returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='A' 
	{
        $current = grammarAccess.getAnswerAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getAnswerAccess().getAEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='B' 
	{
        $current = grammarAccess.getAnswerAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getAnswerAccess().getBEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

