package org.unipampa.lesse.parser.antlr.internal;

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
import org.unipampa.lesse.services.XCanopusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXCanopusParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WORKLOADGENERATED", "RULE_LOADGENERATORFORTHE", "RULE_ON", "RULE_THE", "RULE_ISTESTSCENARIO", "RULE_ATL", "RULE_INT", "RULE_MBWHEN_GREATEROREQUAL_TEXT", "RULE_MBWHEN_LESSTHAN_TEXT", "RULE_MBWHEN_MORETHAN_TEXT", "RULE_MBWHEN_MINOROREQUAL_TEXT", "RULE_SHOULDBELESSTHAN_TEXT", "RULE_SHOULDBEATLEAST_TEXT", "RULE_SHOULDBEGREATERTHAN", "RULE_WHENTHENUMBERISLESSTHAN_TEXT", "RULE_WHENTHENUMBERISGREATERTHAN_TEXT", "RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT", "RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT", "RULE_WHENTHENUMBERAREBETWEEN_TEXT", "RULE_AND", "RULE_ISMONITORED", "RULE_THAT", "RULE_MONITOREDBY", "RULE_MONITOR_TEXT", "RULE_STRING", "RULE_NNL", "RULE_NL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Feature:'", "'.'", "'Monitoring:'", "'description'", "'{'", "'}'", "'And'", "'When'", "'Then'", "'Given'", "'Scenario'", "'SUT'", "'memory'", "'disk'", "'web resources'", "'transaction'", "'processor'", "'available mbytes counter'", "'% idle time counter'", "'throughput mbytes'", "'transactions per second'", "'TPS'", "'% processor time count'", "'transactions response time'", "'DESKTOPAPP'", "'DATABASE'", "'WEBAPP'", "'WEBSERVICE'"
    };
    public static final int RULE_WHENTHENUMBERAREBETWEEN_TEXT=23;
    public static final int T__50=50;
    public static final int RULE_MONITOREDBY=27;
    public static final int RULE_ATL=10;
    public static final int RULE_ISMONITORED=25;
    public static final int RULE_SHOULDBEGREATERTHAN=18;
    public static final int T__59=59;
    public static final int RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT=21;
    public static final int T__55=55;
    public static final int RULE_ON=7;
    public static final int T__56=56;
    public static final int RULE_WHENTHENUMBERISLESSTHAN_TEXT=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_MBWHEN_MINOROREQUAL_TEXT=15;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_SHOULDBELESSTHAN_TEXT=16;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_THAT=26;
    public static final int RULE_ID=4;
    public static final int RULE_THE=8;
    public static final int RULE_INT=11;
    public static final int RULE_SHOULDBEATLEAST_TEXT=17;
    public static final int RULE_ML_COMMENT=32;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_MBWHEN_MORETHAN_TEXT=14;
    public static final int RULE_STRING=29;
    public static final int RULE_AND=24;
    public static final int RULE_MBWHEN_GREATEROREQUAL_TEXT=12;
    public static final int RULE_SL_COMMENT=33;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int RULE_WS=34;
    public static final int RULE_ISTESTSCENARIO=9;
    public static final int RULE_ANY_OTHER=35;
    public static final int RULE_WORKLOADGENERATED=5;
    public static final int RULE_MBWHEN_LESSTHAN_TEXT=13;
    public static final int RULE_NNL=30;
    public static final int RULE_MONITOR_TEXT=28;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_LOADGENERATORFORTHE=6;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT=22;
    public static final int T__47=47;
    public static final int RULE_NL=31;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_WHENTHENUMBERISGREATERTHAN_TEXT=20;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalXCanopusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXCanopusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXCanopusParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXCanopus.g"; }



     	private XCanopusGrammarAccess grammarAccess;

        public InternalXCanopusParser(TokenStream input, XCanopusGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected XCanopusGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalXCanopus.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalXCanopus.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalXCanopus.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalXCanopus.g:72:1: ruleModel returns [EObject current=null] : ( (lv_main_0_0= ruleMain ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:78:2: ( ( (lv_main_0_0= ruleMain ) )* )
            // InternalXCanopus.g:79:2: ( (lv_main_0_0= ruleMain ) )*
            {
            // InternalXCanopus.g:79:2: ( (lv_main_0_0= ruleMain ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36||(LA1_0>=46 && LA1_0<=47)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXCanopus.g:80:3: (lv_main_0_0= ruleMain )
            	    {
            	    // InternalXCanopus.g:80:3: (lv_main_0_0= ruleMain )
            	    // InternalXCanopus.g:81:4: lv_main_0_0= ruleMain
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getMainMainParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_main_0_0=ruleMain();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"main",
            	    					lv_main_0_0,
            	    					"org.unipampa.lesse.XCanopus.Main");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleMetricModel"
    // InternalXCanopus.g:101:1: entryRuleMetricModel returns [EObject current=null] : iv_ruleMetricModel= ruleMetricModel EOF ;
    public final EObject entryRuleMetricModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricModel = null;


        try {
            // InternalXCanopus.g:101:52: (iv_ruleMetricModel= ruleMetricModel EOF )
            // InternalXCanopus.g:102:2: iv_ruleMetricModel= ruleMetricModel EOF
            {
             newCompositeNode(grammarAccess.getMetricModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetricModel=ruleMetricModel();

            state._fsp--;

             current =iv_ruleMetricModel; 
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
    // $ANTLR end "entryRuleMetricModel"


    // $ANTLR start "ruleMetricModel"
    // InternalXCanopus.g:108:1: ruleMetricModel returns [EObject current=null] : (otherlv_0= 'Feature:' ruleFreetext otherlv_2= '.' otherlv_3= 'Monitoring:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' ruleFreetext otherlv_7= '.' otherlv_8= '{' ( (lv_steps_9_0= ruleSTEPS ) )+ otherlv_10= '}' ) ;
    public final EObject ruleMetricModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_steps_9_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:114:2: ( (otherlv_0= 'Feature:' ruleFreetext otherlv_2= '.' otherlv_3= 'Monitoring:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' ruleFreetext otherlv_7= '.' otherlv_8= '{' ( (lv_steps_9_0= ruleSTEPS ) )+ otherlv_10= '}' ) )
            // InternalXCanopus.g:115:2: (otherlv_0= 'Feature:' ruleFreetext otherlv_2= '.' otherlv_3= 'Monitoring:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' ruleFreetext otherlv_7= '.' otherlv_8= '{' ( (lv_steps_9_0= ruleSTEPS ) )+ otherlv_10= '}' )
            {
            // InternalXCanopus.g:115:2: (otherlv_0= 'Feature:' ruleFreetext otherlv_2= '.' otherlv_3= 'Monitoring:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' ruleFreetext otherlv_7= '.' otherlv_8= '{' ( (lv_steps_9_0= ruleSTEPS ) )+ otherlv_10= '}' )
            // InternalXCanopus.g:116:3: otherlv_0= 'Feature:' ruleFreetext otherlv_2= '.' otherlv_3= 'Monitoring:' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'description' ruleFreetext otherlv_7= '.' otherlv_8= '{' ( (lv_steps_9_0= ruleSTEPS ) )+ otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricModelAccess().getFeatureKeyword_0());
            		

            			newCompositeNode(grammarAccess.getMetricModelAccess().getFreetextParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            ruleFreetext();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricModelAccess().getFullStopKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMetricModelAccess().getMonitoringKeyword_3());
            		
            // InternalXCanopus.g:135:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalXCanopus.g:136:4: (lv_name_4_0= RULE_ID )
            {
            // InternalXCanopus.g:136:4: (lv_name_4_0= RULE_ID )
            // InternalXCanopus.g:137:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMetricModelAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetricModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.unipampa.lesse.XCanopus.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMetricModelAccess().getDescriptionKeyword_5());
            		

            			newCompositeNode(grammarAccess.getMetricModelAccess().getFreetextParserRuleCall_6());
            		
            pushFollow(FOLLOW_5);
            ruleFreetext();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_7=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getMetricModelAccess().getFullStopKeyword_7());
            		
            otherlv_8=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getMetricModelAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalXCanopus.g:172:3: ( (lv_steps_9_0= ruleSTEPS ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=42 && LA2_0<=45)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXCanopus.g:173:4: (lv_steps_9_0= ruleSTEPS )
            	    {
            	    // InternalXCanopus.g:173:4: (lv_steps_9_0= ruleSTEPS )
            	    // InternalXCanopus.g:174:5: lv_steps_9_0= ruleSTEPS
            	    {

            	    					newCompositeNode(grammarAccess.getMetricModelAccess().getStepsSTEPSParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_steps_9_0=ruleSTEPS();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetricModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_9_0,
            	    						"org.unipampa.lesse.XCanopus.STEPS");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_10=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMetricModelAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleMetricModel"


    // $ANTLR start "entryRuleMain"
    // InternalXCanopus.g:199:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalXCanopus.g:199:45: (iv_ruleMain= ruleMain EOF )
            // InternalXCanopus.g:200:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalXCanopus.g:206:1: ruleMain returns [EObject current=null] : ( ( (lv_main_0_1= ruleMetricModel | lv_main_0_2= ruleSCENARIO | lv_main_0_3= ruleSUT ) ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_1 = null;

        EObject lv_main_0_2 = null;

        EObject lv_main_0_3 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:212:2: ( ( ( (lv_main_0_1= ruleMetricModel | lv_main_0_2= ruleSCENARIO | lv_main_0_3= ruleSUT ) ) ) )
            // InternalXCanopus.g:213:2: ( ( (lv_main_0_1= ruleMetricModel | lv_main_0_2= ruleSCENARIO | lv_main_0_3= ruleSUT ) ) )
            {
            // InternalXCanopus.g:213:2: ( ( (lv_main_0_1= ruleMetricModel | lv_main_0_2= ruleSCENARIO | lv_main_0_3= ruleSUT ) ) )
            // InternalXCanopus.g:214:3: ( (lv_main_0_1= ruleMetricModel | lv_main_0_2= ruleSCENARIO | lv_main_0_3= ruleSUT ) )
            {
            // InternalXCanopus.g:214:3: ( (lv_main_0_1= ruleMetricModel | lv_main_0_2= ruleSCENARIO | lv_main_0_3= ruleSUT ) )
            // InternalXCanopus.g:215:4: (lv_main_0_1= ruleMetricModel | lv_main_0_2= ruleSCENARIO | lv_main_0_3= ruleSUT )
            {
            // InternalXCanopus.g:215:4: (lv_main_0_1= ruleMetricModel | lv_main_0_2= ruleSCENARIO | lv_main_0_3= ruleSUT )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 46:
                {
                alt3=2;
                }
                break;
            case 47:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXCanopus.g:216:5: lv_main_0_1= ruleMetricModel
                    {

                    					newCompositeNode(grammarAccess.getMainAccess().getMainMetricModelParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_main_0_1=ruleMetricModel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMainRule());
                    					}
                    					add(
                    						current,
                    						"main",
                    						lv_main_0_1,
                    						"org.unipampa.lesse.XCanopus.MetricModel");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:232:5: lv_main_0_2= ruleSCENARIO
                    {

                    					newCompositeNode(grammarAccess.getMainAccess().getMainSCENARIOParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_main_0_2=ruleSCENARIO();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMainRule());
                    					}
                    					add(
                    						current,
                    						"main",
                    						lv_main_0_2,
                    						"org.unipampa.lesse.XCanopus.SCENARIO");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:248:5: lv_main_0_3= ruleSUT
                    {

                    					newCompositeNode(grammarAccess.getMainAccess().getMainSUTParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_main_0_3=ruleSUT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMainRule());
                    					}
                    					add(
                    						current,
                    						"main",
                    						lv_main_0_3,
                    						"org.unipampa.lesse.XCanopus.SUT");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleFreetext"
    // InternalXCanopus.g:269:1: entryRuleFreetext returns [String current=null] : iv_ruleFreetext= ruleFreetext EOF ;
    public final String entryRuleFreetext() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFreetext = null;


        try {
            // InternalXCanopus.g:269:48: (iv_ruleFreetext= ruleFreetext EOF )
            // InternalXCanopus.g:270:2: iv_ruleFreetext= ruleFreetext EOF
            {
             newCompositeNode(grammarAccess.getFreetextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFreetext=ruleFreetext();

            state._fsp--;

             current =iv_ruleFreetext.getText(); 
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
    // $ANTLR end "entryRuleFreetext"


    // $ANTLR start "ruleFreetext"
    // InternalXCanopus.g:276:1: ruleFreetext returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString )* ;
    public final AntlrDatatypeRuleToken ruleFreetext() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:282:2: ( (this_EString_0= ruleEString )* )
            // InternalXCanopus.g:283:2: (this_EString_0= ruleEString )*
            {
            // InternalXCanopus.g:283:2: (this_EString_0= ruleEString )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXCanopus.g:284:3: this_EString_0= ruleEString
            	    {

            	    			newCompositeNode(grammarAccess.getFreetextAccess().getEStringParserRuleCall());
            	    		
            	    pushFollow(FOLLOW_12);
            	    this_EString_0=ruleEString();

            	    state._fsp--;


            	    			current.merge(this_EString_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleFreetext"


    // $ANTLR start "entryRuleSTEPS"
    // InternalXCanopus.g:298:1: entryRuleSTEPS returns [EObject current=null] : iv_ruleSTEPS= ruleSTEPS EOF ;
    public final EObject entryRuleSTEPS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTEPS = null;


        try {
            // InternalXCanopus.g:298:46: (iv_ruleSTEPS= ruleSTEPS EOF )
            // InternalXCanopus.g:299:2: iv_ruleSTEPS= ruleSTEPS EOF
            {
             newCompositeNode(grammarAccess.getSTEPSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTEPS=ruleSTEPS();

            state._fsp--;

             current =iv_ruleSTEPS; 
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
    // $ANTLR end "entryRuleSTEPS"


    // $ANTLR start "ruleSTEPS"
    // InternalXCanopus.g:305:1: ruleSTEPS returns [EObject current=null] : (this_given_0= rulegiven | this_when_1= rulewhen | this_then_2= rulethen | this_and_workload_3= ruleand_workload | this_and_atleast_4= ruleand_atleast | this_and_the_scenario_5= ruleand_the_scenario | this_and_the_metric_6= ruleand_the_metric ) ;
    public final EObject ruleSTEPS() throws RecognitionException {
        EObject current = null;

        EObject this_given_0 = null;

        EObject this_when_1 = null;

        EObject this_then_2 = null;

        EObject this_and_workload_3 = null;

        EObject this_and_atleast_4 = null;

        EObject this_and_the_scenario_5 = null;

        EObject this_and_the_metric_6 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:311:2: ( (this_given_0= rulegiven | this_when_1= rulewhen | this_then_2= rulethen | this_and_workload_3= ruleand_workload | this_and_atleast_4= ruleand_atleast | this_and_the_scenario_5= ruleand_the_scenario | this_and_the_metric_6= ruleand_the_metric ) )
            // InternalXCanopus.g:312:2: (this_given_0= rulegiven | this_when_1= rulewhen | this_then_2= rulethen | this_and_workload_3= ruleand_workload | this_and_atleast_4= ruleand_atleast | this_and_the_scenario_5= ruleand_the_scenario | this_and_the_metric_6= ruleand_the_metric )
            {
            // InternalXCanopus.g:312:2: (this_given_0= rulegiven | this_when_1= rulewhen | this_then_2= rulethen | this_and_workload_3= ruleand_workload | this_and_atleast_4= ruleand_atleast | this_and_the_scenario_5= ruleand_the_scenario | this_and_the_metric_6= ruleand_the_metric )
            int alt5=7;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalXCanopus.g:313:3: this_given_0= rulegiven
                    {

                    			newCompositeNode(grammarAccess.getSTEPSAccess().getGivenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_given_0=rulegiven();

                    state._fsp--;


                    			current = this_given_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:322:3: this_when_1= rulewhen
                    {

                    			newCompositeNode(grammarAccess.getSTEPSAccess().getWhenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_when_1=rulewhen();

                    state._fsp--;


                    			current = this_when_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:331:3: this_then_2= rulethen
                    {

                    			newCompositeNode(grammarAccess.getSTEPSAccess().getThenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_then_2=rulethen();

                    state._fsp--;


                    			current = this_then_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:340:3: this_and_workload_3= ruleand_workload
                    {

                    			newCompositeNode(grammarAccess.getSTEPSAccess().getAnd_workloadParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_and_workload_3=ruleand_workload();

                    state._fsp--;


                    			current = this_and_workload_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:349:3: this_and_atleast_4= ruleand_atleast
                    {

                    			newCompositeNode(grammarAccess.getSTEPSAccess().getAnd_atleastParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_and_atleast_4=ruleand_atleast();

                    state._fsp--;


                    			current = this_and_atleast_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXCanopus.g:358:3: this_and_the_scenario_5= ruleand_the_scenario
                    {

                    			newCompositeNode(grammarAccess.getSTEPSAccess().getAnd_the_scenarioParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_and_the_scenario_5=ruleand_the_scenario();

                    state._fsp--;


                    			current = this_and_the_scenario_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXCanopus.g:367:3: this_and_the_metric_6= ruleand_the_metric
                    {

                    			newCompositeNode(grammarAccess.getSTEPSAccess().getAnd_the_metricParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_and_the_metric_6=ruleand_the_metric();

                    state._fsp--;


                    			current = this_and_the_metric_6;
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
    // $ANTLR end "ruleSTEPS"


    // $ANTLR start "entryRuleand_workload"
    // InternalXCanopus.g:379:1: entryRuleand_workload returns [EObject current=null] : iv_ruleand_workload= ruleand_workload EOF ;
    public final EObject entryRuleand_workload() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleand_workload = null;


        try {
            // InternalXCanopus.g:379:53: (iv_ruleand_workload= ruleand_workload EOF )
            // InternalXCanopus.g:380:2: iv_ruleand_workload= ruleand_workload EOF
            {
             newCompositeNode(grammarAccess.getAnd_workloadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleand_workload=ruleand_workload();

            state._fsp--;

             current =iv_ruleand_workload; 
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
    // $ANTLR end "entryRuleand_workload"


    // $ANTLR start "ruleand_workload"
    // InternalXCanopus.g:386:1: ruleand_workload returns [EObject current=null] : (otherlv_0= 'And' this_WORKLOADGENERATED_1= RULE_WORKLOADGENERATED ( (otherlv_2= RULE_ID ) ) this_LOADGENERATORFORTHE_3= RULE_LOADGENERATORFORTHE ( (lv_suttype_4_0= ruleSUT_TYPE ) ) this_ON_5= RULE_ON ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleand_workload() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WORKLOADGENERATED_1=null;
        Token otherlv_2=null;
        Token this_LOADGENERATORFORTHE_3=null;
        Token this_ON_5=null;
        Token otherlv_6=null;
        Enumerator lv_suttype_4_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:392:2: ( (otherlv_0= 'And' this_WORKLOADGENERATED_1= RULE_WORKLOADGENERATED ( (otherlv_2= RULE_ID ) ) this_LOADGENERATORFORTHE_3= RULE_LOADGENERATORFORTHE ( (lv_suttype_4_0= ruleSUT_TYPE ) ) this_ON_5= RULE_ON ( (otherlv_6= RULE_ID ) ) ) )
            // InternalXCanopus.g:393:2: (otherlv_0= 'And' this_WORKLOADGENERATED_1= RULE_WORKLOADGENERATED ( (otherlv_2= RULE_ID ) ) this_LOADGENERATORFORTHE_3= RULE_LOADGENERATORFORTHE ( (lv_suttype_4_0= ruleSUT_TYPE ) ) this_ON_5= RULE_ON ( (otherlv_6= RULE_ID ) ) )
            {
            // InternalXCanopus.g:393:2: (otherlv_0= 'And' this_WORKLOADGENERATED_1= RULE_WORKLOADGENERATED ( (otherlv_2= RULE_ID ) ) this_LOADGENERATORFORTHE_3= RULE_LOADGENERATORFORTHE ( (lv_suttype_4_0= ruleSUT_TYPE ) ) this_ON_5= RULE_ON ( (otherlv_6= RULE_ID ) ) )
            // InternalXCanopus.g:394:3: otherlv_0= 'And' this_WORKLOADGENERATED_1= RULE_WORKLOADGENERATED ( (otherlv_2= RULE_ID ) ) this_LOADGENERATORFORTHE_3= RULE_LOADGENERATORFORTHE ( (lv_suttype_4_0= ruleSUT_TYPE ) ) this_ON_5= RULE_ON ( (otherlv_6= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAnd_workloadAccess().getAndKeyword_0());
            		
            this_WORKLOADGENERATED_1=(Token)match(input,RULE_WORKLOADGENERATED,FOLLOW_7); 

            			newLeafNode(this_WORKLOADGENERATED_1, grammarAccess.getAnd_workloadAccess().getWORKLOADGENERATEDTerminalRuleCall_1());
            		
            // InternalXCanopus.g:402:3: ( (otherlv_2= RULE_ID ) )
            // InternalXCanopus.g:403:4: (otherlv_2= RULE_ID )
            {
            // InternalXCanopus.g:403:4: (otherlv_2= RULE_ID )
            // InternalXCanopus.g:404:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnd_workloadRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_2, grammarAccess.getAnd_workloadAccess().getSut1SUTCrossReference_2_0());
            				

            }


            }

            this_LOADGENERATORFORTHE_3=(Token)match(input,RULE_LOADGENERATORFORTHE,FOLLOW_15); 

            			newLeafNode(this_LOADGENERATORFORTHE_3, grammarAccess.getAnd_workloadAccess().getLOADGENERATORFORTHETerminalRuleCall_3());
            		
            // InternalXCanopus.g:419:3: ( (lv_suttype_4_0= ruleSUT_TYPE ) )
            // InternalXCanopus.g:420:4: (lv_suttype_4_0= ruleSUT_TYPE )
            {
            // InternalXCanopus.g:420:4: (lv_suttype_4_0= ruleSUT_TYPE )
            // InternalXCanopus.g:421:5: lv_suttype_4_0= ruleSUT_TYPE
            {

            					newCompositeNode(grammarAccess.getAnd_workloadAccess().getSuttypeSUT_TYPEEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_suttype_4_0=ruleSUT_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnd_workloadRule());
            					}
            					set(
            						current,
            						"suttype",
            						lv_suttype_4_0,
            						"org.unipampa.lesse.XCanopus.SUT_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ON_5=(Token)match(input,RULE_ON,FOLLOW_7); 

            			newLeafNode(this_ON_5, grammarAccess.getAnd_workloadAccess().getONTerminalRuleCall_5());
            		
            // InternalXCanopus.g:442:3: ( (otherlv_6= RULE_ID ) )
            // InternalXCanopus.g:443:4: (otherlv_6= RULE_ID )
            {
            // InternalXCanopus.g:443:4: (otherlv_6= RULE_ID )
            // InternalXCanopus.g:444:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnd_workloadRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_6, grammarAccess.getAnd_workloadAccess().getSut2SUTCrossReference_6_0());
            				

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
    // $ANTLR end "ruleand_workload"


    // $ANTLR start "entryRuleand_the_scenario"
    // InternalXCanopus.g:459:1: entryRuleand_the_scenario returns [EObject current=null] : iv_ruleand_the_scenario= ruleand_the_scenario EOF ;
    public final EObject entryRuleand_the_scenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleand_the_scenario = null;


        try {
            // InternalXCanopus.g:459:57: (iv_ruleand_the_scenario= ruleand_the_scenario EOF )
            // InternalXCanopus.g:460:2: iv_ruleand_the_scenario= ruleand_the_scenario EOF
            {
             newCompositeNode(grammarAccess.getAnd_the_scenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleand_the_scenario=ruleand_the_scenario();

            state._fsp--;

             current =iv_ruleand_the_scenario; 
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
    // $ANTLR end "entryRuleand_the_scenario"


    // $ANTLR start "ruleand_the_scenario"
    // InternalXCanopus.g:466:1: ruleand_the_scenario returns [EObject current=null] : (otherlv_0= 'And' this_THE_1= RULE_THE ( (otherlv_2= RULE_ID ) ) this_ISTESTSCENARIO_3= RULE_ISTESTSCENARIO ) ;
    public final EObject ruleand_the_scenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_THE_1=null;
        Token otherlv_2=null;
        Token this_ISTESTSCENARIO_3=null;


        	enterRule();

        try {
            // InternalXCanopus.g:472:2: ( (otherlv_0= 'And' this_THE_1= RULE_THE ( (otherlv_2= RULE_ID ) ) this_ISTESTSCENARIO_3= RULE_ISTESTSCENARIO ) )
            // InternalXCanopus.g:473:2: (otherlv_0= 'And' this_THE_1= RULE_THE ( (otherlv_2= RULE_ID ) ) this_ISTESTSCENARIO_3= RULE_ISTESTSCENARIO )
            {
            // InternalXCanopus.g:473:2: (otherlv_0= 'And' this_THE_1= RULE_THE ( (otherlv_2= RULE_ID ) ) this_ISTESTSCENARIO_3= RULE_ISTESTSCENARIO )
            // InternalXCanopus.g:474:3: otherlv_0= 'And' this_THE_1= RULE_THE ( (otherlv_2= RULE_ID ) ) this_ISTESTSCENARIO_3= RULE_ISTESTSCENARIO
            {
            otherlv_0=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAnd_the_scenarioAccess().getAndKeyword_0());
            		
            this_THE_1=(Token)match(input,RULE_THE,FOLLOW_7); 

            			newLeafNode(this_THE_1, grammarAccess.getAnd_the_scenarioAccess().getTHETerminalRuleCall_1());
            		
            // InternalXCanopus.g:482:3: ( (otherlv_2= RULE_ID ) )
            // InternalXCanopus.g:483:4: (otherlv_2= RULE_ID )
            {
            // InternalXCanopus.g:483:4: (otherlv_2= RULE_ID )
            // InternalXCanopus.g:484:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnd_the_scenarioRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getAnd_the_scenarioAccess().getScenarioSCENARIOCrossReference_2_0());
            				

            }


            }

            this_ISTESTSCENARIO_3=(Token)match(input,RULE_ISTESTSCENARIO,FOLLOW_2); 

            			newLeafNode(this_ISTESTSCENARIO_3, grammarAccess.getAnd_the_scenarioAccess().getISTESTSCENARIOTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleand_the_scenario"


    // $ANTLR start "entryRuleand_atleast"
    // InternalXCanopus.g:503:1: entryRuleand_atleast returns [EObject current=null] : iv_ruleand_atleast= ruleand_atleast EOF ;
    public final EObject entryRuleand_atleast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleand_atleast = null;


        try {
            // InternalXCanopus.g:503:52: (iv_ruleand_atleast= ruleand_atleast EOF )
            // InternalXCanopus.g:504:2: iv_ruleand_atleast= ruleand_atleast EOF
            {
             newCompositeNode(grammarAccess.getAnd_atleastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleand_atleast=ruleand_atleast();

            state._fsp--;

             current =iv_ruleand_atleast; 
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
    // $ANTLR end "entryRuleand_atleast"


    // $ANTLR start "ruleand_atleast"
    // InternalXCanopus.g:510:1: ruleand_atleast returns [EObject current=null] : (otherlv_0= 'And' this_ATL_1= RULE_ATL ( (lv_integer1_2_0= RULE_INT ) ) (this_MBWHEN_GREATEROREQUAL_TEXT_3= RULE_MBWHEN_GREATEROREQUAL_TEXT | this_MBWHEN_LESSTHAN_TEXT_4= RULE_MBWHEN_LESSTHAN_TEXT | this_MBWHEN_MORETHAN_TEXT_5= RULE_MBWHEN_MORETHAN_TEXT | this_MBWHEN_MINOROREQUAL_TEXT_6= RULE_MBWHEN_MINOROREQUAL_TEXT ) ( (lv_integer2_7_0= RULE_INT ) ) ) ;
    public final EObject ruleand_atleast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ATL_1=null;
        Token lv_integer1_2_0=null;
        Token this_MBWHEN_GREATEROREQUAL_TEXT_3=null;
        Token this_MBWHEN_LESSTHAN_TEXT_4=null;
        Token this_MBWHEN_MORETHAN_TEXT_5=null;
        Token this_MBWHEN_MINOROREQUAL_TEXT_6=null;
        Token lv_integer2_7_0=null;


        	enterRule();

        try {
            // InternalXCanopus.g:516:2: ( (otherlv_0= 'And' this_ATL_1= RULE_ATL ( (lv_integer1_2_0= RULE_INT ) ) (this_MBWHEN_GREATEROREQUAL_TEXT_3= RULE_MBWHEN_GREATEROREQUAL_TEXT | this_MBWHEN_LESSTHAN_TEXT_4= RULE_MBWHEN_LESSTHAN_TEXT | this_MBWHEN_MORETHAN_TEXT_5= RULE_MBWHEN_MORETHAN_TEXT | this_MBWHEN_MINOROREQUAL_TEXT_6= RULE_MBWHEN_MINOROREQUAL_TEXT ) ( (lv_integer2_7_0= RULE_INT ) ) ) )
            // InternalXCanopus.g:517:2: (otherlv_0= 'And' this_ATL_1= RULE_ATL ( (lv_integer1_2_0= RULE_INT ) ) (this_MBWHEN_GREATEROREQUAL_TEXT_3= RULE_MBWHEN_GREATEROREQUAL_TEXT | this_MBWHEN_LESSTHAN_TEXT_4= RULE_MBWHEN_LESSTHAN_TEXT | this_MBWHEN_MORETHAN_TEXT_5= RULE_MBWHEN_MORETHAN_TEXT | this_MBWHEN_MINOROREQUAL_TEXT_6= RULE_MBWHEN_MINOROREQUAL_TEXT ) ( (lv_integer2_7_0= RULE_INT ) ) )
            {
            // InternalXCanopus.g:517:2: (otherlv_0= 'And' this_ATL_1= RULE_ATL ( (lv_integer1_2_0= RULE_INT ) ) (this_MBWHEN_GREATEROREQUAL_TEXT_3= RULE_MBWHEN_GREATEROREQUAL_TEXT | this_MBWHEN_LESSTHAN_TEXT_4= RULE_MBWHEN_LESSTHAN_TEXT | this_MBWHEN_MORETHAN_TEXT_5= RULE_MBWHEN_MORETHAN_TEXT | this_MBWHEN_MINOROREQUAL_TEXT_6= RULE_MBWHEN_MINOROREQUAL_TEXT ) ( (lv_integer2_7_0= RULE_INT ) ) )
            // InternalXCanopus.g:518:3: otherlv_0= 'And' this_ATL_1= RULE_ATL ( (lv_integer1_2_0= RULE_INT ) ) (this_MBWHEN_GREATEROREQUAL_TEXT_3= RULE_MBWHEN_GREATEROREQUAL_TEXT | this_MBWHEN_LESSTHAN_TEXT_4= RULE_MBWHEN_LESSTHAN_TEXT | this_MBWHEN_MORETHAN_TEXT_5= RULE_MBWHEN_MORETHAN_TEXT | this_MBWHEN_MINOROREQUAL_TEXT_6= RULE_MBWHEN_MINOROREQUAL_TEXT ) ( (lv_integer2_7_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAnd_atleastAccess().getAndKeyword_0());
            		
            this_ATL_1=(Token)match(input,RULE_ATL,FOLLOW_20); 

            			newLeafNode(this_ATL_1, grammarAccess.getAnd_atleastAccess().getATLTerminalRuleCall_1());
            		
            // InternalXCanopus.g:526:3: ( (lv_integer1_2_0= RULE_INT ) )
            // InternalXCanopus.g:527:4: (lv_integer1_2_0= RULE_INT )
            {
            // InternalXCanopus.g:527:4: (lv_integer1_2_0= RULE_INT )
            // InternalXCanopus.g:528:5: lv_integer1_2_0= RULE_INT
            {
            lv_integer1_2_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_integer1_2_0, grammarAccess.getAnd_atleastAccess().getInteger1INTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnd_atleastRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integer1",
            						lv_integer1_2_0,
            						"org.unipampa.lesse.XCanopus.INT");
            				

            }


            }

            // InternalXCanopus.g:544:3: (this_MBWHEN_GREATEROREQUAL_TEXT_3= RULE_MBWHEN_GREATEROREQUAL_TEXT | this_MBWHEN_LESSTHAN_TEXT_4= RULE_MBWHEN_LESSTHAN_TEXT | this_MBWHEN_MORETHAN_TEXT_5= RULE_MBWHEN_MORETHAN_TEXT | this_MBWHEN_MINOROREQUAL_TEXT_6= RULE_MBWHEN_MINOROREQUAL_TEXT )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_MBWHEN_GREATEROREQUAL_TEXT:
                {
                alt6=1;
                }
                break;
            case RULE_MBWHEN_LESSTHAN_TEXT:
                {
                alt6=2;
                }
                break;
            case RULE_MBWHEN_MORETHAN_TEXT:
                {
                alt6=3;
                }
                break;
            case RULE_MBWHEN_MINOROREQUAL_TEXT:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXCanopus.g:545:4: this_MBWHEN_GREATEROREQUAL_TEXT_3= RULE_MBWHEN_GREATEROREQUAL_TEXT
                    {
                    this_MBWHEN_GREATEROREQUAL_TEXT_3=(Token)match(input,RULE_MBWHEN_GREATEROREQUAL_TEXT,FOLLOW_20); 

                    				newLeafNode(this_MBWHEN_GREATEROREQUAL_TEXT_3, grammarAccess.getAnd_atleastAccess().getMBWHEN_GREATEROREQUAL_TEXTTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:550:4: this_MBWHEN_LESSTHAN_TEXT_4= RULE_MBWHEN_LESSTHAN_TEXT
                    {
                    this_MBWHEN_LESSTHAN_TEXT_4=(Token)match(input,RULE_MBWHEN_LESSTHAN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_MBWHEN_LESSTHAN_TEXT_4, grammarAccess.getAnd_atleastAccess().getMBWHEN_LESSTHAN_TEXTTerminalRuleCall_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:555:4: this_MBWHEN_MORETHAN_TEXT_5= RULE_MBWHEN_MORETHAN_TEXT
                    {
                    this_MBWHEN_MORETHAN_TEXT_5=(Token)match(input,RULE_MBWHEN_MORETHAN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_MBWHEN_MORETHAN_TEXT_5, grammarAccess.getAnd_atleastAccess().getMBWHEN_MORETHAN_TEXTTerminalRuleCall_3_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:560:4: this_MBWHEN_MINOROREQUAL_TEXT_6= RULE_MBWHEN_MINOROREQUAL_TEXT
                    {
                    this_MBWHEN_MINOROREQUAL_TEXT_6=(Token)match(input,RULE_MBWHEN_MINOROREQUAL_TEXT,FOLLOW_20); 

                    				newLeafNode(this_MBWHEN_MINOROREQUAL_TEXT_6, grammarAccess.getAnd_atleastAccess().getMBWHEN_MINOROREQUAL_TEXTTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }

            // InternalXCanopus.g:565:3: ( (lv_integer2_7_0= RULE_INT ) )
            // InternalXCanopus.g:566:4: (lv_integer2_7_0= RULE_INT )
            {
            // InternalXCanopus.g:566:4: (lv_integer2_7_0= RULE_INT )
            // InternalXCanopus.g:567:5: lv_integer2_7_0= RULE_INT
            {
            lv_integer2_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_integer2_7_0, grammarAccess.getAnd_atleastAccess().getInteger2INTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnd_atleastRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integer2",
            						lv_integer2_7_0,
            						"org.unipampa.lesse.XCanopus.INT");
            				

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
    // $ANTLR end "ruleand_atleast"


    // $ANTLR start "entryRuleand_the_metric"
    // InternalXCanopus.g:587:1: entryRuleand_the_metric returns [EObject current=null] : iv_ruleand_the_metric= ruleand_the_metric EOF ;
    public final EObject entryRuleand_the_metric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleand_the_metric = null;


        try {
            // InternalXCanopus.g:587:55: (iv_ruleand_the_metric= ruleand_the_metric EOF )
            // InternalXCanopus.g:588:2: iv_ruleand_the_metric= ruleand_the_metric EOF
            {
             newCompositeNode(grammarAccess.getAnd_the_metricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleand_the_metric=ruleand_the_metric();

            state._fsp--;

             current =iv_ruleand_the_metric; 
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
    // $ANTLR end "entryRuleand_the_metric"


    // $ANTLR start "ruleand_the_metric"
    // InternalXCanopus.g:594:1: ruleand_the_metric returns [EObject current=null] : (otherlv_0= 'And' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )? ) ;
    public final EObject ruleand_the_metric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_THE_1=null;
        Token this_SHOULDBELESSTHAN_TEXT_3=null;
        Token this_SHOULDBEATLEAST_TEXT_4=null;
        Token this_SHOULDBEGREATERTHAN_5=null;
        Token lv_integer1_6_0=null;
        Token this_WHENTHENUMBERISLESSTHAN_TEXT_7=null;
        Token this_WHENTHENUMBERISGREATERTHAN_TEXT_8=null;
        Token this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9=null;
        Token this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10=null;
        Token this_WHENTHENUMBERAREBETWEEN_TEXT_11=null;
        Token lv_integer2_12_0=null;
        Token this_AND_13=null;
        Token lv_integer3_14_0=null;
        Enumerator lv_metric_2_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:600:2: ( (otherlv_0= 'And' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )? ) )
            // InternalXCanopus.g:601:2: (otherlv_0= 'And' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )? )
            {
            // InternalXCanopus.g:601:2: (otherlv_0= 'And' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )? )
            // InternalXCanopus.g:602:3: otherlv_0= 'And' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAnd_the_metricAccess().getAndKeyword_0());
            		
            this_THE_1=(Token)match(input,RULE_THE,FOLLOW_22); 

            			newLeafNode(this_THE_1, grammarAccess.getAnd_the_metricAccess().getTHETerminalRuleCall_1());
            		
            // InternalXCanopus.g:610:3: ( (lv_metric_2_0= ruleMETRICTYPE ) )
            // InternalXCanopus.g:611:4: (lv_metric_2_0= ruleMETRICTYPE )
            {
            // InternalXCanopus.g:611:4: (lv_metric_2_0= ruleMETRICTYPE )
            // InternalXCanopus.g:612:5: lv_metric_2_0= ruleMETRICTYPE
            {

            					newCompositeNode(grammarAccess.getAnd_the_metricAccess().getMetricMETRICTYPEEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_metric_2_0=ruleMETRICTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnd_the_metricRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_2_0,
            						"org.unipampa.lesse.XCanopus.METRICTYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXCanopus.g:629:3: (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_SHOULDBELESSTHAN_TEXT:
                {
                alt7=1;
                }
                break;
            case RULE_SHOULDBEATLEAST_TEXT:
                {
                alt7=2;
                }
                break;
            case RULE_SHOULDBEGREATERTHAN:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXCanopus.g:630:4: this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT
                    {
                    this_SHOULDBELESSTHAN_TEXT_3=(Token)match(input,RULE_SHOULDBELESSTHAN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_SHOULDBELESSTHAN_TEXT_3, grammarAccess.getAnd_the_metricAccess().getSHOULDBELESSTHAN_TEXTTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:635:4: this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT
                    {
                    this_SHOULDBEATLEAST_TEXT_4=(Token)match(input,RULE_SHOULDBEATLEAST_TEXT,FOLLOW_20); 

                    				newLeafNode(this_SHOULDBEATLEAST_TEXT_4, grammarAccess.getAnd_the_metricAccess().getSHOULDBEATLEAST_TEXTTerminalRuleCall_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:640:4: this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN
                    {
                    this_SHOULDBEGREATERTHAN_5=(Token)match(input,RULE_SHOULDBEGREATERTHAN,FOLLOW_20); 

                    				newLeafNode(this_SHOULDBEGREATERTHAN_5, grammarAccess.getAnd_the_metricAccess().getSHOULDBEGREATERTHANTerminalRuleCall_3_2());
                    			

                    }
                    break;

            }

            // InternalXCanopus.g:645:3: ( (lv_integer1_6_0= RULE_INT ) )
            // InternalXCanopus.g:646:4: (lv_integer1_6_0= RULE_INT )
            {
            // InternalXCanopus.g:646:4: (lv_integer1_6_0= RULE_INT )
            // InternalXCanopus.g:647:5: lv_integer1_6_0= RULE_INT
            {
            lv_integer1_6_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_integer1_6_0, grammarAccess.getAnd_the_metricAccess().getInteger1INTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnd_the_metricRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integer1",
            						lv_integer1_6_0,
            						"org.unipampa.lesse.XCanopus.INT");
            				

            }


            }

            // InternalXCanopus.g:663:3: (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_WHENTHENUMBERISLESSTHAN_TEXT:
                {
                alt8=1;
                }
                break;
            case RULE_WHENTHENUMBERISGREATERTHAN_TEXT:
                {
                alt8=2;
                }
                break;
            case RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT:
                {
                alt8=3;
                }
                break;
            case RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT:
                {
                alt8=4;
                }
                break;
            case RULE_WHENTHENUMBERAREBETWEEN_TEXT:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXCanopus.g:664:4: this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT
                    {
                    this_WHENTHENUMBERISLESSTHAN_TEXT_7=(Token)match(input,RULE_WHENTHENUMBERISLESSTHAN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERISLESSTHAN_TEXT_7, grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERISLESSTHAN_TEXTTerminalRuleCall_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:669:4: this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT
                    {
                    this_WHENTHENUMBERISGREATERTHAN_TEXT_8=(Token)match(input,RULE_WHENTHENUMBERISGREATERTHAN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERISGREATERTHAN_TEXT_8, grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERISGREATERTHAN_TEXTTerminalRuleCall_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:674:4: this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT
                    {
                    this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9=(Token)match(input,RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9, grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERISGREATEROREQUAL_TEXTTerminalRuleCall_5_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:679:4: this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT
                    {
                    this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10=(Token)match(input,RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10, grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERIRLESSEROREQUAL_TEXTTerminalRuleCall_5_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:684:4: this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT
                    {
                    this_WHENTHENUMBERAREBETWEEN_TEXT_11=(Token)match(input,RULE_WHENTHENUMBERAREBETWEEN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERAREBETWEEN_TEXT_11, grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERAREBETWEEN_TEXTTerminalRuleCall_5_4());
                    			

                    }
                    break;

            }

            // InternalXCanopus.g:689:3: ( (lv_integer2_12_0= RULE_INT ) )
            // InternalXCanopus.g:690:4: (lv_integer2_12_0= RULE_INT )
            {
            // InternalXCanopus.g:690:4: (lv_integer2_12_0= RULE_INT )
            // InternalXCanopus.g:691:5: lv_integer2_12_0= RULE_INT
            {
            lv_integer2_12_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_integer2_12_0, grammarAccess.getAnd_the_metricAccess().getInteger2INTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnd_the_metricRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integer2",
            						lv_integer2_12_0,
            						"org.unipampa.lesse.XCanopus.INT");
            				

            }


            }

            // InternalXCanopus.g:707:3: (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_AND) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXCanopus.g:708:4: this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) )
                    {
                    this_AND_13=(Token)match(input,RULE_AND,FOLLOW_20); 

                    				newLeafNode(this_AND_13, grammarAccess.getAnd_the_metricAccess().getANDTerminalRuleCall_7_0());
                    			
                    // InternalXCanopus.g:712:4: ( (lv_integer3_14_0= RULE_INT ) )
                    // InternalXCanopus.g:713:5: (lv_integer3_14_0= RULE_INT )
                    {
                    // InternalXCanopus.g:713:5: (lv_integer3_14_0= RULE_INT )
                    // InternalXCanopus.g:714:6: lv_integer3_14_0= RULE_INT
                    {
                    lv_integer3_14_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_integer3_14_0, grammarAccess.getAnd_the_metricAccess().getInteger3INTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAnd_the_metricRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"integer3",
                    							lv_integer3_14_0,
                    							"org.unipampa.lesse.XCanopus.INT");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleand_the_metric"


    // $ANTLR start "entryRulewhen"
    // InternalXCanopus.g:735:1: entryRulewhen returns [EObject current=null] : iv_rulewhen= rulewhen EOF ;
    public final EObject entryRulewhen() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhen = null;


        try {
            // InternalXCanopus.g:735:45: (iv_rulewhen= rulewhen EOF )
            // InternalXCanopus.g:736:2: iv_rulewhen= rulewhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewhen=rulewhen();

            state._fsp--;

             current =iv_rulewhen; 
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
    // $ANTLR end "entryRulewhen"


    // $ANTLR start "rulewhen"
    // InternalXCanopus.g:742:1: rulewhen returns [EObject current=null] : (otherlv_0= 'When' this_THE_1= RULE_THE ( (lv_metrictype_2_0= ruleMETRICTYPEMONITORED ) ) this_ISMONITORED_3= RULE_ISMONITORED ) ;
    public final EObject rulewhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_THE_1=null;
        Token this_ISMONITORED_3=null;
        Enumerator lv_metrictype_2_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:748:2: ( (otherlv_0= 'When' this_THE_1= RULE_THE ( (lv_metrictype_2_0= ruleMETRICTYPEMONITORED ) ) this_ISMONITORED_3= RULE_ISMONITORED ) )
            // InternalXCanopus.g:749:2: (otherlv_0= 'When' this_THE_1= RULE_THE ( (lv_metrictype_2_0= ruleMETRICTYPEMONITORED ) ) this_ISMONITORED_3= RULE_ISMONITORED )
            {
            // InternalXCanopus.g:749:2: (otherlv_0= 'When' this_THE_1= RULE_THE ( (lv_metrictype_2_0= ruleMETRICTYPEMONITORED ) ) this_ISMONITORED_3= RULE_ISMONITORED )
            // InternalXCanopus.g:750:3: otherlv_0= 'When' this_THE_1= RULE_THE ( (lv_metrictype_2_0= ruleMETRICTYPEMONITORED ) ) this_ISMONITORED_3= RULE_ISMONITORED
            {
            otherlv_0=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            this_THE_1=(Token)match(input,RULE_THE,FOLLOW_26); 

            			newLeafNode(this_THE_1, grammarAccess.getWhenAccess().getTHETerminalRuleCall_1());
            		
            // InternalXCanopus.g:758:3: ( (lv_metrictype_2_0= ruleMETRICTYPEMONITORED ) )
            // InternalXCanopus.g:759:4: (lv_metrictype_2_0= ruleMETRICTYPEMONITORED )
            {
            // InternalXCanopus.g:759:4: (lv_metrictype_2_0= ruleMETRICTYPEMONITORED )
            // InternalXCanopus.g:760:5: lv_metrictype_2_0= ruleMETRICTYPEMONITORED
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getMetrictypeMETRICTYPEMONITOREDEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_metrictype_2_0=ruleMETRICTYPEMONITORED();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"metrictype",
            						lv_metrictype_2_0,
            						"org.unipampa.lesse.XCanopus.METRICTYPEMONITORED");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ISMONITORED_3=(Token)match(input,RULE_ISMONITORED,FOLLOW_2); 

            			newLeafNode(this_ISMONITORED_3, grammarAccess.getWhenAccess().getISMONITOREDTerminalRuleCall_3());
            		

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
    // $ANTLR end "rulewhen"


    // $ANTLR start "entryRulethen"
    // InternalXCanopus.g:785:1: entryRulethen returns [EObject current=null] : iv_rulethen= rulethen EOF ;
    public final EObject entryRulethen() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethen = null;


        try {
            // InternalXCanopus.g:785:45: (iv_rulethen= rulethen EOF )
            // InternalXCanopus.g:786:2: iv_rulethen= rulethen EOF
            {
             newCompositeNode(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethen=rulethen();

            state._fsp--;

             current =iv_rulethen; 
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
    // $ANTLR end "entryRulethen"


    // $ANTLR start "rulethen"
    // InternalXCanopus.g:792:1: rulethen returns [EObject current=null] : (otherlv_0= 'Then' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )? ) ;
    public final EObject rulethen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_THE_1=null;
        Token this_SHOULDBELESSTHAN_TEXT_3=null;
        Token this_SHOULDBEATLEAST_TEXT_4=null;
        Token this_SHOULDBEGREATERTHAN_5=null;
        Token lv_integer1_6_0=null;
        Token this_WHENTHENUMBERISLESSTHAN_TEXT_7=null;
        Token this_WHENTHENUMBERISGREATERTHAN_TEXT_8=null;
        Token this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9=null;
        Token this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10=null;
        Token this_WHENTHENUMBERAREBETWEEN_TEXT_11=null;
        Token lv_integer2_12_0=null;
        Token this_AND_13=null;
        Token lv_integer3_14_0=null;
        Enumerator lv_metric_2_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:798:2: ( (otherlv_0= 'Then' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )? ) )
            // InternalXCanopus.g:799:2: (otherlv_0= 'Then' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )? )
            {
            // InternalXCanopus.g:799:2: (otherlv_0= 'Then' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )? )
            // InternalXCanopus.g:800:3: otherlv_0= 'Then' this_THE_1= RULE_THE ( (lv_metric_2_0= ruleMETRICTYPE ) ) (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN ) ( (lv_integer1_6_0= RULE_INT ) ) (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT ) ( (lv_integer2_12_0= RULE_INT ) ) (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getThenKeyword_0());
            		
            this_THE_1=(Token)match(input,RULE_THE,FOLLOW_22); 

            			newLeafNode(this_THE_1, grammarAccess.getThenAccess().getTHETerminalRuleCall_1());
            		
            // InternalXCanopus.g:808:3: ( (lv_metric_2_0= ruleMETRICTYPE ) )
            // InternalXCanopus.g:809:4: (lv_metric_2_0= ruleMETRICTYPE )
            {
            // InternalXCanopus.g:809:4: (lv_metric_2_0= ruleMETRICTYPE )
            // InternalXCanopus.g:810:5: lv_metric_2_0= ruleMETRICTYPE
            {

            					newCompositeNode(grammarAccess.getThenAccess().getMetricMETRICTYPEEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_metric_2_0=ruleMETRICTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThenRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_2_0,
            						"org.unipampa.lesse.XCanopus.METRICTYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXCanopus.g:827:3: (this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT | this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT | this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_SHOULDBELESSTHAN_TEXT:
                {
                alt10=1;
                }
                break;
            case RULE_SHOULDBEATLEAST_TEXT:
                {
                alt10=2;
                }
                break;
            case RULE_SHOULDBEGREATERTHAN:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalXCanopus.g:828:4: this_SHOULDBELESSTHAN_TEXT_3= RULE_SHOULDBELESSTHAN_TEXT
                    {
                    this_SHOULDBELESSTHAN_TEXT_3=(Token)match(input,RULE_SHOULDBELESSTHAN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_SHOULDBELESSTHAN_TEXT_3, grammarAccess.getThenAccess().getSHOULDBELESSTHAN_TEXTTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:833:4: this_SHOULDBEATLEAST_TEXT_4= RULE_SHOULDBEATLEAST_TEXT
                    {
                    this_SHOULDBEATLEAST_TEXT_4=(Token)match(input,RULE_SHOULDBEATLEAST_TEXT,FOLLOW_20); 

                    				newLeafNode(this_SHOULDBEATLEAST_TEXT_4, grammarAccess.getThenAccess().getSHOULDBEATLEAST_TEXTTerminalRuleCall_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:838:4: this_SHOULDBEGREATERTHAN_5= RULE_SHOULDBEGREATERTHAN
                    {
                    this_SHOULDBEGREATERTHAN_5=(Token)match(input,RULE_SHOULDBEGREATERTHAN,FOLLOW_20); 

                    				newLeafNode(this_SHOULDBEGREATERTHAN_5, grammarAccess.getThenAccess().getSHOULDBEGREATERTHANTerminalRuleCall_3_2());
                    			

                    }
                    break;

            }

            // InternalXCanopus.g:843:3: ( (lv_integer1_6_0= RULE_INT ) )
            // InternalXCanopus.g:844:4: (lv_integer1_6_0= RULE_INT )
            {
            // InternalXCanopus.g:844:4: (lv_integer1_6_0= RULE_INT )
            // InternalXCanopus.g:845:5: lv_integer1_6_0= RULE_INT
            {
            lv_integer1_6_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_integer1_6_0, grammarAccess.getThenAccess().getInteger1INTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integer1",
            						lv_integer1_6_0,
            						"org.unipampa.lesse.XCanopus.INT");
            				

            }


            }

            // InternalXCanopus.g:861:3: (this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT | this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT | this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT | this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT | this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT )
            int alt11=5;
            switch ( input.LA(1) ) {
            case RULE_WHENTHENUMBERISLESSTHAN_TEXT:
                {
                alt11=1;
                }
                break;
            case RULE_WHENTHENUMBERISGREATERTHAN_TEXT:
                {
                alt11=2;
                }
                break;
            case RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT:
                {
                alt11=3;
                }
                break;
            case RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT:
                {
                alt11=4;
                }
                break;
            case RULE_WHENTHENUMBERAREBETWEEN_TEXT:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXCanopus.g:862:4: this_WHENTHENUMBERISLESSTHAN_TEXT_7= RULE_WHENTHENUMBERISLESSTHAN_TEXT
                    {
                    this_WHENTHENUMBERISLESSTHAN_TEXT_7=(Token)match(input,RULE_WHENTHENUMBERISLESSTHAN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERISLESSTHAN_TEXT_7, grammarAccess.getThenAccess().getWHENTHENUMBERISLESSTHAN_TEXTTerminalRuleCall_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:867:4: this_WHENTHENUMBERISGREATERTHAN_TEXT_8= RULE_WHENTHENUMBERISGREATERTHAN_TEXT
                    {
                    this_WHENTHENUMBERISGREATERTHAN_TEXT_8=(Token)match(input,RULE_WHENTHENUMBERISGREATERTHAN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERISGREATERTHAN_TEXT_8, grammarAccess.getThenAccess().getWHENTHENUMBERISGREATERTHAN_TEXTTerminalRuleCall_5_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:872:4: this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9= RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT
                    {
                    this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9=(Token)match(input,RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERISGREATEROREQUAL_TEXT_9, grammarAccess.getThenAccess().getWHENTHENUMBERISGREATEROREQUAL_TEXTTerminalRuleCall_5_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:877:4: this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10= RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT
                    {
                    this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10=(Token)match(input,RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERIRLESSEROREQUAL_TEXT_10, grammarAccess.getThenAccess().getWHENTHENUMBERIRLESSEROREQUAL_TEXTTerminalRuleCall_5_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:882:4: this_WHENTHENUMBERAREBETWEEN_TEXT_11= RULE_WHENTHENUMBERAREBETWEEN_TEXT
                    {
                    this_WHENTHENUMBERAREBETWEEN_TEXT_11=(Token)match(input,RULE_WHENTHENUMBERAREBETWEEN_TEXT,FOLLOW_20); 

                    				newLeafNode(this_WHENTHENUMBERAREBETWEEN_TEXT_11, grammarAccess.getThenAccess().getWHENTHENUMBERAREBETWEEN_TEXTTerminalRuleCall_5_4());
                    			

                    }
                    break;

            }

            // InternalXCanopus.g:887:3: ( (lv_integer2_12_0= RULE_INT ) )
            // InternalXCanopus.g:888:4: (lv_integer2_12_0= RULE_INT )
            {
            // InternalXCanopus.g:888:4: (lv_integer2_12_0= RULE_INT )
            // InternalXCanopus.g:889:5: lv_integer2_12_0= RULE_INT
            {
            lv_integer2_12_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_integer2_12_0, grammarAccess.getThenAccess().getInteger2INTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integer2",
            						lv_integer2_12_0,
            						"org.unipampa.lesse.XCanopus.INT");
            				

            }


            }

            // InternalXCanopus.g:905:3: (this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_AND) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXCanopus.g:906:4: this_AND_13= RULE_AND ( (lv_integer3_14_0= RULE_INT ) )
                    {
                    this_AND_13=(Token)match(input,RULE_AND,FOLLOW_20); 

                    				newLeafNode(this_AND_13, grammarAccess.getThenAccess().getANDTerminalRuleCall_7_0());
                    			
                    // InternalXCanopus.g:910:4: ( (lv_integer3_14_0= RULE_INT ) )
                    // InternalXCanopus.g:911:5: (lv_integer3_14_0= RULE_INT )
                    {
                    // InternalXCanopus.g:911:5: (lv_integer3_14_0= RULE_INT )
                    // InternalXCanopus.g:912:6: lv_integer3_14_0= RULE_INT
                    {
                    lv_integer3_14_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_integer3_14_0, grammarAccess.getThenAccess().getInteger3INTTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThenRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"integer3",
                    							lv_integer3_14_0,
                    							"org.unipampa.lesse.XCanopus.INT");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulethen"


    // $ANTLR start "entryRulegiven"
    // InternalXCanopus.g:933:1: entryRulegiven returns [EObject current=null] : iv_rulegiven= rulegiven EOF ;
    public final EObject entryRulegiven() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegiven = null;


        try {
            // InternalXCanopus.g:933:46: (iv_rulegiven= rulegiven EOF )
            // InternalXCanopus.g:934:2: iv_rulegiven= rulegiven EOF
            {
             newCompositeNode(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegiven=rulegiven();

            state._fsp--;

             current =iv_rulegiven; 
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
    // $ANTLR end "entryRulegiven"


    // $ANTLR start "rulegiven"
    // InternalXCanopus.g:940:1: rulegiven returns [EObject current=null] : (otherlv_0= 'Given' this_THAT_1= RULE_THAT ( (otherlv_2= RULE_ID ) ) ( (lv_suttype_3_0= ruleSUT_TYPE ) ) this_MONITOREDBY_4= RULE_MONITOREDBY ( (otherlv_5= RULE_ID ) ) this_MONITOR_TEXT_6= RULE_MONITOR_TEXT ) ;
    public final EObject rulegiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_THAT_1=null;
        Token otherlv_2=null;
        Token this_MONITOREDBY_4=null;
        Token otherlv_5=null;
        Token this_MONITOR_TEXT_6=null;
        Enumerator lv_suttype_3_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:946:2: ( (otherlv_0= 'Given' this_THAT_1= RULE_THAT ( (otherlv_2= RULE_ID ) ) ( (lv_suttype_3_0= ruleSUT_TYPE ) ) this_MONITOREDBY_4= RULE_MONITOREDBY ( (otherlv_5= RULE_ID ) ) this_MONITOR_TEXT_6= RULE_MONITOR_TEXT ) )
            // InternalXCanopus.g:947:2: (otherlv_0= 'Given' this_THAT_1= RULE_THAT ( (otherlv_2= RULE_ID ) ) ( (lv_suttype_3_0= ruleSUT_TYPE ) ) this_MONITOREDBY_4= RULE_MONITOREDBY ( (otherlv_5= RULE_ID ) ) this_MONITOR_TEXT_6= RULE_MONITOR_TEXT )
            {
            // InternalXCanopus.g:947:2: (otherlv_0= 'Given' this_THAT_1= RULE_THAT ( (otherlv_2= RULE_ID ) ) ( (lv_suttype_3_0= ruleSUT_TYPE ) ) this_MONITOREDBY_4= RULE_MONITOREDBY ( (otherlv_5= RULE_ID ) ) this_MONITOR_TEXT_6= RULE_MONITOR_TEXT )
            // InternalXCanopus.g:948:3: otherlv_0= 'Given' this_THAT_1= RULE_THAT ( (otherlv_2= RULE_ID ) ) ( (lv_suttype_3_0= ruleSUT_TYPE ) ) this_MONITOREDBY_4= RULE_MONITOREDBY ( (otherlv_5= RULE_ID ) ) this_MONITOR_TEXT_6= RULE_MONITOR_TEXT
            {
            otherlv_0=(Token)match(input,45,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getGivenKeyword_0());
            		
            this_THAT_1=(Token)match(input,RULE_THAT,FOLLOW_7); 

            			newLeafNode(this_THAT_1, grammarAccess.getGivenAccess().getTHATTerminalRuleCall_1());
            		
            // InternalXCanopus.g:956:3: ( (otherlv_2= RULE_ID ) )
            // InternalXCanopus.g:957:4: (otherlv_2= RULE_ID )
            {
            // InternalXCanopus.g:957:4: (otherlv_2= RULE_ID )
            // InternalXCanopus.g:958:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getGivenAccess().getSut1SUTCrossReference_2_0());
            				

            }


            }

            // InternalXCanopus.g:969:3: ( (lv_suttype_3_0= ruleSUT_TYPE ) )
            // InternalXCanopus.g:970:4: (lv_suttype_3_0= ruleSUT_TYPE )
            {
            // InternalXCanopus.g:970:4: (lv_suttype_3_0= ruleSUT_TYPE )
            // InternalXCanopus.g:971:5: lv_suttype_3_0= ruleSUT_TYPE
            {

            					newCompositeNode(grammarAccess.getGivenAccess().getSuttypeSUT_TYPEEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_suttype_3_0=ruleSUT_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGivenRule());
            					}
            					set(
            						current,
            						"suttype",
            						lv_suttype_3_0,
            						"org.unipampa.lesse.XCanopus.SUT_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_MONITOREDBY_4=(Token)match(input,RULE_MONITOREDBY,FOLLOW_7); 

            			newLeafNode(this_MONITOREDBY_4, grammarAccess.getGivenAccess().getMONITOREDBYTerminalRuleCall_4());
            		
            // InternalXCanopus.g:992:3: ( (otherlv_5= RULE_ID ) )
            // InternalXCanopus.g:993:4: (otherlv_5= RULE_ID )
            {
            // InternalXCanopus.g:993:4: (otherlv_5= RULE_ID )
            // InternalXCanopus.g:994:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_5, grammarAccess.getGivenAccess().getSut2SUTCrossReference_5_0());
            				

            }


            }

            this_MONITOR_TEXT_6=(Token)match(input,RULE_MONITOR_TEXT,FOLLOW_2); 

            			newLeafNode(this_MONITOR_TEXT_6, grammarAccess.getGivenAccess().getMONITOR_TEXTTerminalRuleCall_6());
            		

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
    // $ANTLR end "rulegiven"


    // $ANTLR start "entryRuleSCENARIO"
    // InternalXCanopus.g:1013:1: entryRuleSCENARIO returns [EObject current=null] : iv_ruleSCENARIO= ruleSCENARIO EOF ;
    public final EObject entryRuleSCENARIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCENARIO = null;


        try {
            // InternalXCanopus.g:1013:49: (iv_ruleSCENARIO= ruleSCENARIO EOF )
            // InternalXCanopus.g:1014:2: iv_ruleSCENARIO= ruleSCENARIO EOF
            {
             newCompositeNode(grammarAccess.getSCENARIORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCENARIO=ruleSCENARIO();

            state._fsp--;

             current =iv_ruleSCENARIO; 
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
    // $ANTLR end "entryRuleSCENARIO"


    // $ANTLR start "ruleSCENARIO"
    // InternalXCanopus.g:1020:1: ruleSCENARIO returns [EObject current=null] : (otherlv_0= 'Scenario' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject ruleSCENARIO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1026:2: ( (otherlv_0= 'Scenario' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) )
            // InternalXCanopus.g:1027:2: (otherlv_0= 'Scenario' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            {
            // InternalXCanopus.g:1027:2: (otherlv_0= 'Scenario' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            // InternalXCanopus.g:1028:3: otherlv_0= 'Scenario' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSCENARIOAccess().getScenarioKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSCENARIOAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXCanopus.g:1036:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXCanopus.g:1037:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXCanopus.g:1037:4: (lv_name_2_0= RULE_ID )
            // InternalXCanopus.g:1038:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSCENARIOAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSCENARIORule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.unipampa.lesse.XCanopus.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSCENARIOAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSCENARIO"


    // $ANTLR start "entryRuleSUT"
    // InternalXCanopus.g:1062:1: entryRuleSUT returns [EObject current=null] : iv_ruleSUT= ruleSUT EOF ;
    public final EObject entryRuleSUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUT = null;


        try {
            // InternalXCanopus.g:1062:44: (iv_ruleSUT= ruleSUT EOF )
            // InternalXCanopus.g:1063:2: iv_ruleSUT= ruleSUT EOF
            {
             newCompositeNode(grammarAccess.getSUTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSUT=ruleSUT();

            state._fsp--;

             current =iv_ruleSUT; 
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
    // $ANTLR end "entryRuleSUT"


    // $ANTLR start "ruleSUT"
    // InternalXCanopus.g:1069:1: ruleSUT returns [EObject current=null] : ( () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleSUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1075:2: ( ( () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalXCanopus.g:1076:2: ( () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalXCanopus.g:1076:2: ( () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' )
            // InternalXCanopus.g:1077:3: () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}'
            {
            // InternalXCanopus.g:1077:3: ()
            // InternalXCanopus.g:1078:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSUTAccess().getSUTAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSUTAccess().getSUTKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSUTAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXCanopus.g:1092:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXCanopus.g:1093:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXCanopus.g:1093:4: (lv_name_3_0= RULE_ID )
            // InternalXCanopus.g:1094:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSUTAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.unipampa.lesse.XCanopus.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSUTAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSUT"


    // $ANTLR start "entryRuleEString"
    // InternalXCanopus.g:1118:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXCanopus.g:1118:47: (iv_ruleEString= ruleEString EOF )
            // InternalXCanopus.g:1119:2: iv_ruleEString= ruleEString EOF
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
    // InternalXCanopus.g:1125:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1131:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXCanopus.g:1132:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXCanopus.g:1132:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXCanopus.g:1133:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1141:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleMETRICTYPEMONITORED"
    // InternalXCanopus.g:1152:1: ruleMETRICTYPEMONITORED returns [Enumerator current=null] : ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'disk' ) | (enumLiteral_2= 'web resources' ) | (enumLiteral_3= 'transaction' ) | (enumLiteral_4= 'processor' ) ) ;
    public final Enumerator ruleMETRICTYPEMONITORED() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1158:2: ( ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'disk' ) | (enumLiteral_2= 'web resources' ) | (enumLiteral_3= 'transaction' ) | (enumLiteral_4= 'processor' ) ) )
            // InternalXCanopus.g:1159:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'disk' ) | (enumLiteral_2= 'web resources' ) | (enumLiteral_3= 'transaction' ) | (enumLiteral_4= 'processor' ) )
            {
            // InternalXCanopus.g:1159:2: ( (enumLiteral_0= 'memory' ) | (enumLiteral_1= 'disk' ) | (enumLiteral_2= 'web resources' ) | (enumLiteral_3= 'transaction' ) | (enumLiteral_4= 'processor' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt14=1;
                }
                break;
            case 49:
                {
                alt14=2;
                }
                break;
            case 50:
                {
                alt14=3;
                }
                break;
            case 51:
                {
                alt14=4;
                }
                break;
            case 52:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalXCanopus.g:1160:3: (enumLiteral_0= 'memory' )
                    {
                    // InternalXCanopus.g:1160:3: (enumLiteral_0= 'memory' )
                    // InternalXCanopus.g:1161:4: enumLiteral_0= 'memory'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEMONITOREDAccess().getMEMORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMETRICTYPEMONITOREDAccess().getMEMORYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1168:3: (enumLiteral_1= 'disk' )
                    {
                    // InternalXCanopus.g:1168:3: (enumLiteral_1= 'disk' )
                    // InternalXCanopus.g:1169:4: enumLiteral_1= 'disk'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEMONITOREDAccess().getDISKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMETRICTYPEMONITOREDAccess().getDISKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1176:3: (enumLiteral_2= 'web resources' )
                    {
                    // InternalXCanopus.g:1176:3: (enumLiteral_2= 'web resources' )
                    // InternalXCanopus.g:1177:4: enumLiteral_2= 'web resources'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEMONITOREDAccess().getWEBRESOURCESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMETRICTYPEMONITOREDAccess().getWEBRESOURCESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:1184:3: (enumLiteral_3= 'transaction' )
                    {
                    // InternalXCanopus.g:1184:3: (enumLiteral_3= 'transaction' )
                    // InternalXCanopus.g:1185:4: enumLiteral_3= 'transaction'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEMONITOREDAccess().getTRANSACTIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMETRICTYPEMONITOREDAccess().getTRANSACTIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:1192:3: (enumLiteral_4= 'processor' )
                    {
                    // InternalXCanopus.g:1192:3: (enumLiteral_4= 'processor' )
                    // InternalXCanopus.g:1193:4: enumLiteral_4= 'processor'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEMONITOREDAccess().getPROCESSOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMETRICTYPEMONITOREDAccess().getPROCESSOREnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleMETRICTYPEMONITORED"


    // $ANTLR start "ruleMETRICTYPE"
    // InternalXCanopus.g:1203:1: ruleMETRICTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'available mbytes counter' ) | (enumLiteral_1= '% idle time counter' ) | (enumLiteral_2= 'throughput mbytes' ) | (enumLiteral_3= 'transactions per second' ) | (enumLiteral_4= 'TPS' ) | (enumLiteral_5= '% processor time count' ) | (enumLiteral_6= 'transactions response time' ) ) ;
    public final Enumerator ruleMETRICTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1209:2: ( ( (enumLiteral_0= 'available mbytes counter' ) | (enumLiteral_1= '% idle time counter' ) | (enumLiteral_2= 'throughput mbytes' ) | (enumLiteral_3= 'transactions per second' ) | (enumLiteral_4= 'TPS' ) | (enumLiteral_5= '% processor time count' ) | (enumLiteral_6= 'transactions response time' ) ) )
            // InternalXCanopus.g:1210:2: ( (enumLiteral_0= 'available mbytes counter' ) | (enumLiteral_1= '% idle time counter' ) | (enumLiteral_2= 'throughput mbytes' ) | (enumLiteral_3= 'transactions per second' ) | (enumLiteral_4= 'TPS' ) | (enumLiteral_5= '% processor time count' ) | (enumLiteral_6= 'transactions response time' ) )
            {
            // InternalXCanopus.g:1210:2: ( (enumLiteral_0= 'available mbytes counter' ) | (enumLiteral_1= '% idle time counter' ) | (enumLiteral_2= 'throughput mbytes' ) | (enumLiteral_3= 'transactions per second' ) | (enumLiteral_4= 'TPS' ) | (enumLiteral_5= '% processor time count' ) | (enumLiteral_6= 'transactions response time' ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt15=1;
                }
                break;
            case 54:
                {
                alt15=2;
                }
                break;
            case 55:
                {
                alt15=3;
                }
                break;
            case 56:
                {
                alt15=4;
                }
                break;
            case 57:
                {
                alt15=5;
                }
                break;
            case 58:
                {
                alt15=6;
                }
                break;
            case 59:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalXCanopus.g:1211:3: (enumLiteral_0= 'available mbytes counter' )
                    {
                    // InternalXCanopus.g:1211:3: (enumLiteral_0= 'available mbytes counter' )
                    // InternalXCanopus.g:1212:4: enumLiteral_0= 'available mbytes counter'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEAccess().getAvailablembytescounterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMETRICTYPEAccess().getAvailablembytescounterEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1219:3: (enumLiteral_1= '% idle time counter' )
                    {
                    // InternalXCanopus.g:1219:3: (enumLiteral_1= '% idle time counter' )
                    // InternalXCanopus.g:1220:4: enumLiteral_1= '% idle time counter'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEAccess().getIdletimecounterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMETRICTYPEAccess().getIdletimecounterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1227:3: (enumLiteral_2= 'throughput mbytes' )
                    {
                    // InternalXCanopus.g:1227:3: (enumLiteral_2= 'throughput mbytes' )
                    // InternalXCanopus.g:1228:4: enumLiteral_2= 'throughput mbytes'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEAccess().getThroughputmbytesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMETRICTYPEAccess().getThroughputmbytesEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:1235:3: (enumLiteral_3= 'transactions per second' )
                    {
                    // InternalXCanopus.g:1235:3: (enumLiteral_3= 'transactions per second' )
                    // InternalXCanopus.g:1236:4: enumLiteral_3= 'transactions per second'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEAccess().getTransactionpersecondEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMETRICTYPEAccess().getTransactionpersecondEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:1243:3: (enumLiteral_4= 'TPS' )
                    {
                    // InternalXCanopus.g:1243:3: (enumLiteral_4= 'TPS' )
                    // InternalXCanopus.g:1244:4: enumLiteral_4= 'TPS'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEAccess().getTPSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMETRICTYPEAccess().getTPSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXCanopus.g:1251:3: (enumLiteral_5= '% processor time count' )
                    {
                    // InternalXCanopus.g:1251:3: (enumLiteral_5= '% processor time count' )
                    // InternalXCanopus.g:1252:4: enumLiteral_5= '% processor time count'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEAccess().getProcessortimecounterEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMETRICTYPEAccess().getProcessortimecounterEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXCanopus.g:1259:3: (enumLiteral_6= 'transactions response time' )
                    {
                    // InternalXCanopus.g:1259:3: (enumLiteral_6= 'transactions response time' )
                    // InternalXCanopus.g:1260:4: enumLiteral_6= 'transactions response time'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMETRICTYPEAccess().getTransactionresponsetimeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMETRICTYPEAccess().getTransactionresponsetimeEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleMETRICTYPE"


    // $ANTLR start "ruleSUT_TYPE"
    // InternalXCanopus.g:1270:1: ruleSUT_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) ) ;
    public final Enumerator ruleSUT_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1276:2: ( ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) ) )
            // InternalXCanopus.g:1277:2: ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) )
            {
            // InternalXCanopus.g:1277:2: ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt16=1;
                }
                break;
            case 61:
                {
                alt16=2;
                }
                break;
            case 62:
                {
                alt16=3;
                }
                break;
            case 63:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalXCanopus.g:1278:3: (enumLiteral_0= 'DESKTOPAPP' )
                    {
                    // InternalXCanopus.g:1278:3: (enumLiteral_0= 'DESKTOPAPP' )
                    // InternalXCanopus.g:1279:4: enumLiteral_0= 'DESKTOPAPP'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getDESKTOPAPPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSUT_TYPEAccess().getDESKTOPAPPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1286:3: (enumLiteral_1= 'DATABASE' )
                    {
                    // InternalXCanopus.g:1286:3: (enumLiteral_1= 'DATABASE' )
                    // InternalXCanopus.g:1287:4: enumLiteral_1= 'DATABASE'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getDATABASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSUT_TYPEAccess().getDATABASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1294:3: (enumLiteral_2= 'WEBAPP' )
                    {
                    // InternalXCanopus.g:1294:3: (enumLiteral_2= 'WEBAPP' )
                    // InternalXCanopus.g:1295:4: enumLiteral_2= 'WEBAPP'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getWEBAPPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSUT_TYPEAccess().getWEBAPPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:1302:3: (enumLiteral_3= 'WEBSERVICE' )
                    {
                    // InternalXCanopus.g:1302:3: (enumLiteral_3= 'WEBSERVICE' )
                    // InternalXCanopus.g:1303:4: enumLiteral_3= 'WEBSERVICE'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getWEBSERVICEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSUT_TYPEAccess().getWEBSERVICEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleSUT_TYPE"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\52\3\uffff\1\5\2\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\55\3\uffff\1\12\2\uffff\1\73\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\4\1\uffff\1\6\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\2\1\3\1\1",
            "",
            "",
            "",
            "\1\6\2\uffff\1\7\1\uffff\1\5",
            "",
            "",
            "\1\10\60\uffff\7\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "312:2: (this_given_0= rulegiven | this_when_1= rulewhen | this_then_2= rulethen | this_and_workload_3= ruleand_workload | this_and_atleast_4= ruleand_atleast | this_and_the_scenario_5= ruleand_the_scenario | this_and_the_metric_6= ruleand_the_metric )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000C01000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002020000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0FE0000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});

}