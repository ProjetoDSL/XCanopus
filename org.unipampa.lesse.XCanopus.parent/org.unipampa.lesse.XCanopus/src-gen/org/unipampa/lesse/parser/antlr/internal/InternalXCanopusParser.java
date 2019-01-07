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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "'as'", "'Feature'", "'.'", "'Monitoring:'", "'Given'", "'that'", "'monitored by'", "'monitor'", "'Load Generator'", "'for the'", "'on'", "'And'", "'When'", "'Then'", "'workload generated through'", "'the'", "'At Least'", "'SUT'", "'{'", "'}'", "'isMonitor'", "'LoadGenerator'", "'hostname'", "'ip'", "'hardware'", "'sut'", "'('", "','", "')'", "'metricmodel'", "'Memory'", "'memoryCounter'", "'Disk'", "'disk_io_counter'", "'Criteria'", "'value'", "'Threshold'", "'Disk_IO_Counter'", "'counterDisk'", "'TransactionCounter'", "'counterTransaction'", "'MemoryCounter'", "'counterMemory'", "'-'", "'PHYSICAL_MACHINE'", "'VIRTUAL_MACHINE'", "'CLOUD_SERVICE'", "'DESKTOPAPP'", "'DATABASE'", "'WEBAPP'", "'WEBSERVICE'", "'AVG_DISK_SECS_TRANSFER_COUNTER'", "'PERCENTAGE_IDLE_TIME_COUNTER'", "'DISK_TRANSFERS_SEC_COUNTER'", "'AVG_DISK_QUEUE_LENGTH_COUNTER'", "'SPLIT_IO_SEC_COUNTER'", "'FREE_MEGABYTES_COUNTER'", "'TRANSACTION_RESPONSE_TIME'", "'TRANSACTION_PER_SECOND_TPS'", "'TRANSACTION_SUCCESS_RATE'", "'AVALIABLE_MBYTES_COUNTER'", "'PAGES_SEC_COUNTER'", "'PAGE_READS_SEC_COUNTER'", "'WORKING_SET_COUNTER'", "'POOL_NONPAGE_BYTES_COUNTER'", "'PAGED_POOL_BYTES_COUNTER'", "'PAGED_POOL_FAILURES_COUNTER'", "'CACHE_BYTES_COUNTER'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
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
    // InternalXCanopus.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_monitorings_1_0 = null;

        EObject lv_suts_2_0 = null;

        EObject lv_loadGenerators_3_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:78:2: ( ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )* ) )
            // InternalXCanopus.g:79:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )* )
            {
            // InternalXCanopus.g:79:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )* )
            // InternalXCanopus.g:80:3: ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )*
            {
            // InternalXCanopus.g:80:3: ( (lv_includes_0_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXCanopus.g:81:4: (lv_includes_0_0= ruleInclude )
            	    {
            	    // InternalXCanopus.g:81:4: (lv_includes_0_0= ruleInclude )
            	    // InternalXCanopus.g:82:5: lv_includes_0_0= ruleInclude
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getIncludesIncludeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_includes_0_0=ruleInclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"includes",
            	    						lv_includes_0_0,
            	    						"org.unipampa.lesse.XCanopus.Include");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalXCanopus.g:99:3: ( (lv_monitorings_1_0= ruleMonitoring ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXCanopus.g:100:4: (lv_monitorings_1_0= ruleMonitoring )
            	    {
            	    // InternalXCanopus.g:100:4: (lv_monitorings_1_0= ruleMonitoring )
            	    // InternalXCanopus.g:101:5: lv_monitorings_1_0= ruleMonitoring
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMonitoringsMonitoringParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_monitorings_1_0=ruleMonitoring();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"monitorings",
            	    						lv_monitorings_1_0,
            	    						"org.unipampa.lesse.XCanopus.Monitoring");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalXCanopus.g:118:3: ( (lv_suts_2_0= ruleSUT ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXCanopus.g:119:4: (lv_suts_2_0= ruleSUT )
            	    {
            	    // InternalXCanopus.g:119:4: (lv_suts_2_0= ruleSUT )
            	    // InternalXCanopus.g:120:5: lv_suts_2_0= ruleSUT
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSutsSUTParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_suts_2_0=ruleSUT();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"suts",
            	    						lv_suts_2_0,
            	    						"org.unipampa.lesse.XCanopus.SUT");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalXCanopus.g:137:3: ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=32 && LA4_0<=33)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXCanopus.g:138:4: (lv_loadGenerators_3_0= ruleLoadGenerator )
            	    {
            	    // InternalXCanopus.g:138:4: (lv_loadGenerators_3_0= ruleLoadGenerator )
            	    // InternalXCanopus.g:139:5: lv_loadGenerators_3_0= ruleLoadGenerator
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getLoadGeneratorsLoadGeneratorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_loadGenerators_3_0=ruleLoadGenerator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loadGenerators",
            	    						lv_loadGenerators_3_0,
            	    						"org.unipampa.lesse.XCanopus.LoadGenerator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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


    // $ANTLR start "entryRuleInclude"
    // InternalXCanopus.g:160:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalXCanopus.g:160:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalXCanopus.g:161:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalXCanopus.g:167:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalXCanopus.g:173:2: ( (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalXCanopus.g:174:2: (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalXCanopus.g:174:2: (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalXCanopus.g:175:3: otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalXCanopus.g:179:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalXCanopus.g:180:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalXCanopus.g:180:4: (lv_importURI_1_0= RULE_STRING )
            // InternalXCanopus.g:181:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.unipampa.lesse.XCanopus.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getAsKeyword_2());
            		
            // InternalXCanopus.g:201:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXCanopus.g:202:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXCanopus.g:202:4: (lv_name_3_0= RULE_ID )
            // InternalXCanopus.g:203:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getIncludeAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.unipampa.lesse.XCanopus.ID");
            				

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleMonitoring"
    // InternalXCanopus.g:223:1: entryRuleMonitoring returns [EObject current=null] : iv_ruleMonitoring= ruleMonitoring EOF ;
    public final EObject entryRuleMonitoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoring = null;


        try {
            // InternalXCanopus.g:223:51: (iv_ruleMonitoring= ruleMonitoring EOF )
            // InternalXCanopus.g:224:2: iv_ruleMonitoring= ruleMonitoring EOF
            {
             newCompositeNode(grammarAccess.getMonitoringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitoring=ruleMonitoring();

            state._fsp--;

             current =iv_ruleMonitoring; 
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
    // $ANTLR end "entryRuleMonitoring"


    // $ANTLR start "ruleMonitoring"
    // InternalXCanopus.g:230:1: ruleMonitoring returns [EObject current=null] : ( () otherlv_1= 'Feature' ruleFreetext otherlv_3= '.' otherlv_4= 'Monitoring:' ruleFreetext otherlv_6= '.' otherlv_7= 'Given' otherlv_8= 'that' ( (otherlv_9= RULE_ID ) ) ( (lv_sut_type_10_0= ruleSUT_TYPE ) ) otherlv_11= 'monitored by' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'monitor' ( (lv_condition_14_0= ruleCONDITION ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Load Generator' otherlv_17= 'for the' ( (lv_sut_type2_18_0= ruleSUT_TYPE ) ) otherlv_19= 'on' ( (otherlv_20= RULE_ID ) ) ) ;
    public final EObject ruleMonitoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Enumerator lv_sut_type_10_0 = null;

        EObject lv_condition_14_0 = null;

        Enumerator lv_sut_type2_18_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:236:2: ( ( () otherlv_1= 'Feature' ruleFreetext otherlv_3= '.' otherlv_4= 'Monitoring:' ruleFreetext otherlv_6= '.' otherlv_7= 'Given' otherlv_8= 'that' ( (otherlv_9= RULE_ID ) ) ( (lv_sut_type_10_0= ruleSUT_TYPE ) ) otherlv_11= 'monitored by' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'monitor' ( (lv_condition_14_0= ruleCONDITION ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Load Generator' otherlv_17= 'for the' ( (lv_sut_type2_18_0= ruleSUT_TYPE ) ) otherlv_19= 'on' ( (otherlv_20= RULE_ID ) ) ) )
            // InternalXCanopus.g:237:2: ( () otherlv_1= 'Feature' ruleFreetext otherlv_3= '.' otherlv_4= 'Monitoring:' ruleFreetext otherlv_6= '.' otherlv_7= 'Given' otherlv_8= 'that' ( (otherlv_9= RULE_ID ) ) ( (lv_sut_type_10_0= ruleSUT_TYPE ) ) otherlv_11= 'monitored by' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'monitor' ( (lv_condition_14_0= ruleCONDITION ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Load Generator' otherlv_17= 'for the' ( (lv_sut_type2_18_0= ruleSUT_TYPE ) ) otherlv_19= 'on' ( (otherlv_20= RULE_ID ) ) )
            {
            // InternalXCanopus.g:237:2: ( () otherlv_1= 'Feature' ruleFreetext otherlv_3= '.' otherlv_4= 'Monitoring:' ruleFreetext otherlv_6= '.' otherlv_7= 'Given' otherlv_8= 'that' ( (otherlv_9= RULE_ID ) ) ( (lv_sut_type_10_0= ruleSUT_TYPE ) ) otherlv_11= 'monitored by' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'monitor' ( (lv_condition_14_0= ruleCONDITION ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Load Generator' otherlv_17= 'for the' ( (lv_sut_type2_18_0= ruleSUT_TYPE ) ) otherlv_19= 'on' ( (otherlv_20= RULE_ID ) ) )
            // InternalXCanopus.g:238:3: () otherlv_1= 'Feature' ruleFreetext otherlv_3= '.' otherlv_4= 'Monitoring:' ruleFreetext otherlv_6= '.' otherlv_7= 'Given' otherlv_8= 'that' ( (otherlv_9= RULE_ID ) ) ( (lv_sut_type_10_0= ruleSUT_TYPE ) ) otherlv_11= 'monitored by' ( (otherlv_12= RULE_ID ) ) otherlv_13= 'monitor' ( (lv_condition_14_0= ruleCONDITION ) ) ( (otherlv_15= RULE_ID ) ) otherlv_16= 'Load Generator' otherlv_17= 'for the' ( (lv_sut_type2_18_0= ruleSUT_TYPE ) ) otherlv_19= 'on' ( (otherlv_20= RULE_ID ) )
            {
            // InternalXCanopus.g:238:3: ()
            // InternalXCanopus.g:239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMonitoringAccess().getMonitoringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMonitoringAccess().getFeatureKeyword_1());
            		

            			newCompositeNode(grammarAccess.getMonitoringAccess().getFreetextParserRuleCall_2());
            		
            pushFollow(FOLLOW_11);
            ruleFreetext();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitoringAccess().getFullStopKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getMonitoringAccess().getMonitoringKeyword_4());
            		

            			newCompositeNode(grammarAccess.getMonitoringAccess().getFreetextParserRuleCall_5());
            		
            pushFollow(FOLLOW_11);
            ruleFreetext();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getMonitoringAccess().getFullStopKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getMonitoringAccess().getGivenKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getMonitoringAccess().getThatKeyword_8());
            		
            // InternalXCanopus.g:283:3: ( (otherlv_9= RULE_ID ) )
            // InternalXCanopus.g:284:4: (otherlv_9= RULE_ID )
            {
            // InternalXCanopus.g:284:4: (otherlv_9= RULE_ID )
            // InternalXCanopus.g:285:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitoringRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_9, grammarAccess.getMonitoringAccess().getSutSUTCrossReference_9_0());
            				

            }


            }

            // InternalXCanopus.g:296:3: ( (lv_sut_type_10_0= ruleSUT_TYPE ) )
            // InternalXCanopus.g:297:4: (lv_sut_type_10_0= ruleSUT_TYPE )
            {
            // InternalXCanopus.g:297:4: (lv_sut_type_10_0= ruleSUT_TYPE )
            // InternalXCanopus.g:298:5: lv_sut_type_10_0= ruleSUT_TYPE
            {

            					newCompositeNode(grammarAccess.getMonitoringAccess().getSut_typeSUT_TYPEEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_16);
            lv_sut_type_10_0=ruleSUT_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitoringRule());
            					}
            					set(
            						current,
            						"sut_type",
            						lv_sut_type_10_0,
            						"org.unipampa.lesse.XCanopus.SUT_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getMonitoringAccess().getMonitoredByKeyword_11());
            		
            // InternalXCanopus.g:319:3: ( (otherlv_12= RULE_ID ) )
            // InternalXCanopus.g:320:4: (otherlv_12= RULE_ID )
            {
            // InternalXCanopus.g:320:4: (otherlv_12= RULE_ID )
            // InternalXCanopus.g:321:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitoringRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_12, grammarAccess.getMonitoringAccess().getSutSUTCrossReference_12_0());
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_13, grammarAccess.getMonitoringAccess().getMonitorKeyword_13());
            		
            // InternalXCanopus.g:336:3: ( (lv_condition_14_0= ruleCONDITION ) )
            // InternalXCanopus.g:337:4: (lv_condition_14_0= ruleCONDITION )
            {
            // InternalXCanopus.g:337:4: (lv_condition_14_0= ruleCONDITION )
            // InternalXCanopus.g:338:5: lv_condition_14_0= ruleCONDITION
            {

            					newCompositeNode(grammarAccess.getMonitoringAccess().getConditionCONDITIONParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_9);
            lv_condition_14_0=ruleCONDITION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitoringRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_14_0,
            						"org.unipampa.lesse.XCanopus.CONDITION");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXCanopus.g:355:3: ( (otherlv_15= RULE_ID ) )
            // InternalXCanopus.g:356:4: (otherlv_15= RULE_ID )
            {
            // InternalXCanopus.g:356:4: (otherlv_15= RULE_ID )
            // InternalXCanopus.g:357:5: otherlv_15= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitoringRule());
            					}
            				
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_15, grammarAccess.getMonitoringAccess().getSutSUTCrossReference_15_0());
            				

            }


            }

            otherlv_16=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_16, grammarAccess.getMonitoringAccess().getLoadGeneratorKeyword_16());
            		
            otherlv_17=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getMonitoringAccess().getForTheKeyword_17());
            		
            // InternalXCanopus.g:376:3: ( (lv_sut_type2_18_0= ruleSUT_TYPE ) )
            // InternalXCanopus.g:377:4: (lv_sut_type2_18_0= ruleSUT_TYPE )
            {
            // InternalXCanopus.g:377:4: (lv_sut_type2_18_0= ruleSUT_TYPE )
            // InternalXCanopus.g:378:5: lv_sut_type2_18_0= ruleSUT_TYPE
            {

            					newCompositeNode(grammarAccess.getMonitoringAccess().getSut_type2SUT_TYPEEnumRuleCall_18_0());
            				
            pushFollow(FOLLOW_21);
            lv_sut_type2_18_0=ruleSUT_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitoringRule());
            					}
            					set(
            						current,
            						"sut_type2",
            						lv_sut_type2_18_0,
            						"org.unipampa.lesse.XCanopus.SUT_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_19, grammarAccess.getMonitoringAccess().getOnKeyword_19());
            		
            // InternalXCanopus.g:399:3: ( (otherlv_20= RULE_ID ) )
            // InternalXCanopus.g:400:4: (otherlv_20= RULE_ID )
            {
            // InternalXCanopus.g:400:4: (otherlv_20= RULE_ID )
            // InternalXCanopus.g:401:5: otherlv_20= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitoringRule());
            					}
            				
            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_20, grammarAccess.getMonitoringAccess().getSutSUTCrossReference_20_0());
            				

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
    // $ANTLR end "ruleMonitoring"


    // $ANTLR start "entryRuleFreetext"
    // InternalXCanopus.g:416:1: entryRuleFreetext returns [String current=null] : iv_ruleFreetext= ruleFreetext EOF ;
    public final String entryRuleFreetext() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFreetext = null;


        try {
            // InternalXCanopus.g:416:48: (iv_ruleFreetext= ruleFreetext EOF )
            // InternalXCanopus.g:417:2: iv_ruleFreetext= ruleFreetext EOF
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
    // InternalXCanopus.g:423:1: ruleFreetext returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString )* ;
    public final AntlrDatatypeRuleToken ruleFreetext() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:429:2: ( (this_EString_0= ruleEString )* )
            // InternalXCanopus.g:430:2: (this_EString_0= ruleEString )*
            {
            // InternalXCanopus.g:430:2: (this_EString_0= ruleEString )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXCanopus.g:431:3: this_EString_0= ruleEString
            	    {

            	    			newCompositeNode(grammarAccess.getFreetextAccess().getEStringParserRuleCall());
            	    		
            	    pushFollow(FOLLOW_22);
            	    this_EString_0=ruleEString();

            	    state._fsp--;


            	    			current.merge(this_EString_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "entryRuleCONDITION"
    // InternalXCanopus.g:445:1: entryRuleCONDITION returns [EObject current=null] : iv_ruleCONDITION= ruleCONDITION EOF ;
    public final EObject entryRuleCONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCONDITION = null;


        try {
            // InternalXCanopus.g:445:50: (iv_ruleCONDITION= ruleCONDITION EOF )
            // InternalXCanopus.g:446:2: iv_ruleCONDITION= ruleCONDITION EOF
            {
             newCompositeNode(grammarAccess.getCONDITIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCONDITION=ruleCONDITION();

            state._fsp--;

             current =iv_ruleCONDITION; 
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
    // $ANTLR end "entryRuleCONDITION"


    // $ANTLR start "ruleCONDITION"
    // InternalXCanopus.g:452:1: ruleCONDITION returns [EObject current=null] : (this_AND_0= ruleAND | this_WHEN_1= ruleWHEN | this_THEN_2= ruleTHEN ) ;
    public final EObject ruleCONDITION() throws RecognitionException {
        EObject current = null;

        EObject this_AND_0 = null;

        EObject this_WHEN_1 = null;

        EObject this_THEN_2 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:458:2: ( (this_AND_0= ruleAND | this_WHEN_1= ruleWHEN | this_THEN_2= ruleTHEN ) )
            // InternalXCanopus.g:459:2: (this_AND_0= ruleAND | this_WHEN_1= ruleWHEN | this_THEN_2= ruleTHEN )
            {
            // InternalXCanopus.g:459:2: (this_AND_0= ruleAND | this_WHEN_1= ruleWHEN | this_THEN_2= ruleTHEN )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXCanopus.g:460:3: this_AND_0= ruleAND
                    {

                    			newCompositeNode(grammarAccess.getCONDITIONAccess().getANDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AND_0=ruleAND();

                    state._fsp--;


                    			current = this_AND_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:469:3: this_WHEN_1= ruleWHEN
                    {

                    			newCompositeNode(grammarAccess.getCONDITIONAccess().getWHENParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WHEN_1=ruleWHEN();

                    state._fsp--;


                    			current = this_WHEN_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:478:3: this_THEN_2= ruleTHEN
                    {

                    			newCompositeNode(grammarAccess.getCONDITIONAccess().getTHENParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_THEN_2=ruleTHEN();

                    state._fsp--;


                    			current = this_THEN_2;
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
    // $ANTLR end "ruleCONDITION"


    // $ANTLR start "entryRuleAND"
    // InternalXCanopus.g:490:1: entryRuleAND returns [EObject current=null] : iv_ruleAND= ruleAND EOF ;
    public final EObject entryRuleAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAND = null;


        try {
            // InternalXCanopus.g:490:44: (iv_ruleAND= ruleAND EOF )
            // InternalXCanopus.g:491:2: iv_ruleAND= ruleAND EOF
            {
             newCompositeNode(grammarAccess.getANDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAND=ruleAND();

            state._fsp--;

             current =iv_ruleAND; 
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
    // $ANTLR end "entryRuleAND"


    // $ANTLR start "ruleAND"
    // InternalXCanopus.g:497:1: ruleAND returns [EObject current=null] : (otherlv_0= 'And' ( (lv_post_1_0= rulePOSTCONDITION ) ) ) ;
    public final EObject ruleAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_post_1_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:503:2: ( (otherlv_0= 'And' ( (lv_post_1_0= rulePOSTCONDITION ) ) ) )
            // InternalXCanopus.g:504:2: (otherlv_0= 'And' ( (lv_post_1_0= rulePOSTCONDITION ) ) )
            {
            // InternalXCanopus.g:504:2: (otherlv_0= 'And' ( (lv_post_1_0= rulePOSTCONDITION ) ) )
            // InternalXCanopus.g:505:3: otherlv_0= 'And' ( (lv_post_1_0= rulePOSTCONDITION ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getANDAccess().getAndKeyword_0());
            		
            // InternalXCanopus.g:509:3: ( (lv_post_1_0= rulePOSTCONDITION ) )
            // InternalXCanopus.g:510:4: (lv_post_1_0= rulePOSTCONDITION )
            {
            // InternalXCanopus.g:510:4: (lv_post_1_0= rulePOSTCONDITION )
            // InternalXCanopus.g:511:5: lv_post_1_0= rulePOSTCONDITION
            {

            					newCompositeNode(grammarAccess.getANDAccess().getPostPOSTCONDITIONParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_post_1_0=rulePOSTCONDITION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDRule());
            					}
            					set(
            						current,
            						"post",
            						lv_post_1_0,
            						"org.unipampa.lesse.XCanopus.POSTCONDITION");
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
    // $ANTLR end "ruleAND"


    // $ANTLR start "entryRuleWHEN"
    // InternalXCanopus.g:532:1: entryRuleWHEN returns [EObject current=null] : iv_ruleWHEN= ruleWHEN EOF ;
    public final EObject entryRuleWHEN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWHEN = null;


        try {
            // InternalXCanopus.g:532:45: (iv_ruleWHEN= ruleWHEN EOF )
            // InternalXCanopus.g:533:2: iv_ruleWHEN= ruleWHEN EOF
            {
             newCompositeNode(grammarAccess.getWHENRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWHEN=ruleWHEN();

            state._fsp--;

             current =iv_ruleWHEN; 
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
    // $ANTLR end "entryRuleWHEN"


    // $ANTLR start "ruleWHEN"
    // InternalXCanopus.g:539:1: ruleWHEN returns [EObject current=null] : (otherlv_0= 'When' ( (lv_post_1_0= rulePOSTCONDITION ) ) ) ;
    public final EObject ruleWHEN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_post_1_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:545:2: ( (otherlv_0= 'When' ( (lv_post_1_0= rulePOSTCONDITION ) ) ) )
            // InternalXCanopus.g:546:2: (otherlv_0= 'When' ( (lv_post_1_0= rulePOSTCONDITION ) ) )
            {
            // InternalXCanopus.g:546:2: (otherlv_0= 'When' ( (lv_post_1_0= rulePOSTCONDITION ) ) )
            // InternalXCanopus.g:547:3: otherlv_0= 'When' ( (lv_post_1_0= rulePOSTCONDITION ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getWHENAccess().getWhenKeyword_0());
            		
            // InternalXCanopus.g:551:3: ( (lv_post_1_0= rulePOSTCONDITION ) )
            // InternalXCanopus.g:552:4: (lv_post_1_0= rulePOSTCONDITION )
            {
            // InternalXCanopus.g:552:4: (lv_post_1_0= rulePOSTCONDITION )
            // InternalXCanopus.g:553:5: lv_post_1_0= rulePOSTCONDITION
            {

            					newCompositeNode(grammarAccess.getWHENAccess().getPostPOSTCONDITIONParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_post_1_0=rulePOSTCONDITION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWHENRule());
            					}
            					set(
            						current,
            						"post",
            						lv_post_1_0,
            						"org.unipampa.lesse.XCanopus.POSTCONDITION");
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
    // $ANTLR end "ruleWHEN"


    // $ANTLR start "entryRuleTHEN"
    // InternalXCanopus.g:574:1: entryRuleTHEN returns [EObject current=null] : iv_ruleTHEN= ruleTHEN EOF ;
    public final EObject entryRuleTHEN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTHEN = null;


        try {
            // InternalXCanopus.g:574:45: (iv_ruleTHEN= ruleTHEN EOF )
            // InternalXCanopus.g:575:2: iv_ruleTHEN= ruleTHEN EOF
            {
             newCompositeNode(grammarAccess.getTHENRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTHEN=ruleTHEN();

            state._fsp--;

             current =iv_ruleTHEN; 
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
    // $ANTLR end "entryRuleTHEN"


    // $ANTLR start "ruleTHEN"
    // InternalXCanopus.g:581:1: ruleTHEN returns [EObject current=null] : (otherlv_0= 'Then' ( (lv_post_1_0= rulePOSTCONDITION ) ) ) ;
    public final EObject ruleTHEN() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_post_1_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:587:2: ( (otherlv_0= 'Then' ( (lv_post_1_0= rulePOSTCONDITION ) ) ) )
            // InternalXCanopus.g:588:2: (otherlv_0= 'Then' ( (lv_post_1_0= rulePOSTCONDITION ) ) )
            {
            // InternalXCanopus.g:588:2: (otherlv_0= 'Then' ( (lv_post_1_0= rulePOSTCONDITION ) ) )
            // InternalXCanopus.g:589:3: otherlv_0= 'Then' ( (lv_post_1_0= rulePOSTCONDITION ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getTHENAccess().getThenKeyword_0());
            		
            // InternalXCanopus.g:593:3: ( (lv_post_1_0= rulePOSTCONDITION ) )
            // InternalXCanopus.g:594:4: (lv_post_1_0= rulePOSTCONDITION )
            {
            // InternalXCanopus.g:594:4: (lv_post_1_0= rulePOSTCONDITION )
            // InternalXCanopus.g:595:5: lv_post_1_0= rulePOSTCONDITION
            {

            					newCompositeNode(grammarAccess.getTHENAccess().getPostPOSTCONDITIONParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_post_1_0=rulePOSTCONDITION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTHENRule());
            					}
            					set(
            						current,
            						"post",
            						lv_post_1_0,
            						"org.unipampa.lesse.XCanopus.POSTCONDITION");
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
    // $ANTLR end "ruleTHEN"


    // $ANTLR start "entryRulePOSTCONDITION"
    // InternalXCanopus.g:616:1: entryRulePOSTCONDITION returns [EObject current=null] : iv_rulePOSTCONDITION= rulePOSTCONDITION EOF ;
    public final EObject entryRulePOSTCONDITION() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePOSTCONDITION = null;


        try {
            // InternalXCanopus.g:616:54: (iv_rulePOSTCONDITION= rulePOSTCONDITION EOF )
            // InternalXCanopus.g:617:2: iv_rulePOSTCONDITION= rulePOSTCONDITION EOF
            {
             newCompositeNode(grammarAccess.getPOSTCONDITIONRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePOSTCONDITION=rulePOSTCONDITION();

            state._fsp--;

             current =iv_rulePOSTCONDITION; 
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
    // $ANTLR end "entryRulePOSTCONDITION"


    // $ANTLR start "rulePOSTCONDITION"
    // InternalXCanopus.g:623:1: rulePOSTCONDITION returns [EObject current=null] : ( ( (lv_WGT_0_0= 'workload generated through' ) ) | ( (lv_THE_1_0= 'the' ) ) | ( (lv_ATL_2_0= 'At Least' ) ) ) ;
    public final EObject rulePOSTCONDITION() throws RecognitionException {
        EObject current = null;

        Token lv_WGT_0_0=null;
        Token lv_THE_1_0=null;
        Token lv_ATL_2_0=null;


        	enterRule();

        try {
            // InternalXCanopus.g:629:2: ( ( ( (lv_WGT_0_0= 'workload generated through' ) ) | ( (lv_THE_1_0= 'the' ) ) | ( (lv_ATL_2_0= 'At Least' ) ) ) )
            // InternalXCanopus.g:630:2: ( ( (lv_WGT_0_0= 'workload generated through' ) ) | ( (lv_THE_1_0= 'the' ) ) | ( (lv_ATL_2_0= 'At Least' ) ) )
            {
            // InternalXCanopus.g:630:2: ( ( (lv_WGT_0_0= 'workload generated through' ) ) | ( (lv_THE_1_0= 'the' ) ) | ( (lv_ATL_2_0= 'At Least' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
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
                    // InternalXCanopus.g:631:3: ( (lv_WGT_0_0= 'workload generated through' ) )
                    {
                    // InternalXCanopus.g:631:3: ( (lv_WGT_0_0= 'workload generated through' ) )
                    // InternalXCanopus.g:632:4: (lv_WGT_0_0= 'workload generated through' )
                    {
                    // InternalXCanopus.g:632:4: (lv_WGT_0_0= 'workload generated through' )
                    // InternalXCanopus.g:633:5: lv_WGT_0_0= 'workload generated through'
                    {
                    lv_WGT_0_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_WGT_0_0, grammarAccess.getPOSTCONDITIONAccess().getWGTWorkloadGeneratedThroughKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPOSTCONDITIONRule());
                    					}
                    					setWithLastConsumed(current, "WGT", lv_WGT_0_0, "workload generated through");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:646:3: ( (lv_THE_1_0= 'the' ) )
                    {
                    // InternalXCanopus.g:646:3: ( (lv_THE_1_0= 'the' ) )
                    // InternalXCanopus.g:647:4: (lv_THE_1_0= 'the' )
                    {
                    // InternalXCanopus.g:647:4: (lv_THE_1_0= 'the' )
                    // InternalXCanopus.g:648:5: lv_THE_1_0= 'the'
                    {
                    lv_THE_1_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_THE_1_0, grammarAccess.getPOSTCONDITIONAccess().getTHETheKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPOSTCONDITIONRule());
                    					}
                    					setWithLastConsumed(current, "THE", lv_THE_1_0, "the");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:661:3: ( (lv_ATL_2_0= 'At Least' ) )
                    {
                    // InternalXCanopus.g:661:3: ( (lv_ATL_2_0= 'At Least' ) )
                    // InternalXCanopus.g:662:4: (lv_ATL_2_0= 'At Least' )
                    {
                    // InternalXCanopus.g:662:4: (lv_ATL_2_0= 'At Least' )
                    // InternalXCanopus.g:663:5: lv_ATL_2_0= 'At Least'
                    {
                    lv_ATL_2_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_ATL_2_0, grammarAccess.getPOSTCONDITIONAccess().getATLAtLeastKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPOSTCONDITIONRule());
                    					}
                    					setWithLastConsumed(current, "ATL", lv_ATL_2_0, "At Least");
                    				

                    }


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
    // $ANTLR end "rulePOSTCONDITION"


    // $ANTLR start "entryRuleMetric"
    // InternalXCanopus.g:679:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalXCanopus.g:679:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalXCanopus.g:680:2: iv_ruleMetric= ruleMetric EOF
            {
             newCompositeNode(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetric=ruleMetric();

            state._fsp--;

             current =iv_ruleMetric; 
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
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalXCanopus.g:686:1: ruleMetric returns [EObject current=null] : (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        EObject this_Memory_0 = null;

        EObject this_Disk_1 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:692:2: ( (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk ) )
            // InternalXCanopus.g:693:2: (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk )
            {
            // InternalXCanopus.g:693:2: (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            else if ( (LA8_0==44) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXCanopus.g:694:3: this_Memory_0= ruleMemory
                    {

                    			newCompositeNode(grammarAccess.getMetricAccess().getMemoryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Memory_0=ruleMemory();

                    state._fsp--;


                    			current = this_Memory_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:703:3: this_Disk_1= ruleDisk
                    {

                    			newCompositeNode(grammarAccess.getMetricAccess().getDiskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Disk_1=ruleDisk();

                    state._fsp--;


                    			current = this_Disk_1;
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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleCounter"
    // InternalXCanopus.g:715:1: entryRuleCounter returns [EObject current=null] : iv_ruleCounter= ruleCounter EOF ;
    public final EObject entryRuleCounter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounter = null;


        try {
            // InternalXCanopus.g:715:48: (iv_ruleCounter= ruleCounter EOF )
            // InternalXCanopus.g:716:2: iv_ruleCounter= ruleCounter EOF
            {
             newCompositeNode(grammarAccess.getCounterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCounter=ruleCounter();

            state._fsp--;

             current =iv_ruleCounter; 
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
    // $ANTLR end "entryRuleCounter"


    // $ANTLR start "ruleCounter"
    // InternalXCanopus.g:722:1: ruleCounter returns [EObject current=null] : (this_Disk_IO_Counter_0= ruleDisk_IO_Counter | this_MemoryCounter_1= ruleMemoryCounter | this_TransactionCounter_2= ruleTransactionCounter ) ;
    public final EObject ruleCounter() throws RecognitionException {
        EObject current = null;

        EObject this_Disk_IO_Counter_0 = null;

        EObject this_MemoryCounter_1 = null;

        EObject this_TransactionCounter_2 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:728:2: ( (this_Disk_IO_Counter_0= ruleDisk_IO_Counter | this_MemoryCounter_1= ruleMemoryCounter | this_TransactionCounter_2= ruleTransactionCounter ) )
            // InternalXCanopus.g:729:2: (this_Disk_IO_Counter_0= ruleDisk_IO_Counter | this_MemoryCounter_1= ruleMemoryCounter | this_TransactionCounter_2= ruleTransactionCounter )
            {
            // InternalXCanopus.g:729:2: (this_Disk_IO_Counter_0= ruleDisk_IO_Counter | this_MemoryCounter_1= ruleMemoryCounter | this_TransactionCounter_2= ruleTransactionCounter )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt9=1;
                }
                break;
            case 53:
                {
                alt9=2;
                }
                break;
            case 51:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXCanopus.g:730:3: this_Disk_IO_Counter_0= ruleDisk_IO_Counter
                    {

                    			newCompositeNode(grammarAccess.getCounterAccess().getDisk_IO_CounterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Disk_IO_Counter_0=ruleDisk_IO_Counter();

                    state._fsp--;


                    			current = this_Disk_IO_Counter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:739:3: this_MemoryCounter_1= ruleMemoryCounter
                    {

                    			newCompositeNode(grammarAccess.getCounterAccess().getMemoryCounterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemoryCounter_1=ruleMemoryCounter();

                    state._fsp--;


                    			current = this_MemoryCounter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:748:3: this_TransactionCounter_2= ruleTransactionCounter
                    {

                    			newCompositeNode(grammarAccess.getCounterAccess().getTransactionCounterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransactionCounter_2=ruleTransactionCounter();

                    state._fsp--;


                    			current = this_TransactionCounter_2;
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
    // $ANTLR end "ruleCounter"


    // $ANTLR start "entryRuleSUT"
    // InternalXCanopus.g:760:1: entryRuleSUT returns [EObject current=null] : iv_ruleSUT= ruleSUT EOF ;
    public final EObject entryRuleSUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUT = null;


        try {
            // InternalXCanopus.g:760:44: (iv_ruleSUT= ruleSUT EOF )
            // InternalXCanopus.g:761:2: iv_ruleSUT= ruleSUT EOF
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
    // InternalXCanopus.g:767:1: ruleSUT returns [EObject current=null] : ( () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleSUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXCanopus.g:773:2: ( ( () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalXCanopus.g:774:2: ( () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalXCanopus.g:774:2: ( () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}' )
            // InternalXCanopus.g:775:3: () otherlv_1= 'SUT' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '}'
            {
            // InternalXCanopus.g:775:3: ()
            // InternalXCanopus.g:776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSUTAccess().getSUTAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getSUTAccess().getSUTKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSUTAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXCanopus.g:790:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXCanopus.g:791:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXCanopus.g:791:4: (lv_name_3_0= RULE_ID )
            // InternalXCanopus.g:792:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

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


    // $ANTLR start "entryRuleLoadGenerator"
    // InternalXCanopus.g:816:1: entryRuleLoadGenerator returns [EObject current=null] : iv_ruleLoadGenerator= ruleLoadGenerator EOF ;
    public final EObject entryRuleLoadGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadGenerator = null;


        try {
            // InternalXCanopus.g:816:54: (iv_ruleLoadGenerator= ruleLoadGenerator EOF )
            // InternalXCanopus.g:817:2: iv_ruleLoadGenerator= ruleLoadGenerator EOF
            {
             newCompositeNode(grammarAccess.getLoadGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadGenerator=ruleLoadGenerator();

            state._fsp--;

             current =iv_ruleLoadGenerator; 
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
    // $ANTLR end "entryRuleLoadGenerator"


    // $ANTLR start "ruleLoadGenerator"
    // InternalXCanopus.g:823:1: ruleLoadGenerator returns [EObject current=null] : ( () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleLoadGenerator() throws RecognitionException {
        EObject current = null;

        Token lv_isMonitor_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_hostname_5_0 = null;

        AntlrDatatypeRuleToken lv_ip_7_0 = null;

        Enumerator lv_hardware_9_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:829:2: ( ( () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalXCanopus.g:830:2: ( () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalXCanopus.g:830:2: ( () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalXCanopus.g:831:3: () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalXCanopus.g:831:3: ()
            // InternalXCanopus.g:832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadGeneratorAccess().getLoadGeneratorAction_0(),
            					current);
            			

            }

            // InternalXCanopus.g:838:3: ( (lv_isMonitor_1_0= 'isMonitor' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXCanopus.g:839:4: (lv_isMonitor_1_0= 'isMonitor' )
                    {
                    // InternalXCanopus.g:839:4: (lv_isMonitor_1_0= 'isMonitor' )
                    // InternalXCanopus.g:840:5: lv_isMonitor_1_0= 'isMonitor'
                    {
                    lv_isMonitor_1_0=(Token)match(input,32,FOLLOW_26); 

                    					newLeafNode(lv_isMonitor_1_0, grammarAccess.getLoadGeneratorAccess().getIsMonitorIsMonitorKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    					}
                    					setWithLastConsumed(current, "isMonitor", true, "isMonitor");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadGeneratorAccess().getLoadGeneratorKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadGeneratorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:860:3: (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXCanopus.g:861:4: otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoadGeneratorAccess().getHostnameKeyword_4_0());
                    			
                    // InternalXCanopus.g:865:4: ( (lv_hostname_5_0= ruleEString ) )
                    // InternalXCanopus.g:866:5: (lv_hostname_5_0= ruleEString )
                    {
                    // InternalXCanopus.g:866:5: (lv_hostname_5_0= ruleEString )
                    // InternalXCanopus.g:867:6: lv_hostname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getHostnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_hostname_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoadGeneratorRule());
                    						}
                    						set(
                    							current,
                    							"hostname",
                    							lv_hostname_5_0,
                    							"org.unipampa.lesse.XCanopus.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXCanopus.g:885:3: (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXCanopus.g:886:4: otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoadGeneratorAccess().getIpKeyword_5_0());
                    			
                    // InternalXCanopus.g:890:4: ( (lv_ip_7_0= ruleEString ) )
                    // InternalXCanopus.g:891:5: (lv_ip_7_0= ruleEString )
                    {
                    // InternalXCanopus.g:891:5: (lv_ip_7_0= ruleEString )
                    // InternalXCanopus.g:892:6: lv_ip_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getIpEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_ip_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoadGeneratorRule());
                    						}
                    						set(
                    							current,
                    							"ip",
                    							lv_ip_7_0,
                    							"org.unipampa.lesse.XCanopus.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXCanopus.g:910:3: (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXCanopus.g:911:4: otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) )
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoadGeneratorAccess().getHardwareKeyword_6_0());
                    			
                    // InternalXCanopus.g:915:4: ( (lv_hardware_9_0= ruleHARDWARE ) )
                    // InternalXCanopus.g:916:5: (lv_hardware_9_0= ruleHARDWARE )
                    {
                    // InternalXCanopus.g:916:5: (lv_hardware_9_0= ruleHARDWARE )
                    // InternalXCanopus.g:917:6: lv_hardware_9_0= ruleHARDWARE
                    {

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getHardwareHARDWAREEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_hardware_9_0=ruleHARDWARE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoadGeneratorRule());
                    						}
                    						set(
                    							current,
                    							"hardware",
                    							lv_hardware_9_0,
                    							"org.unipampa.lesse.XCanopus.HARDWARE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXCanopus.g:935:3: (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXCanopus.g:936:4: otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_10, grammarAccess.getLoadGeneratorAccess().getSutKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,38,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getLoadGeneratorAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalXCanopus.g:944:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:945:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:945:5: ( ruleEString )
                    // InternalXCanopus.g:946:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getSutSUTCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXCanopus.g:960:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==39) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalXCanopus.g:961:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,39,FOLLOW_28); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getLoadGeneratorAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXCanopus.g:965:5: ( ( ruleEString ) )
                    	    // InternalXCanopus.g:966:6: ( ruleEString )
                    	    {
                    	    // InternalXCanopus.g:966:6: ( ruleEString )
                    	    // InternalXCanopus.g:967:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getLoadGeneratorAccess().getSutSUTCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_34);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,40,FOLLOW_35); 

                    				newLeafNode(otherlv_15, grammarAccess.getLoadGeneratorAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXCanopus.g:987:3: (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXCanopus.g:988:4: otherlv_16= 'metricmodel' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,41,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getLoadGeneratorAccess().getMetricmodelKeyword_8_0());
                    			
                    // InternalXCanopus.g:992:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:993:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:993:5: ( ruleEString )
                    // InternalXCanopus.g:994:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getMetricmodelMetricModelCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXCanopus.g:1009:3: (otherlv_18= 'monitor' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXCanopus.g:1010:4: otherlv_18= 'monitor' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,19,FOLLOW_28); 

                    				newLeafNode(otherlv_18, grammarAccess.getLoadGeneratorAccess().getMonitorKeyword_9_0());
                    			
                    // InternalXCanopus.g:1014:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:1015:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:1015:5: ( ruleEString )
                    // InternalXCanopus.g:1016:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getMonitorMonitorCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getLoadGeneratorAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleLoadGenerator"


    // $ANTLR start "entryRuleMemory"
    // InternalXCanopus.g:1039:1: entryRuleMemory returns [EObject current=null] : iv_ruleMemory= ruleMemory EOF ;
    public final EObject entryRuleMemory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemory = null;


        try {
            // InternalXCanopus.g:1039:47: (iv_ruleMemory= ruleMemory EOF )
            // InternalXCanopus.g:1040:2: iv_ruleMemory= ruleMemory EOF
            {
             newCompositeNode(grammarAccess.getMemoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemory=ruleMemory();

            state._fsp--;

             current =iv_ruleMemory; 
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
    // $ANTLR end "entryRuleMemory"


    // $ANTLR start "ruleMemory"
    // InternalXCanopus.g:1046:1: ruleMemory returns [EObject current=null] : ( () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMemory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:1052:2: ( ( () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalXCanopus.g:1053:2: ( () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalXCanopus.g:1053:2: ( () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalXCanopus.g:1054:3: () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalXCanopus.g:1054:3: ()
            // InternalXCanopus.g:1055:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryAccess().getMemoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryAccess().getMemoryKeyword_1());
            		
            // InternalXCanopus.g:1065:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:1066:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:1066:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:1067:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMemoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.unipampa.lesse.XCanopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getMemoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:1088:3: (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXCanopus.g:1089:4: otherlv_4= 'memoryCounter' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getMemoryAccess().getMemoryCounterKeyword_4_0());
                    			
                    // InternalXCanopus.g:1093:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:1094:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:1094:5: ( ruleEString )
                    // InternalXCanopus.g:1095:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemoryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMemoryAccess().getMemoryCounterMemoryCounterCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMemoryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMemory"


    // $ANTLR start "entryRuleDisk"
    // InternalXCanopus.g:1118:1: entryRuleDisk returns [EObject current=null] : iv_ruleDisk= ruleDisk EOF ;
    public final EObject entryRuleDisk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisk = null;


        try {
            // InternalXCanopus.g:1118:45: (iv_ruleDisk= ruleDisk EOF )
            // InternalXCanopus.g:1119:2: iv_ruleDisk= ruleDisk EOF
            {
             newCompositeNode(grammarAccess.getDiskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisk=ruleDisk();

            state._fsp--;

             current =iv_ruleDisk; 
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
    // $ANTLR end "entryRuleDisk"


    // $ANTLR start "ruleDisk"
    // InternalXCanopus.g:1125:1: ruleDisk returns [EObject current=null] : ( () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDisk() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:1131:2: ( ( () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalXCanopus.g:1132:2: ( () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalXCanopus.g:1132:2: ( () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalXCanopus.g:1133:3: () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalXCanopus.g:1133:3: ()
            // InternalXCanopus.g:1134:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskAccess().getDiskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDiskAccess().getDiskKeyword_1());
            		
            // InternalXCanopus.g:1144:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:1145:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:1145:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:1146:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDiskAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.unipampa.lesse.XCanopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getDiskAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:1167:3: (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXCanopus.g:1168:4: otherlv_4= 'disk_io_counter' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getDiskAccess().getDisk_io_counterKeyword_4_0());
                    			
                    // InternalXCanopus.g:1172:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:1173:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:1173:5: ( ruleEString )
                    // InternalXCanopus.g:1174:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDiskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDiskAccess().getDisk_io_counterDisk_IO_CounterCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDiskAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDisk"


    // $ANTLR start "entryRuleCriteria"
    // InternalXCanopus.g:1197:1: entryRuleCriteria returns [EObject current=null] : iv_ruleCriteria= ruleCriteria EOF ;
    public final EObject entryRuleCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriteria = null;


        try {
            // InternalXCanopus.g:1197:49: (iv_ruleCriteria= ruleCriteria EOF )
            // InternalXCanopus.g:1198:2: iv_ruleCriteria= ruleCriteria EOF
            {
             newCompositeNode(grammarAccess.getCriteriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCriteria=ruleCriteria();

            state._fsp--;

             current =iv_ruleCriteria; 
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
    // $ANTLR end "entryRuleCriteria"


    // $ANTLR start "ruleCriteria"
    // InternalXCanopus.g:1204:1: ruleCriteria returns [EObject current=null] : ( () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:1210:2: ( ( () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalXCanopus.g:1211:2: ( () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalXCanopus.g:1211:2: ( () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalXCanopus.g:1212:3: () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalXCanopus.g:1212:3: ()
            // InternalXCanopus.g:1213:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCriteriaAccess().getCriteriaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getCriteriaAccess().getCriteriaKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getCriteriaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXCanopus.g:1227:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXCanopus.g:1228:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getCriteriaAccess().getValueKeyword_3_0());
                    			
                    // InternalXCanopus.g:1232:4: ( (lv_value_4_0= ruleEInt ) )
                    // InternalXCanopus.g:1233:5: (lv_value_4_0= ruleEInt )
                    {
                    // InternalXCanopus.g:1233:5: (lv_value_4_0= ruleEInt )
                    // InternalXCanopus.g:1234:6: lv_value_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCriteriaAccess().getValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_value_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCriteriaRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.unipampa.lesse.XCanopus.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCriteriaAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCriteria"


    // $ANTLR start "entryRuleThreshold"
    // InternalXCanopus.g:1260:1: entryRuleThreshold returns [EObject current=null] : iv_ruleThreshold= ruleThreshold EOF ;
    public final EObject entryRuleThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreshold = null;


        try {
            // InternalXCanopus.g:1260:50: (iv_ruleThreshold= ruleThreshold EOF )
            // InternalXCanopus.g:1261:2: iv_ruleThreshold= ruleThreshold EOF
            {
             newCompositeNode(grammarAccess.getThresholdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThreshold=ruleThreshold();

            state._fsp--;

             current =iv_ruleThreshold; 
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
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // InternalXCanopus.g:1267:1: ruleThreshold returns [EObject current=null] : ( () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:1273:2: ( ( () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalXCanopus.g:1274:2: ( () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalXCanopus.g:1274:2: ( () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalXCanopus.g:1275:3: () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalXCanopus.g:1275:3: ()
            // InternalXCanopus.g:1276:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThresholdAccess().getThresholdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getThresholdAccess().getThresholdKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getThresholdAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXCanopus.g:1290:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXCanopus.g:1291:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getThresholdAccess().getValueKeyword_3_0());
                    			
                    // InternalXCanopus.g:1295:4: ( (lv_value_4_0= ruleEInt ) )
                    // InternalXCanopus.g:1296:5: (lv_value_4_0= ruleEInt )
                    {
                    // InternalXCanopus.g:1296:5: (lv_value_4_0= ruleEInt )
                    // InternalXCanopus.g:1297:6: lv_value_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getThresholdAccess().getValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_value_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThresholdRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.unipampa.lesse.XCanopus.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getThresholdAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleThreshold"


    // $ANTLR start "entryRuleDisk_IO_Counter"
    // InternalXCanopus.g:1323:1: entryRuleDisk_IO_Counter returns [EObject current=null] : iv_ruleDisk_IO_Counter= ruleDisk_IO_Counter EOF ;
    public final EObject entryRuleDisk_IO_Counter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisk_IO_Counter = null;


        try {
            // InternalXCanopus.g:1323:56: (iv_ruleDisk_IO_Counter= ruleDisk_IO_Counter EOF )
            // InternalXCanopus.g:1324:2: iv_ruleDisk_IO_Counter= ruleDisk_IO_Counter EOF
            {
             newCompositeNode(grammarAccess.getDisk_IO_CounterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisk_IO_Counter=ruleDisk_IO_Counter();

            state._fsp--;

             current =iv_ruleDisk_IO_Counter; 
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
    // $ANTLR end "entryRuleDisk_IO_Counter"


    // $ANTLR start "ruleDisk_IO_Counter"
    // InternalXCanopus.g:1330:1: ruleDisk_IO_Counter returns [EObject current=null] : ( () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleDisk_IO_Counter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_counterDisk_6_0 = null;

        Enumerator lv_counterDisk_8_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:1336:2: ( ( () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalXCanopus.g:1337:2: ( () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalXCanopus.g:1337:2: ( () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalXCanopus.g:1338:3: () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalXCanopus.g:1338:3: ()
            // InternalXCanopus.g:1339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDisk_IO_CounterAccess().getDisk_IO_CounterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDisk_IO_CounterAccess().getDisk_IO_CounterKeyword_1());
            		
            // InternalXCanopus.g:1349:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:1350:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:1350:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:1351:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDisk_IO_CounterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisk_IO_CounterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.unipampa.lesse.XCanopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getDisk_IO_CounterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:1372:3: (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXCanopus.g:1373:4: otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getDisk_IO_CounterAccess().getCounterDiskKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,30,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getDisk_IO_CounterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXCanopus.g:1381:4: ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) )
                    // InternalXCanopus.g:1382:5: (lv_counterDisk_6_0= ruleCOUNTER_DISK )
                    {
                    // InternalXCanopus.g:1382:5: (lv_counterDisk_6_0= ruleCOUNTER_DISK )
                    // InternalXCanopus.g:1383:6: lv_counterDisk_6_0= ruleCOUNTER_DISK
                    {

                    						newCompositeNode(grammarAccess.getDisk_IO_CounterAccess().getCounterDiskCOUNTER_DISKEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_counterDisk_6_0=ruleCOUNTER_DISK();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDisk_IO_CounterRule());
                    						}
                    						add(
                    							current,
                    							"counterDisk",
                    							lv_counterDisk_6_0,
                    							"org.unipampa.lesse.XCanopus.COUNTER_DISK");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXCanopus.g:1400:4: (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==39) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalXCanopus.g:1401:5: otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) )
                    	    {
                    	    otherlv_7=(Token)match(input,39,FOLLOW_42); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDisk_IO_CounterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXCanopus.g:1405:5: ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) )
                    	    // InternalXCanopus.g:1406:6: (lv_counterDisk_8_0= ruleCOUNTER_DISK )
                    	    {
                    	    // InternalXCanopus.g:1406:6: (lv_counterDisk_8_0= ruleCOUNTER_DISK )
                    	    // InternalXCanopus.g:1407:7: lv_counterDisk_8_0= ruleCOUNTER_DISK
                    	    {

                    	    							newCompositeNode(grammarAccess.getDisk_IO_CounterAccess().getCounterDiskCOUNTER_DISKEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    lv_counterDisk_8_0=ruleCOUNTER_DISK();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDisk_IO_CounterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"counterDisk",
                    	    								lv_counterDisk_8_0,
                    	    								"org.unipampa.lesse.XCanopus.COUNTER_DISK");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getDisk_IO_CounterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDisk_IO_CounterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDisk_IO_Counter"


    // $ANTLR start "entryRuleTransactionCounter"
    // InternalXCanopus.g:1438:1: entryRuleTransactionCounter returns [EObject current=null] : iv_ruleTransactionCounter= ruleTransactionCounter EOF ;
    public final EObject entryRuleTransactionCounter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactionCounter = null;


        try {
            // InternalXCanopus.g:1438:59: (iv_ruleTransactionCounter= ruleTransactionCounter EOF )
            // InternalXCanopus.g:1439:2: iv_ruleTransactionCounter= ruleTransactionCounter EOF
            {
             newCompositeNode(grammarAccess.getTransactionCounterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransactionCounter=ruleTransactionCounter();

            state._fsp--;

             current =iv_ruleTransactionCounter; 
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
    // $ANTLR end "entryRuleTransactionCounter"


    // $ANTLR start "ruleTransactionCounter"
    // InternalXCanopus.g:1445:1: ruleTransactionCounter returns [EObject current=null] : ( () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleTransactionCounter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_counterTransaction_6_0 = null;

        Enumerator lv_counterTransaction_8_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:1451:2: ( ( () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalXCanopus.g:1452:2: ( () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalXCanopus.g:1452:2: ( () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalXCanopus.g:1453:3: () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalXCanopus.g:1453:3: ()
            // InternalXCanopus.g:1454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransactionCounterAccess().getTransactionCounterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTransactionCounterAccess().getTransactionCounterKeyword_1());
            		
            // InternalXCanopus.g:1464:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:1465:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:1465:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:1466:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransactionCounterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransactionCounterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.unipampa.lesse.XCanopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getTransactionCounterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:1487:3: (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXCanopus.g:1488:4: otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransactionCounterAccess().getCounterTransactionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,30,FOLLOW_45); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransactionCounterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXCanopus.g:1496:4: ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) )
                    // InternalXCanopus.g:1497:5: (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION )
                    {
                    // InternalXCanopus.g:1497:5: (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION )
                    // InternalXCanopus.g:1498:6: lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION
                    {

                    						newCompositeNode(grammarAccess.getTransactionCounterAccess().getCounterTransactionCOUNTER_TRANSACTIONEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_counterTransaction_6_0=ruleCOUNTER_TRANSACTION();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransactionCounterRule());
                    						}
                    						add(
                    							current,
                    							"counterTransaction",
                    							lv_counterTransaction_6_0,
                    							"org.unipampa.lesse.XCanopus.COUNTER_TRANSACTION");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXCanopus.g:1515:4: (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==39) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalXCanopus.g:1516:5: otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) )
                    	    {
                    	    otherlv_7=(Token)match(input,39,FOLLOW_45); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTransactionCounterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXCanopus.g:1520:5: ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) )
                    	    // InternalXCanopus.g:1521:6: (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION )
                    	    {
                    	    // InternalXCanopus.g:1521:6: (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION )
                    	    // InternalXCanopus.g:1522:7: lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransactionCounterAccess().getCounterTransactionCOUNTER_TRANSACTIONEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    lv_counterTransaction_8_0=ruleCOUNTER_TRANSACTION();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransactionCounterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"counterTransaction",
                    	    								lv_counterTransaction_8_0,
                    	    								"org.unipampa.lesse.XCanopus.COUNTER_TRANSACTION");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransactionCounterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTransactionCounterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTransactionCounter"


    // $ANTLR start "entryRuleMemoryCounter"
    // InternalXCanopus.g:1553:1: entryRuleMemoryCounter returns [EObject current=null] : iv_ruleMemoryCounter= ruleMemoryCounter EOF ;
    public final EObject entryRuleMemoryCounter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryCounter = null;


        try {
            // InternalXCanopus.g:1553:54: (iv_ruleMemoryCounter= ruleMemoryCounter EOF )
            // InternalXCanopus.g:1554:2: iv_ruleMemoryCounter= ruleMemoryCounter EOF
            {
             newCompositeNode(grammarAccess.getMemoryCounterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoryCounter=ruleMemoryCounter();

            state._fsp--;

             current =iv_ruleMemoryCounter; 
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
    // $ANTLR end "entryRuleMemoryCounter"


    // $ANTLR start "ruleMemoryCounter"
    // InternalXCanopus.g:1560:1: ruleMemoryCounter returns [EObject current=null] : ( () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleMemoryCounter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_counterMemory_6_0 = null;

        Enumerator lv_counterMemory_8_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:1566:2: ( ( () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalXCanopus.g:1567:2: ( () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalXCanopus.g:1567:2: ( () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalXCanopus.g:1568:3: () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalXCanopus.g:1568:3: ()
            // InternalXCanopus.g:1569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryCounterAccess().getMemoryCounterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryCounterAccess().getMemoryCounterKeyword_1());
            		
            // InternalXCanopus.g:1579:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:1580:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:1580:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:1581:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMemoryCounterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemoryCounterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.unipampa.lesse.XCanopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getMemoryCounterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:1602:3: (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXCanopus.g:1603:4: otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getMemoryCounterAccess().getCounterMemoryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,30,FOLLOW_47); 

                    				newLeafNode(otherlv_5, grammarAccess.getMemoryCounterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXCanopus.g:1611:4: ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) )
                    // InternalXCanopus.g:1612:5: (lv_counterMemory_6_0= ruleCOUNTER_MEMORY )
                    {
                    // InternalXCanopus.g:1612:5: (lv_counterMemory_6_0= ruleCOUNTER_MEMORY )
                    // InternalXCanopus.g:1613:6: lv_counterMemory_6_0= ruleCOUNTER_MEMORY
                    {

                    						newCompositeNode(grammarAccess.getMemoryCounterAccess().getCounterMemoryCOUNTER_MEMORYEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_counterMemory_6_0=ruleCOUNTER_MEMORY();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemoryCounterRule());
                    						}
                    						add(
                    							current,
                    							"counterMemory",
                    							lv_counterMemory_6_0,
                    							"org.unipampa.lesse.XCanopus.COUNTER_MEMORY");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXCanopus.g:1630:4: (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==39) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalXCanopus.g:1631:5: otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) )
                    	    {
                    	    otherlv_7=(Token)match(input,39,FOLLOW_47); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMemoryCounterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXCanopus.g:1635:5: ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) )
                    	    // InternalXCanopus.g:1636:6: (lv_counterMemory_8_0= ruleCOUNTER_MEMORY )
                    	    {
                    	    // InternalXCanopus.g:1636:6: (lv_counterMemory_8_0= ruleCOUNTER_MEMORY )
                    	    // InternalXCanopus.g:1637:7: lv_counterMemory_8_0= ruleCOUNTER_MEMORY
                    	    {

                    	    							newCompositeNode(grammarAccess.getMemoryCounterAccess().getCounterMemoryCOUNTER_MEMORYEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    lv_counterMemory_8_0=ruleCOUNTER_MEMORY();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMemoryCounterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"counterMemory",
                    	    								lv_counterMemory_8_0,
                    	    								"org.unipampa.lesse.XCanopus.COUNTER_MEMORY");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getMemoryCounterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMemoryCounterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMemoryCounter"


    // $ANTLR start "entryRuleEInt"
    // InternalXCanopus.g:1668:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalXCanopus.g:1668:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalXCanopus.g:1669:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalXCanopus.g:1675:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1681:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalXCanopus.g:1682:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalXCanopus.g:1682:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalXCanopus.g:1683:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalXCanopus.g:1683:3: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==55) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXCanopus.g:1684:4: kw= '-'
                    {
                    kw=(Token)match(input,55,FOLLOW_48); 

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


    // $ANTLR start "entryRuleEString"
    // InternalXCanopus.g:1701:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXCanopus.g:1701:47: (iv_ruleEString= ruleEString EOF )
            // InternalXCanopus.g:1702:2: iv_ruleEString= ruleEString EOF
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
    // InternalXCanopus.g:1708:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1714:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXCanopus.g:1715:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXCanopus.g:1715:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalXCanopus.g:1716:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1724:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleHARDWARE"
    // InternalXCanopus.g:1735:1: ruleHARDWARE returns [Enumerator current=null] : ( (enumLiteral_0= 'PHYSICAL_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) ) ;
    public final Enumerator ruleHARDWARE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1741:2: ( ( (enumLiteral_0= 'PHYSICAL_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) ) )
            // InternalXCanopus.g:1742:2: ( (enumLiteral_0= 'PHYSICAL_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) )
            {
            // InternalXCanopus.g:1742:2: ( (enumLiteral_0= 'PHYSICAL_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt30=1;
                }
                break;
            case 57:
                {
                alt30=2;
                }
                break;
            case 58:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalXCanopus.g:1743:3: (enumLiteral_0= 'PHYSICAL_MACHINE' )
                    {
                    // InternalXCanopus.g:1743:3: (enumLiteral_0= 'PHYSICAL_MACHINE' )
                    // InternalXCanopus.g:1744:4: enumLiteral_0= 'PHYSICAL_MACHINE'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getHARDWAREAccess().getPHYSICAL_MACHINEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHARDWAREAccess().getPHYSICAL_MACHINEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1751:3: (enumLiteral_1= 'VIRTUAL_MACHINE' )
                    {
                    // InternalXCanopus.g:1751:3: (enumLiteral_1= 'VIRTUAL_MACHINE' )
                    // InternalXCanopus.g:1752:4: enumLiteral_1= 'VIRTUAL_MACHINE'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getHARDWAREAccess().getVIRTUAL_MACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHARDWAREAccess().getVIRTUAL_MACHINEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1759:3: (enumLiteral_2= 'CLOUD_SERVICE' )
                    {
                    // InternalXCanopus.g:1759:3: (enumLiteral_2= 'CLOUD_SERVICE' )
                    // InternalXCanopus.g:1760:4: enumLiteral_2= 'CLOUD_SERVICE'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getHARDWAREAccess().getCLOUD_SERVICEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHARDWAREAccess().getCLOUD_SERVICEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleHARDWARE"


    // $ANTLR start "ruleSUT_TYPE"
    // InternalXCanopus.g:1770:1: ruleSUT_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) ) ;
    public final Enumerator ruleSUT_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1776:2: ( ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) ) )
            // InternalXCanopus.g:1777:2: ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) )
            {
            // InternalXCanopus.g:1777:2: ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt31=1;
                }
                break;
            case 60:
                {
                alt31=2;
                }
                break;
            case 61:
                {
                alt31=3;
                }
                break;
            case 62:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalXCanopus.g:1778:3: (enumLiteral_0= 'DESKTOPAPP' )
                    {
                    // InternalXCanopus.g:1778:3: (enumLiteral_0= 'DESKTOPAPP' )
                    // InternalXCanopus.g:1779:4: enumLiteral_0= 'DESKTOPAPP'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getDESKTOPAPPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSUT_TYPEAccess().getDESKTOPAPPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1786:3: (enumLiteral_1= 'DATABASE' )
                    {
                    // InternalXCanopus.g:1786:3: (enumLiteral_1= 'DATABASE' )
                    // InternalXCanopus.g:1787:4: enumLiteral_1= 'DATABASE'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getDATABASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSUT_TYPEAccess().getDATABASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1794:3: (enumLiteral_2= 'WEBAPP' )
                    {
                    // InternalXCanopus.g:1794:3: (enumLiteral_2= 'WEBAPP' )
                    // InternalXCanopus.g:1795:4: enumLiteral_2= 'WEBAPP'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getWEBAPPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSUT_TYPEAccess().getWEBAPPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:1802:3: (enumLiteral_3= 'WEBSERVICE' )
                    {
                    // InternalXCanopus.g:1802:3: (enumLiteral_3= 'WEBSERVICE' )
                    // InternalXCanopus.g:1803:4: enumLiteral_3= 'WEBSERVICE'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

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


    // $ANTLR start "ruleCOUNTER_DISK"
    // InternalXCanopus.g:1813:1: ruleCOUNTER_DISK returns [Enumerator current=null] : ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) ) ;
    public final Enumerator ruleCOUNTER_DISK() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1819:2: ( ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) ) )
            // InternalXCanopus.g:1820:2: ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) )
            {
            // InternalXCanopus.g:1820:2: ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt32=1;
                }
                break;
            case 64:
                {
                alt32=2;
                }
                break;
            case 65:
                {
                alt32=3;
                }
                break;
            case 66:
                {
                alt32=4;
                }
                break;
            case 67:
                {
                alt32=5;
                }
                break;
            case 68:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalXCanopus.g:1821:3: (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' )
                    {
                    // InternalXCanopus.g:1821:3: (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' )
                    // InternalXCanopus.g:1822:4: enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_SECS_TRANSFER_COUNTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_SECS_TRANSFER_COUNTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1829:3: (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' )
                    {
                    // InternalXCanopus.g:1829:3: (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' )
                    // InternalXCanopus.g:1830:4: enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getPERCENTAGE_IDLE_TIME_COUNTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOUNTER_DISKAccess().getPERCENTAGE_IDLE_TIME_COUNTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1837:3: (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' )
                    {
                    // InternalXCanopus.g:1837:3: (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' )
                    // InternalXCanopus.g:1838:4: enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getDISK_TRANSFERS_SEC_COUNTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOUNTER_DISKAccess().getDISK_TRANSFERS_SEC_COUNTEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:1845:3: (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' )
                    {
                    // InternalXCanopus.g:1845:3: (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' )
                    // InternalXCanopus.g:1846:4: enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_QUEUE_LENGTH_COUNTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_QUEUE_LENGTH_COUNTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:1853:3: (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' )
                    {
                    // InternalXCanopus.g:1853:3: (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' )
                    // InternalXCanopus.g:1854:4: enumLiteral_4= 'SPLIT_IO_SEC_COUNTER'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getSPLIT_IO_SEC_COUNTEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCOUNTER_DISKAccess().getSPLIT_IO_SEC_COUNTEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXCanopus.g:1861:3: (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1861:3: (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' )
                    // InternalXCanopus.g:1862:4: enumLiteral_5= 'FREE_MEGABYTES_COUNTER'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getFREE_MEGABYTES_COUNTEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCOUNTER_DISKAccess().getFREE_MEGABYTES_COUNTEREnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleCOUNTER_DISK"


    // $ANTLR start "ruleCOUNTER_TRANSACTION"
    // InternalXCanopus.g:1872:1: ruleCOUNTER_TRANSACTION returns [Enumerator current=null] : ( (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' ) | (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' ) | (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' ) ) ;
    public final Enumerator ruleCOUNTER_TRANSACTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1878:2: ( ( (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' ) | (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' ) | (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' ) ) )
            // InternalXCanopus.g:1879:2: ( (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' ) | (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' ) | (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' ) )
            {
            // InternalXCanopus.g:1879:2: ( (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' ) | (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' ) | (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt33=1;
                }
                break;
            case 70:
                {
                alt33=2;
                }
                break;
            case 71:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalXCanopus.g:1880:3: (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' )
                    {
                    // InternalXCanopus.g:1880:3: (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' )
                    // InternalXCanopus.g:1881:4: enumLiteral_0= 'TRANSACTION_RESPONSE_TIME'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_RESPONSE_TIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_RESPONSE_TIMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1888:3: (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' )
                    {
                    // InternalXCanopus.g:1888:3: (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' )
                    // InternalXCanopus.g:1889:4: enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_PER_SECOND_TPSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_PER_SECOND_TPSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1896:3: (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' )
                    {
                    // InternalXCanopus.g:1896:3: (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' )
                    // InternalXCanopus.g:1897:4: enumLiteral_2= 'TRANSACTION_SUCCESS_RATE'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_SUCCESS_RATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_SUCCESS_RATEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleCOUNTER_TRANSACTION"


    // $ANTLR start "ruleCOUNTER_MEMORY"
    // InternalXCanopus.g:1907:1: ruleCOUNTER_MEMORY returns [Enumerator current=null] : ( (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' ) | (enumLiteral_1= 'PAGES_SEC_COUNTER' ) | (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' ) | (enumLiteral_3= 'WORKING_SET_COUNTER' ) | (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' ) | (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' ) | (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' ) | (enumLiteral_7= 'CACHE_BYTES_COUNTER' ) ) ;
    public final Enumerator ruleCOUNTER_MEMORY() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1913:2: ( ( (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' ) | (enumLiteral_1= 'PAGES_SEC_COUNTER' ) | (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' ) | (enumLiteral_3= 'WORKING_SET_COUNTER' ) | (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' ) | (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' ) | (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' ) | (enumLiteral_7= 'CACHE_BYTES_COUNTER' ) ) )
            // InternalXCanopus.g:1914:2: ( (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' ) | (enumLiteral_1= 'PAGES_SEC_COUNTER' ) | (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' ) | (enumLiteral_3= 'WORKING_SET_COUNTER' ) | (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' ) | (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' ) | (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' ) | (enumLiteral_7= 'CACHE_BYTES_COUNTER' ) )
            {
            // InternalXCanopus.g:1914:2: ( (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' ) | (enumLiteral_1= 'PAGES_SEC_COUNTER' ) | (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' ) | (enumLiteral_3= 'WORKING_SET_COUNTER' ) | (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' ) | (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' ) | (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' ) | (enumLiteral_7= 'CACHE_BYTES_COUNTER' ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt34=1;
                }
                break;
            case 73:
                {
                alt34=2;
                }
                break;
            case 74:
                {
                alt34=3;
                }
                break;
            case 75:
                {
                alt34=4;
                }
                break;
            case 76:
                {
                alt34=5;
                }
                break;
            case 77:
                {
                alt34=6;
                }
                break;
            case 78:
                {
                alt34=7;
                }
                break;
            case 79:
                {
                alt34=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalXCanopus.g:1915:3: (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1915:3: (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' )
                    // InternalXCanopus.g:1916:4: enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getAVALIABLE_MBYTES_COUNTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOUNTER_MEMORYAccess().getAVALIABLE_MBYTES_COUNTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1923:3: (enumLiteral_1= 'PAGES_SEC_COUNTER' )
                    {
                    // InternalXCanopus.g:1923:3: (enumLiteral_1= 'PAGES_SEC_COUNTER' )
                    // InternalXCanopus.g:1924:4: enumLiteral_1= 'PAGES_SEC_COUNTER'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPAGES_SEC_COUNTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOUNTER_MEMORYAccess().getPAGES_SEC_COUNTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1931:3: (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' )
                    {
                    // InternalXCanopus.g:1931:3: (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' )
                    // InternalXCanopus.g:1932:4: enumLiteral_2= 'PAGE_READS_SEC_COUNTER'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPAGE_READS_SEC_COUNTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOUNTER_MEMORYAccess().getPAGE_READS_SEC_COUNTEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:1939:3: (enumLiteral_3= 'WORKING_SET_COUNTER' )
                    {
                    // InternalXCanopus.g:1939:3: (enumLiteral_3= 'WORKING_SET_COUNTER' )
                    // InternalXCanopus.g:1940:4: enumLiteral_3= 'WORKING_SET_COUNTER'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getWORKING_SET_COUNTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOUNTER_MEMORYAccess().getWORKING_SET_COUNTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:1947:3: (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1947:3: (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' )
                    // InternalXCanopus.g:1948:4: enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER'
                    {
                    enumLiteral_4=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPOOL_NONPAGE_BYTES_COUNTEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCOUNTER_MEMORYAccess().getPOOL_NONPAGE_BYTES_COUNTEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXCanopus.g:1955:3: (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1955:3: (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' )
                    // InternalXCanopus.g:1956:4: enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER'
                    {
                    enumLiteral_5=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPAGED_POOL_BYTES_COUNTEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCOUNTER_MEMORYAccess().getPAGED_POOL_BYTES_COUNTEREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXCanopus.g:1963:3: (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' )
                    {
                    // InternalXCanopus.g:1963:3: (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' )
                    // InternalXCanopus.g:1964:4: enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER'
                    {
                    enumLiteral_6=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPAGED_POOL_FAILURES_COUNTEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getCOUNTER_MEMORYAccess().getPAGED_POOL_FAILURES_COUNTEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXCanopus.g:1971:3: (enumLiteral_7= 'CACHE_BYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1971:3: (enumLiteral_7= 'CACHE_BYTES_COUNTER' )
                    // InternalXCanopus.g:1972:4: enumLiteral_7= 'CACHE_BYTES_COUNTER'
                    {
                    enumLiteral_7=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getCACHE_BYTES_COUNTEREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getCOUNTER_MEMORYAccess().getCACHE_BYTES_COUNTEREnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleCOUNTER_MEMORY"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000320002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000320002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000320000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x7800000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000023C80080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000023880080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000023080080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000022080080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020080080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800080000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000080000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000080000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FF00L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});

}