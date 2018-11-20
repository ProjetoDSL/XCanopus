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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "'as'", "'Monitoring'", "'{'", "'Given'", "'that'", "'SUT'", "'monitored_by'", "'monitor'", "'And'", "'}'", "'hostname'", "'ip'", "'hardware'", "'type'", "'sut'", "'('", "','", "')'", "'metricmodel'", "'isMonitor'", "'LoadGenerator'", "'Memory'", "'memoryCounter'", "'Disk'", "'disk_io_counter'", "'Criteria'", "'value'", "'Threshold'", "'Disk_IO_Counter'", "'counterDisk'", "'TransactionCounter'", "'counterTransaction'", "'MemoryCounter'", "'counterMemory'", "'-'", "'PHYSICAL_MACHINE'", "'VIRTUAL_MACHINE'", "'CLOUD_SERVICE'", "'DESKTOPAPP'", "'DATABASE'", "'WEBAPP'", "'WEBSERVICE'", "'AVG_DISK_SECS_TRANSFER_COUNTER'", "'PERCENTAGE_IDLE_TIME_COUNTER'", "'DISK_TRANSFERS_SEC_COUNTER'", "'AVG_DISK_QUEUE_LENGTH_COUNTER'", "'SPLIT_IO_SEC_COUNTER'", "'FREE_MEGABYTES_COUNTER'", "'TRANSACTION_RESPONSE_TIME'", "'TRANSACTION_PER_SECOND_TPS'", "'TRANSACTION_SUCCESS_RATE'", "'AVALIABLE_MBYTES_COUNTER'", "'PAGES_SEC_COUNTER'", "'PAGE_READS_SEC_COUNTER'", "'WORKING_SET_COUNTER'", "'POOL_NONPAGE_BYTES_COUNTER'", "'PAGED_POOL_BYTES_COUNTER'", "'PAGED_POOL_FAILURES_COUNTER'", "'CACHE_BYTES_COUNTER'"
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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

                if ( (LA3_0==17) ) {
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

                if ( ((LA4_0>=31 && LA4_0<=32)) ) {
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
    // InternalXCanopus.g:230:1: ruleMonitoring returns [EObject current=null] : ( () otherlv_1= 'Monitoring' ruleEString otherlv_3= '{' otherlv_4= 'Given' otherlv_5= 'that' otherlv_6= 'SUT' ruleEString otherlv_8= 'monitored_by' otherlv_9= 'SUT' otherlv_10= 'monitor' otherlv_11= 'And' otherlv_12= '}' ) ;
    public final EObject ruleMonitoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalXCanopus.g:236:2: ( ( () otherlv_1= 'Monitoring' ruleEString otherlv_3= '{' otherlv_4= 'Given' otherlv_5= 'that' otherlv_6= 'SUT' ruleEString otherlv_8= 'monitored_by' otherlv_9= 'SUT' otherlv_10= 'monitor' otherlv_11= 'And' otherlv_12= '}' ) )
            // InternalXCanopus.g:237:2: ( () otherlv_1= 'Monitoring' ruleEString otherlv_3= '{' otherlv_4= 'Given' otherlv_5= 'that' otherlv_6= 'SUT' ruleEString otherlv_8= 'monitored_by' otherlv_9= 'SUT' otherlv_10= 'monitor' otherlv_11= 'And' otherlv_12= '}' )
            {
            // InternalXCanopus.g:237:2: ( () otherlv_1= 'Monitoring' ruleEString otherlv_3= '{' otherlv_4= 'Given' otherlv_5= 'that' otherlv_6= 'SUT' ruleEString otherlv_8= 'monitored_by' otherlv_9= 'SUT' otherlv_10= 'monitor' otherlv_11= 'And' otherlv_12= '}' )
            // InternalXCanopus.g:238:3: () otherlv_1= 'Monitoring' ruleEString otherlv_3= '{' otherlv_4= 'Given' otherlv_5= 'that' otherlv_6= 'SUT' ruleEString otherlv_8= 'monitored_by' otherlv_9= 'SUT' otherlv_10= 'monitor' otherlv_11= 'And' otherlv_12= '}'
            {
            // InternalXCanopus.g:238:3: ()
            // InternalXCanopus.g:239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMonitoringAccess().getMonitoringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMonitoringAccess().getMonitoringKeyword_1());
            		

            			newCompositeNode(grammarAccess.getMonitoringAccess().getEStringParserRuleCall_2());
            		
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitoringAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getMonitoringAccess().getGivenKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getMonitoringAccess().getThatKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getMonitoringAccess().getSUTKeyword_6());
            		

            			newCompositeNode(grammarAccess.getMonitoringAccess().getEStringParserRuleCall_7());
            		
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_8=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getMonitoringAccess().getMonitored_byKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getMonitoringAccess().getSUTKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getMonitoringAccess().getMonitorKeyword_10());
            		
            otherlv_11=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getMonitoringAccess().getAndKeyword_11());
            		
            otherlv_12=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMonitoringAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleMetric"
    // InternalXCanopus.g:303:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalXCanopus.g:303:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalXCanopus.g:304:2: iv_ruleMetric= ruleMetric EOF
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
    // InternalXCanopus.g:310:1: ruleMetric returns [EObject current=null] : (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        EObject this_Memory_0 = null;

        EObject this_Disk_1 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:316:2: ( (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk ) )
            // InternalXCanopus.g:317:2: (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk )
            {
            // InternalXCanopus.g:317:2: (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==35) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXCanopus.g:318:3: this_Memory_0= ruleMemory
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
                    // InternalXCanopus.g:327:3: this_Disk_1= ruleDisk
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
    // InternalXCanopus.g:339:1: entryRuleCounter returns [EObject current=null] : iv_ruleCounter= ruleCounter EOF ;
    public final EObject entryRuleCounter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounter = null;


        try {
            // InternalXCanopus.g:339:48: (iv_ruleCounter= ruleCounter EOF )
            // InternalXCanopus.g:340:2: iv_ruleCounter= ruleCounter EOF
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
    // InternalXCanopus.g:346:1: ruleCounter returns [EObject current=null] : (this_Disk_IO_Counter_0= ruleDisk_IO_Counter | this_MemoryCounter_1= ruleMemoryCounter | this_TransactionCounter_2= ruleTransactionCounter ) ;
    public final EObject ruleCounter() throws RecognitionException {
        EObject current = null;

        EObject this_Disk_IO_Counter_0 = null;

        EObject this_MemoryCounter_1 = null;

        EObject this_TransactionCounter_2 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:352:2: ( (this_Disk_IO_Counter_0= ruleDisk_IO_Counter | this_MemoryCounter_1= ruleMemoryCounter | this_TransactionCounter_2= ruleTransactionCounter ) )
            // InternalXCanopus.g:353:2: (this_Disk_IO_Counter_0= ruleDisk_IO_Counter | this_MemoryCounter_1= ruleMemoryCounter | this_TransactionCounter_2= ruleTransactionCounter )
            {
            // InternalXCanopus.g:353:2: (this_Disk_IO_Counter_0= ruleDisk_IO_Counter | this_MemoryCounter_1= ruleMemoryCounter | this_TransactionCounter_2= ruleTransactionCounter )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            case 42:
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
                    // InternalXCanopus.g:354:3: this_Disk_IO_Counter_0= ruleDisk_IO_Counter
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
                    // InternalXCanopus.g:363:3: this_MemoryCounter_1= ruleMemoryCounter
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
                    // InternalXCanopus.g:372:3: this_TransactionCounter_2= ruleTransactionCounter
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
    // InternalXCanopus.g:384:1: entryRuleSUT returns [EObject current=null] : iv_ruleSUT= ruleSUT EOF ;
    public final EObject entryRuleSUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUT = null;


        try {
            // InternalXCanopus.g:384:44: (iv_ruleSUT= ruleSUT EOF )
            // InternalXCanopus.g:385:2: iv_ruleSUT= ruleSUT EOF
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
    // InternalXCanopus.g:391:1: ruleSUT returns [EObject current=null] : ( () otherlv_1= 'SUT' otherlv_2= '{' (otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) )? (otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) )? (otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHARDWARE ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleSUT_TYPE ) ) )? (otherlv_11= 'sut' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'metricmodel' ( ( ruleEString ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleSUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_hostname_4_0 = null;

        AntlrDatatypeRuleToken lv_ip_6_0 = null;

        Enumerator lv_hardware_8_0 = null;

        Enumerator lv_type_10_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:397:2: ( ( () otherlv_1= 'SUT' otherlv_2= '{' (otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) )? (otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) )? (otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHARDWARE ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleSUT_TYPE ) ) )? (otherlv_11= 'sut' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'metricmodel' ( ( ruleEString ) ) )? otherlv_19= '}' ) )
            // InternalXCanopus.g:398:2: ( () otherlv_1= 'SUT' otherlv_2= '{' (otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) )? (otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) )? (otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHARDWARE ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleSUT_TYPE ) ) )? (otherlv_11= 'sut' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'metricmodel' ( ( ruleEString ) ) )? otherlv_19= '}' )
            {
            // InternalXCanopus.g:398:2: ( () otherlv_1= 'SUT' otherlv_2= '{' (otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) )? (otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) )? (otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHARDWARE ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleSUT_TYPE ) ) )? (otherlv_11= 'sut' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'metricmodel' ( ( ruleEString ) ) )? otherlv_19= '}' )
            // InternalXCanopus.g:399:3: () otherlv_1= 'SUT' otherlv_2= '{' (otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) )? (otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) )? (otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHARDWARE ) ) )? (otherlv_9= 'type' ( (lv_type_10_0= ruleSUT_TYPE ) ) )? (otherlv_11= 'sut' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'metricmodel' ( ( ruleEString ) ) )? otherlv_19= '}'
            {
            // InternalXCanopus.g:399:3: ()
            // InternalXCanopus.g:400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSUTAccess().getSUTAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSUTAccess().getSUTKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSUTAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXCanopus.g:414:3: (otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXCanopus.g:415:4: otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getSUTAccess().getHostnameKeyword_3_0());
                    			
                    // InternalXCanopus.g:419:4: ( (lv_hostname_4_0= ruleEString ) )
                    // InternalXCanopus.g:420:5: (lv_hostname_4_0= ruleEString )
                    {
                    // InternalXCanopus.g:420:5: (lv_hostname_4_0= ruleEString )
                    // InternalXCanopus.g:421:6: lv_hostname_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSUTAccess().getHostnameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_hostname_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSUTRule());
                    						}
                    						set(
                    							current,
                    							"hostname",
                    							lv_hostname_4_0,
                    							"org.unipampa.lesse.XCanopus.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXCanopus.g:439:3: (otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXCanopus.g:440:4: otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSUTAccess().getIpKeyword_4_0());
                    			
                    // InternalXCanopus.g:444:4: ( (lv_ip_6_0= ruleEString ) )
                    // InternalXCanopus.g:445:5: (lv_ip_6_0= ruleEString )
                    {
                    // InternalXCanopus.g:445:5: (lv_ip_6_0= ruleEString )
                    // InternalXCanopus.g:446:6: lv_ip_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSUTAccess().getIpEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ip_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSUTRule());
                    						}
                    						set(
                    							current,
                    							"ip",
                    							lv_ip_6_0,
                    							"org.unipampa.lesse.XCanopus.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXCanopus.g:464:3: (otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHARDWARE ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXCanopus.g:465:4: otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHARDWARE ) )
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getSUTAccess().getHardwareKeyword_5_0());
                    			
                    // InternalXCanopus.g:469:4: ( (lv_hardware_8_0= ruleHARDWARE ) )
                    // InternalXCanopus.g:470:5: (lv_hardware_8_0= ruleHARDWARE )
                    {
                    // InternalXCanopus.g:470:5: (lv_hardware_8_0= ruleHARDWARE )
                    // InternalXCanopus.g:471:6: lv_hardware_8_0= ruleHARDWARE
                    {

                    						newCompositeNode(grammarAccess.getSUTAccess().getHardwareHARDWAREEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_hardware_8_0=ruleHARDWARE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSUTRule());
                    						}
                    						set(
                    							current,
                    							"hardware",
                    							lv_hardware_8_0,
                    							"org.unipampa.lesse.XCanopus.HARDWARE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXCanopus.g:489:3: (otherlv_9= 'type' ( (lv_type_10_0= ruleSUT_TYPE ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXCanopus.g:490:4: otherlv_9= 'type' ( (lv_type_10_0= ruleSUT_TYPE ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_9, grammarAccess.getSUTAccess().getTypeKeyword_6_0());
                    			
                    // InternalXCanopus.g:494:4: ( (lv_type_10_0= ruleSUT_TYPE ) )
                    // InternalXCanopus.g:495:5: (lv_type_10_0= ruleSUT_TYPE )
                    {
                    // InternalXCanopus.g:495:5: (lv_type_10_0= ruleSUT_TYPE )
                    // InternalXCanopus.g:496:6: lv_type_10_0= ruleSUT_TYPE
                    {

                    						newCompositeNode(grammarAccess.getSUTAccess().getTypeSUT_TYPEEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_type_10_0=ruleSUT_TYPE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSUTRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"org.unipampa.lesse.XCanopus.SUT_TYPE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXCanopus.g:514:3: (otherlv_11= 'sut' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXCanopus.g:515:4: otherlv_11= 'sut' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getSUTAccess().getSutKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getSUTAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalXCanopus.g:523:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:524:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:524:5: ( ruleEString )
                    // InternalXCanopus.g:525:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSUTRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSUTAccess().getSutSUTCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXCanopus.g:539:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalXCanopus.g:540:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,28,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getSUTAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXCanopus.g:544:5: ( ( ruleEString ) )
                    	    // InternalXCanopus.g:545:6: ( ruleEString )
                    	    {
                    	    // InternalXCanopus.g:545:6: ( ruleEString )
                    	    // InternalXCanopus.g:546:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSUTRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSUTAccess().getSutSUTCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getSUTAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXCanopus.g:566:3: (otherlv_17= 'metricmodel' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXCanopus.g:567:4: otherlv_17= 'metricmodel' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getSUTAccess().getMetricmodelKeyword_8_0());
                    			
                    // InternalXCanopus.g:571:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:572:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:572:5: ( ruleEString )
                    // InternalXCanopus.g:573:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSUTRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSUTAccess().getMetricmodelMetricModelCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSUTAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalXCanopus.g:596:1: entryRuleLoadGenerator returns [EObject current=null] : iv_ruleLoadGenerator= ruleLoadGenerator EOF ;
    public final EObject entryRuleLoadGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadGenerator = null;


        try {
            // InternalXCanopus.g:596:54: (iv_ruleLoadGenerator= ruleLoadGenerator EOF )
            // InternalXCanopus.g:597:2: iv_ruleLoadGenerator= ruleLoadGenerator EOF
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
    // InternalXCanopus.g:603:1: ruleLoadGenerator returns [EObject current=null] : ( () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
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
            // InternalXCanopus.g:609:2: ( ( () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalXCanopus.g:610:2: ( () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalXCanopus.g:610:2: ( () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalXCanopus.g:611:3: () ( (lv_isMonitor_1_0= 'isMonitor' ) )? otherlv_2= 'LoadGenerator' otherlv_3= '{' (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )? (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )? (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )? (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )? (otherlv_18= 'monitor' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalXCanopus.g:611:3: ()
            // InternalXCanopus.g:612:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadGeneratorAccess().getLoadGeneratorAction_0(),
            					current);
            			

            }

            // InternalXCanopus.g:618:3: ( (lv_isMonitor_1_0= 'isMonitor' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalXCanopus.g:619:4: (lv_isMonitor_1_0= 'isMonitor' )
                    {
                    // InternalXCanopus.g:619:4: (lv_isMonitor_1_0= 'isMonitor' )
                    // InternalXCanopus.g:620:5: lv_isMonitor_1_0= 'isMonitor'
                    {
                    lv_isMonitor_1_0=(Token)match(input,31,FOLLOW_29); 

                    					newLeafNode(lv_isMonitor_1_0, grammarAccess.getLoadGeneratorAccess().getIsMonitorIsMonitorKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    					}
                    					setWithLastConsumed(current, "isMonitor", true, "isMonitor");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadGeneratorAccess().getLoadGeneratorKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadGeneratorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:640:3: (otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXCanopus.g:641:4: otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoadGeneratorAccess().getHostnameKeyword_4_0());
                    			
                    // InternalXCanopus.g:645:4: ( (lv_hostname_5_0= ruleEString ) )
                    // InternalXCanopus.g:646:5: (lv_hostname_5_0= ruleEString )
                    {
                    // InternalXCanopus.g:646:5: (lv_hostname_5_0= ruleEString )
                    // InternalXCanopus.g:647:6: lv_hostname_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getHostnameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

            // InternalXCanopus.g:665:3: (otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXCanopus.g:666:4: otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoadGeneratorAccess().getIpKeyword_5_0());
                    			
                    // InternalXCanopus.g:670:4: ( (lv_ip_7_0= ruleEString ) )
                    // InternalXCanopus.g:671:5: (lv_ip_7_0= ruleEString )
                    {
                    // InternalXCanopus.g:671:5: (lv_ip_7_0= ruleEString )
                    // InternalXCanopus.g:672:6: lv_ip_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getIpEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_32);
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

            // InternalXCanopus.g:690:3: (otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXCanopus.g:691:4: otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHARDWARE ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getLoadGeneratorAccess().getHardwareKeyword_6_0());
                    			
                    // InternalXCanopus.g:695:4: ( (lv_hardware_9_0= ruleHARDWARE ) )
                    // InternalXCanopus.g:696:5: (lv_hardware_9_0= ruleHARDWARE )
                    {
                    // InternalXCanopus.g:696:5: (lv_hardware_9_0= ruleHARDWARE )
                    // InternalXCanopus.g:697:6: lv_hardware_9_0= ruleHARDWARE
                    {

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getHardwareHARDWAREEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            // InternalXCanopus.g:715:3: (otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalXCanopus.g:716:4: otherlv_10= 'sut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getLoadGeneratorAccess().getSutKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,27,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getLoadGeneratorAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalXCanopus.g:724:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:725:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:725:5: ( ruleEString )
                    // InternalXCanopus.g:726:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getSutSUTCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXCanopus.g:740:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==28) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalXCanopus.g:741:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,28,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getLoadGeneratorAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalXCanopus.g:745:5: ( ( ruleEString ) )
                    	    // InternalXCanopus.g:746:6: ( ruleEString )
                    	    {
                    	    // InternalXCanopus.g:746:6: ( ruleEString )
                    	    // InternalXCanopus.g:747:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getLoadGeneratorAccess().getSutSUTCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,29,FOLLOW_34); 

                    				newLeafNode(otherlv_15, grammarAccess.getLoadGeneratorAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalXCanopus.g:767:3: (otherlv_16= 'metricmodel' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalXCanopus.g:768:4: otherlv_16= 'metricmodel' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getLoadGeneratorAccess().getMetricmodelKeyword_8_0());
                    			
                    // InternalXCanopus.g:772:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:773:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:773:5: ( ruleEString )
                    // InternalXCanopus.g:774:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getMetricmodelMetricModelCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXCanopus.g:789:3: (otherlv_18= 'monitor' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalXCanopus.g:790:4: otherlv_18= 'monitor' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_18, grammarAccess.getLoadGeneratorAccess().getMonitorKeyword_9_0());
                    			
                    // InternalXCanopus.g:794:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:795:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:795:5: ( ruleEString )
                    // InternalXCanopus.g:796:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoadGeneratorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLoadGeneratorAccess().getMonitorMonitorCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXCanopus.g:819:1: entryRuleMemory returns [EObject current=null] : iv_ruleMemory= ruleMemory EOF ;
    public final EObject entryRuleMemory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemory = null;


        try {
            // InternalXCanopus.g:819:47: (iv_ruleMemory= ruleMemory EOF )
            // InternalXCanopus.g:820:2: iv_ruleMemory= ruleMemory EOF
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
    // InternalXCanopus.g:826:1: ruleMemory returns [EObject current=null] : ( () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMemory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:832:2: ( ( () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalXCanopus.g:833:2: ( () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalXCanopus.g:833:2: ( () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalXCanopus.g:834:3: () otherlv_1= 'Memory' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalXCanopus.g:834:3: ()
            // InternalXCanopus.g:835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryAccess().getMemoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryAccess().getMemoryKeyword_1());
            		
            // InternalXCanopus.g:845:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:846:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:846:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:847:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMemoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getMemoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:868:3: (otherlv_4= 'memoryCounter' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalXCanopus.g:869:4: otherlv_4= 'memoryCounter' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getMemoryAccess().getMemoryCounterKeyword_4_0());
                    			
                    // InternalXCanopus.g:873:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:874:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:874:5: ( ruleEString )
                    // InternalXCanopus.g:875:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemoryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMemoryAccess().getMemoryCounterMemoryCounterCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXCanopus.g:898:1: entryRuleDisk returns [EObject current=null] : iv_ruleDisk= ruleDisk EOF ;
    public final EObject entryRuleDisk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisk = null;


        try {
            // InternalXCanopus.g:898:45: (iv_ruleDisk= ruleDisk EOF )
            // InternalXCanopus.g:899:2: iv_ruleDisk= ruleDisk EOF
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
    // InternalXCanopus.g:905:1: ruleDisk returns [EObject current=null] : ( () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDisk() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:911:2: ( ( () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalXCanopus.g:912:2: ( () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalXCanopus.g:912:2: ( () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalXCanopus.g:913:3: () otherlv_1= 'Disk' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalXCanopus.g:913:3: ()
            // InternalXCanopus.g:914:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiskAccess().getDiskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDiskAccess().getDiskKeyword_1());
            		
            // InternalXCanopus.g:924:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:925:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:925:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:926:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDiskAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,14,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getDiskAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:947:3: (otherlv_4= 'disk_io_counter' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalXCanopus.g:948:4: otherlv_4= 'disk_io_counter' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getDiskAccess().getDisk_io_counterKeyword_4_0());
                    			
                    // InternalXCanopus.g:952:4: ( ( ruleEString ) )
                    // InternalXCanopus.g:953:5: ( ruleEString )
                    {
                    // InternalXCanopus.g:953:5: ( ruleEString )
                    // InternalXCanopus.g:954:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDiskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDiskAccess().getDisk_io_counterDisk_IO_CounterCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXCanopus.g:977:1: entryRuleCriteria returns [EObject current=null] : iv_ruleCriteria= ruleCriteria EOF ;
    public final EObject entryRuleCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCriteria = null;


        try {
            // InternalXCanopus.g:977:49: (iv_ruleCriteria= ruleCriteria EOF )
            // InternalXCanopus.g:978:2: iv_ruleCriteria= ruleCriteria EOF
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
    // InternalXCanopus.g:984:1: ruleCriteria returns [EObject current=null] : ( () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:990:2: ( ( () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalXCanopus.g:991:2: ( () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalXCanopus.g:991:2: ( () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalXCanopus.g:992:3: () otherlv_1= 'Criteria' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalXCanopus.g:992:3: ()
            // InternalXCanopus.g:993:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCriteriaAccess().getCriteriaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCriteriaAccess().getCriteriaKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getCriteriaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXCanopus.g:1007:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXCanopus.g:1008:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getCriteriaAccess().getValueKeyword_3_0());
                    			
                    // InternalXCanopus.g:1012:4: ( (lv_value_4_0= ruleEInt ) )
                    // InternalXCanopus.g:1013:5: (lv_value_4_0= ruleEInt )
                    {
                    // InternalXCanopus.g:1013:5: (lv_value_4_0= ruleEInt )
                    // InternalXCanopus.g:1014:6: lv_value_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getCriteriaAccess().getValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXCanopus.g:1040:1: entryRuleThreshold returns [EObject current=null] : iv_ruleThreshold= ruleThreshold EOF ;
    public final EObject entryRuleThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreshold = null;


        try {
            // InternalXCanopus.g:1040:50: (iv_ruleThreshold= ruleThreshold EOF )
            // InternalXCanopus.g:1041:2: iv_ruleThreshold= ruleThreshold EOF
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
    // InternalXCanopus.g:1047:1: ruleThreshold returns [EObject current=null] : ( () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalXCanopus.g:1053:2: ( ( () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' ) )
            // InternalXCanopus.g:1054:2: ( () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            {
            // InternalXCanopus.g:1054:2: ( () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}' )
            // InternalXCanopus.g:1055:3: () otherlv_1= 'Threshold' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )? otherlv_5= '}'
            {
            // InternalXCanopus.g:1055:3: ()
            // InternalXCanopus.g:1056:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThresholdAccess().getThresholdAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getThresholdAccess().getThresholdKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getThresholdAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXCanopus.g:1070:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXCanopus.g:1071:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getThresholdAccess().getValueKeyword_3_0());
                    			
                    // InternalXCanopus.g:1075:4: ( (lv_value_4_0= ruleEInt ) )
                    // InternalXCanopus.g:1076:5: (lv_value_4_0= ruleEInt )
                    {
                    // InternalXCanopus.g:1076:5: (lv_value_4_0= ruleEInt )
                    // InternalXCanopus.g:1077:6: lv_value_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getThresholdAccess().getValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXCanopus.g:1103:1: entryRuleDisk_IO_Counter returns [EObject current=null] : iv_ruleDisk_IO_Counter= ruleDisk_IO_Counter EOF ;
    public final EObject entryRuleDisk_IO_Counter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisk_IO_Counter = null;


        try {
            // InternalXCanopus.g:1103:56: (iv_ruleDisk_IO_Counter= ruleDisk_IO_Counter EOF )
            // InternalXCanopus.g:1104:2: iv_ruleDisk_IO_Counter= ruleDisk_IO_Counter EOF
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
    // InternalXCanopus.g:1110:1: ruleDisk_IO_Counter returns [EObject current=null] : ( () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalXCanopus.g:1116:2: ( ( () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalXCanopus.g:1117:2: ( () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalXCanopus.g:1117:2: ( () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalXCanopus.g:1118:3: () otherlv_1= 'Disk_IO_Counter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalXCanopus.g:1118:3: ()
            // InternalXCanopus.g:1119:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDisk_IO_CounterAccess().getDisk_IO_CounterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDisk_IO_CounterAccess().getDisk_IO_CounterKeyword_1());
            		
            // InternalXCanopus.g:1129:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:1130:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:1130:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:1131:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDisk_IO_CounterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getDisk_IO_CounterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:1152:3: (otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXCanopus.g:1153:4: otherlv_4= 'counterDisk' otherlv_5= '{' ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) ) (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getDisk_IO_CounterAccess().getCounterDiskKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getDisk_IO_CounterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXCanopus.g:1161:4: ( (lv_counterDisk_6_0= ruleCOUNTER_DISK ) )
                    // InternalXCanopus.g:1162:5: (lv_counterDisk_6_0= ruleCOUNTER_DISK )
                    {
                    // InternalXCanopus.g:1162:5: (lv_counterDisk_6_0= ruleCOUNTER_DISK )
                    // InternalXCanopus.g:1163:6: lv_counterDisk_6_0= ruleCOUNTER_DISK
                    {

                    						newCompositeNode(grammarAccess.getDisk_IO_CounterAccess().getCounterDiskCOUNTER_DISKEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_42);
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

                    // InternalXCanopus.g:1180:4: (otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==28) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalXCanopus.g:1181:5: otherlv_7= ',' ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_41); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDisk_IO_CounterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXCanopus.g:1185:5: ( (lv_counterDisk_8_0= ruleCOUNTER_DISK ) )
                    	    // InternalXCanopus.g:1186:6: (lv_counterDisk_8_0= ruleCOUNTER_DISK )
                    	    {
                    	    // InternalXCanopus.g:1186:6: (lv_counterDisk_8_0= ruleCOUNTER_DISK )
                    	    // InternalXCanopus.g:1187:7: lv_counterDisk_8_0= ruleCOUNTER_DISK
                    	    {

                    	    							newCompositeNode(grammarAccess.getDisk_IO_CounterAccess().getCounterDiskCOUNTER_DISKEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getDisk_IO_CounterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXCanopus.g:1218:1: entryRuleTransactionCounter returns [EObject current=null] : iv_ruleTransactionCounter= ruleTransactionCounter EOF ;
    public final EObject entryRuleTransactionCounter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactionCounter = null;


        try {
            // InternalXCanopus.g:1218:59: (iv_ruleTransactionCounter= ruleTransactionCounter EOF )
            // InternalXCanopus.g:1219:2: iv_ruleTransactionCounter= ruleTransactionCounter EOF
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
    // InternalXCanopus.g:1225:1: ruleTransactionCounter returns [EObject current=null] : ( () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalXCanopus.g:1231:2: ( ( () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalXCanopus.g:1232:2: ( () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalXCanopus.g:1232:2: ( () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalXCanopus.g:1233:3: () otherlv_1= 'TransactionCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalXCanopus.g:1233:3: ()
            // InternalXCanopus.g:1234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransactionCounterAccess().getTransactionCounterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTransactionCounterAccess().getTransactionCounterKeyword_1());
            		
            // InternalXCanopus.g:1244:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:1245:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:1245:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:1246:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransactionCounterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,14,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getTransactionCounterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:1267:3: (otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalXCanopus.g:1268:4: otherlv_4= 'counterTransaction' otherlv_5= '{' ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) ) (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransactionCounterAccess().getCounterTransactionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransactionCounterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXCanopus.g:1276:4: ( (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION ) )
                    // InternalXCanopus.g:1277:5: (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION )
                    {
                    // InternalXCanopus.g:1277:5: (lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION )
                    // InternalXCanopus.g:1278:6: lv_counterTransaction_6_0= ruleCOUNTER_TRANSACTION
                    {

                    						newCompositeNode(grammarAccess.getTransactionCounterAccess().getCounterTransactionCOUNTER_TRANSACTIONEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_42);
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

                    // InternalXCanopus.g:1295:4: (otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==28) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalXCanopus.g:1296:5: otherlv_7= ',' ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_44); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTransactionCounterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXCanopus.g:1300:5: ( (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION ) )
                    	    // InternalXCanopus.g:1301:6: (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION )
                    	    {
                    	    // InternalXCanopus.g:1301:6: (lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION )
                    	    // InternalXCanopus.g:1302:7: lv_counterTransaction_8_0= ruleCOUNTER_TRANSACTION
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransactionCounterAccess().getCounterTransactionCOUNTER_TRANSACTIONEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransactionCounterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXCanopus.g:1333:1: entryRuleMemoryCounter returns [EObject current=null] : iv_ruleMemoryCounter= ruleMemoryCounter EOF ;
    public final EObject entryRuleMemoryCounter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryCounter = null;


        try {
            // InternalXCanopus.g:1333:54: (iv_ruleMemoryCounter= ruleMemoryCounter EOF )
            // InternalXCanopus.g:1334:2: iv_ruleMemoryCounter= ruleMemoryCounter EOF
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
    // InternalXCanopus.g:1340:1: ruleMemoryCounter returns [EObject current=null] : ( () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // InternalXCanopus.g:1346:2: ( ( () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalXCanopus.g:1347:2: ( () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalXCanopus.g:1347:2: ( () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalXCanopus.g:1348:3: () otherlv_1= 'MemoryCounter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalXCanopus.g:1348:3: ()
            // InternalXCanopus.g:1349:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryCounterAccess().getMemoryCounterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoryCounterAccess().getMemoryCounterKeyword_1());
            		
            // InternalXCanopus.g:1359:3: ( (lv_name_2_0= ruleEString ) )
            // InternalXCanopus.g:1360:4: (lv_name_2_0= ruleEString )
            {
            // InternalXCanopus.g:1360:4: (lv_name_2_0= ruleEString )
            // InternalXCanopus.g:1361:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMemoryCounterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,14,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getMemoryCounterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXCanopus.g:1382:3: (otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalXCanopus.g:1383:4: otherlv_4= 'counterMemory' otherlv_5= '{' ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) ) (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getMemoryCounterAccess().getCounterMemoryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_46); 

                    				newLeafNode(otherlv_5, grammarAccess.getMemoryCounterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalXCanopus.g:1391:4: ( (lv_counterMemory_6_0= ruleCOUNTER_MEMORY ) )
                    // InternalXCanopus.g:1392:5: (lv_counterMemory_6_0= ruleCOUNTER_MEMORY )
                    {
                    // InternalXCanopus.g:1392:5: (lv_counterMemory_6_0= ruleCOUNTER_MEMORY )
                    // InternalXCanopus.g:1393:6: lv_counterMemory_6_0= ruleCOUNTER_MEMORY
                    {

                    						newCompositeNode(grammarAccess.getMemoryCounterAccess().getCounterMemoryCOUNTER_MEMORYEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_42);
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

                    // InternalXCanopus.g:1410:4: (otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==28) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalXCanopus.g:1411:5: otherlv_7= ',' ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_46); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMemoryCounterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalXCanopus.g:1415:5: ( (lv_counterMemory_8_0= ruleCOUNTER_MEMORY ) )
                    	    // InternalXCanopus.g:1416:6: (lv_counterMemory_8_0= ruleCOUNTER_MEMORY )
                    	    {
                    	    // InternalXCanopus.g:1416:6: (lv_counterMemory_8_0= ruleCOUNTER_MEMORY )
                    	    // InternalXCanopus.g:1417:7: lv_counterMemory_8_0= ruleCOUNTER_MEMORY
                    	    {

                    	    							newCompositeNode(grammarAccess.getMemoryCounterAccess().getCounterMemoryCOUNTER_MEMORYEnumRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getMemoryCounterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

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
    // InternalXCanopus.g:1448:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalXCanopus.g:1448:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalXCanopus.g:1449:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalXCanopus.g:1455:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1461:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalXCanopus.g:1462:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalXCanopus.g:1462:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalXCanopus.g:1463:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalXCanopus.g:1463:3: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalXCanopus.g:1464:4: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_47); 

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
    // InternalXCanopus.g:1481:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXCanopus.g:1481:47: (iv_ruleEString= ruleEString EOF )
            // InternalXCanopus.g:1482:2: iv_ruleEString= ruleEString EOF
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
    // InternalXCanopus.g:1488:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1494:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXCanopus.g:1495:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXCanopus.g:1495:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalXCanopus.g:1496:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1504:3: this_ID_1= RULE_ID
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
    // InternalXCanopus.g:1515:1: ruleHARDWARE returns [Enumerator current=null] : ( (enumLiteral_0= 'PHYSICAL_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) ) ;
    public final Enumerator ruleHARDWARE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1521:2: ( ( (enumLiteral_0= 'PHYSICAL_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) ) )
            // InternalXCanopus.g:1522:2: ( (enumLiteral_0= 'PHYSICAL_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) )
            {
            // InternalXCanopus.g:1522:2: ( (enumLiteral_0= 'PHYSICAL_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt34=1;
                }
                break;
            case 48:
                {
                alt34=2;
                }
                break;
            case 49:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalXCanopus.g:1523:3: (enumLiteral_0= 'PHYSICAL_MACHINE' )
                    {
                    // InternalXCanopus.g:1523:3: (enumLiteral_0= 'PHYSICAL_MACHINE' )
                    // InternalXCanopus.g:1524:4: enumLiteral_0= 'PHYSICAL_MACHINE'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getHARDWAREAccess().getPHYSICAL_MACHINEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHARDWAREAccess().getPHYSICAL_MACHINEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1531:3: (enumLiteral_1= 'VIRTUAL_MACHINE' )
                    {
                    // InternalXCanopus.g:1531:3: (enumLiteral_1= 'VIRTUAL_MACHINE' )
                    // InternalXCanopus.g:1532:4: enumLiteral_1= 'VIRTUAL_MACHINE'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getHARDWAREAccess().getVIRTUAL_MACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHARDWAREAccess().getVIRTUAL_MACHINEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1539:3: (enumLiteral_2= 'CLOUD_SERVICE' )
                    {
                    // InternalXCanopus.g:1539:3: (enumLiteral_2= 'CLOUD_SERVICE' )
                    // InternalXCanopus.g:1540:4: enumLiteral_2= 'CLOUD_SERVICE'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

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
    // InternalXCanopus.g:1550:1: ruleSUT_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) ) ;
    public final Enumerator ruleSUT_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1556:2: ( ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) ) )
            // InternalXCanopus.g:1557:2: ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) )
            {
            // InternalXCanopus.g:1557:2: ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt35=1;
                }
                break;
            case 51:
                {
                alt35=2;
                }
                break;
            case 52:
                {
                alt35=3;
                }
                break;
            case 53:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalXCanopus.g:1558:3: (enumLiteral_0= 'DESKTOPAPP' )
                    {
                    // InternalXCanopus.g:1558:3: (enumLiteral_0= 'DESKTOPAPP' )
                    // InternalXCanopus.g:1559:4: enumLiteral_0= 'DESKTOPAPP'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getDESKTOPAPPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSUT_TYPEAccess().getDESKTOPAPPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1566:3: (enumLiteral_1= 'DATABASE' )
                    {
                    // InternalXCanopus.g:1566:3: (enumLiteral_1= 'DATABASE' )
                    // InternalXCanopus.g:1567:4: enumLiteral_1= 'DATABASE'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getDATABASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSUT_TYPEAccess().getDATABASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1574:3: (enumLiteral_2= 'WEBAPP' )
                    {
                    // InternalXCanopus.g:1574:3: (enumLiteral_2= 'WEBAPP' )
                    // InternalXCanopus.g:1575:4: enumLiteral_2= 'WEBAPP'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSUT_TYPEAccess().getWEBAPPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSUT_TYPEAccess().getWEBAPPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:1582:3: (enumLiteral_3= 'WEBSERVICE' )
                    {
                    // InternalXCanopus.g:1582:3: (enumLiteral_3= 'WEBSERVICE' )
                    // InternalXCanopus.g:1583:4: enumLiteral_3= 'WEBSERVICE'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

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
    // InternalXCanopus.g:1593:1: ruleCOUNTER_DISK returns [Enumerator current=null] : ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) ) ;
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
            // InternalXCanopus.g:1599:2: ( ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) ) )
            // InternalXCanopus.g:1600:2: ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) )
            {
            // InternalXCanopus.g:1600:2: ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) )
            int alt36=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt36=1;
                }
                break;
            case 55:
                {
                alt36=2;
                }
                break;
            case 56:
                {
                alt36=3;
                }
                break;
            case 57:
                {
                alt36=4;
                }
                break;
            case 58:
                {
                alt36=5;
                }
                break;
            case 59:
                {
                alt36=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalXCanopus.g:1601:3: (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' )
                    {
                    // InternalXCanopus.g:1601:3: (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' )
                    // InternalXCanopus.g:1602:4: enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_SECS_TRANSFER_COUNTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_SECS_TRANSFER_COUNTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1609:3: (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' )
                    {
                    // InternalXCanopus.g:1609:3: (enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER' )
                    // InternalXCanopus.g:1610:4: enumLiteral_1= 'PERCENTAGE_IDLE_TIME_COUNTER'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getPERCENTAGE_IDLE_TIME_COUNTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOUNTER_DISKAccess().getPERCENTAGE_IDLE_TIME_COUNTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1617:3: (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' )
                    {
                    // InternalXCanopus.g:1617:3: (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' )
                    // InternalXCanopus.g:1618:4: enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getDISK_TRANSFERS_SEC_COUNTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOUNTER_DISKAccess().getDISK_TRANSFERS_SEC_COUNTEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:1625:3: (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' )
                    {
                    // InternalXCanopus.g:1625:3: (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' )
                    // InternalXCanopus.g:1626:4: enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_QUEUE_LENGTH_COUNTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_QUEUE_LENGTH_COUNTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:1633:3: (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' )
                    {
                    // InternalXCanopus.g:1633:3: (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' )
                    // InternalXCanopus.g:1634:4: enumLiteral_4= 'SPLIT_IO_SEC_COUNTER'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getSPLIT_IO_SEC_COUNTEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCOUNTER_DISKAccess().getSPLIT_IO_SEC_COUNTEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXCanopus.g:1641:3: (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1641:3: (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' )
                    // InternalXCanopus.g:1642:4: enumLiteral_5= 'FREE_MEGABYTES_COUNTER'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); 

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
    // InternalXCanopus.g:1652:1: ruleCOUNTER_TRANSACTION returns [Enumerator current=null] : ( (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' ) | (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' ) | (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' ) ) ;
    public final Enumerator ruleCOUNTER_TRANSACTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalXCanopus.g:1658:2: ( ( (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' ) | (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' ) | (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' ) ) )
            // InternalXCanopus.g:1659:2: ( (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' ) | (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' ) | (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' ) )
            {
            // InternalXCanopus.g:1659:2: ( (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' ) | (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' ) | (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt37=1;
                }
                break;
            case 61:
                {
                alt37=2;
                }
                break;
            case 62:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalXCanopus.g:1660:3: (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' )
                    {
                    // InternalXCanopus.g:1660:3: (enumLiteral_0= 'TRANSACTION_RESPONSE_TIME' )
                    // InternalXCanopus.g:1661:4: enumLiteral_0= 'TRANSACTION_RESPONSE_TIME'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_RESPONSE_TIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_RESPONSE_TIMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1668:3: (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' )
                    {
                    // InternalXCanopus.g:1668:3: (enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS' )
                    // InternalXCanopus.g:1669:4: enumLiteral_1= 'TRANSACTION_PER_SECOND_TPS'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_PER_SECOND_TPSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOUNTER_TRANSACTIONAccess().getTRANSACTION_PER_SECOND_TPSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1676:3: (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' )
                    {
                    // InternalXCanopus.g:1676:3: (enumLiteral_2= 'TRANSACTION_SUCCESS_RATE' )
                    // InternalXCanopus.g:1677:4: enumLiteral_2= 'TRANSACTION_SUCCESS_RATE'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

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
    // InternalXCanopus.g:1687:1: ruleCOUNTER_MEMORY returns [Enumerator current=null] : ( (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' ) | (enumLiteral_1= 'PAGES_SEC_COUNTER' ) | (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' ) | (enumLiteral_3= 'WORKING_SET_COUNTER' ) | (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' ) | (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' ) | (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' ) | (enumLiteral_7= 'CACHE_BYTES_COUNTER' ) ) ;
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
            // InternalXCanopus.g:1693:2: ( ( (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' ) | (enumLiteral_1= 'PAGES_SEC_COUNTER' ) | (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' ) | (enumLiteral_3= 'WORKING_SET_COUNTER' ) | (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' ) | (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' ) | (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' ) | (enumLiteral_7= 'CACHE_BYTES_COUNTER' ) ) )
            // InternalXCanopus.g:1694:2: ( (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' ) | (enumLiteral_1= 'PAGES_SEC_COUNTER' ) | (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' ) | (enumLiteral_3= 'WORKING_SET_COUNTER' ) | (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' ) | (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' ) | (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' ) | (enumLiteral_7= 'CACHE_BYTES_COUNTER' ) )
            {
            // InternalXCanopus.g:1694:2: ( (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' ) | (enumLiteral_1= 'PAGES_SEC_COUNTER' ) | (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' ) | (enumLiteral_3= 'WORKING_SET_COUNTER' ) | (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' ) | (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' ) | (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' ) | (enumLiteral_7= 'CACHE_BYTES_COUNTER' ) )
            int alt38=8;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt38=1;
                }
                break;
            case 64:
                {
                alt38=2;
                }
                break;
            case 65:
                {
                alt38=3;
                }
                break;
            case 66:
                {
                alt38=4;
                }
                break;
            case 67:
                {
                alt38=5;
                }
                break;
            case 68:
                {
                alt38=6;
                }
                break;
            case 69:
                {
                alt38=7;
                }
                break;
            case 70:
                {
                alt38=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalXCanopus.g:1695:3: (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1695:3: (enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER' )
                    // InternalXCanopus.g:1696:4: enumLiteral_0= 'AVALIABLE_MBYTES_COUNTER'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getAVALIABLE_MBYTES_COUNTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOUNTER_MEMORYAccess().getAVALIABLE_MBYTES_COUNTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:1703:3: (enumLiteral_1= 'PAGES_SEC_COUNTER' )
                    {
                    // InternalXCanopus.g:1703:3: (enumLiteral_1= 'PAGES_SEC_COUNTER' )
                    // InternalXCanopus.g:1704:4: enumLiteral_1= 'PAGES_SEC_COUNTER'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPAGES_SEC_COUNTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOUNTER_MEMORYAccess().getPAGES_SEC_COUNTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:1711:3: (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' )
                    {
                    // InternalXCanopus.g:1711:3: (enumLiteral_2= 'PAGE_READS_SEC_COUNTER' )
                    // InternalXCanopus.g:1712:4: enumLiteral_2= 'PAGE_READS_SEC_COUNTER'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPAGE_READS_SEC_COUNTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOUNTER_MEMORYAccess().getPAGE_READS_SEC_COUNTEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:1719:3: (enumLiteral_3= 'WORKING_SET_COUNTER' )
                    {
                    // InternalXCanopus.g:1719:3: (enumLiteral_3= 'WORKING_SET_COUNTER' )
                    // InternalXCanopus.g:1720:4: enumLiteral_3= 'WORKING_SET_COUNTER'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getWORKING_SET_COUNTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOUNTER_MEMORYAccess().getWORKING_SET_COUNTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:1727:3: (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1727:3: (enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER' )
                    // InternalXCanopus.g:1728:4: enumLiteral_4= 'POOL_NONPAGE_BYTES_COUNTER'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPOOL_NONPAGE_BYTES_COUNTEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCOUNTER_MEMORYAccess().getPOOL_NONPAGE_BYTES_COUNTEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalXCanopus.g:1735:3: (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1735:3: (enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER' )
                    // InternalXCanopus.g:1736:4: enumLiteral_5= 'PAGED_POOL_BYTES_COUNTER'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPAGED_POOL_BYTES_COUNTEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCOUNTER_MEMORYAccess().getPAGED_POOL_BYTES_COUNTEREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalXCanopus.g:1743:3: (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' )
                    {
                    // InternalXCanopus.g:1743:3: (enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER' )
                    // InternalXCanopus.g:1744:4: enumLiteral_6= 'PAGED_POOL_FAILURES_COUNTER'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_MEMORYAccess().getPAGED_POOL_FAILURES_COUNTEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getCOUNTER_MEMORYAccess().getPAGED_POOL_FAILURES_COUNTEREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalXCanopus.g:1751:3: (enumLiteral_7= 'CACHE_BYTES_COUNTER' )
                    {
                    // InternalXCanopus.g:1751:3: (enumLiteral_7= 'CACHE_BYTES_COUNTER' )
                    // InternalXCanopus.g:1752:4: enumLiteral_7= 'CACHE_BYTES_COUNTER'
                    {
                    enumLiteral_7=(Token)match(input,70,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000180022802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000180022002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000180020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000047E00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000047A00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000047200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000046200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000044200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000045E80000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000045A80000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000045280000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000044280000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040280000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000040L});

}