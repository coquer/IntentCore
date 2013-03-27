package itu.dk.aamj.intentdsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import itu.dk.aamj.intentdsl.services.IntentDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIntentDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Intent'", "'{'", "'type'", "'data'", "'exceptionName'", "'extras'", "','", "'}'", "'sucessCallback'", "'permissions'", "'Bundle'", "'value'", "'Callback'", "'Permissions'", "'DoubleExtra'", "'IntExtra'", "'CharSequenceExtra'", "'CharExtra'", "'BundleExtra'", "'ParceableExtra'", "'SerializableExtra'", "'FloatExtra'", "'ByteExtra'", "'LongExtra'", "'StringExtra'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalIntentDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIntentDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIntentDslParser.tokenNames; }
    public String getGrammarFileName() { return "../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g"; }



     	private IntentDslGrammarAccess grammarAccess;
     	
        public InternalIntentDslParser(TokenStream input, IntentDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Intent_Impl";	
       	}
       	
       	@Override
       	protected IntentDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleIntent_Impl"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:67:1: entryRuleIntent_Impl returns [EObject current=null] : iv_ruleIntent_Impl= ruleIntent_Impl EOF ;
    public final EObject entryRuleIntent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent_Impl = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:68:2: (iv_ruleIntent_Impl= ruleIntent_Impl EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:69:2: iv_ruleIntent_Impl= ruleIntent_Impl EOF
            {
             newCompositeNode(grammarAccess.getIntent_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_Impl_in_entryRuleIntent_Impl75);
            iv_ruleIntent_Impl=ruleIntent_Impl();

            state._fsp--;

             current =iv_ruleIntent_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntent_Impl85); 

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
    // $ANTLR end "entryRuleIntent_Impl"


    // $ANTLR start "ruleIntent_Impl"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:76:1: ruleIntent_Impl returns [EObject current=null] : ( () otherlv_1= 'Intent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'data' ( (lv_data_7_0= ruleEString ) ) )? (otherlv_8= 'exceptionName' ( (lv_exceptionName_9_0= ruleEString ) ) )? (otherlv_10= 'extras' otherlv_11= '{' ( (lv_extras_12_0= ruleBundle ) ) (otherlv_13= ',' ( (lv_extras_14_0= ruleBundle ) ) )* otherlv_15= '}' )? (otherlv_16= 'sucessCallback' ( (lv_sucessCallback_17_0= ruleCallback ) ) )? (otherlv_18= 'permissions' otherlv_19= '{' ( (lv_permissions_20_0= rulePermissions ) ) (otherlv_21= ',' ( (lv_permissions_22_0= rulePermissions ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleIntent_Impl() throws RecognitionException {
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_data_7_0 = null;

        AntlrDatatypeRuleToken lv_exceptionName_9_0 = null;

        EObject lv_extras_12_0 = null;

        EObject lv_extras_14_0 = null;

        EObject lv_sucessCallback_17_0 = null;

        EObject lv_permissions_20_0 = null;

        EObject lv_permissions_22_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:79:28: ( ( () otherlv_1= 'Intent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'data' ( (lv_data_7_0= ruleEString ) ) )? (otherlv_8= 'exceptionName' ( (lv_exceptionName_9_0= ruleEString ) ) )? (otherlv_10= 'extras' otherlv_11= '{' ( (lv_extras_12_0= ruleBundle ) ) (otherlv_13= ',' ( (lv_extras_14_0= ruleBundle ) ) )* otherlv_15= '}' )? (otherlv_16= 'sucessCallback' ( (lv_sucessCallback_17_0= ruleCallback ) ) )? (otherlv_18= 'permissions' otherlv_19= '{' ( (lv_permissions_20_0= rulePermissions ) ) (otherlv_21= ',' ( (lv_permissions_22_0= rulePermissions ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:80:1: ( () otherlv_1= 'Intent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'data' ( (lv_data_7_0= ruleEString ) ) )? (otherlv_8= 'exceptionName' ( (lv_exceptionName_9_0= ruleEString ) ) )? (otherlv_10= 'extras' otherlv_11= '{' ( (lv_extras_12_0= ruleBundle ) ) (otherlv_13= ',' ( (lv_extras_14_0= ruleBundle ) ) )* otherlv_15= '}' )? (otherlv_16= 'sucessCallback' ( (lv_sucessCallback_17_0= ruleCallback ) ) )? (otherlv_18= 'permissions' otherlv_19= '{' ( (lv_permissions_20_0= rulePermissions ) ) (otherlv_21= ',' ( (lv_permissions_22_0= rulePermissions ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:80:1: ( () otherlv_1= 'Intent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'data' ( (lv_data_7_0= ruleEString ) ) )? (otherlv_8= 'exceptionName' ( (lv_exceptionName_9_0= ruleEString ) ) )? (otherlv_10= 'extras' otherlv_11= '{' ( (lv_extras_12_0= ruleBundle ) ) (otherlv_13= ',' ( (lv_extras_14_0= ruleBundle ) ) )* otherlv_15= '}' )? (otherlv_16= 'sucessCallback' ( (lv_sucessCallback_17_0= ruleCallback ) ) )? (otherlv_18= 'permissions' otherlv_19= '{' ( (lv_permissions_20_0= rulePermissions ) ) (otherlv_21= ',' ( (lv_permissions_22_0= rulePermissions ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:80:2: () otherlv_1= 'Intent' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'data' ( (lv_data_7_0= ruleEString ) ) )? (otherlv_8= 'exceptionName' ( (lv_exceptionName_9_0= ruleEString ) ) )? (otherlv_10= 'extras' otherlv_11= '{' ( (lv_extras_12_0= ruleBundle ) ) (otherlv_13= ',' ( (lv_extras_14_0= ruleBundle ) ) )* otherlv_15= '}' )? (otherlv_16= 'sucessCallback' ( (lv_sucessCallback_17_0= ruleCallback ) ) )? (otherlv_18= 'permissions' otherlv_19= '{' ( (lv_permissions_20_0= rulePermissions ) ) (otherlv_21= ',' ( (lv_permissions_22_0= rulePermissions ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:80:2: ()
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntent_ImplAccess().getIntentAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleIntent_Impl131); 

                	newLeafNode(otherlv_1, grammarAccess.getIntent_ImplAccess().getIntentKeyword_1());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:91:1: (lv_name_2_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntent_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent_Impl152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntent_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntent_Impl164); 

                	newLeafNode(otherlv_3, grammarAccess.getIntent_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:112:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:112:3: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleIntent_Impl177); 

                        	newLeafNode(otherlv_4, grammarAccess.getIntent_ImplAccess().getTypeKeyword_4_0());
                        
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:116:1: ( (lv_type_5_0= ruleEString ) )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:117:1: (lv_type_5_0= ruleEString )
                    {
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:117:1: (lv_type_5_0= ruleEString )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:118:3: lv_type_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntent_ImplAccess().getTypeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent_Impl198);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntent_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:134:4: (otherlv_6= 'data' ( (lv_data_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:134:6: otherlv_6= 'data' ( (lv_data_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntent_Impl213); 

                        	newLeafNode(otherlv_6, grammarAccess.getIntent_ImplAccess().getDataKeyword_5_0());
                        
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:138:1: ( (lv_data_7_0= ruleEString ) )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:139:1: (lv_data_7_0= ruleEString )
                    {
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:139:1: (lv_data_7_0= ruleEString )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:140:3: lv_data_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntent_ImplAccess().getDataEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent_Impl234);
                    lv_data_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntent_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"data",
                            		lv_data_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:156:4: (otherlv_8= 'exceptionName' ( (lv_exceptionName_9_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:156:6: otherlv_8= 'exceptionName' ( (lv_exceptionName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntent_Impl249); 

                        	newLeafNode(otherlv_8, grammarAccess.getIntent_ImplAccess().getExceptionNameKeyword_6_0());
                        
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:160:1: ( (lv_exceptionName_9_0= ruleEString ) )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:161:1: (lv_exceptionName_9_0= ruleEString )
                    {
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:161:1: (lv_exceptionName_9_0= ruleEString )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:162:3: lv_exceptionName_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntent_ImplAccess().getExceptionNameEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntent_Impl270);
                    lv_exceptionName_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntent_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"exceptionName",
                            		lv_exceptionName_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:178:4: (otherlv_10= 'extras' otherlv_11= '{' ( (lv_extras_12_0= ruleBundle ) ) (otherlv_13= ',' ( (lv_extras_14_0= ruleBundle ) ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:178:6: otherlv_10= 'extras' otherlv_11= '{' ( (lv_extras_12_0= ruleBundle ) ) (otherlv_13= ',' ( (lv_extras_14_0= ruleBundle ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleIntent_Impl285); 

                        	newLeafNode(otherlv_10, grammarAccess.getIntent_ImplAccess().getExtrasKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntent_Impl297); 

                        	newLeafNode(otherlv_11, grammarAccess.getIntent_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:186:1: ( (lv_extras_12_0= ruleBundle ) )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:187:1: (lv_extras_12_0= ruleBundle )
                    {
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:187:1: (lv_extras_12_0= ruleBundle )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:188:3: lv_extras_12_0= ruleBundle
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntent_ImplAccess().getExtrasBundleParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBundle_in_ruleIntent_Impl318);
                    lv_extras_12_0=ruleBundle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntent_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"extras",
                            		lv_extras_12_0, 
                            		"Bundle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:204:2: (otherlv_13= ',' ( (lv_extras_14_0= ruleBundle ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:204:4: otherlv_13= ',' ( (lv_extras_14_0= ruleBundle ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntent_Impl331); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getIntent_ImplAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:208:1: ( (lv_extras_14_0= ruleBundle ) )
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:209:1: (lv_extras_14_0= ruleBundle )
                    	    {
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:209:1: (lv_extras_14_0= ruleBundle )
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:210:3: lv_extras_14_0= ruleBundle
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntent_ImplAccess().getExtrasBundleParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBundle_in_ruleIntent_Impl352);
                    	    lv_extras_14_0=ruleBundle();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntent_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"extras",
                    	            		lv_extras_14_0, 
                    	            		"Bundle");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIntent_Impl366); 

                        	newLeafNode(otherlv_15, grammarAccess.getIntent_ImplAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:230:3: (otherlv_16= 'sucessCallback' ( (lv_sucessCallback_17_0= ruleCallback ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:230:5: otherlv_16= 'sucessCallback' ( (lv_sucessCallback_17_0= ruleCallback ) )
                    {
                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIntent_Impl381); 

                        	newLeafNode(otherlv_16, grammarAccess.getIntent_ImplAccess().getSucessCallbackKeyword_8_0());
                        
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:234:1: ( (lv_sucessCallback_17_0= ruleCallback ) )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:235:1: (lv_sucessCallback_17_0= ruleCallback )
                    {
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:235:1: (lv_sucessCallback_17_0= ruleCallback )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:236:3: lv_sucessCallback_17_0= ruleCallback
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntent_ImplAccess().getSucessCallbackCallbackParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCallback_in_ruleIntent_Impl402);
                    lv_sucessCallback_17_0=ruleCallback();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntent_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"sucessCallback",
                            		lv_sucessCallback_17_0, 
                            		"Callback");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:252:4: (otherlv_18= 'permissions' otherlv_19= '{' ( (lv_permissions_20_0= rulePermissions ) ) (otherlv_21= ',' ( (lv_permissions_22_0= rulePermissions ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:252:6: otherlv_18= 'permissions' otherlv_19= '{' ( (lv_permissions_20_0= rulePermissions ) ) (otherlv_21= ',' ( (lv_permissions_22_0= rulePermissions ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleIntent_Impl417); 

                        	newLeafNode(otherlv_18, grammarAccess.getIntent_ImplAccess().getPermissionsKeyword_9_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntent_Impl429); 

                        	newLeafNode(otherlv_19, grammarAccess.getIntent_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:260:1: ( (lv_permissions_20_0= rulePermissions ) )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:261:1: (lv_permissions_20_0= rulePermissions )
                    {
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:261:1: (lv_permissions_20_0= rulePermissions )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:262:3: lv_permissions_20_0= rulePermissions
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntent_ImplAccess().getPermissionsPermissionsParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePermissions_in_ruleIntent_Impl450);
                    lv_permissions_20_0=rulePermissions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntent_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"permissions",
                            		lv_permissions_20_0, 
                            		"Permissions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:278:2: (otherlv_21= ',' ( (lv_permissions_22_0= rulePermissions ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:278:4: otherlv_21= ',' ( (lv_permissions_22_0= rulePermissions ) )
                    	    {
                    	    otherlv_21=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntent_Impl463); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getIntent_ImplAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:282:1: ( (lv_permissions_22_0= rulePermissions ) )
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:283:1: (lv_permissions_22_0= rulePermissions )
                    	    {
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:283:1: (lv_permissions_22_0= rulePermissions )
                    	    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:284:3: lv_permissions_22_0= rulePermissions
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntent_ImplAccess().getPermissionsPermissionsParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePermissions_in_ruleIntent_Impl484);
                    	    lv_permissions_22_0=rulePermissions();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntent_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"permissions",
                    	            		lv_permissions_22_0, 
                    	            		"Permissions");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIntent_Impl498); 

                        	newLeafNode(otherlv_23, grammarAccess.getIntent_ImplAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIntent_Impl512); 

                	newLeafNode(otherlv_24, grammarAccess.getIntent_ImplAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleIntent_Impl"


    // $ANTLR start "entryRuleBundle"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:316:1: entryRuleBundle returns [EObject current=null] : iv_ruleBundle= ruleBundle EOF ;
    public final EObject entryRuleBundle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:317:2: (iv_ruleBundle= ruleBundle EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:318:2: iv_ruleBundle= ruleBundle EOF
            {
             newCompositeNode(grammarAccess.getBundleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundle_in_entryRuleBundle548);
            iv_ruleBundle=ruleBundle();

            state._fsp--;

             current =iv_ruleBundle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundle558); 

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
    // $ANTLR end "entryRuleBundle"


    // $ANTLR start "ruleBundle"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:325:1: ruleBundle returns [EObject current=null] : (this_Bundle_Impl_0= ruleBundle_Impl | this_DoubleExtra_1= ruleDoubleExtra | this_IntExtra_2= ruleIntExtra | this_CharSequenceExtra_3= ruleCharSequenceExtra | this_CharExtra_4= ruleCharExtra | this_BundleExtra_5= ruleBundleExtra | this_ParceableExtra_6= ruleParceableExtra | this_SerializableExtra_7= ruleSerializableExtra | this_FloatExtra_8= ruleFloatExtra | this_ByteExtra_9= ruleByteExtra | this_LongExtra_10= ruleLongExtra | this_StringExtra_11= ruleStringExtra ) ;
    public final EObject ruleBundle() throws RecognitionException {
        EObject current = null;

        EObject this_Bundle_Impl_0 = null;

        EObject this_DoubleExtra_1 = null;

        EObject this_IntExtra_2 = null;

        EObject this_CharSequenceExtra_3 = null;

        EObject this_CharExtra_4 = null;

        EObject this_BundleExtra_5 = null;

        EObject this_ParceableExtra_6 = null;

        EObject this_SerializableExtra_7 = null;

        EObject this_FloatExtra_8 = null;

        EObject this_ByteExtra_9 = null;

        EObject this_LongExtra_10 = null;

        EObject this_StringExtra_11 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:328:28: ( (this_Bundle_Impl_0= ruleBundle_Impl | this_DoubleExtra_1= ruleDoubleExtra | this_IntExtra_2= ruleIntExtra | this_CharSequenceExtra_3= ruleCharSequenceExtra | this_CharExtra_4= ruleCharExtra | this_BundleExtra_5= ruleBundleExtra | this_ParceableExtra_6= ruleParceableExtra | this_SerializableExtra_7= ruleSerializableExtra | this_FloatExtra_8= ruleFloatExtra | this_ByteExtra_9= ruleByteExtra | this_LongExtra_10= ruleLongExtra | this_StringExtra_11= ruleStringExtra ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:329:1: (this_Bundle_Impl_0= ruleBundle_Impl | this_DoubleExtra_1= ruleDoubleExtra | this_IntExtra_2= ruleIntExtra | this_CharSequenceExtra_3= ruleCharSequenceExtra | this_CharExtra_4= ruleCharExtra | this_BundleExtra_5= ruleBundleExtra | this_ParceableExtra_6= ruleParceableExtra | this_SerializableExtra_7= ruleSerializableExtra | this_FloatExtra_8= ruleFloatExtra | this_ByteExtra_9= ruleByteExtra | this_LongExtra_10= ruleLongExtra | this_StringExtra_11= ruleStringExtra )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:329:1: (this_Bundle_Impl_0= ruleBundle_Impl | this_DoubleExtra_1= ruleDoubleExtra | this_IntExtra_2= ruleIntExtra | this_CharSequenceExtra_3= ruleCharSequenceExtra | this_CharExtra_4= ruleCharExtra | this_BundleExtra_5= ruleBundleExtra | this_ParceableExtra_6= ruleParceableExtra | this_SerializableExtra_7= ruleSerializableExtra | this_FloatExtra_8= ruleFloatExtra | this_ByteExtra_9= ruleByteExtra | this_LongExtra_10= ruleLongExtra | this_StringExtra_11= ruleStringExtra )
            int alt9=12;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            case 29:
                {
                alt9=6;
                }
                break;
            case 30:
                {
                alt9=7;
                }
                break;
            case 31:
                {
                alt9=8;
                }
                break;
            case 32:
                {
                alt9=9;
                }
                break;
            case 33:
                {
                alt9=10;
                }
                break;
            case 34:
                {
                alt9=11;
                }
                break;
            case 35:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:330:5: this_Bundle_Impl_0= ruleBundle_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getBundle_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBundle_Impl_in_ruleBundle605);
                    this_Bundle_Impl_0=ruleBundle_Impl();

                    state._fsp--;

                     
                            current = this_Bundle_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:340:5: this_DoubleExtra_1= ruleDoubleExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getDoubleExtraParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleExtra_in_ruleBundle632);
                    this_DoubleExtra_1=ruleDoubleExtra();

                    state._fsp--;

                     
                            current = this_DoubleExtra_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:350:5: this_IntExtra_2= ruleIntExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getIntExtraParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntExtra_in_ruleBundle659);
                    this_IntExtra_2=ruleIntExtra();

                    state._fsp--;

                     
                            current = this_IntExtra_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:360:5: this_CharSequenceExtra_3= ruleCharSequenceExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getCharSequenceExtraParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCharSequenceExtra_in_ruleBundle686);
                    this_CharSequenceExtra_3=ruleCharSequenceExtra();

                    state._fsp--;

                     
                            current = this_CharSequenceExtra_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:370:5: this_CharExtra_4= ruleCharExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getCharExtraParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCharExtra_in_ruleBundle713);
                    this_CharExtra_4=ruleCharExtra();

                    state._fsp--;

                     
                            current = this_CharExtra_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:380:5: this_BundleExtra_5= ruleBundleExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getBundleExtraParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBundleExtra_in_ruleBundle740);
                    this_BundleExtra_5=ruleBundleExtra();

                    state._fsp--;

                     
                            current = this_BundleExtra_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:390:5: this_ParceableExtra_6= ruleParceableExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getParceableExtraParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParceableExtra_in_ruleBundle767);
                    this_ParceableExtra_6=ruleParceableExtra();

                    state._fsp--;

                     
                            current = this_ParceableExtra_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:400:5: this_SerializableExtra_7= ruleSerializableExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getSerializableExtraParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSerializableExtra_in_ruleBundle794);
                    this_SerializableExtra_7=ruleSerializableExtra();

                    state._fsp--;

                     
                            current = this_SerializableExtra_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:410:5: this_FloatExtra_8= ruleFloatExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getFloatExtraParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFloatExtra_in_ruleBundle821);
                    this_FloatExtra_8=ruleFloatExtra();

                    state._fsp--;

                     
                            current = this_FloatExtra_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:420:5: this_ByteExtra_9= ruleByteExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getByteExtraParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleByteExtra_in_ruleBundle848);
                    this_ByteExtra_9=ruleByteExtra();

                    state._fsp--;

                     
                            current = this_ByteExtra_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:430:5: this_LongExtra_10= ruleLongExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getLongExtraParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLongExtra_in_ruleBundle875);
                    this_LongExtra_10=ruleLongExtra();

                    state._fsp--;

                     
                            current = this_LongExtra_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:440:5: this_StringExtra_11= ruleStringExtra
                    {
                     
                            newCompositeNode(grammarAccess.getBundleAccess().getStringExtraParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringExtra_in_ruleBundle902);
                    this_StringExtra_11=ruleStringExtra();

                    state._fsp--;

                     
                            current = this_StringExtra_11; 
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
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleEString"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:456:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:457:2: (iv_ruleEString= ruleEString EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:458:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString938);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString949); 

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
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:465:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:468:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:469:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:469:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:469:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString989); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:477:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1015); 

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


    // $ANTLR start "entryRuleBundle_Impl"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:492:1: entryRuleBundle_Impl returns [EObject current=null] : iv_ruleBundle_Impl= ruleBundle_Impl EOF ;
    public final EObject entryRuleBundle_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundle_Impl = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:493:2: (iv_ruleBundle_Impl= ruleBundle_Impl EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:494:2: iv_ruleBundle_Impl= ruleBundle_Impl EOF
            {
             newCompositeNode(grammarAccess.getBundle_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundle_Impl_in_entryRuleBundle_Impl1060);
            iv_ruleBundle_Impl=ruleBundle_Impl();

            state._fsp--;

             current =iv_ruleBundle_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundle_Impl1070); 

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
    // $ANTLR end "entryRuleBundle_Impl"


    // $ANTLR start "ruleBundle_Impl"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:501:1: ruleBundle_Impl returns [EObject current=null] : (otherlv_0= 'Bundle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleBundle_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:504:28: ( (otherlv_0= 'Bundle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:505:1: (otherlv_0= 'Bundle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:505:1: (otherlv_0= 'Bundle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:505:3: otherlv_0= 'Bundle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBundle_Impl1107); 

                	newLeafNode(otherlv_0, grammarAccess.getBundle_ImplAccess().getBundleKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:509:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:510:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:510:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:511:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBundle_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBundle_Impl1128);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBundle_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBundle_Impl1140); 

                	newLeafNode(otherlv_2, grammarAccess.getBundle_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBundle_Impl1152); 

                	newLeafNode(otherlv_3, grammarAccess.getBundle_ImplAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:535:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:536:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:536:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:537:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBundle_ImplAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBundle_Impl1173);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBundle_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBundle_Impl1185); 

                	newLeafNode(otherlv_5, grammarAccess.getBundle_ImplAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleBundle_Impl"


    // $ANTLR start "entryRuleCallback"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:565:1: entryRuleCallback returns [EObject current=null] : iv_ruleCallback= ruleCallback EOF ;
    public final EObject entryRuleCallback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallback = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:566:2: (iv_ruleCallback= ruleCallback EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:567:2: iv_ruleCallback= ruleCallback EOF
            {
             newCompositeNode(grammarAccess.getCallbackRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCallback_in_entryRuleCallback1221);
            iv_ruleCallback=ruleCallback();

            state._fsp--;

             current =iv_ruleCallback; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCallback1231); 

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
    // $ANTLR end "entryRuleCallback"


    // $ANTLR start "ruleCallback"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:574:1: ruleCallback returns [EObject current=null] : ( () otherlv_1= 'Callback' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleCallback() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_data_5_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:577:28: ( ( () otherlv_1= 'Callback' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:578:1: ( () otherlv_1= 'Callback' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:578:1: ( () otherlv_1= 'Callback' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:578:2: () otherlv_1= 'Callback' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:578:2: ()
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:579:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCallbackAccess().getCallbackAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCallback1277); 

                	newLeafNode(otherlv_1, grammarAccess.getCallbackAccess().getCallbackKeyword_1());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:588:1: ( (lv_name_2_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:589:1: (lv_name_2_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:589:1: (lv_name_2_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:590:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCallbackAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCallback1298);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallbackRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCallback1310); 

                	newLeafNode(otherlv_3, grammarAccess.getCallbackAccess().getLeftCurlyBracketKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:610:1: (otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:610:3: otherlv_4= 'data' ( (lv_data_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCallback1323); 

                        	newLeafNode(otherlv_4, grammarAccess.getCallbackAccess().getDataKeyword_4_0());
                        
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:614:1: ( (lv_data_5_0= ruleEString ) )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:615:1: (lv_data_5_0= ruleEString )
                    {
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:615:1: (lv_data_5_0= ruleEString )
                    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:616:3: lv_data_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCallbackAccess().getDataEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCallback1344);
                    lv_data_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCallbackRule());
                    	        }
                           		set(
                           			current, 
                           			"data",
                            		lv_data_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCallback1358); 

                	newLeafNode(otherlv_6, grammarAccess.getCallbackAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleCallback"


    // $ANTLR start "entryRulePermissions"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:644:1: entryRulePermissions returns [EObject current=null] : iv_rulePermissions= rulePermissions EOF ;
    public final EObject entryRulePermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:645:2: (iv_rulePermissions= rulePermissions EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:646:2: iv_rulePermissions= rulePermissions EOF
            {
             newCompositeNode(grammarAccess.getPermissionsRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePermissions_in_entryRulePermissions1394);
            iv_rulePermissions=rulePermissions();

            state._fsp--;

             current =iv_rulePermissions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePermissions1404); 

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
    // $ANTLR end "entryRulePermissions"


    // $ANTLR start "rulePermissions"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:653:1: rulePermissions returns [EObject current=null] : ( () otherlv_1= 'Permissions' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePermissions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:656:28: ( ( () otherlv_1= 'Permissions' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:657:1: ( () otherlv_1= 'Permissions' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:657:1: ( () otherlv_1= 'Permissions' ( (lv_name_2_0= ruleEString ) ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:657:2: () otherlv_1= 'Permissions' ( (lv_name_2_0= ruleEString ) )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:657:2: ()
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:658:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPermissionsAccess().getPermissionsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePermissions1450); 

                	newLeafNode(otherlv_1, grammarAccess.getPermissionsAccess().getPermissionsKeyword_1());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:667:1: ( (lv_name_2_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:668:1: (lv_name_2_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:668:1: (lv_name_2_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:669:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPermissionsAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePermissions1471);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPermissionsRule());
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
    // $ANTLR end "rulePermissions"


    // $ANTLR start "entryRuleDoubleExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:697:1: entryRuleDoubleExtra returns [EObject current=null] : iv_ruleDoubleExtra= ruleDoubleExtra EOF ;
    public final EObject entryRuleDoubleExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:698:2: (iv_ruleDoubleExtra= ruleDoubleExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:699:2: iv_ruleDoubleExtra= ruleDoubleExtra EOF
            {
             newCompositeNode(grammarAccess.getDoubleExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoubleExtra_in_entryRuleDoubleExtra1511);
            iv_ruleDoubleExtra=ruleDoubleExtra();

            state._fsp--;

             current =iv_ruleDoubleExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoubleExtra1521); 

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
    // $ANTLR end "entryRuleDoubleExtra"


    // $ANTLR start "ruleDoubleExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:706:1: ruleDoubleExtra returns [EObject current=null] : (otherlv_0= 'DoubleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleDoubleExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:709:28: ( (otherlv_0= 'DoubleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:710:1: (otherlv_0= 'DoubleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:710:1: (otherlv_0= 'DoubleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:710:3: otherlv_0= 'DoubleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDoubleExtra1558); 

                	newLeafNode(otherlv_0, grammarAccess.getDoubleExtraAccess().getDoubleExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:714:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:715:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:715:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:716:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDoubleExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDoubleExtra1579);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoubleExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDoubleExtra1591); 

                	newLeafNode(otherlv_2, grammarAccess.getDoubleExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDoubleExtra1603); 

                	newLeafNode(otherlv_3, grammarAccess.getDoubleExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:740:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:741:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:741:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:742:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDoubleExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDoubleExtra1624);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoubleExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDoubleExtra1636); 

                	newLeafNode(otherlv_5, grammarAccess.getDoubleExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDoubleExtra"


    // $ANTLR start "entryRuleIntExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:770:1: entryRuleIntExtra returns [EObject current=null] : iv_ruleIntExtra= ruleIntExtra EOF ;
    public final EObject entryRuleIntExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:771:2: (iv_ruleIntExtra= ruleIntExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:772:2: iv_ruleIntExtra= ruleIntExtra EOF
            {
             newCompositeNode(grammarAccess.getIntExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntExtra_in_entryRuleIntExtra1672);
            iv_ruleIntExtra=ruleIntExtra();

            state._fsp--;

             current =iv_ruleIntExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntExtra1682); 

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
    // $ANTLR end "entryRuleIntExtra"


    // $ANTLR start "ruleIntExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:779:1: ruleIntExtra returns [EObject current=null] : (otherlv_0= 'IntExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleIntExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:782:28: ( (otherlv_0= 'IntExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:783:1: (otherlv_0= 'IntExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:783:1: (otherlv_0= 'IntExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:783:3: otherlv_0= 'IntExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIntExtra1719); 

                	newLeafNode(otherlv_0, grammarAccess.getIntExtraAccess().getIntExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:787:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:788:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:788:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:789:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntExtra1740);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntExtra1752); 

                	newLeafNode(otherlv_2, grammarAccess.getIntExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIntExtra1764); 

                	newLeafNode(otherlv_3, grammarAccess.getIntExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:813:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:814:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:814:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:815:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntExtra1785);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIntExtra1797); 

                	newLeafNode(otherlv_5, grammarAccess.getIntExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleIntExtra"


    // $ANTLR start "entryRuleCharSequenceExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:843:1: entryRuleCharSequenceExtra returns [EObject current=null] : iv_ruleCharSequenceExtra= ruleCharSequenceExtra EOF ;
    public final EObject entryRuleCharSequenceExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharSequenceExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:844:2: (iv_ruleCharSequenceExtra= ruleCharSequenceExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:845:2: iv_ruleCharSequenceExtra= ruleCharSequenceExtra EOF
            {
             newCompositeNode(grammarAccess.getCharSequenceExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharSequenceExtra_in_entryRuleCharSequenceExtra1833);
            iv_ruleCharSequenceExtra=ruleCharSequenceExtra();

            state._fsp--;

             current =iv_ruleCharSequenceExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharSequenceExtra1843); 

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
    // $ANTLR end "entryRuleCharSequenceExtra"


    // $ANTLR start "ruleCharSequenceExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:852:1: ruleCharSequenceExtra returns [EObject current=null] : (otherlv_0= 'CharSequenceExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleCharSequenceExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:855:28: ( (otherlv_0= 'CharSequenceExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:856:1: (otherlv_0= 'CharSequenceExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:856:1: (otherlv_0= 'CharSequenceExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:856:3: otherlv_0= 'CharSequenceExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCharSequenceExtra1880); 

                	newLeafNode(otherlv_0, grammarAccess.getCharSequenceExtraAccess().getCharSequenceExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:860:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:861:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:861:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:862:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCharSequenceExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCharSequenceExtra1901);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCharSequenceExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCharSequenceExtra1913); 

                	newLeafNode(otherlv_2, grammarAccess.getCharSequenceExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCharSequenceExtra1925); 

                	newLeafNode(otherlv_3, grammarAccess.getCharSequenceExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:886:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:887:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:887:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:888:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCharSequenceExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCharSequenceExtra1946);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCharSequenceExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCharSequenceExtra1958); 

                	newLeafNode(otherlv_5, grammarAccess.getCharSequenceExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleCharSequenceExtra"


    // $ANTLR start "entryRuleCharExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:916:1: entryRuleCharExtra returns [EObject current=null] : iv_ruleCharExtra= ruleCharExtra EOF ;
    public final EObject entryRuleCharExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:917:2: (iv_ruleCharExtra= ruleCharExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:918:2: iv_ruleCharExtra= ruleCharExtra EOF
            {
             newCompositeNode(grammarAccess.getCharExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharExtra_in_entryRuleCharExtra1994);
            iv_ruleCharExtra=ruleCharExtra();

            state._fsp--;

             current =iv_ruleCharExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharExtra2004); 

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
    // $ANTLR end "entryRuleCharExtra"


    // $ANTLR start "ruleCharExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:925:1: ruleCharExtra returns [EObject current=null] : (otherlv_0= 'CharExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleCharExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:928:28: ( (otherlv_0= 'CharExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:929:1: (otherlv_0= 'CharExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:929:1: (otherlv_0= 'CharExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:929:3: otherlv_0= 'CharExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCharExtra2041); 

                	newLeafNode(otherlv_0, grammarAccess.getCharExtraAccess().getCharExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:933:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:934:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:934:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:935:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCharExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCharExtra2062);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCharExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCharExtra2074); 

                	newLeafNode(otherlv_2, grammarAccess.getCharExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCharExtra2086); 

                	newLeafNode(otherlv_3, grammarAccess.getCharExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:959:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:960:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:960:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:961:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCharExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCharExtra2107);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCharExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCharExtra2119); 

                	newLeafNode(otherlv_5, grammarAccess.getCharExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleCharExtra"


    // $ANTLR start "entryRuleBundleExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:989:1: entryRuleBundleExtra returns [EObject current=null] : iv_ruleBundleExtra= ruleBundleExtra EOF ;
    public final EObject entryRuleBundleExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBundleExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:990:2: (iv_ruleBundleExtra= ruleBundleExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:991:2: iv_ruleBundleExtra= ruleBundleExtra EOF
            {
             newCompositeNode(grammarAccess.getBundleExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundleExtra_in_entryRuleBundleExtra2155);
            iv_ruleBundleExtra=ruleBundleExtra();

            state._fsp--;

             current =iv_ruleBundleExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundleExtra2165); 

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
    // $ANTLR end "entryRuleBundleExtra"


    // $ANTLR start "ruleBundleExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:998:1: ruleBundleExtra returns [EObject current=null] : (otherlv_0= 'BundleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleBundleExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1001:28: ( (otherlv_0= 'BundleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1002:1: (otherlv_0= 'BundleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1002:1: (otherlv_0= 'BundleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1002:3: otherlv_0= 'BundleExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleBundleExtra2202); 

                	newLeafNode(otherlv_0, grammarAccess.getBundleExtraAccess().getBundleExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1006:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1007:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1007:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1008:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBundleExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBundleExtra2223);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBundleExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBundleExtra2235); 

                	newLeafNode(otherlv_2, grammarAccess.getBundleExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBundleExtra2247); 

                	newLeafNode(otherlv_3, grammarAccess.getBundleExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1032:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1033:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1033:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1034:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBundleExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBundleExtra2268);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBundleExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBundleExtra2280); 

                	newLeafNode(otherlv_5, grammarAccess.getBundleExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleBundleExtra"


    // $ANTLR start "entryRuleParceableExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1062:1: entryRuleParceableExtra returns [EObject current=null] : iv_ruleParceableExtra= ruleParceableExtra EOF ;
    public final EObject entryRuleParceableExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParceableExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1063:2: (iv_ruleParceableExtra= ruleParceableExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1064:2: iv_ruleParceableExtra= ruleParceableExtra EOF
            {
             newCompositeNode(grammarAccess.getParceableExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParceableExtra_in_entryRuleParceableExtra2316);
            iv_ruleParceableExtra=ruleParceableExtra();

            state._fsp--;

             current =iv_ruleParceableExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParceableExtra2326); 

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
    // $ANTLR end "entryRuleParceableExtra"


    // $ANTLR start "ruleParceableExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1071:1: ruleParceableExtra returns [EObject current=null] : (otherlv_0= 'ParceableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParceableExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1074:28: ( (otherlv_0= 'ParceableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1075:1: (otherlv_0= 'ParceableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1075:1: (otherlv_0= 'ParceableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1075:3: otherlv_0= 'ParceableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleParceableExtra2363); 

                	newLeafNode(otherlv_0, grammarAccess.getParceableExtraAccess().getParceableExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1079:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1080:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1080:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1081:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParceableExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParceableExtra2384);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParceableExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParceableExtra2396); 

                	newLeafNode(otherlv_2, grammarAccess.getParceableExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleParceableExtra2408); 

                	newLeafNode(otherlv_3, grammarAccess.getParceableExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1105:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1106:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1106:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1107:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParceableExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParceableExtra2429);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParceableExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleParceableExtra2441); 

                	newLeafNode(otherlv_5, grammarAccess.getParceableExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleParceableExtra"


    // $ANTLR start "entryRuleSerializableExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1135:1: entryRuleSerializableExtra returns [EObject current=null] : iv_ruleSerializableExtra= ruleSerializableExtra EOF ;
    public final EObject entryRuleSerializableExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSerializableExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1136:2: (iv_ruleSerializableExtra= ruleSerializableExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1137:2: iv_ruleSerializableExtra= ruleSerializableExtra EOF
            {
             newCompositeNode(grammarAccess.getSerializableExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSerializableExtra_in_entryRuleSerializableExtra2477);
            iv_ruleSerializableExtra=ruleSerializableExtra();

            state._fsp--;

             current =iv_ruleSerializableExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSerializableExtra2487); 

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
    // $ANTLR end "entryRuleSerializableExtra"


    // $ANTLR start "ruleSerializableExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1144:1: ruleSerializableExtra returns [EObject current=null] : (otherlv_0= 'SerializableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleSerializableExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1147:28: ( (otherlv_0= 'SerializableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1148:1: (otherlv_0= 'SerializableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1148:1: (otherlv_0= 'SerializableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1148:3: otherlv_0= 'SerializableExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSerializableExtra2524); 

                	newLeafNode(otherlv_0, grammarAccess.getSerializableExtraAccess().getSerializableExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1152:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1153:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1153:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1154:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSerializableExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSerializableExtra2545);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSerializableExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSerializableExtra2557); 

                	newLeafNode(otherlv_2, grammarAccess.getSerializableExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSerializableExtra2569); 

                	newLeafNode(otherlv_3, grammarAccess.getSerializableExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1178:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1179:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1179:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1180:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSerializableExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSerializableExtra2590);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSerializableExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSerializableExtra2602); 

                	newLeafNode(otherlv_5, grammarAccess.getSerializableExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSerializableExtra"


    // $ANTLR start "entryRuleFloatExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1208:1: entryRuleFloatExtra returns [EObject current=null] : iv_ruleFloatExtra= ruleFloatExtra EOF ;
    public final EObject entryRuleFloatExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1209:2: (iv_ruleFloatExtra= ruleFloatExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1210:2: iv_ruleFloatExtra= ruleFloatExtra EOF
            {
             newCompositeNode(grammarAccess.getFloatExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloatExtra_in_entryRuleFloatExtra2638);
            iv_ruleFloatExtra=ruleFloatExtra();

            state._fsp--;

             current =iv_ruleFloatExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatExtra2648); 

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
    // $ANTLR end "entryRuleFloatExtra"


    // $ANTLR start "ruleFloatExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1217:1: ruleFloatExtra returns [EObject current=null] : (otherlv_0= 'FloatExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleFloatExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1220:28: ( (otherlv_0= 'FloatExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1221:1: (otherlv_0= 'FloatExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1221:1: (otherlv_0= 'FloatExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1221:3: otherlv_0= 'FloatExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFloatExtra2685); 

                	newLeafNode(otherlv_0, grammarAccess.getFloatExtraAccess().getFloatExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1225:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1226:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1226:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1227:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFloatExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFloatExtra2706);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFloatExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFloatExtra2718); 

                	newLeafNode(otherlv_2, grammarAccess.getFloatExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFloatExtra2730); 

                	newLeafNode(otherlv_3, grammarAccess.getFloatExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1251:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1252:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1252:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1253:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFloatExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFloatExtra2751);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFloatExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFloatExtra2763); 

                	newLeafNode(otherlv_5, grammarAccess.getFloatExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleFloatExtra"


    // $ANTLR start "entryRuleByteExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1281:1: entryRuleByteExtra returns [EObject current=null] : iv_ruleByteExtra= ruleByteExtra EOF ;
    public final EObject entryRuleByteExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByteExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1282:2: (iv_ruleByteExtra= ruleByteExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1283:2: iv_ruleByteExtra= ruleByteExtra EOF
            {
             newCompositeNode(grammarAccess.getByteExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleByteExtra_in_entryRuleByteExtra2799);
            iv_ruleByteExtra=ruleByteExtra();

            state._fsp--;

             current =iv_ruleByteExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleByteExtra2809); 

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
    // $ANTLR end "entryRuleByteExtra"


    // $ANTLR start "ruleByteExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1290:1: ruleByteExtra returns [EObject current=null] : (otherlv_0= 'ByteExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleByteExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1293:28: ( (otherlv_0= 'ByteExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1294:1: (otherlv_0= 'ByteExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1294:1: (otherlv_0= 'ByteExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1294:3: otherlv_0= 'ByteExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleByteExtra2846); 

                	newLeafNode(otherlv_0, grammarAccess.getByteExtraAccess().getByteExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1298:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1299:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1299:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1300:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getByteExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleByteExtra2867);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getByteExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleByteExtra2879); 

                	newLeafNode(otherlv_2, grammarAccess.getByteExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleByteExtra2891); 

                	newLeafNode(otherlv_3, grammarAccess.getByteExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1324:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1325:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1325:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1326:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getByteExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleByteExtra2912);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getByteExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleByteExtra2924); 

                	newLeafNode(otherlv_5, grammarAccess.getByteExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleByteExtra"


    // $ANTLR start "entryRuleLongExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1354:1: entryRuleLongExtra returns [EObject current=null] : iv_ruleLongExtra= ruleLongExtra EOF ;
    public final EObject entryRuleLongExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1355:2: (iv_ruleLongExtra= ruleLongExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1356:2: iv_ruleLongExtra= ruleLongExtra EOF
            {
             newCompositeNode(grammarAccess.getLongExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLongExtra_in_entryRuleLongExtra2960);
            iv_ruleLongExtra=ruleLongExtra();

            state._fsp--;

             current =iv_ruleLongExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLongExtra2970); 

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
    // $ANTLR end "entryRuleLongExtra"


    // $ANTLR start "ruleLongExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1363:1: ruleLongExtra returns [EObject current=null] : (otherlv_0= 'LongExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleLongExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1366:28: ( (otherlv_0= 'LongExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1367:1: (otherlv_0= 'LongExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1367:1: (otherlv_0= 'LongExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1367:3: otherlv_0= 'LongExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLongExtra3007); 

                	newLeafNode(otherlv_0, grammarAccess.getLongExtraAccess().getLongExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1371:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1372:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1372:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1373:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLongExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLongExtra3028);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLongExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLongExtra3040); 

                	newLeafNode(otherlv_2, grammarAccess.getLongExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLongExtra3052); 

                	newLeafNode(otherlv_3, grammarAccess.getLongExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1397:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1398:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1398:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1399:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLongExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLongExtra3073);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLongExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLongExtra3085); 

                	newLeafNode(otherlv_5, grammarAccess.getLongExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleLongExtra"


    // $ANTLR start "entryRuleStringExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1427:1: entryRuleStringExtra returns [EObject current=null] : iv_ruleStringExtra= ruleStringExtra EOF ;
    public final EObject entryRuleStringExtra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExtra = null;


        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1428:2: (iv_ruleStringExtra= ruleStringExtra EOF )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1429:2: iv_ruleStringExtra= ruleStringExtra EOF
            {
             newCompositeNode(grammarAccess.getStringExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringExtra_in_entryRuleStringExtra3121);
            iv_ruleStringExtra=ruleStringExtra();

            state._fsp--;

             current =iv_ruleStringExtra; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringExtra3131); 

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
    // $ANTLR end "entryRuleStringExtra"


    // $ANTLR start "ruleStringExtra"
    // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1436:1: ruleStringExtra returns [EObject current=null] : (otherlv_0= 'StringExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleStringExtra() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1439:28: ( (otherlv_0= 'StringExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1440:1: (otherlv_0= 'StringExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1440:1: (otherlv_0= 'StringExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1440:3: otherlv_0= 'StringExtra' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleStringExtra3168); 

                	newLeafNode(otherlv_0, grammarAccess.getStringExtraAccess().getStringExtraKeyword_0());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1444:1: ( (lv_name_1_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1445:1: (lv_name_1_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1445:1: (lv_name_1_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1446:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringExtraAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringExtra3189);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringExtraRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStringExtra3201); 

                	newLeafNode(otherlv_2, grammarAccess.getStringExtraAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStringExtra3213); 

                	newLeafNode(otherlv_3, grammarAccess.getStringExtraAccess().getValueKeyword_3());
                
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1470:1: ( (lv_value_4_0= ruleEString ) )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1471:1: (lv_value_4_0= ruleEString )
            {
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1471:1: (lv_value_4_0= ruleEString )
            // ../itu.dk.aamj.intentdsl/src-gen/itu/dk/aamj/intentdsl/parser/antlr/internal/InternalIntentDsl.g:1472:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringExtraAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringExtra3234);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringExtraRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStringExtra3246); 

                	newLeafNode(otherlv_5, grammarAccess.getStringExtraAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleStringExtra"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIntent_Impl_in_entryRuleIntent_Impl75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntent_Impl85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleIntent_Impl131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent_Impl152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntent_Impl164 = new BitSet(new long[]{0x00000000001DE000L});
        public static final BitSet FOLLOW_13_in_ruleIntent_Impl177 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent_Impl198 = new BitSet(new long[]{0x00000000001DC000L});
        public static final BitSet FOLLOW_14_in_ruleIntent_Impl213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent_Impl234 = new BitSet(new long[]{0x00000000001D8000L});
        public static final BitSet FOLLOW_15_in_ruleIntent_Impl249 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntent_Impl270 = new BitSet(new long[]{0x00000000001D0000L});
        public static final BitSet FOLLOW_16_in_ruleIntent_Impl285 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntent_Impl297 = new BitSet(new long[]{0x0000000FFE200000L});
        public static final BitSet FOLLOW_ruleBundle_in_ruleIntent_Impl318 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleIntent_Impl331 = new BitSet(new long[]{0x0000000FFE200000L});
        public static final BitSet FOLLOW_ruleBundle_in_ruleIntent_Impl352 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleIntent_Impl366 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_19_in_ruleIntent_Impl381 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleCallback_in_ruleIntent_Impl402 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_20_in_ruleIntent_Impl417 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntent_Impl429 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rulePermissions_in_ruleIntent_Impl450 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleIntent_Impl463 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rulePermissions_in_ruleIntent_Impl484 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleIntent_Impl498 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIntent_Impl512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundle558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundle_Impl_in_ruleBundle605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleExtra_in_ruleBundle632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntExtra_in_ruleBundle659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharSequenceExtra_in_ruleBundle686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharExtra_in_ruleBundle713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleExtra_in_ruleBundle740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParceableExtra_in_ruleBundle767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSerializableExtra_in_ruleBundle794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatExtra_in_ruleBundle821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleByteExtra_in_ruleBundle848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLongExtra_in_ruleBundle875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringExtra_in_ruleBundle902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundle_Impl_in_entryRuleBundle_Impl1060 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundle_Impl1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleBundle_Impl1107 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBundle_Impl1128 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBundle_Impl1140 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleBundle_Impl1152 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBundle_Impl1173 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBundle_Impl1185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCallback_in_entryRuleCallback1221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCallback1231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCallback1277 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCallback1298 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCallback1310 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_14_in_ruleCallback1323 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCallback1344 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCallback1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePermissions_in_entryRulePermissions1394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePermissions1404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rulePermissions1450 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePermissions1471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleExtra_in_entryRuleDoubleExtra1511 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoubleExtra1521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleDoubleExtra1558 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDoubleExtra1579 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDoubleExtra1591 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleDoubleExtra1603 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDoubleExtra1624 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDoubleExtra1636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntExtra_in_entryRuleIntExtra1672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntExtra1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleIntExtra1719 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntExtra1740 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntExtra1752 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleIntExtra1764 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntExtra1785 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIntExtra1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharSequenceExtra_in_entryRuleCharSequenceExtra1833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharSequenceExtra1843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCharSequenceExtra1880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCharSequenceExtra1901 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCharSequenceExtra1913 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCharSequenceExtra1925 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCharSequenceExtra1946 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCharSequenceExtra1958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharExtra_in_entryRuleCharExtra1994 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharExtra2004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleCharExtra2041 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCharExtra2062 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCharExtra2074 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCharExtra2086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCharExtra2107 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCharExtra2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleExtra_in_entryRuleBundleExtra2155 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundleExtra2165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleBundleExtra2202 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBundleExtra2223 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBundleExtra2235 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleBundleExtra2247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBundleExtra2268 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleBundleExtra2280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParceableExtra_in_entryRuleParceableExtra2316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParceableExtra2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleParceableExtra2363 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParceableExtra2384 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParceableExtra2396 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleParceableExtra2408 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParceableExtra2429 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleParceableExtra2441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSerializableExtra_in_entryRuleSerializableExtra2477 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSerializableExtra2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSerializableExtra2524 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSerializableExtra2545 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSerializableExtra2557 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleSerializableExtra2569 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSerializableExtra2590 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSerializableExtra2602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatExtra_in_entryRuleFloatExtra2638 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatExtra2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFloatExtra2685 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFloatExtra2706 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFloatExtra2718 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleFloatExtra2730 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFloatExtra2751 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFloatExtra2763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleByteExtra_in_entryRuleByteExtra2799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleByteExtra2809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleByteExtra2846 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleByteExtra2867 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleByteExtra2879 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleByteExtra2891 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleByteExtra2912 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleByteExtra2924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLongExtra_in_entryRuleLongExtra2960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLongExtra2970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleLongExtra3007 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLongExtra3028 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLongExtra3040 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLongExtra3052 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLongExtra3073 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLongExtra3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringExtra_in_entryRuleStringExtra3121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringExtra3131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleStringExtra3168 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringExtra3189 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStringExtra3201 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStringExtra3213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringExtra3234 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleStringExtra3246 = new BitSet(new long[]{0x0000000000000002L});
    }


}