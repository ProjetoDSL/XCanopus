package org.unipampa.lesse.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.unipampa.lesse.services.XCanopusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXCanopusParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MBWHEN_GREATEROREQUAL_TEXT", "RULE_MBWHEN_LESSTHAN_TEXT", "RULE_MBWHEN_MORETHAN_TEXT", "RULE_MBWHEN_MINOROREQUAL_TEXT", "RULE_SHOULDBELESSTHAN_TEXT", "RULE_SHOULDBEATLEAST_TEXT", "RULE_SHOULDBEGREATERTHAN", "RULE_WHENTHENUMBERISLESSTHAN_TEXT", "RULE_WHENTHENUMBERISGREATERTHAN_TEXT", "RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT", "RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT", "RULE_WHENTHENUMBERAREBETWEEN_TEXT", "RULE_STRING", "RULE_ID", "RULE_WORKLOADGENERATED", "RULE_LOADGENERATORFORTHE", "RULE_ON", "RULE_THE", "RULE_ISTESTSCENARIO", "RULE_ATL", "RULE_AND", "RULE_ISMONITORED", "RULE_THAT", "RULE_MONITOREDBY", "RULE_MONITOR_TEXT", "RULE_INT", "RULE_NNL", "RULE_NL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'memory'", "'disk'", "'web resources'", "'transaction'", "'processor'", "'available mbytes counter'", "'% idle time counter'", "'throughput mbytes'", "'transactions per second'", "'TPS'", "'% processor time count'", "'transactions response time'", "'DESKTOPAPP'", "'DATABASE'", "'WEBAPP'", "'WEBSERVICE'", "'Feature:'", "'.'", "'Monitoring:'", "'description'", "'{'", "'}'", "'And'", "'When'", "'Then'", "'Given'", "'Scenario'", "'SUT'"
    };
    public static final int RULE_WHENTHENUMBERAREBETWEEN_TEXT=15;
    public static final int T__50=50;
    public static final int RULE_MONITOREDBY=27;
    public static final int RULE_ATL=23;
    public static final int RULE_ISMONITORED=25;
    public static final int RULE_SHOULDBEGREATERTHAN=10;
    public static final int T__59=59;
    public static final int RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT=13;
    public static final int T__55=55;
    public static final int RULE_ON=20;
    public static final int T__56=56;
    public static final int RULE_WHENTHENUMBERISLESSTHAN_TEXT=11;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_MBWHEN_MINOROREQUAL_TEXT=7;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_SHOULDBELESSTHAN_TEXT=8;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_THAT=26;
    public static final int RULE_ID=17;
    public static final int RULE_THE=21;
    public static final int RULE_SHOULDBEATLEAST_TEXT=9;
    public static final int RULE_INT=29;
    public static final int RULE_ML_COMMENT=32;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_MBWHEN_MORETHAN_TEXT=6;
    public static final int RULE_STRING=16;
    public static final int RULE_AND=24;
    public static final int RULE_MBWHEN_GREATEROREQUAL_TEXT=4;
    public static final int RULE_SL_COMMENT=33;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int RULE_WS=34;
    public static final int RULE_ISTESTSCENARIO=22;
    public static final int RULE_ANY_OTHER=35;
    public static final int RULE_WORKLOADGENERATED=18;
    public static final int RULE_MBWHEN_LESSTHAN_TEXT=5;
    public static final int RULE_NNL=30;
    public static final int RULE_MONITOR_TEXT=28;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_LOADGENERATORFORTHE=19;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT=14;
    public static final int T__47=47;
    public static final int RULE_NL=31;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_WHENTHENUMBERISGREATERTHAN_TEXT=12;
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

    	public void setGrammarAccess(XCanopusGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalXCanopus.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalXCanopus.g:54:1: ( ruleModel EOF )
            // InternalXCanopus.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalXCanopus.g:62:1: ruleModel : ( ( rule__Model__MainAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:66:2: ( ( ( rule__Model__MainAssignment )* ) )
            // InternalXCanopus.g:67:2: ( ( rule__Model__MainAssignment )* )
            {
            // InternalXCanopus.g:67:2: ( ( rule__Model__MainAssignment )* )
            // InternalXCanopus.g:68:3: ( rule__Model__MainAssignment )*
            {
             before(grammarAccess.getModelAccess().getMainAssignment()); 
            // InternalXCanopus.g:69:3: ( rule__Model__MainAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==52||(LA1_0>=62 && LA1_0<=63)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXCanopus.g:69:4: rule__Model__MainAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__MainAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMainAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMetricModel"
    // InternalXCanopus.g:78:1: entryRuleMetricModel : ruleMetricModel EOF ;
    public final void entryRuleMetricModel() throws RecognitionException {
        try {
            // InternalXCanopus.g:79:1: ( ruleMetricModel EOF )
            // InternalXCanopus.g:80:1: ruleMetricModel EOF
            {
             before(grammarAccess.getMetricModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMetricModel();

            state._fsp--;

             after(grammarAccess.getMetricModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMetricModel"


    // $ANTLR start "ruleMetricModel"
    // InternalXCanopus.g:87:1: ruleMetricModel : ( ( rule__MetricModel__Group__0 ) ) ;
    public final void ruleMetricModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:91:2: ( ( ( rule__MetricModel__Group__0 ) ) )
            // InternalXCanopus.g:92:2: ( ( rule__MetricModel__Group__0 ) )
            {
            // InternalXCanopus.g:92:2: ( ( rule__MetricModel__Group__0 ) )
            // InternalXCanopus.g:93:3: ( rule__MetricModel__Group__0 )
            {
             before(grammarAccess.getMetricModelAccess().getGroup()); 
            // InternalXCanopus.g:94:3: ( rule__MetricModel__Group__0 )
            // InternalXCanopus.g:94:4: rule__MetricModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricModelAccess().getGroup()); 

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
    // $ANTLR end "ruleMetricModel"


    // $ANTLR start "entryRuleMain"
    // InternalXCanopus.g:103:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalXCanopus.g:104:1: ( ruleMain EOF )
            // InternalXCanopus.g:105:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalXCanopus.g:112:1: ruleMain : ( ( rule__Main__MainAssignment ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:116:2: ( ( ( rule__Main__MainAssignment ) ) )
            // InternalXCanopus.g:117:2: ( ( rule__Main__MainAssignment ) )
            {
            // InternalXCanopus.g:117:2: ( ( rule__Main__MainAssignment ) )
            // InternalXCanopus.g:118:3: ( rule__Main__MainAssignment )
            {
             before(grammarAccess.getMainAccess().getMainAssignment()); 
            // InternalXCanopus.g:119:3: ( rule__Main__MainAssignment )
            // InternalXCanopus.g:119:4: rule__Main__MainAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Main__MainAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getMainAssignment()); 

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleFreetext"
    // InternalXCanopus.g:128:1: entryRuleFreetext : ruleFreetext EOF ;
    public final void entryRuleFreetext() throws RecognitionException {
        try {
            // InternalXCanopus.g:129:1: ( ruleFreetext EOF )
            // InternalXCanopus.g:130:1: ruleFreetext EOF
            {
             before(grammarAccess.getFreetextRule()); 
            pushFollow(FOLLOW_1);
            ruleFreetext();

            state._fsp--;

             after(grammarAccess.getFreetextRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFreetext"


    // $ANTLR start "ruleFreetext"
    // InternalXCanopus.g:137:1: ruleFreetext : ( ( ruleEString )* ) ;
    public final void ruleFreetext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:141:2: ( ( ( ruleEString )* ) )
            // InternalXCanopus.g:142:2: ( ( ruleEString )* )
            {
            // InternalXCanopus.g:142:2: ( ( ruleEString )* )
            // InternalXCanopus.g:143:3: ( ruleEString )*
            {
             before(grammarAccess.getFreetextAccess().getEStringParserRuleCall()); 
            // InternalXCanopus.g:144:3: ( ruleEString )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXCanopus.g:144:4: ruleEString
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleEString();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFreetextAccess().getEStringParserRuleCall()); 

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
    // $ANTLR end "ruleFreetext"


    // $ANTLR start "entryRuleSTEPS"
    // InternalXCanopus.g:153:1: entryRuleSTEPS : ruleSTEPS EOF ;
    public final void entryRuleSTEPS() throws RecognitionException {
        try {
            // InternalXCanopus.g:154:1: ( ruleSTEPS EOF )
            // InternalXCanopus.g:155:1: ruleSTEPS EOF
            {
             before(grammarAccess.getSTEPSRule()); 
            pushFollow(FOLLOW_1);
            ruleSTEPS();

            state._fsp--;

             after(grammarAccess.getSTEPSRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSTEPS"


    // $ANTLR start "ruleSTEPS"
    // InternalXCanopus.g:162:1: ruleSTEPS : ( ( rule__STEPS__Alternatives ) ) ;
    public final void ruleSTEPS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:166:2: ( ( ( rule__STEPS__Alternatives ) ) )
            // InternalXCanopus.g:167:2: ( ( rule__STEPS__Alternatives ) )
            {
            // InternalXCanopus.g:167:2: ( ( rule__STEPS__Alternatives ) )
            // InternalXCanopus.g:168:3: ( rule__STEPS__Alternatives )
            {
             before(grammarAccess.getSTEPSAccess().getAlternatives()); 
            // InternalXCanopus.g:169:3: ( rule__STEPS__Alternatives )
            // InternalXCanopus.g:169:4: rule__STEPS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__STEPS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSTEPSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSTEPS"


    // $ANTLR start "entryRuleand_workload"
    // InternalXCanopus.g:178:1: entryRuleand_workload : ruleand_workload EOF ;
    public final void entryRuleand_workload() throws RecognitionException {
        try {
            // InternalXCanopus.g:179:1: ( ruleand_workload EOF )
            // InternalXCanopus.g:180:1: ruleand_workload EOF
            {
             before(grammarAccess.getAnd_workloadRule()); 
            pushFollow(FOLLOW_1);
            ruleand_workload();

            state._fsp--;

             after(grammarAccess.getAnd_workloadRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleand_workload"


    // $ANTLR start "ruleand_workload"
    // InternalXCanopus.g:187:1: ruleand_workload : ( ( rule__And_workload__Group__0 ) ) ;
    public final void ruleand_workload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:191:2: ( ( ( rule__And_workload__Group__0 ) ) )
            // InternalXCanopus.g:192:2: ( ( rule__And_workload__Group__0 ) )
            {
            // InternalXCanopus.g:192:2: ( ( rule__And_workload__Group__0 ) )
            // InternalXCanopus.g:193:3: ( rule__And_workload__Group__0 )
            {
             before(grammarAccess.getAnd_workloadAccess().getGroup()); 
            // InternalXCanopus.g:194:3: ( rule__And_workload__Group__0 )
            // InternalXCanopus.g:194:4: rule__And_workload__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And_workload__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnd_workloadAccess().getGroup()); 

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
    // $ANTLR end "ruleand_workload"


    // $ANTLR start "entryRuleand_the_scenario"
    // InternalXCanopus.g:203:1: entryRuleand_the_scenario : ruleand_the_scenario EOF ;
    public final void entryRuleand_the_scenario() throws RecognitionException {
        try {
            // InternalXCanopus.g:204:1: ( ruleand_the_scenario EOF )
            // InternalXCanopus.g:205:1: ruleand_the_scenario EOF
            {
             before(grammarAccess.getAnd_the_scenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleand_the_scenario();

            state._fsp--;

             after(grammarAccess.getAnd_the_scenarioRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleand_the_scenario"


    // $ANTLR start "ruleand_the_scenario"
    // InternalXCanopus.g:212:1: ruleand_the_scenario : ( ( rule__And_the_scenario__Group__0 ) ) ;
    public final void ruleand_the_scenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:216:2: ( ( ( rule__And_the_scenario__Group__0 ) ) )
            // InternalXCanopus.g:217:2: ( ( rule__And_the_scenario__Group__0 ) )
            {
            // InternalXCanopus.g:217:2: ( ( rule__And_the_scenario__Group__0 ) )
            // InternalXCanopus.g:218:3: ( rule__And_the_scenario__Group__0 )
            {
             before(grammarAccess.getAnd_the_scenarioAccess().getGroup()); 
            // InternalXCanopus.g:219:3: ( rule__And_the_scenario__Group__0 )
            // InternalXCanopus.g:219:4: rule__And_the_scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And_the_scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnd_the_scenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleand_the_scenario"


    // $ANTLR start "entryRuleand_atleast"
    // InternalXCanopus.g:228:1: entryRuleand_atleast : ruleand_atleast EOF ;
    public final void entryRuleand_atleast() throws RecognitionException {
        try {
            // InternalXCanopus.g:229:1: ( ruleand_atleast EOF )
            // InternalXCanopus.g:230:1: ruleand_atleast EOF
            {
             before(grammarAccess.getAnd_atleastRule()); 
            pushFollow(FOLLOW_1);
            ruleand_atleast();

            state._fsp--;

             after(grammarAccess.getAnd_atleastRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleand_atleast"


    // $ANTLR start "ruleand_atleast"
    // InternalXCanopus.g:237:1: ruleand_atleast : ( ( rule__And_atleast__Group__0 ) ) ;
    public final void ruleand_atleast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:241:2: ( ( ( rule__And_atleast__Group__0 ) ) )
            // InternalXCanopus.g:242:2: ( ( rule__And_atleast__Group__0 ) )
            {
            // InternalXCanopus.g:242:2: ( ( rule__And_atleast__Group__0 ) )
            // InternalXCanopus.g:243:3: ( rule__And_atleast__Group__0 )
            {
             before(grammarAccess.getAnd_atleastAccess().getGroup()); 
            // InternalXCanopus.g:244:3: ( rule__And_atleast__Group__0 )
            // InternalXCanopus.g:244:4: rule__And_atleast__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And_atleast__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnd_atleastAccess().getGroup()); 

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
    // $ANTLR end "ruleand_atleast"


    // $ANTLR start "entryRuleand_the_metric"
    // InternalXCanopus.g:253:1: entryRuleand_the_metric : ruleand_the_metric EOF ;
    public final void entryRuleand_the_metric() throws RecognitionException {
        try {
            // InternalXCanopus.g:254:1: ( ruleand_the_metric EOF )
            // InternalXCanopus.g:255:1: ruleand_the_metric EOF
            {
             before(grammarAccess.getAnd_the_metricRule()); 
            pushFollow(FOLLOW_1);
            ruleand_the_metric();

            state._fsp--;

             after(grammarAccess.getAnd_the_metricRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleand_the_metric"


    // $ANTLR start "ruleand_the_metric"
    // InternalXCanopus.g:262:1: ruleand_the_metric : ( ( rule__And_the_metric__Group__0 ) ) ;
    public final void ruleand_the_metric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:266:2: ( ( ( rule__And_the_metric__Group__0 ) ) )
            // InternalXCanopus.g:267:2: ( ( rule__And_the_metric__Group__0 ) )
            {
            // InternalXCanopus.g:267:2: ( ( rule__And_the_metric__Group__0 ) )
            // InternalXCanopus.g:268:3: ( rule__And_the_metric__Group__0 )
            {
             before(grammarAccess.getAnd_the_metricAccess().getGroup()); 
            // InternalXCanopus.g:269:3: ( rule__And_the_metric__Group__0 )
            // InternalXCanopus.g:269:4: rule__And_the_metric__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnd_the_metricAccess().getGroup()); 

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
    // $ANTLR end "ruleand_the_metric"


    // $ANTLR start "entryRulewhen"
    // InternalXCanopus.g:278:1: entryRulewhen : rulewhen EOF ;
    public final void entryRulewhen() throws RecognitionException {
        try {
            // InternalXCanopus.g:279:1: ( rulewhen EOF )
            // InternalXCanopus.g:280:1: rulewhen EOF
            {
             before(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            rulewhen();

            state._fsp--;

             after(grammarAccess.getWhenRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulewhen"


    // $ANTLR start "rulewhen"
    // InternalXCanopus.g:287:1: rulewhen : ( ( rule__When__Group__0 ) ) ;
    public final void rulewhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:291:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalXCanopus.g:292:2: ( ( rule__When__Group__0 ) )
            {
            // InternalXCanopus.g:292:2: ( ( rule__When__Group__0 ) )
            // InternalXCanopus.g:293:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalXCanopus.g:294:3: ( rule__When__Group__0 )
            // InternalXCanopus.g:294:4: rule__When__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getGroup()); 

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
    // $ANTLR end "rulewhen"


    // $ANTLR start "entryRulethen"
    // InternalXCanopus.g:303:1: entryRulethen : rulethen EOF ;
    public final void entryRulethen() throws RecognitionException {
        try {
            // InternalXCanopus.g:304:1: ( rulethen EOF )
            // InternalXCanopus.g:305:1: rulethen EOF
            {
             before(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            rulethen();

            state._fsp--;

             after(grammarAccess.getThenRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulethen"


    // $ANTLR start "rulethen"
    // InternalXCanopus.g:312:1: rulethen : ( ( rule__Then__Group__0 ) ) ;
    public final void rulethen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:316:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalXCanopus.g:317:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalXCanopus.g:317:2: ( ( rule__Then__Group__0 ) )
            // InternalXCanopus.g:318:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalXCanopus.g:319:3: ( rule__Then__Group__0 )
            // InternalXCanopus.g:319:4: rule__Then__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getGroup()); 

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
    // $ANTLR end "rulethen"


    // $ANTLR start "entryRulegiven"
    // InternalXCanopus.g:328:1: entryRulegiven : rulegiven EOF ;
    public final void entryRulegiven() throws RecognitionException {
        try {
            // InternalXCanopus.g:329:1: ( rulegiven EOF )
            // InternalXCanopus.g:330:1: rulegiven EOF
            {
             before(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            rulegiven();

            state._fsp--;

             after(grammarAccess.getGivenRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulegiven"


    // $ANTLR start "rulegiven"
    // InternalXCanopus.g:337:1: rulegiven : ( ( rule__Given__Group__0 ) ) ;
    public final void rulegiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:341:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalXCanopus.g:342:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalXCanopus.g:342:2: ( ( rule__Given__Group__0 ) )
            // InternalXCanopus.g:343:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalXCanopus.g:344:3: ( rule__Given__Group__0 )
            // InternalXCanopus.g:344:4: rule__Given__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getGroup()); 

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
    // $ANTLR end "rulegiven"


    // $ANTLR start "entryRuleSCENARIO"
    // InternalXCanopus.g:353:1: entryRuleSCENARIO : ruleSCENARIO EOF ;
    public final void entryRuleSCENARIO() throws RecognitionException {
        try {
            // InternalXCanopus.g:354:1: ( ruleSCENARIO EOF )
            // InternalXCanopus.g:355:1: ruleSCENARIO EOF
            {
             before(grammarAccess.getSCENARIORule()); 
            pushFollow(FOLLOW_1);
            ruleSCENARIO();

            state._fsp--;

             after(grammarAccess.getSCENARIORule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSCENARIO"


    // $ANTLR start "ruleSCENARIO"
    // InternalXCanopus.g:362:1: ruleSCENARIO : ( ( rule__SCENARIO__Group__0 ) ) ;
    public final void ruleSCENARIO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:366:2: ( ( ( rule__SCENARIO__Group__0 ) ) )
            // InternalXCanopus.g:367:2: ( ( rule__SCENARIO__Group__0 ) )
            {
            // InternalXCanopus.g:367:2: ( ( rule__SCENARIO__Group__0 ) )
            // InternalXCanopus.g:368:3: ( rule__SCENARIO__Group__0 )
            {
             before(grammarAccess.getSCENARIOAccess().getGroup()); 
            // InternalXCanopus.g:369:3: ( rule__SCENARIO__Group__0 )
            // InternalXCanopus.g:369:4: rule__SCENARIO__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SCENARIO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSCENARIOAccess().getGroup()); 

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
    // $ANTLR end "ruleSCENARIO"


    // $ANTLR start "entryRuleSUT"
    // InternalXCanopus.g:378:1: entryRuleSUT : ruleSUT EOF ;
    public final void entryRuleSUT() throws RecognitionException {
        try {
            // InternalXCanopus.g:379:1: ( ruleSUT EOF )
            // InternalXCanopus.g:380:1: ruleSUT EOF
            {
             before(grammarAccess.getSUTRule()); 
            pushFollow(FOLLOW_1);
            ruleSUT();

            state._fsp--;

             after(grammarAccess.getSUTRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSUT"


    // $ANTLR start "ruleSUT"
    // InternalXCanopus.g:387:1: ruleSUT : ( ( rule__SUT__Group__0 ) ) ;
    public final void ruleSUT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:391:2: ( ( ( rule__SUT__Group__0 ) ) )
            // InternalXCanopus.g:392:2: ( ( rule__SUT__Group__0 ) )
            {
            // InternalXCanopus.g:392:2: ( ( rule__SUT__Group__0 ) )
            // InternalXCanopus.g:393:3: ( rule__SUT__Group__0 )
            {
             before(grammarAccess.getSUTAccess().getGroup()); 
            // InternalXCanopus.g:394:3: ( rule__SUT__Group__0 )
            // InternalXCanopus.g:394:4: rule__SUT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SUT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSUTAccess().getGroup()); 

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
    // $ANTLR end "ruleSUT"


    // $ANTLR start "entryRuleEString"
    // InternalXCanopus.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalXCanopus.g:404:1: ( ruleEString EOF )
            // InternalXCanopus.g:405:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalXCanopus.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalXCanopus.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalXCanopus.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalXCanopus.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalXCanopus.g:419:3: ( rule__EString__Alternatives )
            // InternalXCanopus.g:419:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "ruleMETRICTYPEMONITORED"
    // InternalXCanopus.g:428:1: ruleMETRICTYPEMONITORED : ( ( rule__METRICTYPEMONITORED__Alternatives ) ) ;
    public final void ruleMETRICTYPEMONITORED() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:432:1: ( ( ( rule__METRICTYPEMONITORED__Alternatives ) ) )
            // InternalXCanopus.g:433:2: ( ( rule__METRICTYPEMONITORED__Alternatives ) )
            {
            // InternalXCanopus.g:433:2: ( ( rule__METRICTYPEMONITORED__Alternatives ) )
            // InternalXCanopus.g:434:3: ( rule__METRICTYPEMONITORED__Alternatives )
            {
             before(grammarAccess.getMETRICTYPEMONITOREDAccess().getAlternatives()); 
            // InternalXCanopus.g:435:3: ( rule__METRICTYPEMONITORED__Alternatives )
            // InternalXCanopus.g:435:4: rule__METRICTYPEMONITORED__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__METRICTYPEMONITORED__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMETRICTYPEMONITOREDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMETRICTYPEMONITORED"


    // $ANTLR start "ruleMETRICTYPE"
    // InternalXCanopus.g:444:1: ruleMETRICTYPE : ( ( rule__METRICTYPE__Alternatives ) ) ;
    public final void ruleMETRICTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:448:1: ( ( ( rule__METRICTYPE__Alternatives ) ) )
            // InternalXCanopus.g:449:2: ( ( rule__METRICTYPE__Alternatives ) )
            {
            // InternalXCanopus.g:449:2: ( ( rule__METRICTYPE__Alternatives ) )
            // InternalXCanopus.g:450:3: ( rule__METRICTYPE__Alternatives )
            {
             before(grammarAccess.getMETRICTYPEAccess().getAlternatives()); 
            // InternalXCanopus.g:451:3: ( rule__METRICTYPE__Alternatives )
            // InternalXCanopus.g:451:4: rule__METRICTYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__METRICTYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMETRICTYPEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMETRICTYPE"


    // $ANTLR start "ruleSUT_TYPE"
    // InternalXCanopus.g:460:1: ruleSUT_TYPE : ( ( rule__SUT_TYPE__Alternatives ) ) ;
    public final void ruleSUT_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:464:1: ( ( ( rule__SUT_TYPE__Alternatives ) ) )
            // InternalXCanopus.g:465:2: ( ( rule__SUT_TYPE__Alternatives ) )
            {
            // InternalXCanopus.g:465:2: ( ( rule__SUT_TYPE__Alternatives ) )
            // InternalXCanopus.g:466:3: ( rule__SUT_TYPE__Alternatives )
            {
             before(grammarAccess.getSUT_TYPEAccess().getAlternatives()); 
            // InternalXCanopus.g:467:3: ( rule__SUT_TYPE__Alternatives )
            // InternalXCanopus.g:467:4: rule__SUT_TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SUT_TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSUT_TYPEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSUT_TYPE"


    // $ANTLR start "rule__Main__MainAlternatives_0"
    // InternalXCanopus.g:475:1: rule__Main__MainAlternatives_0 : ( ( ruleMetricModel ) | ( ruleSCENARIO ) | ( ruleSUT ) );
    public final void rule__Main__MainAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:479:1: ( ( ruleMetricModel ) | ( ruleSCENARIO ) | ( ruleSUT ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt3=1;
                }
                break;
            case 62:
                {
                alt3=2;
                }
                break;
            case 63:
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
                    // InternalXCanopus.g:480:2: ( ruleMetricModel )
                    {
                    // InternalXCanopus.g:480:2: ( ruleMetricModel )
                    // InternalXCanopus.g:481:3: ruleMetricModel
                    {
                     before(grammarAccess.getMainAccess().getMainMetricModelParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMetricModel();

                    state._fsp--;

                     after(grammarAccess.getMainAccess().getMainMetricModelParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:486:2: ( ruleSCENARIO )
                    {
                    // InternalXCanopus.g:486:2: ( ruleSCENARIO )
                    // InternalXCanopus.g:487:3: ruleSCENARIO
                    {
                     before(grammarAccess.getMainAccess().getMainSCENARIOParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSCENARIO();

                    state._fsp--;

                     after(grammarAccess.getMainAccess().getMainSCENARIOParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:492:2: ( ruleSUT )
                    {
                    // InternalXCanopus.g:492:2: ( ruleSUT )
                    // InternalXCanopus.g:493:3: ruleSUT
                    {
                     before(grammarAccess.getMainAccess().getMainSUTParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSUT();

                    state._fsp--;

                     after(grammarAccess.getMainAccess().getMainSUTParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__Main__MainAlternatives_0"


    // $ANTLR start "rule__STEPS__Alternatives"
    // InternalXCanopus.g:502:1: rule__STEPS__Alternatives : ( ( rulegiven ) | ( rulewhen ) | ( rulethen ) | ( ruleand_workload ) | ( ruleand_atleast ) | ( ruleand_the_scenario ) | ( ruleand_the_metric ) );
    public final void rule__STEPS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:506:1: ( ( rulegiven ) | ( rulewhen ) | ( rulethen ) | ( ruleand_workload ) | ( ruleand_atleast ) | ( ruleand_the_scenario ) | ( ruleand_the_metric ) )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalXCanopus.g:507:2: ( rulegiven )
                    {
                    // InternalXCanopus.g:507:2: ( rulegiven )
                    // InternalXCanopus.g:508:3: rulegiven
                    {
                     before(grammarAccess.getSTEPSAccess().getGivenParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulegiven();

                    state._fsp--;

                     after(grammarAccess.getSTEPSAccess().getGivenParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:513:2: ( rulewhen )
                    {
                    // InternalXCanopus.g:513:2: ( rulewhen )
                    // InternalXCanopus.g:514:3: rulewhen
                    {
                     before(grammarAccess.getSTEPSAccess().getWhenParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulewhen();

                    state._fsp--;

                     after(grammarAccess.getSTEPSAccess().getWhenParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:519:2: ( rulethen )
                    {
                    // InternalXCanopus.g:519:2: ( rulethen )
                    // InternalXCanopus.g:520:3: rulethen
                    {
                     before(grammarAccess.getSTEPSAccess().getThenParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulethen();

                    state._fsp--;

                     after(grammarAccess.getSTEPSAccess().getThenParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:525:2: ( ruleand_workload )
                    {
                    // InternalXCanopus.g:525:2: ( ruleand_workload )
                    // InternalXCanopus.g:526:3: ruleand_workload
                    {
                     before(grammarAccess.getSTEPSAccess().getAnd_workloadParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleand_workload();

                    state._fsp--;

                     after(grammarAccess.getSTEPSAccess().getAnd_workloadParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:531:2: ( ruleand_atleast )
                    {
                    // InternalXCanopus.g:531:2: ( ruleand_atleast )
                    // InternalXCanopus.g:532:3: ruleand_atleast
                    {
                     before(grammarAccess.getSTEPSAccess().getAnd_atleastParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleand_atleast();

                    state._fsp--;

                     after(grammarAccess.getSTEPSAccess().getAnd_atleastParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXCanopus.g:537:2: ( ruleand_the_scenario )
                    {
                    // InternalXCanopus.g:537:2: ( ruleand_the_scenario )
                    // InternalXCanopus.g:538:3: ruleand_the_scenario
                    {
                     before(grammarAccess.getSTEPSAccess().getAnd_the_scenarioParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleand_the_scenario();

                    state._fsp--;

                     after(grammarAccess.getSTEPSAccess().getAnd_the_scenarioParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXCanopus.g:543:2: ( ruleand_the_metric )
                    {
                    // InternalXCanopus.g:543:2: ( ruleand_the_metric )
                    // InternalXCanopus.g:544:3: ruleand_the_metric
                    {
                     before(grammarAccess.getSTEPSAccess().getAnd_the_metricParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleand_the_metric();

                    state._fsp--;

                     after(grammarAccess.getSTEPSAccess().getAnd_the_metricParserRuleCall_6()); 

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
    // $ANTLR end "rule__STEPS__Alternatives"


    // $ANTLR start "rule__And_atleast__Alternatives_3"
    // InternalXCanopus.g:553:1: rule__And_atleast__Alternatives_3 : ( ( RULE_MBWHEN_GREATEROREQUAL_TEXT ) | ( RULE_MBWHEN_LESSTHAN_TEXT ) | ( RULE_MBWHEN_MORETHAN_TEXT ) | ( RULE_MBWHEN_MINOROREQUAL_TEXT ) );
    public final void rule__And_atleast__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:557:1: ( ( RULE_MBWHEN_GREATEROREQUAL_TEXT ) | ( RULE_MBWHEN_LESSTHAN_TEXT ) | ( RULE_MBWHEN_MORETHAN_TEXT ) | ( RULE_MBWHEN_MINOROREQUAL_TEXT ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_MBWHEN_GREATEROREQUAL_TEXT:
                {
                alt5=1;
                }
                break;
            case RULE_MBWHEN_LESSTHAN_TEXT:
                {
                alt5=2;
                }
                break;
            case RULE_MBWHEN_MORETHAN_TEXT:
                {
                alt5=3;
                }
                break;
            case RULE_MBWHEN_MINOROREQUAL_TEXT:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXCanopus.g:558:2: ( RULE_MBWHEN_GREATEROREQUAL_TEXT )
                    {
                    // InternalXCanopus.g:558:2: ( RULE_MBWHEN_GREATEROREQUAL_TEXT )
                    // InternalXCanopus.g:559:3: RULE_MBWHEN_GREATEROREQUAL_TEXT
                    {
                     before(grammarAccess.getAnd_atleastAccess().getMBWHEN_GREATEROREQUAL_TEXTTerminalRuleCall_3_0()); 
                    match(input,RULE_MBWHEN_GREATEROREQUAL_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_atleastAccess().getMBWHEN_GREATEROREQUAL_TEXTTerminalRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:564:2: ( RULE_MBWHEN_LESSTHAN_TEXT )
                    {
                    // InternalXCanopus.g:564:2: ( RULE_MBWHEN_LESSTHAN_TEXT )
                    // InternalXCanopus.g:565:3: RULE_MBWHEN_LESSTHAN_TEXT
                    {
                     before(grammarAccess.getAnd_atleastAccess().getMBWHEN_LESSTHAN_TEXTTerminalRuleCall_3_1()); 
                    match(input,RULE_MBWHEN_LESSTHAN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_atleastAccess().getMBWHEN_LESSTHAN_TEXTTerminalRuleCall_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:570:2: ( RULE_MBWHEN_MORETHAN_TEXT )
                    {
                    // InternalXCanopus.g:570:2: ( RULE_MBWHEN_MORETHAN_TEXT )
                    // InternalXCanopus.g:571:3: RULE_MBWHEN_MORETHAN_TEXT
                    {
                     before(grammarAccess.getAnd_atleastAccess().getMBWHEN_MORETHAN_TEXTTerminalRuleCall_3_2()); 
                    match(input,RULE_MBWHEN_MORETHAN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_atleastAccess().getMBWHEN_MORETHAN_TEXTTerminalRuleCall_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:576:2: ( RULE_MBWHEN_MINOROREQUAL_TEXT )
                    {
                    // InternalXCanopus.g:576:2: ( RULE_MBWHEN_MINOROREQUAL_TEXT )
                    // InternalXCanopus.g:577:3: RULE_MBWHEN_MINOROREQUAL_TEXT
                    {
                     before(grammarAccess.getAnd_atleastAccess().getMBWHEN_MINOROREQUAL_TEXTTerminalRuleCall_3_3()); 
                    match(input,RULE_MBWHEN_MINOROREQUAL_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_atleastAccess().getMBWHEN_MINOROREQUAL_TEXTTerminalRuleCall_3_3()); 

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
    // $ANTLR end "rule__And_atleast__Alternatives_3"


    // $ANTLR start "rule__And_the_metric__Alternatives_3"
    // InternalXCanopus.g:586:1: rule__And_the_metric__Alternatives_3 : ( ( RULE_SHOULDBELESSTHAN_TEXT ) | ( RULE_SHOULDBEATLEAST_TEXT ) | ( RULE_SHOULDBEGREATERTHAN ) );
    public final void rule__And_the_metric__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:590:1: ( ( RULE_SHOULDBELESSTHAN_TEXT ) | ( RULE_SHOULDBEATLEAST_TEXT ) | ( RULE_SHOULDBEGREATERTHAN ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_SHOULDBELESSTHAN_TEXT:
                {
                alt6=1;
                }
                break;
            case RULE_SHOULDBEATLEAST_TEXT:
                {
                alt6=2;
                }
                break;
            case RULE_SHOULDBEGREATERTHAN:
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
                    // InternalXCanopus.g:591:2: ( RULE_SHOULDBELESSTHAN_TEXT )
                    {
                    // InternalXCanopus.g:591:2: ( RULE_SHOULDBELESSTHAN_TEXT )
                    // InternalXCanopus.g:592:3: RULE_SHOULDBELESSTHAN_TEXT
                    {
                     before(grammarAccess.getAnd_the_metricAccess().getSHOULDBELESSTHAN_TEXTTerminalRuleCall_3_0()); 
                    match(input,RULE_SHOULDBELESSTHAN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_the_metricAccess().getSHOULDBELESSTHAN_TEXTTerminalRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:597:2: ( RULE_SHOULDBEATLEAST_TEXT )
                    {
                    // InternalXCanopus.g:597:2: ( RULE_SHOULDBEATLEAST_TEXT )
                    // InternalXCanopus.g:598:3: RULE_SHOULDBEATLEAST_TEXT
                    {
                     before(grammarAccess.getAnd_the_metricAccess().getSHOULDBEATLEAST_TEXTTerminalRuleCall_3_1()); 
                    match(input,RULE_SHOULDBEATLEAST_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_the_metricAccess().getSHOULDBEATLEAST_TEXTTerminalRuleCall_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:603:2: ( RULE_SHOULDBEGREATERTHAN )
                    {
                    // InternalXCanopus.g:603:2: ( RULE_SHOULDBEGREATERTHAN )
                    // InternalXCanopus.g:604:3: RULE_SHOULDBEGREATERTHAN
                    {
                     before(grammarAccess.getAnd_the_metricAccess().getSHOULDBEGREATERTHANTerminalRuleCall_3_2()); 
                    match(input,RULE_SHOULDBEGREATERTHAN,FOLLOW_2); 
                     after(grammarAccess.getAnd_the_metricAccess().getSHOULDBEGREATERTHANTerminalRuleCall_3_2()); 

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
    // $ANTLR end "rule__And_the_metric__Alternatives_3"


    // $ANTLR start "rule__And_the_metric__Alternatives_5"
    // InternalXCanopus.g:613:1: rule__And_the_metric__Alternatives_5 : ( ( RULE_WHENTHENUMBERISLESSTHAN_TEXT ) | ( RULE_WHENTHENUMBERISGREATERTHAN_TEXT ) | ( RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT ) | ( RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT ) | ( RULE_WHENTHENUMBERAREBETWEEN_TEXT ) );
    public final void rule__And_the_metric__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:617:1: ( ( RULE_WHENTHENUMBERISLESSTHAN_TEXT ) | ( RULE_WHENTHENUMBERISGREATERTHAN_TEXT ) | ( RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT ) | ( RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT ) | ( RULE_WHENTHENUMBERAREBETWEEN_TEXT ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_WHENTHENUMBERISLESSTHAN_TEXT:
                {
                alt7=1;
                }
                break;
            case RULE_WHENTHENUMBERISGREATERTHAN_TEXT:
                {
                alt7=2;
                }
                break;
            case RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT:
                {
                alt7=3;
                }
                break;
            case RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT:
                {
                alt7=4;
                }
                break;
            case RULE_WHENTHENUMBERAREBETWEEN_TEXT:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXCanopus.g:618:2: ( RULE_WHENTHENUMBERISLESSTHAN_TEXT )
                    {
                    // InternalXCanopus.g:618:2: ( RULE_WHENTHENUMBERISLESSTHAN_TEXT )
                    // InternalXCanopus.g:619:3: RULE_WHENTHENUMBERISLESSTHAN_TEXT
                    {
                     before(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERISLESSTHAN_TEXTTerminalRuleCall_5_0()); 
                    match(input,RULE_WHENTHENUMBERISLESSTHAN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERISLESSTHAN_TEXTTerminalRuleCall_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:624:2: ( RULE_WHENTHENUMBERISGREATERTHAN_TEXT )
                    {
                    // InternalXCanopus.g:624:2: ( RULE_WHENTHENUMBERISGREATERTHAN_TEXT )
                    // InternalXCanopus.g:625:3: RULE_WHENTHENUMBERISGREATERTHAN_TEXT
                    {
                     before(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERISGREATERTHAN_TEXTTerminalRuleCall_5_1()); 
                    match(input,RULE_WHENTHENUMBERISGREATERTHAN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERISGREATERTHAN_TEXTTerminalRuleCall_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:630:2: ( RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT )
                    {
                    // InternalXCanopus.g:630:2: ( RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT )
                    // InternalXCanopus.g:631:3: RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT
                    {
                     before(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERISGREATEROREQUAL_TEXTTerminalRuleCall_5_2()); 
                    match(input,RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERISGREATEROREQUAL_TEXTTerminalRuleCall_5_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:636:2: ( RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT )
                    {
                    // InternalXCanopus.g:636:2: ( RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT )
                    // InternalXCanopus.g:637:3: RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT
                    {
                     before(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERIRLESSEROREQUAL_TEXTTerminalRuleCall_5_3()); 
                    match(input,RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERIRLESSEROREQUAL_TEXTTerminalRuleCall_5_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:642:2: ( RULE_WHENTHENUMBERAREBETWEEN_TEXT )
                    {
                    // InternalXCanopus.g:642:2: ( RULE_WHENTHENUMBERAREBETWEEN_TEXT )
                    // InternalXCanopus.g:643:3: RULE_WHENTHENUMBERAREBETWEEN_TEXT
                    {
                     before(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERAREBETWEEN_TEXTTerminalRuleCall_5_4()); 
                    match(input,RULE_WHENTHENUMBERAREBETWEEN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getAnd_the_metricAccess().getWHENTHENUMBERAREBETWEEN_TEXTTerminalRuleCall_5_4()); 

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
    // $ANTLR end "rule__And_the_metric__Alternatives_5"


    // $ANTLR start "rule__Then__Alternatives_3"
    // InternalXCanopus.g:652:1: rule__Then__Alternatives_3 : ( ( RULE_SHOULDBELESSTHAN_TEXT ) | ( RULE_SHOULDBEATLEAST_TEXT ) | ( RULE_SHOULDBEGREATERTHAN ) );
    public final void rule__Then__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:656:1: ( ( RULE_SHOULDBELESSTHAN_TEXT ) | ( RULE_SHOULDBEATLEAST_TEXT ) | ( RULE_SHOULDBEGREATERTHAN ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_SHOULDBELESSTHAN_TEXT:
                {
                alt8=1;
                }
                break;
            case RULE_SHOULDBEATLEAST_TEXT:
                {
                alt8=2;
                }
                break;
            case RULE_SHOULDBEGREATERTHAN:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXCanopus.g:657:2: ( RULE_SHOULDBELESSTHAN_TEXT )
                    {
                    // InternalXCanopus.g:657:2: ( RULE_SHOULDBELESSTHAN_TEXT )
                    // InternalXCanopus.g:658:3: RULE_SHOULDBELESSTHAN_TEXT
                    {
                     before(grammarAccess.getThenAccess().getSHOULDBELESSTHAN_TEXTTerminalRuleCall_3_0()); 
                    match(input,RULE_SHOULDBELESSTHAN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getSHOULDBELESSTHAN_TEXTTerminalRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:663:2: ( RULE_SHOULDBEATLEAST_TEXT )
                    {
                    // InternalXCanopus.g:663:2: ( RULE_SHOULDBEATLEAST_TEXT )
                    // InternalXCanopus.g:664:3: RULE_SHOULDBEATLEAST_TEXT
                    {
                     before(grammarAccess.getThenAccess().getSHOULDBEATLEAST_TEXTTerminalRuleCall_3_1()); 
                    match(input,RULE_SHOULDBEATLEAST_TEXT,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getSHOULDBEATLEAST_TEXTTerminalRuleCall_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:669:2: ( RULE_SHOULDBEGREATERTHAN )
                    {
                    // InternalXCanopus.g:669:2: ( RULE_SHOULDBEGREATERTHAN )
                    // InternalXCanopus.g:670:3: RULE_SHOULDBEGREATERTHAN
                    {
                     before(grammarAccess.getThenAccess().getSHOULDBEGREATERTHANTerminalRuleCall_3_2()); 
                    match(input,RULE_SHOULDBEGREATERTHAN,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getSHOULDBEGREATERTHANTerminalRuleCall_3_2()); 

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
    // $ANTLR end "rule__Then__Alternatives_3"


    // $ANTLR start "rule__Then__Alternatives_5"
    // InternalXCanopus.g:679:1: rule__Then__Alternatives_5 : ( ( RULE_WHENTHENUMBERISLESSTHAN_TEXT ) | ( RULE_WHENTHENUMBERISGREATERTHAN_TEXT ) | ( RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT ) | ( RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT ) | ( RULE_WHENTHENUMBERAREBETWEEN_TEXT ) );
    public final void rule__Then__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:683:1: ( ( RULE_WHENTHENUMBERISLESSTHAN_TEXT ) | ( RULE_WHENTHENUMBERISGREATERTHAN_TEXT ) | ( RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT ) | ( RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT ) | ( RULE_WHENTHENUMBERAREBETWEEN_TEXT ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_WHENTHENUMBERISLESSTHAN_TEXT:
                {
                alt9=1;
                }
                break;
            case RULE_WHENTHENUMBERISGREATERTHAN_TEXT:
                {
                alt9=2;
                }
                break;
            case RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT:
                {
                alt9=3;
                }
                break;
            case RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT:
                {
                alt9=4;
                }
                break;
            case RULE_WHENTHENUMBERAREBETWEEN_TEXT:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXCanopus.g:684:2: ( RULE_WHENTHENUMBERISLESSTHAN_TEXT )
                    {
                    // InternalXCanopus.g:684:2: ( RULE_WHENTHENUMBERISLESSTHAN_TEXT )
                    // InternalXCanopus.g:685:3: RULE_WHENTHENUMBERISLESSTHAN_TEXT
                    {
                     before(grammarAccess.getThenAccess().getWHENTHENUMBERISLESSTHAN_TEXTTerminalRuleCall_5_0()); 
                    match(input,RULE_WHENTHENUMBERISLESSTHAN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getWHENTHENUMBERISLESSTHAN_TEXTTerminalRuleCall_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:690:2: ( RULE_WHENTHENUMBERISGREATERTHAN_TEXT )
                    {
                    // InternalXCanopus.g:690:2: ( RULE_WHENTHENUMBERISGREATERTHAN_TEXT )
                    // InternalXCanopus.g:691:3: RULE_WHENTHENUMBERISGREATERTHAN_TEXT
                    {
                     before(grammarAccess.getThenAccess().getWHENTHENUMBERISGREATERTHAN_TEXTTerminalRuleCall_5_1()); 
                    match(input,RULE_WHENTHENUMBERISGREATERTHAN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getWHENTHENUMBERISGREATERTHAN_TEXTTerminalRuleCall_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:696:2: ( RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT )
                    {
                    // InternalXCanopus.g:696:2: ( RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT )
                    // InternalXCanopus.g:697:3: RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT
                    {
                     before(grammarAccess.getThenAccess().getWHENTHENUMBERISGREATEROREQUAL_TEXTTerminalRuleCall_5_2()); 
                    match(input,RULE_WHENTHENUMBERISGREATEROREQUAL_TEXT,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getWHENTHENUMBERISGREATEROREQUAL_TEXTTerminalRuleCall_5_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:702:2: ( RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT )
                    {
                    // InternalXCanopus.g:702:2: ( RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT )
                    // InternalXCanopus.g:703:3: RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT
                    {
                     before(grammarAccess.getThenAccess().getWHENTHENUMBERIRLESSEROREQUAL_TEXTTerminalRuleCall_5_3()); 
                    match(input,RULE_WHENTHENUMBERIRLESSEROREQUAL_TEXT,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getWHENTHENUMBERIRLESSEROREQUAL_TEXTTerminalRuleCall_5_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:708:2: ( RULE_WHENTHENUMBERAREBETWEEN_TEXT )
                    {
                    // InternalXCanopus.g:708:2: ( RULE_WHENTHENUMBERAREBETWEEN_TEXT )
                    // InternalXCanopus.g:709:3: RULE_WHENTHENUMBERAREBETWEEN_TEXT
                    {
                     before(grammarAccess.getThenAccess().getWHENTHENUMBERAREBETWEEN_TEXTTerminalRuleCall_5_4()); 
                    match(input,RULE_WHENTHENUMBERAREBETWEEN_TEXT,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getWHENTHENUMBERAREBETWEEN_TEXTTerminalRuleCall_5_4()); 

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
    // $ANTLR end "rule__Then__Alternatives_5"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalXCanopus.g:718:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:722:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXCanopus.g:723:2: ( RULE_STRING )
                    {
                    // InternalXCanopus.g:723:2: ( RULE_STRING )
                    // InternalXCanopus.g:724:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:729:2: ( RULE_ID )
                    {
                    // InternalXCanopus.g:729:2: ( RULE_ID )
                    // InternalXCanopus.g:730:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__METRICTYPEMONITORED__Alternatives"
    // InternalXCanopus.g:739:1: rule__METRICTYPEMONITORED__Alternatives : ( ( ( 'memory' ) ) | ( ( 'disk' ) ) | ( ( 'web resources' ) ) | ( ( 'transaction' ) ) | ( ( 'processor' ) ) );
    public final void rule__METRICTYPEMONITORED__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:743:1: ( ( ( 'memory' ) ) | ( ( 'disk' ) ) | ( ( 'web resources' ) ) | ( ( 'transaction' ) ) | ( ( 'processor' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt11=1;
                }
                break;
            case 37:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            case 40:
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
                    // InternalXCanopus.g:744:2: ( ( 'memory' ) )
                    {
                    // InternalXCanopus.g:744:2: ( ( 'memory' ) )
                    // InternalXCanopus.g:745:3: ( 'memory' )
                    {
                     before(grammarAccess.getMETRICTYPEMONITOREDAccess().getMEMORYEnumLiteralDeclaration_0()); 
                    // InternalXCanopus.g:746:3: ( 'memory' )
                    // InternalXCanopus.g:746:4: 'memory'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEMONITOREDAccess().getMEMORYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:750:2: ( ( 'disk' ) )
                    {
                    // InternalXCanopus.g:750:2: ( ( 'disk' ) )
                    // InternalXCanopus.g:751:3: ( 'disk' )
                    {
                     before(grammarAccess.getMETRICTYPEMONITOREDAccess().getDISKEnumLiteralDeclaration_1()); 
                    // InternalXCanopus.g:752:3: ( 'disk' )
                    // InternalXCanopus.g:752:4: 'disk'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEMONITOREDAccess().getDISKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:756:2: ( ( 'web resources' ) )
                    {
                    // InternalXCanopus.g:756:2: ( ( 'web resources' ) )
                    // InternalXCanopus.g:757:3: ( 'web resources' )
                    {
                     before(grammarAccess.getMETRICTYPEMONITOREDAccess().getWEBRESOURCESEnumLiteralDeclaration_2()); 
                    // InternalXCanopus.g:758:3: ( 'web resources' )
                    // InternalXCanopus.g:758:4: 'web resources'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEMONITOREDAccess().getWEBRESOURCESEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:762:2: ( ( 'transaction' ) )
                    {
                    // InternalXCanopus.g:762:2: ( ( 'transaction' ) )
                    // InternalXCanopus.g:763:3: ( 'transaction' )
                    {
                     before(grammarAccess.getMETRICTYPEMONITOREDAccess().getTRANSACTIONEnumLiteralDeclaration_3()); 
                    // InternalXCanopus.g:764:3: ( 'transaction' )
                    // InternalXCanopus.g:764:4: 'transaction'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEMONITOREDAccess().getTRANSACTIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:768:2: ( ( 'processor' ) )
                    {
                    // InternalXCanopus.g:768:2: ( ( 'processor' ) )
                    // InternalXCanopus.g:769:3: ( 'processor' )
                    {
                     before(grammarAccess.getMETRICTYPEMONITOREDAccess().getPROCESSOREnumLiteralDeclaration_4()); 
                    // InternalXCanopus.g:770:3: ( 'processor' )
                    // InternalXCanopus.g:770:4: 'processor'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEMONITOREDAccess().getPROCESSOREnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__METRICTYPEMONITORED__Alternatives"


    // $ANTLR start "rule__METRICTYPE__Alternatives"
    // InternalXCanopus.g:778:1: rule__METRICTYPE__Alternatives : ( ( ( 'available mbytes counter' ) ) | ( ( '% idle time counter' ) ) | ( ( 'throughput mbytes' ) ) | ( ( 'transactions per second' ) ) | ( ( 'TPS' ) ) | ( ( '% processor time count' ) ) | ( ( 'transactions response time' ) ) );
    public final void rule__METRICTYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:782:1: ( ( ( 'available mbytes counter' ) ) | ( ( '% idle time counter' ) ) | ( ( 'throughput mbytes' ) ) | ( ( 'transactions per second' ) ) | ( ( 'TPS' ) ) | ( ( '% processor time count' ) ) | ( ( 'transactions response time' ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt12=1;
                }
                break;
            case 42:
                {
                alt12=2;
                }
                break;
            case 43:
                {
                alt12=3;
                }
                break;
            case 44:
                {
                alt12=4;
                }
                break;
            case 45:
                {
                alt12=5;
                }
                break;
            case 46:
                {
                alt12=6;
                }
                break;
            case 47:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalXCanopus.g:783:2: ( ( 'available mbytes counter' ) )
                    {
                    // InternalXCanopus.g:783:2: ( ( 'available mbytes counter' ) )
                    // InternalXCanopus.g:784:3: ( 'available mbytes counter' )
                    {
                     before(grammarAccess.getMETRICTYPEAccess().getAvailablembytescounterEnumLiteralDeclaration_0()); 
                    // InternalXCanopus.g:785:3: ( 'available mbytes counter' )
                    // InternalXCanopus.g:785:4: 'available mbytes counter'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEAccess().getAvailablembytescounterEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:789:2: ( ( '% idle time counter' ) )
                    {
                    // InternalXCanopus.g:789:2: ( ( '% idle time counter' ) )
                    // InternalXCanopus.g:790:3: ( '% idle time counter' )
                    {
                     before(grammarAccess.getMETRICTYPEAccess().getIdletimecounterEnumLiteralDeclaration_1()); 
                    // InternalXCanopus.g:791:3: ( '% idle time counter' )
                    // InternalXCanopus.g:791:4: '% idle time counter'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEAccess().getIdletimecounterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:795:2: ( ( 'throughput mbytes' ) )
                    {
                    // InternalXCanopus.g:795:2: ( ( 'throughput mbytes' ) )
                    // InternalXCanopus.g:796:3: ( 'throughput mbytes' )
                    {
                     before(grammarAccess.getMETRICTYPEAccess().getThroughputmbytesEnumLiteralDeclaration_2()); 
                    // InternalXCanopus.g:797:3: ( 'throughput mbytes' )
                    // InternalXCanopus.g:797:4: 'throughput mbytes'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEAccess().getThroughputmbytesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:801:2: ( ( 'transactions per second' ) )
                    {
                    // InternalXCanopus.g:801:2: ( ( 'transactions per second' ) )
                    // InternalXCanopus.g:802:3: ( 'transactions per second' )
                    {
                     before(grammarAccess.getMETRICTYPEAccess().getTransactionpersecondEnumLiteralDeclaration_3()); 
                    // InternalXCanopus.g:803:3: ( 'transactions per second' )
                    // InternalXCanopus.g:803:4: 'transactions per second'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEAccess().getTransactionpersecondEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXCanopus.g:807:2: ( ( 'TPS' ) )
                    {
                    // InternalXCanopus.g:807:2: ( ( 'TPS' ) )
                    // InternalXCanopus.g:808:3: ( 'TPS' )
                    {
                     before(grammarAccess.getMETRICTYPEAccess().getTPSEnumLiteralDeclaration_4()); 
                    // InternalXCanopus.g:809:3: ( 'TPS' )
                    // InternalXCanopus.g:809:4: 'TPS'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEAccess().getTPSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXCanopus.g:813:2: ( ( '% processor time count' ) )
                    {
                    // InternalXCanopus.g:813:2: ( ( '% processor time count' ) )
                    // InternalXCanopus.g:814:3: ( '% processor time count' )
                    {
                     before(grammarAccess.getMETRICTYPEAccess().getProcessortimecounterEnumLiteralDeclaration_5()); 
                    // InternalXCanopus.g:815:3: ( '% processor time count' )
                    // InternalXCanopus.g:815:4: '% processor time count'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEAccess().getProcessortimecounterEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXCanopus.g:819:2: ( ( 'transactions response time' ) )
                    {
                    // InternalXCanopus.g:819:2: ( ( 'transactions response time' ) )
                    // InternalXCanopus.g:820:3: ( 'transactions response time' )
                    {
                     before(grammarAccess.getMETRICTYPEAccess().getTransactionresponsetimeEnumLiteralDeclaration_6()); 
                    // InternalXCanopus.g:821:3: ( 'transactions response time' )
                    // InternalXCanopus.g:821:4: 'transactions response time'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getMETRICTYPEAccess().getTransactionresponsetimeEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__METRICTYPE__Alternatives"


    // $ANTLR start "rule__SUT_TYPE__Alternatives"
    // InternalXCanopus.g:829:1: rule__SUT_TYPE__Alternatives : ( ( ( 'DESKTOPAPP' ) ) | ( ( 'DATABASE' ) ) | ( ( 'WEBAPP' ) ) | ( ( 'WEBSERVICE' ) ) );
    public final void rule__SUT_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:833:1: ( ( ( 'DESKTOPAPP' ) ) | ( ( 'DATABASE' ) ) | ( ( 'WEBAPP' ) ) | ( ( 'WEBSERVICE' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt13=1;
                }
                break;
            case 49:
                {
                alt13=2;
                }
                break;
            case 50:
                {
                alt13=3;
                }
                break;
            case 51:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalXCanopus.g:834:2: ( ( 'DESKTOPAPP' ) )
                    {
                    // InternalXCanopus.g:834:2: ( ( 'DESKTOPAPP' ) )
                    // InternalXCanopus.g:835:3: ( 'DESKTOPAPP' )
                    {
                     before(grammarAccess.getSUT_TYPEAccess().getDESKTOPAPPEnumLiteralDeclaration_0()); 
                    // InternalXCanopus.g:836:3: ( 'DESKTOPAPP' )
                    // InternalXCanopus.g:836:4: 'DESKTOPAPP'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getSUT_TYPEAccess().getDESKTOPAPPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXCanopus.g:840:2: ( ( 'DATABASE' ) )
                    {
                    // InternalXCanopus.g:840:2: ( ( 'DATABASE' ) )
                    // InternalXCanopus.g:841:3: ( 'DATABASE' )
                    {
                     before(grammarAccess.getSUT_TYPEAccess().getDATABASEEnumLiteralDeclaration_1()); 
                    // InternalXCanopus.g:842:3: ( 'DATABASE' )
                    // InternalXCanopus.g:842:4: 'DATABASE'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getSUT_TYPEAccess().getDATABASEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXCanopus.g:846:2: ( ( 'WEBAPP' ) )
                    {
                    // InternalXCanopus.g:846:2: ( ( 'WEBAPP' ) )
                    // InternalXCanopus.g:847:3: ( 'WEBAPP' )
                    {
                     before(grammarAccess.getSUT_TYPEAccess().getWEBAPPEnumLiteralDeclaration_2()); 
                    // InternalXCanopus.g:848:3: ( 'WEBAPP' )
                    // InternalXCanopus.g:848:4: 'WEBAPP'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getSUT_TYPEAccess().getWEBAPPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXCanopus.g:852:2: ( ( 'WEBSERVICE' ) )
                    {
                    // InternalXCanopus.g:852:2: ( ( 'WEBSERVICE' ) )
                    // InternalXCanopus.g:853:3: ( 'WEBSERVICE' )
                    {
                     before(grammarAccess.getSUT_TYPEAccess().getWEBSERVICEEnumLiteralDeclaration_3()); 
                    // InternalXCanopus.g:854:3: ( 'WEBSERVICE' )
                    // InternalXCanopus.g:854:4: 'WEBSERVICE'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getSUT_TYPEAccess().getWEBSERVICEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__SUT_TYPE__Alternatives"


    // $ANTLR start "rule__MetricModel__Group__0"
    // InternalXCanopus.g:862:1: rule__MetricModel__Group__0 : rule__MetricModel__Group__0__Impl rule__MetricModel__Group__1 ;
    public final void rule__MetricModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:866:1: ( rule__MetricModel__Group__0__Impl rule__MetricModel__Group__1 )
            // InternalXCanopus.g:867:2: rule__MetricModel__Group__0__Impl rule__MetricModel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MetricModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__1();

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
    // $ANTLR end "rule__MetricModel__Group__0"


    // $ANTLR start "rule__MetricModel__Group__0__Impl"
    // InternalXCanopus.g:874:1: rule__MetricModel__Group__0__Impl : ( 'Feature:' ) ;
    public final void rule__MetricModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:878:1: ( ( 'Feature:' ) )
            // InternalXCanopus.g:879:1: ( 'Feature:' )
            {
            // InternalXCanopus.g:879:1: ( 'Feature:' )
            // InternalXCanopus.g:880:2: 'Feature:'
            {
             before(grammarAccess.getMetricModelAccess().getFeatureKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMetricModelAccess().getFeatureKeyword_0()); 

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
    // $ANTLR end "rule__MetricModel__Group__0__Impl"


    // $ANTLR start "rule__MetricModel__Group__1"
    // InternalXCanopus.g:889:1: rule__MetricModel__Group__1 : rule__MetricModel__Group__1__Impl rule__MetricModel__Group__2 ;
    public final void rule__MetricModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:893:1: ( rule__MetricModel__Group__1__Impl rule__MetricModel__Group__2 )
            // InternalXCanopus.g:894:2: rule__MetricModel__Group__1__Impl rule__MetricModel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MetricModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__2();

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
    // $ANTLR end "rule__MetricModel__Group__1"


    // $ANTLR start "rule__MetricModel__Group__1__Impl"
    // InternalXCanopus.g:901:1: rule__MetricModel__Group__1__Impl : ( ruleFreetext ) ;
    public final void rule__MetricModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:905:1: ( ( ruleFreetext ) )
            // InternalXCanopus.g:906:1: ( ruleFreetext )
            {
            // InternalXCanopus.g:906:1: ( ruleFreetext )
            // InternalXCanopus.g:907:2: ruleFreetext
            {
             before(grammarAccess.getMetricModelAccess().getFreetextParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleFreetext();

            state._fsp--;

             after(grammarAccess.getMetricModelAccess().getFreetextParserRuleCall_1()); 

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
    // $ANTLR end "rule__MetricModel__Group__1__Impl"


    // $ANTLR start "rule__MetricModel__Group__2"
    // InternalXCanopus.g:916:1: rule__MetricModel__Group__2 : rule__MetricModel__Group__2__Impl rule__MetricModel__Group__3 ;
    public final void rule__MetricModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:920:1: ( rule__MetricModel__Group__2__Impl rule__MetricModel__Group__3 )
            // InternalXCanopus.g:921:2: rule__MetricModel__Group__2__Impl rule__MetricModel__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MetricModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__3();

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
    // $ANTLR end "rule__MetricModel__Group__2"


    // $ANTLR start "rule__MetricModel__Group__2__Impl"
    // InternalXCanopus.g:928:1: rule__MetricModel__Group__2__Impl : ( '.' ) ;
    public final void rule__MetricModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:932:1: ( ( '.' ) )
            // InternalXCanopus.g:933:1: ( '.' )
            {
            // InternalXCanopus.g:933:1: ( '.' )
            // InternalXCanopus.g:934:2: '.'
            {
             before(grammarAccess.getMetricModelAccess().getFullStopKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMetricModelAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__MetricModel__Group__2__Impl"


    // $ANTLR start "rule__MetricModel__Group__3"
    // InternalXCanopus.g:943:1: rule__MetricModel__Group__3 : rule__MetricModel__Group__3__Impl rule__MetricModel__Group__4 ;
    public final void rule__MetricModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:947:1: ( rule__MetricModel__Group__3__Impl rule__MetricModel__Group__4 )
            // InternalXCanopus.g:948:2: rule__MetricModel__Group__3__Impl rule__MetricModel__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__MetricModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__4();

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
    // $ANTLR end "rule__MetricModel__Group__3"


    // $ANTLR start "rule__MetricModel__Group__3__Impl"
    // InternalXCanopus.g:955:1: rule__MetricModel__Group__3__Impl : ( 'Monitoring:' ) ;
    public final void rule__MetricModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:959:1: ( ( 'Monitoring:' ) )
            // InternalXCanopus.g:960:1: ( 'Monitoring:' )
            {
            // InternalXCanopus.g:960:1: ( 'Monitoring:' )
            // InternalXCanopus.g:961:2: 'Monitoring:'
            {
             before(grammarAccess.getMetricModelAccess().getMonitoringKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMetricModelAccess().getMonitoringKeyword_3()); 

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
    // $ANTLR end "rule__MetricModel__Group__3__Impl"


    // $ANTLR start "rule__MetricModel__Group__4"
    // InternalXCanopus.g:970:1: rule__MetricModel__Group__4 : rule__MetricModel__Group__4__Impl rule__MetricModel__Group__5 ;
    public final void rule__MetricModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:974:1: ( rule__MetricModel__Group__4__Impl rule__MetricModel__Group__5 )
            // InternalXCanopus.g:975:2: rule__MetricModel__Group__4__Impl rule__MetricModel__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MetricModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__5();

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
    // $ANTLR end "rule__MetricModel__Group__4"


    // $ANTLR start "rule__MetricModel__Group__4__Impl"
    // InternalXCanopus.g:982:1: rule__MetricModel__Group__4__Impl : ( ( rule__MetricModel__NameAssignment_4 ) ) ;
    public final void rule__MetricModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:986:1: ( ( ( rule__MetricModel__NameAssignment_4 ) ) )
            // InternalXCanopus.g:987:1: ( ( rule__MetricModel__NameAssignment_4 ) )
            {
            // InternalXCanopus.g:987:1: ( ( rule__MetricModel__NameAssignment_4 ) )
            // InternalXCanopus.g:988:2: ( rule__MetricModel__NameAssignment_4 )
            {
             before(grammarAccess.getMetricModelAccess().getNameAssignment_4()); 
            // InternalXCanopus.g:989:2: ( rule__MetricModel__NameAssignment_4 )
            // InternalXCanopus.g:989:3: rule__MetricModel__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MetricModel__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMetricModelAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__MetricModel__Group__4__Impl"


    // $ANTLR start "rule__MetricModel__Group__5"
    // InternalXCanopus.g:997:1: rule__MetricModel__Group__5 : rule__MetricModel__Group__5__Impl rule__MetricModel__Group__6 ;
    public final void rule__MetricModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1001:1: ( rule__MetricModel__Group__5__Impl rule__MetricModel__Group__6 )
            // InternalXCanopus.g:1002:2: rule__MetricModel__Group__5__Impl rule__MetricModel__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__MetricModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__6();

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
    // $ANTLR end "rule__MetricModel__Group__5"


    // $ANTLR start "rule__MetricModel__Group__5__Impl"
    // InternalXCanopus.g:1009:1: rule__MetricModel__Group__5__Impl : ( 'description' ) ;
    public final void rule__MetricModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1013:1: ( ( 'description' ) )
            // InternalXCanopus.g:1014:1: ( 'description' )
            {
            // InternalXCanopus.g:1014:1: ( 'description' )
            // InternalXCanopus.g:1015:2: 'description'
            {
             before(grammarAccess.getMetricModelAccess().getDescriptionKeyword_5()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMetricModelAccess().getDescriptionKeyword_5()); 

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
    // $ANTLR end "rule__MetricModel__Group__5__Impl"


    // $ANTLR start "rule__MetricModel__Group__6"
    // InternalXCanopus.g:1024:1: rule__MetricModel__Group__6 : rule__MetricModel__Group__6__Impl rule__MetricModel__Group__7 ;
    public final void rule__MetricModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1028:1: ( rule__MetricModel__Group__6__Impl rule__MetricModel__Group__7 )
            // InternalXCanopus.g:1029:2: rule__MetricModel__Group__6__Impl rule__MetricModel__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__MetricModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__7();

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
    // $ANTLR end "rule__MetricModel__Group__6"


    // $ANTLR start "rule__MetricModel__Group__6__Impl"
    // InternalXCanopus.g:1036:1: rule__MetricModel__Group__6__Impl : ( ruleFreetext ) ;
    public final void rule__MetricModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1040:1: ( ( ruleFreetext ) )
            // InternalXCanopus.g:1041:1: ( ruleFreetext )
            {
            // InternalXCanopus.g:1041:1: ( ruleFreetext )
            // InternalXCanopus.g:1042:2: ruleFreetext
            {
             before(grammarAccess.getMetricModelAccess().getFreetextParserRuleCall_6()); 
            pushFollow(FOLLOW_2);
            ruleFreetext();

            state._fsp--;

             after(grammarAccess.getMetricModelAccess().getFreetextParserRuleCall_6()); 

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
    // $ANTLR end "rule__MetricModel__Group__6__Impl"


    // $ANTLR start "rule__MetricModel__Group__7"
    // InternalXCanopus.g:1051:1: rule__MetricModel__Group__7 : rule__MetricModel__Group__7__Impl rule__MetricModel__Group__8 ;
    public final void rule__MetricModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1055:1: ( rule__MetricModel__Group__7__Impl rule__MetricModel__Group__8 )
            // InternalXCanopus.g:1056:2: rule__MetricModel__Group__7__Impl rule__MetricModel__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__MetricModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__8();

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
    // $ANTLR end "rule__MetricModel__Group__7"


    // $ANTLR start "rule__MetricModel__Group__7__Impl"
    // InternalXCanopus.g:1063:1: rule__MetricModel__Group__7__Impl : ( '.' ) ;
    public final void rule__MetricModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1067:1: ( ( '.' ) )
            // InternalXCanopus.g:1068:1: ( '.' )
            {
            // InternalXCanopus.g:1068:1: ( '.' )
            // InternalXCanopus.g:1069:2: '.'
            {
             before(grammarAccess.getMetricModelAccess().getFullStopKeyword_7()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMetricModelAccess().getFullStopKeyword_7()); 

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
    // $ANTLR end "rule__MetricModel__Group__7__Impl"


    // $ANTLR start "rule__MetricModel__Group__8"
    // InternalXCanopus.g:1078:1: rule__MetricModel__Group__8 : rule__MetricModel__Group__8__Impl rule__MetricModel__Group__9 ;
    public final void rule__MetricModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1082:1: ( rule__MetricModel__Group__8__Impl rule__MetricModel__Group__9 )
            // InternalXCanopus.g:1083:2: rule__MetricModel__Group__8__Impl rule__MetricModel__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__MetricModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__9();

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
    // $ANTLR end "rule__MetricModel__Group__8"


    // $ANTLR start "rule__MetricModel__Group__8__Impl"
    // InternalXCanopus.g:1090:1: rule__MetricModel__Group__8__Impl : ( '{' ) ;
    public final void rule__MetricModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1094:1: ( ( '{' ) )
            // InternalXCanopus.g:1095:1: ( '{' )
            {
            // InternalXCanopus.g:1095:1: ( '{' )
            // InternalXCanopus.g:1096:2: '{'
            {
             before(grammarAccess.getMetricModelAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMetricModelAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__MetricModel__Group__8__Impl"


    // $ANTLR start "rule__MetricModel__Group__9"
    // InternalXCanopus.g:1105:1: rule__MetricModel__Group__9 : rule__MetricModel__Group__9__Impl rule__MetricModel__Group__10 ;
    public final void rule__MetricModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1109:1: ( rule__MetricModel__Group__9__Impl rule__MetricModel__Group__10 )
            // InternalXCanopus.g:1110:2: rule__MetricModel__Group__9__Impl rule__MetricModel__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__MetricModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__10();

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
    // $ANTLR end "rule__MetricModel__Group__9"


    // $ANTLR start "rule__MetricModel__Group__9__Impl"
    // InternalXCanopus.g:1117:1: rule__MetricModel__Group__9__Impl : ( ( ( rule__MetricModel__StepsAssignment_9 ) ) ( ( rule__MetricModel__StepsAssignment_9 )* ) ) ;
    public final void rule__MetricModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1121:1: ( ( ( ( rule__MetricModel__StepsAssignment_9 ) ) ( ( rule__MetricModel__StepsAssignment_9 )* ) ) )
            // InternalXCanopus.g:1122:1: ( ( ( rule__MetricModel__StepsAssignment_9 ) ) ( ( rule__MetricModel__StepsAssignment_9 )* ) )
            {
            // InternalXCanopus.g:1122:1: ( ( ( rule__MetricModel__StepsAssignment_9 ) ) ( ( rule__MetricModel__StepsAssignment_9 )* ) )
            // InternalXCanopus.g:1123:2: ( ( rule__MetricModel__StepsAssignment_9 ) ) ( ( rule__MetricModel__StepsAssignment_9 )* )
            {
            // InternalXCanopus.g:1123:2: ( ( rule__MetricModel__StepsAssignment_9 ) )
            // InternalXCanopus.g:1124:3: ( rule__MetricModel__StepsAssignment_9 )
            {
             before(grammarAccess.getMetricModelAccess().getStepsAssignment_9()); 
            // InternalXCanopus.g:1125:3: ( rule__MetricModel__StepsAssignment_9 )
            // InternalXCanopus.g:1125:4: rule__MetricModel__StepsAssignment_9
            {
            pushFollow(FOLLOW_13);
            rule__MetricModel__StepsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMetricModelAccess().getStepsAssignment_9()); 

            }

            // InternalXCanopus.g:1128:2: ( ( rule__MetricModel__StepsAssignment_9 )* )
            // InternalXCanopus.g:1129:3: ( rule__MetricModel__StepsAssignment_9 )*
            {
             before(grammarAccess.getMetricModelAccess().getStepsAssignment_9()); 
            // InternalXCanopus.g:1130:3: ( rule__MetricModel__StepsAssignment_9 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=58 && LA14_0<=61)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXCanopus.g:1130:4: rule__MetricModel__StepsAssignment_9
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MetricModel__StepsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMetricModelAccess().getStepsAssignment_9()); 

            }


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
    // $ANTLR end "rule__MetricModel__Group__9__Impl"


    // $ANTLR start "rule__MetricModel__Group__10"
    // InternalXCanopus.g:1139:1: rule__MetricModel__Group__10 : rule__MetricModel__Group__10__Impl ;
    public final void rule__MetricModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1143:1: ( rule__MetricModel__Group__10__Impl )
            // InternalXCanopus.g:1144:2: rule__MetricModel__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetricModel__Group__10__Impl();

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
    // $ANTLR end "rule__MetricModel__Group__10"


    // $ANTLR start "rule__MetricModel__Group__10__Impl"
    // InternalXCanopus.g:1150:1: rule__MetricModel__Group__10__Impl : ( '}' ) ;
    public final void rule__MetricModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1154:1: ( ( '}' ) )
            // InternalXCanopus.g:1155:1: ( '}' )
            {
            // InternalXCanopus.g:1155:1: ( '}' )
            // InternalXCanopus.g:1156:2: '}'
            {
             before(grammarAccess.getMetricModelAccess().getRightCurlyBracketKeyword_10()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMetricModelAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__MetricModel__Group__10__Impl"


    // $ANTLR start "rule__And_workload__Group__0"
    // InternalXCanopus.g:1166:1: rule__And_workload__Group__0 : rule__And_workload__Group__0__Impl rule__And_workload__Group__1 ;
    public final void rule__And_workload__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1170:1: ( rule__And_workload__Group__0__Impl rule__And_workload__Group__1 )
            // InternalXCanopus.g:1171:2: rule__And_workload__Group__0__Impl rule__And_workload__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__And_workload__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_workload__Group__1();

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
    // $ANTLR end "rule__And_workload__Group__0"


    // $ANTLR start "rule__And_workload__Group__0__Impl"
    // InternalXCanopus.g:1178:1: rule__And_workload__Group__0__Impl : ( 'And' ) ;
    public final void rule__And_workload__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1182:1: ( ( 'And' ) )
            // InternalXCanopus.g:1183:1: ( 'And' )
            {
            // InternalXCanopus.g:1183:1: ( 'And' )
            // InternalXCanopus.g:1184:2: 'And'
            {
             before(grammarAccess.getAnd_workloadAccess().getAndKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAnd_workloadAccess().getAndKeyword_0()); 

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
    // $ANTLR end "rule__And_workload__Group__0__Impl"


    // $ANTLR start "rule__And_workload__Group__1"
    // InternalXCanopus.g:1193:1: rule__And_workload__Group__1 : rule__And_workload__Group__1__Impl rule__And_workload__Group__2 ;
    public final void rule__And_workload__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1197:1: ( rule__And_workload__Group__1__Impl rule__And_workload__Group__2 )
            // InternalXCanopus.g:1198:2: rule__And_workload__Group__1__Impl rule__And_workload__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__And_workload__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_workload__Group__2();

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
    // $ANTLR end "rule__And_workload__Group__1"


    // $ANTLR start "rule__And_workload__Group__1__Impl"
    // InternalXCanopus.g:1205:1: rule__And_workload__Group__1__Impl : ( RULE_WORKLOADGENERATED ) ;
    public final void rule__And_workload__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1209:1: ( ( RULE_WORKLOADGENERATED ) )
            // InternalXCanopus.g:1210:1: ( RULE_WORKLOADGENERATED )
            {
            // InternalXCanopus.g:1210:1: ( RULE_WORKLOADGENERATED )
            // InternalXCanopus.g:1211:2: RULE_WORKLOADGENERATED
            {
             before(grammarAccess.getAnd_workloadAccess().getWORKLOADGENERATEDTerminalRuleCall_1()); 
            match(input,RULE_WORKLOADGENERATED,FOLLOW_2); 
             after(grammarAccess.getAnd_workloadAccess().getWORKLOADGENERATEDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__And_workload__Group__1__Impl"


    // $ANTLR start "rule__And_workload__Group__2"
    // InternalXCanopus.g:1220:1: rule__And_workload__Group__2 : rule__And_workload__Group__2__Impl rule__And_workload__Group__3 ;
    public final void rule__And_workload__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1224:1: ( rule__And_workload__Group__2__Impl rule__And_workload__Group__3 )
            // InternalXCanopus.g:1225:2: rule__And_workload__Group__2__Impl rule__And_workload__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__And_workload__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_workload__Group__3();

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
    // $ANTLR end "rule__And_workload__Group__2"


    // $ANTLR start "rule__And_workload__Group__2__Impl"
    // InternalXCanopus.g:1232:1: rule__And_workload__Group__2__Impl : ( ( rule__And_workload__Sut1Assignment_2 ) ) ;
    public final void rule__And_workload__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1236:1: ( ( ( rule__And_workload__Sut1Assignment_2 ) ) )
            // InternalXCanopus.g:1237:1: ( ( rule__And_workload__Sut1Assignment_2 ) )
            {
            // InternalXCanopus.g:1237:1: ( ( rule__And_workload__Sut1Assignment_2 ) )
            // InternalXCanopus.g:1238:2: ( rule__And_workload__Sut1Assignment_2 )
            {
             before(grammarAccess.getAnd_workloadAccess().getSut1Assignment_2()); 
            // InternalXCanopus.g:1239:2: ( rule__And_workload__Sut1Assignment_2 )
            // InternalXCanopus.g:1239:3: rule__And_workload__Sut1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__And_workload__Sut1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnd_workloadAccess().getSut1Assignment_2()); 

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
    // $ANTLR end "rule__And_workload__Group__2__Impl"


    // $ANTLR start "rule__And_workload__Group__3"
    // InternalXCanopus.g:1247:1: rule__And_workload__Group__3 : rule__And_workload__Group__3__Impl rule__And_workload__Group__4 ;
    public final void rule__And_workload__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1251:1: ( rule__And_workload__Group__3__Impl rule__And_workload__Group__4 )
            // InternalXCanopus.g:1252:2: rule__And_workload__Group__3__Impl rule__And_workload__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__And_workload__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_workload__Group__4();

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
    // $ANTLR end "rule__And_workload__Group__3"


    // $ANTLR start "rule__And_workload__Group__3__Impl"
    // InternalXCanopus.g:1259:1: rule__And_workload__Group__3__Impl : ( RULE_LOADGENERATORFORTHE ) ;
    public final void rule__And_workload__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1263:1: ( ( RULE_LOADGENERATORFORTHE ) )
            // InternalXCanopus.g:1264:1: ( RULE_LOADGENERATORFORTHE )
            {
            // InternalXCanopus.g:1264:1: ( RULE_LOADGENERATORFORTHE )
            // InternalXCanopus.g:1265:2: RULE_LOADGENERATORFORTHE
            {
             before(grammarAccess.getAnd_workloadAccess().getLOADGENERATORFORTHETerminalRuleCall_3()); 
            match(input,RULE_LOADGENERATORFORTHE,FOLLOW_2); 
             after(grammarAccess.getAnd_workloadAccess().getLOADGENERATORFORTHETerminalRuleCall_3()); 

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
    // $ANTLR end "rule__And_workload__Group__3__Impl"


    // $ANTLR start "rule__And_workload__Group__4"
    // InternalXCanopus.g:1274:1: rule__And_workload__Group__4 : rule__And_workload__Group__4__Impl rule__And_workload__Group__5 ;
    public final void rule__And_workload__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1278:1: ( rule__And_workload__Group__4__Impl rule__And_workload__Group__5 )
            // InternalXCanopus.g:1279:2: rule__And_workload__Group__4__Impl rule__And_workload__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__And_workload__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_workload__Group__5();

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
    // $ANTLR end "rule__And_workload__Group__4"


    // $ANTLR start "rule__And_workload__Group__4__Impl"
    // InternalXCanopus.g:1286:1: rule__And_workload__Group__4__Impl : ( ( rule__And_workload__SuttypeAssignment_4 ) ) ;
    public final void rule__And_workload__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1290:1: ( ( ( rule__And_workload__SuttypeAssignment_4 ) ) )
            // InternalXCanopus.g:1291:1: ( ( rule__And_workload__SuttypeAssignment_4 ) )
            {
            // InternalXCanopus.g:1291:1: ( ( rule__And_workload__SuttypeAssignment_4 ) )
            // InternalXCanopus.g:1292:2: ( rule__And_workload__SuttypeAssignment_4 )
            {
             before(grammarAccess.getAnd_workloadAccess().getSuttypeAssignment_4()); 
            // InternalXCanopus.g:1293:2: ( rule__And_workload__SuttypeAssignment_4 )
            // InternalXCanopus.g:1293:3: rule__And_workload__SuttypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__And_workload__SuttypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnd_workloadAccess().getSuttypeAssignment_4()); 

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
    // $ANTLR end "rule__And_workload__Group__4__Impl"


    // $ANTLR start "rule__And_workload__Group__5"
    // InternalXCanopus.g:1301:1: rule__And_workload__Group__5 : rule__And_workload__Group__5__Impl rule__And_workload__Group__6 ;
    public final void rule__And_workload__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1305:1: ( rule__And_workload__Group__5__Impl rule__And_workload__Group__6 )
            // InternalXCanopus.g:1306:2: rule__And_workload__Group__5__Impl rule__And_workload__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__And_workload__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_workload__Group__6();

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
    // $ANTLR end "rule__And_workload__Group__5"


    // $ANTLR start "rule__And_workload__Group__5__Impl"
    // InternalXCanopus.g:1313:1: rule__And_workload__Group__5__Impl : ( RULE_ON ) ;
    public final void rule__And_workload__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1317:1: ( ( RULE_ON ) )
            // InternalXCanopus.g:1318:1: ( RULE_ON )
            {
            // InternalXCanopus.g:1318:1: ( RULE_ON )
            // InternalXCanopus.g:1319:2: RULE_ON
            {
             before(grammarAccess.getAnd_workloadAccess().getONTerminalRuleCall_5()); 
            match(input,RULE_ON,FOLLOW_2); 
             after(grammarAccess.getAnd_workloadAccess().getONTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__And_workload__Group__5__Impl"


    // $ANTLR start "rule__And_workload__Group__6"
    // InternalXCanopus.g:1328:1: rule__And_workload__Group__6 : rule__And_workload__Group__6__Impl ;
    public final void rule__And_workload__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1332:1: ( rule__And_workload__Group__6__Impl )
            // InternalXCanopus.g:1333:2: rule__And_workload__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And_workload__Group__6__Impl();

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
    // $ANTLR end "rule__And_workload__Group__6"


    // $ANTLR start "rule__And_workload__Group__6__Impl"
    // InternalXCanopus.g:1339:1: rule__And_workload__Group__6__Impl : ( ( rule__And_workload__Sut2Assignment_6 ) ) ;
    public final void rule__And_workload__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1343:1: ( ( ( rule__And_workload__Sut2Assignment_6 ) ) )
            // InternalXCanopus.g:1344:1: ( ( rule__And_workload__Sut2Assignment_6 ) )
            {
            // InternalXCanopus.g:1344:1: ( ( rule__And_workload__Sut2Assignment_6 ) )
            // InternalXCanopus.g:1345:2: ( rule__And_workload__Sut2Assignment_6 )
            {
             before(grammarAccess.getAnd_workloadAccess().getSut2Assignment_6()); 
            // InternalXCanopus.g:1346:2: ( rule__And_workload__Sut2Assignment_6 )
            // InternalXCanopus.g:1346:3: rule__And_workload__Sut2Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__And_workload__Sut2Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAnd_workloadAccess().getSut2Assignment_6()); 

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
    // $ANTLR end "rule__And_workload__Group__6__Impl"


    // $ANTLR start "rule__And_the_scenario__Group__0"
    // InternalXCanopus.g:1355:1: rule__And_the_scenario__Group__0 : rule__And_the_scenario__Group__0__Impl rule__And_the_scenario__Group__1 ;
    public final void rule__And_the_scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1359:1: ( rule__And_the_scenario__Group__0__Impl rule__And_the_scenario__Group__1 )
            // InternalXCanopus.g:1360:2: rule__And_the_scenario__Group__0__Impl rule__And_the_scenario__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__And_the_scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_scenario__Group__1();

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
    // $ANTLR end "rule__And_the_scenario__Group__0"


    // $ANTLR start "rule__And_the_scenario__Group__0__Impl"
    // InternalXCanopus.g:1367:1: rule__And_the_scenario__Group__0__Impl : ( 'And' ) ;
    public final void rule__And_the_scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1371:1: ( ( 'And' ) )
            // InternalXCanopus.g:1372:1: ( 'And' )
            {
            // InternalXCanopus.g:1372:1: ( 'And' )
            // InternalXCanopus.g:1373:2: 'And'
            {
             before(grammarAccess.getAnd_the_scenarioAccess().getAndKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAnd_the_scenarioAccess().getAndKeyword_0()); 

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
    // $ANTLR end "rule__And_the_scenario__Group__0__Impl"


    // $ANTLR start "rule__And_the_scenario__Group__1"
    // InternalXCanopus.g:1382:1: rule__And_the_scenario__Group__1 : rule__And_the_scenario__Group__1__Impl rule__And_the_scenario__Group__2 ;
    public final void rule__And_the_scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1386:1: ( rule__And_the_scenario__Group__1__Impl rule__And_the_scenario__Group__2 )
            // InternalXCanopus.g:1387:2: rule__And_the_scenario__Group__1__Impl rule__And_the_scenario__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__And_the_scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_scenario__Group__2();

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
    // $ANTLR end "rule__And_the_scenario__Group__1"


    // $ANTLR start "rule__And_the_scenario__Group__1__Impl"
    // InternalXCanopus.g:1394:1: rule__And_the_scenario__Group__1__Impl : ( RULE_THE ) ;
    public final void rule__And_the_scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1398:1: ( ( RULE_THE ) )
            // InternalXCanopus.g:1399:1: ( RULE_THE )
            {
            // InternalXCanopus.g:1399:1: ( RULE_THE )
            // InternalXCanopus.g:1400:2: RULE_THE
            {
             before(grammarAccess.getAnd_the_scenarioAccess().getTHETerminalRuleCall_1()); 
            match(input,RULE_THE,FOLLOW_2); 
             after(grammarAccess.getAnd_the_scenarioAccess().getTHETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__And_the_scenario__Group__1__Impl"


    // $ANTLR start "rule__And_the_scenario__Group__2"
    // InternalXCanopus.g:1409:1: rule__And_the_scenario__Group__2 : rule__And_the_scenario__Group__2__Impl rule__And_the_scenario__Group__3 ;
    public final void rule__And_the_scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1413:1: ( rule__And_the_scenario__Group__2__Impl rule__And_the_scenario__Group__3 )
            // InternalXCanopus.g:1414:2: rule__And_the_scenario__Group__2__Impl rule__And_the_scenario__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__And_the_scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_scenario__Group__3();

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
    // $ANTLR end "rule__And_the_scenario__Group__2"


    // $ANTLR start "rule__And_the_scenario__Group__2__Impl"
    // InternalXCanopus.g:1421:1: rule__And_the_scenario__Group__2__Impl : ( ( rule__And_the_scenario__ScenarioAssignment_2 ) ) ;
    public final void rule__And_the_scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1425:1: ( ( ( rule__And_the_scenario__ScenarioAssignment_2 ) ) )
            // InternalXCanopus.g:1426:1: ( ( rule__And_the_scenario__ScenarioAssignment_2 ) )
            {
            // InternalXCanopus.g:1426:1: ( ( rule__And_the_scenario__ScenarioAssignment_2 ) )
            // InternalXCanopus.g:1427:2: ( rule__And_the_scenario__ScenarioAssignment_2 )
            {
             before(grammarAccess.getAnd_the_scenarioAccess().getScenarioAssignment_2()); 
            // InternalXCanopus.g:1428:2: ( rule__And_the_scenario__ScenarioAssignment_2 )
            // InternalXCanopus.g:1428:3: rule__And_the_scenario__ScenarioAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__And_the_scenario__ScenarioAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnd_the_scenarioAccess().getScenarioAssignment_2()); 

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
    // $ANTLR end "rule__And_the_scenario__Group__2__Impl"


    // $ANTLR start "rule__And_the_scenario__Group__3"
    // InternalXCanopus.g:1436:1: rule__And_the_scenario__Group__3 : rule__And_the_scenario__Group__3__Impl ;
    public final void rule__And_the_scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1440:1: ( rule__And_the_scenario__Group__3__Impl )
            // InternalXCanopus.g:1441:2: rule__And_the_scenario__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And_the_scenario__Group__3__Impl();

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
    // $ANTLR end "rule__And_the_scenario__Group__3"


    // $ANTLR start "rule__And_the_scenario__Group__3__Impl"
    // InternalXCanopus.g:1447:1: rule__And_the_scenario__Group__3__Impl : ( RULE_ISTESTSCENARIO ) ;
    public final void rule__And_the_scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1451:1: ( ( RULE_ISTESTSCENARIO ) )
            // InternalXCanopus.g:1452:1: ( RULE_ISTESTSCENARIO )
            {
            // InternalXCanopus.g:1452:1: ( RULE_ISTESTSCENARIO )
            // InternalXCanopus.g:1453:2: RULE_ISTESTSCENARIO
            {
             before(grammarAccess.getAnd_the_scenarioAccess().getISTESTSCENARIOTerminalRuleCall_3()); 
            match(input,RULE_ISTESTSCENARIO,FOLLOW_2); 
             after(grammarAccess.getAnd_the_scenarioAccess().getISTESTSCENARIOTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__And_the_scenario__Group__3__Impl"


    // $ANTLR start "rule__And_atleast__Group__0"
    // InternalXCanopus.g:1463:1: rule__And_atleast__Group__0 : rule__And_atleast__Group__0__Impl rule__And_atleast__Group__1 ;
    public final void rule__And_atleast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1467:1: ( rule__And_atleast__Group__0__Impl rule__And_atleast__Group__1 )
            // InternalXCanopus.g:1468:2: rule__And_atleast__Group__0__Impl rule__And_atleast__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__And_atleast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_atleast__Group__1();

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
    // $ANTLR end "rule__And_atleast__Group__0"


    // $ANTLR start "rule__And_atleast__Group__0__Impl"
    // InternalXCanopus.g:1475:1: rule__And_atleast__Group__0__Impl : ( 'And' ) ;
    public final void rule__And_atleast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1479:1: ( ( 'And' ) )
            // InternalXCanopus.g:1480:1: ( 'And' )
            {
            // InternalXCanopus.g:1480:1: ( 'And' )
            // InternalXCanopus.g:1481:2: 'And'
            {
             before(grammarAccess.getAnd_atleastAccess().getAndKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAnd_atleastAccess().getAndKeyword_0()); 

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
    // $ANTLR end "rule__And_atleast__Group__0__Impl"


    // $ANTLR start "rule__And_atleast__Group__1"
    // InternalXCanopus.g:1490:1: rule__And_atleast__Group__1 : rule__And_atleast__Group__1__Impl rule__And_atleast__Group__2 ;
    public final void rule__And_atleast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1494:1: ( rule__And_atleast__Group__1__Impl rule__And_atleast__Group__2 )
            // InternalXCanopus.g:1495:2: rule__And_atleast__Group__1__Impl rule__And_atleast__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__And_atleast__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_atleast__Group__2();

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
    // $ANTLR end "rule__And_atleast__Group__1"


    // $ANTLR start "rule__And_atleast__Group__1__Impl"
    // InternalXCanopus.g:1502:1: rule__And_atleast__Group__1__Impl : ( RULE_ATL ) ;
    public final void rule__And_atleast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1506:1: ( ( RULE_ATL ) )
            // InternalXCanopus.g:1507:1: ( RULE_ATL )
            {
            // InternalXCanopus.g:1507:1: ( RULE_ATL )
            // InternalXCanopus.g:1508:2: RULE_ATL
            {
             before(grammarAccess.getAnd_atleastAccess().getATLTerminalRuleCall_1()); 
            match(input,RULE_ATL,FOLLOW_2); 
             after(grammarAccess.getAnd_atleastAccess().getATLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__And_atleast__Group__1__Impl"


    // $ANTLR start "rule__And_atleast__Group__2"
    // InternalXCanopus.g:1517:1: rule__And_atleast__Group__2 : rule__And_atleast__Group__2__Impl rule__And_atleast__Group__3 ;
    public final void rule__And_atleast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1521:1: ( rule__And_atleast__Group__2__Impl rule__And_atleast__Group__3 )
            // InternalXCanopus.g:1522:2: rule__And_atleast__Group__2__Impl rule__And_atleast__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__And_atleast__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_atleast__Group__3();

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
    // $ANTLR end "rule__And_atleast__Group__2"


    // $ANTLR start "rule__And_atleast__Group__2__Impl"
    // InternalXCanopus.g:1529:1: rule__And_atleast__Group__2__Impl : ( ( rule__And_atleast__Integer1Assignment_2 ) ) ;
    public final void rule__And_atleast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1533:1: ( ( ( rule__And_atleast__Integer1Assignment_2 ) ) )
            // InternalXCanopus.g:1534:1: ( ( rule__And_atleast__Integer1Assignment_2 ) )
            {
            // InternalXCanopus.g:1534:1: ( ( rule__And_atleast__Integer1Assignment_2 ) )
            // InternalXCanopus.g:1535:2: ( rule__And_atleast__Integer1Assignment_2 )
            {
             before(grammarAccess.getAnd_atleastAccess().getInteger1Assignment_2()); 
            // InternalXCanopus.g:1536:2: ( rule__And_atleast__Integer1Assignment_2 )
            // InternalXCanopus.g:1536:3: rule__And_atleast__Integer1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__And_atleast__Integer1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnd_atleastAccess().getInteger1Assignment_2()); 

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
    // $ANTLR end "rule__And_atleast__Group__2__Impl"


    // $ANTLR start "rule__And_atleast__Group__3"
    // InternalXCanopus.g:1544:1: rule__And_atleast__Group__3 : rule__And_atleast__Group__3__Impl rule__And_atleast__Group__4 ;
    public final void rule__And_atleast__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1548:1: ( rule__And_atleast__Group__3__Impl rule__And_atleast__Group__4 )
            // InternalXCanopus.g:1549:2: rule__And_atleast__Group__3__Impl rule__And_atleast__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__And_atleast__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_atleast__Group__4();

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
    // $ANTLR end "rule__And_atleast__Group__3"


    // $ANTLR start "rule__And_atleast__Group__3__Impl"
    // InternalXCanopus.g:1556:1: rule__And_atleast__Group__3__Impl : ( ( rule__And_atleast__Alternatives_3 ) ) ;
    public final void rule__And_atleast__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1560:1: ( ( ( rule__And_atleast__Alternatives_3 ) ) )
            // InternalXCanopus.g:1561:1: ( ( rule__And_atleast__Alternatives_3 ) )
            {
            // InternalXCanopus.g:1561:1: ( ( rule__And_atleast__Alternatives_3 ) )
            // InternalXCanopus.g:1562:2: ( rule__And_atleast__Alternatives_3 )
            {
             before(grammarAccess.getAnd_atleastAccess().getAlternatives_3()); 
            // InternalXCanopus.g:1563:2: ( rule__And_atleast__Alternatives_3 )
            // InternalXCanopus.g:1563:3: rule__And_atleast__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__And_atleast__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getAnd_atleastAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__And_atleast__Group__3__Impl"


    // $ANTLR start "rule__And_atleast__Group__4"
    // InternalXCanopus.g:1571:1: rule__And_atleast__Group__4 : rule__And_atleast__Group__4__Impl ;
    public final void rule__And_atleast__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1575:1: ( rule__And_atleast__Group__4__Impl )
            // InternalXCanopus.g:1576:2: rule__And_atleast__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And_atleast__Group__4__Impl();

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
    // $ANTLR end "rule__And_atleast__Group__4"


    // $ANTLR start "rule__And_atleast__Group__4__Impl"
    // InternalXCanopus.g:1582:1: rule__And_atleast__Group__4__Impl : ( ( rule__And_atleast__Integer2Assignment_4 ) ) ;
    public final void rule__And_atleast__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1586:1: ( ( ( rule__And_atleast__Integer2Assignment_4 ) ) )
            // InternalXCanopus.g:1587:1: ( ( rule__And_atleast__Integer2Assignment_4 ) )
            {
            // InternalXCanopus.g:1587:1: ( ( rule__And_atleast__Integer2Assignment_4 ) )
            // InternalXCanopus.g:1588:2: ( rule__And_atleast__Integer2Assignment_4 )
            {
             before(grammarAccess.getAnd_atleastAccess().getInteger2Assignment_4()); 
            // InternalXCanopus.g:1589:2: ( rule__And_atleast__Integer2Assignment_4 )
            // InternalXCanopus.g:1589:3: rule__And_atleast__Integer2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__And_atleast__Integer2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnd_atleastAccess().getInteger2Assignment_4()); 

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
    // $ANTLR end "rule__And_atleast__Group__4__Impl"


    // $ANTLR start "rule__And_the_metric__Group__0"
    // InternalXCanopus.g:1598:1: rule__And_the_metric__Group__0 : rule__And_the_metric__Group__0__Impl rule__And_the_metric__Group__1 ;
    public final void rule__And_the_metric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1602:1: ( rule__And_the_metric__Group__0__Impl rule__And_the_metric__Group__1 )
            // InternalXCanopus.g:1603:2: rule__And_the_metric__Group__0__Impl rule__And_the_metric__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__And_the_metric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group__1();

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
    // $ANTLR end "rule__And_the_metric__Group__0"


    // $ANTLR start "rule__And_the_metric__Group__0__Impl"
    // InternalXCanopus.g:1610:1: rule__And_the_metric__Group__0__Impl : ( 'And' ) ;
    public final void rule__And_the_metric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1614:1: ( ( 'And' ) )
            // InternalXCanopus.g:1615:1: ( 'And' )
            {
            // InternalXCanopus.g:1615:1: ( 'And' )
            // InternalXCanopus.g:1616:2: 'And'
            {
             before(grammarAccess.getAnd_the_metricAccess().getAndKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAnd_the_metricAccess().getAndKeyword_0()); 

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
    // $ANTLR end "rule__And_the_metric__Group__0__Impl"


    // $ANTLR start "rule__And_the_metric__Group__1"
    // InternalXCanopus.g:1625:1: rule__And_the_metric__Group__1 : rule__And_the_metric__Group__1__Impl rule__And_the_metric__Group__2 ;
    public final void rule__And_the_metric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1629:1: ( rule__And_the_metric__Group__1__Impl rule__And_the_metric__Group__2 )
            // InternalXCanopus.g:1630:2: rule__And_the_metric__Group__1__Impl rule__And_the_metric__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__And_the_metric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group__2();

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
    // $ANTLR end "rule__And_the_metric__Group__1"


    // $ANTLR start "rule__And_the_metric__Group__1__Impl"
    // InternalXCanopus.g:1637:1: rule__And_the_metric__Group__1__Impl : ( RULE_THE ) ;
    public final void rule__And_the_metric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1641:1: ( ( RULE_THE ) )
            // InternalXCanopus.g:1642:1: ( RULE_THE )
            {
            // InternalXCanopus.g:1642:1: ( RULE_THE )
            // InternalXCanopus.g:1643:2: RULE_THE
            {
             before(grammarAccess.getAnd_the_metricAccess().getTHETerminalRuleCall_1()); 
            match(input,RULE_THE,FOLLOW_2); 
             after(grammarAccess.getAnd_the_metricAccess().getTHETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__And_the_metric__Group__1__Impl"


    // $ANTLR start "rule__And_the_metric__Group__2"
    // InternalXCanopus.g:1652:1: rule__And_the_metric__Group__2 : rule__And_the_metric__Group__2__Impl rule__And_the_metric__Group__3 ;
    public final void rule__And_the_metric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1656:1: ( rule__And_the_metric__Group__2__Impl rule__And_the_metric__Group__3 )
            // InternalXCanopus.g:1657:2: rule__And_the_metric__Group__2__Impl rule__And_the_metric__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__And_the_metric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group__3();

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
    // $ANTLR end "rule__And_the_metric__Group__2"


    // $ANTLR start "rule__And_the_metric__Group__2__Impl"
    // InternalXCanopus.g:1664:1: rule__And_the_metric__Group__2__Impl : ( ( rule__And_the_metric__MetricAssignment_2 ) ) ;
    public final void rule__And_the_metric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1668:1: ( ( ( rule__And_the_metric__MetricAssignment_2 ) ) )
            // InternalXCanopus.g:1669:1: ( ( rule__And_the_metric__MetricAssignment_2 ) )
            {
            // InternalXCanopus.g:1669:1: ( ( rule__And_the_metric__MetricAssignment_2 ) )
            // InternalXCanopus.g:1670:2: ( rule__And_the_metric__MetricAssignment_2 )
            {
             before(grammarAccess.getAnd_the_metricAccess().getMetricAssignment_2()); 
            // InternalXCanopus.g:1671:2: ( rule__And_the_metric__MetricAssignment_2 )
            // InternalXCanopus.g:1671:3: rule__And_the_metric__MetricAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__And_the_metric__MetricAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnd_the_metricAccess().getMetricAssignment_2()); 

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
    // $ANTLR end "rule__And_the_metric__Group__2__Impl"


    // $ANTLR start "rule__And_the_metric__Group__3"
    // InternalXCanopus.g:1679:1: rule__And_the_metric__Group__3 : rule__And_the_metric__Group__3__Impl rule__And_the_metric__Group__4 ;
    public final void rule__And_the_metric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1683:1: ( rule__And_the_metric__Group__3__Impl rule__And_the_metric__Group__4 )
            // InternalXCanopus.g:1684:2: rule__And_the_metric__Group__3__Impl rule__And_the_metric__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__And_the_metric__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group__4();

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
    // $ANTLR end "rule__And_the_metric__Group__3"


    // $ANTLR start "rule__And_the_metric__Group__3__Impl"
    // InternalXCanopus.g:1691:1: rule__And_the_metric__Group__3__Impl : ( ( rule__And_the_metric__Alternatives_3 ) ) ;
    public final void rule__And_the_metric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1695:1: ( ( ( rule__And_the_metric__Alternatives_3 ) ) )
            // InternalXCanopus.g:1696:1: ( ( rule__And_the_metric__Alternatives_3 ) )
            {
            // InternalXCanopus.g:1696:1: ( ( rule__And_the_metric__Alternatives_3 ) )
            // InternalXCanopus.g:1697:2: ( rule__And_the_metric__Alternatives_3 )
            {
             before(grammarAccess.getAnd_the_metricAccess().getAlternatives_3()); 
            // InternalXCanopus.g:1698:2: ( rule__And_the_metric__Alternatives_3 )
            // InternalXCanopus.g:1698:3: rule__And_the_metric__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__And_the_metric__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getAnd_the_metricAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__And_the_metric__Group__3__Impl"


    // $ANTLR start "rule__And_the_metric__Group__4"
    // InternalXCanopus.g:1706:1: rule__And_the_metric__Group__4 : rule__And_the_metric__Group__4__Impl rule__And_the_metric__Group__5 ;
    public final void rule__And_the_metric__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1710:1: ( rule__And_the_metric__Group__4__Impl rule__And_the_metric__Group__5 )
            // InternalXCanopus.g:1711:2: rule__And_the_metric__Group__4__Impl rule__And_the_metric__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__And_the_metric__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group__5();

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
    // $ANTLR end "rule__And_the_metric__Group__4"


    // $ANTLR start "rule__And_the_metric__Group__4__Impl"
    // InternalXCanopus.g:1718:1: rule__And_the_metric__Group__4__Impl : ( ( rule__And_the_metric__Integer1Assignment_4 ) ) ;
    public final void rule__And_the_metric__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1722:1: ( ( ( rule__And_the_metric__Integer1Assignment_4 ) ) )
            // InternalXCanopus.g:1723:1: ( ( rule__And_the_metric__Integer1Assignment_4 ) )
            {
            // InternalXCanopus.g:1723:1: ( ( rule__And_the_metric__Integer1Assignment_4 ) )
            // InternalXCanopus.g:1724:2: ( rule__And_the_metric__Integer1Assignment_4 )
            {
             before(grammarAccess.getAnd_the_metricAccess().getInteger1Assignment_4()); 
            // InternalXCanopus.g:1725:2: ( rule__And_the_metric__Integer1Assignment_4 )
            // InternalXCanopus.g:1725:3: rule__And_the_metric__Integer1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__And_the_metric__Integer1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnd_the_metricAccess().getInteger1Assignment_4()); 

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
    // $ANTLR end "rule__And_the_metric__Group__4__Impl"


    // $ANTLR start "rule__And_the_metric__Group__5"
    // InternalXCanopus.g:1733:1: rule__And_the_metric__Group__5 : rule__And_the_metric__Group__5__Impl rule__And_the_metric__Group__6 ;
    public final void rule__And_the_metric__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1737:1: ( rule__And_the_metric__Group__5__Impl rule__And_the_metric__Group__6 )
            // InternalXCanopus.g:1738:2: rule__And_the_metric__Group__5__Impl rule__And_the_metric__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__And_the_metric__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group__6();

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
    // $ANTLR end "rule__And_the_metric__Group__5"


    // $ANTLR start "rule__And_the_metric__Group__5__Impl"
    // InternalXCanopus.g:1745:1: rule__And_the_metric__Group__5__Impl : ( ( rule__And_the_metric__Alternatives_5 ) ) ;
    public final void rule__And_the_metric__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1749:1: ( ( ( rule__And_the_metric__Alternatives_5 ) ) )
            // InternalXCanopus.g:1750:1: ( ( rule__And_the_metric__Alternatives_5 ) )
            {
            // InternalXCanopus.g:1750:1: ( ( rule__And_the_metric__Alternatives_5 ) )
            // InternalXCanopus.g:1751:2: ( rule__And_the_metric__Alternatives_5 )
            {
             before(grammarAccess.getAnd_the_metricAccess().getAlternatives_5()); 
            // InternalXCanopus.g:1752:2: ( rule__And_the_metric__Alternatives_5 )
            // InternalXCanopus.g:1752:3: rule__And_the_metric__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__And_the_metric__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getAnd_the_metricAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__And_the_metric__Group__5__Impl"


    // $ANTLR start "rule__And_the_metric__Group__6"
    // InternalXCanopus.g:1760:1: rule__And_the_metric__Group__6 : rule__And_the_metric__Group__6__Impl rule__And_the_metric__Group__7 ;
    public final void rule__And_the_metric__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1764:1: ( rule__And_the_metric__Group__6__Impl rule__And_the_metric__Group__7 )
            // InternalXCanopus.g:1765:2: rule__And_the_metric__Group__6__Impl rule__And_the_metric__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__And_the_metric__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group__7();

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
    // $ANTLR end "rule__And_the_metric__Group__6"


    // $ANTLR start "rule__And_the_metric__Group__6__Impl"
    // InternalXCanopus.g:1772:1: rule__And_the_metric__Group__6__Impl : ( ( rule__And_the_metric__Integer2Assignment_6 ) ) ;
    public final void rule__And_the_metric__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1776:1: ( ( ( rule__And_the_metric__Integer2Assignment_6 ) ) )
            // InternalXCanopus.g:1777:1: ( ( rule__And_the_metric__Integer2Assignment_6 ) )
            {
            // InternalXCanopus.g:1777:1: ( ( rule__And_the_metric__Integer2Assignment_6 ) )
            // InternalXCanopus.g:1778:2: ( rule__And_the_metric__Integer2Assignment_6 )
            {
             before(grammarAccess.getAnd_the_metricAccess().getInteger2Assignment_6()); 
            // InternalXCanopus.g:1779:2: ( rule__And_the_metric__Integer2Assignment_6 )
            // InternalXCanopus.g:1779:3: rule__And_the_metric__Integer2Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__And_the_metric__Integer2Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAnd_the_metricAccess().getInteger2Assignment_6()); 

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
    // $ANTLR end "rule__And_the_metric__Group__6__Impl"


    // $ANTLR start "rule__And_the_metric__Group__7"
    // InternalXCanopus.g:1787:1: rule__And_the_metric__Group__7 : rule__And_the_metric__Group__7__Impl ;
    public final void rule__And_the_metric__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1791:1: ( rule__And_the_metric__Group__7__Impl )
            // InternalXCanopus.g:1792:2: rule__And_the_metric__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group__7__Impl();

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
    // $ANTLR end "rule__And_the_metric__Group__7"


    // $ANTLR start "rule__And_the_metric__Group__7__Impl"
    // InternalXCanopus.g:1798:1: rule__And_the_metric__Group__7__Impl : ( ( rule__And_the_metric__Group_7__0 )? ) ;
    public final void rule__And_the_metric__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1802:1: ( ( ( rule__And_the_metric__Group_7__0 )? ) )
            // InternalXCanopus.g:1803:1: ( ( rule__And_the_metric__Group_7__0 )? )
            {
            // InternalXCanopus.g:1803:1: ( ( rule__And_the_metric__Group_7__0 )? )
            // InternalXCanopus.g:1804:2: ( rule__And_the_metric__Group_7__0 )?
            {
             before(grammarAccess.getAnd_the_metricAccess().getGroup_7()); 
            // InternalXCanopus.g:1805:2: ( rule__And_the_metric__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_AND) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXCanopus.g:1805:3: rule__And_the_metric__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__And_the_metric__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnd_the_metricAccess().getGroup_7()); 

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
    // $ANTLR end "rule__And_the_metric__Group__7__Impl"


    // $ANTLR start "rule__And_the_metric__Group_7__0"
    // InternalXCanopus.g:1814:1: rule__And_the_metric__Group_7__0 : rule__And_the_metric__Group_7__0__Impl rule__And_the_metric__Group_7__1 ;
    public final void rule__And_the_metric__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1818:1: ( rule__And_the_metric__Group_7__0__Impl rule__And_the_metric__Group_7__1 )
            // InternalXCanopus.g:1819:2: rule__And_the_metric__Group_7__0__Impl rule__And_the_metric__Group_7__1
            {
            pushFollow(FOLLOW_21);
            rule__And_the_metric__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group_7__1();

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
    // $ANTLR end "rule__And_the_metric__Group_7__0"


    // $ANTLR start "rule__And_the_metric__Group_7__0__Impl"
    // InternalXCanopus.g:1826:1: rule__And_the_metric__Group_7__0__Impl : ( RULE_AND ) ;
    public final void rule__And_the_metric__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1830:1: ( ( RULE_AND ) )
            // InternalXCanopus.g:1831:1: ( RULE_AND )
            {
            // InternalXCanopus.g:1831:1: ( RULE_AND )
            // InternalXCanopus.g:1832:2: RULE_AND
            {
             before(grammarAccess.getAnd_the_metricAccess().getANDTerminalRuleCall_7_0()); 
            match(input,RULE_AND,FOLLOW_2); 
             after(grammarAccess.getAnd_the_metricAccess().getANDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__And_the_metric__Group_7__0__Impl"


    // $ANTLR start "rule__And_the_metric__Group_7__1"
    // InternalXCanopus.g:1841:1: rule__And_the_metric__Group_7__1 : rule__And_the_metric__Group_7__1__Impl ;
    public final void rule__And_the_metric__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1845:1: ( rule__And_the_metric__Group_7__1__Impl )
            // InternalXCanopus.g:1846:2: rule__And_the_metric__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And_the_metric__Group_7__1__Impl();

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
    // $ANTLR end "rule__And_the_metric__Group_7__1"


    // $ANTLR start "rule__And_the_metric__Group_7__1__Impl"
    // InternalXCanopus.g:1852:1: rule__And_the_metric__Group_7__1__Impl : ( ( rule__And_the_metric__Integer3Assignment_7_1 ) ) ;
    public final void rule__And_the_metric__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1856:1: ( ( ( rule__And_the_metric__Integer3Assignment_7_1 ) ) )
            // InternalXCanopus.g:1857:1: ( ( rule__And_the_metric__Integer3Assignment_7_1 ) )
            {
            // InternalXCanopus.g:1857:1: ( ( rule__And_the_metric__Integer3Assignment_7_1 ) )
            // InternalXCanopus.g:1858:2: ( rule__And_the_metric__Integer3Assignment_7_1 )
            {
             before(grammarAccess.getAnd_the_metricAccess().getInteger3Assignment_7_1()); 
            // InternalXCanopus.g:1859:2: ( rule__And_the_metric__Integer3Assignment_7_1 )
            // InternalXCanopus.g:1859:3: rule__And_the_metric__Integer3Assignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__And_the_metric__Integer3Assignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAnd_the_metricAccess().getInteger3Assignment_7_1()); 

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
    // $ANTLR end "rule__And_the_metric__Group_7__1__Impl"


    // $ANTLR start "rule__When__Group__0"
    // InternalXCanopus.g:1868:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1872:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalXCanopus.g:1873:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__When__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__1();

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
    // $ANTLR end "rule__When__Group__0"


    // $ANTLR start "rule__When__Group__0__Impl"
    // InternalXCanopus.g:1880:1: rule__When__Group__0__Impl : ( 'When' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1884:1: ( ( 'When' ) )
            // InternalXCanopus.g:1885:1: ( 'When' )
            {
            // InternalXCanopus.g:1885:1: ( 'When' )
            // InternalXCanopus.g:1886:2: 'When'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getWhenKeyword_0()); 

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
    // $ANTLR end "rule__When__Group__0__Impl"


    // $ANTLR start "rule__When__Group__1"
    // InternalXCanopus.g:1895:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1899:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalXCanopus.g:1900:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__When__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__2();

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
    // $ANTLR end "rule__When__Group__1"


    // $ANTLR start "rule__When__Group__1__Impl"
    // InternalXCanopus.g:1907:1: rule__When__Group__1__Impl : ( RULE_THE ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1911:1: ( ( RULE_THE ) )
            // InternalXCanopus.g:1912:1: ( RULE_THE )
            {
            // InternalXCanopus.g:1912:1: ( RULE_THE )
            // InternalXCanopus.g:1913:2: RULE_THE
            {
             before(grammarAccess.getWhenAccess().getTHETerminalRuleCall_1()); 
            match(input,RULE_THE,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getTHETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__When__Group__1__Impl"


    // $ANTLR start "rule__When__Group__2"
    // InternalXCanopus.g:1922:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1926:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalXCanopus.g:1927:2: rule__When__Group__2__Impl rule__When__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__When__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__3();

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
    // $ANTLR end "rule__When__Group__2"


    // $ANTLR start "rule__When__Group__2__Impl"
    // InternalXCanopus.g:1934:1: rule__When__Group__2__Impl : ( ( rule__When__MetrictypeAssignment_2 ) ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1938:1: ( ( ( rule__When__MetrictypeAssignment_2 ) ) )
            // InternalXCanopus.g:1939:1: ( ( rule__When__MetrictypeAssignment_2 ) )
            {
            // InternalXCanopus.g:1939:1: ( ( rule__When__MetrictypeAssignment_2 ) )
            // InternalXCanopus.g:1940:2: ( rule__When__MetrictypeAssignment_2 )
            {
             before(grammarAccess.getWhenAccess().getMetrictypeAssignment_2()); 
            // InternalXCanopus.g:1941:2: ( rule__When__MetrictypeAssignment_2 )
            // InternalXCanopus.g:1941:3: rule__When__MetrictypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__When__MetrictypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getMetrictypeAssignment_2()); 

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
    // $ANTLR end "rule__When__Group__2__Impl"


    // $ANTLR start "rule__When__Group__3"
    // InternalXCanopus.g:1949:1: rule__When__Group__3 : rule__When__Group__3__Impl ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1953:1: ( rule__When__Group__3__Impl )
            // InternalXCanopus.g:1954:2: rule__When__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__3__Impl();

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
    // $ANTLR end "rule__When__Group__3"


    // $ANTLR start "rule__When__Group__3__Impl"
    // InternalXCanopus.g:1960:1: rule__When__Group__3__Impl : ( RULE_ISMONITORED ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1964:1: ( ( RULE_ISMONITORED ) )
            // InternalXCanopus.g:1965:1: ( RULE_ISMONITORED )
            {
            // InternalXCanopus.g:1965:1: ( RULE_ISMONITORED )
            // InternalXCanopus.g:1966:2: RULE_ISMONITORED
            {
             before(grammarAccess.getWhenAccess().getISMONITOREDTerminalRuleCall_3()); 
            match(input,RULE_ISMONITORED,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getISMONITOREDTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__When__Group__3__Impl"


    // $ANTLR start "rule__Then__Group__0"
    // InternalXCanopus.g:1976:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1980:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalXCanopus.g:1981:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Then__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__1();

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
    // $ANTLR end "rule__Then__Group__0"


    // $ANTLR start "rule__Then__Group__0__Impl"
    // InternalXCanopus.g:1988:1: rule__Then__Group__0__Impl : ( 'Then' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:1992:1: ( ( 'Then' ) )
            // InternalXCanopus.g:1993:1: ( 'Then' )
            {
            // InternalXCanopus.g:1993:1: ( 'Then' )
            // InternalXCanopus.g:1994:2: 'Then'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getThenKeyword_0()); 

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
    // $ANTLR end "rule__Then__Group__0__Impl"


    // $ANTLR start "rule__Then__Group__1"
    // InternalXCanopus.g:2003:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2007:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalXCanopus.g:2008:2: rule__Then__Group__1__Impl rule__Then__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Then__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__2();

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
    // $ANTLR end "rule__Then__Group__1"


    // $ANTLR start "rule__Then__Group__1__Impl"
    // InternalXCanopus.g:2015:1: rule__Then__Group__1__Impl : ( RULE_THE ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2019:1: ( ( RULE_THE ) )
            // InternalXCanopus.g:2020:1: ( RULE_THE )
            {
            // InternalXCanopus.g:2020:1: ( RULE_THE )
            // InternalXCanopus.g:2021:2: RULE_THE
            {
             before(grammarAccess.getThenAccess().getTHETerminalRuleCall_1()); 
            match(input,RULE_THE,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getTHETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Then__Group__1__Impl"


    // $ANTLR start "rule__Then__Group__2"
    // InternalXCanopus.g:2030:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2034:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalXCanopus.g:2035:2: rule__Then__Group__2__Impl rule__Then__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Then__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__3();

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
    // $ANTLR end "rule__Then__Group__2"


    // $ANTLR start "rule__Then__Group__2__Impl"
    // InternalXCanopus.g:2042:1: rule__Then__Group__2__Impl : ( ( rule__Then__MetricAssignment_2 ) ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2046:1: ( ( ( rule__Then__MetricAssignment_2 ) ) )
            // InternalXCanopus.g:2047:1: ( ( rule__Then__MetricAssignment_2 ) )
            {
            // InternalXCanopus.g:2047:1: ( ( rule__Then__MetricAssignment_2 ) )
            // InternalXCanopus.g:2048:2: ( rule__Then__MetricAssignment_2 )
            {
             before(grammarAccess.getThenAccess().getMetricAssignment_2()); 
            // InternalXCanopus.g:2049:2: ( rule__Then__MetricAssignment_2 )
            // InternalXCanopus.g:2049:3: rule__Then__MetricAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Then__MetricAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getMetricAssignment_2()); 

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
    // $ANTLR end "rule__Then__Group__2__Impl"


    // $ANTLR start "rule__Then__Group__3"
    // InternalXCanopus.g:2057:1: rule__Then__Group__3 : rule__Then__Group__3__Impl rule__Then__Group__4 ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2061:1: ( rule__Then__Group__3__Impl rule__Then__Group__4 )
            // InternalXCanopus.g:2062:2: rule__Then__Group__3__Impl rule__Then__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Then__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__4();

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
    // $ANTLR end "rule__Then__Group__3"


    // $ANTLR start "rule__Then__Group__3__Impl"
    // InternalXCanopus.g:2069:1: rule__Then__Group__3__Impl : ( ( rule__Then__Alternatives_3 ) ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2073:1: ( ( ( rule__Then__Alternatives_3 ) ) )
            // InternalXCanopus.g:2074:1: ( ( rule__Then__Alternatives_3 ) )
            {
            // InternalXCanopus.g:2074:1: ( ( rule__Then__Alternatives_3 ) )
            // InternalXCanopus.g:2075:2: ( rule__Then__Alternatives_3 )
            {
             before(grammarAccess.getThenAccess().getAlternatives_3()); 
            // InternalXCanopus.g:2076:2: ( rule__Then__Alternatives_3 )
            // InternalXCanopus.g:2076:3: rule__Then__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Then__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Then__Group__3__Impl"


    // $ANTLR start "rule__Then__Group__4"
    // InternalXCanopus.g:2084:1: rule__Then__Group__4 : rule__Then__Group__4__Impl rule__Then__Group__5 ;
    public final void rule__Then__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2088:1: ( rule__Then__Group__4__Impl rule__Then__Group__5 )
            // InternalXCanopus.g:2089:2: rule__Then__Group__4__Impl rule__Then__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Then__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__5();

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
    // $ANTLR end "rule__Then__Group__4"


    // $ANTLR start "rule__Then__Group__4__Impl"
    // InternalXCanopus.g:2096:1: rule__Then__Group__4__Impl : ( ( rule__Then__Integer1Assignment_4 ) ) ;
    public final void rule__Then__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2100:1: ( ( ( rule__Then__Integer1Assignment_4 ) ) )
            // InternalXCanopus.g:2101:1: ( ( rule__Then__Integer1Assignment_4 ) )
            {
            // InternalXCanopus.g:2101:1: ( ( rule__Then__Integer1Assignment_4 ) )
            // InternalXCanopus.g:2102:2: ( rule__Then__Integer1Assignment_4 )
            {
             before(grammarAccess.getThenAccess().getInteger1Assignment_4()); 
            // InternalXCanopus.g:2103:2: ( rule__Then__Integer1Assignment_4 )
            // InternalXCanopus.g:2103:3: rule__Then__Integer1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Then__Integer1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getInteger1Assignment_4()); 

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
    // $ANTLR end "rule__Then__Group__4__Impl"


    // $ANTLR start "rule__Then__Group__5"
    // InternalXCanopus.g:2111:1: rule__Then__Group__5 : rule__Then__Group__5__Impl rule__Then__Group__6 ;
    public final void rule__Then__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2115:1: ( rule__Then__Group__5__Impl rule__Then__Group__6 )
            // InternalXCanopus.g:2116:2: rule__Then__Group__5__Impl rule__Then__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Then__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__6();

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
    // $ANTLR end "rule__Then__Group__5"


    // $ANTLR start "rule__Then__Group__5__Impl"
    // InternalXCanopus.g:2123:1: rule__Then__Group__5__Impl : ( ( rule__Then__Alternatives_5 ) ) ;
    public final void rule__Then__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2127:1: ( ( ( rule__Then__Alternatives_5 ) ) )
            // InternalXCanopus.g:2128:1: ( ( rule__Then__Alternatives_5 ) )
            {
            // InternalXCanopus.g:2128:1: ( ( rule__Then__Alternatives_5 ) )
            // InternalXCanopus.g:2129:2: ( rule__Then__Alternatives_5 )
            {
             before(grammarAccess.getThenAccess().getAlternatives_5()); 
            // InternalXCanopus.g:2130:2: ( rule__Then__Alternatives_5 )
            // InternalXCanopus.g:2130:3: rule__Then__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Then__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__Then__Group__5__Impl"


    // $ANTLR start "rule__Then__Group__6"
    // InternalXCanopus.g:2138:1: rule__Then__Group__6 : rule__Then__Group__6__Impl rule__Then__Group__7 ;
    public final void rule__Then__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2142:1: ( rule__Then__Group__6__Impl rule__Then__Group__7 )
            // InternalXCanopus.g:2143:2: rule__Then__Group__6__Impl rule__Then__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Then__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__7();

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
    // $ANTLR end "rule__Then__Group__6"


    // $ANTLR start "rule__Then__Group__6__Impl"
    // InternalXCanopus.g:2150:1: rule__Then__Group__6__Impl : ( ( rule__Then__Integer2Assignment_6 ) ) ;
    public final void rule__Then__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2154:1: ( ( ( rule__Then__Integer2Assignment_6 ) ) )
            // InternalXCanopus.g:2155:1: ( ( rule__Then__Integer2Assignment_6 ) )
            {
            // InternalXCanopus.g:2155:1: ( ( rule__Then__Integer2Assignment_6 ) )
            // InternalXCanopus.g:2156:2: ( rule__Then__Integer2Assignment_6 )
            {
             before(grammarAccess.getThenAccess().getInteger2Assignment_6()); 
            // InternalXCanopus.g:2157:2: ( rule__Then__Integer2Assignment_6 )
            // InternalXCanopus.g:2157:3: rule__Then__Integer2Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Then__Integer2Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getInteger2Assignment_6()); 

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
    // $ANTLR end "rule__Then__Group__6__Impl"


    // $ANTLR start "rule__Then__Group__7"
    // InternalXCanopus.g:2165:1: rule__Then__Group__7 : rule__Then__Group__7__Impl ;
    public final void rule__Then__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2169:1: ( rule__Then__Group__7__Impl )
            // InternalXCanopus.g:2170:2: rule__Then__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__7__Impl();

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
    // $ANTLR end "rule__Then__Group__7"


    // $ANTLR start "rule__Then__Group__7__Impl"
    // InternalXCanopus.g:2176:1: rule__Then__Group__7__Impl : ( ( rule__Then__Group_7__0 )? ) ;
    public final void rule__Then__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2180:1: ( ( ( rule__Then__Group_7__0 )? ) )
            // InternalXCanopus.g:2181:1: ( ( rule__Then__Group_7__0 )? )
            {
            // InternalXCanopus.g:2181:1: ( ( rule__Then__Group_7__0 )? )
            // InternalXCanopus.g:2182:2: ( rule__Then__Group_7__0 )?
            {
             before(grammarAccess.getThenAccess().getGroup_7()); 
            // InternalXCanopus.g:2183:2: ( rule__Then__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_AND) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXCanopus.g:2183:3: rule__Then__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThenAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Then__Group__7__Impl"


    // $ANTLR start "rule__Then__Group_7__0"
    // InternalXCanopus.g:2192:1: rule__Then__Group_7__0 : rule__Then__Group_7__0__Impl rule__Then__Group_7__1 ;
    public final void rule__Then__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2196:1: ( rule__Then__Group_7__0__Impl rule__Then__Group_7__1 )
            // InternalXCanopus.g:2197:2: rule__Then__Group_7__0__Impl rule__Then__Group_7__1
            {
            pushFollow(FOLLOW_21);
            rule__Then__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group_7__1();

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
    // $ANTLR end "rule__Then__Group_7__0"


    // $ANTLR start "rule__Then__Group_7__0__Impl"
    // InternalXCanopus.g:2204:1: rule__Then__Group_7__0__Impl : ( RULE_AND ) ;
    public final void rule__Then__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2208:1: ( ( RULE_AND ) )
            // InternalXCanopus.g:2209:1: ( RULE_AND )
            {
            // InternalXCanopus.g:2209:1: ( RULE_AND )
            // InternalXCanopus.g:2210:2: RULE_AND
            {
             before(grammarAccess.getThenAccess().getANDTerminalRuleCall_7_0()); 
            match(input,RULE_AND,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getANDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Then__Group_7__0__Impl"


    // $ANTLR start "rule__Then__Group_7__1"
    // InternalXCanopus.g:2219:1: rule__Then__Group_7__1 : rule__Then__Group_7__1__Impl ;
    public final void rule__Then__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2223:1: ( rule__Then__Group_7__1__Impl )
            // InternalXCanopus.g:2224:2: rule__Then__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group_7__1__Impl();

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
    // $ANTLR end "rule__Then__Group_7__1"


    // $ANTLR start "rule__Then__Group_7__1__Impl"
    // InternalXCanopus.g:2230:1: rule__Then__Group_7__1__Impl : ( ( rule__Then__Integer3Assignment_7_1 ) ) ;
    public final void rule__Then__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2234:1: ( ( ( rule__Then__Integer3Assignment_7_1 ) ) )
            // InternalXCanopus.g:2235:1: ( ( rule__Then__Integer3Assignment_7_1 ) )
            {
            // InternalXCanopus.g:2235:1: ( ( rule__Then__Integer3Assignment_7_1 ) )
            // InternalXCanopus.g:2236:2: ( rule__Then__Integer3Assignment_7_1 )
            {
             before(grammarAccess.getThenAccess().getInteger3Assignment_7_1()); 
            // InternalXCanopus.g:2237:2: ( rule__Then__Integer3Assignment_7_1 )
            // InternalXCanopus.g:2237:3: rule__Then__Integer3Assignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Then__Integer3Assignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getInteger3Assignment_7_1()); 

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
    // $ANTLR end "rule__Then__Group_7__1__Impl"


    // $ANTLR start "rule__Given__Group__0"
    // InternalXCanopus.g:2246:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2250:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalXCanopus.g:2251:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Given__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__1();

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
    // $ANTLR end "rule__Given__Group__0"


    // $ANTLR start "rule__Given__Group__0__Impl"
    // InternalXCanopus.g:2258:1: rule__Given__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2262:1: ( ( 'Given' ) )
            // InternalXCanopus.g:2263:1: ( 'Given' )
            {
            // InternalXCanopus.g:2263:1: ( 'Given' )
            // InternalXCanopus.g:2264:2: 'Given'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getGivenKeyword_0()); 

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
    // $ANTLR end "rule__Given__Group__0__Impl"


    // $ANTLR start "rule__Given__Group__1"
    // InternalXCanopus.g:2273:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2277:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalXCanopus.g:2278:2: rule__Given__Group__1__Impl rule__Given__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Given__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__2();

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
    // $ANTLR end "rule__Given__Group__1"


    // $ANTLR start "rule__Given__Group__1__Impl"
    // InternalXCanopus.g:2285:1: rule__Given__Group__1__Impl : ( RULE_THAT ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2289:1: ( ( RULE_THAT ) )
            // InternalXCanopus.g:2290:1: ( RULE_THAT )
            {
            // InternalXCanopus.g:2290:1: ( RULE_THAT )
            // InternalXCanopus.g:2291:2: RULE_THAT
            {
             before(grammarAccess.getGivenAccess().getTHATTerminalRuleCall_1()); 
            match(input,RULE_THAT,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getTHATTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Given__Group__1__Impl"


    // $ANTLR start "rule__Given__Group__2"
    // InternalXCanopus.g:2300:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2304:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalXCanopus.g:2305:2: rule__Given__Group__2__Impl rule__Given__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Given__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__3();

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
    // $ANTLR end "rule__Given__Group__2"


    // $ANTLR start "rule__Given__Group__2__Impl"
    // InternalXCanopus.g:2312:1: rule__Given__Group__2__Impl : ( ( rule__Given__Sut1Assignment_2 ) ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2316:1: ( ( ( rule__Given__Sut1Assignment_2 ) ) )
            // InternalXCanopus.g:2317:1: ( ( rule__Given__Sut1Assignment_2 ) )
            {
            // InternalXCanopus.g:2317:1: ( ( rule__Given__Sut1Assignment_2 ) )
            // InternalXCanopus.g:2318:2: ( rule__Given__Sut1Assignment_2 )
            {
             before(grammarAccess.getGivenAccess().getSut1Assignment_2()); 
            // InternalXCanopus.g:2319:2: ( rule__Given__Sut1Assignment_2 )
            // InternalXCanopus.g:2319:3: rule__Given__Sut1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Given__Sut1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getSut1Assignment_2()); 

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
    // $ANTLR end "rule__Given__Group__2__Impl"


    // $ANTLR start "rule__Given__Group__3"
    // InternalXCanopus.g:2327:1: rule__Given__Group__3 : rule__Given__Group__3__Impl rule__Given__Group__4 ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2331:1: ( rule__Given__Group__3__Impl rule__Given__Group__4 )
            // InternalXCanopus.g:2332:2: rule__Given__Group__3__Impl rule__Given__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Given__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__4();

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
    // $ANTLR end "rule__Given__Group__3"


    // $ANTLR start "rule__Given__Group__3__Impl"
    // InternalXCanopus.g:2339:1: rule__Given__Group__3__Impl : ( ( rule__Given__SuttypeAssignment_3 ) ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2343:1: ( ( ( rule__Given__SuttypeAssignment_3 ) ) )
            // InternalXCanopus.g:2344:1: ( ( rule__Given__SuttypeAssignment_3 ) )
            {
            // InternalXCanopus.g:2344:1: ( ( rule__Given__SuttypeAssignment_3 ) )
            // InternalXCanopus.g:2345:2: ( rule__Given__SuttypeAssignment_3 )
            {
             before(grammarAccess.getGivenAccess().getSuttypeAssignment_3()); 
            // InternalXCanopus.g:2346:2: ( rule__Given__SuttypeAssignment_3 )
            // InternalXCanopus.g:2346:3: rule__Given__SuttypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Given__SuttypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getSuttypeAssignment_3()); 

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
    // $ANTLR end "rule__Given__Group__3__Impl"


    // $ANTLR start "rule__Given__Group__4"
    // InternalXCanopus.g:2354:1: rule__Given__Group__4 : rule__Given__Group__4__Impl rule__Given__Group__5 ;
    public final void rule__Given__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2358:1: ( rule__Given__Group__4__Impl rule__Given__Group__5 )
            // InternalXCanopus.g:2359:2: rule__Given__Group__4__Impl rule__Given__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Given__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__5();

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
    // $ANTLR end "rule__Given__Group__4"


    // $ANTLR start "rule__Given__Group__4__Impl"
    // InternalXCanopus.g:2366:1: rule__Given__Group__4__Impl : ( RULE_MONITOREDBY ) ;
    public final void rule__Given__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2370:1: ( ( RULE_MONITOREDBY ) )
            // InternalXCanopus.g:2371:1: ( RULE_MONITOREDBY )
            {
            // InternalXCanopus.g:2371:1: ( RULE_MONITOREDBY )
            // InternalXCanopus.g:2372:2: RULE_MONITOREDBY
            {
             before(grammarAccess.getGivenAccess().getMONITOREDBYTerminalRuleCall_4()); 
            match(input,RULE_MONITOREDBY,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getMONITOREDBYTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Given__Group__4__Impl"


    // $ANTLR start "rule__Given__Group__5"
    // InternalXCanopus.g:2381:1: rule__Given__Group__5 : rule__Given__Group__5__Impl rule__Given__Group__6 ;
    public final void rule__Given__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2385:1: ( rule__Given__Group__5__Impl rule__Given__Group__6 )
            // InternalXCanopus.g:2386:2: rule__Given__Group__5__Impl rule__Given__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Given__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__6();

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
    // $ANTLR end "rule__Given__Group__5"


    // $ANTLR start "rule__Given__Group__5__Impl"
    // InternalXCanopus.g:2393:1: rule__Given__Group__5__Impl : ( ( rule__Given__Sut2Assignment_5 ) ) ;
    public final void rule__Given__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2397:1: ( ( ( rule__Given__Sut2Assignment_5 ) ) )
            // InternalXCanopus.g:2398:1: ( ( rule__Given__Sut2Assignment_5 ) )
            {
            // InternalXCanopus.g:2398:1: ( ( rule__Given__Sut2Assignment_5 ) )
            // InternalXCanopus.g:2399:2: ( rule__Given__Sut2Assignment_5 )
            {
             before(grammarAccess.getGivenAccess().getSut2Assignment_5()); 
            // InternalXCanopus.g:2400:2: ( rule__Given__Sut2Assignment_5 )
            // InternalXCanopus.g:2400:3: rule__Given__Sut2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Given__Sut2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getSut2Assignment_5()); 

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
    // $ANTLR end "rule__Given__Group__5__Impl"


    // $ANTLR start "rule__Given__Group__6"
    // InternalXCanopus.g:2408:1: rule__Given__Group__6 : rule__Given__Group__6__Impl ;
    public final void rule__Given__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2412:1: ( rule__Given__Group__6__Impl )
            // InternalXCanopus.g:2413:2: rule__Given__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__6__Impl();

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
    // $ANTLR end "rule__Given__Group__6"


    // $ANTLR start "rule__Given__Group__6__Impl"
    // InternalXCanopus.g:2419:1: rule__Given__Group__6__Impl : ( RULE_MONITOR_TEXT ) ;
    public final void rule__Given__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2423:1: ( ( RULE_MONITOR_TEXT ) )
            // InternalXCanopus.g:2424:1: ( RULE_MONITOR_TEXT )
            {
            // InternalXCanopus.g:2424:1: ( RULE_MONITOR_TEXT )
            // InternalXCanopus.g:2425:2: RULE_MONITOR_TEXT
            {
             before(grammarAccess.getGivenAccess().getMONITOR_TEXTTerminalRuleCall_6()); 
            match(input,RULE_MONITOR_TEXT,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getMONITOR_TEXTTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__Given__Group__6__Impl"


    // $ANTLR start "rule__SCENARIO__Group__0"
    // InternalXCanopus.g:2435:1: rule__SCENARIO__Group__0 : rule__SCENARIO__Group__0__Impl rule__SCENARIO__Group__1 ;
    public final void rule__SCENARIO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2439:1: ( rule__SCENARIO__Group__0__Impl rule__SCENARIO__Group__1 )
            // InternalXCanopus.g:2440:2: rule__SCENARIO__Group__0__Impl rule__SCENARIO__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SCENARIO__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCENARIO__Group__1();

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
    // $ANTLR end "rule__SCENARIO__Group__0"


    // $ANTLR start "rule__SCENARIO__Group__0__Impl"
    // InternalXCanopus.g:2447:1: rule__SCENARIO__Group__0__Impl : ( 'Scenario' ) ;
    public final void rule__SCENARIO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2451:1: ( ( 'Scenario' ) )
            // InternalXCanopus.g:2452:1: ( 'Scenario' )
            {
            // InternalXCanopus.g:2452:1: ( 'Scenario' )
            // InternalXCanopus.g:2453:2: 'Scenario'
            {
             before(grammarAccess.getSCENARIOAccess().getScenarioKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getSCENARIOAccess().getScenarioKeyword_0()); 

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
    // $ANTLR end "rule__SCENARIO__Group__0__Impl"


    // $ANTLR start "rule__SCENARIO__Group__1"
    // InternalXCanopus.g:2462:1: rule__SCENARIO__Group__1 : rule__SCENARIO__Group__1__Impl rule__SCENARIO__Group__2 ;
    public final void rule__SCENARIO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2466:1: ( rule__SCENARIO__Group__1__Impl rule__SCENARIO__Group__2 )
            // InternalXCanopus.g:2467:2: rule__SCENARIO__Group__1__Impl rule__SCENARIO__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SCENARIO__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCENARIO__Group__2();

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
    // $ANTLR end "rule__SCENARIO__Group__1"


    // $ANTLR start "rule__SCENARIO__Group__1__Impl"
    // InternalXCanopus.g:2474:1: rule__SCENARIO__Group__1__Impl : ( '{' ) ;
    public final void rule__SCENARIO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2478:1: ( ( '{' ) )
            // InternalXCanopus.g:2479:1: ( '{' )
            {
            // InternalXCanopus.g:2479:1: ( '{' )
            // InternalXCanopus.g:2480:2: '{'
            {
             before(grammarAccess.getSCENARIOAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSCENARIOAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__SCENARIO__Group__1__Impl"


    // $ANTLR start "rule__SCENARIO__Group__2"
    // InternalXCanopus.g:2489:1: rule__SCENARIO__Group__2 : rule__SCENARIO__Group__2__Impl rule__SCENARIO__Group__3 ;
    public final void rule__SCENARIO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2493:1: ( rule__SCENARIO__Group__2__Impl rule__SCENARIO__Group__3 )
            // InternalXCanopus.g:2494:2: rule__SCENARIO__Group__2__Impl rule__SCENARIO__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SCENARIO__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCENARIO__Group__3();

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
    // $ANTLR end "rule__SCENARIO__Group__2"


    // $ANTLR start "rule__SCENARIO__Group__2__Impl"
    // InternalXCanopus.g:2501:1: rule__SCENARIO__Group__2__Impl : ( ( rule__SCENARIO__NameAssignment_2 ) ) ;
    public final void rule__SCENARIO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2505:1: ( ( ( rule__SCENARIO__NameAssignment_2 ) ) )
            // InternalXCanopus.g:2506:1: ( ( rule__SCENARIO__NameAssignment_2 ) )
            {
            // InternalXCanopus.g:2506:1: ( ( rule__SCENARIO__NameAssignment_2 ) )
            // InternalXCanopus.g:2507:2: ( rule__SCENARIO__NameAssignment_2 )
            {
             before(grammarAccess.getSCENARIOAccess().getNameAssignment_2()); 
            // InternalXCanopus.g:2508:2: ( rule__SCENARIO__NameAssignment_2 )
            // InternalXCanopus.g:2508:3: rule__SCENARIO__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SCENARIO__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSCENARIOAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SCENARIO__Group__2__Impl"


    // $ANTLR start "rule__SCENARIO__Group__3"
    // InternalXCanopus.g:2516:1: rule__SCENARIO__Group__3 : rule__SCENARIO__Group__3__Impl ;
    public final void rule__SCENARIO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2520:1: ( rule__SCENARIO__Group__3__Impl )
            // InternalXCanopus.g:2521:2: rule__SCENARIO__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SCENARIO__Group__3__Impl();

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
    // $ANTLR end "rule__SCENARIO__Group__3"


    // $ANTLR start "rule__SCENARIO__Group__3__Impl"
    // InternalXCanopus.g:2527:1: rule__SCENARIO__Group__3__Impl : ( '}' ) ;
    public final void rule__SCENARIO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2531:1: ( ( '}' ) )
            // InternalXCanopus.g:2532:1: ( '}' )
            {
            // InternalXCanopus.g:2532:1: ( '}' )
            // InternalXCanopus.g:2533:2: '}'
            {
             before(grammarAccess.getSCENARIOAccess().getRightCurlyBracketKeyword_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSCENARIOAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SCENARIO__Group__3__Impl"


    // $ANTLR start "rule__SUT__Group__0"
    // InternalXCanopus.g:2543:1: rule__SUT__Group__0 : rule__SUT__Group__0__Impl rule__SUT__Group__1 ;
    public final void rule__SUT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2547:1: ( rule__SUT__Group__0__Impl rule__SUT__Group__1 )
            // InternalXCanopus.g:2548:2: rule__SUT__Group__0__Impl rule__SUT__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__SUT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUT__Group__1();

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
    // $ANTLR end "rule__SUT__Group__0"


    // $ANTLR start "rule__SUT__Group__0__Impl"
    // InternalXCanopus.g:2555:1: rule__SUT__Group__0__Impl : ( () ) ;
    public final void rule__SUT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2559:1: ( ( () ) )
            // InternalXCanopus.g:2560:1: ( () )
            {
            // InternalXCanopus.g:2560:1: ( () )
            // InternalXCanopus.g:2561:2: ()
            {
             before(grammarAccess.getSUTAccess().getSUTAction_0()); 
            // InternalXCanopus.g:2562:2: ()
            // InternalXCanopus.g:2562:3: 
            {
            }

             after(grammarAccess.getSUTAccess().getSUTAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUT__Group__0__Impl"


    // $ANTLR start "rule__SUT__Group__1"
    // InternalXCanopus.g:2570:1: rule__SUT__Group__1 : rule__SUT__Group__1__Impl rule__SUT__Group__2 ;
    public final void rule__SUT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2574:1: ( rule__SUT__Group__1__Impl rule__SUT__Group__2 )
            // InternalXCanopus.g:2575:2: rule__SUT__Group__1__Impl rule__SUT__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SUT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUT__Group__2();

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
    // $ANTLR end "rule__SUT__Group__1"


    // $ANTLR start "rule__SUT__Group__1__Impl"
    // InternalXCanopus.g:2582:1: rule__SUT__Group__1__Impl : ( 'SUT' ) ;
    public final void rule__SUT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2586:1: ( ( 'SUT' ) )
            // InternalXCanopus.g:2587:1: ( 'SUT' )
            {
            // InternalXCanopus.g:2587:1: ( 'SUT' )
            // InternalXCanopus.g:2588:2: 'SUT'
            {
             before(grammarAccess.getSUTAccess().getSUTKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSUTAccess().getSUTKeyword_1()); 

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
    // $ANTLR end "rule__SUT__Group__1__Impl"


    // $ANTLR start "rule__SUT__Group__2"
    // InternalXCanopus.g:2597:1: rule__SUT__Group__2 : rule__SUT__Group__2__Impl rule__SUT__Group__3 ;
    public final void rule__SUT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2601:1: ( rule__SUT__Group__2__Impl rule__SUT__Group__3 )
            // InternalXCanopus.g:2602:2: rule__SUT__Group__2__Impl rule__SUT__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SUT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUT__Group__3();

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
    // $ANTLR end "rule__SUT__Group__2"


    // $ANTLR start "rule__SUT__Group__2__Impl"
    // InternalXCanopus.g:2609:1: rule__SUT__Group__2__Impl : ( '{' ) ;
    public final void rule__SUT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2613:1: ( ( '{' ) )
            // InternalXCanopus.g:2614:1: ( '{' )
            {
            // InternalXCanopus.g:2614:1: ( '{' )
            // InternalXCanopus.g:2615:2: '{'
            {
             before(grammarAccess.getSUTAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSUTAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SUT__Group__2__Impl"


    // $ANTLR start "rule__SUT__Group__3"
    // InternalXCanopus.g:2624:1: rule__SUT__Group__3 : rule__SUT__Group__3__Impl rule__SUT__Group__4 ;
    public final void rule__SUT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2628:1: ( rule__SUT__Group__3__Impl rule__SUT__Group__4 )
            // InternalXCanopus.g:2629:2: rule__SUT__Group__3__Impl rule__SUT__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SUT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SUT__Group__4();

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
    // $ANTLR end "rule__SUT__Group__3"


    // $ANTLR start "rule__SUT__Group__3__Impl"
    // InternalXCanopus.g:2636:1: rule__SUT__Group__3__Impl : ( ( rule__SUT__NameAssignment_3 ) ) ;
    public final void rule__SUT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2640:1: ( ( ( rule__SUT__NameAssignment_3 ) ) )
            // InternalXCanopus.g:2641:1: ( ( rule__SUT__NameAssignment_3 ) )
            {
            // InternalXCanopus.g:2641:1: ( ( rule__SUT__NameAssignment_3 ) )
            // InternalXCanopus.g:2642:2: ( rule__SUT__NameAssignment_3 )
            {
             before(grammarAccess.getSUTAccess().getNameAssignment_3()); 
            // InternalXCanopus.g:2643:2: ( rule__SUT__NameAssignment_3 )
            // InternalXCanopus.g:2643:3: rule__SUT__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SUT__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSUTAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__SUT__Group__3__Impl"


    // $ANTLR start "rule__SUT__Group__4"
    // InternalXCanopus.g:2651:1: rule__SUT__Group__4 : rule__SUT__Group__4__Impl ;
    public final void rule__SUT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2655:1: ( rule__SUT__Group__4__Impl )
            // InternalXCanopus.g:2656:2: rule__SUT__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SUT__Group__4__Impl();

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
    // $ANTLR end "rule__SUT__Group__4"


    // $ANTLR start "rule__SUT__Group__4__Impl"
    // InternalXCanopus.g:2662:1: rule__SUT__Group__4__Impl : ( '}' ) ;
    public final void rule__SUT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2666:1: ( ( '}' ) )
            // InternalXCanopus.g:2667:1: ( '}' )
            {
            // InternalXCanopus.g:2667:1: ( '}' )
            // InternalXCanopus.g:2668:2: '}'
            {
             before(grammarAccess.getSUTAccess().getRightCurlyBracketKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSUTAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SUT__Group__4__Impl"


    // $ANTLR start "rule__Model__MainAssignment"
    // InternalXCanopus.g:2678:1: rule__Model__MainAssignment : ( ruleMain ) ;
    public final void rule__Model__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2682:1: ( ( ruleMain ) )
            // InternalXCanopus.g:2683:2: ( ruleMain )
            {
            // InternalXCanopus.g:2683:2: ( ruleMain )
            // InternalXCanopus.g:2684:3: ruleMain
            {
             before(grammarAccess.getModelAccess().getMainMainParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMainMainParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__MainAssignment"


    // $ANTLR start "rule__MetricModel__NameAssignment_4"
    // InternalXCanopus.g:2693:1: rule__MetricModel__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__MetricModel__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2697:1: ( ( RULE_ID ) )
            // InternalXCanopus.g:2698:2: ( RULE_ID )
            {
            // InternalXCanopus.g:2698:2: ( RULE_ID )
            // InternalXCanopus.g:2699:3: RULE_ID
            {
             before(grammarAccess.getMetricModelAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetricModelAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__MetricModel__NameAssignment_4"


    // $ANTLR start "rule__MetricModel__StepsAssignment_9"
    // InternalXCanopus.g:2708:1: rule__MetricModel__StepsAssignment_9 : ( ruleSTEPS ) ;
    public final void rule__MetricModel__StepsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2712:1: ( ( ruleSTEPS ) )
            // InternalXCanopus.g:2713:2: ( ruleSTEPS )
            {
            // InternalXCanopus.g:2713:2: ( ruleSTEPS )
            // InternalXCanopus.g:2714:3: ruleSTEPS
            {
             before(grammarAccess.getMetricModelAccess().getStepsSTEPSParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSTEPS();

            state._fsp--;

             after(grammarAccess.getMetricModelAccess().getStepsSTEPSParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__MetricModel__StepsAssignment_9"


    // $ANTLR start "rule__Main__MainAssignment"
    // InternalXCanopus.g:2723:1: rule__Main__MainAssignment : ( ( rule__Main__MainAlternatives_0 ) ) ;
    public final void rule__Main__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2727:1: ( ( ( rule__Main__MainAlternatives_0 ) ) )
            // InternalXCanopus.g:2728:2: ( ( rule__Main__MainAlternatives_0 ) )
            {
            // InternalXCanopus.g:2728:2: ( ( rule__Main__MainAlternatives_0 ) )
            // InternalXCanopus.g:2729:3: ( rule__Main__MainAlternatives_0 )
            {
             before(grammarAccess.getMainAccess().getMainAlternatives_0()); 
            // InternalXCanopus.g:2730:3: ( rule__Main__MainAlternatives_0 )
            // InternalXCanopus.g:2730:4: rule__Main__MainAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__MainAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getMainAlternatives_0()); 

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
    // $ANTLR end "rule__Main__MainAssignment"


    // $ANTLR start "rule__And_workload__Sut1Assignment_2"
    // InternalXCanopus.g:2738:1: rule__And_workload__Sut1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__And_workload__Sut1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2742:1: ( ( ( RULE_ID ) ) )
            // InternalXCanopus.g:2743:2: ( ( RULE_ID ) )
            {
            // InternalXCanopus.g:2743:2: ( ( RULE_ID ) )
            // InternalXCanopus.g:2744:3: ( RULE_ID )
            {
             before(grammarAccess.getAnd_workloadAccess().getSut1SUTCrossReference_2_0()); 
            // InternalXCanopus.g:2745:3: ( RULE_ID )
            // InternalXCanopus.g:2746:4: RULE_ID
            {
             before(grammarAccess.getAnd_workloadAccess().getSut1SUTIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnd_workloadAccess().getSut1SUTIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAnd_workloadAccess().getSut1SUTCrossReference_2_0()); 

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
    // $ANTLR end "rule__And_workload__Sut1Assignment_2"


    // $ANTLR start "rule__And_workload__SuttypeAssignment_4"
    // InternalXCanopus.g:2757:1: rule__And_workload__SuttypeAssignment_4 : ( ruleSUT_TYPE ) ;
    public final void rule__And_workload__SuttypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2761:1: ( ( ruleSUT_TYPE ) )
            // InternalXCanopus.g:2762:2: ( ruleSUT_TYPE )
            {
            // InternalXCanopus.g:2762:2: ( ruleSUT_TYPE )
            // InternalXCanopus.g:2763:3: ruleSUT_TYPE
            {
             before(grammarAccess.getAnd_workloadAccess().getSuttypeSUT_TYPEEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSUT_TYPE();

            state._fsp--;

             after(grammarAccess.getAnd_workloadAccess().getSuttypeSUT_TYPEEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__And_workload__SuttypeAssignment_4"


    // $ANTLR start "rule__And_workload__Sut2Assignment_6"
    // InternalXCanopus.g:2772:1: rule__And_workload__Sut2Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__And_workload__Sut2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2776:1: ( ( ( RULE_ID ) ) )
            // InternalXCanopus.g:2777:2: ( ( RULE_ID ) )
            {
            // InternalXCanopus.g:2777:2: ( ( RULE_ID ) )
            // InternalXCanopus.g:2778:3: ( RULE_ID )
            {
             before(grammarAccess.getAnd_workloadAccess().getSut2SUTCrossReference_6_0()); 
            // InternalXCanopus.g:2779:3: ( RULE_ID )
            // InternalXCanopus.g:2780:4: RULE_ID
            {
             before(grammarAccess.getAnd_workloadAccess().getSut2SUTIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnd_workloadAccess().getSut2SUTIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAnd_workloadAccess().getSut2SUTCrossReference_6_0()); 

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
    // $ANTLR end "rule__And_workload__Sut2Assignment_6"


    // $ANTLR start "rule__And_the_scenario__ScenarioAssignment_2"
    // InternalXCanopus.g:2791:1: rule__And_the_scenario__ScenarioAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__And_the_scenario__ScenarioAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2795:1: ( ( ( RULE_ID ) ) )
            // InternalXCanopus.g:2796:2: ( ( RULE_ID ) )
            {
            // InternalXCanopus.g:2796:2: ( ( RULE_ID ) )
            // InternalXCanopus.g:2797:3: ( RULE_ID )
            {
             before(grammarAccess.getAnd_the_scenarioAccess().getScenarioSCENARIOCrossReference_2_0()); 
            // InternalXCanopus.g:2798:3: ( RULE_ID )
            // InternalXCanopus.g:2799:4: RULE_ID
            {
             before(grammarAccess.getAnd_the_scenarioAccess().getScenarioSCENARIOIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnd_the_scenarioAccess().getScenarioSCENARIOIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAnd_the_scenarioAccess().getScenarioSCENARIOCrossReference_2_0()); 

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
    // $ANTLR end "rule__And_the_scenario__ScenarioAssignment_2"


    // $ANTLR start "rule__And_atleast__Integer1Assignment_2"
    // InternalXCanopus.g:2810:1: rule__And_atleast__Integer1Assignment_2 : ( RULE_INT ) ;
    public final void rule__And_atleast__Integer1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2814:1: ( ( RULE_INT ) )
            // InternalXCanopus.g:2815:2: ( RULE_INT )
            {
            // InternalXCanopus.g:2815:2: ( RULE_INT )
            // InternalXCanopus.g:2816:3: RULE_INT
            {
             before(grammarAccess.getAnd_atleastAccess().getInteger1INTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAnd_atleastAccess().getInteger1INTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__And_atleast__Integer1Assignment_2"


    // $ANTLR start "rule__And_atleast__Integer2Assignment_4"
    // InternalXCanopus.g:2825:1: rule__And_atleast__Integer2Assignment_4 : ( RULE_INT ) ;
    public final void rule__And_atleast__Integer2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2829:1: ( ( RULE_INT ) )
            // InternalXCanopus.g:2830:2: ( RULE_INT )
            {
            // InternalXCanopus.g:2830:2: ( RULE_INT )
            // InternalXCanopus.g:2831:3: RULE_INT
            {
             before(grammarAccess.getAnd_atleastAccess().getInteger2INTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAnd_atleastAccess().getInteger2INTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__And_atleast__Integer2Assignment_4"


    // $ANTLR start "rule__And_the_metric__MetricAssignment_2"
    // InternalXCanopus.g:2840:1: rule__And_the_metric__MetricAssignment_2 : ( ruleMETRICTYPE ) ;
    public final void rule__And_the_metric__MetricAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2844:1: ( ( ruleMETRICTYPE ) )
            // InternalXCanopus.g:2845:2: ( ruleMETRICTYPE )
            {
            // InternalXCanopus.g:2845:2: ( ruleMETRICTYPE )
            // InternalXCanopus.g:2846:3: ruleMETRICTYPE
            {
             before(grammarAccess.getAnd_the_metricAccess().getMetricMETRICTYPEEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMETRICTYPE();

            state._fsp--;

             after(grammarAccess.getAnd_the_metricAccess().getMetricMETRICTYPEEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__And_the_metric__MetricAssignment_2"


    // $ANTLR start "rule__And_the_metric__Integer1Assignment_4"
    // InternalXCanopus.g:2855:1: rule__And_the_metric__Integer1Assignment_4 : ( RULE_INT ) ;
    public final void rule__And_the_metric__Integer1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2859:1: ( ( RULE_INT ) )
            // InternalXCanopus.g:2860:2: ( RULE_INT )
            {
            // InternalXCanopus.g:2860:2: ( RULE_INT )
            // InternalXCanopus.g:2861:3: RULE_INT
            {
             before(grammarAccess.getAnd_the_metricAccess().getInteger1INTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAnd_the_metricAccess().getInteger1INTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__And_the_metric__Integer1Assignment_4"


    // $ANTLR start "rule__And_the_metric__Integer2Assignment_6"
    // InternalXCanopus.g:2870:1: rule__And_the_metric__Integer2Assignment_6 : ( RULE_INT ) ;
    public final void rule__And_the_metric__Integer2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2874:1: ( ( RULE_INT ) )
            // InternalXCanopus.g:2875:2: ( RULE_INT )
            {
            // InternalXCanopus.g:2875:2: ( RULE_INT )
            // InternalXCanopus.g:2876:3: RULE_INT
            {
             before(grammarAccess.getAnd_the_metricAccess().getInteger2INTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAnd_the_metricAccess().getInteger2INTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__And_the_metric__Integer2Assignment_6"


    // $ANTLR start "rule__And_the_metric__Integer3Assignment_7_1"
    // InternalXCanopus.g:2885:1: rule__And_the_metric__Integer3Assignment_7_1 : ( RULE_INT ) ;
    public final void rule__And_the_metric__Integer3Assignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2889:1: ( ( RULE_INT ) )
            // InternalXCanopus.g:2890:2: ( RULE_INT )
            {
            // InternalXCanopus.g:2890:2: ( RULE_INT )
            // InternalXCanopus.g:2891:3: RULE_INT
            {
             before(grammarAccess.getAnd_the_metricAccess().getInteger3INTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAnd_the_metricAccess().getInteger3INTTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__And_the_metric__Integer3Assignment_7_1"


    // $ANTLR start "rule__When__MetrictypeAssignment_2"
    // InternalXCanopus.g:2900:1: rule__When__MetrictypeAssignment_2 : ( ruleMETRICTYPEMONITORED ) ;
    public final void rule__When__MetrictypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2904:1: ( ( ruleMETRICTYPEMONITORED ) )
            // InternalXCanopus.g:2905:2: ( ruleMETRICTYPEMONITORED )
            {
            // InternalXCanopus.g:2905:2: ( ruleMETRICTYPEMONITORED )
            // InternalXCanopus.g:2906:3: ruleMETRICTYPEMONITORED
            {
             before(grammarAccess.getWhenAccess().getMetrictypeMETRICTYPEMONITOREDEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMETRICTYPEMONITORED();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getMetrictypeMETRICTYPEMONITOREDEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__When__MetrictypeAssignment_2"


    // $ANTLR start "rule__Then__MetricAssignment_2"
    // InternalXCanopus.g:2915:1: rule__Then__MetricAssignment_2 : ( ruleMETRICTYPE ) ;
    public final void rule__Then__MetricAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2919:1: ( ( ruleMETRICTYPE ) )
            // InternalXCanopus.g:2920:2: ( ruleMETRICTYPE )
            {
            // InternalXCanopus.g:2920:2: ( ruleMETRICTYPE )
            // InternalXCanopus.g:2921:3: ruleMETRICTYPE
            {
             before(grammarAccess.getThenAccess().getMetricMETRICTYPEEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMETRICTYPE();

            state._fsp--;

             after(grammarAccess.getThenAccess().getMetricMETRICTYPEEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Then__MetricAssignment_2"


    // $ANTLR start "rule__Then__Integer1Assignment_4"
    // InternalXCanopus.g:2930:1: rule__Then__Integer1Assignment_4 : ( RULE_INT ) ;
    public final void rule__Then__Integer1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2934:1: ( ( RULE_INT ) )
            // InternalXCanopus.g:2935:2: ( RULE_INT )
            {
            // InternalXCanopus.g:2935:2: ( RULE_INT )
            // InternalXCanopus.g:2936:3: RULE_INT
            {
             before(grammarAccess.getThenAccess().getInteger1INTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getInteger1INTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Then__Integer1Assignment_4"


    // $ANTLR start "rule__Then__Integer2Assignment_6"
    // InternalXCanopus.g:2945:1: rule__Then__Integer2Assignment_6 : ( RULE_INT ) ;
    public final void rule__Then__Integer2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2949:1: ( ( RULE_INT ) )
            // InternalXCanopus.g:2950:2: ( RULE_INT )
            {
            // InternalXCanopus.g:2950:2: ( RULE_INT )
            // InternalXCanopus.g:2951:3: RULE_INT
            {
             before(grammarAccess.getThenAccess().getInteger2INTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getInteger2INTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Then__Integer2Assignment_6"


    // $ANTLR start "rule__Then__Integer3Assignment_7_1"
    // InternalXCanopus.g:2960:1: rule__Then__Integer3Assignment_7_1 : ( RULE_INT ) ;
    public final void rule__Then__Integer3Assignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2964:1: ( ( RULE_INT ) )
            // InternalXCanopus.g:2965:2: ( RULE_INT )
            {
            // InternalXCanopus.g:2965:2: ( RULE_INT )
            // InternalXCanopus.g:2966:3: RULE_INT
            {
             before(grammarAccess.getThenAccess().getInteger3INTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getInteger3INTTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Then__Integer3Assignment_7_1"


    // $ANTLR start "rule__Given__Sut1Assignment_2"
    // InternalXCanopus.g:2975:1: rule__Given__Sut1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Given__Sut1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2979:1: ( ( ( RULE_ID ) ) )
            // InternalXCanopus.g:2980:2: ( ( RULE_ID ) )
            {
            // InternalXCanopus.g:2980:2: ( ( RULE_ID ) )
            // InternalXCanopus.g:2981:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenAccess().getSut1SUTCrossReference_2_0()); 
            // InternalXCanopus.g:2982:3: ( RULE_ID )
            // InternalXCanopus.g:2983:4: RULE_ID
            {
             before(grammarAccess.getGivenAccess().getSut1SUTIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getSut1SUTIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getGivenAccess().getSut1SUTCrossReference_2_0()); 

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
    // $ANTLR end "rule__Given__Sut1Assignment_2"


    // $ANTLR start "rule__Given__SuttypeAssignment_3"
    // InternalXCanopus.g:2994:1: rule__Given__SuttypeAssignment_3 : ( ruleSUT_TYPE ) ;
    public final void rule__Given__SuttypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:2998:1: ( ( ruleSUT_TYPE ) )
            // InternalXCanopus.g:2999:2: ( ruleSUT_TYPE )
            {
            // InternalXCanopus.g:2999:2: ( ruleSUT_TYPE )
            // InternalXCanopus.g:3000:3: ruleSUT_TYPE
            {
             before(grammarAccess.getGivenAccess().getSuttypeSUT_TYPEEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSUT_TYPE();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getSuttypeSUT_TYPEEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Given__SuttypeAssignment_3"


    // $ANTLR start "rule__Given__Sut2Assignment_5"
    // InternalXCanopus.g:3009:1: rule__Given__Sut2Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Given__Sut2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:3013:1: ( ( ( RULE_ID ) ) )
            // InternalXCanopus.g:3014:2: ( ( RULE_ID ) )
            {
            // InternalXCanopus.g:3014:2: ( ( RULE_ID ) )
            // InternalXCanopus.g:3015:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenAccess().getSut2SUTCrossReference_5_0()); 
            // InternalXCanopus.g:3016:3: ( RULE_ID )
            // InternalXCanopus.g:3017:4: RULE_ID
            {
             before(grammarAccess.getGivenAccess().getSut2SUTIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getSut2SUTIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getGivenAccess().getSut2SUTCrossReference_5_0()); 

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
    // $ANTLR end "rule__Given__Sut2Assignment_5"


    // $ANTLR start "rule__SCENARIO__NameAssignment_2"
    // InternalXCanopus.g:3028:1: rule__SCENARIO__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SCENARIO__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:3032:1: ( ( RULE_ID ) )
            // InternalXCanopus.g:3033:2: ( RULE_ID )
            {
            // InternalXCanopus.g:3033:2: ( RULE_ID )
            // InternalXCanopus.g:3034:3: RULE_ID
            {
             before(grammarAccess.getSCENARIOAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSCENARIOAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SCENARIO__NameAssignment_2"


    // $ANTLR start "rule__SUT__NameAssignment_3"
    // InternalXCanopus.g:3043:1: rule__SUT__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SUT__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXCanopus.g:3047:1: ( ( RULE_ID ) )
            // InternalXCanopus.g:3048:2: ( RULE_ID )
            {
            // InternalXCanopus.g:3048:2: ( RULE_ID )
            // InternalXCanopus.g:3049:3: RULE_ID
            {
             before(grammarAccess.getSUTAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSUTAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SUT__NameAssignment_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\72\3\uffff\1\22\1\uffff\1\21\3\uffff";
    static final String dfa_3s = "\1\75\3\uffff\1\27\1\uffff\1\57\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\uffff\1\5\1\7\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\2\1\3\1\1",
            "",
            "",
            "",
            "\1\5\2\uffff\1\6\1\uffff\1\7",
            "",
            "\1\11\27\uffff\7\10",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "502:1: rule__STEPS__Alternatives : ( ( rulegiven ) | ( rulewhen ) | ( rulethen ) | ( ruleand_workload ) | ( ruleand_atleast ) | ( ruleand_the_scenario ) | ( ruleand_the_metric ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xC010000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xC010000000000000L});

}