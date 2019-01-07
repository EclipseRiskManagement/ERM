package org.xtext.riskmanagement.parser.antlr.internal;

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
import org.xtext.riskmanagement.services.RMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'Asset'", "'{'", "'has'", "'('", "','", "')'", "'causes'", "'}'", "'Risk'", "'view'", "'occurrence'", "'impact'", "'produces'", "'Consequence'", "'-'", "'Opportunity'", "'Uncertainty'", "'Threat'", "'Scenario'", "'subscenario'", "'action'", "'Action'", "'asset'", "'Positive'", "'Neutral'", "'Negative'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRM.g"; }



     	private RMGrammarAccess grammarAccess;

        public InternalRMParser(TokenStream input, RMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRM.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRM.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalRM.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRM.g:72:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:78:2: ( ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRM.g:79:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRM.g:79:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRM.g:80:3: () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRM.g:80:3: ()
            // InternalRM.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            // InternalRM.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRM.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalRM.g:92:4: (lv_name_2_0= ruleEString )
            // InternalRM.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.riskmanagement.RM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRisk"
    // InternalRM.g:114:1: entryRuleRisk returns [EObject current=null] : iv_ruleRisk= ruleRisk EOF ;
    public final EObject entryRuleRisk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRisk = null;


        try {
            // InternalRM.g:114:45: (iv_ruleRisk= ruleRisk EOF )
            // InternalRM.g:115:2: iv_ruleRisk= ruleRisk EOF
            {
             newCompositeNode(grammarAccess.getRiskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRisk=ruleRisk();

            state._fsp--;

             current =iv_ruleRisk; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRisk"


    // $ANTLR start "ruleRisk"
    // InternalRM.g:121:1: ruleRisk returns [EObject current=null] : (this_Risk_Impl_0= ruleRisk_Impl | this_Opportunity_1= ruleOpportunity | this_Uncertainty_2= ruleUncertainty | this_Threat_3= ruleThreat ) ;
    public final EObject ruleRisk() throws RecognitionException {
        EObject current = null;

        EObject this_Risk_Impl_0 = null;

        EObject this_Opportunity_1 = null;

        EObject this_Uncertainty_2 = null;

        EObject this_Threat_3 = null;



        	enterRule();

        try {
            // InternalRM.g:127:2: ( (this_Risk_Impl_0= ruleRisk_Impl | this_Opportunity_1= ruleOpportunity | this_Uncertainty_2= ruleUncertainty | this_Threat_3= ruleThreat ) )
            // InternalRM.g:128:2: (this_Risk_Impl_0= ruleRisk_Impl | this_Opportunity_1= ruleOpportunity | this_Uncertainty_2= ruleUncertainty | this_Threat_3= ruleThreat )
            {
            // InternalRM.g:128:2: (this_Risk_Impl_0= ruleRisk_Impl | this_Opportunity_1= ruleOpportunity | this_Uncertainty_2= ruleUncertainty | this_Threat_3= ruleThreat )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRM.g:129:3: this_Risk_Impl_0= ruleRisk_Impl
                    {

                    			newCompositeNode(grammarAccess.getRiskAccess().getRisk_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Risk_Impl_0=ruleRisk_Impl();

                    state._fsp--;


                    			current = this_Risk_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRM.g:138:3: this_Opportunity_1= ruleOpportunity
                    {

                    			newCompositeNode(grammarAccess.getRiskAccess().getOpportunityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Opportunity_1=ruleOpportunity();

                    state._fsp--;


                    			current = this_Opportunity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRM.g:147:3: this_Uncertainty_2= ruleUncertainty
                    {

                    			newCompositeNode(grammarAccess.getRiskAccess().getUncertaintyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Uncertainty_2=ruleUncertainty();

                    state._fsp--;


                    			current = this_Uncertainty_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRM.g:156:3: this_Threat_3= ruleThreat
                    {

                    			newCompositeNode(grammarAccess.getRiskAccess().getThreatParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Threat_3=ruleThreat();

                    state._fsp--;


                    			current = this_Threat_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRisk"


    // $ANTLR start "entryRuleEString"
    // InternalRM.g:168:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRM.g:168:47: (iv_ruleEString= ruleEString EOF )
            // InternalRM.g:169:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRM.g:175:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRM.g:181:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRM.g:182:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRM.g:182:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRM.g:183:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRM.g:191:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAsset"
    // InternalRM.g:202:1: entryRuleAsset returns [EObject current=null] : iv_ruleAsset= ruleAsset EOF ;
    public final EObject entryRuleAsset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsset = null;


        try {
            // InternalRM.g:202:46: (iv_ruleAsset= ruleAsset EOF )
            // InternalRM.g:203:2: iv_ruleAsset= ruleAsset EOF
            {
             newCompositeNode(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsset=ruleAsset();

            state._fsp--;

             current =iv_ruleAsset; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAsset"


    // $ANTLR start "ruleAsset"
    // InternalRM.g:209:1: ruleAsset returns [EObject current=null] : (otherlv_0= 'Asset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'has' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'causes' otherlv_10= '{' ( (lv_causes_11_0= ruleRisk ) ) (otherlv_12= ',' ( (lv_causes_13_0= ruleRisk ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleAsset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_causes_11_0 = null;

        EObject lv_causes_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:215:2: ( (otherlv_0= 'Asset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'has' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'causes' otherlv_10= '{' ( (lv_causes_11_0= ruleRisk ) ) (otherlv_12= ',' ( (lv_causes_13_0= ruleRisk ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalRM.g:216:2: (otherlv_0= 'Asset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'has' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'causes' otherlv_10= '{' ( (lv_causes_11_0= ruleRisk ) ) (otherlv_12= ',' ( (lv_causes_13_0= ruleRisk ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalRM.g:216:2: (otherlv_0= 'Asset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'has' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'causes' otherlv_10= '{' ( (lv_causes_11_0= ruleRisk ) ) (otherlv_12= ',' ( (lv_causes_13_0= ruleRisk ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalRM.g:217:3: otherlv_0= 'Asset' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'has' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'causes' otherlv_10= '{' ( (lv_causes_11_0= ruleRisk ) ) (otherlv_12= ',' ( (lv_causes_13_0= ruleRisk ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssetAccess().getAssetKeyword_0());
            		
            // InternalRM.g:221:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRM.g:222:4: (lv_name_1_0= ruleEString )
            {
            // InternalRM.g:222:4: (lv_name_1_0= ruleEString )
            // InternalRM.g:223:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.riskmanagement.RM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAssetAccess().getHasKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAssetAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRM.g:252:3: ( ( ruleEString ) )
            // InternalRM.g:253:4: ( ruleEString )
            {
            // InternalRM.g:253:4: ( ruleEString )
            // InternalRM.g:254:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssetAccess().getHasVulnerableCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRM.g:268:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRM.g:269:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getAssetAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRM.g:273:4: ( ( ruleEString ) )
            	    // InternalRM.g:274:5: ( ruleEString )
            	    {
            	    // InternalRM.g:274:5: ( ruleEString )
            	    // InternalRM.g:275:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAssetRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAssetAccess().getHasVulnerableCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getAssetAccess().getRightParenthesisKeyword_7());
            		
            // InternalRM.g:294:3: (otherlv_9= 'causes' otherlv_10= '{' ( (lv_causes_11_0= ruleRisk ) ) (otherlv_12= ',' ( (lv_causes_13_0= ruleRisk ) ) )* otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRM.g:295:4: otherlv_9= 'causes' otherlv_10= '{' ( (lv_causes_11_0= ruleRisk ) ) (otherlv_12= ',' ( (lv_causes_13_0= ruleRisk ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssetAccess().getCausesKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getAssetAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRM.g:303:4: ( (lv_causes_11_0= ruleRisk ) )
                    // InternalRM.g:304:5: (lv_causes_11_0= ruleRisk )
                    {
                    // InternalRM.g:304:5: (lv_causes_11_0= ruleRisk )
                    // InternalRM.g:305:6: lv_causes_11_0= ruleRisk
                    {

                    						newCompositeNode(grammarAccess.getAssetAccess().getCausesRiskParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_causes_11_0=ruleRisk();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssetRule());
                    						}
                    						add(
                    							current,
                    							"causes",
                    							lv_causes_11_0,
                    							"org.xtext.riskmanagement.RM.Risk");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRM.g:322:4: (otherlv_12= ',' ( (lv_causes_13_0= ruleRisk ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRM.g:323:5: otherlv_12= ',' ( (lv_causes_13_0= ruleRisk ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAssetAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRM.g:327:5: ( (lv_causes_13_0= ruleRisk ) )
                    	    // InternalRM.g:328:6: (lv_causes_13_0= ruleRisk )
                    	    {
                    	    // InternalRM.g:328:6: (lv_causes_13_0= ruleRisk )
                    	    // InternalRM.g:329:7: lv_causes_13_0= ruleRisk
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssetAccess().getCausesRiskParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_causes_13_0=ruleRisk();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"causes",
                    	    								lv_causes_13_0,
                    	    								"org.xtext.riskmanagement.RM.Risk");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAssetAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleAsset"


    // $ANTLR start "entryRuleRisk_Impl"
    // InternalRM.g:360:1: entryRuleRisk_Impl returns [EObject current=null] : iv_ruleRisk_Impl= ruleRisk_Impl EOF ;
    public final EObject entryRuleRisk_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRisk_Impl = null;


        try {
            // InternalRM.g:360:50: (iv_ruleRisk_Impl= ruleRisk_Impl EOF )
            // InternalRM.g:361:2: iv_ruleRisk_Impl= ruleRisk_Impl EOF
            {
             newCompositeNode(grammarAccess.getRisk_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRisk_Impl=ruleRisk_Impl();

            state._fsp--;

             current =iv_ruleRisk_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRisk_Impl"


    // $ANTLR start "ruleRisk_Impl"
    // InternalRM.g:367:1: ruleRisk_Impl returns [EObject current=null] : (otherlv_0= 'Risk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleRisk_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_view_4_0 = null;

        AntlrDatatypeRuleToken lv_occurrence_6_0 = null;

        AntlrDatatypeRuleToken lv_impact_8_0 = null;

        EObject lv_produces_11_0 = null;

        EObject lv_produces_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:373:2: ( (otherlv_0= 'Risk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalRM.g:374:2: (otherlv_0= 'Risk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalRM.g:374:2: (otherlv_0= 'Risk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalRM.g:375:3: otherlv_0= 'Risk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRisk_ImplAccess().getRiskKeyword_0());
            		
            // InternalRM.g:379:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRM.g:380:4: (lv_name_1_0= ruleEString )
            {
            // InternalRM.g:380:4: (lv_name_1_0= ruleEString )
            // InternalRM.g:381:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRisk_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRisk_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.riskmanagement.RM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRisk_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRisk_ImplAccess().getViewKeyword_3());
            		
            // InternalRM.g:406:3: ( (lv_view_4_0= ruleView ) )
            // InternalRM.g:407:4: (lv_view_4_0= ruleView )
            {
            // InternalRM.g:407:4: (lv_view_4_0= ruleView )
            // InternalRM.g:408:5: lv_view_4_0= ruleView
            {

            					newCompositeNode(grammarAccess.getRisk_ImplAccess().getViewViewEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_view_4_0=ruleView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRisk_ImplRule());
            					}
            					set(
            						current,
            						"view",
            						lv_view_4_0,
            						"org.xtext.riskmanagement.RM.View");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getRisk_ImplAccess().getOccurrenceKeyword_5());
            		
            // InternalRM.g:429:3: ( (lv_occurrence_6_0= ruleEInt ) )
            // InternalRM.g:430:4: (lv_occurrence_6_0= ruleEInt )
            {
            // InternalRM.g:430:4: (lv_occurrence_6_0= ruleEInt )
            // InternalRM.g:431:5: lv_occurrence_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRisk_ImplAccess().getOccurrenceEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_occurrence_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRisk_ImplRule());
            					}
            					set(
            						current,
            						"occurrence",
            						lv_occurrence_6_0,
            						"org.xtext.riskmanagement.RM.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getRisk_ImplAccess().getImpactKeyword_7());
            		
            // InternalRM.g:452:3: ( (lv_impact_8_0= ruleEInt ) )
            // InternalRM.g:453:4: (lv_impact_8_0= ruleEInt )
            {
            // InternalRM.g:453:4: (lv_impact_8_0= ruleEInt )
            // InternalRM.g:454:5: lv_impact_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRisk_ImplAccess().getImpactEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_impact_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRisk_ImplRule());
            					}
            					set(
            						current,
            						"impact",
            						lv_impact_8_0,
            						"org.xtext.riskmanagement.RM.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getRisk_ImplAccess().getProducesKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getRisk_ImplAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalRM.g:479:3: ( (lv_produces_11_0= ruleConsequence ) )
            // InternalRM.g:480:4: (lv_produces_11_0= ruleConsequence )
            {
            // InternalRM.g:480:4: (lv_produces_11_0= ruleConsequence )
            // InternalRM.g:481:5: lv_produces_11_0= ruleConsequence
            {

            					newCompositeNode(grammarAccess.getRisk_ImplAccess().getProducesConsequenceParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
            lv_produces_11_0=ruleConsequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRisk_ImplRule());
            					}
            					add(
            						current,
            						"produces",
            						lv_produces_11_0,
            						"org.xtext.riskmanagement.RM.Consequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRM.g:498:3: (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRM.g:499:4: otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_18); 

            	    				newLeafNode(otherlv_12, grammarAccess.getRisk_ImplAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalRM.g:503:4: ( (lv_produces_13_0= ruleConsequence ) )
            	    // InternalRM.g:504:5: (lv_produces_13_0= ruleConsequence )
            	    {
            	    // InternalRM.g:504:5: (lv_produces_13_0= ruleConsequence )
            	    // InternalRM.g:505:6: lv_produces_13_0= ruleConsequence
            	    {

            	    						newCompositeNode(grammarAccess.getRisk_ImplAccess().getProducesConsequenceParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_produces_13_0=ruleConsequence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRisk_ImplRule());
            	    						}
            	    						add(
            	    							current,
            	    							"produces",
            	    							lv_produces_13_0,
            	    							"org.xtext.riskmanagement.RM.Consequence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getRisk_ImplAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRisk_ImplAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleRisk_Impl"


    // $ANTLR start "entryRuleConsequence"
    // InternalRM.g:535:1: entryRuleConsequence returns [EObject current=null] : iv_ruleConsequence= ruleConsequence EOF ;
    public final EObject entryRuleConsequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsequence = null;


        try {
            // InternalRM.g:535:52: (iv_ruleConsequence= ruleConsequence EOF )
            // InternalRM.g:536:2: iv_ruleConsequence= ruleConsequence EOF
            {
             newCompositeNode(grammarAccess.getConsequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsequence=ruleConsequence();

            state._fsp--;

             current =iv_ruleConsequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConsequence"


    // $ANTLR start "ruleConsequence"
    // InternalRM.g:542:1: ruleConsequence returns [EObject current=null] : ( () otherlv_1= 'Consequence' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleConsequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:548:2: ( ( () otherlv_1= 'Consequence' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRM.g:549:2: ( () otherlv_1= 'Consequence' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRM.g:549:2: ( () otherlv_1= 'Consequence' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRM.g:550:3: () otherlv_1= 'Consequence' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRM.g:550:3: ()
            // InternalRM.g:551:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConsequenceAccess().getConsequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConsequenceAccess().getConsequenceKeyword_1());
            		
            // InternalRM.g:561:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRM.g:562:4: (lv_name_2_0= ruleEString )
            {
            // InternalRM.g:562:4: (lv_name_2_0= ruleEString )
            // InternalRM.g:563:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConsequenceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConsequenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.riskmanagement.RM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleConsequence"


    // $ANTLR start "entryRuleEInt"
    // InternalRM.g:584:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRM.g:584:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRM.g:585:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRM.g:591:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRM.g:597:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRM.g:598:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRM.g:598:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRM.g:599:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRM.g:599:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRM.g:600:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleOpportunity"
    // InternalRM.g:617:1: entryRuleOpportunity returns [EObject current=null] : iv_ruleOpportunity= ruleOpportunity EOF ;
    public final EObject entryRuleOpportunity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpportunity = null;


        try {
            // InternalRM.g:617:52: (iv_ruleOpportunity= ruleOpportunity EOF )
            // InternalRM.g:618:2: iv_ruleOpportunity= ruleOpportunity EOF
            {
             newCompositeNode(grammarAccess.getOpportunityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpportunity=ruleOpportunity();

            state._fsp--;

             current =iv_ruleOpportunity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOpportunity"


    // $ANTLR start "ruleOpportunity"
    // InternalRM.g:624:1: ruleOpportunity returns [EObject current=null] : (otherlv_0= 'Opportunity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleOpportunity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_view_4_0 = null;

        AntlrDatatypeRuleToken lv_occurrence_6_0 = null;

        AntlrDatatypeRuleToken lv_impact_8_0 = null;

        EObject lv_produces_11_0 = null;

        EObject lv_produces_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:630:2: ( (otherlv_0= 'Opportunity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalRM.g:631:2: (otherlv_0= 'Opportunity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalRM.g:631:2: (otherlv_0= 'Opportunity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalRM.g:632:3: otherlv_0= 'Opportunity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpportunityAccess().getOpportunityKeyword_0());
            		
            // InternalRM.g:636:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRM.g:637:4: (lv_name_1_0= ruleEString )
            {
            // InternalRM.g:637:4: (lv_name_1_0= ruleEString )
            // InternalRM.g:638:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOpportunityAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpportunityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.riskmanagement.RM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getOpportunityAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getOpportunityAccess().getViewKeyword_3());
            		
            // InternalRM.g:663:3: ( (lv_view_4_0= ruleView ) )
            // InternalRM.g:664:4: (lv_view_4_0= ruleView )
            {
            // InternalRM.g:664:4: (lv_view_4_0= ruleView )
            // InternalRM.g:665:5: lv_view_4_0= ruleView
            {

            					newCompositeNode(grammarAccess.getOpportunityAccess().getViewViewEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_view_4_0=ruleView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpportunityRule());
            					}
            					set(
            						current,
            						"view",
            						lv_view_4_0,
            						"org.xtext.riskmanagement.RM.View");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getOpportunityAccess().getOccurrenceKeyword_5());
            		
            // InternalRM.g:686:3: ( (lv_occurrence_6_0= ruleEInt ) )
            // InternalRM.g:687:4: (lv_occurrence_6_0= ruleEInt )
            {
            // InternalRM.g:687:4: (lv_occurrence_6_0= ruleEInt )
            // InternalRM.g:688:5: lv_occurrence_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getOpportunityAccess().getOccurrenceEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_occurrence_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpportunityRule());
            					}
            					set(
            						current,
            						"occurrence",
            						lv_occurrence_6_0,
            						"org.xtext.riskmanagement.RM.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getOpportunityAccess().getImpactKeyword_7());
            		
            // InternalRM.g:709:3: ( (lv_impact_8_0= ruleEInt ) )
            // InternalRM.g:710:4: (lv_impact_8_0= ruleEInt )
            {
            // InternalRM.g:710:4: (lv_impact_8_0= ruleEInt )
            // InternalRM.g:711:5: lv_impact_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getOpportunityAccess().getImpactEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_impact_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpportunityRule());
            					}
            					set(
            						current,
            						"impact",
            						lv_impact_8_0,
            						"org.xtext.riskmanagement.RM.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getOpportunityAccess().getProducesKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getOpportunityAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalRM.g:736:3: ( (lv_produces_11_0= ruleConsequence ) )
            // InternalRM.g:737:4: (lv_produces_11_0= ruleConsequence )
            {
            // InternalRM.g:737:4: (lv_produces_11_0= ruleConsequence )
            // InternalRM.g:738:5: lv_produces_11_0= ruleConsequence
            {

            					newCompositeNode(grammarAccess.getOpportunityAccess().getProducesConsequenceParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
            lv_produces_11_0=ruleConsequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpportunityRule());
            					}
            					add(
            						current,
            						"produces",
            						lv_produces_11_0,
            						"org.xtext.riskmanagement.RM.Consequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRM.g:755:3: (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRM.g:756:4: otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_18); 

            	    				newLeafNode(otherlv_12, grammarAccess.getOpportunityAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalRM.g:760:4: ( (lv_produces_13_0= ruleConsequence ) )
            	    // InternalRM.g:761:5: (lv_produces_13_0= ruleConsequence )
            	    {
            	    // InternalRM.g:761:5: (lv_produces_13_0= ruleConsequence )
            	    // InternalRM.g:762:6: lv_produces_13_0= ruleConsequence
            	    {

            	    						newCompositeNode(grammarAccess.getOpportunityAccess().getProducesConsequenceParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_produces_13_0=ruleConsequence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOpportunityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"produces",
            	    							lv_produces_13_0,
            	    							"org.xtext.riskmanagement.RM.Consequence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getOpportunityAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getOpportunityAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleOpportunity"


    // $ANTLR start "entryRuleUncertainty"
    // InternalRM.g:792:1: entryRuleUncertainty returns [EObject current=null] : iv_ruleUncertainty= ruleUncertainty EOF ;
    public final EObject entryRuleUncertainty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUncertainty = null;


        try {
            // InternalRM.g:792:52: (iv_ruleUncertainty= ruleUncertainty EOF )
            // InternalRM.g:793:2: iv_ruleUncertainty= ruleUncertainty EOF
            {
             newCompositeNode(grammarAccess.getUncertaintyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUncertainty=ruleUncertainty();

            state._fsp--;

             current =iv_ruleUncertainty; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUncertainty"


    // $ANTLR start "ruleUncertainty"
    // InternalRM.g:799:1: ruleUncertainty returns [EObject current=null] : (otherlv_0= 'Uncertainty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleUncertainty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_view_4_0 = null;

        AntlrDatatypeRuleToken lv_occurrence_6_0 = null;

        AntlrDatatypeRuleToken lv_impact_8_0 = null;

        EObject lv_produces_11_0 = null;

        EObject lv_produces_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:805:2: ( (otherlv_0= 'Uncertainty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalRM.g:806:2: (otherlv_0= 'Uncertainty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalRM.g:806:2: (otherlv_0= 'Uncertainty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalRM.g:807:3: otherlv_0= 'Uncertainty' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUncertaintyAccess().getUncertaintyKeyword_0());
            		
            // InternalRM.g:811:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRM.g:812:4: (lv_name_1_0= ruleEString )
            {
            // InternalRM.g:812:4: (lv_name_1_0= ruleEString )
            // InternalRM.g:813:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUncertaintyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUncertaintyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.riskmanagement.RM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getUncertaintyAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getUncertaintyAccess().getViewKeyword_3());
            		
            // InternalRM.g:838:3: ( (lv_view_4_0= ruleView ) )
            // InternalRM.g:839:4: (lv_view_4_0= ruleView )
            {
            // InternalRM.g:839:4: (lv_view_4_0= ruleView )
            // InternalRM.g:840:5: lv_view_4_0= ruleView
            {

            					newCompositeNode(grammarAccess.getUncertaintyAccess().getViewViewEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_view_4_0=ruleView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUncertaintyRule());
            					}
            					set(
            						current,
            						"view",
            						lv_view_4_0,
            						"org.xtext.riskmanagement.RM.View");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getUncertaintyAccess().getOccurrenceKeyword_5());
            		
            // InternalRM.g:861:3: ( (lv_occurrence_6_0= ruleEInt ) )
            // InternalRM.g:862:4: (lv_occurrence_6_0= ruleEInt )
            {
            // InternalRM.g:862:4: (lv_occurrence_6_0= ruleEInt )
            // InternalRM.g:863:5: lv_occurrence_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUncertaintyAccess().getOccurrenceEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_occurrence_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUncertaintyRule());
            					}
            					set(
            						current,
            						"occurrence",
            						lv_occurrence_6_0,
            						"org.xtext.riskmanagement.RM.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getUncertaintyAccess().getImpactKeyword_7());
            		
            // InternalRM.g:884:3: ( (lv_impact_8_0= ruleEInt ) )
            // InternalRM.g:885:4: (lv_impact_8_0= ruleEInt )
            {
            // InternalRM.g:885:4: (lv_impact_8_0= ruleEInt )
            // InternalRM.g:886:5: lv_impact_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUncertaintyAccess().getImpactEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_impact_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUncertaintyRule());
            					}
            					set(
            						current,
            						"impact",
            						lv_impact_8_0,
            						"org.xtext.riskmanagement.RM.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getUncertaintyAccess().getProducesKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getUncertaintyAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalRM.g:911:3: ( (lv_produces_11_0= ruleConsequence ) )
            // InternalRM.g:912:4: (lv_produces_11_0= ruleConsequence )
            {
            // InternalRM.g:912:4: (lv_produces_11_0= ruleConsequence )
            // InternalRM.g:913:5: lv_produces_11_0= ruleConsequence
            {

            					newCompositeNode(grammarAccess.getUncertaintyAccess().getProducesConsequenceParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
            lv_produces_11_0=ruleConsequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUncertaintyRule());
            					}
            					add(
            						current,
            						"produces",
            						lv_produces_11_0,
            						"org.xtext.riskmanagement.RM.Consequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRM.g:930:3: (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRM.g:931:4: otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_18); 

            	    				newLeafNode(otherlv_12, grammarAccess.getUncertaintyAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalRM.g:935:4: ( (lv_produces_13_0= ruleConsequence ) )
            	    // InternalRM.g:936:5: (lv_produces_13_0= ruleConsequence )
            	    {
            	    // InternalRM.g:936:5: (lv_produces_13_0= ruleConsequence )
            	    // InternalRM.g:937:6: lv_produces_13_0= ruleConsequence
            	    {

            	    						newCompositeNode(grammarAccess.getUncertaintyAccess().getProducesConsequenceParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_produces_13_0=ruleConsequence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUncertaintyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"produces",
            	    							lv_produces_13_0,
            	    							"org.xtext.riskmanagement.RM.Consequence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getUncertaintyAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getUncertaintyAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleUncertainty"


    // $ANTLR start "entryRuleThreat"
    // InternalRM.g:967:1: entryRuleThreat returns [EObject current=null] : iv_ruleThreat= ruleThreat EOF ;
    public final EObject entryRuleThreat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreat = null;


        try {
            // InternalRM.g:967:47: (iv_ruleThreat= ruleThreat EOF )
            // InternalRM.g:968:2: iv_ruleThreat= ruleThreat EOF
            {
             newCompositeNode(grammarAccess.getThreatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThreat=ruleThreat();

            state._fsp--;

             current =iv_ruleThreat; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleThreat"


    // $ANTLR start "ruleThreat"
    // InternalRM.g:974:1: ruleThreat returns [EObject current=null] : (otherlv_0= 'Threat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleThreat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_view_4_0 = null;

        AntlrDatatypeRuleToken lv_occurrence_6_0 = null;

        AntlrDatatypeRuleToken lv_impact_8_0 = null;

        EObject lv_produces_11_0 = null;

        EObject lv_produces_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:980:2: ( (otherlv_0= 'Threat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalRM.g:981:2: (otherlv_0= 'Threat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalRM.g:981:2: (otherlv_0= 'Threat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalRM.g:982:3: otherlv_0= 'Threat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'view' ( (lv_view_4_0= ruleView ) ) otherlv_5= 'occurrence' ( (lv_occurrence_6_0= ruleEInt ) ) otherlv_7= 'impact' ( (lv_impact_8_0= ruleEInt ) ) otherlv_9= 'produces' otherlv_10= '{' ( (lv_produces_11_0= ruleConsequence ) ) (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getThreatAccess().getThreatKeyword_0());
            		
            // InternalRM.g:986:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRM.g:987:4: (lv_name_1_0= ruleEString )
            {
            // InternalRM.g:987:4: (lv_name_1_0= ruleEString )
            // InternalRM.g:988:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getThreatAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThreatRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.riskmanagement.RM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getThreatAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getThreatAccess().getViewKeyword_3());
            		
            // InternalRM.g:1013:3: ( (lv_view_4_0= ruleView ) )
            // InternalRM.g:1014:4: (lv_view_4_0= ruleView )
            {
            // InternalRM.g:1014:4: (lv_view_4_0= ruleView )
            // InternalRM.g:1015:5: lv_view_4_0= ruleView
            {

            					newCompositeNode(grammarAccess.getThreatAccess().getViewViewEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_view_4_0=ruleView();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThreatRule());
            					}
            					set(
            						current,
            						"view",
            						lv_view_4_0,
            						"org.xtext.riskmanagement.RM.View");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getThreatAccess().getOccurrenceKeyword_5());
            		
            // InternalRM.g:1036:3: ( (lv_occurrence_6_0= ruleEInt ) )
            // InternalRM.g:1037:4: (lv_occurrence_6_0= ruleEInt )
            {
            // InternalRM.g:1037:4: (lv_occurrence_6_0= ruleEInt )
            // InternalRM.g:1038:5: lv_occurrence_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getThreatAccess().getOccurrenceEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_occurrence_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThreatRule());
            					}
            					set(
            						current,
            						"occurrence",
            						lv_occurrence_6_0,
            						"org.xtext.riskmanagement.RM.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getThreatAccess().getImpactKeyword_7());
            		
            // InternalRM.g:1059:3: ( (lv_impact_8_0= ruleEInt ) )
            // InternalRM.g:1060:4: (lv_impact_8_0= ruleEInt )
            {
            // InternalRM.g:1060:4: (lv_impact_8_0= ruleEInt )
            // InternalRM.g:1061:5: lv_impact_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getThreatAccess().getImpactEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_impact_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThreatRule());
            					}
            					set(
            						current,
            						"impact",
            						lv_impact_8_0,
            						"org.xtext.riskmanagement.RM.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getThreatAccess().getProducesKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getThreatAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalRM.g:1086:3: ( (lv_produces_11_0= ruleConsequence ) )
            // InternalRM.g:1087:4: (lv_produces_11_0= ruleConsequence )
            {
            // InternalRM.g:1087:4: (lv_produces_11_0= ruleConsequence )
            // InternalRM.g:1088:5: lv_produces_11_0= ruleConsequence
            {

            					newCompositeNode(grammarAccess.getThreatAccess().getProducesConsequenceParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
            lv_produces_11_0=ruleConsequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThreatRule());
            					}
            					add(
            						current,
            						"produces",
            						lv_produces_11_0,
            						"org.xtext.riskmanagement.RM.Consequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRM.g:1105:3: (otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRM.g:1106:4: otherlv_12= ',' ( (lv_produces_13_0= ruleConsequence ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_18); 

            	    				newLeafNode(otherlv_12, grammarAccess.getThreatAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalRM.g:1110:4: ( (lv_produces_13_0= ruleConsequence ) )
            	    // InternalRM.g:1111:5: (lv_produces_13_0= ruleConsequence )
            	    {
            	    // InternalRM.g:1111:5: (lv_produces_13_0= ruleConsequence )
            	    // InternalRM.g:1112:6: lv_produces_13_0= ruleConsequence
            	    {

            	    						newCompositeNode(grammarAccess.getThreatAccess().getProducesConsequenceParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_produces_13_0=ruleConsequence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThreatRule());
            	    						}
            	    						add(
            	    							current,
            	    							"produces",
            	    							lv_produces_13_0,
            	    							"org.xtext.riskmanagement.RM.Consequence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getThreatAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getThreatAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleThreat"


    // $ANTLR start "entryRuleScenario"
    // InternalRM.g:1142:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalRM.g:1142:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalRM.g:1143:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalRM.g:1149:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subscenario' otherlv_4= '{' ( (lv_subscenario_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_subscenario_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'action' otherlv_10= '{' ( (lv_action_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_action_13_0= ruleAction ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subscenario_5_0 = null;

        EObject lv_subscenario_7_0 = null;

        EObject lv_action_11_0 = null;

        EObject lv_action_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1155:2: ( (otherlv_0= 'Scenario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subscenario' otherlv_4= '{' ( (lv_subscenario_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_subscenario_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'action' otherlv_10= '{' ( (lv_action_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_action_13_0= ruleAction ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalRM.g:1156:2: (otherlv_0= 'Scenario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subscenario' otherlv_4= '{' ( (lv_subscenario_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_subscenario_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'action' otherlv_10= '{' ( (lv_action_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_action_13_0= ruleAction ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalRM.g:1156:2: (otherlv_0= 'Scenario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subscenario' otherlv_4= '{' ( (lv_subscenario_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_subscenario_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'action' otherlv_10= '{' ( (lv_action_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_action_13_0= ruleAction ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalRM.g:1157:3: otherlv_0= 'Scenario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'subscenario' otherlv_4= '{' ( (lv_subscenario_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_subscenario_7_0= ruleScenario ) ) )* otherlv_8= '}' )? otherlv_9= 'action' otherlv_10= '{' ( (lv_action_11_0= ruleAction ) ) (otherlv_12= ',' ( (lv_action_13_0= ruleAction ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalRM.g:1161:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRM.g:1162:4: (lv_name_1_0= ruleEString )
            {
            // InternalRM.g:1162:4: (lv_name_1_0= ruleEString )
            // InternalRM.g:1163:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.riskmanagement.RM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRM.g:1184:3: (otherlv_3= 'subscenario' otherlv_4= '{' ( (lv_subscenario_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_subscenario_7_0= ruleScenario ) ) )* otherlv_8= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRM.g:1185:4: otherlv_3= 'subscenario' otherlv_4= '{' ( (lv_subscenario_5_0= ruleScenario ) ) (otherlv_6= ',' ( (lv_subscenario_7_0= ruleScenario ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getScenarioAccess().getSubscenarioKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRM.g:1193:4: ( (lv_subscenario_5_0= ruleScenario ) )
                    // InternalRM.g:1194:5: (lv_subscenario_5_0= ruleScenario )
                    {
                    // InternalRM.g:1194:5: (lv_subscenario_5_0= ruleScenario )
                    // InternalRM.g:1195:6: lv_subscenario_5_0= ruleScenario
                    {

                    						newCompositeNode(grammarAccess.getScenarioAccess().getSubscenarioScenarioParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subscenario_5_0=ruleScenario();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenarioRule());
                    						}
                    						add(
                    							current,
                    							"subscenario",
                    							lv_subscenario_5_0,
                    							"org.xtext.riskmanagement.RM.Scenario");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRM.g:1212:4: (otherlv_6= ',' ( (lv_subscenario_7_0= ruleScenario ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRM.g:1213:5: otherlv_6= ',' ( (lv_subscenario_7_0= ruleScenario ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_21); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getScenarioAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRM.g:1217:5: ( (lv_subscenario_7_0= ruleScenario ) )
                    	    // InternalRM.g:1218:6: (lv_subscenario_7_0= ruleScenario )
                    	    {
                    	    // InternalRM.g:1218:6: (lv_subscenario_7_0= ruleScenario )
                    	    // InternalRM.g:1219:7: lv_subscenario_7_0= ruleScenario
                    	    {

                    	    							newCompositeNode(grammarAccess.getScenarioAccess().getSubscenarioScenarioParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_subscenario_7_0=ruleScenario();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subscenario",
                    	    								lv_subscenario_7_0,
                    	    								"org.xtext.riskmanagement.RM.Scenario");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getScenarioAccess().getActionKeyword_4());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRM.g:1250:3: ( (lv_action_11_0= ruleAction ) )
            // InternalRM.g:1251:4: (lv_action_11_0= ruleAction )
            {
            // InternalRM.g:1251:4: (lv_action_11_0= ruleAction )
            // InternalRM.g:1252:5: lv_action_11_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getActionActionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_action_11_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_11_0,
            						"org.xtext.riskmanagement.RM.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRM.g:1269:3: (otherlv_12= ',' ( (lv_action_13_0= ruleAction ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRM.g:1270:4: otherlv_12= ',' ( (lv_action_13_0= ruleAction ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_23); 

            	    				newLeafNode(otherlv_12, grammarAccess.getScenarioAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalRM.g:1274:4: ( (lv_action_13_0= ruleAction ) )
            	    // InternalRM.g:1275:5: (lv_action_13_0= ruleAction )
            	    {
            	    // InternalRM.g:1275:5: (lv_action_13_0= ruleAction )
            	    // InternalRM.g:1276:6: lv_action_13_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getScenarioAccess().getActionActionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_action_13_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_13_0,
            	    							"org.xtext.riskmanagement.RM.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleAction"
    // InternalRM.g:1306:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRM.g:1306:47: (iv_ruleAction= ruleAction EOF )
            // InternalRM.g:1307:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRM.g:1313:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'asset' otherlv_5= '{' ( (lv_asset_6_0= ruleAsset ) ) (otherlv_7= ',' ( (lv_asset_8_0= ruleAsset ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_asset_6_0 = null;

        EObject lv_asset_8_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1319:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'asset' otherlv_5= '{' ( (lv_asset_6_0= ruleAsset ) ) (otherlv_7= ',' ( (lv_asset_8_0= ruleAsset ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRM.g:1320:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'asset' otherlv_5= '{' ( (lv_asset_6_0= ruleAsset ) ) (otherlv_7= ',' ( (lv_asset_8_0= ruleAsset ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRM.g:1320:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'asset' otherlv_5= '{' ( (lv_asset_6_0= ruleAsset ) ) (otherlv_7= ',' ( (lv_asset_8_0= ruleAsset ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRM.g:1321:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'asset' otherlv_5= '{' ( (lv_asset_6_0= ruleAsset ) ) (otherlv_7= ',' ( (lv_asset_8_0= ruleAsset ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalRM.g:1321:3: ()
            // InternalRM.g:1322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
            		
            // InternalRM.g:1332:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRM.g:1333:4: (lv_name_2_0= ruleEString )
            {
            // InternalRM.g:1333:4: (lv_name_2_0= ruleEString )
            // InternalRM.g:1334:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.riskmanagement.RM.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRM.g:1355:3: (otherlv_4= 'asset' otherlv_5= '{' ( (lv_asset_6_0= ruleAsset ) ) (otherlv_7= ',' ( (lv_asset_8_0= ruleAsset ) ) )* otherlv_9= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRM.g:1356:4: otherlv_4= 'asset' otherlv_5= '{' ( (lv_asset_6_0= ruleAsset ) ) (otherlv_7= ',' ( (lv_asset_8_0= ruleAsset ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getAssetKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRM.g:1364:4: ( (lv_asset_6_0= ruleAsset ) )
                    // InternalRM.g:1365:5: (lv_asset_6_0= ruleAsset )
                    {
                    // InternalRM.g:1365:5: (lv_asset_6_0= ruleAsset )
                    // InternalRM.g:1366:6: lv_asset_6_0= ruleAsset
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAssetAssetParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_asset_6_0=ruleAsset();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"asset",
                    							lv_asset_6_0,
                    							"org.xtext.riskmanagement.RM.Asset");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRM.g:1383:4: (otherlv_7= ',' ( (lv_asset_8_0= ruleAsset ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRM.g:1384:5: otherlv_7= ',' ( (lv_asset_8_0= ruleAsset ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_25); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getActionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRM.g:1388:5: ( (lv_asset_8_0= ruleAsset ) )
                    	    // InternalRM.g:1389:6: (lv_asset_8_0= ruleAsset )
                    	    {
                    	    // InternalRM.g:1389:6: (lv_asset_8_0= ruleAsset )
                    	    // InternalRM.g:1390:7: lv_asset_8_0= ruleAsset
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAssetAssetParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_asset_8_0=ruleAsset();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"asset",
                    	    								lv_asset_8_0,
                    	    								"org.xtext.riskmanagement.RM.Asset");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleView"
    // InternalRM.g:1421:1: ruleView returns [Enumerator current=null] : ( (enumLiteral_0= 'Positive' ) | (enumLiteral_1= 'Neutral' ) | (enumLiteral_2= 'Negative' ) ) ;
    public final Enumerator ruleView() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRM.g:1427:2: ( ( (enumLiteral_0= 'Positive' ) | (enumLiteral_1= 'Neutral' ) | (enumLiteral_2= 'Negative' ) ) )
            // InternalRM.g:1428:2: ( (enumLiteral_0= 'Positive' ) | (enumLiteral_1= 'Neutral' ) | (enumLiteral_2= 'Negative' ) )
            {
            // InternalRM.g:1428:2: ( (enumLiteral_0= 'Positive' ) | (enumLiteral_1= 'Neutral' ) | (enumLiteral_2= 'Negative' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case 37:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRM.g:1429:3: (enumLiteral_0= 'Positive' )
                    {
                    // InternalRM.g:1429:3: (enumLiteral_0= 'Positive' )
                    // InternalRM.g:1430:4: enumLiteral_0= 'Positive'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getViewAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getViewAccess().getPositiveEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRM.g:1437:3: (enumLiteral_1= 'Neutral' )
                    {
                    // InternalRM.g:1437:3: (enumLiteral_1= 'Neutral' )
                    // InternalRM.g:1438:4: enumLiteral_1= 'Neutral'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getViewAccess().getNeutralEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getViewAccess().getNeutralEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRM.g:1445:3: (enumLiteral_2= 'Negative' )
                    {
                    // InternalRM.g:1445:3: (enumLiteral_2= 'Negative' )
                    // InternalRM.g:1446:4: enumLiteral_2= 'Negative'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getViewAccess().getNegativeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getViewAccess().getNegativeEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleView"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000038100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});

}