package org.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.ScenarioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScenarioParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OurObject'", "'standAlone'", "'searchObjective'", "'sequentialScheduling'", "'Capability'", "'{'", "'reuse'", "'accumulation'", "'startDate'", "'endDate'", "'decomposes'", "'('", "','", "')'", "'satisfiedBy'", "'}'", "'CapabilityProvision'", "'Value'", "'<'", "'>'", "'Component'", "'RunConfiguration'", "'popSize'", "'genCount'", "'FindTradeOffs'", "'ThroughLifePlanning'", "'-'", "'Measurement'", "'criticalValue'", "'benchmarkValue'", "'providedValue'", "'criticalValues'", "'benchmarkValues'", "'providedValues'", "'script'", "'.'", "'E'", "'e'", "'CapabilityUpgrade'", "'targetComponent'", "'upgrading'", "'Cost'", "'startAfter'", "'repeatDuration'", "'stopAfter'", "'CapabilityChange'", "'ExistingComponent'", "'AcquirableComponent'", "'acquisitionTime'", "'lifeSpan'", "'Constraint'", "'DesireHigh'", "'DesireLow'", "'Budget'", "'amount'"
    };
    public static final int RULE_ID=5;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalScenarioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScenarioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScenarioParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g"; }



     	private ScenarioGrammarAccess grammarAccess;
     	
        public InternalScenarioParser(TokenStream input, ScenarioGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Scenario";	
       	}
       	
       	@Override
       	protected ScenarioGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScenario"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:67:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:68:2: (iv_ruleScenario= ruleScenario EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:69:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleScenario_in_entryRuleScenario75);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleScenario85); 

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
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:76:1: ruleScenario returns [EObject current=null] : ( () ( ( (lv_OurObjects_1_0= ruleOurObject ) ) ( (lv_OurObjects_2_0= ruleOurObject ) )* )? ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        EObject lv_OurObjects_1_0 = null;

        EObject lv_OurObjects_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:79:28: ( ( () ( ( (lv_OurObjects_1_0= ruleOurObject ) ) ( (lv_OurObjects_2_0= ruleOurObject ) )* )? ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:80:1: ( () ( ( (lv_OurObjects_1_0= ruleOurObject ) ) ( (lv_OurObjects_2_0= ruleOurObject ) )* )? )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:80:1: ( () ( ( (lv_OurObjects_1_0= ruleOurObject ) ) ( (lv_OurObjects_2_0= ruleOurObject ) )* )? )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:80:2: () ( ( (lv_OurObjects_1_0= ruleOurObject ) ) ( (lv_OurObjects_2_0= ruleOurObject ) )* )?
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:80:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getScenarioAccess().getScenarioAction_0(),
                        current);
                

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:86:2: ( ( (lv_OurObjects_1_0= ruleOurObject ) ) ( (lv_OurObjects_2_0= ruleOurObject ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=15)||(LA2_0>=27 && LA2_0<=28)||(LA2_0>=31 && LA2_0<=32)||(LA2_0>=35 && LA2_0<=36)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:86:3: ( (lv_OurObjects_1_0= ruleOurObject ) ) ( (lv_OurObjects_2_0= ruleOurObject ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:86:3: ( (lv_OurObjects_1_0= ruleOurObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:87:1: (lv_OurObjects_1_0= ruleOurObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:87:1: (lv_OurObjects_1_0= ruleOurObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:88:3: lv_OurObjects_1_0= ruleOurObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getScenarioAccess().getOurObjectsOurObjectParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOurObject_in_ruleScenario141);
                    lv_OurObjects_1_0=ruleOurObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	        }
                           		add(
                           			current, 
                           			"OurObjects",
                            		lv_OurObjects_1_0, 
                            		"OurObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:104:2: ( (lv_OurObjects_2_0= ruleOurObject ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=11 && LA1_0<=15)||(LA1_0>=27 && LA1_0<=28)||(LA1_0>=31 && LA1_0<=32)||(LA1_0>=35 && LA1_0<=36)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:105:1: (lv_OurObjects_2_0= ruleOurObject )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:105:1: (lv_OurObjects_2_0= ruleOurObject )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:106:3: lv_OurObjects_2_0= ruleOurObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getScenarioAccess().getOurObjectsOurObjectParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOurObject_in_ruleScenario162);
                    	    lv_OurObjects_2_0=ruleOurObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getScenarioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"OurObjects",
                    	            		lv_OurObjects_2_0, 
                    	            		"OurObject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleOurObject"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:130:1: entryRuleOurObject returns [EObject current=null] : iv_ruleOurObject= ruleOurObject EOF ;
    public final EObject entryRuleOurObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOurObject = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:131:2: (iv_ruleOurObject= ruleOurObject EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:132:2: iv_ruleOurObject= ruleOurObject EOF
            {
             newCompositeNode(grammarAccess.getOurObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOurObject_in_entryRuleOurObject201);
            iv_ruleOurObject=ruleOurObject();

            state._fsp--;

             current =iv_ruleOurObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOurObject211); 

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
    // $ANTLR end "entryRuleOurObject"


    // $ANTLR start "ruleOurObject"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:139:1: ruleOurObject returns [EObject current=null] : (this_OurObject_Impl_0= ruleOurObject_Impl | this_Capability_Impl_1= ruleCapability_Impl | this_CapabilityProvision_2= ruleCapabilityProvision | this_QualitativeValueDictionary_3= ruleQualitativeValueDictionary | this_Component_4= ruleComponent | this_RunConfiguration_Impl_5= ruleRunConfiguration_Impl | this_FindTradeOffs_6= ruleFindTradeOffs | this_ThroughLifePlanning_7= ruleThroughLifePlanning ) ;
    public final EObject ruleOurObject() throws RecognitionException {
        EObject current = null;

        EObject this_OurObject_Impl_0 = null;

        EObject this_Capability_Impl_1 = null;

        EObject this_CapabilityProvision_2 = null;

        EObject this_QualitativeValueDictionary_3 = null;

        EObject this_Component_4 = null;

        EObject this_RunConfiguration_Impl_5 = null;

        EObject this_FindTradeOffs_6 = null;

        EObject this_ThroughLifePlanning_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:142:28: ( (this_OurObject_Impl_0= ruleOurObject_Impl | this_Capability_Impl_1= ruleCapability_Impl | this_CapabilityProvision_2= ruleCapabilityProvision | this_QualitativeValueDictionary_3= ruleQualitativeValueDictionary | this_Component_4= ruleComponent | this_RunConfiguration_Impl_5= ruleRunConfiguration_Impl | this_FindTradeOffs_6= ruleFindTradeOffs | this_ThroughLifePlanning_7= ruleThroughLifePlanning ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:143:1: (this_OurObject_Impl_0= ruleOurObject_Impl | this_Capability_Impl_1= ruleCapability_Impl | this_CapabilityProvision_2= ruleCapabilityProvision | this_QualitativeValueDictionary_3= ruleQualitativeValueDictionary | this_Component_4= ruleComponent | this_RunConfiguration_Impl_5= ruleRunConfiguration_Impl | this_FindTradeOffs_6= ruleFindTradeOffs | this_ThroughLifePlanning_7= ruleThroughLifePlanning )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:143:1: (this_OurObject_Impl_0= ruleOurObject_Impl | this_Capability_Impl_1= ruleCapability_Impl | this_CapabilityProvision_2= ruleCapabilityProvision | this_QualitativeValueDictionary_3= ruleQualitativeValueDictionary | this_Component_4= ruleComponent | this_RunConfiguration_Impl_5= ruleRunConfiguration_Impl | this_FindTradeOffs_6= ruleFindTradeOffs | this_ThroughLifePlanning_7= ruleThroughLifePlanning )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:144:5: this_OurObject_Impl_0= ruleOurObject_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getOurObjectAccess().getOurObject_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOurObject_Impl_in_ruleOurObject258);
                    this_OurObject_Impl_0=ruleOurObject_Impl();

                    state._fsp--;

                     
                            current = this_OurObject_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:154:5: this_Capability_Impl_1= ruleCapability_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getOurObjectAccess().getCapability_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCapability_Impl_in_ruleOurObject285);
                    this_Capability_Impl_1=ruleCapability_Impl();

                    state._fsp--;

                     
                            current = this_Capability_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:164:5: this_CapabilityProvision_2= ruleCapabilityProvision
                    {
                     
                            newCompositeNode(grammarAccess.getOurObjectAccess().getCapabilityProvisionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCapabilityProvision_in_ruleOurObject312);
                    this_CapabilityProvision_2=ruleCapabilityProvision();

                    state._fsp--;

                     
                            current = this_CapabilityProvision_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:174:5: this_QualitativeValueDictionary_3= ruleQualitativeValueDictionary
                    {
                     
                            newCompositeNode(grammarAccess.getOurObjectAccess().getQualitativeValueDictionaryParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQualitativeValueDictionary_in_ruleOurObject339);
                    this_QualitativeValueDictionary_3=ruleQualitativeValueDictionary();

                    state._fsp--;

                     
                            current = this_QualitativeValueDictionary_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:184:5: this_Component_4= ruleComponent
                    {
                     
                            newCompositeNode(grammarAccess.getOurObjectAccess().getComponentParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComponent_in_ruleOurObject366);
                    this_Component_4=ruleComponent();

                    state._fsp--;

                     
                            current = this_Component_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:194:5: this_RunConfiguration_Impl_5= ruleRunConfiguration_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getOurObjectAccess().getRunConfiguration_ImplParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRunConfiguration_Impl_in_ruleOurObject393);
                    this_RunConfiguration_Impl_5=ruleRunConfiguration_Impl();

                    state._fsp--;

                     
                            current = this_RunConfiguration_Impl_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:204:5: this_FindTradeOffs_6= ruleFindTradeOffs
                    {
                     
                            newCompositeNode(grammarAccess.getOurObjectAccess().getFindTradeOffsParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFindTradeOffs_in_ruleOurObject420);
                    this_FindTradeOffs_6=ruleFindTradeOffs();

                    state._fsp--;

                     
                            current = this_FindTradeOffs_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:214:5: this_ThroughLifePlanning_7= ruleThroughLifePlanning
                    {
                     
                            newCompositeNode(grammarAccess.getOurObjectAccess().getThroughLifePlanningParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleThroughLifePlanning_in_ruleOurObject447);
                    this_ThroughLifePlanning_7=ruleThroughLifePlanning();

                    state._fsp--;

                     
                            current = this_ThroughLifePlanning_7; 
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
    // $ANTLR end "ruleOurObject"


    // $ANTLR start "entryRuleCapability"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:230:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:231:2: (iv_ruleCapability= ruleCapability EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:232:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapability_in_entryRuleCapability482);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCapability492); 

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
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:239:1: ruleCapability returns [EObject current=null] : (this_Capability_Impl_0= ruleCapability_Impl | this_CapabilityProvision_1= ruleCapabilityProvision ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        EObject this_Capability_Impl_0 = null;

        EObject this_CapabilityProvision_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:242:28: ( (this_Capability_Impl_0= ruleCapability_Impl | this_CapabilityProvision_1= ruleCapabilityProvision ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:243:1: (this_Capability_Impl_0= ruleCapability_Impl | this_CapabilityProvision_1= ruleCapabilityProvision )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:243:1: (this_Capability_Impl_0= ruleCapability_Impl | this_CapabilityProvision_1= ruleCapabilityProvision )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 12:
            case 14:
            case 15:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==27) ) {
                    alt4=2;
                }
                else if ( ((LA4_2>=14 && LA4_2<=15)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:244:5: this_Capability_Impl_0= ruleCapability_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getCapabilityAccess().getCapability_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCapability_Impl_in_ruleCapability539);
                    this_Capability_Impl_0=ruleCapability_Impl();

                    state._fsp--;

                     
                            current = this_Capability_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:254:5: this_CapabilityProvision_1= ruleCapabilityProvision
                    {
                     
                            newCompositeNode(grammarAccess.getCapabilityAccess().getCapabilityProvisionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCapabilityProvision_in_ruleCapability566);
                    this_CapabilityProvision_1=ruleCapabilityProvision();

                    state._fsp--;

                     
                            current = this_CapabilityProvision_1; 
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
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleCost"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:270:1: entryRuleCost returns [EObject current=null] : iv_ruleCost= ruleCost EOF ;
    public final EObject entryRuleCost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCost = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:271:2: (iv_ruleCost= ruleCost EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:272:2: iv_ruleCost= ruleCost EOF
            {
             newCompositeNode(grammarAccess.getCostRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCost_in_entryRuleCost601);
            iv_ruleCost=ruleCost();

            state._fsp--;

             current =iv_ruleCost; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCost611); 

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
    // $ANTLR end "entryRuleCost"


    // $ANTLR start "ruleCost"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:279:1: ruleCost returns [EObject current=null] : this_Cost_Impl_0= ruleCost_Impl ;
    public final EObject ruleCost() throws RecognitionException {
        EObject current = null;

        EObject this_Cost_Impl_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:282:28: (this_Cost_Impl_0= ruleCost_Impl )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:284:5: this_Cost_Impl_0= ruleCost_Impl
            {
             
                    newCompositeNode(grammarAccess.getCostAccess().getCost_ImplParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleCost_Impl_in_ruleCost657);
            this_Cost_Impl_0=ruleCost_Impl();

            state._fsp--;

             
                    current = this_Cost_Impl_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleCost"


    // $ANTLR start "entryRuleComponentU"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:300:1: entryRuleComponentU returns [EObject current=null] : iv_ruleComponentU= ruleComponentU EOF ;
    public final EObject entryRuleComponentU() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentU = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:301:2: (iv_ruleComponentU= ruleComponentU EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:302:2: iv_ruleComponentU= ruleComponentU EOF
            {
             newCompositeNode(grammarAccess.getComponentURule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponentU_in_entryRuleComponentU691);
            iv_ruleComponentU=ruleComponentU();

            state._fsp--;

             current =iv_ruleComponentU; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentU701); 

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
    // $ANTLR end "entryRuleComponentU"


    // $ANTLR start "ruleComponentU"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:309:1: ruleComponentU returns [EObject current=null] : (this_ComponentU_Impl_0= ruleComponentU_Impl | this_ExistingComponent_1= ruleExistingComponent | this_AcquirableComponent_2= ruleAcquirableComponent ) ;
    public final EObject ruleComponentU() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentU_Impl_0 = null;

        EObject this_ExistingComponent_1 = null;

        EObject this_AcquirableComponent_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:312:28: ( (this_ComponentU_Impl_0= ruleComponentU_Impl | this_ExistingComponent_1= ruleExistingComponent | this_AcquirableComponent_2= ruleAcquirableComponent ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:313:1: (this_ComponentU_Impl_0= ruleComponentU_Impl | this_ExistingComponent_1= ruleExistingComponent | this_AcquirableComponent_2= ruleAcquirableComponent )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:313:1: (this_ComponentU_Impl_0= ruleComponentU_Impl | this_ExistingComponent_1= ruleExistingComponent | this_AcquirableComponent_2= ruleAcquirableComponent )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 57:
                {
                alt5=2;
                }
                break;
            case 58:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:314:5: this_ComponentU_Impl_0= ruleComponentU_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getComponentUAccess().getComponentU_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComponentU_Impl_in_ruleComponentU748);
                    this_ComponentU_Impl_0=ruleComponentU_Impl();

                    state._fsp--;

                     
                            current = this_ComponentU_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:324:5: this_ExistingComponent_1= ruleExistingComponent
                    {
                     
                            newCompositeNode(grammarAccess.getComponentUAccess().getExistingComponentParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExistingComponent_in_ruleComponentU775);
                    this_ExistingComponent_1=ruleExistingComponent();

                    state._fsp--;

                     
                            current = this_ExistingComponent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:334:5: this_AcquirableComponent_2= ruleAcquirableComponent
                    {
                     
                            newCompositeNode(grammarAccess.getComponentUAccess().getAcquirableComponentParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAcquirableComponent_in_ruleComponentU802);
                    this_AcquirableComponent_2=ruleAcquirableComponent();

                    state._fsp--;

                     
                            current = this_AcquirableComponent_2; 
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
    // $ANTLR end "ruleComponentU"


    // $ANTLR start "entryRuleConstraint"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:350:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:351:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:352:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint837);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint847); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:359:1: ruleConstraint returns [EObject current=null] : (this_Constraint_Impl_0= ruleConstraint_Impl | this_DesireHigh_1= ruleDesireHigh | this_DesireLow_2= ruleDesireLow | this_Budget_3= ruleBudget ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_Impl_0 = null;

        EObject this_DesireHigh_1 = null;

        EObject this_DesireLow_2 = null;

        EObject this_Budget_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:362:28: ( (this_Constraint_Impl_0= ruleConstraint_Impl | this_DesireHigh_1= ruleDesireHigh | this_DesireLow_2= ruleDesireLow | this_Budget_3= ruleBudget ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:363:1: (this_Constraint_Impl_0= ruleConstraint_Impl | this_DesireHigh_1= ruleDesireHigh | this_DesireLow_2= ruleDesireLow | this_Budget_3= ruleBudget )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:363:1: (this_Constraint_Impl_0= ruleConstraint_Impl | this_DesireHigh_1= ruleDesireHigh | this_DesireLow_2= ruleDesireLow | this_Budget_3= ruleBudget )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt6=1;
                }
                break;
            case 62:
                {
                alt6=2;
                }
                break;
            case 63:
                {
                alt6=3;
                }
                break;
            case 64:
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
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:364:5: this_Constraint_Impl_0= ruleConstraint_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getConstraint_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstraint_Impl_in_ruleConstraint894);
                    this_Constraint_Impl_0=ruleConstraint_Impl();

                    state._fsp--;

                     
                            current = this_Constraint_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:374:5: this_DesireHigh_1= ruleDesireHigh
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getDesireHighParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDesireHigh_in_ruleConstraint921);
                    this_DesireHigh_1=ruleDesireHigh();

                    state._fsp--;

                     
                            current = this_DesireHigh_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:384:5: this_DesireLow_2= ruleDesireLow
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getDesireLowParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDesireLow_in_ruleConstraint948);
                    this_DesireLow_2=ruleDesireLow();

                    state._fsp--;

                     
                            current = this_DesireLow_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:394:5: this_Budget_3= ruleBudget
                    {
                     
                            newCompositeNode(grammarAccess.getConstraintAccess().getBudgetParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBudget_in_ruleConstraint975);
                    this_Budget_3=ruleBudget();

                    state._fsp--;

                     
                            current = this_Budget_3; 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleOurObject_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:410:1: entryRuleOurObject_Impl returns [EObject current=null] : iv_ruleOurObject_Impl= ruleOurObject_Impl EOF ;
    public final EObject entryRuleOurObject_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOurObject_Impl = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:411:2: (iv_ruleOurObject_Impl= ruleOurObject_Impl EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:412:2: iv_ruleOurObject_Impl= ruleOurObject_Impl EOF
            {
             newCompositeNode(grammarAccess.getOurObject_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOurObject_Impl_in_entryRuleOurObject_Impl1010);
            iv_ruleOurObject_Impl=ruleOurObject_Impl();

            state._fsp--;

             current =iv_ruleOurObject_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOurObject_Impl1020); 

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
    // $ANTLR end "entryRuleOurObject_Impl"


    // $ANTLR start "ruleOurObject_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:419:1: ruleOurObject_Impl returns [EObject current=null] : ( () otherlv_1= 'OurObject' ) ;
    public final EObject ruleOurObject_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:422:28: ( ( () otherlv_1= 'OurObject' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:423:1: ( () otherlv_1= 'OurObject' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:423:1: ( () otherlv_1= 'OurObject' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:423:2: () otherlv_1= 'OurObject'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:423:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:424:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOurObject_ImplAccess().getOurObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleOurObject_Impl1066); 

                	newLeafNode(otherlv_1, grammarAccess.getOurObject_ImplAccess().getOurObjectKeyword_1());
                

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
    // $ANTLR end "ruleOurObject_Impl"


    // $ANTLR start "entryRuleCapability_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:441:1: entryRuleCapability_Impl returns [EObject current=null] : iv_ruleCapability_Impl= ruleCapability_Impl EOF ;
    public final EObject entryRuleCapability_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability_Impl = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:442:2: (iv_ruleCapability_Impl= ruleCapability_Impl EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:443:2: iv_ruleCapability_Impl= ruleCapability_Impl EOF
            {
             newCompositeNode(grammarAccess.getCapability_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapability_Impl_in_entryRuleCapability_Impl1102);
            iv_ruleCapability_Impl=ruleCapability_Impl();

            state._fsp--;

             current =iv_ruleCapability_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCapability_Impl1112); 

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
    // $ANTLR end "entryRuleCapability_Impl"


    // $ANTLR start "ruleCapability_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:450:1: ruleCapability_Impl returns [EObject current=null] : ( () ( (lv_standAlone_1_0= 'standAlone' ) )? ( (lv_searchObjective_2_0= 'searchObjective' ) )? ( (lv_sequentialScheduling_3_0= 'sequentialScheduling' ) )? otherlv_4= 'Capability' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'reuse' ( (lv_reuse_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'accumulation' ( ( ruleEString ) ) )? (otherlv_11= 'startDate' ( (lv_startDate_12_0= ruleEString ) ) )? (otherlv_13= 'endDate' ( (lv_endDate_14_0= ruleEString ) ) )? ( ( (lv_measurements_15_0= ruleMeasurement ) ) ( (lv_measurements_16_0= ruleMeasurement ) )* )? (otherlv_17= 'decomposes' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'satisfiedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}' ) ;
    public final EObject ruleCapability_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_standAlone_1_0=null;
        Token lv_searchObjective_2_0=null;
        Token lv_sequentialScheduling_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_reuse_8_0 = null;

        AntlrDatatypeRuleToken lv_startDate_12_0 = null;

        AntlrDatatypeRuleToken lv_endDate_14_0 = null;

        EObject lv_measurements_15_0 = null;

        EObject lv_measurements_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:453:28: ( ( () ( (lv_standAlone_1_0= 'standAlone' ) )? ( (lv_searchObjective_2_0= 'searchObjective' ) )? ( (lv_sequentialScheduling_3_0= 'sequentialScheduling' ) )? otherlv_4= 'Capability' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'reuse' ( (lv_reuse_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'accumulation' ( ( ruleEString ) ) )? (otherlv_11= 'startDate' ( (lv_startDate_12_0= ruleEString ) ) )? (otherlv_13= 'endDate' ( (lv_endDate_14_0= ruleEString ) ) )? ( ( (lv_measurements_15_0= ruleMeasurement ) ) ( (lv_measurements_16_0= ruleMeasurement ) )* )? (otherlv_17= 'decomposes' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'satisfiedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:454:1: ( () ( (lv_standAlone_1_0= 'standAlone' ) )? ( (lv_searchObjective_2_0= 'searchObjective' ) )? ( (lv_sequentialScheduling_3_0= 'sequentialScheduling' ) )? otherlv_4= 'Capability' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'reuse' ( (lv_reuse_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'accumulation' ( ( ruleEString ) ) )? (otherlv_11= 'startDate' ( (lv_startDate_12_0= ruleEString ) ) )? (otherlv_13= 'endDate' ( (lv_endDate_14_0= ruleEString ) ) )? ( ( (lv_measurements_15_0= ruleMeasurement ) ) ( (lv_measurements_16_0= ruleMeasurement ) )* )? (otherlv_17= 'decomposes' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'satisfiedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:454:1: ( () ( (lv_standAlone_1_0= 'standAlone' ) )? ( (lv_searchObjective_2_0= 'searchObjective' ) )? ( (lv_sequentialScheduling_3_0= 'sequentialScheduling' ) )? otherlv_4= 'Capability' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'reuse' ( (lv_reuse_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'accumulation' ( ( ruleEString ) ) )? (otherlv_11= 'startDate' ( (lv_startDate_12_0= ruleEString ) ) )? (otherlv_13= 'endDate' ( (lv_endDate_14_0= ruleEString ) ) )? ( ( (lv_measurements_15_0= ruleMeasurement ) ) ( (lv_measurements_16_0= ruleMeasurement ) )* )? (otherlv_17= 'decomposes' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'satisfiedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:454:2: () ( (lv_standAlone_1_0= 'standAlone' ) )? ( (lv_searchObjective_2_0= 'searchObjective' ) )? ( (lv_sequentialScheduling_3_0= 'sequentialScheduling' ) )? otherlv_4= 'Capability' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'reuse' ( (lv_reuse_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'accumulation' ( ( ruleEString ) ) )? (otherlv_11= 'startDate' ( (lv_startDate_12_0= ruleEString ) ) )? (otherlv_13= 'endDate' ( (lv_endDate_14_0= ruleEString ) ) )? ( ( (lv_measurements_15_0= ruleMeasurement ) ) ( (lv_measurements_16_0= ruleMeasurement ) )* )? (otherlv_17= 'decomposes' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= 'satisfiedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )? otherlv_29= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:454:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:455:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCapability_ImplAccess().getCapabilityAction_0(),
                        current);
                

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:460:2: ( (lv_standAlone_1_0= 'standAlone' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:461:1: (lv_standAlone_1_0= 'standAlone' )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:461:1: (lv_standAlone_1_0= 'standAlone' )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:462:3: lv_standAlone_1_0= 'standAlone'
                    {
                    lv_standAlone_1_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCapability_Impl1164); 

                            newLeafNode(lv_standAlone_1_0, grammarAccess.getCapability_ImplAccess().getStandAloneStandAloneKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCapability_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "standAlone", true, "standAlone");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:475:3: ( (lv_searchObjective_2_0= 'searchObjective' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:476:1: (lv_searchObjective_2_0= 'searchObjective' )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:476:1: (lv_searchObjective_2_0= 'searchObjective' )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:477:3: lv_searchObjective_2_0= 'searchObjective'
                    {
                    lv_searchObjective_2_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCapability_Impl1196); 

                            newLeafNode(lv_searchObjective_2_0, grammarAccess.getCapability_ImplAccess().getSearchObjectiveSearchObjectiveKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCapability_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "searchObjective", true, "searchObjective");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:490:3: ( (lv_sequentialScheduling_3_0= 'sequentialScheduling' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:491:1: (lv_sequentialScheduling_3_0= 'sequentialScheduling' )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:491:1: (lv_sequentialScheduling_3_0= 'sequentialScheduling' )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:492:3: lv_sequentialScheduling_3_0= 'sequentialScheduling'
                    {
                    lv_sequentialScheduling_3_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCapability_Impl1228); 

                            newLeafNode(lv_sequentialScheduling_3_0, grammarAccess.getCapability_ImplAccess().getSequentialSchedulingSequentialSchedulingKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCapability_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "sequentialScheduling", true, "sequentialScheduling");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCapability_Impl1254); 

                	newLeafNode(otherlv_4, grammarAccess.getCapability_ImplAccess().getCapabilityKeyword_4());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:509:1: ( (lv_name_5_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:510:1: (lv_name_5_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:510:1: (lv_name_5_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:511:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapability_Impl1275);
            lv_name_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCapability_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCapability_Impl1287); 

                	newLeafNode(otherlv_6, grammarAccess.getCapability_ImplAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:531:1: (otherlv_7= 'reuse' ( (lv_reuse_8_0= ruleEIntegerObject ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:531:3: otherlv_7= 'reuse' ( (lv_reuse_8_0= ruleEIntegerObject ) )
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCapability_Impl1300); 

                        	newLeafNode(otherlv_7, grammarAccess.getCapability_ImplAccess().getReuseKeyword_7_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:535:1: ( (lv_reuse_8_0= ruleEIntegerObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:536:1: (lv_reuse_8_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:536:1: (lv_reuse_8_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:537:3: lv_reuse_8_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getReuseEIntegerObjectParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleCapability_Impl1321);
                    lv_reuse_8_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapability_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"reuse",
                            		lv_reuse_8_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:553:4: (otherlv_9= 'accumulation' ( ( ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:553:6: otherlv_9= 'accumulation' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCapability_Impl1336); 

                        	newLeafNode(otherlv_9, grammarAccess.getCapability_ImplAccess().getAccumulationKeyword_8_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:557:1: ( ( ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:558:1: ( ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:558:1: ( ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:559:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCapability_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getAccumulationMeasurementCrossReference_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapability_Impl1359);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:572:4: (otherlv_11= 'startDate' ( (lv_startDate_12_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:572:6: otherlv_11= 'startDate' ( (lv_startDate_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCapability_Impl1374); 

                        	newLeafNode(otherlv_11, grammarAccess.getCapability_ImplAccess().getStartDateKeyword_9_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:576:1: ( (lv_startDate_12_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:577:1: (lv_startDate_12_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:577:1: (lv_startDate_12_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:578:3: lv_startDate_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getStartDateEStringParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapability_Impl1395);
                    lv_startDate_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapability_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"startDate",
                            		lv_startDate_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:594:4: (otherlv_13= 'endDate' ( (lv_endDate_14_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:594:6: otherlv_13= 'endDate' ( (lv_endDate_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCapability_Impl1410); 

                        	newLeafNode(otherlv_13, grammarAccess.getCapability_ImplAccess().getEndDateKeyword_10_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:598:1: ( (lv_endDate_14_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:599:1: (lv_endDate_14_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:599:1: (lv_endDate_14_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:600:3: lv_endDate_14_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getEndDateEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapability_Impl1431);
                    lv_endDate_14_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapability_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"endDate",
                            		lv_endDate_14_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:616:4: ( ( (lv_measurements_15_0= ruleMeasurement ) ) ( (lv_measurements_16_0= ruleMeasurement ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:616:5: ( (lv_measurements_15_0= ruleMeasurement ) ) ( (lv_measurements_16_0= ruleMeasurement ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:616:5: ( (lv_measurements_15_0= ruleMeasurement ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:617:1: (lv_measurements_15_0= ruleMeasurement )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:617:1: (lv_measurements_15_0= ruleMeasurement )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:618:3: lv_measurements_15_0= ruleMeasurement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getMeasurementsMeasurementParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMeasurement_in_ruleCapability_Impl1455);
                    lv_measurements_15_0=ruleMeasurement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapability_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"measurements",
                            		lv_measurements_15_0, 
                            		"Measurement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:634:2: ( (lv_measurements_16_0= ruleMeasurement ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==38) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:635:1: (lv_measurements_16_0= ruleMeasurement )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:635:1: (lv_measurements_16_0= ruleMeasurement )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:636:3: lv_measurements_16_0= ruleMeasurement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getMeasurementsMeasurementParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMeasurement_in_ruleCapability_Impl1476);
                    	    lv_measurements_16_0=ruleMeasurement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCapability_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"measurements",
                    	            		lv_measurements_16_0, 
                    	            		"Measurement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:652:5: (otherlv_17= 'decomposes' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:652:7: otherlv_17= 'decomposes' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCapability_Impl1492); 

                        	newLeafNode(otherlv_17, grammarAccess.getCapability_ImplAccess().getDecomposesKeyword_12_0());
                        
                    otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCapability_Impl1504); 

                        	newLeafNode(otherlv_18, grammarAccess.getCapability_ImplAccess().getLeftParenthesisKeyword_12_1());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:660:1: ( ( ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:661:1: ( ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:661:1: ( ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:662:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCapability_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getDecomposesCapabilityCrossReference_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapability_Impl1527);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:675:2: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==23) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:675:4: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCapability_Impl1540); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getCapability_ImplAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:679:1: ( ( ruleEString ) )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:680:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:680:1: ( ruleEString )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:681:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCapability_ImplRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getDecomposesCapabilityCrossReference_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapability_Impl1563);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCapability_Impl1577); 

                        	newLeafNode(otherlv_22, grammarAccess.getCapability_ImplAccess().getRightParenthesisKeyword_12_4());
                        

                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:698:3: (otherlv_23= 'satisfiedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:698:5: otherlv_23= 'satisfiedBy' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ',' ( ( ruleEString ) ) )* otherlv_28= ')'
                    {
                    otherlv_23=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCapability_Impl1592); 

                        	newLeafNode(otherlv_23, grammarAccess.getCapability_ImplAccess().getSatisfiedByKeyword_13_0());
                        
                    otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCapability_Impl1604); 

                        	newLeafNode(otherlv_24, grammarAccess.getCapability_ImplAccess().getLeftParenthesisKeyword_13_1());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:706:1: ( ( ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:707:1: ( ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:707:1: ( ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:708:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCapability_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getSatisfiedByCapabilityCrossReference_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapability_Impl1627);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:721:2: (otherlv_26= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==23) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:721:4: otherlv_26= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_26=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCapability_Impl1640); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getCapability_ImplAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:725:1: ( ( ruleEString ) )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:726:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:726:1: ( ruleEString )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:727:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCapability_ImplRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCapability_ImplAccess().getSatisfiedByCapabilityCrossReference_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapability_Impl1663);
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

                    otherlv_28=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCapability_Impl1677); 

                        	newLeafNode(otherlv_28, grammarAccess.getCapability_ImplAccess().getRightParenthesisKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCapability_Impl1691); 

                	newLeafNode(otherlv_29, grammarAccess.getCapability_ImplAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleCapability_Impl"


    // $ANTLR start "entryRuleCapabilityProvision"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:756:1: entryRuleCapabilityProvision returns [EObject current=null] : iv_ruleCapabilityProvision= ruleCapabilityProvision EOF ;
    public final EObject entryRuleCapabilityProvision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityProvision = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:757:2: (iv_ruleCapabilityProvision= ruleCapabilityProvision EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:758:2: iv_ruleCapabilityProvision= ruleCapabilityProvision EOF
            {
             newCompositeNode(grammarAccess.getCapabilityProvisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapabilityProvision_in_entryRuleCapabilityProvision1727);
            iv_ruleCapabilityProvision=ruleCapabilityProvision();

            state._fsp--;

             current =iv_ruleCapabilityProvision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCapabilityProvision1737); 

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
    // $ANTLR end "entryRuleCapabilityProvision"


    // $ANTLR start "ruleCapabilityProvision"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:765:1: ruleCapabilityProvision returns [EObject current=null] : ( () ( (lv_searchObjective_1_0= 'searchObjective' ) )? otherlv_2= 'CapabilityProvision' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'reuse' ( (lv_reuse_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) )? (otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) )? ( ( (lv_measurements_11_0= ruleMeasurement ) ) ( (lv_measurements_12_0= ruleMeasurement ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleCapabilityProvision() throws RecognitionException {
        EObject current = null;

        Token lv_searchObjective_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_reuse_6_0 = null;

        AntlrDatatypeRuleToken lv_startDate_8_0 = null;

        AntlrDatatypeRuleToken lv_endDate_10_0 = null;

        EObject lv_measurements_11_0 = null;

        EObject lv_measurements_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:768:28: ( ( () ( (lv_searchObjective_1_0= 'searchObjective' ) )? otherlv_2= 'CapabilityProvision' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'reuse' ( (lv_reuse_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) )? (otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) )? ( ( (lv_measurements_11_0= ruleMeasurement ) ) ( (lv_measurements_12_0= ruleMeasurement ) )* )? otherlv_13= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:769:1: ( () ( (lv_searchObjective_1_0= 'searchObjective' ) )? otherlv_2= 'CapabilityProvision' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'reuse' ( (lv_reuse_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) )? (otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) )? ( ( (lv_measurements_11_0= ruleMeasurement ) ) ( (lv_measurements_12_0= ruleMeasurement ) )* )? otherlv_13= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:769:1: ( () ( (lv_searchObjective_1_0= 'searchObjective' ) )? otherlv_2= 'CapabilityProvision' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'reuse' ( (lv_reuse_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) )? (otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) )? ( ( (lv_measurements_11_0= ruleMeasurement ) ) ( (lv_measurements_12_0= ruleMeasurement ) )* )? otherlv_13= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:769:2: () ( (lv_searchObjective_1_0= 'searchObjective' ) )? otherlv_2= 'CapabilityProvision' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'reuse' ( (lv_reuse_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) )? (otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) )? ( ( (lv_measurements_11_0= ruleMeasurement ) ) ( (lv_measurements_12_0= ruleMeasurement ) )* )? otherlv_13= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:769:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:770:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCapabilityProvisionAccess().getCapabilityProvisionAction_0(),
                        current);
                

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:775:2: ( (lv_searchObjective_1_0= 'searchObjective' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:776:1: (lv_searchObjective_1_0= 'searchObjective' )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:776:1: (lv_searchObjective_1_0= 'searchObjective' )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:777:3: lv_searchObjective_1_0= 'searchObjective'
                    {
                    lv_searchObjective_1_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCapabilityProvision1789); 

                            newLeafNode(lv_searchObjective_1_0, grammarAccess.getCapabilityProvisionAccess().getSearchObjectiveSearchObjectiveKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCapabilityProvisionRule());
                    	        }
                           		setWithLastConsumed(current, "searchObjective", true, "searchObjective");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCapabilityProvision1815); 

                	newLeafNode(otherlv_2, grammarAccess.getCapabilityProvisionAccess().getCapabilityProvisionKeyword_2());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:794:1: ( (lv_name_3_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:795:1: (lv_name_3_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:795:1: (lv_name_3_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:796:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCapabilityProvisionAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapabilityProvision1836);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCapabilityProvisionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCapabilityProvision1848); 

                	newLeafNode(otherlv_4, grammarAccess.getCapabilityProvisionAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:816:1: (otherlv_5= 'reuse' ( (lv_reuse_6_0= ruleEIntegerObject ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:816:3: otherlv_5= 'reuse' ( (lv_reuse_6_0= ruleEIntegerObject ) )
                    {
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCapabilityProvision1861); 

                        	newLeafNode(otherlv_5, grammarAccess.getCapabilityProvisionAccess().getReuseKeyword_5_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:820:1: ( (lv_reuse_6_0= ruleEIntegerObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:821:1: (lv_reuse_6_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:821:1: (lv_reuse_6_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:822:3: lv_reuse_6_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapabilityProvisionAccess().getReuseEIntegerObjectParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleCapabilityProvision1882);
                    lv_reuse_6_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapabilityProvisionRule());
                    	        }
                           		set(
                           			current, 
                           			"reuse",
                            		lv_reuse_6_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:838:4: (otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:838:6: otherlv_7= 'startDate' ( (lv_startDate_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCapabilityProvision1897); 

                        	newLeafNode(otherlv_7, grammarAccess.getCapabilityProvisionAccess().getStartDateKeyword_6_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:842:1: ( (lv_startDate_8_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:843:1: (lv_startDate_8_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:843:1: (lv_startDate_8_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:844:3: lv_startDate_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapabilityProvisionAccess().getStartDateEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapabilityProvision1918);
                    lv_startDate_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapabilityProvisionRule());
                    	        }
                           		set(
                           			current, 
                           			"startDate",
                            		lv_startDate_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:860:4: (otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:860:6: otherlv_9= 'endDate' ( (lv_endDate_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCapabilityProvision1933); 

                        	newLeafNode(otherlv_9, grammarAccess.getCapabilityProvisionAccess().getEndDateKeyword_7_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:864:1: ( (lv_endDate_10_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:865:1: (lv_endDate_10_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:865:1: (lv_endDate_10_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:866:3: lv_endDate_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapabilityProvisionAccess().getEndDateEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapabilityProvision1954);
                    lv_endDate_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapabilityProvisionRule());
                    	        }
                           		set(
                           			current, 
                           			"endDate",
                            		lv_endDate_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:882:4: ( ( (lv_measurements_11_0= ruleMeasurement ) ) ( (lv_measurements_12_0= ruleMeasurement ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:882:5: ( (lv_measurements_11_0= ruleMeasurement ) ) ( (lv_measurements_12_0= ruleMeasurement ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:882:5: ( (lv_measurements_11_0= ruleMeasurement ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:883:1: (lv_measurements_11_0= ruleMeasurement )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:883:1: (lv_measurements_11_0= ruleMeasurement )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:884:3: lv_measurements_11_0= ruleMeasurement
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapabilityProvisionAccess().getMeasurementsMeasurementParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMeasurement_in_ruleCapabilityProvision1978);
                    lv_measurements_11_0=ruleMeasurement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapabilityProvisionRule());
                    	        }
                           		add(
                           			current, 
                           			"measurements",
                            		lv_measurements_11_0, 
                            		"Measurement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:900:2: ( (lv_measurements_12_0= ruleMeasurement ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==38) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:901:1: (lv_measurements_12_0= ruleMeasurement )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:901:1: (lv_measurements_12_0= ruleMeasurement )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:902:3: lv_measurements_12_0= ruleMeasurement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCapabilityProvisionAccess().getMeasurementsMeasurementParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMeasurement_in_ruleCapabilityProvision1999);
                    	    lv_measurements_12_0=ruleMeasurement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCapabilityProvisionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"measurements",
                    	            		lv_measurements_12_0, 
                    	            		"Measurement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCapabilityProvision2014); 

                	newLeafNode(otherlv_13, grammarAccess.getCapabilityProvisionAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleCapabilityProvision"


    // $ANTLR start "entryRuleQualitativeValueDictionary"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:930:1: entryRuleQualitativeValueDictionary returns [EObject current=null] : iv_ruleQualitativeValueDictionary= ruleQualitativeValueDictionary EOF ;
    public final EObject entryRuleQualitativeValueDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeValueDictionary = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:931:2: (iv_ruleQualitativeValueDictionary= ruleQualitativeValueDictionary EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:932:2: iv_ruleQualitativeValueDictionary= ruleQualitativeValueDictionary EOF
            {
             newCompositeNode(grammarAccess.getQualitativeValueDictionaryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualitativeValueDictionary_in_entryRuleQualitativeValueDictionary2050);
            iv_ruleQualitativeValueDictionary=ruleQualitativeValueDictionary();

            state._fsp--;

             current =iv_ruleQualitativeValueDictionary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualitativeValueDictionary2060); 

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
    // $ANTLR end "entryRuleQualitativeValueDictionary"


    // $ANTLR start "ruleQualitativeValueDictionary"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:939:1: ruleQualitativeValueDictionary returns [EObject current=null] : (otherlv_0= 'Value' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) )? (otherlv_4= '>' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleQualitativeValueDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:942:28: ( (otherlv_0= 'Value' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) )? (otherlv_4= '>' ( ( ruleEString ) ) )? ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:943:1: (otherlv_0= 'Value' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) )? (otherlv_4= '>' ( ( ruleEString ) ) )? )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:943:1: (otherlv_0= 'Value' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) )? (otherlv_4= '>' ( ( ruleEString ) ) )? )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:943:3: otherlv_0= 'Value' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) )? (otherlv_4= '>' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleQualitativeValueDictionary2097); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeValueDictionaryAccess().getValueKeyword_0());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:947:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:948:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:948:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:949:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQualitativeValueDictionaryAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQualitativeValueDictionary2118);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQualitativeValueDictionaryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:965:2: (otherlv_2= '<' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:965:4: otherlv_2= '<' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleQualitativeValueDictionary2131); 

                        	newLeafNode(otherlv_2, grammarAccess.getQualitativeValueDictionaryAccess().getLessThanSignKeyword_2_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:969:1: ( ( ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:970:1: ( ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:970:1: ( ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:971:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQualitativeValueDictionaryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getQualitativeValueDictionaryAccess().getLessThanQualitativeValueDictionaryCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQualitativeValueDictionary2154);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:984:4: (otherlv_4= '>' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:984:6: otherlv_4= '>' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleQualitativeValueDictionary2169); 

                        	newLeafNode(otherlv_4, grammarAccess.getQualitativeValueDictionaryAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:988:1: ( ( ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:989:1: ( ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:989:1: ( ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:990:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQualitativeValueDictionaryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getQualitativeValueDictionaryAccess().getGreaterThanQualitativeValueDictionaryCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQualitativeValueDictionary2192);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleQualitativeValueDictionary"


    // $ANTLR start "entryRuleComponent"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1011:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1012:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1013:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponent_in_entryRuleComponent2230);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponent2240); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1020:1: ruleComponent returns [EObject current=null] : ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_provides_4_0= ruleCapabilityProvision ) ) ( (lv_provides_5_0= ruleCapabilityProvision ) )* )? ( ( (lv_upgrades_6_0= ruleCapabilityUpgrade ) ) ( (lv_upgrades_7_0= ruleCapabilityUpgrade ) )* )? ( ( (lv_requires_8_0= ruleCapability ) ) ( (lv_requires_9_0= ruleCapability ) )* )? ( ( (lv_costs_10_0= ruleCost ) ) ( (lv_costs_11_0= ruleCost ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_provides_4_0 = null;

        EObject lv_provides_5_0 = null;

        EObject lv_upgrades_6_0 = null;

        EObject lv_upgrades_7_0 = null;

        EObject lv_requires_8_0 = null;

        EObject lv_requires_9_0 = null;

        EObject lv_costs_10_0 = null;

        EObject lv_costs_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1023:28: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_provides_4_0= ruleCapabilityProvision ) ) ( (lv_provides_5_0= ruleCapabilityProvision ) )* )? ( ( (lv_upgrades_6_0= ruleCapabilityUpgrade ) ) ( (lv_upgrades_7_0= ruleCapabilityUpgrade ) )* )? ( ( (lv_requires_8_0= ruleCapability ) ) ( (lv_requires_9_0= ruleCapability ) )* )? ( ( (lv_costs_10_0= ruleCost ) ) ( (lv_costs_11_0= ruleCost ) )* )? otherlv_12= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1024:1: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_provides_4_0= ruleCapabilityProvision ) ) ( (lv_provides_5_0= ruleCapabilityProvision ) )* )? ( ( (lv_upgrades_6_0= ruleCapabilityUpgrade ) ) ( (lv_upgrades_7_0= ruleCapabilityUpgrade ) )* )? ( ( (lv_requires_8_0= ruleCapability ) ) ( (lv_requires_9_0= ruleCapability ) )* )? ( ( (lv_costs_10_0= ruleCost ) ) ( (lv_costs_11_0= ruleCost ) )* )? otherlv_12= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1024:1: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_provides_4_0= ruleCapabilityProvision ) ) ( (lv_provides_5_0= ruleCapabilityProvision ) )* )? ( ( (lv_upgrades_6_0= ruleCapabilityUpgrade ) ) ( (lv_upgrades_7_0= ruleCapabilityUpgrade ) )* )? ( ( (lv_requires_8_0= ruleCapability ) ) ( (lv_requires_9_0= ruleCapability ) )* )? ( ( (lv_costs_10_0= ruleCost ) ) ( (lv_costs_11_0= ruleCost ) )* )? otherlv_12= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1024:2: () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_provides_4_0= ruleCapabilityProvision ) ) ( (lv_provides_5_0= ruleCapabilityProvision ) )* )? ( ( (lv_upgrades_6_0= ruleCapabilityUpgrade ) ) ( (lv_upgrades_7_0= ruleCapabilityUpgrade ) )* )? ( ( (lv_requires_8_0= ruleCapability ) ) ( (lv_requires_9_0= ruleCapability ) )* )? ( ( (lv_costs_10_0= ruleCost ) ) ( (lv_costs_11_0= ruleCost ) )* )? otherlv_12= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1024:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1025:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentAccess().getComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComponent2286); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1034:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1035:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1035:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1036:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponent2307);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComponent2319); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1056:1: ( ( (lv_provides_4_0= ruleCapabilityProvision ) ) ( (lv_provides_5_0= ruleCapabilityProvision ) )* )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1056:2: ( (lv_provides_4_0= ruleCapabilityProvision ) ) ( (lv_provides_5_0= ruleCapabilityProvision ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1056:2: ( (lv_provides_4_0= ruleCapabilityProvision ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1057:1: (lv_provides_4_0= ruleCapabilityProvision )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1057:1: (lv_provides_4_0= ruleCapabilityProvision )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1058:3: lv_provides_4_0= ruleCapabilityProvision
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getProvidesCapabilityProvisionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCapabilityProvision_in_ruleComponent2341);
                    lv_provides_4_0=ruleCapabilityProvision();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"provides",
                            		lv_provides_4_0, 
                            		"CapabilityProvision");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1074:2: ( (lv_provides_5_0= ruleCapabilityProvision ) )*
                    loop28:
                    do {
                        int alt28=2;
                        alt28 = dfa28.predict(input);
                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1075:1: (lv_provides_5_0= ruleCapabilityProvision )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1075:1: (lv_provides_5_0= ruleCapabilityProvision )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1076:3: lv_provides_5_0= ruleCapabilityProvision
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getProvidesCapabilityProvisionParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCapabilityProvision_in_ruleComponent2362);
                    	    lv_provides_5_0=ruleCapabilityProvision();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"provides",
                    	            		lv_provides_5_0, 
                    	            		"CapabilityProvision");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1092:5: ( ( (lv_upgrades_6_0= ruleCapabilityUpgrade ) ) ( (lv_upgrades_7_0= ruleCapabilityUpgrade ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1092:6: ( (lv_upgrades_6_0= ruleCapabilityUpgrade ) ) ( (lv_upgrades_7_0= ruleCapabilityUpgrade ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1092:6: ( (lv_upgrades_6_0= ruleCapabilityUpgrade ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1093:1: (lv_upgrades_6_0= ruleCapabilityUpgrade )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1093:1: (lv_upgrades_6_0= ruleCapabilityUpgrade )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1094:3: lv_upgrades_6_0= ruleCapabilityUpgrade
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getUpgradesCapabilityUpgradeParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCapabilityUpgrade_in_ruleComponent2387);
                    lv_upgrades_6_0=ruleCapabilityUpgrade();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"upgrades",
                            		lv_upgrades_6_0, 
                            		"CapabilityUpgrade");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1110:2: ( (lv_upgrades_7_0= ruleCapabilityUpgrade ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==49) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1111:1: (lv_upgrades_7_0= ruleCapabilityUpgrade )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1111:1: (lv_upgrades_7_0= ruleCapabilityUpgrade )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1112:3: lv_upgrades_7_0= ruleCapabilityUpgrade
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getUpgradesCapabilityUpgradeParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCapabilityUpgrade_in_ruleComponent2408);
                    	    lv_upgrades_7_0=ruleCapabilityUpgrade();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"upgrades",
                    	            		lv_upgrades_7_0, 
                    	            		"CapabilityUpgrade");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1128:5: ( ( (lv_requires_8_0= ruleCapability ) ) ( (lv_requires_9_0= ruleCapability ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=12 && LA33_0<=15)||LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1128:6: ( (lv_requires_8_0= ruleCapability ) ) ( (lv_requires_9_0= ruleCapability ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1128:6: ( (lv_requires_8_0= ruleCapability ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1129:1: (lv_requires_8_0= ruleCapability )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1129:1: (lv_requires_8_0= ruleCapability )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1130:3: lv_requires_8_0= ruleCapability
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getRequiresCapabilityParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCapability_in_ruleComponent2433);
                    lv_requires_8_0=ruleCapability();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"requires",
                            		lv_requires_8_0, 
                            		"Capability");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1146:2: ( (lv_requires_9_0= ruleCapability ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=12 && LA32_0<=15)||LA32_0==27) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1147:1: (lv_requires_9_0= ruleCapability )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1147:1: (lv_requires_9_0= ruleCapability )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1148:3: lv_requires_9_0= ruleCapability
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getRequiresCapabilityParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCapability_in_ruleComponent2454);
                    	    lv_requires_9_0=ruleCapability();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requires",
                    	            		lv_requires_9_0, 
                    	            		"Capability");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1164:5: ( ( (lv_costs_10_0= ruleCost ) ) ( (lv_costs_11_0= ruleCost ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1164:6: ( (lv_costs_10_0= ruleCost ) ) ( (lv_costs_11_0= ruleCost ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1164:6: ( (lv_costs_10_0= ruleCost ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1165:1: (lv_costs_10_0= ruleCost )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1165:1: (lv_costs_10_0= ruleCost )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1166:3: lv_costs_10_0= ruleCost
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getCostsCostParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCost_in_ruleComponent2479);
                    lv_costs_10_0=ruleCost();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		add(
                           			current, 
                           			"costs",
                            		lv_costs_10_0, 
                            		"Cost");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1182:2: ( (lv_costs_11_0= ruleCost ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==52) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1183:1: (lv_costs_11_0= ruleCost )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1183:1: (lv_costs_11_0= ruleCost )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1184:3: lv_costs_11_0= ruleCost
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getCostsCostParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCost_in_ruleComponent2500);
                    	    lv_costs_11_0=ruleCost();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"costs",
                    	            		lv_costs_11_0, 
                    	            		"Cost");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleComponent2515); 

                	newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleRunConfiguration_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1212:1: entryRuleRunConfiguration_Impl returns [EObject current=null] : iv_ruleRunConfiguration_Impl= ruleRunConfiguration_Impl EOF ;
    public final EObject entryRuleRunConfiguration_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunConfiguration_Impl = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1213:2: (iv_ruleRunConfiguration_Impl= ruleRunConfiguration_Impl EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1214:2: iv_ruleRunConfiguration_Impl= ruleRunConfiguration_Impl EOF
            {
             newCompositeNode(grammarAccess.getRunConfiguration_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRunConfiguration_Impl_in_entryRuleRunConfiguration_Impl2551);
            iv_ruleRunConfiguration_Impl=ruleRunConfiguration_Impl();

            state._fsp--;

             current =iv_ruleRunConfiguration_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRunConfiguration_Impl2561); 

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
    // $ANTLR end "entryRuleRunConfiguration_Impl"


    // $ANTLR start "ruleRunConfiguration_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1221:1: ruleRunConfiguration_Impl returns [EObject current=null] : ( () otherlv_1= 'RunConfiguration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRunConfiguration_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_popSize_5_0 = null;

        AntlrDatatypeRuleToken lv_genCount_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1224:28: ( ( () otherlv_1= 'RunConfiguration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1225:1: ( () otherlv_1= 'RunConfiguration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1225:1: ( () otherlv_1= 'RunConfiguration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1225:2: () otherlv_1= 'RunConfiguration' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1225:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRunConfiguration_ImplAccess().getRunConfigurationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRunConfiguration_Impl2607); 

                	newLeafNode(otherlv_1, grammarAccess.getRunConfiguration_ImplAccess().getRunConfigurationKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1235:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1236:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1236:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1237:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRunConfiguration_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRunConfiguration_Impl2628);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRunConfiguration_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRunConfiguration_Impl2640); 

                	newLeafNode(otherlv_3, grammarAccess.getRunConfiguration_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1257:1: (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1257:3: otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRunConfiguration_Impl2653); 

                        	newLeafNode(otherlv_4, grammarAccess.getRunConfiguration_ImplAccess().getPopSizeKeyword_4_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1261:1: ( (lv_popSize_5_0= ruleEIntegerObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1262:1: (lv_popSize_5_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1262:1: (lv_popSize_5_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1263:3: lv_popSize_5_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRunConfiguration_ImplAccess().getPopSizeEIntegerObjectParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleRunConfiguration_Impl2674);
                    lv_popSize_5_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRunConfiguration_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"popSize",
                            		lv_popSize_5_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1279:4: (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1279:6: otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRunConfiguration_Impl2689); 

                        	newLeafNode(otherlv_6, grammarAccess.getRunConfiguration_ImplAccess().getGenCountKeyword_5_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1283:1: ( (lv_genCount_7_0= ruleEIntegerObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1284:1: (lv_genCount_7_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1284:1: (lv_genCount_7_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1285:3: lv_genCount_7_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRunConfiguration_ImplAccess().getGenCountEIntegerObjectParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleRunConfiguration_Impl2710);
                    lv_genCount_7_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRunConfiguration_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"genCount",
                            		lv_genCount_7_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRunConfiguration_Impl2724); 

                	newLeafNode(otherlv_8, grammarAccess.getRunConfiguration_ImplAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRunConfiguration_Impl"


    // $ANTLR start "entryRuleFindTradeOffs"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1313:1: entryRuleFindTradeOffs returns [EObject current=null] : iv_ruleFindTradeOffs= ruleFindTradeOffs EOF ;
    public final EObject entryRuleFindTradeOffs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindTradeOffs = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1314:2: (iv_ruleFindTradeOffs= ruleFindTradeOffs EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1315:2: iv_ruleFindTradeOffs= ruleFindTradeOffs EOF
            {
             newCompositeNode(grammarAccess.getFindTradeOffsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFindTradeOffs_in_entryRuleFindTradeOffs2760);
            iv_ruleFindTradeOffs=ruleFindTradeOffs();

            state._fsp--;

             current =iv_ruleFindTradeOffs; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFindTradeOffs2770); 

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
    // $ANTLR end "entryRuleFindTradeOffs"


    // $ANTLR start "ruleFindTradeOffs"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1322:1: ruleFindTradeOffs returns [EObject current=null] : ( () otherlv_1= 'FindTradeOffs' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? ( ( (lv_components_8_0= ruleComponentU ) ) ( (lv_components_9_0= ruleComponentU ) )* )? ( ( (lv_constraints_10_0= ruleConstraint ) ) ( (lv_constraints_11_0= ruleConstraint ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleFindTradeOffs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_popSize_5_0 = null;

        AntlrDatatypeRuleToken lv_genCount_7_0 = null;

        EObject lv_components_8_0 = null;

        EObject lv_components_9_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_constraints_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1325:28: ( ( () otherlv_1= 'FindTradeOffs' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? ( ( (lv_components_8_0= ruleComponentU ) ) ( (lv_components_9_0= ruleComponentU ) )* )? ( ( (lv_constraints_10_0= ruleConstraint ) ) ( (lv_constraints_11_0= ruleConstraint ) )* )? otherlv_12= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1326:1: ( () otherlv_1= 'FindTradeOffs' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? ( ( (lv_components_8_0= ruleComponentU ) ) ( (lv_components_9_0= ruleComponentU ) )* )? ( ( (lv_constraints_10_0= ruleConstraint ) ) ( (lv_constraints_11_0= ruleConstraint ) )* )? otherlv_12= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1326:1: ( () otherlv_1= 'FindTradeOffs' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? ( ( (lv_components_8_0= ruleComponentU ) ) ( (lv_components_9_0= ruleComponentU ) )* )? ( ( (lv_constraints_10_0= ruleConstraint ) ) ( (lv_constraints_11_0= ruleConstraint ) )* )? otherlv_12= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1326:2: () otherlv_1= 'FindTradeOffs' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? ( ( (lv_components_8_0= ruleComponentU ) ) ( (lv_components_9_0= ruleComponentU ) )* )? ( ( (lv_constraints_10_0= ruleConstraint ) ) ( (lv_constraints_11_0= ruleConstraint ) )* )? otherlv_12= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1326:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1327:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFindTradeOffsAccess().getFindTradeOffsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFindTradeOffs2816); 

                	newLeafNode(otherlv_1, grammarAccess.getFindTradeOffsAccess().getFindTradeOffsKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1336:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1337:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1337:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1338:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFindTradeOffsAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFindTradeOffs2837);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFindTradeOffsRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFindTradeOffs2849); 

                	newLeafNode(otherlv_3, grammarAccess.getFindTradeOffsAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1358:1: (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1358:3: otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFindTradeOffs2862); 

                        	newLeafNode(otherlv_4, grammarAccess.getFindTradeOffsAccess().getPopSizeKeyword_4_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1362:1: ( (lv_popSize_5_0= ruleEIntegerObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1363:1: (lv_popSize_5_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1363:1: (lv_popSize_5_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1364:3: lv_popSize_5_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getFindTradeOffsAccess().getPopSizeEIntegerObjectParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleFindTradeOffs2883);
                    lv_popSize_5_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFindTradeOffsRule());
                    	        }
                           		set(
                           			current, 
                           			"popSize",
                            		lv_popSize_5_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1380:4: (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1380:6: otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFindTradeOffs2898); 

                        	newLeafNode(otherlv_6, grammarAccess.getFindTradeOffsAccess().getGenCountKeyword_5_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1384:1: ( (lv_genCount_7_0= ruleEIntegerObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1385:1: (lv_genCount_7_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1385:1: (lv_genCount_7_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1386:3: lv_genCount_7_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getFindTradeOffsAccess().getGenCountEIntegerObjectParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleFindTradeOffs2919);
                    lv_genCount_7_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFindTradeOffsRule());
                    	        }
                           		set(
                           			current, 
                           			"genCount",
                            		lv_genCount_7_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1402:4: ( ( (lv_components_8_0= ruleComponentU ) ) ( (lv_components_9_0= ruleComponentU ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31||(LA41_0>=57 && LA41_0<=58)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1402:5: ( (lv_components_8_0= ruleComponentU ) ) ( (lv_components_9_0= ruleComponentU ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1402:5: ( (lv_components_8_0= ruleComponentU ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1403:1: (lv_components_8_0= ruleComponentU )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1403:1: (lv_components_8_0= ruleComponentU )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1404:3: lv_components_8_0= ruleComponentU
                    {
                     
                    	        newCompositeNode(grammarAccess.getFindTradeOffsAccess().getComponentsComponentUParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComponentU_in_ruleFindTradeOffs2943);
                    lv_components_8_0=ruleComponentU();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFindTradeOffsRule());
                    	        }
                           		add(
                           			current, 
                           			"components",
                            		lv_components_8_0, 
                            		"ComponentU");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1420:2: ( (lv_components_9_0= ruleComponentU ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==31||(LA40_0>=57 && LA40_0<=58)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1421:1: (lv_components_9_0= ruleComponentU )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1421:1: (lv_components_9_0= ruleComponentU )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1422:3: lv_components_9_0= ruleComponentU
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFindTradeOffsAccess().getComponentsComponentUParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleComponentU_in_ruleFindTradeOffs2964);
                    	    lv_components_9_0=ruleComponentU();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFindTradeOffsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"components",
                    	            		lv_components_9_0, 
                    	            		"ComponentU");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1438:5: ( ( (lv_constraints_10_0= ruleConstraint ) ) ( (lv_constraints_11_0= ruleConstraint ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=61 && LA43_0<=64)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1438:6: ( (lv_constraints_10_0= ruleConstraint ) ) ( (lv_constraints_11_0= ruleConstraint ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1438:6: ( (lv_constraints_10_0= ruleConstraint ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1439:1: (lv_constraints_10_0= ruleConstraint )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1439:1: (lv_constraints_10_0= ruleConstraint )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1440:3: lv_constraints_10_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getFindTradeOffsAccess().getConstraintsConstraintParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleFindTradeOffs2989);
                    lv_constraints_10_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFindTradeOffsRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_10_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1456:2: ( (lv_constraints_11_0= ruleConstraint ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=61 && LA42_0<=64)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1457:1: (lv_constraints_11_0= ruleConstraint )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1457:1: (lv_constraints_11_0= ruleConstraint )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1458:3: lv_constraints_11_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFindTradeOffsAccess().getConstraintsConstraintParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleFindTradeOffs3010);
                    	    lv_constraints_11_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFindTradeOffsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_11_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFindTradeOffs3025); 

                	newLeafNode(otherlv_12, grammarAccess.getFindTradeOffsAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleFindTradeOffs"


    // $ANTLR start "entryRuleThroughLifePlanning"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1486:1: entryRuleThroughLifePlanning returns [EObject current=null] : iv_ruleThroughLifePlanning= ruleThroughLifePlanning EOF ;
    public final EObject entryRuleThroughLifePlanning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThroughLifePlanning = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1487:2: (iv_ruleThroughLifePlanning= ruleThroughLifePlanning EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1488:2: iv_ruleThroughLifePlanning= ruleThroughLifePlanning EOF
            {
             newCompositeNode(grammarAccess.getThroughLifePlanningRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleThroughLifePlanning_in_entryRuleThroughLifePlanning3061);
            iv_ruleThroughLifePlanning=ruleThroughLifePlanning();

            state._fsp--;

             current =iv_ruleThroughLifePlanning; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleThroughLifePlanning3071); 

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
    // $ANTLR end "entryRuleThroughLifePlanning"


    // $ANTLR start "ruleThroughLifePlanning"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1495:1: ruleThroughLifePlanning returns [EObject current=null] : ( () otherlv_1= 'ThroughLifePlanning' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? ( ( (lv_components_12_0= ruleComponentU ) ) ( (lv_components_13_0= ruleComponentU ) )* )? ( ( (lv_constraints_14_0= ruleConstraint ) ) ( (lv_constraints_15_0= ruleConstraint ) )* )? otherlv_16= '}' ) ;
    public final EObject ruleThroughLifePlanning() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_popSize_5_0 = null;

        AntlrDatatypeRuleToken lv_genCount_7_0 = null;

        AntlrDatatypeRuleToken lv_startDate_9_0 = null;

        AntlrDatatypeRuleToken lv_endDate_11_0 = null;

        EObject lv_components_12_0 = null;

        EObject lv_components_13_0 = null;

        EObject lv_constraints_14_0 = null;

        EObject lv_constraints_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1498:28: ( ( () otherlv_1= 'ThroughLifePlanning' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? ( ( (lv_components_12_0= ruleComponentU ) ) ( (lv_components_13_0= ruleComponentU ) )* )? ( ( (lv_constraints_14_0= ruleConstraint ) ) ( (lv_constraints_15_0= ruleConstraint ) )* )? otherlv_16= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1499:1: ( () otherlv_1= 'ThroughLifePlanning' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? ( ( (lv_components_12_0= ruleComponentU ) ) ( (lv_components_13_0= ruleComponentU ) )* )? ( ( (lv_constraints_14_0= ruleConstraint ) ) ( (lv_constraints_15_0= ruleConstraint ) )* )? otherlv_16= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1499:1: ( () otherlv_1= 'ThroughLifePlanning' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? ( ( (lv_components_12_0= ruleComponentU ) ) ( (lv_components_13_0= ruleComponentU ) )* )? ( ( (lv_constraints_14_0= ruleConstraint ) ) ( (lv_constraints_15_0= ruleConstraint ) )* )? otherlv_16= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1499:2: () otherlv_1= 'ThroughLifePlanning' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? ( ( (lv_components_12_0= ruleComponentU ) ) ( (lv_components_13_0= ruleComponentU ) )* )? ( ( (lv_constraints_14_0= ruleConstraint ) ) ( (lv_constraints_15_0= ruleConstraint ) )* )? otherlv_16= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1499:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1500:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getThroughLifePlanningAccess().getThroughLifePlanningAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleThroughLifePlanning3117); 

                	newLeafNode(otherlv_1, grammarAccess.getThroughLifePlanningAccess().getThroughLifePlanningKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1509:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1510:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1510:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1511:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getThroughLifePlanningAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleThroughLifePlanning3138);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getThroughLifePlanningRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleThroughLifePlanning3150); 

                	newLeafNode(otherlv_3, grammarAccess.getThroughLifePlanningAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1531:1: (otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==33) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1531:3: otherlv_4= 'popSize' ( (lv_popSize_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleThroughLifePlanning3163); 

                        	newLeafNode(otherlv_4, grammarAccess.getThroughLifePlanningAccess().getPopSizeKeyword_4_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1535:1: ( (lv_popSize_5_0= ruleEIntegerObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1536:1: (lv_popSize_5_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1536:1: (lv_popSize_5_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1537:3: lv_popSize_5_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getThroughLifePlanningAccess().getPopSizeEIntegerObjectParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleThroughLifePlanning3184);
                    lv_popSize_5_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThroughLifePlanningRule());
                    	        }
                           		set(
                           			current, 
                           			"popSize",
                            		lv_popSize_5_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1553:4: (otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1553:6: otherlv_6= 'genCount' ( (lv_genCount_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleThroughLifePlanning3199); 

                        	newLeafNode(otherlv_6, grammarAccess.getThroughLifePlanningAccess().getGenCountKeyword_5_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1557:1: ( (lv_genCount_7_0= ruleEIntegerObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1558:1: (lv_genCount_7_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1558:1: (lv_genCount_7_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1559:3: lv_genCount_7_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getThroughLifePlanningAccess().getGenCountEIntegerObjectParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleThroughLifePlanning3220);
                    lv_genCount_7_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThroughLifePlanningRule());
                    	        }
                           		set(
                           			current, 
                           			"genCount",
                            		lv_genCount_7_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1575:4: (otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==19) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1575:6: otherlv_8= 'startDate' ( (lv_startDate_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleThroughLifePlanning3235); 

                        	newLeafNode(otherlv_8, grammarAccess.getThroughLifePlanningAccess().getStartDateKeyword_6_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1579:1: ( (lv_startDate_9_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1580:1: (lv_startDate_9_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1580:1: (lv_startDate_9_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1581:3: lv_startDate_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getThroughLifePlanningAccess().getStartDateEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleThroughLifePlanning3256);
                    lv_startDate_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThroughLifePlanningRule());
                    	        }
                           		set(
                           			current, 
                           			"startDate",
                            		lv_startDate_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1597:4: (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==20) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1597:6: otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleThroughLifePlanning3271); 

                        	newLeafNode(otherlv_10, grammarAccess.getThroughLifePlanningAccess().getEndDateKeyword_7_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1601:1: ( (lv_endDate_11_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1602:1: (lv_endDate_11_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1602:1: (lv_endDate_11_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1603:3: lv_endDate_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getThroughLifePlanningAccess().getEndDateEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleThroughLifePlanning3292);
                    lv_endDate_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThroughLifePlanningRule());
                    	        }
                           		set(
                           			current, 
                           			"endDate",
                            		lv_endDate_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1619:4: ( ( (lv_components_12_0= ruleComponentU ) ) ( (lv_components_13_0= ruleComponentU ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==31||(LA49_0>=57 && LA49_0<=58)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1619:5: ( (lv_components_12_0= ruleComponentU ) ) ( (lv_components_13_0= ruleComponentU ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1619:5: ( (lv_components_12_0= ruleComponentU ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1620:1: (lv_components_12_0= ruleComponentU )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1620:1: (lv_components_12_0= ruleComponentU )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1621:3: lv_components_12_0= ruleComponentU
                    {
                     
                    	        newCompositeNode(grammarAccess.getThroughLifePlanningAccess().getComponentsComponentUParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComponentU_in_ruleThroughLifePlanning3316);
                    lv_components_12_0=ruleComponentU();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThroughLifePlanningRule());
                    	        }
                           		add(
                           			current, 
                           			"components",
                            		lv_components_12_0, 
                            		"ComponentU");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1637:2: ( (lv_components_13_0= ruleComponentU ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==31||(LA48_0>=57 && LA48_0<=58)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1638:1: (lv_components_13_0= ruleComponentU )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1638:1: (lv_components_13_0= ruleComponentU )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1639:3: lv_components_13_0= ruleComponentU
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getThroughLifePlanningAccess().getComponentsComponentUParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleComponentU_in_ruleThroughLifePlanning3337);
                    	    lv_components_13_0=ruleComponentU();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getThroughLifePlanningRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"components",
                    	            		lv_components_13_0, 
                    	            		"ComponentU");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1655:5: ( ( (lv_constraints_14_0= ruleConstraint ) ) ( (lv_constraints_15_0= ruleConstraint ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=61 && LA51_0<=64)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1655:6: ( (lv_constraints_14_0= ruleConstraint ) ) ( (lv_constraints_15_0= ruleConstraint ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1655:6: ( (lv_constraints_14_0= ruleConstraint ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1656:1: (lv_constraints_14_0= ruleConstraint )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1656:1: (lv_constraints_14_0= ruleConstraint )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1657:3: lv_constraints_14_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getThroughLifePlanningAccess().getConstraintsConstraintParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleThroughLifePlanning3362);
                    lv_constraints_14_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThroughLifePlanningRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_14_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1673:2: ( (lv_constraints_15_0= ruleConstraint ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=61 && LA50_0<=64)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1674:1: (lv_constraints_15_0= ruleConstraint )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1674:1: (lv_constraints_15_0= ruleConstraint )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1675:3: lv_constraints_15_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getThroughLifePlanningAccess().getConstraintsConstraintParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleThroughLifePlanning3383);
                    	    lv_constraints_15_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getThroughLifePlanningRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_15_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleThroughLifePlanning3398); 

                	newLeafNode(otherlv_16, grammarAccess.getThroughLifePlanningAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleThroughLifePlanning"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1703:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1704:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1705:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString3435);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString3446); 

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
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1712:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1715:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1716:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1716:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1716:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString3486); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1724:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString3512); 

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


    // $ANTLR start "entryRuleEIntegerObject"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1741:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1742:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1743:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject3560);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEIntegerObject3571); 

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
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1750:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1753:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1754:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1754:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1754:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1754:2: (kw= '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==37) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1755:2: kw= '-'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEIntegerObject3610); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEIntegerObject3627); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleMeasurement"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1775:1: entryRuleMeasurement returns [EObject current=null] : iv_ruleMeasurement= ruleMeasurement EOF ;
    public final EObject entryRuleMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurement = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1776:2: (iv_ruleMeasurement= ruleMeasurement EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1777:2: iv_ruleMeasurement= ruleMeasurement EOF
            {
             newCompositeNode(grammarAccess.getMeasurementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeasurement_in_entryRuleMeasurement3672);
            iv_ruleMeasurement=ruleMeasurement();

            state._fsp--;

             current =iv_ruleMeasurement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeasurement3682); 

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
    // $ANTLR end "entryRuleMeasurement"


    // $ANTLR start "ruleMeasurement"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1784:1: ruleMeasurement returns [EObject current=null] : ( () otherlv_1= 'Measurement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'criticalValue' ( (lv_criticalValue_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'benchmarkValue' ( (lv_benchmarkValue_7_0= ruleEFloatOurObject ) ) )? (otherlv_8= 'providedValue' ( (lv_providedValue_9_0= ruleEFloatOurObject ) ) )? (otherlv_10= 'criticalValues' otherlv_11= '(' ( (lv_criticalValues_12_0= ruleQualitativeValue ) ) (otherlv_13= ',' ( (lv_criticalValues_14_0= ruleQualitativeValue ) ) )* otherlv_15= ')' )? (otherlv_16= 'benchmarkValues' otherlv_17= '(' ( (lv_benchmarkValues_18_0= ruleQualitativeValue ) ) (otherlv_19= ',' ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) ) )* otherlv_21= ')' )? (otherlv_22= 'providedValues' otherlv_23= '(' ( (lv_providedValues_24_0= ruleQualitativeValue ) ) (otherlv_25= ',' ( (lv_providedValues_26_0= ruleQualitativeValue ) ) )* otherlv_27= ')' )? (otherlv_28= 'script' ( (lv_script_29_0= ruleEString ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_criticalValue_5_0 = null;

        AntlrDatatypeRuleToken lv_benchmarkValue_7_0 = null;

        AntlrDatatypeRuleToken lv_providedValue_9_0 = null;

        EObject lv_criticalValues_12_0 = null;

        EObject lv_criticalValues_14_0 = null;

        EObject lv_benchmarkValues_18_0 = null;

        EObject lv_benchmarkValues_20_0 = null;

        EObject lv_providedValues_24_0 = null;

        EObject lv_providedValues_26_0 = null;

        AntlrDatatypeRuleToken lv_script_29_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1787:28: ( ( () otherlv_1= 'Measurement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'criticalValue' ( (lv_criticalValue_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'benchmarkValue' ( (lv_benchmarkValue_7_0= ruleEFloatOurObject ) ) )? (otherlv_8= 'providedValue' ( (lv_providedValue_9_0= ruleEFloatOurObject ) ) )? (otherlv_10= 'criticalValues' otherlv_11= '(' ( (lv_criticalValues_12_0= ruleQualitativeValue ) ) (otherlv_13= ',' ( (lv_criticalValues_14_0= ruleQualitativeValue ) ) )* otherlv_15= ')' )? (otherlv_16= 'benchmarkValues' otherlv_17= '(' ( (lv_benchmarkValues_18_0= ruleQualitativeValue ) ) (otherlv_19= ',' ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) ) )* otherlv_21= ')' )? (otherlv_22= 'providedValues' otherlv_23= '(' ( (lv_providedValues_24_0= ruleQualitativeValue ) ) (otherlv_25= ',' ( (lv_providedValues_26_0= ruleQualitativeValue ) ) )* otherlv_27= ')' )? (otherlv_28= 'script' ( (lv_script_29_0= ruleEString ) ) )? otherlv_30= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1788:1: ( () otherlv_1= 'Measurement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'criticalValue' ( (lv_criticalValue_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'benchmarkValue' ( (lv_benchmarkValue_7_0= ruleEFloatOurObject ) ) )? (otherlv_8= 'providedValue' ( (lv_providedValue_9_0= ruleEFloatOurObject ) ) )? (otherlv_10= 'criticalValues' otherlv_11= '(' ( (lv_criticalValues_12_0= ruleQualitativeValue ) ) (otherlv_13= ',' ( (lv_criticalValues_14_0= ruleQualitativeValue ) ) )* otherlv_15= ')' )? (otherlv_16= 'benchmarkValues' otherlv_17= '(' ( (lv_benchmarkValues_18_0= ruleQualitativeValue ) ) (otherlv_19= ',' ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) ) )* otherlv_21= ')' )? (otherlv_22= 'providedValues' otherlv_23= '(' ( (lv_providedValues_24_0= ruleQualitativeValue ) ) (otherlv_25= ',' ( (lv_providedValues_26_0= ruleQualitativeValue ) ) )* otherlv_27= ')' )? (otherlv_28= 'script' ( (lv_script_29_0= ruleEString ) ) )? otherlv_30= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1788:1: ( () otherlv_1= 'Measurement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'criticalValue' ( (lv_criticalValue_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'benchmarkValue' ( (lv_benchmarkValue_7_0= ruleEFloatOurObject ) ) )? (otherlv_8= 'providedValue' ( (lv_providedValue_9_0= ruleEFloatOurObject ) ) )? (otherlv_10= 'criticalValues' otherlv_11= '(' ( (lv_criticalValues_12_0= ruleQualitativeValue ) ) (otherlv_13= ',' ( (lv_criticalValues_14_0= ruleQualitativeValue ) ) )* otherlv_15= ')' )? (otherlv_16= 'benchmarkValues' otherlv_17= '(' ( (lv_benchmarkValues_18_0= ruleQualitativeValue ) ) (otherlv_19= ',' ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) ) )* otherlv_21= ')' )? (otherlv_22= 'providedValues' otherlv_23= '(' ( (lv_providedValues_24_0= ruleQualitativeValue ) ) (otherlv_25= ',' ( (lv_providedValues_26_0= ruleQualitativeValue ) ) )* otherlv_27= ')' )? (otherlv_28= 'script' ( (lv_script_29_0= ruleEString ) ) )? otherlv_30= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1788:2: () otherlv_1= 'Measurement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'criticalValue' ( (lv_criticalValue_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'benchmarkValue' ( (lv_benchmarkValue_7_0= ruleEFloatOurObject ) ) )? (otherlv_8= 'providedValue' ( (lv_providedValue_9_0= ruleEFloatOurObject ) ) )? (otherlv_10= 'criticalValues' otherlv_11= '(' ( (lv_criticalValues_12_0= ruleQualitativeValue ) ) (otherlv_13= ',' ( (lv_criticalValues_14_0= ruleQualitativeValue ) ) )* otherlv_15= ')' )? (otherlv_16= 'benchmarkValues' otherlv_17= '(' ( (lv_benchmarkValues_18_0= ruleQualitativeValue ) ) (otherlv_19= ',' ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) ) )* otherlv_21= ')' )? (otherlv_22= 'providedValues' otherlv_23= '(' ( (lv_providedValues_24_0= ruleQualitativeValue ) ) (otherlv_25= ',' ( (lv_providedValues_26_0= ruleQualitativeValue ) ) )* otherlv_27= ')' )? (otherlv_28= 'script' ( (lv_script_29_0= ruleEString ) ) )? otherlv_30= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1788:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1789:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMeasurementAccess().getMeasurementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMeasurement3728); 

                	newLeafNode(otherlv_1, grammarAccess.getMeasurementAccess().getMeasurementKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1798:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1799:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1799:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1800:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMeasurementAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMeasurement3749);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMeasurement3761); 

                	newLeafNode(otherlv_3, grammarAccess.getMeasurementAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1820:1: (otherlv_4= 'criticalValue' ( (lv_criticalValue_5_0= ruleEFloatOurObject ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==39) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1820:3: otherlv_4= 'criticalValue' ( (lv_criticalValue_5_0= ruleEFloatOurObject ) )
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMeasurement3774); 

                        	newLeafNode(otherlv_4, grammarAccess.getMeasurementAccess().getCriticalValueKeyword_4_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1824:1: ( (lv_criticalValue_5_0= ruleEFloatOurObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1825:1: (lv_criticalValue_5_0= ruleEFloatOurObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1825:1: (lv_criticalValue_5_0= ruleEFloatOurObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1826:3: lv_criticalValue_5_0= ruleEFloatOurObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementAccess().getCriticalValueEFloatOurObjectParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloatOurObject_in_ruleMeasurement3795);
                    lv_criticalValue_5_0=ruleEFloatOurObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	        }
                           		set(
                           			current, 
                           			"criticalValue",
                            		lv_criticalValue_5_0, 
                            		"EFloatOurObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1842:4: (otherlv_6= 'benchmarkValue' ( (lv_benchmarkValue_7_0= ruleEFloatOurObject ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==40) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1842:6: otherlv_6= 'benchmarkValue' ( (lv_benchmarkValue_7_0= ruleEFloatOurObject ) )
                    {
                    otherlv_6=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleMeasurement3810); 

                        	newLeafNode(otherlv_6, grammarAccess.getMeasurementAccess().getBenchmarkValueKeyword_5_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1846:1: ( (lv_benchmarkValue_7_0= ruleEFloatOurObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1847:1: (lv_benchmarkValue_7_0= ruleEFloatOurObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1847:1: (lv_benchmarkValue_7_0= ruleEFloatOurObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1848:3: lv_benchmarkValue_7_0= ruleEFloatOurObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementAccess().getBenchmarkValueEFloatOurObjectParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloatOurObject_in_ruleMeasurement3831);
                    lv_benchmarkValue_7_0=ruleEFloatOurObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	        }
                           		set(
                           			current, 
                           			"benchmarkValue",
                            		lv_benchmarkValue_7_0, 
                            		"EFloatOurObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1864:4: (otherlv_8= 'providedValue' ( (lv_providedValue_9_0= ruleEFloatOurObject ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==41) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1864:6: otherlv_8= 'providedValue' ( (lv_providedValue_9_0= ruleEFloatOurObject ) )
                    {
                    otherlv_8=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleMeasurement3846); 

                        	newLeafNode(otherlv_8, grammarAccess.getMeasurementAccess().getProvidedValueKeyword_6_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1868:1: ( (lv_providedValue_9_0= ruleEFloatOurObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1869:1: (lv_providedValue_9_0= ruleEFloatOurObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1869:1: (lv_providedValue_9_0= ruleEFloatOurObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1870:3: lv_providedValue_9_0= ruleEFloatOurObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementAccess().getProvidedValueEFloatOurObjectParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloatOurObject_in_ruleMeasurement3867);
                    lv_providedValue_9_0=ruleEFloatOurObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	        }
                           		set(
                           			current, 
                           			"providedValue",
                            		lv_providedValue_9_0, 
                            		"EFloatOurObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1886:4: (otherlv_10= 'criticalValues' otherlv_11= '(' ( (lv_criticalValues_12_0= ruleQualitativeValue ) ) (otherlv_13= ',' ( (lv_criticalValues_14_0= ruleQualitativeValue ) ) )* otherlv_15= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==42) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1886:6: otherlv_10= 'criticalValues' otherlv_11= '(' ( (lv_criticalValues_12_0= ruleQualitativeValue ) ) (otherlv_13= ',' ( (lv_criticalValues_14_0= ruleQualitativeValue ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMeasurement3882); 

                        	newLeafNode(otherlv_10, grammarAccess.getMeasurementAccess().getCriticalValuesKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMeasurement3894); 

                        	newLeafNode(otherlv_11, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1894:1: ( (lv_criticalValues_12_0= ruleQualitativeValue ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1895:1: (lv_criticalValues_12_0= ruleQualitativeValue )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1895:1: (lv_criticalValues_12_0= ruleQualitativeValue )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1896:3: lv_criticalValues_12_0= ruleQualitativeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementAccess().getCriticalValuesQualitativeValueParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualitativeValue_in_ruleMeasurement3915);
                    lv_criticalValues_12_0=ruleQualitativeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	        }
                           		add(
                           			current, 
                           			"criticalValues",
                            		lv_criticalValues_12_0, 
                            		"QualitativeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1912:2: (otherlv_13= ',' ( (lv_criticalValues_14_0= ruleQualitativeValue ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==23) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1912:4: otherlv_13= ',' ( (lv_criticalValues_14_0= ruleQualitativeValue ) )
                    	    {
                    	    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMeasurement3928); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getMeasurementAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1916:1: ( (lv_criticalValues_14_0= ruleQualitativeValue ) )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1917:1: (lv_criticalValues_14_0= ruleQualitativeValue )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1917:1: (lv_criticalValues_14_0= ruleQualitativeValue )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1918:3: lv_criticalValues_14_0= ruleQualitativeValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMeasurementAccess().getCriticalValuesQualitativeValueParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualitativeValue_in_ruleMeasurement3949);
                    	    lv_criticalValues_14_0=ruleQualitativeValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"criticalValues",
                    	            		lv_criticalValues_14_0, 
                    	            		"QualitativeValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMeasurement3963); 

                        	newLeafNode(otherlv_15, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1938:3: (otherlv_16= 'benchmarkValues' otherlv_17= '(' ( (lv_benchmarkValues_18_0= ruleQualitativeValue ) ) (otherlv_19= ',' ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) ) )* otherlv_21= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1938:5: otherlv_16= 'benchmarkValues' otherlv_17= '(' ( (lv_benchmarkValues_18_0= ruleQualitativeValue ) ) (otherlv_19= ',' ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) ) )* otherlv_21= ')'
                    {
                    otherlv_16=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMeasurement3978); 

                        	newLeafNode(otherlv_16, grammarAccess.getMeasurementAccess().getBenchmarkValuesKeyword_8_0());
                        
                    otherlv_17=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMeasurement3990); 

                        	newLeafNode(otherlv_17, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_8_1());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1946:1: ( (lv_benchmarkValues_18_0= ruleQualitativeValue ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1947:1: (lv_benchmarkValues_18_0= ruleQualitativeValue )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1947:1: (lv_benchmarkValues_18_0= ruleQualitativeValue )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1948:3: lv_benchmarkValues_18_0= ruleQualitativeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementAccess().getBenchmarkValuesQualitativeValueParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualitativeValue_in_ruleMeasurement4011);
                    lv_benchmarkValues_18_0=ruleQualitativeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	        }
                           		add(
                           			current, 
                           			"benchmarkValues",
                            		lv_benchmarkValues_18_0, 
                            		"QualitativeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1964:2: (otherlv_19= ',' ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==23) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1964:4: otherlv_19= ',' ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) )
                    	    {
                    	    otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMeasurement4024); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getMeasurementAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1968:1: ( (lv_benchmarkValues_20_0= ruleQualitativeValue ) )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1969:1: (lv_benchmarkValues_20_0= ruleQualitativeValue )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1969:1: (lv_benchmarkValues_20_0= ruleQualitativeValue )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1970:3: lv_benchmarkValues_20_0= ruleQualitativeValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMeasurementAccess().getBenchmarkValuesQualitativeValueParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualitativeValue_in_ruleMeasurement4045);
                    	    lv_benchmarkValues_20_0=ruleQualitativeValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"benchmarkValues",
                    	            		lv_benchmarkValues_20_0, 
                    	            		"QualitativeValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMeasurement4059); 

                        	newLeafNode(otherlv_21, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1990:3: (otherlv_22= 'providedValues' otherlv_23= '(' ( (lv_providedValues_24_0= ruleQualitativeValue ) ) (otherlv_25= ',' ( (lv_providedValues_26_0= ruleQualitativeValue ) ) )* otherlv_27= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==44) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1990:5: otherlv_22= 'providedValues' otherlv_23= '(' ( (lv_providedValues_24_0= ruleQualitativeValue ) ) (otherlv_25= ',' ( (lv_providedValues_26_0= ruleQualitativeValue ) ) )* otherlv_27= ')'
                    {
                    otherlv_22=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMeasurement4074); 

                        	newLeafNode(otherlv_22, grammarAccess.getMeasurementAccess().getProvidedValuesKeyword_9_0());
                        
                    otherlv_23=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMeasurement4086); 

                        	newLeafNode(otherlv_23, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_9_1());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1998:1: ( (lv_providedValues_24_0= ruleQualitativeValue ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1999:1: (lv_providedValues_24_0= ruleQualitativeValue )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:1999:1: (lv_providedValues_24_0= ruleQualitativeValue )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2000:3: lv_providedValues_24_0= ruleQualitativeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementAccess().getProvidedValuesQualitativeValueParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualitativeValue_in_ruleMeasurement4107);
                    lv_providedValues_24_0=ruleQualitativeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	        }
                           		add(
                           			current, 
                           			"providedValues",
                            		lv_providedValues_24_0, 
                            		"QualitativeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2016:2: (otherlv_25= ',' ( (lv_providedValues_26_0= ruleQualitativeValue ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==23) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2016:4: otherlv_25= ',' ( (lv_providedValues_26_0= ruleQualitativeValue ) )
                    	    {
                    	    otherlv_25=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMeasurement4120); 

                    	        	newLeafNode(otherlv_25, grammarAccess.getMeasurementAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2020:1: ( (lv_providedValues_26_0= ruleQualitativeValue ) )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2021:1: (lv_providedValues_26_0= ruleQualitativeValue )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2021:1: (lv_providedValues_26_0= ruleQualitativeValue )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2022:3: lv_providedValues_26_0= ruleQualitativeValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMeasurementAccess().getProvidedValuesQualitativeValueParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleQualitativeValue_in_ruleMeasurement4141);
                    	    lv_providedValues_26_0=ruleQualitativeValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"providedValues",
                    	            		lv_providedValues_26_0, 
                    	            		"QualitativeValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMeasurement4155); 

                        	newLeafNode(otherlv_27, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_9_4());
                        

                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2042:3: (otherlv_28= 'script' ( (lv_script_29_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==45) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2042:5: otherlv_28= 'script' ( (lv_script_29_0= ruleEString ) )
                    {
                    otherlv_28=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMeasurement4170); 

                        	newLeafNode(otherlv_28, grammarAccess.getMeasurementAccess().getScriptKeyword_10_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2046:1: ( (lv_script_29_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2047:1: (lv_script_29_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2047:1: (lv_script_29_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2048:3: lv_script_29_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMeasurementAccess().getScriptEStringParserRuleCall_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMeasurement4191);
                    lv_script_29_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    	        }
                           		set(
                           			current, 
                           			"script",
                            		lv_script_29_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMeasurement4205); 

                	newLeafNode(otherlv_30, grammarAccess.getMeasurementAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleMeasurement"


    // $ANTLR start "entryRuleEFloatOurObject"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2076:1: entryRuleEFloatOurObject returns [String current=null] : iv_ruleEFloatOurObject= ruleEFloatOurObject EOF ;
    public final String entryRuleEFloatOurObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatOurObject = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2077:2: (iv_ruleEFloatOurObject= ruleEFloatOurObject EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2078:2: iv_ruleEFloatOurObject= ruleEFloatOurObject EOF
            {
             newCompositeNode(grammarAccess.getEFloatOurObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloatOurObject_in_entryRuleEFloatOurObject4242);
            iv_ruleEFloatOurObject=ruleEFloatOurObject();

            state._fsp--;

             current =iv_ruleEFloatOurObject.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloatOurObject4253); 

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
    // $ANTLR end "entryRuleEFloatOurObject"


    // $ANTLR start "ruleEFloatOurObject"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2085:1: ruleEFloatOurObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloatOurObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2088:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2089:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2089:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2089:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2089:2: (kw= '-' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==37) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2090:2: kw= '-'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEFloatOurObject4292); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatOurObjectAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2095:3: (this_INT_1= RULE_INT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_INT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2095:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloatOurObject4310); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatOurObjectAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEFloatOurObject4330); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatOurObjectAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloatOurObject4345); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatOurObjectAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2115:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=47 && LA68_0<=48)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2115:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2115:2: (kw= 'E' | kw= 'e' )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==47) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==48) ) {
                        alt66=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2116:2: kw= 'E'
                            {
                            kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEFloatOurObject4365); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatOurObjectAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2123:2: kw= 'e'
                            {
                            kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEFloatOurObject4384); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatOurObjectAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2128:2: (kw= '-' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==37) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2129:2: kw= '-'
                            {
                            kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEFloatOurObject4399); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatOurObjectAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloatOurObject4416); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEFloatOurObjectAccess().getINTTerminalRuleCall_4_2()); 
                        

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
    // $ANTLR end "ruleEFloatOurObject"


    // $ANTLR start "entryRuleQualitativeValue"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2149:1: entryRuleQualitativeValue returns [EObject current=null] : iv_ruleQualitativeValue= ruleQualitativeValue EOF ;
    public final EObject entryRuleQualitativeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeValue = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2150:2: (iv_ruleQualitativeValue= ruleQualitativeValue EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2151:2: iv_ruleQualitativeValue= ruleQualitativeValue EOF
            {
             newCompositeNode(grammarAccess.getQualitativeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualitativeValue_in_entryRuleQualitativeValue4463);
            iv_ruleQualitativeValue=ruleQualitativeValue();

            state._fsp--;

             current =iv_ruleQualitativeValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualitativeValue4473); 

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
    // $ANTLR end "entryRuleQualitativeValue"


    // $ANTLR start "ruleQualitativeValue"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2158:1: ruleQualitativeValue returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleQualitativeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2161:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2162:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2162:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2162:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2162:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2163:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQualitativeValueAccess().getQualitativeValueAction_0(),
                        current);
                

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2168:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2169:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2169:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2170:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQualitativeValueAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQualitativeValue4528);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQualitativeValueRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
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
    // $ANTLR end "ruleQualitativeValue"


    // $ANTLR start "entryRuleCapabilityUpgrade"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2194:1: entryRuleCapabilityUpgrade returns [EObject current=null] : iv_ruleCapabilityUpgrade= ruleCapabilityUpgrade EOF ;
    public final EObject entryRuleCapabilityUpgrade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityUpgrade = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2195:2: (iv_ruleCapabilityUpgrade= ruleCapabilityUpgrade EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2196:2: iv_ruleCapabilityUpgrade= ruleCapabilityUpgrade EOF
            {
             newCompositeNode(grammarAccess.getCapabilityUpgradeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapabilityUpgrade_in_entryRuleCapabilityUpgrade4564);
            iv_ruleCapabilityUpgrade=ruleCapabilityUpgrade();

            state._fsp--;

             current =iv_ruleCapabilityUpgrade; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCapabilityUpgrade4574); 

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
    // $ANTLR end "entryRuleCapabilityUpgrade"


    // $ANTLR start "ruleCapabilityUpgrade"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2203:1: ruleCapabilityUpgrade returns [EObject current=null] : ( () otherlv_1= 'CapabilityUpgrade' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetComponent' ( (lv_targetComponent_5_0= ruleEString ) ) )? (otherlv_6= 'upgrading' ( ( ruleEString ) ) )? ( ( (lv_capabilityChanges_8_0= ruleCapabilityChange ) ) ( (lv_capabilityChanges_9_0= ruleCapabilityChange ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleCapabilityUpgrade() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_targetComponent_5_0 = null;

        EObject lv_capabilityChanges_8_0 = null;

        EObject lv_capabilityChanges_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2206:28: ( ( () otherlv_1= 'CapabilityUpgrade' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetComponent' ( (lv_targetComponent_5_0= ruleEString ) ) )? (otherlv_6= 'upgrading' ( ( ruleEString ) ) )? ( ( (lv_capabilityChanges_8_0= ruleCapabilityChange ) ) ( (lv_capabilityChanges_9_0= ruleCapabilityChange ) )* )? otherlv_10= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2207:1: ( () otherlv_1= 'CapabilityUpgrade' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetComponent' ( (lv_targetComponent_5_0= ruleEString ) ) )? (otherlv_6= 'upgrading' ( ( ruleEString ) ) )? ( ( (lv_capabilityChanges_8_0= ruleCapabilityChange ) ) ( (lv_capabilityChanges_9_0= ruleCapabilityChange ) )* )? otherlv_10= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2207:1: ( () otherlv_1= 'CapabilityUpgrade' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetComponent' ( (lv_targetComponent_5_0= ruleEString ) ) )? (otherlv_6= 'upgrading' ( ( ruleEString ) ) )? ( ( (lv_capabilityChanges_8_0= ruleCapabilityChange ) ) ( (lv_capabilityChanges_9_0= ruleCapabilityChange ) )* )? otherlv_10= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2207:2: () otherlv_1= 'CapabilityUpgrade' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetComponent' ( (lv_targetComponent_5_0= ruleEString ) ) )? (otherlv_6= 'upgrading' ( ( ruleEString ) ) )? ( ( (lv_capabilityChanges_8_0= ruleCapabilityChange ) ) ( (lv_capabilityChanges_9_0= ruleCapabilityChange ) )* )? otherlv_10= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2207:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2208:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCapabilityUpgradeAccess().getCapabilityUpgradeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleCapabilityUpgrade4620); 

                	newLeafNode(otherlv_1, grammarAccess.getCapabilityUpgradeAccess().getCapabilityUpgradeKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2217:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2218:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2218:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2219:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCapabilityUpgradeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapabilityUpgrade4641);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCapabilityUpgradeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCapabilityUpgrade4653); 

                	newLeafNode(otherlv_3, grammarAccess.getCapabilityUpgradeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2239:1: (otherlv_4= 'targetComponent' ( (lv_targetComponent_5_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==50) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2239:3: otherlv_4= 'targetComponent' ( (lv_targetComponent_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleCapabilityUpgrade4666); 

                        	newLeafNode(otherlv_4, grammarAccess.getCapabilityUpgradeAccess().getTargetComponentKeyword_4_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2243:1: ( (lv_targetComponent_5_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2244:1: (lv_targetComponent_5_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2244:1: (lv_targetComponent_5_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2245:3: lv_targetComponent_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapabilityUpgradeAccess().getTargetComponentEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapabilityUpgrade4687);
                    lv_targetComponent_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapabilityUpgradeRule());
                    	        }
                           		set(
                           			current, 
                           			"targetComponent",
                            		lv_targetComponent_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2261:4: (otherlv_6= 'upgrading' ( ( ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==51) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2261:6: otherlv_6= 'upgrading' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCapabilityUpgrade4702); 

                        	newLeafNode(otherlv_6, grammarAccess.getCapabilityUpgradeAccess().getUpgradingKeyword_5_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2265:1: ( ( ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2266:1: ( ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2266:1: ( ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2267:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCapabilityUpgradeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCapabilityUpgradeAccess().getUpgradingComponentCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapabilityUpgrade4725);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2280:4: ( ( (lv_capabilityChanges_8_0= ruleCapabilityChange ) ) ( (lv_capabilityChanges_9_0= ruleCapabilityChange ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==56) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2280:5: ( (lv_capabilityChanges_8_0= ruleCapabilityChange ) ) ( (lv_capabilityChanges_9_0= ruleCapabilityChange ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2280:5: ( (lv_capabilityChanges_8_0= ruleCapabilityChange ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2281:1: (lv_capabilityChanges_8_0= ruleCapabilityChange )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2281:1: (lv_capabilityChanges_8_0= ruleCapabilityChange )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2282:3: lv_capabilityChanges_8_0= ruleCapabilityChange
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapabilityUpgradeAccess().getCapabilityChangesCapabilityChangeParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCapabilityChange_in_ruleCapabilityUpgrade4749);
                    lv_capabilityChanges_8_0=ruleCapabilityChange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapabilityUpgradeRule());
                    	        }
                           		add(
                           			current, 
                           			"capabilityChanges",
                            		lv_capabilityChanges_8_0, 
                            		"CapabilityChange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2298:2: ( (lv_capabilityChanges_9_0= ruleCapabilityChange ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==56) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2299:1: (lv_capabilityChanges_9_0= ruleCapabilityChange )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2299:1: (lv_capabilityChanges_9_0= ruleCapabilityChange )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2300:3: lv_capabilityChanges_9_0= ruleCapabilityChange
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCapabilityUpgradeAccess().getCapabilityChangesCapabilityChangeParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCapabilityChange_in_ruleCapabilityUpgrade4770);
                    	    lv_capabilityChanges_9_0=ruleCapabilityChange();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCapabilityUpgradeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"capabilityChanges",
                    	            		lv_capabilityChanges_9_0, 
                    	            		"CapabilityChange");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCapabilityUpgrade4785); 

                	newLeafNode(otherlv_10, grammarAccess.getCapabilityUpgradeAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleCapabilityUpgrade"


    // $ANTLR start "entryRuleCost_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2328:1: entryRuleCost_Impl returns [EObject current=null] : iv_ruleCost_Impl= ruleCost_Impl EOF ;
    public final EObject entryRuleCost_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCost_Impl = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2329:2: (iv_ruleCost_Impl= ruleCost_Impl EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2330:2: iv_ruleCost_Impl= ruleCost_Impl EOF
            {
             newCompositeNode(grammarAccess.getCost_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCost_Impl_in_entryRuleCost_Impl4821);
            iv_ruleCost_Impl=ruleCost_Impl();

            state._fsp--;

             current =iv_ruleCost_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCost_Impl4831); 

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
    // $ANTLR end "entryRuleCost_Impl"


    // $ANTLR start "ruleCost_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2337:1: ruleCost_Impl returns [EObject current=null] : ( () otherlv_1= 'Cost' ( (lv_name_2_0= ruleEString ) ) ( (lv_amount_3_0= ruleEFloatOurObject ) )? (otherlv_4= '{' (otherlv_5= 'startAfter' ( (lv_startAfter_6_0= ruleEString ) ) )? (otherlv_7= 'repeatDuration' ( (lv_repeatDuration_8_0= ruleEString ) ) )? (otherlv_9= 'stopAfter' ( (lv_stopAfter_10_0= ruleEString ) ) )? otherlv_11= '}' )? ) ;
    public final EObject ruleCost_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_3_0 = null;

        AntlrDatatypeRuleToken lv_startAfter_6_0 = null;

        AntlrDatatypeRuleToken lv_repeatDuration_8_0 = null;

        AntlrDatatypeRuleToken lv_stopAfter_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2340:28: ( ( () otherlv_1= 'Cost' ( (lv_name_2_0= ruleEString ) ) ( (lv_amount_3_0= ruleEFloatOurObject ) )? (otherlv_4= '{' (otherlv_5= 'startAfter' ( (lv_startAfter_6_0= ruleEString ) ) )? (otherlv_7= 'repeatDuration' ( (lv_repeatDuration_8_0= ruleEString ) ) )? (otherlv_9= 'stopAfter' ( (lv_stopAfter_10_0= ruleEString ) ) )? otherlv_11= '}' )? ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2341:1: ( () otherlv_1= 'Cost' ( (lv_name_2_0= ruleEString ) ) ( (lv_amount_3_0= ruleEFloatOurObject ) )? (otherlv_4= '{' (otherlv_5= 'startAfter' ( (lv_startAfter_6_0= ruleEString ) ) )? (otherlv_7= 'repeatDuration' ( (lv_repeatDuration_8_0= ruleEString ) ) )? (otherlv_9= 'stopAfter' ( (lv_stopAfter_10_0= ruleEString ) ) )? otherlv_11= '}' )? )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2341:1: ( () otherlv_1= 'Cost' ( (lv_name_2_0= ruleEString ) ) ( (lv_amount_3_0= ruleEFloatOurObject ) )? (otherlv_4= '{' (otherlv_5= 'startAfter' ( (lv_startAfter_6_0= ruleEString ) ) )? (otherlv_7= 'repeatDuration' ( (lv_repeatDuration_8_0= ruleEString ) ) )? (otherlv_9= 'stopAfter' ( (lv_stopAfter_10_0= ruleEString ) ) )? otherlv_11= '}' )? )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2341:2: () otherlv_1= 'Cost' ( (lv_name_2_0= ruleEString ) ) ( (lv_amount_3_0= ruleEFloatOurObject ) )? (otherlv_4= '{' (otherlv_5= 'startAfter' ( (lv_startAfter_6_0= ruleEString ) ) )? (otherlv_7= 'repeatDuration' ( (lv_repeatDuration_8_0= ruleEString ) ) )? (otherlv_9= 'stopAfter' ( (lv_stopAfter_10_0= ruleEString ) ) )? otherlv_11= '}' )?
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2341:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2342:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCost_ImplAccess().getCostAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleCost_Impl4877); 

                	newLeafNode(otherlv_1, grammarAccess.getCost_ImplAccess().getCostKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2351:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2352:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2352:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2353:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCost_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCost_Impl4898);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCost_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2369:2: ( (lv_amount_3_0= ruleEFloatOurObject ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT||LA73_0==37||LA73_0==46) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2370:1: (lv_amount_3_0= ruleEFloatOurObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2370:1: (lv_amount_3_0= ruleEFloatOurObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2371:3: lv_amount_3_0= ruleEFloatOurObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getCost_ImplAccess().getAmountEFloatOurObjectParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloatOurObject_in_ruleCost_Impl4919);
                    lv_amount_3_0=ruleEFloatOurObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCost_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_3_0, 
                            		"EFloatOurObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2387:3: (otherlv_4= '{' (otherlv_5= 'startAfter' ( (lv_startAfter_6_0= ruleEString ) ) )? (otherlv_7= 'repeatDuration' ( (lv_repeatDuration_8_0= ruleEString ) ) )? (otherlv_9= 'stopAfter' ( (lv_stopAfter_10_0= ruleEString ) ) )? otherlv_11= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==16) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2387:5: otherlv_4= '{' (otherlv_5= 'startAfter' ( (lv_startAfter_6_0= ruleEString ) ) )? (otherlv_7= 'repeatDuration' ( (lv_repeatDuration_8_0= ruleEString ) ) )? (otherlv_9= 'stopAfter' ( (lv_stopAfter_10_0= ruleEString ) ) )? otherlv_11= '}'
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCost_Impl4933); 

                        	newLeafNode(otherlv_4, grammarAccess.getCost_ImplAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2391:1: (otherlv_5= 'startAfter' ( (lv_startAfter_6_0= ruleEString ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==53) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2391:3: otherlv_5= 'startAfter' ( (lv_startAfter_6_0= ruleEString ) )
                            {
                            otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleCost_Impl4946); 

                                	newLeafNode(otherlv_5, grammarAccess.getCost_ImplAccess().getStartAfterKeyword_4_1_0());
                                
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2395:1: ( (lv_startAfter_6_0= ruleEString ) )
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2396:1: (lv_startAfter_6_0= ruleEString )
                            {
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2396:1: (lv_startAfter_6_0= ruleEString )
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2397:3: lv_startAfter_6_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getCost_ImplAccess().getStartAfterEStringParserRuleCall_4_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCost_Impl4967);
                            lv_startAfter_6_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCost_ImplRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"startAfter",
                                    		lv_startAfter_6_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2413:4: (otherlv_7= 'repeatDuration' ( (lv_repeatDuration_8_0= ruleEString ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==54) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2413:6: otherlv_7= 'repeatDuration' ( (lv_repeatDuration_8_0= ruleEString ) )
                            {
                            otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleCost_Impl4982); 

                                	newLeafNode(otherlv_7, grammarAccess.getCost_ImplAccess().getRepeatDurationKeyword_4_2_0());
                                
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2417:1: ( (lv_repeatDuration_8_0= ruleEString ) )
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2418:1: (lv_repeatDuration_8_0= ruleEString )
                            {
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2418:1: (lv_repeatDuration_8_0= ruleEString )
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2419:3: lv_repeatDuration_8_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getCost_ImplAccess().getRepeatDurationEStringParserRuleCall_4_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCost_Impl5003);
                            lv_repeatDuration_8_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCost_ImplRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"repeatDuration",
                                    		lv_repeatDuration_8_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2435:4: (otherlv_9= 'stopAfter' ( (lv_stopAfter_10_0= ruleEString ) ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==55) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2435:6: otherlv_9= 'stopAfter' ( (lv_stopAfter_10_0= ruleEString ) )
                            {
                            otherlv_9=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleCost_Impl5018); 

                                	newLeafNode(otherlv_9, grammarAccess.getCost_ImplAccess().getStopAfterKeyword_4_3_0());
                                
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2439:1: ( (lv_stopAfter_10_0= ruleEString ) )
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2440:1: (lv_stopAfter_10_0= ruleEString )
                            {
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2440:1: (lv_stopAfter_10_0= ruleEString )
                            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2441:3: lv_stopAfter_10_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getCost_ImplAccess().getStopAfterEStringParserRuleCall_4_3_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCost_Impl5039);
                            lv_stopAfter_10_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCost_ImplRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"stopAfter",
                                    		lv_stopAfter_10_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCost_Impl5053); 

                        	newLeafNode(otherlv_11, grammarAccess.getCost_ImplAccess().getRightCurlyBracketKeyword_4_4());
                        

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
    // $ANTLR end "ruleCost_Impl"


    // $ANTLR start "entryRuleCapabilityChange"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2469:1: entryRuleCapabilityChange returns [EObject current=null] : iv_ruleCapabilityChange= ruleCapabilityChange EOF ;
    public final EObject entryRuleCapabilityChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapabilityChange = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2470:2: (iv_ruleCapabilityChange= ruleCapabilityChange EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2471:2: iv_ruleCapabilityChange= ruleCapabilityChange EOF
            {
             newCompositeNode(grammarAccess.getCapabilityChangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCapabilityChange_in_entryRuleCapabilityChange5091);
            iv_ruleCapabilityChange=ruleCapabilityChange();

            state._fsp--;

             current =iv_ruleCapabilityChange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCapabilityChange5101); 

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
    // $ANTLR end "entryRuleCapabilityChange"


    // $ANTLR start "ruleCapabilityChange"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2478:1: ruleCapabilityChange returns [EObject current=null] : ( () otherlv_1= 'CapabilityChange' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_capabilities_4_0= ruleCapabilityProvision ) ) ( (lv_capabilities_5_0= ruleCapabilityProvision ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleCapabilityChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_capabilities_4_0 = null;

        EObject lv_capabilities_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2481:28: ( ( () otherlv_1= 'CapabilityChange' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_capabilities_4_0= ruleCapabilityProvision ) ) ( (lv_capabilities_5_0= ruleCapabilityProvision ) )* )? otherlv_6= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2482:1: ( () otherlv_1= 'CapabilityChange' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_capabilities_4_0= ruleCapabilityProvision ) ) ( (lv_capabilities_5_0= ruleCapabilityProvision ) )* )? otherlv_6= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2482:1: ( () otherlv_1= 'CapabilityChange' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_capabilities_4_0= ruleCapabilityProvision ) ) ( (lv_capabilities_5_0= ruleCapabilityProvision ) )* )? otherlv_6= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2482:2: () otherlv_1= 'CapabilityChange' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_capabilities_4_0= ruleCapabilityProvision ) ) ( (lv_capabilities_5_0= ruleCapabilityProvision ) )* )? otherlv_6= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2482:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2483:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCapabilityChangeAccess().getCapabilityChangeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleCapabilityChange5147); 

                	newLeafNode(otherlv_1, grammarAccess.getCapabilityChangeAccess().getCapabilityChangeKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2492:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2493:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2493:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2494:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCapabilityChangeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCapabilityChange5168);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCapabilityChangeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCapabilityChange5180); 

                	newLeafNode(otherlv_3, grammarAccess.getCapabilityChangeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2514:1: ( ( (lv_capabilities_4_0= ruleCapabilityProvision ) ) ( (lv_capabilities_5_0= ruleCapabilityProvision ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==13||LA79_0==27) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2514:2: ( (lv_capabilities_4_0= ruleCapabilityProvision ) ) ( (lv_capabilities_5_0= ruleCapabilityProvision ) )*
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2514:2: ( (lv_capabilities_4_0= ruleCapabilityProvision ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2515:1: (lv_capabilities_4_0= ruleCapabilityProvision )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2515:1: (lv_capabilities_4_0= ruleCapabilityProvision )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2516:3: lv_capabilities_4_0= ruleCapabilityProvision
                    {
                     
                    	        newCompositeNode(grammarAccess.getCapabilityChangeAccess().getCapabilitiesCapabilityProvisionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCapabilityProvision_in_ruleCapabilityChange5202);
                    lv_capabilities_4_0=ruleCapabilityProvision();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCapabilityChangeRule());
                    	        }
                           		add(
                           			current, 
                           			"capabilities",
                            		lv_capabilities_4_0, 
                            		"CapabilityProvision");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2532:2: ( (lv_capabilities_5_0= ruleCapabilityProvision ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==13||LA78_0==27) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2533:1: (lv_capabilities_5_0= ruleCapabilityProvision )
                    	    {
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2533:1: (lv_capabilities_5_0= ruleCapabilityProvision )
                    	    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2534:3: lv_capabilities_5_0= ruleCapabilityProvision
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCapabilityChangeAccess().getCapabilitiesCapabilityProvisionParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCapabilityProvision_in_ruleCapabilityChange5223);
                    	    lv_capabilities_5_0=ruleCapabilityProvision();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCapabilityChangeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"capabilities",
                    	            		lv_capabilities_5_0, 
                    	            		"CapabilityProvision");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCapabilityChange5238); 

                	newLeafNode(otherlv_6, grammarAccess.getCapabilityChangeAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleCapabilityChange"


    // $ANTLR start "entryRuleComponentU_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2562:1: entryRuleComponentU_Impl returns [EObject current=null] : iv_ruleComponentU_Impl= ruleComponentU_Impl EOF ;
    public final EObject entryRuleComponentU_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentU_Impl = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2563:2: (iv_ruleComponentU_Impl= ruleComponentU_Impl EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2564:2: iv_ruleComponentU_Impl= ruleComponentU_Impl EOF
            {
             newCompositeNode(grammarAccess.getComponentU_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponentU_Impl_in_entryRuleComponentU_Impl5274);
            iv_ruleComponentU_Impl=ruleComponentU_Impl();

            state._fsp--;

             current =iv_ruleComponentU_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentU_Impl5284); 

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
    // $ANTLR end "entryRuleComponentU_Impl"


    // $ANTLR start "ruleComponentU_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2571:1: ruleComponentU_Impl returns [EObject current=null] : ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? ) ;
    public final EObject ruleComponentU_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_quantity_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2574:28: ( ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2575:1: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2575:1: ( () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2575:2: () otherlv_1= 'Component' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )?
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2575:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2576:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComponentU_ImplAccess().getComponentUAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComponentU_Impl5330); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentU_ImplAccess().getComponentKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2585:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2586:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2586:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2587:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComponentU_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComponentU_Impl5351);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComponentU_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2603:2: ( (lv_quantity_3_0= ruleEIntegerObject ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT||LA80_0==37) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2604:1: (lv_quantity_3_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2604:1: (lv_quantity_3_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2605:3: lv_quantity_3_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentU_ImplAccess().getQuantityEIntegerObjectParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleComponentU_Impl5372);
                    lv_quantity_3_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentU_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"quantity",
                            		lv_quantity_3_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleComponentU_Impl"


    // $ANTLR start "entryRuleExistingComponent"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2629:1: entryRuleExistingComponent returns [EObject current=null] : iv_ruleExistingComponent= ruleExistingComponent EOF ;
    public final EObject entryRuleExistingComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingComponent = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2630:2: (iv_ruleExistingComponent= ruleExistingComponent EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2631:2: iv_ruleExistingComponent= ruleExistingComponent EOF
            {
             newCompositeNode(grammarAccess.getExistingComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExistingComponent_in_entryRuleExistingComponent5409);
            iv_ruleExistingComponent=ruleExistingComponent();

            state._fsp--;

             current =iv_ruleExistingComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExistingComponent5419); 

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
    // $ANTLR end "entryRuleExistingComponent"


    // $ANTLR start "ruleExistingComponent"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2638:1: ruleExistingComponent returns [EObject current=null] : ( () otherlv_1= 'ExistingComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'startDate' ( (lv_startDate_5_0= ruleEString ) ) )? (otherlv_6= 'endDate' ( (lv_endDate_7_0= ruleEString ) ) )? ) ;
    public final EObject ruleExistingComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_quantity_3_0 = null;

        AntlrDatatypeRuleToken lv_startDate_5_0 = null;

        AntlrDatatypeRuleToken lv_endDate_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2641:28: ( ( () otherlv_1= 'ExistingComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'startDate' ( (lv_startDate_5_0= ruleEString ) ) )? (otherlv_6= 'endDate' ( (lv_endDate_7_0= ruleEString ) ) )? ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2642:1: ( () otherlv_1= 'ExistingComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'startDate' ( (lv_startDate_5_0= ruleEString ) ) )? (otherlv_6= 'endDate' ( (lv_endDate_7_0= ruleEString ) ) )? )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2642:1: ( () otherlv_1= 'ExistingComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'startDate' ( (lv_startDate_5_0= ruleEString ) ) )? (otherlv_6= 'endDate' ( (lv_endDate_7_0= ruleEString ) ) )? )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2642:2: () otherlv_1= 'ExistingComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'startDate' ( (lv_startDate_5_0= ruleEString ) ) )? (otherlv_6= 'endDate' ( (lv_endDate_7_0= ruleEString ) ) )?
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2642:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2643:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExistingComponentAccess().getExistingComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleExistingComponent5465); 

                	newLeafNode(otherlv_1, grammarAccess.getExistingComponentAccess().getExistingComponentKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2652:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2653:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2653:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2654:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExistingComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExistingComponent5486);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExistingComponentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2670:2: ( (lv_quantity_3_0= ruleEIntegerObject ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_INT||LA81_0==37) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2671:1: (lv_quantity_3_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2671:1: (lv_quantity_3_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2672:3: lv_quantity_3_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistingComponentAccess().getQuantityEIntegerObjectParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleExistingComponent5507);
                    lv_quantity_3_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExistingComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"quantity",
                            		lv_quantity_3_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2688:3: (otherlv_4= 'startDate' ( (lv_startDate_5_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==19) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2688:5: otherlv_4= 'startDate' ( (lv_startDate_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExistingComponent5521); 

                        	newLeafNode(otherlv_4, grammarAccess.getExistingComponentAccess().getStartDateKeyword_4_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2692:1: ( (lv_startDate_5_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2693:1: (lv_startDate_5_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2693:1: (lv_startDate_5_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2694:3: lv_startDate_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistingComponentAccess().getStartDateEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExistingComponent5542);
                    lv_startDate_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExistingComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"startDate",
                            		lv_startDate_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2710:4: (otherlv_6= 'endDate' ( (lv_endDate_7_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==20) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2710:6: otherlv_6= 'endDate' ( (lv_endDate_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleExistingComponent5557); 

                        	newLeafNode(otherlv_6, grammarAccess.getExistingComponentAccess().getEndDateKeyword_5_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2714:1: ( (lv_endDate_7_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2715:1: (lv_endDate_7_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2715:1: (lv_endDate_7_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2716:3: lv_endDate_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getExistingComponentAccess().getEndDateEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExistingComponent5578);
                    lv_endDate_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExistingComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"endDate",
                            		lv_endDate_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleExistingComponent"


    // $ANTLR start "entryRuleAcquirableComponent"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2740:1: entryRuleAcquirableComponent returns [EObject current=null] : iv_ruleAcquirableComponent= ruleAcquirableComponent EOF ;
    public final EObject entryRuleAcquirableComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcquirableComponent = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2741:2: (iv_ruleAcquirableComponent= ruleAcquirableComponent EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2742:2: iv_ruleAcquirableComponent= ruleAcquirableComponent EOF
            {
             newCompositeNode(grammarAccess.getAcquirableComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAcquirableComponent_in_entryRuleAcquirableComponent5616);
            iv_ruleAcquirableComponent=ruleAcquirableComponent();

            state._fsp--;

             current =iv_ruleAcquirableComponent; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAcquirableComponent5626); 

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
    // $ANTLR end "entryRuleAcquirableComponent"


    // $ANTLR start "ruleAcquirableComponent"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2749:1: ruleAcquirableComponent returns [EObject current=null] : ( () otherlv_1= 'AcquirableComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'acquisitionTime' ( (lv_acquisitionTime_5_0= ruleEString ) ) )? (otherlv_6= 'lifeSpan' ( (lv_lifeSpan_7_0= ruleEString ) ) )? ) ;
    public final EObject ruleAcquirableComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_quantity_3_0 = null;

        AntlrDatatypeRuleToken lv_acquisitionTime_5_0 = null;

        AntlrDatatypeRuleToken lv_lifeSpan_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2752:28: ( ( () otherlv_1= 'AcquirableComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'acquisitionTime' ( (lv_acquisitionTime_5_0= ruleEString ) ) )? (otherlv_6= 'lifeSpan' ( (lv_lifeSpan_7_0= ruleEString ) ) )? ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2753:1: ( () otherlv_1= 'AcquirableComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'acquisitionTime' ( (lv_acquisitionTime_5_0= ruleEString ) ) )? (otherlv_6= 'lifeSpan' ( (lv_lifeSpan_7_0= ruleEString ) ) )? )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2753:1: ( () otherlv_1= 'AcquirableComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'acquisitionTime' ( (lv_acquisitionTime_5_0= ruleEString ) ) )? (otherlv_6= 'lifeSpan' ( (lv_lifeSpan_7_0= ruleEString ) ) )? )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2753:2: () otherlv_1= 'AcquirableComponent' ( (lv_name_2_0= ruleEString ) ) ( (lv_quantity_3_0= ruleEIntegerObject ) )? (otherlv_4= 'acquisitionTime' ( (lv_acquisitionTime_5_0= ruleEString ) ) )? (otherlv_6= 'lifeSpan' ( (lv_lifeSpan_7_0= ruleEString ) ) )?
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2753:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2754:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAcquirableComponentAccess().getAcquirableComponentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleAcquirableComponent5672); 

                	newLeafNode(otherlv_1, grammarAccess.getAcquirableComponentAccess().getAcquirableComponentKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2763:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2764:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2764:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2765:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAcquirableComponentAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAcquirableComponent5693);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAcquirableComponentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2781:2: ( (lv_quantity_3_0= ruleEIntegerObject ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_INT||LA84_0==37) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2782:1: (lv_quantity_3_0= ruleEIntegerObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2782:1: (lv_quantity_3_0= ruleEIntegerObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2783:3: lv_quantity_3_0= ruleEIntegerObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getAcquirableComponentAccess().getQuantityEIntegerObjectParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEIntegerObject_in_ruleAcquirableComponent5714);
                    lv_quantity_3_0=ruleEIntegerObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAcquirableComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"quantity",
                            		lv_quantity_3_0, 
                            		"EIntegerObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2799:3: (otherlv_4= 'acquisitionTime' ( (lv_acquisitionTime_5_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==59) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2799:5: otherlv_4= 'acquisitionTime' ( (lv_acquisitionTime_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleAcquirableComponent5728); 

                        	newLeafNode(otherlv_4, grammarAccess.getAcquirableComponentAccess().getAcquisitionTimeKeyword_4_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2803:1: ( (lv_acquisitionTime_5_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2804:1: (lv_acquisitionTime_5_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2804:1: (lv_acquisitionTime_5_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2805:3: lv_acquisitionTime_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAcquirableComponentAccess().getAcquisitionTimeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAcquirableComponent5749);
                    lv_acquisitionTime_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAcquirableComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"acquisitionTime",
                            		lv_acquisitionTime_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2821:4: (otherlv_6= 'lifeSpan' ( (lv_lifeSpan_7_0= ruleEString ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==60) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2821:6: otherlv_6= 'lifeSpan' ( (lv_lifeSpan_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleAcquirableComponent5764); 

                        	newLeafNode(otherlv_6, grammarAccess.getAcquirableComponentAccess().getLifeSpanKeyword_5_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2825:1: ( (lv_lifeSpan_7_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2826:1: (lv_lifeSpan_7_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2826:1: (lv_lifeSpan_7_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2827:3: lv_lifeSpan_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAcquirableComponentAccess().getLifeSpanEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAcquirableComponent5785);
                    lv_lifeSpan_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAcquirableComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"lifeSpan",
                            		lv_lifeSpan_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleAcquirableComponent"


    // $ANTLR start "entryRuleConstraint_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2851:1: entryRuleConstraint_Impl returns [EObject current=null] : iv_ruleConstraint_Impl= ruleConstraint_Impl EOF ;
    public final EObject entryRuleConstraint_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint_Impl = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2852:2: (iv_ruleConstraint_Impl= ruleConstraint_Impl EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2853:2: iv_ruleConstraint_Impl= ruleConstraint_Impl EOF
            {
             newCompositeNode(grammarAccess.getConstraint_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_Impl_in_entryRuleConstraint_Impl5823);
            iv_ruleConstraint_Impl=ruleConstraint_Impl();

            state._fsp--;

             current =iv_ruleConstraint_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint_Impl5833); 

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
    // $ANTLR end "entryRuleConstraint_Impl"


    // $ANTLR start "ruleConstraint_Impl"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2860:1: ruleConstraint_Impl returns [EObject current=null] : ( () otherlv_1= 'Constraint' ) ;
    public final EObject ruleConstraint_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2863:28: ( ( () otherlv_1= 'Constraint' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2864:1: ( () otherlv_1= 'Constraint' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2864:1: ( () otherlv_1= 'Constraint' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2864:2: () otherlv_1= 'Constraint'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2864:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2865:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstraint_ImplAccess().getConstraintAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleConstraint_Impl5879); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraint_ImplAccess().getConstraintKeyword_1());
                

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
    // $ANTLR end "ruleConstraint_Impl"


    // $ANTLR start "entryRuleDesireHigh"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2882:1: entryRuleDesireHigh returns [EObject current=null] : iv_ruleDesireHigh= ruleDesireHigh EOF ;
    public final EObject entryRuleDesireHigh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesireHigh = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2883:2: (iv_ruleDesireHigh= ruleDesireHigh EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2884:2: iv_ruleDesireHigh= ruleDesireHigh EOF
            {
             newCompositeNode(grammarAccess.getDesireHighRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDesireHigh_in_entryRuleDesireHigh5915);
            iv_ruleDesireHigh=ruleDesireHigh();

            state._fsp--;

             current =iv_ruleDesireHigh; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDesireHigh5925); 

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
    // $ANTLR end "entryRuleDesireHigh"


    // $ANTLR start "ruleDesireHigh"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2891:1: ruleDesireHigh returns [EObject current=null] : ( () otherlv_1= 'DesireHigh' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDesireHigh() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2894:28: ( ( () otherlv_1= 'DesireHigh' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2895:1: ( () otherlv_1= 'DesireHigh' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2895:1: ( () otherlv_1= 'DesireHigh' ( (lv_name_2_0= ruleEString ) ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2895:2: () otherlv_1= 'DesireHigh' ( (lv_name_2_0= ruleEString ) )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2895:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2896:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDesireHighAccess().getDesireHighAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleDesireHigh5971); 

                	newLeafNode(otherlv_1, grammarAccess.getDesireHighAccess().getDesireHighKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2905:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2906:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2906:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2907:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDesireHighAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDesireHigh5992);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesireHighRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
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
    // $ANTLR end "ruleDesireHigh"


    // $ANTLR start "entryRuleDesireLow"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2931:1: entryRuleDesireLow returns [EObject current=null] : iv_ruleDesireLow= ruleDesireLow EOF ;
    public final EObject entryRuleDesireLow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesireLow = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2932:2: (iv_ruleDesireLow= ruleDesireLow EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2933:2: iv_ruleDesireLow= ruleDesireLow EOF
            {
             newCompositeNode(grammarAccess.getDesireLowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDesireLow_in_entryRuleDesireLow6028);
            iv_ruleDesireLow=ruleDesireLow();

            state._fsp--;

             current =iv_ruleDesireLow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDesireLow6038); 

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
    // $ANTLR end "entryRuleDesireLow"


    // $ANTLR start "ruleDesireLow"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2940:1: ruleDesireLow returns [EObject current=null] : ( () otherlv_1= 'DesireLow' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDesireLow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2943:28: ( ( () otherlv_1= 'DesireLow' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2944:1: ( () otherlv_1= 'DesireLow' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2944:1: ( () otherlv_1= 'DesireLow' ( (lv_name_2_0= ruleEString ) ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2944:2: () otherlv_1= 'DesireLow' ( (lv_name_2_0= ruleEString ) )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2944:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2945:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDesireLowAccess().getDesireLowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleDesireLow6084); 

                	newLeafNode(otherlv_1, grammarAccess.getDesireLowAccess().getDesireLowKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2954:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2955:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2955:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2956:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDesireLowAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDesireLow6105);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesireLowRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
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
    // $ANTLR end "ruleDesireLow"


    // $ANTLR start "entryRuleBudget"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2980:1: entryRuleBudget returns [EObject current=null] : iv_ruleBudget= ruleBudget EOF ;
    public final EObject entryRuleBudget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBudget = null;


        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2981:2: (iv_ruleBudget= ruleBudget EOF )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2982:2: iv_ruleBudget= ruleBudget EOF
            {
             newCompositeNode(grammarAccess.getBudgetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBudget_in_entryRuleBudget6141);
            iv_ruleBudget=ruleBudget();

            state._fsp--;

             current =iv_ruleBudget; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBudget6151); 

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
    // $ANTLR end "entryRuleBudget"


    // $ANTLR start "ruleBudget"
    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2989:1: ruleBudget returns [EObject current=null] : ( () otherlv_1= 'Budget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'startDate' ( (lv_startDate_7_0= ruleEString ) ) )? (otherlv_8= 'repeatDuration' ( (lv_repeatDuration_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleBudget() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        AntlrDatatypeRuleToken lv_startDate_7_0 = null;

        AntlrDatatypeRuleToken lv_repeatDuration_9_0 = null;

        AntlrDatatypeRuleToken lv_endDate_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2992:28: ( ( () otherlv_1= 'Budget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'startDate' ( (lv_startDate_7_0= ruleEString ) ) )? (otherlv_8= 'repeatDuration' ( (lv_repeatDuration_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? otherlv_12= '}' ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2993:1: ( () otherlv_1= 'Budget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'startDate' ( (lv_startDate_7_0= ruleEString ) ) )? (otherlv_8= 'repeatDuration' ( (lv_repeatDuration_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? otherlv_12= '}' )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2993:1: ( () otherlv_1= 'Budget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'startDate' ( (lv_startDate_7_0= ruleEString ) ) )? (otherlv_8= 'repeatDuration' ( (lv_repeatDuration_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? otherlv_12= '}' )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2993:2: () otherlv_1= 'Budget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEFloatOurObject ) ) )? (otherlv_6= 'startDate' ( (lv_startDate_7_0= ruleEString ) ) )? (otherlv_8= 'repeatDuration' ( (lv_repeatDuration_9_0= ruleEString ) ) )? (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )? otherlv_12= '}'
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2993:2: ()
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:2994:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBudgetAccess().getBudgetAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleBudget6197); 

                	newLeafNode(otherlv_1, grammarAccess.getBudgetAccess().getBudgetKeyword_1());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3003:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3004:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3004:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3005:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBudgetAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBudget6218);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBudgetRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBudget6230); 

                	newLeafNode(otherlv_3, grammarAccess.getBudgetAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3025:1: (otherlv_4= 'amount' ( (lv_amount_5_0= ruleEFloatOurObject ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==65) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3025:3: otherlv_4= 'amount' ( (lv_amount_5_0= ruleEFloatOurObject ) )
                    {
                    otherlv_4=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleBudget6243); 

                        	newLeafNode(otherlv_4, grammarAccess.getBudgetAccess().getAmountKeyword_4_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3029:1: ( (lv_amount_5_0= ruleEFloatOurObject ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3030:1: (lv_amount_5_0= ruleEFloatOurObject )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3030:1: (lv_amount_5_0= ruleEFloatOurObject )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3031:3: lv_amount_5_0= ruleEFloatOurObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getBudgetAccess().getAmountEFloatOurObjectParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloatOurObject_in_ruleBudget6264);
                    lv_amount_5_0=ruleEFloatOurObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBudgetRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_5_0, 
                            		"EFloatOurObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3047:4: (otherlv_6= 'startDate' ( (lv_startDate_7_0= ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==19) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3047:6: otherlv_6= 'startDate' ( (lv_startDate_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBudget6279); 

                        	newLeafNode(otherlv_6, grammarAccess.getBudgetAccess().getStartDateKeyword_5_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3051:1: ( (lv_startDate_7_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3052:1: (lv_startDate_7_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3052:1: (lv_startDate_7_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3053:3: lv_startDate_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBudgetAccess().getStartDateEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBudget6300);
                    lv_startDate_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBudgetRule());
                    	        }
                           		set(
                           			current, 
                           			"startDate",
                            		lv_startDate_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3069:4: (otherlv_8= 'repeatDuration' ( (lv_repeatDuration_9_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==54) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3069:6: otherlv_8= 'repeatDuration' ( (lv_repeatDuration_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleBudget6315); 

                        	newLeafNode(otherlv_8, grammarAccess.getBudgetAccess().getRepeatDurationKeyword_6_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3073:1: ( (lv_repeatDuration_9_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3074:1: (lv_repeatDuration_9_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3074:1: (lv_repeatDuration_9_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3075:3: lv_repeatDuration_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBudgetAccess().getRepeatDurationEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBudget6336);
                    lv_repeatDuration_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBudgetRule());
                    	        }
                           		set(
                           			current, 
                           			"repeatDuration",
                            		lv_repeatDuration_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3091:4: (otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==20) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3091:6: otherlv_10= 'endDate' ( (lv_endDate_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBudget6351); 

                        	newLeafNode(otherlv_10, grammarAccess.getBudgetAccess().getEndDateKeyword_7_0());
                        
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3095:1: ( (lv_endDate_11_0= ruleEString ) )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3096:1: (lv_endDate_11_0= ruleEString )
                    {
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3096:1: (lv_endDate_11_0= ruleEString )
                    // ../org.xtext.Scenario/src-gen/org/xtext/parser/antlr/internal/InternalScenario.g:3097:3: lv_endDate_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBudgetAccess().getEndDateEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBudget6372);
                    lv_endDate_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBudgetRule());
                    	        }
                           		set(
                           			current, 
                           			"endDate",
                            		lv_endDate_11_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBudget6386); 

                	newLeafNode(otherlv_12, grammarAccess.getBudgetAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleBudget"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA3_eotS =
        "\12\uffff";
    static final String DFA3_eofS =
        "\12\uffff";
    static final String DFA3_minS =
        "\1\13\2\uffff\1\16\6\uffff";
    static final String DFA3_maxS =
        "\1\44\2\uffff\1\33\6\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA3_specialS =
        "\12\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\2\1\3\2\2\13\uffff\1\4\1\5\2\uffff\1\6\1\7\2\uffff\1"+
            "\10\1\11",
            "",
            "",
            "\2\2\13\uffff\1\4",
            "",
            "",
            "",
            "",
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

    class DFA3 extends DFA {

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
        public String getDescription() {
            return "143:1: (this_OurObject_Impl_0= ruleOurObject_Impl | this_Capability_Impl_1= ruleCapability_Impl | this_CapabilityProvision_2= ruleCapabilityProvision | this_QualitativeValueDictionary_3= ruleQualitativeValueDictionary | this_Component_4= ruleComponent | this_RunConfiguration_Impl_5= ruleRunConfiguration_Impl | this_FindTradeOffs_6= ruleFindTradeOffs | this_ThroughLifePlanning_7= ruleThroughLifePlanning )";
        }
    }
    static final String DFA29_eotS =
        "\u0087\uffff";
    static final String DFA29_eofS =
        "\u0087\uffff";
    static final String DFA29_minS =
        "\1\14\1\16\1\4\1\uffff\2\20\1\21\1\6\3\4\1\uffff\1\6\1\23\2\24\2"+
        "\32\2\20\1\32\3\6\3\26\1\4\1\32\1\6\1\56\2\6\1\56\2\6\1\56\1\6\3"+
        "\4\2\32\1\4\3\32\6\27\2\20\6\6\1\4\1\32\1\4\1\32\1\4\2\32\1\6\1"+
        "\32\1\6\1\32\1\6\1\32\6\27\3\6\3\26\1\4\1\32\1\6\1\56\2\6\1\56\2"+
        "\6\1\56\1\6\3\4\5\32\6\27\6\6\1\4\1\32\1\4\1\32\1\4\1\32\1\6\1\32"+
        "\1\6\1\32\1\6\1\32\6\27";
    static final String DFA29_maxS =
        "\1\64\1\33\1\5\1\uffff\2\20\1\46\1\45\3\5\1\uffff\1\6\5\46\2\20"+
        "\1\55\3\56\3\26\1\5\1\46\2\56\1\6\2\56\1\6\2\56\1\6\3\5\2\32\1\5"+
        "\3\60\6\30\2\20\6\45\1\5\1\55\1\5\1\55\1\5\2\55\1\6\1\55\1\6\1\55"+
        "\1\6\1\55\6\30\3\56\3\26\1\5\1\46\2\56\1\6\2\56\1\6\2\56\1\6\3\5"+
        "\2\32\3\60\6\30\6\45\1\5\1\55\1\5\1\55\1\5\1\55\1\6\1\55\1\6\1\55"+
        "\1\6\1\55\6\30";
    static final String DFA29_acceptS =
        "\3\uffff\1\2\7\uffff\1\1\173\uffff";
    static final String DFA29_specialS =
        "\u0087\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\3\1\1\2\3\12\uffff\1\3\1\2\25\uffff\1\3\2\uffff\1\3",
            "\2\3\13\uffff\1\2",
            "\1\4\1\5",
            "",
            "\1\6",
            "\1\6",
            "\1\7\1\uffff\1\10\1\11\5\uffff\1\13\13\uffff\1\12",
            "\1\15\36\uffff\1\14",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\22\1\23",
            "",
            "\1\15",
            "\1\10\1\11\5\uffff\1\13\13\uffff\1\12",
            "\1\11\5\uffff\1\13\13\uffff\1\12",
            "\1\11\5\uffff\1\13\13\uffff\1\12",
            "\1\13\13\uffff\1\12",
            "\1\13\13\uffff\1\12",
            "\1\24",
            "\1\24",
            "\1\34\14\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33",
            "\1\36\36\uffff\1\35\10\uffff\1\37",
            "\1\41\36\uffff\1\40\10\uffff\1\42",
            "\1\44\36\uffff\1\43\10\uffff\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51\1\52",
            "\1\13\13\uffff\1\53",
            "\1\36\47\uffff\1\37",
            "\1\37",
            "\1\54",
            "\1\41\47\uffff\1\42",
            "\1\42",
            "\1\55",
            "\1\44\47\uffff\1\45",
            "\1\45",
            "\1\56",
            "\1\57\1\60",
            "\1\61\1\62",
            "\1\63\1\64",
            "\1\34",
            "\1\34",
            "\1\65\1\66",
            "\1\34\15\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\67\1"+
            "\70",
            "\1\34\16\uffff\1\27\1\30\1\31\1\32\1\33\1\uffff\1\71\1\72",
            "\1\34\17\uffff\1\30\1\31\1\32\1\33\1\uffff\1\73\1\74",
            "\1\75\1\76",
            "\1\75\1\76",
            "\1\77\1\100",
            "\1\77\1\100",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\103",
            "\1\103",
            "\1\105\36\uffff\1\104",
            "\1\105\36\uffff\1\104",
            "\1\107\36\uffff\1\106",
            "\1\107\36\uffff\1\106",
            "\1\111\36\uffff\1\110",
            "\1\111\36\uffff\1\110",
            "\1\112\1\113",
            "\1\34\20\uffff\1\31\1\32\1\33",
            "\1\114\1\115",
            "\1\34\21\uffff\1\32\1\33",
            "\1\116\1\117",
            "\1\34\22\uffff\1\33",
            "\1\127\14\uffff\1\120\1\121\1\122\1\123\1\124\1\125\1\126",
            "\1\105",
            "\1\34\15\uffff\1\26\1\27\1\30\1\31\1\32\1\33",
            "\1\107",
            "\1\34\16\uffff\1\27\1\30\1\31\1\32\1\33",
            "\1\111",
            "\1\34\17\uffff\1\30\1\31\1\32\1\33",
            "\1\75\1\76",
            "\1\75\1\76",
            "\1\77\1\100",
            "\1\77\1\100",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\131\36\uffff\1\130\10\uffff\1\132",
            "\1\134\36\uffff\1\133\10\uffff\1\135",
            "\1\137\36\uffff\1\136\10\uffff\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144\1\145",
            "\1\13\13\uffff\1\53",
            "\1\131\47\uffff\1\132",
            "\1\132",
            "\1\146",
            "\1\134\47\uffff\1\135",
            "\1\135",
            "\1\147",
            "\1\137\47\uffff\1\140",
            "\1\140",
            "\1\150",
            "\1\151\1\152",
            "\1\153\1\154",
            "\1\155\1\156",
            "\1\127",
            "\1\127",
            "\1\127\15\uffff\1\121\1\122\1\123\1\124\1\125\1\126\1\uffff"+
            "\1\157\1\160",
            "\1\127\16\uffff\1\122\1\123\1\124\1\125\1\126\1\uffff\1\161"+
            "\1\162",
            "\1\127\17\uffff\1\123\1\124\1\125\1\126\1\uffff\1\163\1\164",
            "\1\165\1\166",
            "\1\165\1\166",
            "\1\167\1\170",
            "\1\167\1\170",
            "\1\171\1\172",
            "\1\171\1\172",
            "\1\174\36\uffff\1\173",
            "\1\174\36\uffff\1\173",
            "\1\176\36\uffff\1\175",
            "\1\176\36\uffff\1\175",
            "\1\u0080\36\uffff\1\177",
            "\1\u0080\36\uffff\1\177",
            "\1\u0081\1\u0082",
            "\1\127\20\uffff\1\124\1\125\1\126",
            "\1\u0083\1\u0084",
            "\1\127\21\uffff\1\125\1\126",
            "\1\u0085\1\u0086",
            "\1\127\22\uffff\1\126",
            "\1\174",
            "\1\127\15\uffff\1\121\1\122\1\123\1\124\1\125\1\126",
            "\1\176",
            "\1\127\16\uffff\1\122\1\123\1\124\1\125\1\126",
            "\1\u0080",
            "\1\127\17\uffff\1\123\1\124\1\125\1\126",
            "\1\165\1\166",
            "\1\165\1\166",
            "\1\167\1\170",
            "\1\167\1\170",
            "\1\171\1\172",
            "\1\171\1\172"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1056:1: ( ( (lv_provides_4_0= ruleCapabilityProvision ) ) ( (lv_provides_5_0= ruleCapabilityProvision ) )* )?";
        }
    }
    static final String DFA28_eotS =
        "\u0087\uffff";
    static final String DFA28_eofS =
        "\u0087\uffff";
    static final String DFA28_minS =
        "\1\14\1\uffff\1\16\1\4\2\20\1\21\1\6\3\4\1\uffff\1\6\1\23\2\24\2"+
        "\32\2\20\1\32\3\6\3\26\1\4\1\32\1\6\1\56\2\6\1\56\2\6\1\56\1\6\3"+
        "\4\2\32\1\4\3\32\6\27\2\20\6\6\1\4\1\32\1\4\1\32\1\4\2\32\1\6\1"+
        "\32\1\6\1\32\1\6\1\32\6\27\3\6\3\26\1\4\1\32\1\6\1\56\2\6\1\56\2"+
        "\6\1\56\1\6\3\4\5\32\6\27\6\6\1\4\1\32\1\4\1\32\1\4\1\32\1\6\1\32"+
        "\1\6\1\32\1\6\1\32\6\27";
    static final String DFA28_maxS =
        "\1\64\1\uffff\1\33\1\5\2\20\1\46\1\45\3\5\1\uffff\1\6\5\46\2\20"+
        "\1\55\3\56\3\26\1\5\1\46\2\56\1\6\2\56\1\6\2\56\1\6\3\5\2\32\1\5"+
        "\3\60\6\30\2\20\6\45\1\5\1\55\1\5\1\55\1\5\2\55\1\6\1\55\1\6\1\55"+
        "\1\6\1\55\6\30\3\56\3\26\1\5\1\46\2\56\1\6\2\56\1\6\2\56\1\6\3\5"+
        "\2\32\3\60\6\30\6\45\1\5\1\55\1\5\1\55\1\5\1\55\1\6\1\55\1\6\1\55"+
        "\1\6\1\55\6\30";
    static final String DFA28_acceptS =
        "\1\uffff\1\2\11\uffff\1\1\173\uffff";
    static final String DFA28_specialS =
        "\u0087\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\1\2\2\1\12\uffff\1\1\1\3\25\uffff\1\1\2\uffff\1\1",
            "",
            "\2\1\13\uffff\1\3",
            "\1\4\1\5",
            "\1\6",
            "\1\6",
            "\1\7\1\uffff\1\10\1\11\5\uffff\1\13\13\uffff\1\12",
            "\1\15\36\uffff\1\14",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\22\1\23",
            "",
            "\1\15",
            "\1\10\1\11\5\uffff\1\13\13\uffff\1\12",
            "\1\11\5\uffff\1\13\13\uffff\1\12",
            "\1\11\5\uffff\1\13\13\uffff\1\12",
            "\1\13\13\uffff\1\12",
            "\1\13\13\uffff\1\12",
            "\1\24",
            "\1\24",
            "\1\34\14\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33",
            "\1\36\36\uffff\1\35\10\uffff\1\37",
            "\1\41\36\uffff\1\40\10\uffff\1\42",
            "\1\44\36\uffff\1\43\10\uffff\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51\1\52",
            "\1\13\13\uffff\1\53",
            "\1\36\47\uffff\1\37",
            "\1\37",
            "\1\54",
            "\1\41\47\uffff\1\42",
            "\1\42",
            "\1\55",
            "\1\44\47\uffff\1\45",
            "\1\45",
            "\1\56",
            "\1\57\1\60",
            "\1\61\1\62",
            "\1\63\1\64",
            "\1\34",
            "\1\34",
            "\1\65\1\66",
            "\1\34\15\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\67\1"+
            "\70",
            "\1\34\16\uffff\1\27\1\30\1\31\1\32\1\33\1\uffff\1\71\1\72",
            "\1\34\17\uffff\1\30\1\31\1\32\1\33\1\uffff\1\73\1\74",
            "\1\75\1\76",
            "\1\75\1\76",
            "\1\77\1\100",
            "\1\77\1\100",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\103",
            "\1\103",
            "\1\105\36\uffff\1\104",
            "\1\105\36\uffff\1\104",
            "\1\107\36\uffff\1\106",
            "\1\107\36\uffff\1\106",
            "\1\111\36\uffff\1\110",
            "\1\111\36\uffff\1\110",
            "\1\112\1\113",
            "\1\34\20\uffff\1\31\1\32\1\33",
            "\1\114\1\115",
            "\1\34\21\uffff\1\32\1\33",
            "\1\116\1\117",
            "\1\34\22\uffff\1\33",
            "\1\127\14\uffff\1\120\1\121\1\122\1\123\1\124\1\125\1\126",
            "\1\105",
            "\1\34\15\uffff\1\26\1\27\1\30\1\31\1\32\1\33",
            "\1\107",
            "\1\34\16\uffff\1\27\1\30\1\31\1\32\1\33",
            "\1\111",
            "\1\34\17\uffff\1\30\1\31\1\32\1\33",
            "\1\75\1\76",
            "\1\75\1\76",
            "\1\77\1\100",
            "\1\77\1\100",
            "\1\101\1\102",
            "\1\101\1\102",
            "\1\131\36\uffff\1\130\10\uffff\1\132",
            "\1\134\36\uffff\1\133\10\uffff\1\135",
            "\1\137\36\uffff\1\136\10\uffff\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144\1\145",
            "\1\13\13\uffff\1\53",
            "\1\131\47\uffff\1\132",
            "\1\132",
            "\1\146",
            "\1\134\47\uffff\1\135",
            "\1\135",
            "\1\147",
            "\1\137\47\uffff\1\140",
            "\1\140",
            "\1\150",
            "\1\151\1\152",
            "\1\153\1\154",
            "\1\155\1\156",
            "\1\127",
            "\1\127",
            "\1\127\15\uffff\1\121\1\122\1\123\1\124\1\125\1\126\1\uffff"+
            "\1\157\1\160",
            "\1\127\16\uffff\1\122\1\123\1\124\1\125\1\126\1\uffff\1\161"+
            "\1\162",
            "\1\127\17\uffff\1\123\1\124\1\125\1\126\1\uffff\1\163\1\164",
            "\1\165\1\166",
            "\1\165\1\166",
            "\1\167\1\170",
            "\1\167\1\170",
            "\1\171\1\172",
            "\1\171\1\172",
            "\1\174\36\uffff\1\173",
            "\1\174\36\uffff\1\173",
            "\1\176\36\uffff\1\175",
            "\1\176\36\uffff\1\175",
            "\1\u0080\36\uffff\1\177",
            "\1\u0080\36\uffff\1\177",
            "\1\u0081\1\u0082",
            "\1\127\20\uffff\1\124\1\125\1\126",
            "\1\u0083\1\u0084",
            "\1\127\21\uffff\1\125\1\126",
            "\1\u0085\1\u0086",
            "\1\127\22\uffff\1\126",
            "\1\174",
            "\1\127\15\uffff\1\121\1\122\1\123\1\124\1\125\1\126",
            "\1\176",
            "\1\127\16\uffff\1\122\1\123\1\124\1\125\1\126",
            "\1\u0080",
            "\1\127\17\uffff\1\123\1\124\1\125\1\126",
            "\1\165\1\166",
            "\1\165\1\166",
            "\1\167\1\170",
            "\1\167\1\170",
            "\1\171\1\172",
            "\1\171\1\172"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 1074:2: ( (lv_provides_5_0= ruleCapabilityProvision ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleScenario85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOurObject_in_ruleScenario141 = new BitSet(new long[]{0x000000199800F802L});
        public static final BitSet FOLLOW_ruleOurObject_in_ruleScenario162 = new BitSet(new long[]{0x000000199800F802L});
        public static final BitSet FOLLOW_ruleOurObject_in_entryRuleOurObject201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOurObject211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOurObject_Impl_in_ruleOurObject258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapability_Impl_in_ruleOurObject285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapabilityProvision_in_ruleOurObject312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualitativeValueDictionary_in_ruleOurObject339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponent_in_ruleOurObject366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRunConfiguration_Impl_in_ruleOurObject393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFindTradeOffs_in_ruleOurObject420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleThroughLifePlanning_in_ruleOurObject447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapability_in_entryRuleCapability482 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCapability492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapability_Impl_in_ruleCapability539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapabilityProvision_in_ruleCapability566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCost_in_entryRuleCost601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCost611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCost_Impl_in_ruleCost657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentU_in_entryRuleComponentU691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentU701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentU_Impl_in_ruleComponentU748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistingComponent_in_ruleComponentU775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAcquirableComponent_in_ruleComponentU802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_Impl_in_ruleConstraint894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDesireHigh_in_ruleConstraint921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDesireLow_in_ruleConstraint948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBudget_in_ruleConstraint975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOurObject_Impl_in_entryRuleOurObject_Impl1010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOurObject_Impl1020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleOurObject_Impl1066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapability_Impl_in_entryRuleCapability_Impl1102 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCapability_Impl1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleCapability_Impl1164 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_13_in_ruleCapability_Impl1196 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleCapability_Impl1228 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCapability_Impl1254 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapability_Impl1275 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCapability_Impl1287 = new BitSet(new long[]{0x00000040063E0000L});
        public static final BitSet FOLLOW_17_in_ruleCapability_Impl1300 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleCapability_Impl1321 = new BitSet(new long[]{0x00000040063C0000L});
        public static final BitSet FOLLOW_18_in_ruleCapability_Impl1336 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapability_Impl1359 = new BitSet(new long[]{0x0000004006380000L});
        public static final BitSet FOLLOW_19_in_ruleCapability_Impl1374 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapability_Impl1395 = new BitSet(new long[]{0x0000004006300000L});
        public static final BitSet FOLLOW_20_in_ruleCapability_Impl1410 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapability_Impl1431 = new BitSet(new long[]{0x0000004006200000L});
        public static final BitSet FOLLOW_ruleMeasurement_in_ruleCapability_Impl1455 = new BitSet(new long[]{0x0000004006200000L});
        public static final BitSet FOLLOW_ruleMeasurement_in_ruleCapability_Impl1476 = new BitSet(new long[]{0x0000004006200000L});
        public static final BitSet FOLLOW_21_in_ruleCapability_Impl1492 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCapability_Impl1504 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapability_Impl1527 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleCapability_Impl1540 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapability_Impl1563 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleCapability_Impl1577 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_25_in_ruleCapability_Impl1592 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCapability_Impl1604 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapability_Impl1627 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleCapability_Impl1640 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapability_Impl1663 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleCapability_Impl1677 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleCapability_Impl1691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapabilityProvision_in_entryRuleCapabilityProvision1727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCapabilityProvision1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleCapabilityProvision1789 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleCapabilityProvision1815 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapabilityProvision1836 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCapabilityProvision1848 = new BitSet(new long[]{0x00000040041A0000L});
        public static final BitSet FOLLOW_17_in_ruleCapabilityProvision1861 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleCapabilityProvision1882 = new BitSet(new long[]{0x0000004004180000L});
        public static final BitSet FOLLOW_19_in_ruleCapabilityProvision1897 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapabilityProvision1918 = new BitSet(new long[]{0x0000004004100000L});
        public static final BitSet FOLLOW_20_in_ruleCapabilityProvision1933 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapabilityProvision1954 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_ruleMeasurement_in_ruleCapabilityProvision1978 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_ruleMeasurement_in_ruleCapabilityProvision1999 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_26_in_ruleCapabilityProvision2014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualitativeValueDictionary_in_entryRuleQualitativeValueDictionary2050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeValueDictionary2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleQualitativeValueDictionary2097 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQualitativeValueDictionary2118 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_29_in_ruleQualitativeValueDictionary2131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQualitativeValueDictionary2154 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleQualitativeValueDictionary2169 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQualitativeValueDictionary2192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent2230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponent2240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleComponent2286 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponent2307 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleComponent2319 = new BitSet(new long[]{0x001200000C00F000L});
        public static final BitSet FOLLOW_ruleCapabilityProvision_in_ruleComponent2341 = new BitSet(new long[]{0x001200000C00F000L});
        public static final BitSet FOLLOW_ruleCapabilityProvision_in_ruleComponent2362 = new BitSet(new long[]{0x001200000C00F000L});
        public static final BitSet FOLLOW_ruleCapabilityUpgrade_in_ruleComponent2387 = new BitSet(new long[]{0x001200000C00F000L});
        public static final BitSet FOLLOW_ruleCapabilityUpgrade_in_ruleComponent2408 = new BitSet(new long[]{0x001200000C00F000L});
        public static final BitSet FOLLOW_ruleCapability_in_ruleComponent2433 = new BitSet(new long[]{0x001000000C00F000L});
        public static final BitSet FOLLOW_ruleCapability_in_ruleComponent2454 = new BitSet(new long[]{0x001000000C00F000L});
        public static final BitSet FOLLOW_ruleCost_in_ruleComponent2479 = new BitSet(new long[]{0x0010000004000000L});
        public static final BitSet FOLLOW_ruleCost_in_ruleComponent2500 = new BitSet(new long[]{0x0010000004000000L});
        public static final BitSet FOLLOW_26_in_ruleComponent2515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRunConfiguration_Impl_in_entryRuleRunConfiguration_Impl2551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRunConfiguration_Impl2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleRunConfiguration_Impl2607 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRunConfiguration_Impl2628 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRunConfiguration_Impl2640 = new BitSet(new long[]{0x0000000604000000L});
        public static final BitSet FOLLOW_33_in_ruleRunConfiguration_Impl2653 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleRunConfiguration_Impl2674 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_34_in_ruleRunConfiguration_Impl2689 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleRunConfiguration_Impl2710 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleRunConfiguration_Impl2724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFindTradeOffs_in_entryRuleFindTradeOffs2760 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFindTradeOffs2770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleFindTradeOffs2816 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFindTradeOffs2837 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFindTradeOffs2849 = new BitSet(new long[]{0xE600000684000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_33_in_ruleFindTradeOffs2862 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleFindTradeOffs2883 = new BitSet(new long[]{0xE600000484000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_34_in_ruleFindTradeOffs2898 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleFindTradeOffs2919 = new BitSet(new long[]{0xE600000084000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleComponentU_in_ruleFindTradeOffs2943 = new BitSet(new long[]{0xE600000084000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleComponentU_in_ruleFindTradeOffs2964 = new BitSet(new long[]{0xE600000084000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleFindTradeOffs2989 = new BitSet(new long[]{0xE000000004000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleFindTradeOffs3010 = new BitSet(new long[]{0xE000000004000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_26_in_ruleFindTradeOffs3025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleThroughLifePlanning_in_entryRuleThroughLifePlanning3061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleThroughLifePlanning3071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleThroughLifePlanning3117 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleThroughLifePlanning3138 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleThroughLifePlanning3150 = new BitSet(new long[]{0xE600000684180000L,0x0000000000000001L});
        public static final BitSet FOLLOW_33_in_ruleThroughLifePlanning3163 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleThroughLifePlanning3184 = new BitSet(new long[]{0xE600000484180000L,0x0000000000000001L});
        public static final BitSet FOLLOW_34_in_ruleThroughLifePlanning3199 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleThroughLifePlanning3220 = new BitSet(new long[]{0xE600000084180000L,0x0000000000000001L});
        public static final BitSet FOLLOW_19_in_ruleThroughLifePlanning3235 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleThroughLifePlanning3256 = new BitSet(new long[]{0xE600000084100000L,0x0000000000000001L});
        public static final BitSet FOLLOW_20_in_ruleThroughLifePlanning3271 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleThroughLifePlanning3292 = new BitSet(new long[]{0xE600000084000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleComponentU_in_ruleThroughLifePlanning3316 = new BitSet(new long[]{0xE600000084000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleComponentU_in_ruleThroughLifePlanning3337 = new BitSet(new long[]{0xE600000084000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleThroughLifePlanning3362 = new BitSet(new long[]{0xE000000004000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleThroughLifePlanning3383 = new BitSet(new long[]{0xE000000004000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_26_in_ruleThroughLifePlanning3398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString3435 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString3446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString3486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString3512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject3560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject3571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEIntegerObject3610 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject3627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeasurement_in_entryRuleMeasurement3672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeasurement3682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMeasurement3728 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMeasurement3749 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMeasurement3761 = new BitSet(new long[]{0x00003F8004000000L});
        public static final BitSet FOLLOW_39_in_ruleMeasurement3774 = new BitSet(new long[]{0x0000402000000040L});
        public static final BitSet FOLLOW_ruleEFloatOurObject_in_ruleMeasurement3795 = new BitSet(new long[]{0x00003F0004000000L});
        public static final BitSet FOLLOW_40_in_ruleMeasurement3810 = new BitSet(new long[]{0x0000402000000040L});
        public static final BitSet FOLLOW_ruleEFloatOurObject_in_ruleMeasurement3831 = new BitSet(new long[]{0x00003E0004000000L});
        public static final BitSet FOLLOW_41_in_ruleMeasurement3846 = new BitSet(new long[]{0x0000402000000040L});
        public static final BitSet FOLLOW_ruleEFloatOurObject_in_ruleMeasurement3867 = new BitSet(new long[]{0x00003C0004000000L});
        public static final BitSet FOLLOW_42_in_ruleMeasurement3882 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMeasurement3894 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQualitativeValue_in_ruleMeasurement3915 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleMeasurement3928 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQualitativeValue_in_ruleMeasurement3949 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleMeasurement3963 = new BitSet(new long[]{0x0000380004000000L});
        public static final BitSet FOLLOW_43_in_ruleMeasurement3978 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMeasurement3990 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQualitativeValue_in_ruleMeasurement4011 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleMeasurement4024 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQualitativeValue_in_ruleMeasurement4045 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleMeasurement4059 = new BitSet(new long[]{0x0000300004000000L});
        public static final BitSet FOLLOW_44_in_ruleMeasurement4074 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMeasurement4086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQualitativeValue_in_ruleMeasurement4107 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleMeasurement4120 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleQualitativeValue_in_ruleMeasurement4141 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_24_in_ruleMeasurement4155 = new BitSet(new long[]{0x0000200004000000L});
        public static final BitSet FOLLOW_45_in_ruleMeasurement4170 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMeasurement4191 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleMeasurement4205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloatOurObject_in_entryRuleEFloatOurObject4242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloatOurObject4253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleEFloatOurObject4292 = new BitSet(new long[]{0x0000400000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatOurObject4310 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleEFloatOurObject4330 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatOurObject4345 = new BitSet(new long[]{0x0001800000000002L});
        public static final BitSet FOLLOW_47_in_ruleEFloatOurObject4365 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_48_in_ruleEFloatOurObject4384 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_37_in_ruleEFloatOurObject4399 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatOurObject4416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualitativeValue_in_entryRuleQualitativeValue4463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeValue4473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQualitativeValue4528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapabilityUpgrade_in_entryRuleCapabilityUpgrade4564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCapabilityUpgrade4574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleCapabilityUpgrade4620 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapabilityUpgrade4641 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCapabilityUpgrade4653 = new BitSet(new long[]{0x010C000004000000L});
        public static final BitSet FOLLOW_50_in_ruleCapabilityUpgrade4666 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapabilityUpgrade4687 = new BitSet(new long[]{0x0108000004000000L});
        public static final BitSet FOLLOW_51_in_ruleCapabilityUpgrade4702 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapabilityUpgrade4725 = new BitSet(new long[]{0x0100000004000000L});
        public static final BitSet FOLLOW_ruleCapabilityChange_in_ruleCapabilityUpgrade4749 = new BitSet(new long[]{0x0100000004000000L});
        public static final BitSet FOLLOW_ruleCapabilityChange_in_ruleCapabilityUpgrade4770 = new BitSet(new long[]{0x0100000004000000L});
        public static final BitSet FOLLOW_26_in_ruleCapabilityUpgrade4785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCost_Impl_in_entryRuleCost_Impl4821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCost_Impl4831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleCost_Impl4877 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCost_Impl4898 = new BitSet(new long[]{0x0000402000010042L});
        public static final BitSet FOLLOW_ruleEFloatOurObject_in_ruleCost_Impl4919 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleCost_Impl4933 = new BitSet(new long[]{0x00E0000004000000L});
        public static final BitSet FOLLOW_53_in_ruleCost_Impl4946 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCost_Impl4967 = new BitSet(new long[]{0x00C0000004000000L});
        public static final BitSet FOLLOW_54_in_ruleCost_Impl4982 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCost_Impl5003 = new BitSet(new long[]{0x0080000004000000L});
        public static final BitSet FOLLOW_55_in_ruleCost_Impl5018 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCost_Impl5039 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleCost_Impl5053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCapabilityChange_in_entryRuleCapabilityChange5091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCapabilityChange5101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleCapabilityChange5147 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCapabilityChange5168 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCapabilityChange5180 = new BitSet(new long[]{0x000000000C002000L});
        public static final BitSet FOLLOW_ruleCapabilityProvision_in_ruleCapabilityChange5202 = new BitSet(new long[]{0x000000000C002000L});
        public static final BitSet FOLLOW_ruleCapabilityProvision_in_ruleCapabilityChange5223 = new BitSet(new long[]{0x000000000C002000L});
        public static final BitSet FOLLOW_26_in_ruleCapabilityChange5238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentU_Impl_in_entryRuleComponentU_Impl5274 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentU_Impl5284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleComponentU_Impl5330 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComponentU_Impl5351 = new BitSet(new long[]{0x0000002000000042L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleComponentU_Impl5372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistingComponent_in_entryRuleExistingComponent5409 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExistingComponent5419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleExistingComponent5465 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExistingComponent5486 = new BitSet(new long[]{0x0000002000180042L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleExistingComponent5507 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_19_in_ruleExistingComponent5521 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExistingComponent5542 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleExistingComponent5557 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExistingComponent5578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAcquirableComponent_in_entryRuleAcquirableComponent5616 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAcquirableComponent5626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleAcquirableComponent5672 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAcquirableComponent5693 = new BitSet(new long[]{0x1800002000000042L});
        public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleAcquirableComponent5714 = new BitSet(new long[]{0x1800000000000002L});
        public static final BitSet FOLLOW_59_in_ruleAcquirableComponent5728 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAcquirableComponent5749 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleAcquirableComponent5764 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAcquirableComponent5785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_Impl_in_entryRuleConstraint_Impl5823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint_Impl5833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleConstraint_Impl5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDesireHigh_in_entryRuleDesireHigh5915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDesireHigh5925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleDesireHigh5971 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDesireHigh5992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDesireLow_in_entryRuleDesireLow6028 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDesireLow6038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleDesireLow6084 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDesireLow6105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBudget_in_entryRuleBudget6141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBudget6151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleBudget6197 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBudget6218 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBudget6230 = new BitSet(new long[]{0x0040000004180000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleBudget6243 = new BitSet(new long[]{0x0000402000000040L});
        public static final BitSet FOLLOW_ruleEFloatOurObject_in_ruleBudget6264 = new BitSet(new long[]{0x0040000004180000L});
        public static final BitSet FOLLOW_19_in_ruleBudget6279 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBudget6300 = new BitSet(new long[]{0x0040000004100000L});
        public static final BitSet FOLLOW_54_in_ruleBudget6315 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBudget6336 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_20_in_ruleBudget6351 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBudget6372 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleBudget6386 = new BitSet(new long[]{0x0000000000000002L});
    }


}