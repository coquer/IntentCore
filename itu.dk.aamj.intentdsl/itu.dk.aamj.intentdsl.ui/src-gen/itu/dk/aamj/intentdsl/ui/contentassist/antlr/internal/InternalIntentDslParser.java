package itu.dk.aamj.intentdsl.ui.contentassist.antlr.internal; 

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
import itu.dk.aamj.intentdsl.services.IntentDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIntentDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Intent'", "'{'", "'}'", "'type'", "'data'", "'exceptionName'", "'extras'", "','", "'sucessCallback'", "'permissions'", "'Bundle'", "'value'", "'Callback'", "'Permissions'", "'DoubleExtra'", "'IntExtra'", "'CharSequenceExtra'", "'CharExtra'", "'BundleExtra'", "'ParceableExtra'", "'SerializableExtra'", "'FloatExtra'", "'ByteExtra'", "'LongExtra'", "'StringExtra'"
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
    public String getGrammarFileName() { return "../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g"; }


     
     	private IntentDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IntentDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleIntent_Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:60:1: entryRuleIntent_Impl : ruleIntent_Impl EOF ;
    public final void entryRuleIntent_Impl() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:61:1: ( ruleIntent_Impl EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:62:1: ruleIntent_Impl EOF
            {
             before(grammarAccess.getIntent_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntent_Impl_in_entryRuleIntent_Impl61);
            ruleIntent_Impl();

            state._fsp--;

             after(grammarAccess.getIntent_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntent_Impl68); 

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
    // $ANTLR end "entryRuleIntent_Impl"


    // $ANTLR start "ruleIntent_Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:69:1: ruleIntent_Impl : ( ( rule__Intent_Impl__Group__0 ) ) ;
    public final void ruleIntent_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:73:2: ( ( ( rule__Intent_Impl__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:74:1: ( ( rule__Intent_Impl__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:74:1: ( ( rule__Intent_Impl__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:75:1: ( rule__Intent_Impl__Group__0 )
            {
             before(grammarAccess.getIntent_ImplAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:76:1: ( rule__Intent_Impl__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:76:2: rule__Intent_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__0_in_ruleIntent_Impl94);
            rule__Intent_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleIntent_Impl"


    // $ANTLR start "entryRuleBundle"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:88:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:89:1: ( ruleBundle EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:90:1: ruleBundle EOF
            {
             before(grammarAccess.getBundleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundle_in_entryRuleBundle121);
            ruleBundle();

            state._fsp--;

             after(grammarAccess.getBundleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundle128); 

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
    // $ANTLR end "entryRuleBundle"


    // $ANTLR start "ruleBundle"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:97:1: ruleBundle : ( ( rule__Bundle__Alternatives ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:101:2: ( ( ( rule__Bundle__Alternatives ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:102:1: ( ( rule__Bundle__Alternatives ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:102:1: ( ( rule__Bundle__Alternatives ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:103:1: ( rule__Bundle__Alternatives )
            {
             before(grammarAccess.getBundleAccess().getAlternatives()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:104:1: ( rule__Bundle__Alternatives )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:104:2: rule__Bundle__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle__Alternatives_in_ruleBundle154);
            rule__Bundle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBundleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBundle"


    // $ANTLR start "entryRuleEString"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:117:1: ( ruleEString EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

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
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:132:1: ( rule__EString__Alternatives )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
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


    // $ANTLR start "entryRuleBundle_Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:144:1: entryRuleBundle_Impl : ruleBundle_Impl EOF ;
    public final void entryRuleBundle_Impl() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:145:1: ( ruleBundle_Impl EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:146:1: ruleBundle_Impl EOF
            {
             before(grammarAccess.getBundle_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundle_Impl_in_entryRuleBundle_Impl241);
            ruleBundle_Impl();

            state._fsp--;

             after(grammarAccess.getBundle_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundle_Impl248); 

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
    // $ANTLR end "entryRuleBundle_Impl"


    // $ANTLR start "ruleBundle_Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:153:1: ruleBundle_Impl : ( ( rule__Bundle_Impl__Group__0 ) ) ;
    public final void ruleBundle_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:157:2: ( ( ( rule__Bundle_Impl__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:158:1: ( ( rule__Bundle_Impl__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:158:1: ( ( rule__Bundle_Impl__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:159:1: ( rule__Bundle_Impl__Group__0 )
            {
             before(grammarAccess.getBundle_ImplAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:160:1: ( rule__Bundle_Impl__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:160:2: rule__Bundle_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__0_in_ruleBundle_Impl274);
            rule__Bundle_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBundle_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleBundle_Impl"


    // $ANTLR start "entryRuleCallback"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:172:1: entryRuleCallback : ruleCallback EOF ;
    public final void entryRuleCallback() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:173:1: ( ruleCallback EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:174:1: ruleCallback EOF
            {
             before(grammarAccess.getCallbackRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCallback_in_entryRuleCallback301);
            ruleCallback();

            state._fsp--;

             after(grammarAccess.getCallbackRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCallback308); 

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
    // $ANTLR end "entryRuleCallback"


    // $ANTLR start "ruleCallback"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:181:1: ruleCallback : ( ( rule__Callback__Group__0 ) ) ;
    public final void ruleCallback() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:185:2: ( ( ( rule__Callback__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:186:1: ( ( rule__Callback__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:186:1: ( ( rule__Callback__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:187:1: ( rule__Callback__Group__0 )
            {
             before(grammarAccess.getCallbackAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:188:1: ( rule__Callback__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:188:2: rule__Callback__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__0_in_ruleCallback334);
            rule__Callback__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallbackAccess().getGroup()); 

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
    // $ANTLR end "ruleCallback"


    // $ANTLR start "entryRulePermissions"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:200:1: entryRulePermissions : rulePermissions EOF ;
    public final void entryRulePermissions() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:201:1: ( rulePermissions EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:202:1: rulePermissions EOF
            {
             before(grammarAccess.getPermissionsRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePermissions_in_entryRulePermissions361);
            rulePermissions();

            state._fsp--;

             after(grammarAccess.getPermissionsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePermissions368); 

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
    // $ANTLR end "entryRulePermissions"


    // $ANTLR start "rulePermissions"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:209:1: rulePermissions : ( ( rule__Permissions__Group__0 ) ) ;
    public final void rulePermissions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:213:2: ( ( ( rule__Permissions__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:214:1: ( ( rule__Permissions__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:214:1: ( ( rule__Permissions__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:215:1: ( rule__Permissions__Group__0 )
            {
             before(grammarAccess.getPermissionsAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:216:1: ( rule__Permissions__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:216:2: rule__Permissions__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Permissions__Group__0_in_rulePermissions394);
            rule__Permissions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissionsAccess().getGroup()); 

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
    // $ANTLR end "rulePermissions"


    // $ANTLR start "entryRuleDoubleExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:232:1: entryRuleDoubleExtra : ruleDoubleExtra EOF ;
    public final void entryRuleDoubleExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:233:1: ( ruleDoubleExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:234:1: ruleDoubleExtra EOF
            {
             before(grammarAccess.getDoubleExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoubleExtra_in_entryRuleDoubleExtra425);
            ruleDoubleExtra();

            state._fsp--;

             after(grammarAccess.getDoubleExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoubleExtra432); 

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
    // $ANTLR end "entryRuleDoubleExtra"


    // $ANTLR start "ruleDoubleExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:241:1: ruleDoubleExtra : ( ( rule__DoubleExtra__Group__0 ) ) ;
    public final void ruleDoubleExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:245:2: ( ( ( rule__DoubleExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:246:1: ( ( rule__DoubleExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:246:1: ( ( rule__DoubleExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:247:1: ( rule__DoubleExtra__Group__0 )
            {
             before(grammarAccess.getDoubleExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:248:1: ( rule__DoubleExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:248:2: rule__DoubleExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__0_in_ruleDoubleExtra458);
            rule__DoubleExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleDoubleExtra"


    // $ANTLR start "entryRuleIntExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:260:1: entryRuleIntExtra : ruleIntExtra EOF ;
    public final void entryRuleIntExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:261:1: ( ruleIntExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:262:1: ruleIntExtra EOF
            {
             before(grammarAccess.getIntExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntExtra_in_entryRuleIntExtra485);
            ruleIntExtra();

            state._fsp--;

             after(grammarAccess.getIntExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntExtra492); 

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
    // $ANTLR end "entryRuleIntExtra"


    // $ANTLR start "ruleIntExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:269:1: ruleIntExtra : ( ( rule__IntExtra__Group__0 ) ) ;
    public final void ruleIntExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:273:2: ( ( ( rule__IntExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:274:1: ( ( rule__IntExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:274:1: ( ( rule__IntExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:275:1: ( rule__IntExtra__Group__0 )
            {
             before(grammarAccess.getIntExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:276:1: ( rule__IntExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:276:2: rule__IntExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__0_in_ruleIntExtra518);
            rule__IntExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleIntExtra"


    // $ANTLR start "entryRuleCharSequenceExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:288:1: entryRuleCharSequenceExtra : ruleCharSequenceExtra EOF ;
    public final void entryRuleCharSequenceExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:289:1: ( ruleCharSequenceExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:290:1: ruleCharSequenceExtra EOF
            {
             before(grammarAccess.getCharSequenceExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharSequenceExtra_in_entryRuleCharSequenceExtra545);
            ruleCharSequenceExtra();

            state._fsp--;

             after(grammarAccess.getCharSequenceExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharSequenceExtra552); 

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
    // $ANTLR end "entryRuleCharSequenceExtra"


    // $ANTLR start "ruleCharSequenceExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:297:1: ruleCharSequenceExtra : ( ( rule__CharSequenceExtra__Group__0 ) ) ;
    public final void ruleCharSequenceExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:301:2: ( ( ( rule__CharSequenceExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:302:1: ( ( rule__CharSequenceExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:302:1: ( ( rule__CharSequenceExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:303:1: ( rule__CharSequenceExtra__Group__0 )
            {
             before(grammarAccess.getCharSequenceExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:304:1: ( rule__CharSequenceExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:304:2: rule__CharSequenceExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__0_in_ruleCharSequenceExtra578);
            rule__CharSequenceExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharSequenceExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleCharSequenceExtra"


    // $ANTLR start "entryRuleCharExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:316:1: entryRuleCharExtra : ruleCharExtra EOF ;
    public final void entryRuleCharExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:317:1: ( ruleCharExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:318:1: ruleCharExtra EOF
            {
             before(grammarAccess.getCharExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharExtra_in_entryRuleCharExtra605);
            ruleCharExtra();

            state._fsp--;

             after(grammarAccess.getCharExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharExtra612); 

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
    // $ANTLR end "entryRuleCharExtra"


    // $ANTLR start "ruleCharExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:325:1: ruleCharExtra : ( ( rule__CharExtra__Group__0 ) ) ;
    public final void ruleCharExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:329:2: ( ( ( rule__CharExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:330:1: ( ( rule__CharExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:330:1: ( ( rule__CharExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:331:1: ( rule__CharExtra__Group__0 )
            {
             before(grammarAccess.getCharExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:332:1: ( rule__CharExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:332:2: rule__CharExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__0_in_ruleCharExtra638);
            rule__CharExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleCharExtra"


    // $ANTLR start "entryRuleBundleExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:344:1: entryRuleBundleExtra : ruleBundleExtra EOF ;
    public final void entryRuleBundleExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:345:1: ( ruleBundleExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:346:1: ruleBundleExtra EOF
            {
             before(grammarAccess.getBundleExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundleExtra_in_entryRuleBundleExtra665);
            ruleBundleExtra();

            state._fsp--;

             after(grammarAccess.getBundleExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBundleExtra672); 

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
    // $ANTLR end "entryRuleBundleExtra"


    // $ANTLR start "ruleBundleExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:353:1: ruleBundleExtra : ( ( rule__BundleExtra__Group__0 ) ) ;
    public final void ruleBundleExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:357:2: ( ( ( rule__BundleExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:358:1: ( ( rule__BundleExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:358:1: ( ( rule__BundleExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:359:1: ( rule__BundleExtra__Group__0 )
            {
             before(grammarAccess.getBundleExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:360:1: ( rule__BundleExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:360:2: rule__BundleExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__0_in_ruleBundleExtra698);
            rule__BundleExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBundleExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleBundleExtra"


    // $ANTLR start "entryRuleParceableExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:372:1: entryRuleParceableExtra : ruleParceableExtra EOF ;
    public final void entryRuleParceableExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:373:1: ( ruleParceableExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:374:1: ruleParceableExtra EOF
            {
             before(grammarAccess.getParceableExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParceableExtra_in_entryRuleParceableExtra725);
            ruleParceableExtra();

            state._fsp--;

             after(grammarAccess.getParceableExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParceableExtra732); 

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
    // $ANTLR end "entryRuleParceableExtra"


    // $ANTLR start "ruleParceableExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:381:1: ruleParceableExtra : ( ( rule__ParceableExtra__Group__0 ) ) ;
    public final void ruleParceableExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:385:2: ( ( ( rule__ParceableExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:386:1: ( ( rule__ParceableExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:386:1: ( ( rule__ParceableExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:387:1: ( rule__ParceableExtra__Group__0 )
            {
             before(grammarAccess.getParceableExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:388:1: ( rule__ParceableExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:388:2: rule__ParceableExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__0_in_ruleParceableExtra758);
            rule__ParceableExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParceableExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleParceableExtra"


    // $ANTLR start "entryRuleSerializableExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:400:1: entryRuleSerializableExtra : ruleSerializableExtra EOF ;
    public final void entryRuleSerializableExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:401:1: ( ruleSerializableExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:402:1: ruleSerializableExtra EOF
            {
             before(grammarAccess.getSerializableExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSerializableExtra_in_entryRuleSerializableExtra785);
            ruleSerializableExtra();

            state._fsp--;

             after(grammarAccess.getSerializableExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSerializableExtra792); 

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
    // $ANTLR end "entryRuleSerializableExtra"


    // $ANTLR start "ruleSerializableExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:409:1: ruleSerializableExtra : ( ( rule__SerializableExtra__Group__0 ) ) ;
    public final void ruleSerializableExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:413:2: ( ( ( rule__SerializableExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:414:1: ( ( rule__SerializableExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:414:1: ( ( rule__SerializableExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:415:1: ( rule__SerializableExtra__Group__0 )
            {
             before(grammarAccess.getSerializableExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:416:1: ( rule__SerializableExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:416:2: rule__SerializableExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__0_in_ruleSerializableExtra818);
            rule__SerializableExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSerializableExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleSerializableExtra"


    // $ANTLR start "entryRuleFloatExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:428:1: entryRuleFloatExtra : ruleFloatExtra EOF ;
    public final void entryRuleFloatExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:429:1: ( ruleFloatExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:430:1: ruleFloatExtra EOF
            {
             before(grammarAccess.getFloatExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloatExtra_in_entryRuleFloatExtra845);
            ruleFloatExtra();

            state._fsp--;

             after(grammarAccess.getFloatExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatExtra852); 

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
    // $ANTLR end "entryRuleFloatExtra"


    // $ANTLR start "ruleFloatExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:437:1: ruleFloatExtra : ( ( rule__FloatExtra__Group__0 ) ) ;
    public final void ruleFloatExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:441:2: ( ( ( rule__FloatExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:442:1: ( ( rule__FloatExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:442:1: ( ( rule__FloatExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:443:1: ( rule__FloatExtra__Group__0 )
            {
             before(grammarAccess.getFloatExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:444:1: ( rule__FloatExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:444:2: rule__FloatExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__0_in_ruleFloatExtra878);
            rule__FloatExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleFloatExtra"


    // $ANTLR start "entryRuleByteExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:456:1: entryRuleByteExtra : ruleByteExtra EOF ;
    public final void entryRuleByteExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:457:1: ( ruleByteExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:458:1: ruleByteExtra EOF
            {
             before(grammarAccess.getByteExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleByteExtra_in_entryRuleByteExtra905);
            ruleByteExtra();

            state._fsp--;

             after(grammarAccess.getByteExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleByteExtra912); 

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
    // $ANTLR end "entryRuleByteExtra"


    // $ANTLR start "ruleByteExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:465:1: ruleByteExtra : ( ( rule__ByteExtra__Group__0 ) ) ;
    public final void ruleByteExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:469:2: ( ( ( rule__ByteExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:470:1: ( ( rule__ByteExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:470:1: ( ( rule__ByteExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:471:1: ( rule__ByteExtra__Group__0 )
            {
             before(grammarAccess.getByteExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:472:1: ( rule__ByteExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:472:2: rule__ByteExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__0_in_ruleByteExtra938);
            rule__ByteExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByteExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleByteExtra"


    // $ANTLR start "entryRuleLongExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:484:1: entryRuleLongExtra : ruleLongExtra EOF ;
    public final void entryRuleLongExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:485:1: ( ruleLongExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:486:1: ruleLongExtra EOF
            {
             before(grammarAccess.getLongExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLongExtra_in_entryRuleLongExtra965);
            ruleLongExtra();

            state._fsp--;

             after(grammarAccess.getLongExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLongExtra972); 

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
    // $ANTLR end "entryRuleLongExtra"


    // $ANTLR start "ruleLongExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:493:1: ruleLongExtra : ( ( rule__LongExtra__Group__0 ) ) ;
    public final void ruleLongExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:497:2: ( ( ( rule__LongExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:498:1: ( ( rule__LongExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:498:1: ( ( rule__LongExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:499:1: ( rule__LongExtra__Group__0 )
            {
             before(grammarAccess.getLongExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:500:1: ( rule__LongExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:500:2: rule__LongExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__0_in_ruleLongExtra998);
            rule__LongExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLongExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleLongExtra"


    // $ANTLR start "entryRuleStringExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:512:1: entryRuleStringExtra : ruleStringExtra EOF ;
    public final void entryRuleStringExtra() throws RecognitionException {
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:513:1: ( ruleStringExtra EOF )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:514:1: ruleStringExtra EOF
            {
             before(grammarAccess.getStringExtraRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringExtra_in_entryRuleStringExtra1025);
            ruleStringExtra();

            state._fsp--;

             after(grammarAccess.getStringExtraRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringExtra1032); 

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
    // $ANTLR end "entryRuleStringExtra"


    // $ANTLR start "ruleStringExtra"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:521:1: ruleStringExtra : ( ( rule__StringExtra__Group__0 ) ) ;
    public final void ruleStringExtra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:525:2: ( ( ( rule__StringExtra__Group__0 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:526:1: ( ( rule__StringExtra__Group__0 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:526:1: ( ( rule__StringExtra__Group__0 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:527:1: ( rule__StringExtra__Group__0 )
            {
             before(grammarAccess.getStringExtraAccess().getGroup()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:528:1: ( rule__StringExtra__Group__0 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:528:2: rule__StringExtra__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__0_in_ruleStringExtra1058);
            rule__StringExtra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringExtraAccess().getGroup()); 

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
    // $ANTLR end "ruleStringExtra"


    // $ANTLR start "rule__Bundle__Alternatives"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:540:1: rule__Bundle__Alternatives : ( ( ruleBundle_Impl ) | ( ruleDoubleExtra ) | ( ruleIntExtra ) | ( ruleCharSequenceExtra ) | ( ruleCharExtra ) | ( ruleBundleExtra ) | ( ruleParceableExtra ) | ( ruleSerializableExtra ) | ( ruleFloatExtra ) | ( ruleByteExtra ) | ( ruleLongExtra ) | ( ruleStringExtra ) );
    public final void rule__Bundle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:544:1: ( ( ruleBundle_Impl ) | ( ruleDoubleExtra ) | ( ruleIntExtra ) | ( ruleCharSequenceExtra ) | ( ruleCharExtra ) | ( ruleBundleExtra ) | ( ruleParceableExtra ) | ( ruleSerializableExtra ) | ( ruleFloatExtra ) | ( ruleByteExtra ) | ( ruleLongExtra ) | ( ruleStringExtra ) )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            case 28:
                {
                alt1=5;
                }
                break;
            case 29:
                {
                alt1=6;
                }
                break;
            case 30:
                {
                alt1=7;
                }
                break;
            case 31:
                {
                alt1=8;
                }
                break;
            case 32:
                {
                alt1=9;
                }
                break;
            case 33:
                {
                alt1=10;
                }
                break;
            case 34:
                {
                alt1=11;
                }
                break;
            case 35:
                {
                alt1=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:545:1: ( ruleBundle_Impl )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:545:1: ( ruleBundle_Impl )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:546:1: ruleBundle_Impl
                    {
                     before(grammarAccess.getBundleAccess().getBundle_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBundle_Impl_in_rule__Bundle__Alternatives1094);
                    ruleBundle_Impl();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getBundle_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:551:6: ( ruleDoubleExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:551:6: ( ruleDoubleExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:552:1: ruleDoubleExtra
                    {
                     before(grammarAccess.getBundleAccess().getDoubleExtraParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleExtra_in_rule__Bundle__Alternatives1111);
                    ruleDoubleExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getDoubleExtraParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:557:6: ( ruleIntExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:557:6: ( ruleIntExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:558:1: ruleIntExtra
                    {
                     before(grammarAccess.getBundleAccess().getIntExtraParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntExtra_in_rule__Bundle__Alternatives1128);
                    ruleIntExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getIntExtraParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:563:6: ( ruleCharSequenceExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:563:6: ( ruleCharSequenceExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:564:1: ruleCharSequenceExtra
                    {
                     before(grammarAccess.getBundleAccess().getCharSequenceExtraParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCharSequenceExtra_in_rule__Bundle__Alternatives1145);
                    ruleCharSequenceExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getCharSequenceExtraParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:569:6: ( ruleCharExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:569:6: ( ruleCharExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:570:1: ruleCharExtra
                    {
                     before(grammarAccess.getBundleAccess().getCharExtraParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCharExtra_in_rule__Bundle__Alternatives1162);
                    ruleCharExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getCharExtraParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:575:6: ( ruleBundleExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:575:6: ( ruleBundleExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:576:1: ruleBundleExtra
                    {
                     before(grammarAccess.getBundleAccess().getBundleExtraParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBundleExtra_in_rule__Bundle__Alternatives1179);
                    ruleBundleExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getBundleExtraParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:581:6: ( ruleParceableExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:581:6: ( ruleParceableExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:582:1: ruleParceableExtra
                    {
                     before(grammarAccess.getBundleAccess().getParceableExtraParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleParceableExtra_in_rule__Bundle__Alternatives1196);
                    ruleParceableExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getParceableExtraParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:587:6: ( ruleSerializableExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:587:6: ( ruleSerializableExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:588:1: ruleSerializableExtra
                    {
                     before(grammarAccess.getBundleAccess().getSerializableExtraParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSerializableExtra_in_rule__Bundle__Alternatives1213);
                    ruleSerializableExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getSerializableExtraParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:593:6: ( ruleFloatExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:593:6: ( ruleFloatExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:594:1: ruleFloatExtra
                    {
                     before(grammarAccess.getBundleAccess().getFloatExtraParserRuleCall_8()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFloatExtra_in_rule__Bundle__Alternatives1230);
                    ruleFloatExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getFloatExtraParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:599:6: ( ruleByteExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:599:6: ( ruleByteExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:600:1: ruleByteExtra
                    {
                     before(grammarAccess.getBundleAccess().getByteExtraParserRuleCall_9()); 
                    pushFollow(FollowSets000.FOLLOW_ruleByteExtra_in_rule__Bundle__Alternatives1247);
                    ruleByteExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getByteExtraParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:605:6: ( ruleLongExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:605:6: ( ruleLongExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:606:1: ruleLongExtra
                    {
                     before(grammarAccess.getBundleAccess().getLongExtraParserRuleCall_10()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLongExtra_in_rule__Bundle__Alternatives1264);
                    ruleLongExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getLongExtraParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:611:6: ( ruleStringExtra )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:611:6: ( ruleStringExtra )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:612:1: ruleStringExtra
                    {
                     before(grammarAccess.getBundleAccess().getStringExtraParserRuleCall_11()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStringExtra_in_rule__Bundle__Alternatives1281);
                    ruleStringExtra();

                    state._fsp--;

                     after(grammarAccess.getBundleAccess().getStringExtraParserRuleCall_11()); 

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
    // $ANTLR end "rule__Bundle__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:622:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:626:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:627:1: ( RULE_STRING )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:627:1: ( RULE_STRING )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:628:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1313); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:633:6: ( RULE_ID )
                    {
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:633:6: ( RULE_ID )
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:634:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1330); 
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


    // $ANTLR start "rule__Intent_Impl__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:646:1: rule__Intent_Impl__Group__0 : rule__Intent_Impl__Group__0__Impl rule__Intent_Impl__Group__1 ;
    public final void rule__Intent_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:650:1: ( rule__Intent_Impl__Group__0__Impl rule__Intent_Impl__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:651:2: rule__Intent_Impl__Group__0__Impl rule__Intent_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__0__Impl_in_rule__Intent_Impl__Group__01360);
            rule__Intent_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__1_in_rule__Intent_Impl__Group__01363);
            rule__Intent_Impl__Group__1();

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
    // $ANTLR end "rule__Intent_Impl__Group__0"


    // $ANTLR start "rule__Intent_Impl__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:658:1: rule__Intent_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Intent_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:662:1: ( ( () ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:663:1: ( () )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:663:1: ( () )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:664:1: ()
            {
             before(grammarAccess.getIntent_ImplAccess().getIntentAction_0()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:665:1: ()
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:667:1: 
            {
            }

             after(grammarAccess.getIntent_ImplAccess().getIntentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent_Impl__Group__0__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:677:1: rule__Intent_Impl__Group__1 : rule__Intent_Impl__Group__1__Impl rule__Intent_Impl__Group__2 ;
    public final void rule__Intent_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:681:1: ( rule__Intent_Impl__Group__1__Impl rule__Intent_Impl__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:682:2: rule__Intent_Impl__Group__1__Impl rule__Intent_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__1__Impl_in_rule__Intent_Impl__Group__11421);
            rule__Intent_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__2_in_rule__Intent_Impl__Group__11424);
            rule__Intent_Impl__Group__2();

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
    // $ANTLR end "rule__Intent_Impl__Group__1"


    // $ANTLR start "rule__Intent_Impl__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:689:1: rule__Intent_Impl__Group__1__Impl : ( 'Intent' ) ;
    public final void rule__Intent_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:693:1: ( ( 'Intent' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:694:1: ( 'Intent' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:694:1: ( 'Intent' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:695:1: 'Intent'
            {
             before(grammarAccess.getIntent_ImplAccess().getIntentKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Intent_Impl__Group__1__Impl1452); 
             after(grammarAccess.getIntent_ImplAccess().getIntentKeyword_1()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__1__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:708:1: rule__Intent_Impl__Group__2 : rule__Intent_Impl__Group__2__Impl rule__Intent_Impl__Group__3 ;
    public final void rule__Intent_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:712:1: ( rule__Intent_Impl__Group__2__Impl rule__Intent_Impl__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:713:2: rule__Intent_Impl__Group__2__Impl rule__Intent_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__2__Impl_in_rule__Intent_Impl__Group__21483);
            rule__Intent_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__3_in_rule__Intent_Impl__Group__21486);
            rule__Intent_Impl__Group__3();

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
    // $ANTLR end "rule__Intent_Impl__Group__2"


    // $ANTLR start "rule__Intent_Impl__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:720:1: rule__Intent_Impl__Group__2__Impl : ( ( rule__Intent_Impl__NameAssignment_2 ) ) ;
    public final void rule__Intent_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:724:1: ( ( ( rule__Intent_Impl__NameAssignment_2 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:725:1: ( ( rule__Intent_Impl__NameAssignment_2 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:725:1: ( ( rule__Intent_Impl__NameAssignment_2 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:726:1: ( rule__Intent_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getIntent_ImplAccess().getNameAssignment_2()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:727:1: ( rule__Intent_Impl__NameAssignment_2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:727:2: rule__Intent_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__NameAssignment_2_in_rule__Intent_Impl__Group__2__Impl1513);
            rule__Intent_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__2__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:737:1: rule__Intent_Impl__Group__3 : rule__Intent_Impl__Group__3__Impl rule__Intent_Impl__Group__4 ;
    public final void rule__Intent_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:741:1: ( rule__Intent_Impl__Group__3__Impl rule__Intent_Impl__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:742:2: rule__Intent_Impl__Group__3__Impl rule__Intent_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__3__Impl_in_rule__Intent_Impl__Group__31543);
            rule__Intent_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__4_in_rule__Intent_Impl__Group__31546);
            rule__Intent_Impl__Group__4();

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
    // $ANTLR end "rule__Intent_Impl__Group__3"


    // $ANTLR start "rule__Intent_Impl__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:749:1: rule__Intent_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__Intent_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:753:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:754:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:754:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:755:1: '{'
            {
             before(grammarAccess.getIntent_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Intent_Impl__Group__3__Impl1574); 
             after(grammarAccess.getIntent_ImplAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__3__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:768:1: rule__Intent_Impl__Group__4 : rule__Intent_Impl__Group__4__Impl rule__Intent_Impl__Group__5 ;
    public final void rule__Intent_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:772:1: ( rule__Intent_Impl__Group__4__Impl rule__Intent_Impl__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:773:2: rule__Intent_Impl__Group__4__Impl rule__Intent_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__4__Impl_in_rule__Intent_Impl__Group__41605);
            rule__Intent_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__5_in_rule__Intent_Impl__Group__41608);
            rule__Intent_Impl__Group__5();

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
    // $ANTLR end "rule__Intent_Impl__Group__4"


    // $ANTLR start "rule__Intent_Impl__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:780:1: rule__Intent_Impl__Group__4__Impl : ( ( rule__Intent_Impl__Group_4__0 )? ) ;
    public final void rule__Intent_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:784:1: ( ( ( rule__Intent_Impl__Group_4__0 )? ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:785:1: ( ( rule__Intent_Impl__Group_4__0 )? )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:785:1: ( ( rule__Intent_Impl__Group_4__0 )? )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:786:1: ( rule__Intent_Impl__Group_4__0 )?
            {
             before(grammarAccess.getIntent_ImplAccess().getGroup_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:787:1: ( rule__Intent_Impl__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:787:2: rule__Intent_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_4__0_in_rule__Intent_Impl__Group__4__Impl1635);
                    rule__Intent_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntent_ImplAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__4__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:797:1: rule__Intent_Impl__Group__5 : rule__Intent_Impl__Group__5__Impl rule__Intent_Impl__Group__6 ;
    public final void rule__Intent_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:801:1: ( rule__Intent_Impl__Group__5__Impl rule__Intent_Impl__Group__6 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:802:2: rule__Intent_Impl__Group__5__Impl rule__Intent_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__5__Impl_in_rule__Intent_Impl__Group__51666);
            rule__Intent_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__6_in_rule__Intent_Impl__Group__51669);
            rule__Intent_Impl__Group__6();

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
    // $ANTLR end "rule__Intent_Impl__Group__5"


    // $ANTLR start "rule__Intent_Impl__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:809:1: rule__Intent_Impl__Group__5__Impl : ( ( rule__Intent_Impl__Group_5__0 )? ) ;
    public final void rule__Intent_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:813:1: ( ( ( rule__Intent_Impl__Group_5__0 )? ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:814:1: ( ( rule__Intent_Impl__Group_5__0 )? )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:814:1: ( ( rule__Intent_Impl__Group_5__0 )? )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:815:1: ( rule__Intent_Impl__Group_5__0 )?
            {
             before(grammarAccess.getIntent_ImplAccess().getGroup_5()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:816:1: ( rule__Intent_Impl__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:816:2: rule__Intent_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_5__0_in_rule__Intent_Impl__Group__5__Impl1696);
                    rule__Intent_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntent_ImplAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__5__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__6"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:826:1: rule__Intent_Impl__Group__6 : rule__Intent_Impl__Group__6__Impl rule__Intent_Impl__Group__7 ;
    public final void rule__Intent_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:830:1: ( rule__Intent_Impl__Group__6__Impl rule__Intent_Impl__Group__7 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:831:2: rule__Intent_Impl__Group__6__Impl rule__Intent_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__6__Impl_in_rule__Intent_Impl__Group__61727);
            rule__Intent_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__7_in_rule__Intent_Impl__Group__61730);
            rule__Intent_Impl__Group__7();

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
    // $ANTLR end "rule__Intent_Impl__Group__6"


    // $ANTLR start "rule__Intent_Impl__Group__6__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:838:1: rule__Intent_Impl__Group__6__Impl : ( ( rule__Intent_Impl__Group_6__0 )? ) ;
    public final void rule__Intent_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:842:1: ( ( ( rule__Intent_Impl__Group_6__0 )? ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:843:1: ( ( rule__Intent_Impl__Group_6__0 )? )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:843:1: ( ( rule__Intent_Impl__Group_6__0 )? )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:844:1: ( rule__Intent_Impl__Group_6__0 )?
            {
             before(grammarAccess.getIntent_ImplAccess().getGroup_6()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:845:1: ( rule__Intent_Impl__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:845:2: rule__Intent_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_6__0_in_rule__Intent_Impl__Group__6__Impl1757);
                    rule__Intent_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntent_ImplAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__6__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__7"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:855:1: rule__Intent_Impl__Group__7 : rule__Intent_Impl__Group__7__Impl rule__Intent_Impl__Group__8 ;
    public final void rule__Intent_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:859:1: ( rule__Intent_Impl__Group__7__Impl rule__Intent_Impl__Group__8 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:860:2: rule__Intent_Impl__Group__7__Impl rule__Intent_Impl__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__7__Impl_in_rule__Intent_Impl__Group__71788);
            rule__Intent_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__8_in_rule__Intent_Impl__Group__71791);
            rule__Intent_Impl__Group__8();

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
    // $ANTLR end "rule__Intent_Impl__Group__7"


    // $ANTLR start "rule__Intent_Impl__Group__7__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:867:1: rule__Intent_Impl__Group__7__Impl : ( ( rule__Intent_Impl__Group_7__0 )? ) ;
    public final void rule__Intent_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:871:1: ( ( ( rule__Intent_Impl__Group_7__0 )? ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:872:1: ( ( rule__Intent_Impl__Group_7__0 )? )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:872:1: ( ( rule__Intent_Impl__Group_7__0 )? )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:873:1: ( rule__Intent_Impl__Group_7__0 )?
            {
             before(grammarAccess.getIntent_ImplAccess().getGroup_7()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:874:1: ( rule__Intent_Impl__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:874:2: rule__Intent_Impl__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__0_in_rule__Intent_Impl__Group__7__Impl1818);
                    rule__Intent_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntent_ImplAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__7__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__8"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:884:1: rule__Intent_Impl__Group__8 : rule__Intent_Impl__Group__8__Impl rule__Intent_Impl__Group__9 ;
    public final void rule__Intent_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:888:1: ( rule__Intent_Impl__Group__8__Impl rule__Intent_Impl__Group__9 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:889:2: rule__Intent_Impl__Group__8__Impl rule__Intent_Impl__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__8__Impl_in_rule__Intent_Impl__Group__81849);
            rule__Intent_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__9_in_rule__Intent_Impl__Group__81852);
            rule__Intent_Impl__Group__9();

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
    // $ANTLR end "rule__Intent_Impl__Group__8"


    // $ANTLR start "rule__Intent_Impl__Group__8__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:896:1: rule__Intent_Impl__Group__8__Impl : ( ( rule__Intent_Impl__Group_8__0 )? ) ;
    public final void rule__Intent_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:900:1: ( ( ( rule__Intent_Impl__Group_8__0 )? ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:901:1: ( ( rule__Intent_Impl__Group_8__0 )? )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:901:1: ( ( rule__Intent_Impl__Group_8__0 )? )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:902:1: ( rule__Intent_Impl__Group_8__0 )?
            {
             before(grammarAccess.getIntent_ImplAccess().getGroup_8()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:903:1: ( rule__Intent_Impl__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:903:2: rule__Intent_Impl__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_8__0_in_rule__Intent_Impl__Group__8__Impl1879);
                    rule__Intent_Impl__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntent_ImplAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__8__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__9"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:913:1: rule__Intent_Impl__Group__9 : rule__Intent_Impl__Group__9__Impl rule__Intent_Impl__Group__10 ;
    public final void rule__Intent_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:917:1: ( rule__Intent_Impl__Group__9__Impl rule__Intent_Impl__Group__10 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:918:2: rule__Intent_Impl__Group__9__Impl rule__Intent_Impl__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__9__Impl_in_rule__Intent_Impl__Group__91910);
            rule__Intent_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__10_in_rule__Intent_Impl__Group__91913);
            rule__Intent_Impl__Group__10();

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
    // $ANTLR end "rule__Intent_Impl__Group__9"


    // $ANTLR start "rule__Intent_Impl__Group__9__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:925:1: rule__Intent_Impl__Group__9__Impl : ( ( rule__Intent_Impl__Group_9__0 )? ) ;
    public final void rule__Intent_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:929:1: ( ( ( rule__Intent_Impl__Group_9__0 )? ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:930:1: ( ( rule__Intent_Impl__Group_9__0 )? )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:930:1: ( ( rule__Intent_Impl__Group_9__0 )? )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:931:1: ( rule__Intent_Impl__Group_9__0 )?
            {
             before(grammarAccess.getIntent_ImplAccess().getGroup_9()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:932:1: ( rule__Intent_Impl__Group_9__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:932:2: rule__Intent_Impl__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__0_in_rule__Intent_Impl__Group__9__Impl1940);
                    rule__Intent_Impl__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntent_ImplAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__9__Impl"


    // $ANTLR start "rule__Intent_Impl__Group__10"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:942:1: rule__Intent_Impl__Group__10 : rule__Intent_Impl__Group__10__Impl ;
    public final void rule__Intent_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:946:1: ( rule__Intent_Impl__Group__10__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:947:2: rule__Intent_Impl__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group__10__Impl_in_rule__Intent_Impl__Group__101971);
            rule__Intent_Impl__Group__10__Impl();

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
    // $ANTLR end "rule__Intent_Impl__Group__10"


    // $ANTLR start "rule__Intent_Impl__Group__10__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:953:1: rule__Intent_Impl__Group__10__Impl : ( '}' ) ;
    public final void rule__Intent_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:957:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:958:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:958:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:959:1: '}'
            {
             before(grammarAccess.getIntent_ImplAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Intent_Impl__Group__10__Impl1999); 
             after(grammarAccess.getIntent_ImplAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Intent_Impl__Group__10__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_4__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:994:1: rule__Intent_Impl__Group_4__0 : rule__Intent_Impl__Group_4__0__Impl rule__Intent_Impl__Group_4__1 ;
    public final void rule__Intent_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:998:1: ( rule__Intent_Impl__Group_4__0__Impl rule__Intent_Impl__Group_4__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:999:2: rule__Intent_Impl__Group_4__0__Impl rule__Intent_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_4__0__Impl_in_rule__Intent_Impl__Group_4__02052);
            rule__Intent_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_4__1_in_rule__Intent_Impl__Group_4__02055);
            rule__Intent_Impl__Group_4__1();

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
    // $ANTLR end "rule__Intent_Impl__Group_4__0"


    // $ANTLR start "rule__Intent_Impl__Group_4__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1006:1: rule__Intent_Impl__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Intent_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1010:1: ( ( 'type' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1011:1: ( 'type' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1011:1: ( 'type' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1012:1: 'type'
            {
             before(grammarAccess.getIntent_ImplAccess().getTypeKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Intent_Impl__Group_4__0__Impl2083); 
             after(grammarAccess.getIntent_ImplAccess().getTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_4__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1025:1: rule__Intent_Impl__Group_4__1 : rule__Intent_Impl__Group_4__1__Impl ;
    public final void rule__Intent_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1029:1: ( rule__Intent_Impl__Group_4__1__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1030:2: rule__Intent_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_4__1__Impl_in_rule__Intent_Impl__Group_4__12114);
            rule__Intent_Impl__Group_4__1__Impl();

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
    // $ANTLR end "rule__Intent_Impl__Group_4__1"


    // $ANTLR start "rule__Intent_Impl__Group_4__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1036:1: rule__Intent_Impl__Group_4__1__Impl : ( ( rule__Intent_Impl__TypeAssignment_4_1 ) ) ;
    public final void rule__Intent_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1040:1: ( ( ( rule__Intent_Impl__TypeAssignment_4_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1041:1: ( ( rule__Intent_Impl__TypeAssignment_4_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1041:1: ( ( rule__Intent_Impl__TypeAssignment_4_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1042:1: ( rule__Intent_Impl__TypeAssignment_4_1 )
            {
             before(grammarAccess.getIntent_ImplAccess().getTypeAssignment_4_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1043:1: ( rule__Intent_Impl__TypeAssignment_4_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1043:2: rule__Intent_Impl__TypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__TypeAssignment_4_1_in_rule__Intent_Impl__Group_4__1__Impl2141);
            rule__Intent_Impl__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_5__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1057:1: rule__Intent_Impl__Group_5__0 : rule__Intent_Impl__Group_5__0__Impl rule__Intent_Impl__Group_5__1 ;
    public final void rule__Intent_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1061:1: ( rule__Intent_Impl__Group_5__0__Impl rule__Intent_Impl__Group_5__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1062:2: rule__Intent_Impl__Group_5__0__Impl rule__Intent_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_5__0__Impl_in_rule__Intent_Impl__Group_5__02175);
            rule__Intent_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_5__1_in_rule__Intent_Impl__Group_5__02178);
            rule__Intent_Impl__Group_5__1();

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
    // $ANTLR end "rule__Intent_Impl__Group_5__0"


    // $ANTLR start "rule__Intent_Impl__Group_5__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1069:1: rule__Intent_Impl__Group_5__0__Impl : ( 'data' ) ;
    public final void rule__Intent_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1073:1: ( ( 'data' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1074:1: ( 'data' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1074:1: ( 'data' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1075:1: 'data'
            {
             before(grammarAccess.getIntent_ImplAccess().getDataKeyword_5_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Intent_Impl__Group_5__0__Impl2206); 
             after(grammarAccess.getIntent_ImplAccess().getDataKeyword_5_0()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_5__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1088:1: rule__Intent_Impl__Group_5__1 : rule__Intent_Impl__Group_5__1__Impl ;
    public final void rule__Intent_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1092:1: ( rule__Intent_Impl__Group_5__1__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1093:2: rule__Intent_Impl__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_5__1__Impl_in_rule__Intent_Impl__Group_5__12237);
            rule__Intent_Impl__Group_5__1__Impl();

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
    // $ANTLR end "rule__Intent_Impl__Group_5__1"


    // $ANTLR start "rule__Intent_Impl__Group_5__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1099:1: rule__Intent_Impl__Group_5__1__Impl : ( ( rule__Intent_Impl__DataAssignment_5_1 ) ) ;
    public final void rule__Intent_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1103:1: ( ( ( rule__Intent_Impl__DataAssignment_5_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1104:1: ( ( rule__Intent_Impl__DataAssignment_5_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1104:1: ( ( rule__Intent_Impl__DataAssignment_5_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1105:1: ( rule__Intent_Impl__DataAssignment_5_1 )
            {
             before(grammarAccess.getIntent_ImplAccess().getDataAssignment_5_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1106:1: ( rule__Intent_Impl__DataAssignment_5_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1106:2: rule__Intent_Impl__DataAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__DataAssignment_5_1_in_rule__Intent_Impl__Group_5__1__Impl2264);
            rule__Intent_Impl__DataAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getDataAssignment_5_1()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_6__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1120:1: rule__Intent_Impl__Group_6__0 : rule__Intent_Impl__Group_6__0__Impl rule__Intent_Impl__Group_6__1 ;
    public final void rule__Intent_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1124:1: ( rule__Intent_Impl__Group_6__0__Impl rule__Intent_Impl__Group_6__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1125:2: rule__Intent_Impl__Group_6__0__Impl rule__Intent_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_6__0__Impl_in_rule__Intent_Impl__Group_6__02298);
            rule__Intent_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_6__1_in_rule__Intent_Impl__Group_6__02301);
            rule__Intent_Impl__Group_6__1();

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
    // $ANTLR end "rule__Intent_Impl__Group_6__0"


    // $ANTLR start "rule__Intent_Impl__Group_6__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1132:1: rule__Intent_Impl__Group_6__0__Impl : ( 'exceptionName' ) ;
    public final void rule__Intent_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1136:1: ( ( 'exceptionName' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1137:1: ( 'exceptionName' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1137:1: ( 'exceptionName' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1138:1: 'exceptionName'
            {
             before(grammarAccess.getIntent_ImplAccess().getExceptionNameKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Intent_Impl__Group_6__0__Impl2329); 
             after(grammarAccess.getIntent_ImplAccess().getExceptionNameKeyword_6_0()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_6__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1151:1: rule__Intent_Impl__Group_6__1 : rule__Intent_Impl__Group_6__1__Impl ;
    public final void rule__Intent_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1155:1: ( rule__Intent_Impl__Group_6__1__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1156:2: rule__Intent_Impl__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_6__1__Impl_in_rule__Intent_Impl__Group_6__12360);
            rule__Intent_Impl__Group_6__1__Impl();

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
    // $ANTLR end "rule__Intent_Impl__Group_6__1"


    // $ANTLR start "rule__Intent_Impl__Group_6__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1162:1: rule__Intent_Impl__Group_6__1__Impl : ( ( rule__Intent_Impl__ExceptionNameAssignment_6_1 ) ) ;
    public final void rule__Intent_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1166:1: ( ( ( rule__Intent_Impl__ExceptionNameAssignment_6_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1167:1: ( ( rule__Intent_Impl__ExceptionNameAssignment_6_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1167:1: ( ( rule__Intent_Impl__ExceptionNameAssignment_6_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1168:1: ( rule__Intent_Impl__ExceptionNameAssignment_6_1 )
            {
             before(grammarAccess.getIntent_ImplAccess().getExceptionNameAssignment_6_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1169:1: ( rule__Intent_Impl__ExceptionNameAssignment_6_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1169:2: rule__Intent_Impl__ExceptionNameAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__ExceptionNameAssignment_6_1_in_rule__Intent_Impl__Group_6__1__Impl2387);
            rule__Intent_Impl__ExceptionNameAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getExceptionNameAssignment_6_1()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_7__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1183:1: rule__Intent_Impl__Group_7__0 : rule__Intent_Impl__Group_7__0__Impl rule__Intent_Impl__Group_7__1 ;
    public final void rule__Intent_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1187:1: ( rule__Intent_Impl__Group_7__0__Impl rule__Intent_Impl__Group_7__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1188:2: rule__Intent_Impl__Group_7__0__Impl rule__Intent_Impl__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__0__Impl_in_rule__Intent_Impl__Group_7__02421);
            rule__Intent_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__1_in_rule__Intent_Impl__Group_7__02424);
            rule__Intent_Impl__Group_7__1();

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
    // $ANTLR end "rule__Intent_Impl__Group_7__0"


    // $ANTLR start "rule__Intent_Impl__Group_7__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1195:1: rule__Intent_Impl__Group_7__0__Impl : ( 'extras' ) ;
    public final void rule__Intent_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1199:1: ( ( 'extras' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1200:1: ( 'extras' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1200:1: ( 'extras' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1201:1: 'extras'
            {
             before(grammarAccess.getIntent_ImplAccess().getExtrasKeyword_7_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Intent_Impl__Group_7__0__Impl2452); 
             after(grammarAccess.getIntent_ImplAccess().getExtrasKeyword_7_0()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_7__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1214:1: rule__Intent_Impl__Group_7__1 : rule__Intent_Impl__Group_7__1__Impl rule__Intent_Impl__Group_7__2 ;
    public final void rule__Intent_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1218:1: ( rule__Intent_Impl__Group_7__1__Impl rule__Intent_Impl__Group_7__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1219:2: rule__Intent_Impl__Group_7__1__Impl rule__Intent_Impl__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__1__Impl_in_rule__Intent_Impl__Group_7__12483);
            rule__Intent_Impl__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__2_in_rule__Intent_Impl__Group_7__12486);
            rule__Intent_Impl__Group_7__2();

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
    // $ANTLR end "rule__Intent_Impl__Group_7__1"


    // $ANTLR start "rule__Intent_Impl__Group_7__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1226:1: rule__Intent_Impl__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Intent_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1230:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1231:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1231:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1232:1: '{'
            {
             before(grammarAccess.getIntent_ImplAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Intent_Impl__Group_7__1__Impl2514); 
             after(grammarAccess.getIntent_ImplAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_7__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1245:1: rule__Intent_Impl__Group_7__2 : rule__Intent_Impl__Group_7__2__Impl rule__Intent_Impl__Group_7__3 ;
    public final void rule__Intent_Impl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1249:1: ( rule__Intent_Impl__Group_7__2__Impl rule__Intent_Impl__Group_7__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1250:2: rule__Intent_Impl__Group_7__2__Impl rule__Intent_Impl__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__2__Impl_in_rule__Intent_Impl__Group_7__22545);
            rule__Intent_Impl__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__3_in_rule__Intent_Impl__Group_7__22548);
            rule__Intent_Impl__Group_7__3();

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
    // $ANTLR end "rule__Intent_Impl__Group_7__2"


    // $ANTLR start "rule__Intent_Impl__Group_7__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1257:1: rule__Intent_Impl__Group_7__2__Impl : ( ( rule__Intent_Impl__ExtrasAssignment_7_2 ) ) ;
    public final void rule__Intent_Impl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1261:1: ( ( ( rule__Intent_Impl__ExtrasAssignment_7_2 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1262:1: ( ( rule__Intent_Impl__ExtrasAssignment_7_2 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1262:1: ( ( rule__Intent_Impl__ExtrasAssignment_7_2 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1263:1: ( rule__Intent_Impl__ExtrasAssignment_7_2 )
            {
             before(grammarAccess.getIntent_ImplAccess().getExtrasAssignment_7_2()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1264:1: ( rule__Intent_Impl__ExtrasAssignment_7_2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1264:2: rule__Intent_Impl__ExtrasAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__ExtrasAssignment_7_2_in_rule__Intent_Impl__Group_7__2__Impl2575);
            rule__Intent_Impl__ExtrasAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getExtrasAssignment_7_2()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_7__2__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_7__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1274:1: rule__Intent_Impl__Group_7__3 : rule__Intent_Impl__Group_7__3__Impl rule__Intent_Impl__Group_7__4 ;
    public final void rule__Intent_Impl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1278:1: ( rule__Intent_Impl__Group_7__3__Impl rule__Intent_Impl__Group_7__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1279:2: rule__Intent_Impl__Group_7__3__Impl rule__Intent_Impl__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__3__Impl_in_rule__Intent_Impl__Group_7__32605);
            rule__Intent_Impl__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__4_in_rule__Intent_Impl__Group_7__32608);
            rule__Intent_Impl__Group_7__4();

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
    // $ANTLR end "rule__Intent_Impl__Group_7__3"


    // $ANTLR start "rule__Intent_Impl__Group_7__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1286:1: rule__Intent_Impl__Group_7__3__Impl : ( ( rule__Intent_Impl__Group_7_3__0 )* ) ;
    public final void rule__Intent_Impl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1290:1: ( ( ( rule__Intent_Impl__Group_7_3__0 )* ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1291:1: ( ( rule__Intent_Impl__Group_7_3__0 )* )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1291:1: ( ( rule__Intent_Impl__Group_7_3__0 )* )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1292:1: ( rule__Intent_Impl__Group_7_3__0 )*
            {
             before(grammarAccess.getIntent_ImplAccess().getGroup_7_3()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1293:1: ( rule__Intent_Impl__Group_7_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1293:2: rule__Intent_Impl__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7_3__0_in_rule__Intent_Impl__Group_7__3__Impl2635);
            	    rule__Intent_Impl__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getIntent_ImplAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_7__3__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_7__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1303:1: rule__Intent_Impl__Group_7__4 : rule__Intent_Impl__Group_7__4__Impl ;
    public final void rule__Intent_Impl__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1307:1: ( rule__Intent_Impl__Group_7__4__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1308:2: rule__Intent_Impl__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7__4__Impl_in_rule__Intent_Impl__Group_7__42666);
            rule__Intent_Impl__Group_7__4__Impl();

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
    // $ANTLR end "rule__Intent_Impl__Group_7__4"


    // $ANTLR start "rule__Intent_Impl__Group_7__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1314:1: rule__Intent_Impl__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Intent_Impl__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1318:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1319:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1319:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1320:1: '}'
            {
             before(grammarAccess.getIntent_ImplAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Intent_Impl__Group_7__4__Impl2694); 
             after(grammarAccess.getIntent_ImplAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_7__4__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_7_3__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1343:1: rule__Intent_Impl__Group_7_3__0 : rule__Intent_Impl__Group_7_3__0__Impl rule__Intent_Impl__Group_7_3__1 ;
    public final void rule__Intent_Impl__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1347:1: ( rule__Intent_Impl__Group_7_3__0__Impl rule__Intent_Impl__Group_7_3__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1348:2: rule__Intent_Impl__Group_7_3__0__Impl rule__Intent_Impl__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7_3__0__Impl_in_rule__Intent_Impl__Group_7_3__02735);
            rule__Intent_Impl__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7_3__1_in_rule__Intent_Impl__Group_7_3__02738);
            rule__Intent_Impl__Group_7_3__1();

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
    // $ANTLR end "rule__Intent_Impl__Group_7_3__0"


    // $ANTLR start "rule__Intent_Impl__Group_7_3__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1355:1: rule__Intent_Impl__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Intent_Impl__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1359:1: ( ( ',' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1360:1: ( ',' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1360:1: ( ',' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1361:1: ','
            {
             before(grammarAccess.getIntent_ImplAccess().getCommaKeyword_7_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Intent_Impl__Group_7_3__0__Impl2766); 
             after(grammarAccess.getIntent_ImplAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_7_3__0__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_7_3__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1374:1: rule__Intent_Impl__Group_7_3__1 : rule__Intent_Impl__Group_7_3__1__Impl ;
    public final void rule__Intent_Impl__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1378:1: ( rule__Intent_Impl__Group_7_3__1__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1379:2: rule__Intent_Impl__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_7_3__1__Impl_in_rule__Intent_Impl__Group_7_3__12797);
            rule__Intent_Impl__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Intent_Impl__Group_7_3__1"


    // $ANTLR start "rule__Intent_Impl__Group_7_3__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1385:1: rule__Intent_Impl__Group_7_3__1__Impl : ( ( rule__Intent_Impl__ExtrasAssignment_7_3_1 ) ) ;
    public final void rule__Intent_Impl__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1389:1: ( ( ( rule__Intent_Impl__ExtrasAssignment_7_3_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1390:1: ( ( rule__Intent_Impl__ExtrasAssignment_7_3_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1390:1: ( ( rule__Intent_Impl__ExtrasAssignment_7_3_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1391:1: ( rule__Intent_Impl__ExtrasAssignment_7_3_1 )
            {
             before(grammarAccess.getIntent_ImplAccess().getExtrasAssignment_7_3_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1392:1: ( rule__Intent_Impl__ExtrasAssignment_7_3_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1392:2: rule__Intent_Impl__ExtrasAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__ExtrasAssignment_7_3_1_in_rule__Intent_Impl__Group_7_3__1__Impl2824);
            rule__Intent_Impl__ExtrasAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getExtrasAssignment_7_3_1()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_7_3__1__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_8__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1406:1: rule__Intent_Impl__Group_8__0 : rule__Intent_Impl__Group_8__0__Impl rule__Intent_Impl__Group_8__1 ;
    public final void rule__Intent_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1410:1: ( rule__Intent_Impl__Group_8__0__Impl rule__Intent_Impl__Group_8__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1411:2: rule__Intent_Impl__Group_8__0__Impl rule__Intent_Impl__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_8__0__Impl_in_rule__Intent_Impl__Group_8__02858);
            rule__Intent_Impl__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_8__1_in_rule__Intent_Impl__Group_8__02861);
            rule__Intent_Impl__Group_8__1();

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
    // $ANTLR end "rule__Intent_Impl__Group_8__0"


    // $ANTLR start "rule__Intent_Impl__Group_8__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1418:1: rule__Intent_Impl__Group_8__0__Impl : ( 'sucessCallback' ) ;
    public final void rule__Intent_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1422:1: ( ( 'sucessCallback' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1423:1: ( 'sucessCallback' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1423:1: ( 'sucessCallback' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1424:1: 'sucessCallback'
            {
             before(grammarAccess.getIntent_ImplAccess().getSucessCallbackKeyword_8_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Intent_Impl__Group_8__0__Impl2889); 
             after(grammarAccess.getIntent_ImplAccess().getSucessCallbackKeyword_8_0()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_8__0__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_8__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1437:1: rule__Intent_Impl__Group_8__1 : rule__Intent_Impl__Group_8__1__Impl ;
    public final void rule__Intent_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1441:1: ( rule__Intent_Impl__Group_8__1__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1442:2: rule__Intent_Impl__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_8__1__Impl_in_rule__Intent_Impl__Group_8__12920);
            rule__Intent_Impl__Group_8__1__Impl();

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
    // $ANTLR end "rule__Intent_Impl__Group_8__1"


    // $ANTLR start "rule__Intent_Impl__Group_8__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1448:1: rule__Intent_Impl__Group_8__1__Impl : ( ( rule__Intent_Impl__SucessCallbackAssignment_8_1 ) ) ;
    public final void rule__Intent_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1452:1: ( ( ( rule__Intent_Impl__SucessCallbackAssignment_8_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1453:1: ( ( rule__Intent_Impl__SucessCallbackAssignment_8_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1453:1: ( ( rule__Intent_Impl__SucessCallbackAssignment_8_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1454:1: ( rule__Intent_Impl__SucessCallbackAssignment_8_1 )
            {
             before(grammarAccess.getIntent_ImplAccess().getSucessCallbackAssignment_8_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1455:1: ( rule__Intent_Impl__SucessCallbackAssignment_8_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1455:2: rule__Intent_Impl__SucessCallbackAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__SucessCallbackAssignment_8_1_in_rule__Intent_Impl__Group_8__1__Impl2947);
            rule__Intent_Impl__SucessCallbackAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getSucessCallbackAssignment_8_1()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_8__1__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_9__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1469:1: rule__Intent_Impl__Group_9__0 : rule__Intent_Impl__Group_9__0__Impl rule__Intent_Impl__Group_9__1 ;
    public final void rule__Intent_Impl__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1473:1: ( rule__Intent_Impl__Group_9__0__Impl rule__Intent_Impl__Group_9__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1474:2: rule__Intent_Impl__Group_9__0__Impl rule__Intent_Impl__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__0__Impl_in_rule__Intent_Impl__Group_9__02981);
            rule__Intent_Impl__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__1_in_rule__Intent_Impl__Group_9__02984);
            rule__Intent_Impl__Group_9__1();

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
    // $ANTLR end "rule__Intent_Impl__Group_9__0"


    // $ANTLR start "rule__Intent_Impl__Group_9__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1481:1: rule__Intent_Impl__Group_9__0__Impl : ( 'permissions' ) ;
    public final void rule__Intent_Impl__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1485:1: ( ( 'permissions' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1486:1: ( 'permissions' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1486:1: ( 'permissions' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1487:1: 'permissions'
            {
             before(grammarAccess.getIntent_ImplAccess().getPermissionsKeyword_9_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Intent_Impl__Group_9__0__Impl3012); 
             after(grammarAccess.getIntent_ImplAccess().getPermissionsKeyword_9_0()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_9__0__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_9__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1500:1: rule__Intent_Impl__Group_9__1 : rule__Intent_Impl__Group_9__1__Impl rule__Intent_Impl__Group_9__2 ;
    public final void rule__Intent_Impl__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1504:1: ( rule__Intent_Impl__Group_9__1__Impl rule__Intent_Impl__Group_9__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1505:2: rule__Intent_Impl__Group_9__1__Impl rule__Intent_Impl__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__1__Impl_in_rule__Intent_Impl__Group_9__13043);
            rule__Intent_Impl__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__2_in_rule__Intent_Impl__Group_9__13046);
            rule__Intent_Impl__Group_9__2();

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
    // $ANTLR end "rule__Intent_Impl__Group_9__1"


    // $ANTLR start "rule__Intent_Impl__Group_9__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1512:1: rule__Intent_Impl__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Intent_Impl__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1516:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1517:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1517:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1518:1: '{'
            {
             before(grammarAccess.getIntent_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Intent_Impl__Group_9__1__Impl3074); 
             after(grammarAccess.getIntent_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_9__1__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_9__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1531:1: rule__Intent_Impl__Group_9__2 : rule__Intent_Impl__Group_9__2__Impl rule__Intent_Impl__Group_9__3 ;
    public final void rule__Intent_Impl__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1535:1: ( rule__Intent_Impl__Group_9__2__Impl rule__Intent_Impl__Group_9__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1536:2: rule__Intent_Impl__Group_9__2__Impl rule__Intent_Impl__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__2__Impl_in_rule__Intent_Impl__Group_9__23105);
            rule__Intent_Impl__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__3_in_rule__Intent_Impl__Group_9__23108);
            rule__Intent_Impl__Group_9__3();

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
    // $ANTLR end "rule__Intent_Impl__Group_9__2"


    // $ANTLR start "rule__Intent_Impl__Group_9__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1543:1: rule__Intent_Impl__Group_9__2__Impl : ( ( rule__Intent_Impl__PermissionsAssignment_9_2 ) ) ;
    public final void rule__Intent_Impl__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1547:1: ( ( ( rule__Intent_Impl__PermissionsAssignment_9_2 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1548:1: ( ( rule__Intent_Impl__PermissionsAssignment_9_2 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1548:1: ( ( rule__Intent_Impl__PermissionsAssignment_9_2 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1549:1: ( rule__Intent_Impl__PermissionsAssignment_9_2 )
            {
             before(grammarAccess.getIntent_ImplAccess().getPermissionsAssignment_9_2()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1550:1: ( rule__Intent_Impl__PermissionsAssignment_9_2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1550:2: rule__Intent_Impl__PermissionsAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__PermissionsAssignment_9_2_in_rule__Intent_Impl__Group_9__2__Impl3135);
            rule__Intent_Impl__PermissionsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getPermissionsAssignment_9_2()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_9__2__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_9__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1560:1: rule__Intent_Impl__Group_9__3 : rule__Intent_Impl__Group_9__3__Impl rule__Intent_Impl__Group_9__4 ;
    public final void rule__Intent_Impl__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1564:1: ( rule__Intent_Impl__Group_9__3__Impl rule__Intent_Impl__Group_9__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1565:2: rule__Intent_Impl__Group_9__3__Impl rule__Intent_Impl__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__3__Impl_in_rule__Intent_Impl__Group_9__33165);
            rule__Intent_Impl__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__4_in_rule__Intent_Impl__Group_9__33168);
            rule__Intent_Impl__Group_9__4();

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
    // $ANTLR end "rule__Intent_Impl__Group_9__3"


    // $ANTLR start "rule__Intent_Impl__Group_9__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1572:1: rule__Intent_Impl__Group_9__3__Impl : ( ( rule__Intent_Impl__Group_9_3__0 )* ) ;
    public final void rule__Intent_Impl__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1576:1: ( ( ( rule__Intent_Impl__Group_9_3__0 )* ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1577:1: ( ( rule__Intent_Impl__Group_9_3__0 )* )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1577:1: ( ( rule__Intent_Impl__Group_9_3__0 )* )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1578:1: ( rule__Intent_Impl__Group_9_3__0 )*
            {
             before(grammarAccess.getIntent_ImplAccess().getGroup_9_3()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1579:1: ( rule__Intent_Impl__Group_9_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1579:2: rule__Intent_Impl__Group_9_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9_3__0_in_rule__Intent_Impl__Group_9__3__Impl3195);
            	    rule__Intent_Impl__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getIntent_ImplAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_9__3__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_9__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1589:1: rule__Intent_Impl__Group_9__4 : rule__Intent_Impl__Group_9__4__Impl ;
    public final void rule__Intent_Impl__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1593:1: ( rule__Intent_Impl__Group_9__4__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1594:2: rule__Intent_Impl__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9__4__Impl_in_rule__Intent_Impl__Group_9__43226);
            rule__Intent_Impl__Group_9__4__Impl();

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
    // $ANTLR end "rule__Intent_Impl__Group_9__4"


    // $ANTLR start "rule__Intent_Impl__Group_9__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1600:1: rule__Intent_Impl__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Intent_Impl__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1604:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1605:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1605:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1606:1: '}'
            {
             before(grammarAccess.getIntent_ImplAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Intent_Impl__Group_9__4__Impl3254); 
             after(grammarAccess.getIntent_ImplAccess().getRightCurlyBracketKeyword_9_4()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_9__4__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_9_3__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1629:1: rule__Intent_Impl__Group_9_3__0 : rule__Intent_Impl__Group_9_3__0__Impl rule__Intent_Impl__Group_9_3__1 ;
    public final void rule__Intent_Impl__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1633:1: ( rule__Intent_Impl__Group_9_3__0__Impl rule__Intent_Impl__Group_9_3__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1634:2: rule__Intent_Impl__Group_9_3__0__Impl rule__Intent_Impl__Group_9_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9_3__0__Impl_in_rule__Intent_Impl__Group_9_3__03295);
            rule__Intent_Impl__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9_3__1_in_rule__Intent_Impl__Group_9_3__03298);
            rule__Intent_Impl__Group_9_3__1();

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
    // $ANTLR end "rule__Intent_Impl__Group_9_3__0"


    // $ANTLR start "rule__Intent_Impl__Group_9_3__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1641:1: rule__Intent_Impl__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Intent_Impl__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1645:1: ( ( ',' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1646:1: ( ',' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1646:1: ( ',' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1647:1: ','
            {
             before(grammarAccess.getIntent_ImplAccess().getCommaKeyword_9_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Intent_Impl__Group_9_3__0__Impl3326); 
             after(grammarAccess.getIntent_ImplAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_9_3__0__Impl"


    // $ANTLR start "rule__Intent_Impl__Group_9_3__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1660:1: rule__Intent_Impl__Group_9_3__1 : rule__Intent_Impl__Group_9_3__1__Impl ;
    public final void rule__Intent_Impl__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1664:1: ( rule__Intent_Impl__Group_9_3__1__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1665:2: rule__Intent_Impl__Group_9_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__Group_9_3__1__Impl_in_rule__Intent_Impl__Group_9_3__13357);
            rule__Intent_Impl__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__Intent_Impl__Group_9_3__1"


    // $ANTLR start "rule__Intent_Impl__Group_9_3__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1671:1: rule__Intent_Impl__Group_9_3__1__Impl : ( ( rule__Intent_Impl__PermissionsAssignment_9_3_1 ) ) ;
    public final void rule__Intent_Impl__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1675:1: ( ( ( rule__Intent_Impl__PermissionsAssignment_9_3_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1676:1: ( ( rule__Intent_Impl__PermissionsAssignment_9_3_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1676:1: ( ( rule__Intent_Impl__PermissionsAssignment_9_3_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1677:1: ( rule__Intent_Impl__PermissionsAssignment_9_3_1 )
            {
             before(grammarAccess.getIntent_ImplAccess().getPermissionsAssignment_9_3_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1678:1: ( rule__Intent_Impl__PermissionsAssignment_9_3_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1678:2: rule__Intent_Impl__PermissionsAssignment_9_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Intent_Impl__PermissionsAssignment_9_3_1_in_rule__Intent_Impl__Group_9_3__1__Impl3384);
            rule__Intent_Impl__PermissionsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntent_ImplAccess().getPermissionsAssignment_9_3_1()); 

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
    // $ANTLR end "rule__Intent_Impl__Group_9_3__1__Impl"


    // $ANTLR start "rule__Bundle_Impl__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1692:1: rule__Bundle_Impl__Group__0 : rule__Bundle_Impl__Group__0__Impl rule__Bundle_Impl__Group__1 ;
    public final void rule__Bundle_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1696:1: ( rule__Bundle_Impl__Group__0__Impl rule__Bundle_Impl__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1697:2: rule__Bundle_Impl__Group__0__Impl rule__Bundle_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__0__Impl_in_rule__Bundle_Impl__Group__03418);
            rule__Bundle_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__1_in_rule__Bundle_Impl__Group__03421);
            rule__Bundle_Impl__Group__1();

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
    // $ANTLR end "rule__Bundle_Impl__Group__0"


    // $ANTLR start "rule__Bundle_Impl__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1704:1: rule__Bundle_Impl__Group__0__Impl : ( 'Bundle' ) ;
    public final void rule__Bundle_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1708:1: ( ( 'Bundle' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1709:1: ( 'Bundle' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1709:1: ( 'Bundle' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1710:1: 'Bundle'
            {
             before(grammarAccess.getBundle_ImplAccess().getBundleKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Bundle_Impl__Group__0__Impl3449); 
             after(grammarAccess.getBundle_ImplAccess().getBundleKeyword_0()); 

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
    // $ANTLR end "rule__Bundle_Impl__Group__0__Impl"


    // $ANTLR start "rule__Bundle_Impl__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1723:1: rule__Bundle_Impl__Group__1 : rule__Bundle_Impl__Group__1__Impl rule__Bundle_Impl__Group__2 ;
    public final void rule__Bundle_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1727:1: ( rule__Bundle_Impl__Group__1__Impl rule__Bundle_Impl__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1728:2: rule__Bundle_Impl__Group__1__Impl rule__Bundle_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__1__Impl_in_rule__Bundle_Impl__Group__13480);
            rule__Bundle_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__2_in_rule__Bundle_Impl__Group__13483);
            rule__Bundle_Impl__Group__2();

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
    // $ANTLR end "rule__Bundle_Impl__Group__1"


    // $ANTLR start "rule__Bundle_Impl__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1735:1: rule__Bundle_Impl__Group__1__Impl : ( ( rule__Bundle_Impl__NameAssignment_1 ) ) ;
    public final void rule__Bundle_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1739:1: ( ( ( rule__Bundle_Impl__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1740:1: ( ( rule__Bundle_Impl__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1740:1: ( ( rule__Bundle_Impl__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1741:1: ( rule__Bundle_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getBundle_ImplAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1742:1: ( rule__Bundle_Impl__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1742:2: rule__Bundle_Impl__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__NameAssignment_1_in_rule__Bundle_Impl__Group__1__Impl3510);
            rule__Bundle_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBundle_ImplAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Bundle_Impl__Group__1__Impl"


    // $ANTLR start "rule__Bundle_Impl__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1752:1: rule__Bundle_Impl__Group__2 : rule__Bundle_Impl__Group__2__Impl rule__Bundle_Impl__Group__3 ;
    public final void rule__Bundle_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1756:1: ( rule__Bundle_Impl__Group__2__Impl rule__Bundle_Impl__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1757:2: rule__Bundle_Impl__Group__2__Impl rule__Bundle_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__2__Impl_in_rule__Bundle_Impl__Group__23540);
            rule__Bundle_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__3_in_rule__Bundle_Impl__Group__23543);
            rule__Bundle_Impl__Group__3();

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
    // $ANTLR end "rule__Bundle_Impl__Group__2"


    // $ANTLR start "rule__Bundle_Impl__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1764:1: rule__Bundle_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Bundle_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1768:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1769:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1769:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1770:1: '{'
            {
             before(grammarAccess.getBundle_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Bundle_Impl__Group__2__Impl3571); 
             after(grammarAccess.getBundle_ImplAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Bundle_Impl__Group__2__Impl"


    // $ANTLR start "rule__Bundle_Impl__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1783:1: rule__Bundle_Impl__Group__3 : rule__Bundle_Impl__Group__3__Impl rule__Bundle_Impl__Group__4 ;
    public final void rule__Bundle_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1787:1: ( rule__Bundle_Impl__Group__3__Impl rule__Bundle_Impl__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1788:2: rule__Bundle_Impl__Group__3__Impl rule__Bundle_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__3__Impl_in_rule__Bundle_Impl__Group__33602);
            rule__Bundle_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__4_in_rule__Bundle_Impl__Group__33605);
            rule__Bundle_Impl__Group__4();

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
    // $ANTLR end "rule__Bundle_Impl__Group__3"


    // $ANTLR start "rule__Bundle_Impl__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1795:1: rule__Bundle_Impl__Group__3__Impl : ( 'value' ) ;
    public final void rule__Bundle_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1799:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1800:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1800:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1801:1: 'value'
            {
             before(grammarAccess.getBundle_ImplAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Bundle_Impl__Group__3__Impl3633); 
             after(grammarAccess.getBundle_ImplAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__Bundle_Impl__Group__3__Impl"


    // $ANTLR start "rule__Bundle_Impl__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1814:1: rule__Bundle_Impl__Group__4 : rule__Bundle_Impl__Group__4__Impl rule__Bundle_Impl__Group__5 ;
    public final void rule__Bundle_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1818:1: ( rule__Bundle_Impl__Group__4__Impl rule__Bundle_Impl__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1819:2: rule__Bundle_Impl__Group__4__Impl rule__Bundle_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__4__Impl_in_rule__Bundle_Impl__Group__43664);
            rule__Bundle_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__5_in_rule__Bundle_Impl__Group__43667);
            rule__Bundle_Impl__Group__5();

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
    // $ANTLR end "rule__Bundle_Impl__Group__4"


    // $ANTLR start "rule__Bundle_Impl__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1826:1: rule__Bundle_Impl__Group__4__Impl : ( ( rule__Bundle_Impl__ValueAssignment_4 ) ) ;
    public final void rule__Bundle_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1830:1: ( ( ( rule__Bundle_Impl__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1831:1: ( ( rule__Bundle_Impl__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1831:1: ( ( rule__Bundle_Impl__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1832:1: ( rule__Bundle_Impl__ValueAssignment_4 )
            {
             before(grammarAccess.getBundle_ImplAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1833:1: ( rule__Bundle_Impl__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1833:2: rule__Bundle_Impl__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__ValueAssignment_4_in_rule__Bundle_Impl__Group__4__Impl3694);
            rule__Bundle_Impl__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBundle_ImplAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Bundle_Impl__Group__4__Impl"


    // $ANTLR start "rule__Bundle_Impl__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1843:1: rule__Bundle_Impl__Group__5 : rule__Bundle_Impl__Group__5__Impl ;
    public final void rule__Bundle_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1847:1: ( rule__Bundle_Impl__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1848:2: rule__Bundle_Impl__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Bundle_Impl__Group__5__Impl_in_rule__Bundle_Impl__Group__53724);
            rule__Bundle_Impl__Group__5__Impl();

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
    // $ANTLR end "rule__Bundle_Impl__Group__5"


    // $ANTLR start "rule__Bundle_Impl__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1854:1: rule__Bundle_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Bundle_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1858:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1859:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1859:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1860:1: '}'
            {
             before(grammarAccess.getBundle_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Bundle_Impl__Group__5__Impl3752); 
             after(grammarAccess.getBundle_ImplAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Bundle_Impl__Group__5__Impl"


    // $ANTLR start "rule__Callback__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1885:1: rule__Callback__Group__0 : rule__Callback__Group__0__Impl rule__Callback__Group__1 ;
    public final void rule__Callback__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1889:1: ( rule__Callback__Group__0__Impl rule__Callback__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1890:2: rule__Callback__Group__0__Impl rule__Callback__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__0__Impl_in_rule__Callback__Group__03795);
            rule__Callback__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__1_in_rule__Callback__Group__03798);
            rule__Callback__Group__1();

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
    // $ANTLR end "rule__Callback__Group__0"


    // $ANTLR start "rule__Callback__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1897:1: rule__Callback__Group__0__Impl : ( () ) ;
    public final void rule__Callback__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1901:1: ( ( () ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1902:1: ( () )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1902:1: ( () )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1903:1: ()
            {
             before(grammarAccess.getCallbackAccess().getCallbackAction_0()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1904:1: ()
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1906:1: 
            {
            }

             after(grammarAccess.getCallbackAccess().getCallbackAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Callback__Group__0__Impl"


    // $ANTLR start "rule__Callback__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1916:1: rule__Callback__Group__1 : rule__Callback__Group__1__Impl rule__Callback__Group__2 ;
    public final void rule__Callback__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1920:1: ( rule__Callback__Group__1__Impl rule__Callback__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1921:2: rule__Callback__Group__1__Impl rule__Callback__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__1__Impl_in_rule__Callback__Group__13856);
            rule__Callback__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__2_in_rule__Callback__Group__13859);
            rule__Callback__Group__2();

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
    // $ANTLR end "rule__Callback__Group__1"


    // $ANTLR start "rule__Callback__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1928:1: rule__Callback__Group__1__Impl : ( 'Callback' ) ;
    public final void rule__Callback__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1932:1: ( ( 'Callback' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1933:1: ( 'Callback' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1933:1: ( 'Callback' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1934:1: 'Callback'
            {
             before(grammarAccess.getCallbackAccess().getCallbackKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Callback__Group__1__Impl3887); 
             after(grammarAccess.getCallbackAccess().getCallbackKeyword_1()); 

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
    // $ANTLR end "rule__Callback__Group__1__Impl"


    // $ANTLR start "rule__Callback__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1947:1: rule__Callback__Group__2 : rule__Callback__Group__2__Impl rule__Callback__Group__3 ;
    public final void rule__Callback__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1951:1: ( rule__Callback__Group__2__Impl rule__Callback__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1952:2: rule__Callback__Group__2__Impl rule__Callback__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__2__Impl_in_rule__Callback__Group__23918);
            rule__Callback__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__3_in_rule__Callback__Group__23921);
            rule__Callback__Group__3();

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
    // $ANTLR end "rule__Callback__Group__2"


    // $ANTLR start "rule__Callback__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1959:1: rule__Callback__Group__2__Impl : ( ( rule__Callback__NameAssignment_2 ) ) ;
    public final void rule__Callback__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1963:1: ( ( ( rule__Callback__NameAssignment_2 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1964:1: ( ( rule__Callback__NameAssignment_2 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1964:1: ( ( rule__Callback__NameAssignment_2 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1965:1: ( rule__Callback__NameAssignment_2 )
            {
             before(grammarAccess.getCallbackAccess().getNameAssignment_2()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1966:1: ( rule__Callback__NameAssignment_2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1966:2: rule__Callback__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__NameAssignment_2_in_rule__Callback__Group__2__Impl3948);
            rule__Callback__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCallbackAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Callback__Group__2__Impl"


    // $ANTLR start "rule__Callback__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1976:1: rule__Callback__Group__3 : rule__Callback__Group__3__Impl rule__Callback__Group__4 ;
    public final void rule__Callback__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1980:1: ( rule__Callback__Group__3__Impl rule__Callback__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1981:2: rule__Callback__Group__3__Impl rule__Callback__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__3__Impl_in_rule__Callback__Group__33978);
            rule__Callback__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__4_in_rule__Callback__Group__33981);
            rule__Callback__Group__4();

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
    // $ANTLR end "rule__Callback__Group__3"


    // $ANTLR start "rule__Callback__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1988:1: rule__Callback__Group__3__Impl : ( '{' ) ;
    public final void rule__Callback__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1992:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1993:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1993:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:1994:1: '{'
            {
             before(grammarAccess.getCallbackAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Callback__Group__3__Impl4009); 
             after(grammarAccess.getCallbackAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Callback__Group__3__Impl"


    // $ANTLR start "rule__Callback__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2007:1: rule__Callback__Group__4 : rule__Callback__Group__4__Impl rule__Callback__Group__5 ;
    public final void rule__Callback__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2011:1: ( rule__Callback__Group__4__Impl rule__Callback__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2012:2: rule__Callback__Group__4__Impl rule__Callback__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__4__Impl_in_rule__Callback__Group__44040);
            rule__Callback__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__5_in_rule__Callback__Group__44043);
            rule__Callback__Group__5();

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
    // $ANTLR end "rule__Callback__Group__4"


    // $ANTLR start "rule__Callback__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2019:1: rule__Callback__Group__4__Impl : ( ( rule__Callback__Group_4__0 )? ) ;
    public final void rule__Callback__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2023:1: ( ( ( rule__Callback__Group_4__0 )? ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2024:1: ( ( rule__Callback__Group_4__0 )? )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2024:1: ( ( rule__Callback__Group_4__0 )? )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2025:1: ( rule__Callback__Group_4__0 )?
            {
             before(grammarAccess.getCallbackAccess().getGroup_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2026:1: ( rule__Callback__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2026:2: rule__Callback__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Callback__Group_4__0_in_rule__Callback__Group__4__Impl4070);
                    rule__Callback__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallbackAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Callback__Group__4__Impl"


    // $ANTLR start "rule__Callback__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2036:1: rule__Callback__Group__5 : rule__Callback__Group__5__Impl ;
    public final void rule__Callback__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2040:1: ( rule__Callback__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2041:2: rule__Callback__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group__5__Impl_in_rule__Callback__Group__54101);
            rule__Callback__Group__5__Impl();

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
    // $ANTLR end "rule__Callback__Group__5"


    // $ANTLR start "rule__Callback__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2047:1: rule__Callback__Group__5__Impl : ( '}' ) ;
    public final void rule__Callback__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2051:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2052:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2052:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2053:1: '}'
            {
             before(grammarAccess.getCallbackAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Callback__Group__5__Impl4129); 
             after(grammarAccess.getCallbackAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Callback__Group__5__Impl"


    // $ANTLR start "rule__Callback__Group_4__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2078:1: rule__Callback__Group_4__0 : rule__Callback__Group_4__0__Impl rule__Callback__Group_4__1 ;
    public final void rule__Callback__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2082:1: ( rule__Callback__Group_4__0__Impl rule__Callback__Group_4__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2083:2: rule__Callback__Group_4__0__Impl rule__Callback__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group_4__0__Impl_in_rule__Callback__Group_4__04172);
            rule__Callback__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group_4__1_in_rule__Callback__Group_4__04175);
            rule__Callback__Group_4__1();

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
    // $ANTLR end "rule__Callback__Group_4__0"


    // $ANTLR start "rule__Callback__Group_4__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2090:1: rule__Callback__Group_4__0__Impl : ( 'data' ) ;
    public final void rule__Callback__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2094:1: ( ( 'data' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2095:1: ( 'data' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2095:1: ( 'data' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2096:1: 'data'
            {
             before(grammarAccess.getCallbackAccess().getDataKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Callback__Group_4__0__Impl4203); 
             after(grammarAccess.getCallbackAccess().getDataKeyword_4_0()); 

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
    // $ANTLR end "rule__Callback__Group_4__0__Impl"


    // $ANTLR start "rule__Callback__Group_4__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2109:1: rule__Callback__Group_4__1 : rule__Callback__Group_4__1__Impl ;
    public final void rule__Callback__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2113:1: ( rule__Callback__Group_4__1__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2114:2: rule__Callback__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__Group_4__1__Impl_in_rule__Callback__Group_4__14234);
            rule__Callback__Group_4__1__Impl();

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
    // $ANTLR end "rule__Callback__Group_4__1"


    // $ANTLR start "rule__Callback__Group_4__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2120:1: rule__Callback__Group_4__1__Impl : ( ( rule__Callback__DataAssignment_4_1 ) ) ;
    public final void rule__Callback__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2124:1: ( ( ( rule__Callback__DataAssignment_4_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2125:1: ( ( rule__Callback__DataAssignment_4_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2125:1: ( ( rule__Callback__DataAssignment_4_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2126:1: ( rule__Callback__DataAssignment_4_1 )
            {
             before(grammarAccess.getCallbackAccess().getDataAssignment_4_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2127:1: ( rule__Callback__DataAssignment_4_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2127:2: rule__Callback__DataAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Callback__DataAssignment_4_1_in_rule__Callback__Group_4__1__Impl4261);
            rule__Callback__DataAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCallbackAccess().getDataAssignment_4_1()); 

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
    // $ANTLR end "rule__Callback__Group_4__1__Impl"


    // $ANTLR start "rule__Permissions__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2141:1: rule__Permissions__Group__0 : rule__Permissions__Group__0__Impl rule__Permissions__Group__1 ;
    public final void rule__Permissions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2145:1: ( rule__Permissions__Group__0__Impl rule__Permissions__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2146:2: rule__Permissions__Group__0__Impl rule__Permissions__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Permissions__Group__0__Impl_in_rule__Permissions__Group__04295);
            rule__Permissions__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Permissions__Group__1_in_rule__Permissions__Group__04298);
            rule__Permissions__Group__1();

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
    // $ANTLR end "rule__Permissions__Group__0"


    // $ANTLR start "rule__Permissions__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2153:1: rule__Permissions__Group__0__Impl : ( () ) ;
    public final void rule__Permissions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2157:1: ( ( () ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2158:1: ( () )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2158:1: ( () )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2159:1: ()
            {
             before(grammarAccess.getPermissionsAccess().getPermissionsAction_0()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2160:1: ()
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2162:1: 
            {
            }

             after(grammarAccess.getPermissionsAccess().getPermissionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions__Group__0__Impl"


    // $ANTLR start "rule__Permissions__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2172:1: rule__Permissions__Group__1 : rule__Permissions__Group__1__Impl rule__Permissions__Group__2 ;
    public final void rule__Permissions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2176:1: ( rule__Permissions__Group__1__Impl rule__Permissions__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2177:2: rule__Permissions__Group__1__Impl rule__Permissions__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Permissions__Group__1__Impl_in_rule__Permissions__Group__14356);
            rule__Permissions__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Permissions__Group__2_in_rule__Permissions__Group__14359);
            rule__Permissions__Group__2();

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
    // $ANTLR end "rule__Permissions__Group__1"


    // $ANTLR start "rule__Permissions__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2184:1: rule__Permissions__Group__1__Impl : ( 'Permissions' ) ;
    public final void rule__Permissions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2188:1: ( ( 'Permissions' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2189:1: ( 'Permissions' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2189:1: ( 'Permissions' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2190:1: 'Permissions'
            {
             before(grammarAccess.getPermissionsAccess().getPermissionsKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Permissions__Group__1__Impl4387); 
             after(grammarAccess.getPermissionsAccess().getPermissionsKeyword_1()); 

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
    // $ANTLR end "rule__Permissions__Group__1__Impl"


    // $ANTLR start "rule__Permissions__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2203:1: rule__Permissions__Group__2 : rule__Permissions__Group__2__Impl ;
    public final void rule__Permissions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2207:1: ( rule__Permissions__Group__2__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2208:2: rule__Permissions__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Permissions__Group__2__Impl_in_rule__Permissions__Group__24418);
            rule__Permissions__Group__2__Impl();

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
    // $ANTLR end "rule__Permissions__Group__2"


    // $ANTLR start "rule__Permissions__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2214:1: rule__Permissions__Group__2__Impl : ( ( rule__Permissions__NameAssignment_2 ) ) ;
    public final void rule__Permissions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2218:1: ( ( ( rule__Permissions__NameAssignment_2 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2219:1: ( ( rule__Permissions__NameAssignment_2 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2219:1: ( ( rule__Permissions__NameAssignment_2 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2220:1: ( rule__Permissions__NameAssignment_2 )
            {
             before(grammarAccess.getPermissionsAccess().getNameAssignment_2()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2221:1: ( rule__Permissions__NameAssignment_2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2221:2: rule__Permissions__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Permissions__NameAssignment_2_in_rule__Permissions__Group__2__Impl4445);
            rule__Permissions__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissionsAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Permissions__Group__2__Impl"


    // $ANTLR start "rule__DoubleExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2256:1: rule__DoubleExtra__Group__0 : rule__DoubleExtra__Group__0__Impl rule__DoubleExtra__Group__1 ;
    public final void rule__DoubleExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2260:1: ( rule__DoubleExtra__Group__0__Impl rule__DoubleExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2261:2: rule__DoubleExtra__Group__0__Impl rule__DoubleExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__0__Impl_in_rule__DoubleExtra__Group__04500);
            rule__DoubleExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__1_in_rule__DoubleExtra__Group__04503);
            rule__DoubleExtra__Group__1();

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
    // $ANTLR end "rule__DoubleExtra__Group__0"


    // $ANTLR start "rule__DoubleExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2268:1: rule__DoubleExtra__Group__0__Impl : ( 'DoubleExtra' ) ;
    public final void rule__DoubleExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2272:1: ( ( 'DoubleExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2273:1: ( 'DoubleExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2273:1: ( 'DoubleExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2274:1: 'DoubleExtra'
            {
             before(grammarAccess.getDoubleExtraAccess().getDoubleExtraKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__DoubleExtra__Group__0__Impl4531); 
             after(grammarAccess.getDoubleExtraAccess().getDoubleExtraKeyword_0()); 

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
    // $ANTLR end "rule__DoubleExtra__Group__0__Impl"


    // $ANTLR start "rule__DoubleExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2287:1: rule__DoubleExtra__Group__1 : rule__DoubleExtra__Group__1__Impl rule__DoubleExtra__Group__2 ;
    public final void rule__DoubleExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2291:1: ( rule__DoubleExtra__Group__1__Impl rule__DoubleExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2292:2: rule__DoubleExtra__Group__1__Impl rule__DoubleExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__1__Impl_in_rule__DoubleExtra__Group__14562);
            rule__DoubleExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__2_in_rule__DoubleExtra__Group__14565);
            rule__DoubleExtra__Group__2();

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
    // $ANTLR end "rule__DoubleExtra__Group__1"


    // $ANTLR start "rule__DoubleExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2299:1: rule__DoubleExtra__Group__1__Impl : ( ( rule__DoubleExtra__NameAssignment_1 ) ) ;
    public final void rule__DoubleExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2303:1: ( ( ( rule__DoubleExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2304:1: ( ( rule__DoubleExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2304:1: ( ( rule__DoubleExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2305:1: ( rule__DoubleExtra__NameAssignment_1 )
            {
             before(grammarAccess.getDoubleExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2306:1: ( rule__DoubleExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2306:2: rule__DoubleExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__NameAssignment_1_in_rule__DoubleExtra__Group__1__Impl4592);
            rule__DoubleExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DoubleExtra__Group__1__Impl"


    // $ANTLR start "rule__DoubleExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2316:1: rule__DoubleExtra__Group__2 : rule__DoubleExtra__Group__2__Impl rule__DoubleExtra__Group__3 ;
    public final void rule__DoubleExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2320:1: ( rule__DoubleExtra__Group__2__Impl rule__DoubleExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2321:2: rule__DoubleExtra__Group__2__Impl rule__DoubleExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__2__Impl_in_rule__DoubleExtra__Group__24622);
            rule__DoubleExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__3_in_rule__DoubleExtra__Group__24625);
            rule__DoubleExtra__Group__3();

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
    // $ANTLR end "rule__DoubleExtra__Group__2"


    // $ANTLR start "rule__DoubleExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2328:1: rule__DoubleExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__DoubleExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2332:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2333:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2333:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2334:1: '{'
            {
             before(grammarAccess.getDoubleExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__DoubleExtra__Group__2__Impl4653); 
             after(grammarAccess.getDoubleExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DoubleExtra__Group__2__Impl"


    // $ANTLR start "rule__DoubleExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2347:1: rule__DoubleExtra__Group__3 : rule__DoubleExtra__Group__3__Impl rule__DoubleExtra__Group__4 ;
    public final void rule__DoubleExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2351:1: ( rule__DoubleExtra__Group__3__Impl rule__DoubleExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2352:2: rule__DoubleExtra__Group__3__Impl rule__DoubleExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__3__Impl_in_rule__DoubleExtra__Group__34684);
            rule__DoubleExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__4_in_rule__DoubleExtra__Group__34687);
            rule__DoubleExtra__Group__4();

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
    // $ANTLR end "rule__DoubleExtra__Group__3"


    // $ANTLR start "rule__DoubleExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2359:1: rule__DoubleExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__DoubleExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2363:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2364:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2364:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2365:1: 'value'
            {
             before(grammarAccess.getDoubleExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__DoubleExtra__Group__3__Impl4715); 
             after(grammarAccess.getDoubleExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__DoubleExtra__Group__3__Impl"


    // $ANTLR start "rule__DoubleExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2378:1: rule__DoubleExtra__Group__4 : rule__DoubleExtra__Group__4__Impl rule__DoubleExtra__Group__5 ;
    public final void rule__DoubleExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2382:1: ( rule__DoubleExtra__Group__4__Impl rule__DoubleExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2383:2: rule__DoubleExtra__Group__4__Impl rule__DoubleExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__4__Impl_in_rule__DoubleExtra__Group__44746);
            rule__DoubleExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__5_in_rule__DoubleExtra__Group__44749);
            rule__DoubleExtra__Group__5();

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
    // $ANTLR end "rule__DoubleExtra__Group__4"


    // $ANTLR start "rule__DoubleExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2390:1: rule__DoubleExtra__Group__4__Impl : ( ( rule__DoubleExtra__ValueAssignment_4 ) ) ;
    public final void rule__DoubleExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2394:1: ( ( ( rule__DoubleExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2395:1: ( ( rule__DoubleExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2395:1: ( ( rule__DoubleExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2396:1: ( rule__DoubleExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getDoubleExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2397:1: ( rule__DoubleExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2397:2: rule__DoubleExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__ValueAssignment_4_in_rule__DoubleExtra__Group__4__Impl4776);
            rule__DoubleExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDoubleExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__DoubleExtra__Group__4__Impl"


    // $ANTLR start "rule__DoubleExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2407:1: rule__DoubleExtra__Group__5 : rule__DoubleExtra__Group__5__Impl ;
    public final void rule__DoubleExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2411:1: ( rule__DoubleExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2412:2: rule__DoubleExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DoubleExtra__Group__5__Impl_in_rule__DoubleExtra__Group__54806);
            rule__DoubleExtra__Group__5__Impl();

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
    // $ANTLR end "rule__DoubleExtra__Group__5"


    // $ANTLR start "rule__DoubleExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2418:1: rule__DoubleExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__DoubleExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2422:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2423:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2423:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2424:1: '}'
            {
             before(grammarAccess.getDoubleExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__DoubleExtra__Group__5__Impl4834); 
             after(grammarAccess.getDoubleExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__DoubleExtra__Group__5__Impl"


    // $ANTLR start "rule__IntExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2449:1: rule__IntExtra__Group__0 : rule__IntExtra__Group__0__Impl rule__IntExtra__Group__1 ;
    public final void rule__IntExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2453:1: ( rule__IntExtra__Group__0__Impl rule__IntExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2454:2: rule__IntExtra__Group__0__Impl rule__IntExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__0__Impl_in_rule__IntExtra__Group__04877);
            rule__IntExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__1_in_rule__IntExtra__Group__04880);
            rule__IntExtra__Group__1();

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
    // $ANTLR end "rule__IntExtra__Group__0"


    // $ANTLR start "rule__IntExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2461:1: rule__IntExtra__Group__0__Impl : ( 'IntExtra' ) ;
    public final void rule__IntExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2465:1: ( ( 'IntExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2466:1: ( 'IntExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2466:1: ( 'IntExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2467:1: 'IntExtra'
            {
             before(grammarAccess.getIntExtraAccess().getIntExtraKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__IntExtra__Group__0__Impl4908); 
             after(grammarAccess.getIntExtraAccess().getIntExtraKeyword_0()); 

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
    // $ANTLR end "rule__IntExtra__Group__0__Impl"


    // $ANTLR start "rule__IntExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2480:1: rule__IntExtra__Group__1 : rule__IntExtra__Group__1__Impl rule__IntExtra__Group__2 ;
    public final void rule__IntExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2484:1: ( rule__IntExtra__Group__1__Impl rule__IntExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2485:2: rule__IntExtra__Group__1__Impl rule__IntExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__1__Impl_in_rule__IntExtra__Group__14939);
            rule__IntExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__2_in_rule__IntExtra__Group__14942);
            rule__IntExtra__Group__2();

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
    // $ANTLR end "rule__IntExtra__Group__1"


    // $ANTLR start "rule__IntExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2492:1: rule__IntExtra__Group__1__Impl : ( ( rule__IntExtra__NameAssignment_1 ) ) ;
    public final void rule__IntExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2496:1: ( ( ( rule__IntExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2497:1: ( ( rule__IntExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2497:1: ( ( rule__IntExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2498:1: ( rule__IntExtra__NameAssignment_1 )
            {
             before(grammarAccess.getIntExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2499:1: ( rule__IntExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2499:2: rule__IntExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__NameAssignment_1_in_rule__IntExtra__Group__1__Impl4969);
            rule__IntExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__IntExtra__Group__1__Impl"


    // $ANTLR start "rule__IntExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2509:1: rule__IntExtra__Group__2 : rule__IntExtra__Group__2__Impl rule__IntExtra__Group__3 ;
    public final void rule__IntExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2513:1: ( rule__IntExtra__Group__2__Impl rule__IntExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2514:2: rule__IntExtra__Group__2__Impl rule__IntExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__2__Impl_in_rule__IntExtra__Group__24999);
            rule__IntExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__3_in_rule__IntExtra__Group__25002);
            rule__IntExtra__Group__3();

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
    // $ANTLR end "rule__IntExtra__Group__2"


    // $ANTLR start "rule__IntExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2521:1: rule__IntExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__IntExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2525:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2526:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2526:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2527:1: '{'
            {
             before(grammarAccess.getIntExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__IntExtra__Group__2__Impl5030); 
             after(grammarAccess.getIntExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__IntExtra__Group__2__Impl"


    // $ANTLR start "rule__IntExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2540:1: rule__IntExtra__Group__3 : rule__IntExtra__Group__3__Impl rule__IntExtra__Group__4 ;
    public final void rule__IntExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2544:1: ( rule__IntExtra__Group__3__Impl rule__IntExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2545:2: rule__IntExtra__Group__3__Impl rule__IntExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__3__Impl_in_rule__IntExtra__Group__35061);
            rule__IntExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__4_in_rule__IntExtra__Group__35064);
            rule__IntExtra__Group__4();

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
    // $ANTLR end "rule__IntExtra__Group__3"


    // $ANTLR start "rule__IntExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2552:1: rule__IntExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__IntExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2556:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2557:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2557:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2558:1: 'value'
            {
             before(grammarAccess.getIntExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__IntExtra__Group__3__Impl5092); 
             after(grammarAccess.getIntExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__IntExtra__Group__3__Impl"


    // $ANTLR start "rule__IntExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2571:1: rule__IntExtra__Group__4 : rule__IntExtra__Group__4__Impl rule__IntExtra__Group__5 ;
    public final void rule__IntExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2575:1: ( rule__IntExtra__Group__4__Impl rule__IntExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2576:2: rule__IntExtra__Group__4__Impl rule__IntExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__4__Impl_in_rule__IntExtra__Group__45123);
            rule__IntExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__5_in_rule__IntExtra__Group__45126);
            rule__IntExtra__Group__5();

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
    // $ANTLR end "rule__IntExtra__Group__4"


    // $ANTLR start "rule__IntExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2583:1: rule__IntExtra__Group__4__Impl : ( ( rule__IntExtra__ValueAssignment_4 ) ) ;
    public final void rule__IntExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2587:1: ( ( ( rule__IntExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2588:1: ( ( rule__IntExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2588:1: ( ( rule__IntExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2589:1: ( rule__IntExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getIntExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2590:1: ( rule__IntExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2590:2: rule__IntExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__ValueAssignment_4_in_rule__IntExtra__Group__4__Impl5153);
            rule__IntExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__IntExtra__Group__4__Impl"


    // $ANTLR start "rule__IntExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2600:1: rule__IntExtra__Group__5 : rule__IntExtra__Group__5__Impl ;
    public final void rule__IntExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2604:1: ( rule__IntExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2605:2: rule__IntExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntExtra__Group__5__Impl_in_rule__IntExtra__Group__55183);
            rule__IntExtra__Group__5__Impl();

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
    // $ANTLR end "rule__IntExtra__Group__5"


    // $ANTLR start "rule__IntExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2611:1: rule__IntExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__IntExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2615:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2616:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2616:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2617:1: '}'
            {
             before(grammarAccess.getIntExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__IntExtra__Group__5__Impl5211); 
             after(grammarAccess.getIntExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__IntExtra__Group__5__Impl"


    // $ANTLR start "rule__CharSequenceExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2642:1: rule__CharSequenceExtra__Group__0 : rule__CharSequenceExtra__Group__0__Impl rule__CharSequenceExtra__Group__1 ;
    public final void rule__CharSequenceExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2646:1: ( rule__CharSequenceExtra__Group__0__Impl rule__CharSequenceExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2647:2: rule__CharSequenceExtra__Group__0__Impl rule__CharSequenceExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__0__Impl_in_rule__CharSequenceExtra__Group__05254);
            rule__CharSequenceExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__1_in_rule__CharSequenceExtra__Group__05257);
            rule__CharSequenceExtra__Group__1();

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
    // $ANTLR end "rule__CharSequenceExtra__Group__0"


    // $ANTLR start "rule__CharSequenceExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2654:1: rule__CharSequenceExtra__Group__0__Impl : ( 'CharSequenceExtra' ) ;
    public final void rule__CharSequenceExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2658:1: ( ( 'CharSequenceExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2659:1: ( 'CharSequenceExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2659:1: ( 'CharSequenceExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2660:1: 'CharSequenceExtra'
            {
             before(grammarAccess.getCharSequenceExtraAccess().getCharSequenceExtraKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CharSequenceExtra__Group__0__Impl5285); 
             after(grammarAccess.getCharSequenceExtraAccess().getCharSequenceExtraKeyword_0()); 

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
    // $ANTLR end "rule__CharSequenceExtra__Group__0__Impl"


    // $ANTLR start "rule__CharSequenceExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2673:1: rule__CharSequenceExtra__Group__1 : rule__CharSequenceExtra__Group__1__Impl rule__CharSequenceExtra__Group__2 ;
    public final void rule__CharSequenceExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2677:1: ( rule__CharSequenceExtra__Group__1__Impl rule__CharSequenceExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2678:2: rule__CharSequenceExtra__Group__1__Impl rule__CharSequenceExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__1__Impl_in_rule__CharSequenceExtra__Group__15316);
            rule__CharSequenceExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__2_in_rule__CharSequenceExtra__Group__15319);
            rule__CharSequenceExtra__Group__2();

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
    // $ANTLR end "rule__CharSequenceExtra__Group__1"


    // $ANTLR start "rule__CharSequenceExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2685:1: rule__CharSequenceExtra__Group__1__Impl : ( ( rule__CharSequenceExtra__NameAssignment_1 ) ) ;
    public final void rule__CharSequenceExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2689:1: ( ( ( rule__CharSequenceExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2690:1: ( ( rule__CharSequenceExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2690:1: ( ( rule__CharSequenceExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2691:1: ( rule__CharSequenceExtra__NameAssignment_1 )
            {
             before(grammarAccess.getCharSequenceExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2692:1: ( rule__CharSequenceExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2692:2: rule__CharSequenceExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__NameAssignment_1_in_rule__CharSequenceExtra__Group__1__Impl5346);
            rule__CharSequenceExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharSequenceExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CharSequenceExtra__Group__1__Impl"


    // $ANTLR start "rule__CharSequenceExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2702:1: rule__CharSequenceExtra__Group__2 : rule__CharSequenceExtra__Group__2__Impl rule__CharSequenceExtra__Group__3 ;
    public final void rule__CharSequenceExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2706:1: ( rule__CharSequenceExtra__Group__2__Impl rule__CharSequenceExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2707:2: rule__CharSequenceExtra__Group__2__Impl rule__CharSequenceExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__2__Impl_in_rule__CharSequenceExtra__Group__25376);
            rule__CharSequenceExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__3_in_rule__CharSequenceExtra__Group__25379);
            rule__CharSequenceExtra__Group__3();

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
    // $ANTLR end "rule__CharSequenceExtra__Group__2"


    // $ANTLR start "rule__CharSequenceExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2714:1: rule__CharSequenceExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__CharSequenceExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2718:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2719:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2719:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2720:1: '{'
            {
             before(grammarAccess.getCharSequenceExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__CharSequenceExtra__Group__2__Impl5407); 
             after(grammarAccess.getCharSequenceExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__CharSequenceExtra__Group__2__Impl"


    // $ANTLR start "rule__CharSequenceExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2733:1: rule__CharSequenceExtra__Group__3 : rule__CharSequenceExtra__Group__3__Impl rule__CharSequenceExtra__Group__4 ;
    public final void rule__CharSequenceExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2737:1: ( rule__CharSequenceExtra__Group__3__Impl rule__CharSequenceExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2738:2: rule__CharSequenceExtra__Group__3__Impl rule__CharSequenceExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__3__Impl_in_rule__CharSequenceExtra__Group__35438);
            rule__CharSequenceExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__4_in_rule__CharSequenceExtra__Group__35441);
            rule__CharSequenceExtra__Group__4();

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
    // $ANTLR end "rule__CharSequenceExtra__Group__3"


    // $ANTLR start "rule__CharSequenceExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2745:1: rule__CharSequenceExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__CharSequenceExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2749:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2750:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2750:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2751:1: 'value'
            {
             before(grammarAccess.getCharSequenceExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__CharSequenceExtra__Group__3__Impl5469); 
             after(grammarAccess.getCharSequenceExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__CharSequenceExtra__Group__3__Impl"


    // $ANTLR start "rule__CharSequenceExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2764:1: rule__CharSequenceExtra__Group__4 : rule__CharSequenceExtra__Group__4__Impl rule__CharSequenceExtra__Group__5 ;
    public final void rule__CharSequenceExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2768:1: ( rule__CharSequenceExtra__Group__4__Impl rule__CharSequenceExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2769:2: rule__CharSequenceExtra__Group__4__Impl rule__CharSequenceExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__4__Impl_in_rule__CharSequenceExtra__Group__45500);
            rule__CharSequenceExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__5_in_rule__CharSequenceExtra__Group__45503);
            rule__CharSequenceExtra__Group__5();

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
    // $ANTLR end "rule__CharSequenceExtra__Group__4"


    // $ANTLR start "rule__CharSequenceExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2776:1: rule__CharSequenceExtra__Group__4__Impl : ( ( rule__CharSequenceExtra__ValueAssignment_4 ) ) ;
    public final void rule__CharSequenceExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2780:1: ( ( ( rule__CharSequenceExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2781:1: ( ( rule__CharSequenceExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2781:1: ( ( rule__CharSequenceExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2782:1: ( rule__CharSequenceExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getCharSequenceExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2783:1: ( rule__CharSequenceExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2783:2: rule__CharSequenceExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__ValueAssignment_4_in_rule__CharSequenceExtra__Group__4__Impl5530);
            rule__CharSequenceExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCharSequenceExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__CharSequenceExtra__Group__4__Impl"


    // $ANTLR start "rule__CharSequenceExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2793:1: rule__CharSequenceExtra__Group__5 : rule__CharSequenceExtra__Group__5__Impl ;
    public final void rule__CharSequenceExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2797:1: ( rule__CharSequenceExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2798:2: rule__CharSequenceExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharSequenceExtra__Group__5__Impl_in_rule__CharSequenceExtra__Group__55560);
            rule__CharSequenceExtra__Group__5__Impl();

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
    // $ANTLR end "rule__CharSequenceExtra__Group__5"


    // $ANTLR start "rule__CharSequenceExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2804:1: rule__CharSequenceExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__CharSequenceExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2808:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2809:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2809:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2810:1: '}'
            {
             before(grammarAccess.getCharSequenceExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__CharSequenceExtra__Group__5__Impl5588); 
             after(grammarAccess.getCharSequenceExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__CharSequenceExtra__Group__5__Impl"


    // $ANTLR start "rule__CharExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2835:1: rule__CharExtra__Group__0 : rule__CharExtra__Group__0__Impl rule__CharExtra__Group__1 ;
    public final void rule__CharExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2839:1: ( rule__CharExtra__Group__0__Impl rule__CharExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2840:2: rule__CharExtra__Group__0__Impl rule__CharExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__0__Impl_in_rule__CharExtra__Group__05631);
            rule__CharExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__1_in_rule__CharExtra__Group__05634);
            rule__CharExtra__Group__1();

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
    // $ANTLR end "rule__CharExtra__Group__0"


    // $ANTLR start "rule__CharExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2847:1: rule__CharExtra__Group__0__Impl : ( 'CharExtra' ) ;
    public final void rule__CharExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2851:1: ( ( 'CharExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2852:1: ( 'CharExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2852:1: ( 'CharExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2853:1: 'CharExtra'
            {
             before(grammarAccess.getCharExtraAccess().getCharExtraKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CharExtra__Group__0__Impl5662); 
             after(grammarAccess.getCharExtraAccess().getCharExtraKeyword_0()); 

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
    // $ANTLR end "rule__CharExtra__Group__0__Impl"


    // $ANTLR start "rule__CharExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2866:1: rule__CharExtra__Group__1 : rule__CharExtra__Group__1__Impl rule__CharExtra__Group__2 ;
    public final void rule__CharExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2870:1: ( rule__CharExtra__Group__1__Impl rule__CharExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2871:2: rule__CharExtra__Group__1__Impl rule__CharExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__1__Impl_in_rule__CharExtra__Group__15693);
            rule__CharExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__2_in_rule__CharExtra__Group__15696);
            rule__CharExtra__Group__2();

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
    // $ANTLR end "rule__CharExtra__Group__1"


    // $ANTLR start "rule__CharExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2878:1: rule__CharExtra__Group__1__Impl : ( ( rule__CharExtra__NameAssignment_1 ) ) ;
    public final void rule__CharExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2882:1: ( ( ( rule__CharExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2883:1: ( ( rule__CharExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2883:1: ( ( rule__CharExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2884:1: ( rule__CharExtra__NameAssignment_1 )
            {
             before(grammarAccess.getCharExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2885:1: ( rule__CharExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2885:2: rule__CharExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__NameAssignment_1_in_rule__CharExtra__Group__1__Impl5723);
            rule__CharExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CharExtra__Group__1__Impl"


    // $ANTLR start "rule__CharExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2895:1: rule__CharExtra__Group__2 : rule__CharExtra__Group__2__Impl rule__CharExtra__Group__3 ;
    public final void rule__CharExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2899:1: ( rule__CharExtra__Group__2__Impl rule__CharExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2900:2: rule__CharExtra__Group__2__Impl rule__CharExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__2__Impl_in_rule__CharExtra__Group__25753);
            rule__CharExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__3_in_rule__CharExtra__Group__25756);
            rule__CharExtra__Group__3();

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
    // $ANTLR end "rule__CharExtra__Group__2"


    // $ANTLR start "rule__CharExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2907:1: rule__CharExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__CharExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2911:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2912:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2912:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2913:1: '{'
            {
             before(grammarAccess.getCharExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__CharExtra__Group__2__Impl5784); 
             after(grammarAccess.getCharExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__CharExtra__Group__2__Impl"


    // $ANTLR start "rule__CharExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2926:1: rule__CharExtra__Group__3 : rule__CharExtra__Group__3__Impl rule__CharExtra__Group__4 ;
    public final void rule__CharExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2930:1: ( rule__CharExtra__Group__3__Impl rule__CharExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2931:2: rule__CharExtra__Group__3__Impl rule__CharExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__3__Impl_in_rule__CharExtra__Group__35815);
            rule__CharExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__4_in_rule__CharExtra__Group__35818);
            rule__CharExtra__Group__4();

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
    // $ANTLR end "rule__CharExtra__Group__3"


    // $ANTLR start "rule__CharExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2938:1: rule__CharExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__CharExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2942:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2943:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2943:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2944:1: 'value'
            {
             before(grammarAccess.getCharExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__CharExtra__Group__3__Impl5846); 
             after(grammarAccess.getCharExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__CharExtra__Group__3__Impl"


    // $ANTLR start "rule__CharExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2957:1: rule__CharExtra__Group__4 : rule__CharExtra__Group__4__Impl rule__CharExtra__Group__5 ;
    public final void rule__CharExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2961:1: ( rule__CharExtra__Group__4__Impl rule__CharExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2962:2: rule__CharExtra__Group__4__Impl rule__CharExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__4__Impl_in_rule__CharExtra__Group__45877);
            rule__CharExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__5_in_rule__CharExtra__Group__45880);
            rule__CharExtra__Group__5();

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
    // $ANTLR end "rule__CharExtra__Group__4"


    // $ANTLR start "rule__CharExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2969:1: rule__CharExtra__Group__4__Impl : ( ( rule__CharExtra__ValueAssignment_4 ) ) ;
    public final void rule__CharExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2973:1: ( ( ( rule__CharExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2974:1: ( ( rule__CharExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2974:1: ( ( rule__CharExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2975:1: ( rule__CharExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getCharExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2976:1: ( rule__CharExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2976:2: rule__CharExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__ValueAssignment_4_in_rule__CharExtra__Group__4__Impl5907);
            rule__CharExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCharExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__CharExtra__Group__4__Impl"


    // $ANTLR start "rule__CharExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2986:1: rule__CharExtra__Group__5 : rule__CharExtra__Group__5__Impl ;
    public final void rule__CharExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2990:1: ( rule__CharExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2991:2: rule__CharExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CharExtra__Group__5__Impl_in_rule__CharExtra__Group__55937);
            rule__CharExtra__Group__5__Impl();

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
    // $ANTLR end "rule__CharExtra__Group__5"


    // $ANTLR start "rule__CharExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:2997:1: rule__CharExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__CharExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3001:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3002:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3002:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3003:1: '}'
            {
             before(grammarAccess.getCharExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__CharExtra__Group__5__Impl5965); 
             after(grammarAccess.getCharExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__CharExtra__Group__5__Impl"


    // $ANTLR start "rule__BundleExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3028:1: rule__BundleExtra__Group__0 : rule__BundleExtra__Group__0__Impl rule__BundleExtra__Group__1 ;
    public final void rule__BundleExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3032:1: ( rule__BundleExtra__Group__0__Impl rule__BundleExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3033:2: rule__BundleExtra__Group__0__Impl rule__BundleExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__0__Impl_in_rule__BundleExtra__Group__06008);
            rule__BundleExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__1_in_rule__BundleExtra__Group__06011);
            rule__BundleExtra__Group__1();

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
    // $ANTLR end "rule__BundleExtra__Group__0"


    // $ANTLR start "rule__BundleExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3040:1: rule__BundleExtra__Group__0__Impl : ( 'BundleExtra' ) ;
    public final void rule__BundleExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3044:1: ( ( 'BundleExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3045:1: ( 'BundleExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3045:1: ( 'BundleExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3046:1: 'BundleExtra'
            {
             before(grammarAccess.getBundleExtraAccess().getBundleExtraKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__BundleExtra__Group__0__Impl6039); 
             after(grammarAccess.getBundleExtraAccess().getBundleExtraKeyword_0()); 

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
    // $ANTLR end "rule__BundleExtra__Group__0__Impl"


    // $ANTLR start "rule__BundleExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3059:1: rule__BundleExtra__Group__1 : rule__BundleExtra__Group__1__Impl rule__BundleExtra__Group__2 ;
    public final void rule__BundleExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3063:1: ( rule__BundleExtra__Group__1__Impl rule__BundleExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3064:2: rule__BundleExtra__Group__1__Impl rule__BundleExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__1__Impl_in_rule__BundleExtra__Group__16070);
            rule__BundleExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__2_in_rule__BundleExtra__Group__16073);
            rule__BundleExtra__Group__2();

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
    // $ANTLR end "rule__BundleExtra__Group__1"


    // $ANTLR start "rule__BundleExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3071:1: rule__BundleExtra__Group__1__Impl : ( ( rule__BundleExtra__NameAssignment_1 ) ) ;
    public final void rule__BundleExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3075:1: ( ( ( rule__BundleExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3076:1: ( ( rule__BundleExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3076:1: ( ( rule__BundleExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3077:1: ( rule__BundleExtra__NameAssignment_1 )
            {
             before(grammarAccess.getBundleExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3078:1: ( rule__BundleExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3078:2: rule__BundleExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__NameAssignment_1_in_rule__BundleExtra__Group__1__Impl6100);
            rule__BundleExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBundleExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BundleExtra__Group__1__Impl"


    // $ANTLR start "rule__BundleExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3088:1: rule__BundleExtra__Group__2 : rule__BundleExtra__Group__2__Impl rule__BundleExtra__Group__3 ;
    public final void rule__BundleExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3092:1: ( rule__BundleExtra__Group__2__Impl rule__BundleExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3093:2: rule__BundleExtra__Group__2__Impl rule__BundleExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__2__Impl_in_rule__BundleExtra__Group__26130);
            rule__BundleExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__3_in_rule__BundleExtra__Group__26133);
            rule__BundleExtra__Group__3();

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
    // $ANTLR end "rule__BundleExtra__Group__2"


    // $ANTLR start "rule__BundleExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3100:1: rule__BundleExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__BundleExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3104:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3105:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3105:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3106:1: '{'
            {
             before(grammarAccess.getBundleExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BundleExtra__Group__2__Impl6161); 
             after(grammarAccess.getBundleExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BundleExtra__Group__2__Impl"


    // $ANTLR start "rule__BundleExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3119:1: rule__BundleExtra__Group__3 : rule__BundleExtra__Group__3__Impl rule__BundleExtra__Group__4 ;
    public final void rule__BundleExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3123:1: ( rule__BundleExtra__Group__3__Impl rule__BundleExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3124:2: rule__BundleExtra__Group__3__Impl rule__BundleExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__3__Impl_in_rule__BundleExtra__Group__36192);
            rule__BundleExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__4_in_rule__BundleExtra__Group__36195);
            rule__BundleExtra__Group__4();

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
    // $ANTLR end "rule__BundleExtra__Group__3"


    // $ANTLR start "rule__BundleExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3131:1: rule__BundleExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__BundleExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3135:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3136:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3136:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3137:1: 'value'
            {
             before(grammarAccess.getBundleExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__BundleExtra__Group__3__Impl6223); 
             after(grammarAccess.getBundleExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__BundleExtra__Group__3__Impl"


    // $ANTLR start "rule__BundleExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3150:1: rule__BundleExtra__Group__4 : rule__BundleExtra__Group__4__Impl rule__BundleExtra__Group__5 ;
    public final void rule__BundleExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3154:1: ( rule__BundleExtra__Group__4__Impl rule__BundleExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3155:2: rule__BundleExtra__Group__4__Impl rule__BundleExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__4__Impl_in_rule__BundleExtra__Group__46254);
            rule__BundleExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__5_in_rule__BundleExtra__Group__46257);
            rule__BundleExtra__Group__5();

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
    // $ANTLR end "rule__BundleExtra__Group__4"


    // $ANTLR start "rule__BundleExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3162:1: rule__BundleExtra__Group__4__Impl : ( ( rule__BundleExtra__ValueAssignment_4 ) ) ;
    public final void rule__BundleExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3166:1: ( ( ( rule__BundleExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3167:1: ( ( rule__BundleExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3167:1: ( ( rule__BundleExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3168:1: ( rule__BundleExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getBundleExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3169:1: ( rule__BundleExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3169:2: rule__BundleExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__ValueAssignment_4_in_rule__BundleExtra__Group__4__Impl6284);
            rule__BundleExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBundleExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__BundleExtra__Group__4__Impl"


    // $ANTLR start "rule__BundleExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3179:1: rule__BundleExtra__Group__5 : rule__BundleExtra__Group__5__Impl ;
    public final void rule__BundleExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3183:1: ( rule__BundleExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3184:2: rule__BundleExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BundleExtra__Group__5__Impl_in_rule__BundleExtra__Group__56314);
            rule__BundleExtra__Group__5__Impl();

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
    // $ANTLR end "rule__BundleExtra__Group__5"


    // $ANTLR start "rule__BundleExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3190:1: rule__BundleExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__BundleExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3194:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3195:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3195:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3196:1: '}'
            {
             before(grammarAccess.getBundleExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BundleExtra__Group__5__Impl6342); 
             after(grammarAccess.getBundleExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__BundleExtra__Group__5__Impl"


    // $ANTLR start "rule__ParceableExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3221:1: rule__ParceableExtra__Group__0 : rule__ParceableExtra__Group__0__Impl rule__ParceableExtra__Group__1 ;
    public final void rule__ParceableExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3225:1: ( rule__ParceableExtra__Group__0__Impl rule__ParceableExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3226:2: rule__ParceableExtra__Group__0__Impl rule__ParceableExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__0__Impl_in_rule__ParceableExtra__Group__06385);
            rule__ParceableExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__1_in_rule__ParceableExtra__Group__06388);
            rule__ParceableExtra__Group__1();

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
    // $ANTLR end "rule__ParceableExtra__Group__0"


    // $ANTLR start "rule__ParceableExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3233:1: rule__ParceableExtra__Group__0__Impl : ( 'ParceableExtra' ) ;
    public final void rule__ParceableExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3237:1: ( ( 'ParceableExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3238:1: ( 'ParceableExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3238:1: ( 'ParceableExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3239:1: 'ParceableExtra'
            {
             before(grammarAccess.getParceableExtraAccess().getParceableExtraKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__ParceableExtra__Group__0__Impl6416); 
             after(grammarAccess.getParceableExtraAccess().getParceableExtraKeyword_0()); 

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
    // $ANTLR end "rule__ParceableExtra__Group__0__Impl"


    // $ANTLR start "rule__ParceableExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3252:1: rule__ParceableExtra__Group__1 : rule__ParceableExtra__Group__1__Impl rule__ParceableExtra__Group__2 ;
    public final void rule__ParceableExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3256:1: ( rule__ParceableExtra__Group__1__Impl rule__ParceableExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3257:2: rule__ParceableExtra__Group__1__Impl rule__ParceableExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__1__Impl_in_rule__ParceableExtra__Group__16447);
            rule__ParceableExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__2_in_rule__ParceableExtra__Group__16450);
            rule__ParceableExtra__Group__2();

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
    // $ANTLR end "rule__ParceableExtra__Group__1"


    // $ANTLR start "rule__ParceableExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3264:1: rule__ParceableExtra__Group__1__Impl : ( ( rule__ParceableExtra__NameAssignment_1 ) ) ;
    public final void rule__ParceableExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3268:1: ( ( ( rule__ParceableExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3269:1: ( ( rule__ParceableExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3269:1: ( ( rule__ParceableExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3270:1: ( rule__ParceableExtra__NameAssignment_1 )
            {
             before(grammarAccess.getParceableExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3271:1: ( rule__ParceableExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3271:2: rule__ParceableExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__NameAssignment_1_in_rule__ParceableExtra__Group__1__Impl6477);
            rule__ParceableExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParceableExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ParceableExtra__Group__1__Impl"


    // $ANTLR start "rule__ParceableExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3281:1: rule__ParceableExtra__Group__2 : rule__ParceableExtra__Group__2__Impl rule__ParceableExtra__Group__3 ;
    public final void rule__ParceableExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3285:1: ( rule__ParceableExtra__Group__2__Impl rule__ParceableExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3286:2: rule__ParceableExtra__Group__2__Impl rule__ParceableExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__2__Impl_in_rule__ParceableExtra__Group__26507);
            rule__ParceableExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__3_in_rule__ParceableExtra__Group__26510);
            rule__ParceableExtra__Group__3();

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
    // $ANTLR end "rule__ParceableExtra__Group__2"


    // $ANTLR start "rule__ParceableExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3293:1: rule__ParceableExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__ParceableExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3297:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3298:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3298:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3299:1: '{'
            {
             before(grammarAccess.getParceableExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ParceableExtra__Group__2__Impl6538); 
             after(grammarAccess.getParceableExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ParceableExtra__Group__2__Impl"


    // $ANTLR start "rule__ParceableExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3312:1: rule__ParceableExtra__Group__3 : rule__ParceableExtra__Group__3__Impl rule__ParceableExtra__Group__4 ;
    public final void rule__ParceableExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3316:1: ( rule__ParceableExtra__Group__3__Impl rule__ParceableExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3317:2: rule__ParceableExtra__Group__3__Impl rule__ParceableExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__3__Impl_in_rule__ParceableExtra__Group__36569);
            rule__ParceableExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__4_in_rule__ParceableExtra__Group__36572);
            rule__ParceableExtra__Group__4();

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
    // $ANTLR end "rule__ParceableExtra__Group__3"


    // $ANTLR start "rule__ParceableExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3324:1: rule__ParceableExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__ParceableExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3328:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3329:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3329:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3330:1: 'value'
            {
             before(grammarAccess.getParceableExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ParceableExtra__Group__3__Impl6600); 
             after(grammarAccess.getParceableExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__ParceableExtra__Group__3__Impl"


    // $ANTLR start "rule__ParceableExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3343:1: rule__ParceableExtra__Group__4 : rule__ParceableExtra__Group__4__Impl rule__ParceableExtra__Group__5 ;
    public final void rule__ParceableExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3347:1: ( rule__ParceableExtra__Group__4__Impl rule__ParceableExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3348:2: rule__ParceableExtra__Group__4__Impl rule__ParceableExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__4__Impl_in_rule__ParceableExtra__Group__46631);
            rule__ParceableExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__5_in_rule__ParceableExtra__Group__46634);
            rule__ParceableExtra__Group__5();

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
    // $ANTLR end "rule__ParceableExtra__Group__4"


    // $ANTLR start "rule__ParceableExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3355:1: rule__ParceableExtra__Group__4__Impl : ( ( rule__ParceableExtra__ValueAssignment_4 ) ) ;
    public final void rule__ParceableExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3359:1: ( ( ( rule__ParceableExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3360:1: ( ( rule__ParceableExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3360:1: ( ( rule__ParceableExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3361:1: ( rule__ParceableExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getParceableExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3362:1: ( rule__ParceableExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3362:2: rule__ParceableExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__ValueAssignment_4_in_rule__ParceableExtra__Group__4__Impl6661);
            rule__ParceableExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParceableExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__ParceableExtra__Group__4__Impl"


    // $ANTLR start "rule__ParceableExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3372:1: rule__ParceableExtra__Group__5 : rule__ParceableExtra__Group__5__Impl ;
    public final void rule__ParceableExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3376:1: ( rule__ParceableExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3377:2: rule__ParceableExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ParceableExtra__Group__5__Impl_in_rule__ParceableExtra__Group__56691);
            rule__ParceableExtra__Group__5__Impl();

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
    // $ANTLR end "rule__ParceableExtra__Group__5"


    // $ANTLR start "rule__ParceableExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3383:1: rule__ParceableExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__ParceableExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3387:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3388:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3388:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3389:1: '}'
            {
             before(grammarAccess.getParceableExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__ParceableExtra__Group__5__Impl6719); 
             after(grammarAccess.getParceableExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ParceableExtra__Group__5__Impl"


    // $ANTLR start "rule__SerializableExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3414:1: rule__SerializableExtra__Group__0 : rule__SerializableExtra__Group__0__Impl rule__SerializableExtra__Group__1 ;
    public final void rule__SerializableExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3418:1: ( rule__SerializableExtra__Group__0__Impl rule__SerializableExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3419:2: rule__SerializableExtra__Group__0__Impl rule__SerializableExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__0__Impl_in_rule__SerializableExtra__Group__06762);
            rule__SerializableExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__1_in_rule__SerializableExtra__Group__06765);
            rule__SerializableExtra__Group__1();

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
    // $ANTLR end "rule__SerializableExtra__Group__0"


    // $ANTLR start "rule__SerializableExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3426:1: rule__SerializableExtra__Group__0__Impl : ( 'SerializableExtra' ) ;
    public final void rule__SerializableExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3430:1: ( ( 'SerializableExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3431:1: ( 'SerializableExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3431:1: ( 'SerializableExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3432:1: 'SerializableExtra'
            {
             before(grammarAccess.getSerializableExtraAccess().getSerializableExtraKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SerializableExtra__Group__0__Impl6793); 
             after(grammarAccess.getSerializableExtraAccess().getSerializableExtraKeyword_0()); 

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
    // $ANTLR end "rule__SerializableExtra__Group__0__Impl"


    // $ANTLR start "rule__SerializableExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3445:1: rule__SerializableExtra__Group__1 : rule__SerializableExtra__Group__1__Impl rule__SerializableExtra__Group__2 ;
    public final void rule__SerializableExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3449:1: ( rule__SerializableExtra__Group__1__Impl rule__SerializableExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3450:2: rule__SerializableExtra__Group__1__Impl rule__SerializableExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__1__Impl_in_rule__SerializableExtra__Group__16824);
            rule__SerializableExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__2_in_rule__SerializableExtra__Group__16827);
            rule__SerializableExtra__Group__2();

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
    // $ANTLR end "rule__SerializableExtra__Group__1"


    // $ANTLR start "rule__SerializableExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3457:1: rule__SerializableExtra__Group__1__Impl : ( ( rule__SerializableExtra__NameAssignment_1 ) ) ;
    public final void rule__SerializableExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3461:1: ( ( ( rule__SerializableExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3462:1: ( ( rule__SerializableExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3462:1: ( ( rule__SerializableExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3463:1: ( rule__SerializableExtra__NameAssignment_1 )
            {
             before(grammarAccess.getSerializableExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3464:1: ( rule__SerializableExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3464:2: rule__SerializableExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__NameAssignment_1_in_rule__SerializableExtra__Group__1__Impl6854);
            rule__SerializableExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSerializableExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SerializableExtra__Group__1__Impl"


    // $ANTLR start "rule__SerializableExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3474:1: rule__SerializableExtra__Group__2 : rule__SerializableExtra__Group__2__Impl rule__SerializableExtra__Group__3 ;
    public final void rule__SerializableExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3478:1: ( rule__SerializableExtra__Group__2__Impl rule__SerializableExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3479:2: rule__SerializableExtra__Group__2__Impl rule__SerializableExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__2__Impl_in_rule__SerializableExtra__Group__26884);
            rule__SerializableExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__3_in_rule__SerializableExtra__Group__26887);
            rule__SerializableExtra__Group__3();

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
    // $ANTLR end "rule__SerializableExtra__Group__2"


    // $ANTLR start "rule__SerializableExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3486:1: rule__SerializableExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__SerializableExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3490:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3491:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3491:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3492:1: '{'
            {
             before(grammarAccess.getSerializableExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__SerializableExtra__Group__2__Impl6915); 
             after(grammarAccess.getSerializableExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SerializableExtra__Group__2__Impl"


    // $ANTLR start "rule__SerializableExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3505:1: rule__SerializableExtra__Group__3 : rule__SerializableExtra__Group__3__Impl rule__SerializableExtra__Group__4 ;
    public final void rule__SerializableExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3509:1: ( rule__SerializableExtra__Group__3__Impl rule__SerializableExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3510:2: rule__SerializableExtra__Group__3__Impl rule__SerializableExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__3__Impl_in_rule__SerializableExtra__Group__36946);
            rule__SerializableExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__4_in_rule__SerializableExtra__Group__36949);
            rule__SerializableExtra__Group__4();

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
    // $ANTLR end "rule__SerializableExtra__Group__3"


    // $ANTLR start "rule__SerializableExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3517:1: rule__SerializableExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__SerializableExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3521:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3522:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3522:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3523:1: 'value'
            {
             before(grammarAccess.getSerializableExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SerializableExtra__Group__3__Impl6977); 
             after(grammarAccess.getSerializableExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__SerializableExtra__Group__3__Impl"


    // $ANTLR start "rule__SerializableExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3536:1: rule__SerializableExtra__Group__4 : rule__SerializableExtra__Group__4__Impl rule__SerializableExtra__Group__5 ;
    public final void rule__SerializableExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3540:1: ( rule__SerializableExtra__Group__4__Impl rule__SerializableExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3541:2: rule__SerializableExtra__Group__4__Impl rule__SerializableExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__4__Impl_in_rule__SerializableExtra__Group__47008);
            rule__SerializableExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__5_in_rule__SerializableExtra__Group__47011);
            rule__SerializableExtra__Group__5();

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
    // $ANTLR end "rule__SerializableExtra__Group__4"


    // $ANTLR start "rule__SerializableExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3548:1: rule__SerializableExtra__Group__4__Impl : ( ( rule__SerializableExtra__ValueAssignment_4 ) ) ;
    public final void rule__SerializableExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3552:1: ( ( ( rule__SerializableExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3553:1: ( ( rule__SerializableExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3553:1: ( ( rule__SerializableExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3554:1: ( rule__SerializableExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getSerializableExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3555:1: ( rule__SerializableExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3555:2: rule__SerializableExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__ValueAssignment_4_in_rule__SerializableExtra__Group__4__Impl7038);
            rule__SerializableExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSerializableExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__SerializableExtra__Group__4__Impl"


    // $ANTLR start "rule__SerializableExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3565:1: rule__SerializableExtra__Group__5 : rule__SerializableExtra__Group__5__Impl ;
    public final void rule__SerializableExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3569:1: ( rule__SerializableExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3570:2: rule__SerializableExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SerializableExtra__Group__5__Impl_in_rule__SerializableExtra__Group__57068);
            rule__SerializableExtra__Group__5__Impl();

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
    // $ANTLR end "rule__SerializableExtra__Group__5"


    // $ANTLR start "rule__SerializableExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3576:1: rule__SerializableExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__SerializableExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3580:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3581:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3581:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3582:1: '}'
            {
             before(grammarAccess.getSerializableExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__SerializableExtra__Group__5__Impl7096); 
             after(grammarAccess.getSerializableExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SerializableExtra__Group__5__Impl"


    // $ANTLR start "rule__FloatExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3607:1: rule__FloatExtra__Group__0 : rule__FloatExtra__Group__0__Impl rule__FloatExtra__Group__1 ;
    public final void rule__FloatExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3611:1: ( rule__FloatExtra__Group__0__Impl rule__FloatExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3612:2: rule__FloatExtra__Group__0__Impl rule__FloatExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__0__Impl_in_rule__FloatExtra__Group__07139);
            rule__FloatExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__1_in_rule__FloatExtra__Group__07142);
            rule__FloatExtra__Group__1();

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
    // $ANTLR end "rule__FloatExtra__Group__0"


    // $ANTLR start "rule__FloatExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3619:1: rule__FloatExtra__Group__0__Impl : ( 'FloatExtra' ) ;
    public final void rule__FloatExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3623:1: ( ( 'FloatExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3624:1: ( 'FloatExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3624:1: ( 'FloatExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3625:1: 'FloatExtra'
            {
             before(grammarAccess.getFloatExtraAccess().getFloatExtraKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__FloatExtra__Group__0__Impl7170); 
             after(grammarAccess.getFloatExtraAccess().getFloatExtraKeyword_0()); 

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
    // $ANTLR end "rule__FloatExtra__Group__0__Impl"


    // $ANTLR start "rule__FloatExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3638:1: rule__FloatExtra__Group__1 : rule__FloatExtra__Group__1__Impl rule__FloatExtra__Group__2 ;
    public final void rule__FloatExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3642:1: ( rule__FloatExtra__Group__1__Impl rule__FloatExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3643:2: rule__FloatExtra__Group__1__Impl rule__FloatExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__1__Impl_in_rule__FloatExtra__Group__17201);
            rule__FloatExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__2_in_rule__FloatExtra__Group__17204);
            rule__FloatExtra__Group__2();

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
    // $ANTLR end "rule__FloatExtra__Group__1"


    // $ANTLR start "rule__FloatExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3650:1: rule__FloatExtra__Group__1__Impl : ( ( rule__FloatExtra__NameAssignment_1 ) ) ;
    public final void rule__FloatExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3654:1: ( ( ( rule__FloatExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3655:1: ( ( rule__FloatExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3655:1: ( ( rule__FloatExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3656:1: ( rule__FloatExtra__NameAssignment_1 )
            {
             before(grammarAccess.getFloatExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3657:1: ( rule__FloatExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3657:2: rule__FloatExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__NameAssignment_1_in_rule__FloatExtra__Group__1__Impl7231);
            rule__FloatExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFloatExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FloatExtra__Group__1__Impl"


    // $ANTLR start "rule__FloatExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3667:1: rule__FloatExtra__Group__2 : rule__FloatExtra__Group__2__Impl rule__FloatExtra__Group__3 ;
    public final void rule__FloatExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3671:1: ( rule__FloatExtra__Group__2__Impl rule__FloatExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3672:2: rule__FloatExtra__Group__2__Impl rule__FloatExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__2__Impl_in_rule__FloatExtra__Group__27261);
            rule__FloatExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__3_in_rule__FloatExtra__Group__27264);
            rule__FloatExtra__Group__3();

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
    // $ANTLR end "rule__FloatExtra__Group__2"


    // $ANTLR start "rule__FloatExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3679:1: rule__FloatExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__FloatExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3683:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3684:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3684:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3685:1: '{'
            {
             before(grammarAccess.getFloatExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__FloatExtra__Group__2__Impl7292); 
             after(grammarAccess.getFloatExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__FloatExtra__Group__2__Impl"


    // $ANTLR start "rule__FloatExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3698:1: rule__FloatExtra__Group__3 : rule__FloatExtra__Group__3__Impl rule__FloatExtra__Group__4 ;
    public final void rule__FloatExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3702:1: ( rule__FloatExtra__Group__3__Impl rule__FloatExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3703:2: rule__FloatExtra__Group__3__Impl rule__FloatExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__3__Impl_in_rule__FloatExtra__Group__37323);
            rule__FloatExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__4_in_rule__FloatExtra__Group__37326);
            rule__FloatExtra__Group__4();

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
    // $ANTLR end "rule__FloatExtra__Group__3"


    // $ANTLR start "rule__FloatExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3710:1: rule__FloatExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__FloatExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3714:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3715:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3715:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3716:1: 'value'
            {
             before(grammarAccess.getFloatExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__FloatExtra__Group__3__Impl7354); 
             after(grammarAccess.getFloatExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__FloatExtra__Group__3__Impl"


    // $ANTLR start "rule__FloatExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3729:1: rule__FloatExtra__Group__4 : rule__FloatExtra__Group__4__Impl rule__FloatExtra__Group__5 ;
    public final void rule__FloatExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3733:1: ( rule__FloatExtra__Group__4__Impl rule__FloatExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3734:2: rule__FloatExtra__Group__4__Impl rule__FloatExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__4__Impl_in_rule__FloatExtra__Group__47385);
            rule__FloatExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__5_in_rule__FloatExtra__Group__47388);
            rule__FloatExtra__Group__5();

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
    // $ANTLR end "rule__FloatExtra__Group__4"


    // $ANTLR start "rule__FloatExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3741:1: rule__FloatExtra__Group__4__Impl : ( ( rule__FloatExtra__ValueAssignment_4 ) ) ;
    public final void rule__FloatExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3745:1: ( ( ( rule__FloatExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3746:1: ( ( rule__FloatExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3746:1: ( ( rule__FloatExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3747:1: ( rule__FloatExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getFloatExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3748:1: ( rule__FloatExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3748:2: rule__FloatExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__ValueAssignment_4_in_rule__FloatExtra__Group__4__Impl7415);
            rule__FloatExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFloatExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__FloatExtra__Group__4__Impl"


    // $ANTLR start "rule__FloatExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3758:1: rule__FloatExtra__Group__5 : rule__FloatExtra__Group__5__Impl ;
    public final void rule__FloatExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3762:1: ( rule__FloatExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3763:2: rule__FloatExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FloatExtra__Group__5__Impl_in_rule__FloatExtra__Group__57445);
            rule__FloatExtra__Group__5__Impl();

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
    // $ANTLR end "rule__FloatExtra__Group__5"


    // $ANTLR start "rule__FloatExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3769:1: rule__FloatExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__FloatExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3773:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3774:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3774:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3775:1: '}'
            {
             before(grammarAccess.getFloatExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__FloatExtra__Group__5__Impl7473); 
             after(grammarAccess.getFloatExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__FloatExtra__Group__5__Impl"


    // $ANTLR start "rule__ByteExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3800:1: rule__ByteExtra__Group__0 : rule__ByteExtra__Group__0__Impl rule__ByteExtra__Group__1 ;
    public final void rule__ByteExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3804:1: ( rule__ByteExtra__Group__0__Impl rule__ByteExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3805:2: rule__ByteExtra__Group__0__Impl rule__ByteExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__0__Impl_in_rule__ByteExtra__Group__07516);
            rule__ByteExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__1_in_rule__ByteExtra__Group__07519);
            rule__ByteExtra__Group__1();

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
    // $ANTLR end "rule__ByteExtra__Group__0"


    // $ANTLR start "rule__ByteExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3812:1: rule__ByteExtra__Group__0__Impl : ( 'ByteExtra' ) ;
    public final void rule__ByteExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3816:1: ( ( 'ByteExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3817:1: ( 'ByteExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3817:1: ( 'ByteExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3818:1: 'ByteExtra'
            {
             before(grammarAccess.getByteExtraAccess().getByteExtraKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ByteExtra__Group__0__Impl7547); 
             after(grammarAccess.getByteExtraAccess().getByteExtraKeyword_0()); 

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
    // $ANTLR end "rule__ByteExtra__Group__0__Impl"


    // $ANTLR start "rule__ByteExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3831:1: rule__ByteExtra__Group__1 : rule__ByteExtra__Group__1__Impl rule__ByteExtra__Group__2 ;
    public final void rule__ByteExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3835:1: ( rule__ByteExtra__Group__1__Impl rule__ByteExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3836:2: rule__ByteExtra__Group__1__Impl rule__ByteExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__1__Impl_in_rule__ByteExtra__Group__17578);
            rule__ByteExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__2_in_rule__ByteExtra__Group__17581);
            rule__ByteExtra__Group__2();

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
    // $ANTLR end "rule__ByteExtra__Group__1"


    // $ANTLR start "rule__ByteExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3843:1: rule__ByteExtra__Group__1__Impl : ( ( rule__ByteExtra__NameAssignment_1 ) ) ;
    public final void rule__ByteExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3847:1: ( ( ( rule__ByteExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3848:1: ( ( rule__ByteExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3848:1: ( ( rule__ByteExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3849:1: ( rule__ByteExtra__NameAssignment_1 )
            {
             before(grammarAccess.getByteExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3850:1: ( rule__ByteExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3850:2: rule__ByteExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__NameAssignment_1_in_rule__ByteExtra__Group__1__Impl7608);
            rule__ByteExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getByteExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ByteExtra__Group__1__Impl"


    // $ANTLR start "rule__ByteExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3860:1: rule__ByteExtra__Group__2 : rule__ByteExtra__Group__2__Impl rule__ByteExtra__Group__3 ;
    public final void rule__ByteExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3864:1: ( rule__ByteExtra__Group__2__Impl rule__ByteExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3865:2: rule__ByteExtra__Group__2__Impl rule__ByteExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__2__Impl_in_rule__ByteExtra__Group__27638);
            rule__ByteExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__3_in_rule__ByteExtra__Group__27641);
            rule__ByteExtra__Group__3();

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
    // $ANTLR end "rule__ByteExtra__Group__2"


    // $ANTLR start "rule__ByteExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3872:1: rule__ByteExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__ByteExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3876:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3877:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3877:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3878:1: '{'
            {
             before(grammarAccess.getByteExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ByteExtra__Group__2__Impl7669); 
             after(grammarAccess.getByteExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ByteExtra__Group__2__Impl"


    // $ANTLR start "rule__ByteExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3891:1: rule__ByteExtra__Group__3 : rule__ByteExtra__Group__3__Impl rule__ByteExtra__Group__4 ;
    public final void rule__ByteExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3895:1: ( rule__ByteExtra__Group__3__Impl rule__ByteExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3896:2: rule__ByteExtra__Group__3__Impl rule__ByteExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__3__Impl_in_rule__ByteExtra__Group__37700);
            rule__ByteExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__4_in_rule__ByteExtra__Group__37703);
            rule__ByteExtra__Group__4();

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
    // $ANTLR end "rule__ByteExtra__Group__3"


    // $ANTLR start "rule__ByteExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3903:1: rule__ByteExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__ByteExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3907:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3908:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3908:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3909:1: 'value'
            {
             before(grammarAccess.getByteExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ByteExtra__Group__3__Impl7731); 
             after(grammarAccess.getByteExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__ByteExtra__Group__3__Impl"


    // $ANTLR start "rule__ByteExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3922:1: rule__ByteExtra__Group__4 : rule__ByteExtra__Group__4__Impl rule__ByteExtra__Group__5 ;
    public final void rule__ByteExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3926:1: ( rule__ByteExtra__Group__4__Impl rule__ByteExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3927:2: rule__ByteExtra__Group__4__Impl rule__ByteExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__4__Impl_in_rule__ByteExtra__Group__47762);
            rule__ByteExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__5_in_rule__ByteExtra__Group__47765);
            rule__ByteExtra__Group__5();

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
    // $ANTLR end "rule__ByteExtra__Group__4"


    // $ANTLR start "rule__ByteExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3934:1: rule__ByteExtra__Group__4__Impl : ( ( rule__ByteExtra__ValueAssignment_4 ) ) ;
    public final void rule__ByteExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3938:1: ( ( ( rule__ByteExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3939:1: ( ( rule__ByteExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3939:1: ( ( rule__ByteExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3940:1: ( rule__ByteExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getByteExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3941:1: ( rule__ByteExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3941:2: rule__ByteExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__ValueAssignment_4_in_rule__ByteExtra__Group__4__Impl7792);
            rule__ByteExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getByteExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__ByteExtra__Group__4__Impl"


    // $ANTLR start "rule__ByteExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3951:1: rule__ByteExtra__Group__5 : rule__ByteExtra__Group__5__Impl ;
    public final void rule__ByteExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3955:1: ( rule__ByteExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3956:2: rule__ByteExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ByteExtra__Group__5__Impl_in_rule__ByteExtra__Group__57822);
            rule__ByteExtra__Group__5__Impl();

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
    // $ANTLR end "rule__ByteExtra__Group__5"


    // $ANTLR start "rule__ByteExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3962:1: rule__ByteExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__ByteExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3966:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3967:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3967:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3968:1: '}'
            {
             before(grammarAccess.getByteExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__ByteExtra__Group__5__Impl7850); 
             after(grammarAccess.getByteExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ByteExtra__Group__5__Impl"


    // $ANTLR start "rule__LongExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3993:1: rule__LongExtra__Group__0 : rule__LongExtra__Group__0__Impl rule__LongExtra__Group__1 ;
    public final void rule__LongExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3997:1: ( rule__LongExtra__Group__0__Impl rule__LongExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:3998:2: rule__LongExtra__Group__0__Impl rule__LongExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__0__Impl_in_rule__LongExtra__Group__07893);
            rule__LongExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__1_in_rule__LongExtra__Group__07896);
            rule__LongExtra__Group__1();

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
    // $ANTLR end "rule__LongExtra__Group__0"


    // $ANTLR start "rule__LongExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4005:1: rule__LongExtra__Group__0__Impl : ( 'LongExtra' ) ;
    public final void rule__LongExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4009:1: ( ( 'LongExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4010:1: ( 'LongExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4010:1: ( 'LongExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4011:1: 'LongExtra'
            {
             before(grammarAccess.getLongExtraAccess().getLongExtraKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__LongExtra__Group__0__Impl7924); 
             after(grammarAccess.getLongExtraAccess().getLongExtraKeyword_0()); 

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
    // $ANTLR end "rule__LongExtra__Group__0__Impl"


    // $ANTLR start "rule__LongExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4024:1: rule__LongExtra__Group__1 : rule__LongExtra__Group__1__Impl rule__LongExtra__Group__2 ;
    public final void rule__LongExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4028:1: ( rule__LongExtra__Group__1__Impl rule__LongExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4029:2: rule__LongExtra__Group__1__Impl rule__LongExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__1__Impl_in_rule__LongExtra__Group__17955);
            rule__LongExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__2_in_rule__LongExtra__Group__17958);
            rule__LongExtra__Group__2();

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
    // $ANTLR end "rule__LongExtra__Group__1"


    // $ANTLR start "rule__LongExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4036:1: rule__LongExtra__Group__1__Impl : ( ( rule__LongExtra__NameAssignment_1 ) ) ;
    public final void rule__LongExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4040:1: ( ( ( rule__LongExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4041:1: ( ( rule__LongExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4041:1: ( ( rule__LongExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4042:1: ( rule__LongExtra__NameAssignment_1 )
            {
             before(grammarAccess.getLongExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4043:1: ( rule__LongExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4043:2: rule__LongExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__NameAssignment_1_in_rule__LongExtra__Group__1__Impl7985);
            rule__LongExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLongExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__LongExtra__Group__1__Impl"


    // $ANTLR start "rule__LongExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4053:1: rule__LongExtra__Group__2 : rule__LongExtra__Group__2__Impl rule__LongExtra__Group__3 ;
    public final void rule__LongExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4057:1: ( rule__LongExtra__Group__2__Impl rule__LongExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4058:2: rule__LongExtra__Group__2__Impl rule__LongExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__2__Impl_in_rule__LongExtra__Group__28015);
            rule__LongExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__3_in_rule__LongExtra__Group__28018);
            rule__LongExtra__Group__3();

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
    // $ANTLR end "rule__LongExtra__Group__2"


    // $ANTLR start "rule__LongExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4065:1: rule__LongExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__LongExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4069:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4070:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4070:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4071:1: '{'
            {
             before(grammarAccess.getLongExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__LongExtra__Group__2__Impl8046); 
             after(grammarAccess.getLongExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__LongExtra__Group__2__Impl"


    // $ANTLR start "rule__LongExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4084:1: rule__LongExtra__Group__3 : rule__LongExtra__Group__3__Impl rule__LongExtra__Group__4 ;
    public final void rule__LongExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4088:1: ( rule__LongExtra__Group__3__Impl rule__LongExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4089:2: rule__LongExtra__Group__3__Impl rule__LongExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__3__Impl_in_rule__LongExtra__Group__38077);
            rule__LongExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__4_in_rule__LongExtra__Group__38080);
            rule__LongExtra__Group__4();

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
    // $ANTLR end "rule__LongExtra__Group__3"


    // $ANTLR start "rule__LongExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4096:1: rule__LongExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__LongExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4100:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4101:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4101:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4102:1: 'value'
            {
             before(grammarAccess.getLongExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__LongExtra__Group__3__Impl8108); 
             after(grammarAccess.getLongExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__LongExtra__Group__3__Impl"


    // $ANTLR start "rule__LongExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4115:1: rule__LongExtra__Group__4 : rule__LongExtra__Group__4__Impl rule__LongExtra__Group__5 ;
    public final void rule__LongExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4119:1: ( rule__LongExtra__Group__4__Impl rule__LongExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4120:2: rule__LongExtra__Group__4__Impl rule__LongExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__4__Impl_in_rule__LongExtra__Group__48139);
            rule__LongExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__5_in_rule__LongExtra__Group__48142);
            rule__LongExtra__Group__5();

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
    // $ANTLR end "rule__LongExtra__Group__4"


    // $ANTLR start "rule__LongExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4127:1: rule__LongExtra__Group__4__Impl : ( ( rule__LongExtra__ValueAssignment_4 ) ) ;
    public final void rule__LongExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4131:1: ( ( ( rule__LongExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4132:1: ( ( rule__LongExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4132:1: ( ( rule__LongExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4133:1: ( rule__LongExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getLongExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4134:1: ( rule__LongExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4134:2: rule__LongExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__ValueAssignment_4_in_rule__LongExtra__Group__4__Impl8169);
            rule__LongExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLongExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__LongExtra__Group__4__Impl"


    // $ANTLR start "rule__LongExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4144:1: rule__LongExtra__Group__5 : rule__LongExtra__Group__5__Impl ;
    public final void rule__LongExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4148:1: ( rule__LongExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4149:2: rule__LongExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LongExtra__Group__5__Impl_in_rule__LongExtra__Group__58199);
            rule__LongExtra__Group__5__Impl();

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
    // $ANTLR end "rule__LongExtra__Group__5"


    // $ANTLR start "rule__LongExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4155:1: rule__LongExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__LongExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4159:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4160:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4160:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4161:1: '}'
            {
             before(grammarAccess.getLongExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__LongExtra__Group__5__Impl8227); 
             after(grammarAccess.getLongExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__LongExtra__Group__5__Impl"


    // $ANTLR start "rule__StringExtra__Group__0"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4186:1: rule__StringExtra__Group__0 : rule__StringExtra__Group__0__Impl rule__StringExtra__Group__1 ;
    public final void rule__StringExtra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4190:1: ( rule__StringExtra__Group__0__Impl rule__StringExtra__Group__1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4191:2: rule__StringExtra__Group__0__Impl rule__StringExtra__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__0__Impl_in_rule__StringExtra__Group__08270);
            rule__StringExtra__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__1_in_rule__StringExtra__Group__08273);
            rule__StringExtra__Group__1();

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
    // $ANTLR end "rule__StringExtra__Group__0"


    // $ANTLR start "rule__StringExtra__Group__0__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4198:1: rule__StringExtra__Group__0__Impl : ( 'StringExtra' ) ;
    public final void rule__StringExtra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4202:1: ( ( 'StringExtra' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4203:1: ( 'StringExtra' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4203:1: ( 'StringExtra' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4204:1: 'StringExtra'
            {
             before(grammarAccess.getStringExtraAccess().getStringExtraKeyword_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__StringExtra__Group__0__Impl8301); 
             after(grammarAccess.getStringExtraAccess().getStringExtraKeyword_0()); 

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
    // $ANTLR end "rule__StringExtra__Group__0__Impl"


    // $ANTLR start "rule__StringExtra__Group__1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4217:1: rule__StringExtra__Group__1 : rule__StringExtra__Group__1__Impl rule__StringExtra__Group__2 ;
    public final void rule__StringExtra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4221:1: ( rule__StringExtra__Group__1__Impl rule__StringExtra__Group__2 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4222:2: rule__StringExtra__Group__1__Impl rule__StringExtra__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__1__Impl_in_rule__StringExtra__Group__18332);
            rule__StringExtra__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__2_in_rule__StringExtra__Group__18335);
            rule__StringExtra__Group__2();

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
    // $ANTLR end "rule__StringExtra__Group__1"


    // $ANTLR start "rule__StringExtra__Group__1__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4229:1: rule__StringExtra__Group__1__Impl : ( ( rule__StringExtra__NameAssignment_1 ) ) ;
    public final void rule__StringExtra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4233:1: ( ( ( rule__StringExtra__NameAssignment_1 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4234:1: ( ( rule__StringExtra__NameAssignment_1 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4234:1: ( ( rule__StringExtra__NameAssignment_1 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4235:1: ( rule__StringExtra__NameAssignment_1 )
            {
             before(grammarAccess.getStringExtraAccess().getNameAssignment_1()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4236:1: ( rule__StringExtra__NameAssignment_1 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4236:2: rule__StringExtra__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__NameAssignment_1_in_rule__StringExtra__Group__1__Impl8362);
            rule__StringExtra__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringExtraAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StringExtra__Group__1__Impl"


    // $ANTLR start "rule__StringExtra__Group__2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4246:1: rule__StringExtra__Group__2 : rule__StringExtra__Group__2__Impl rule__StringExtra__Group__3 ;
    public final void rule__StringExtra__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4250:1: ( rule__StringExtra__Group__2__Impl rule__StringExtra__Group__3 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4251:2: rule__StringExtra__Group__2__Impl rule__StringExtra__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__2__Impl_in_rule__StringExtra__Group__28392);
            rule__StringExtra__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__3_in_rule__StringExtra__Group__28395);
            rule__StringExtra__Group__3();

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
    // $ANTLR end "rule__StringExtra__Group__2"


    // $ANTLR start "rule__StringExtra__Group__2__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4258:1: rule__StringExtra__Group__2__Impl : ( '{' ) ;
    public final void rule__StringExtra__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4262:1: ( ( '{' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4263:1: ( '{' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4263:1: ( '{' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4264:1: '{'
            {
             before(grammarAccess.getStringExtraAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__StringExtra__Group__2__Impl8423); 
             after(grammarAccess.getStringExtraAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__StringExtra__Group__2__Impl"


    // $ANTLR start "rule__StringExtra__Group__3"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4277:1: rule__StringExtra__Group__3 : rule__StringExtra__Group__3__Impl rule__StringExtra__Group__4 ;
    public final void rule__StringExtra__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4281:1: ( rule__StringExtra__Group__3__Impl rule__StringExtra__Group__4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4282:2: rule__StringExtra__Group__3__Impl rule__StringExtra__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__3__Impl_in_rule__StringExtra__Group__38454);
            rule__StringExtra__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__4_in_rule__StringExtra__Group__38457);
            rule__StringExtra__Group__4();

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
    // $ANTLR end "rule__StringExtra__Group__3"


    // $ANTLR start "rule__StringExtra__Group__3__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4289:1: rule__StringExtra__Group__3__Impl : ( 'value' ) ;
    public final void rule__StringExtra__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4293:1: ( ( 'value' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4294:1: ( 'value' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4294:1: ( 'value' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4295:1: 'value'
            {
             before(grammarAccess.getStringExtraAccess().getValueKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__StringExtra__Group__3__Impl8485); 
             after(grammarAccess.getStringExtraAccess().getValueKeyword_3()); 

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
    // $ANTLR end "rule__StringExtra__Group__3__Impl"


    // $ANTLR start "rule__StringExtra__Group__4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4308:1: rule__StringExtra__Group__4 : rule__StringExtra__Group__4__Impl rule__StringExtra__Group__5 ;
    public final void rule__StringExtra__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4312:1: ( rule__StringExtra__Group__4__Impl rule__StringExtra__Group__5 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4313:2: rule__StringExtra__Group__4__Impl rule__StringExtra__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__4__Impl_in_rule__StringExtra__Group__48516);
            rule__StringExtra__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__5_in_rule__StringExtra__Group__48519);
            rule__StringExtra__Group__5();

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
    // $ANTLR end "rule__StringExtra__Group__4"


    // $ANTLR start "rule__StringExtra__Group__4__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4320:1: rule__StringExtra__Group__4__Impl : ( ( rule__StringExtra__ValueAssignment_4 ) ) ;
    public final void rule__StringExtra__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4324:1: ( ( ( rule__StringExtra__ValueAssignment_4 ) ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4325:1: ( ( rule__StringExtra__ValueAssignment_4 ) )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4325:1: ( ( rule__StringExtra__ValueAssignment_4 ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4326:1: ( rule__StringExtra__ValueAssignment_4 )
            {
             before(grammarAccess.getStringExtraAccess().getValueAssignment_4()); 
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4327:1: ( rule__StringExtra__ValueAssignment_4 )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4327:2: rule__StringExtra__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__ValueAssignment_4_in_rule__StringExtra__Group__4__Impl8546);
            rule__StringExtra__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStringExtraAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__StringExtra__Group__4__Impl"


    // $ANTLR start "rule__StringExtra__Group__5"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4337:1: rule__StringExtra__Group__5 : rule__StringExtra__Group__5__Impl ;
    public final void rule__StringExtra__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4341:1: ( rule__StringExtra__Group__5__Impl )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4342:2: rule__StringExtra__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringExtra__Group__5__Impl_in_rule__StringExtra__Group__58576);
            rule__StringExtra__Group__5__Impl();

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
    // $ANTLR end "rule__StringExtra__Group__5"


    // $ANTLR start "rule__StringExtra__Group__5__Impl"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4348:1: rule__StringExtra__Group__5__Impl : ( '}' ) ;
    public final void rule__StringExtra__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4352:1: ( ( '}' ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4353:1: ( '}' )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4353:1: ( '}' )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4354:1: '}'
            {
             before(grammarAccess.getStringExtraAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__StringExtra__Group__5__Impl8604); 
             after(grammarAccess.getStringExtraAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__StringExtra__Group__5__Impl"


    // $ANTLR start "rule__Intent_Impl__NameAssignment_2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4380:1: rule__Intent_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Intent_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4384:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4385:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4385:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4386:1: ruleEString
            {
             before(grammarAccess.getIntent_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent_Impl__NameAssignment_28652);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntent_ImplAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Intent_Impl__NameAssignment_2"


    // $ANTLR start "rule__Intent_Impl__TypeAssignment_4_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4395:1: rule__Intent_Impl__TypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Intent_Impl__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4399:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4400:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4400:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4401:1: ruleEString
            {
             before(grammarAccess.getIntent_ImplAccess().getTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent_Impl__TypeAssignment_4_18683);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntent_ImplAccess().getTypeEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Intent_Impl__TypeAssignment_4_1"


    // $ANTLR start "rule__Intent_Impl__DataAssignment_5_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4410:1: rule__Intent_Impl__DataAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Intent_Impl__DataAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4414:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4415:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4415:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4416:1: ruleEString
            {
             before(grammarAccess.getIntent_ImplAccess().getDataEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent_Impl__DataAssignment_5_18714);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntent_ImplAccess().getDataEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Intent_Impl__DataAssignment_5_1"


    // $ANTLR start "rule__Intent_Impl__ExceptionNameAssignment_6_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4425:1: rule__Intent_Impl__ExceptionNameAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Intent_Impl__ExceptionNameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4429:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4430:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4430:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4431:1: ruleEString
            {
             before(grammarAccess.getIntent_ImplAccess().getExceptionNameEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Intent_Impl__ExceptionNameAssignment_6_18745);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntent_ImplAccess().getExceptionNameEStringParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Intent_Impl__ExceptionNameAssignment_6_1"


    // $ANTLR start "rule__Intent_Impl__ExtrasAssignment_7_2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4440:1: rule__Intent_Impl__ExtrasAssignment_7_2 : ( ruleBundle ) ;
    public final void rule__Intent_Impl__ExtrasAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4444:1: ( ( ruleBundle ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4445:1: ( ruleBundle )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4445:1: ( ruleBundle )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4446:1: ruleBundle
            {
             before(grammarAccess.getIntent_ImplAccess().getExtrasBundleParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundle_in_rule__Intent_Impl__ExtrasAssignment_7_28776);
            ruleBundle();

            state._fsp--;

             after(grammarAccess.getIntent_ImplAccess().getExtrasBundleParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Intent_Impl__ExtrasAssignment_7_2"


    // $ANTLR start "rule__Intent_Impl__ExtrasAssignment_7_3_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4455:1: rule__Intent_Impl__ExtrasAssignment_7_3_1 : ( ruleBundle ) ;
    public final void rule__Intent_Impl__ExtrasAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4459:1: ( ( ruleBundle ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4460:1: ( ruleBundle )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4460:1: ( ruleBundle )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4461:1: ruleBundle
            {
             before(grammarAccess.getIntent_ImplAccess().getExtrasBundleParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBundle_in_rule__Intent_Impl__ExtrasAssignment_7_3_18807);
            ruleBundle();

            state._fsp--;

             after(grammarAccess.getIntent_ImplAccess().getExtrasBundleParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__Intent_Impl__ExtrasAssignment_7_3_1"


    // $ANTLR start "rule__Intent_Impl__SucessCallbackAssignment_8_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4470:1: rule__Intent_Impl__SucessCallbackAssignment_8_1 : ( ruleCallback ) ;
    public final void rule__Intent_Impl__SucessCallbackAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4474:1: ( ( ruleCallback ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4475:1: ( ruleCallback )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4475:1: ( ruleCallback )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4476:1: ruleCallback
            {
             before(grammarAccess.getIntent_ImplAccess().getSucessCallbackCallbackParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCallback_in_rule__Intent_Impl__SucessCallbackAssignment_8_18838);
            ruleCallback();

            state._fsp--;

             after(grammarAccess.getIntent_ImplAccess().getSucessCallbackCallbackParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Intent_Impl__SucessCallbackAssignment_8_1"


    // $ANTLR start "rule__Intent_Impl__PermissionsAssignment_9_2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4485:1: rule__Intent_Impl__PermissionsAssignment_9_2 : ( rulePermissions ) ;
    public final void rule__Intent_Impl__PermissionsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4489:1: ( ( rulePermissions ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4490:1: ( rulePermissions )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4490:1: ( rulePermissions )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4491:1: rulePermissions
            {
             before(grammarAccess.getIntent_ImplAccess().getPermissionsPermissionsParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePermissions_in_rule__Intent_Impl__PermissionsAssignment_9_28869);
            rulePermissions();

            state._fsp--;

             after(grammarAccess.getIntent_ImplAccess().getPermissionsPermissionsParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Intent_Impl__PermissionsAssignment_9_2"


    // $ANTLR start "rule__Intent_Impl__PermissionsAssignment_9_3_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4500:1: rule__Intent_Impl__PermissionsAssignment_9_3_1 : ( rulePermissions ) ;
    public final void rule__Intent_Impl__PermissionsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4504:1: ( ( rulePermissions ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4505:1: ( rulePermissions )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4505:1: ( rulePermissions )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4506:1: rulePermissions
            {
             before(grammarAccess.getIntent_ImplAccess().getPermissionsPermissionsParserRuleCall_9_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePermissions_in_rule__Intent_Impl__PermissionsAssignment_9_3_18900);
            rulePermissions();

            state._fsp--;

             after(grammarAccess.getIntent_ImplAccess().getPermissionsPermissionsParserRuleCall_9_3_1_0()); 

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
    // $ANTLR end "rule__Intent_Impl__PermissionsAssignment_9_3_1"


    // $ANTLR start "rule__Bundle_Impl__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4515:1: rule__Bundle_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Bundle_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4519:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4520:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4520:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4521:1: ruleEString
            {
             before(grammarAccess.getBundle_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Bundle_Impl__NameAssignment_18931);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBundle_ImplAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Bundle_Impl__NameAssignment_1"


    // $ANTLR start "rule__Bundle_Impl__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4530:1: rule__Bundle_Impl__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__Bundle_Impl__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4534:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4535:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4535:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4536:1: ruleEString
            {
             before(grammarAccess.getBundle_ImplAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Bundle_Impl__ValueAssignment_48962);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBundle_ImplAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Bundle_Impl__ValueAssignment_4"


    // $ANTLR start "rule__Callback__NameAssignment_2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4545:1: rule__Callback__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Callback__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4549:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4550:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4550:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4551:1: ruleEString
            {
             before(grammarAccess.getCallbackAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Callback__NameAssignment_28993);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCallbackAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Callback__NameAssignment_2"


    // $ANTLR start "rule__Callback__DataAssignment_4_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4560:1: rule__Callback__DataAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Callback__DataAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4564:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4565:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4565:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4566:1: ruleEString
            {
             before(grammarAccess.getCallbackAccess().getDataEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Callback__DataAssignment_4_19024);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCallbackAccess().getDataEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Callback__DataAssignment_4_1"


    // $ANTLR start "rule__Permissions__NameAssignment_2"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4575:1: rule__Permissions__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Permissions__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4579:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4580:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4580:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4581:1: ruleEString
            {
             before(grammarAccess.getPermissionsAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Permissions__NameAssignment_29055);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPermissionsAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Permissions__NameAssignment_2"


    // $ANTLR start "rule__DoubleExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4611:1: rule__DoubleExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DoubleExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4615:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4616:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4616:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4617:1: ruleEString
            {
             before(grammarAccess.getDoubleExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DoubleExtra__NameAssignment_19107);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoubleExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DoubleExtra__NameAssignment_1"


    // $ANTLR start "rule__DoubleExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4626:1: rule__DoubleExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__DoubleExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4630:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4631:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4631:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4632:1: ruleEString
            {
             before(grammarAccess.getDoubleExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DoubleExtra__ValueAssignment_49138);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoubleExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DoubleExtra__ValueAssignment_4"


    // $ANTLR start "rule__IntExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4641:1: rule__IntExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IntExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4645:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4646:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4646:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4647:1: ruleEString
            {
             before(grammarAccess.getIntExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntExtra__NameAssignment_19169);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IntExtra__NameAssignment_1"


    // $ANTLR start "rule__IntExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4656:1: rule__IntExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__IntExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4660:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4661:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4661:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4662:1: ruleEString
            {
             before(grammarAccess.getIntExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__IntExtra__ValueAssignment_49200);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IntExtra__ValueAssignment_4"


    // $ANTLR start "rule__CharSequenceExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4671:1: rule__CharSequenceExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CharSequenceExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4675:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4676:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4676:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4677:1: ruleEString
            {
             before(grammarAccess.getCharSequenceExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CharSequenceExtra__NameAssignment_19231);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCharSequenceExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CharSequenceExtra__NameAssignment_1"


    // $ANTLR start "rule__CharSequenceExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4686:1: rule__CharSequenceExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__CharSequenceExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4690:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4691:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4691:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4692:1: ruleEString
            {
             before(grammarAccess.getCharSequenceExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CharSequenceExtra__ValueAssignment_49262);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCharSequenceExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CharSequenceExtra__ValueAssignment_4"


    // $ANTLR start "rule__CharExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4701:1: rule__CharExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CharExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4705:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4706:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4706:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4707:1: ruleEString
            {
             before(grammarAccess.getCharExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CharExtra__NameAssignment_19293);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCharExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CharExtra__NameAssignment_1"


    // $ANTLR start "rule__CharExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4716:1: rule__CharExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__CharExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4720:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4721:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4721:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4722:1: ruleEString
            {
             before(grammarAccess.getCharExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CharExtra__ValueAssignment_49324);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCharExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CharExtra__ValueAssignment_4"


    // $ANTLR start "rule__BundleExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4731:1: rule__BundleExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BundleExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4735:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4736:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4736:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4737:1: ruleEString
            {
             before(grammarAccess.getBundleExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BundleExtra__NameAssignment_19355);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBundleExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BundleExtra__NameAssignment_1"


    // $ANTLR start "rule__BundleExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4746:1: rule__BundleExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__BundleExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4750:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4751:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4751:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4752:1: ruleEString
            {
             before(grammarAccess.getBundleExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BundleExtra__ValueAssignment_49386);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBundleExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__BundleExtra__ValueAssignment_4"


    // $ANTLR start "rule__ParceableExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4761:1: rule__ParceableExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ParceableExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4765:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4766:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4766:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4767:1: ruleEString
            {
             before(grammarAccess.getParceableExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ParceableExtra__NameAssignment_19417);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParceableExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParceableExtra__NameAssignment_1"


    // $ANTLR start "rule__ParceableExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4776:1: rule__ParceableExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__ParceableExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4780:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4781:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4781:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4782:1: ruleEString
            {
             before(grammarAccess.getParceableExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ParceableExtra__ValueAssignment_49448);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParceableExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ParceableExtra__ValueAssignment_4"


    // $ANTLR start "rule__SerializableExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4791:1: rule__SerializableExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SerializableExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4795:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4796:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4796:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4797:1: ruleEString
            {
             before(grammarAccess.getSerializableExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SerializableExtra__NameAssignment_19479);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSerializableExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SerializableExtra__NameAssignment_1"


    // $ANTLR start "rule__SerializableExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4806:1: rule__SerializableExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__SerializableExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4810:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4811:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4811:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4812:1: ruleEString
            {
             before(grammarAccess.getSerializableExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SerializableExtra__ValueAssignment_49510);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSerializableExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SerializableExtra__ValueAssignment_4"


    // $ANTLR start "rule__FloatExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4821:1: rule__FloatExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FloatExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4825:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4826:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4826:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4827:1: ruleEString
            {
             before(grammarAccess.getFloatExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FloatExtra__NameAssignment_19541);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFloatExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FloatExtra__NameAssignment_1"


    // $ANTLR start "rule__FloatExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4836:1: rule__FloatExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__FloatExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4840:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4841:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4841:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4842:1: ruleEString
            {
             before(grammarAccess.getFloatExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FloatExtra__ValueAssignment_49572);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFloatExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FloatExtra__ValueAssignment_4"


    // $ANTLR start "rule__ByteExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4851:1: rule__ByteExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ByteExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4855:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4856:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4856:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4857:1: ruleEString
            {
             before(grammarAccess.getByteExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ByteExtra__NameAssignment_19603);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getByteExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ByteExtra__NameAssignment_1"


    // $ANTLR start "rule__ByteExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4866:1: rule__ByteExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__ByteExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4870:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4871:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4871:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4872:1: ruleEString
            {
             before(grammarAccess.getByteExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ByteExtra__ValueAssignment_49634);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getByteExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ByteExtra__ValueAssignment_4"


    // $ANTLR start "rule__LongExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4881:1: rule__LongExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__LongExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4885:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4886:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4886:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4887:1: ruleEString
            {
             before(grammarAccess.getLongExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LongExtra__NameAssignment_19665);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLongExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LongExtra__NameAssignment_1"


    // $ANTLR start "rule__LongExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4896:1: rule__LongExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__LongExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4900:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4901:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4901:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4902:1: ruleEString
            {
             before(grammarAccess.getLongExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LongExtra__ValueAssignment_49696);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLongExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LongExtra__ValueAssignment_4"


    // $ANTLR start "rule__StringExtra__NameAssignment_1"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4911:1: rule__StringExtra__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StringExtra__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4915:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4916:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4916:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4917:1: ruleEString
            {
             before(grammarAccess.getStringExtraAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringExtra__NameAssignment_19727);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringExtraAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringExtra__NameAssignment_1"


    // $ANTLR start "rule__StringExtra__ValueAssignment_4"
    // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4926:1: rule__StringExtra__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__StringExtra__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4930:1: ( ( ruleEString ) )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4931:1: ( ruleEString )
            {
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4931:1: ( ruleEString )
            // ../itu.dk.aamj.intentdsl.ui/src-gen/itu/dk/aamj/intentdsl/ui/contentassist/antlr/internal/InternalIntentDsl.g:4932:1: ruleEString
            {
             before(grammarAccess.getStringExtraAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__StringExtra__ValueAssignment_49758);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringExtraAccess().getValueEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__StringExtra__ValueAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIntent_Impl_in_entryRuleIntent_Impl61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntent_Impl68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__0_in_ruleIntent_Impl94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundle128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle__Alternatives_in_ruleBundle154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundle_Impl_in_entryRuleBundle_Impl241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundle_Impl248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__0_in_ruleBundle_Impl274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCallback_in_entryRuleCallback301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCallback308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group__0_in_ruleCallback334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePermissions_in_entryRulePermissions361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePermissions368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Permissions__Group__0_in_rulePermissions394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleExtra_in_entryRuleDoubleExtra425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoubleExtra432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__0_in_ruleDoubleExtra458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntExtra_in_entryRuleIntExtra485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntExtra492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__0_in_ruleIntExtra518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharSequenceExtra_in_entryRuleCharSequenceExtra545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharSequenceExtra552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__0_in_ruleCharSequenceExtra578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharExtra_in_entryRuleCharExtra605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharExtra612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__0_in_ruleCharExtra638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleExtra_in_entryRuleBundleExtra665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBundleExtra672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__0_in_ruleBundleExtra698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParceableExtra_in_entryRuleParceableExtra725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParceableExtra732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__0_in_ruleParceableExtra758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSerializableExtra_in_entryRuleSerializableExtra785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSerializableExtra792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__0_in_ruleSerializableExtra818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatExtra_in_entryRuleFloatExtra845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatExtra852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__0_in_ruleFloatExtra878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleByteExtra_in_entryRuleByteExtra905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleByteExtra912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__0_in_ruleByteExtra938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLongExtra_in_entryRuleLongExtra965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLongExtra972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__0_in_ruleLongExtra998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringExtra_in_entryRuleStringExtra1025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringExtra1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__0_in_ruleStringExtra1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundle_Impl_in_rule__Bundle__Alternatives1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleExtra_in_rule__Bundle__Alternatives1111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntExtra_in_rule__Bundle__Alternatives1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharSequenceExtra_in_rule__Bundle__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharExtra_in_rule__Bundle__Alternatives1162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundleExtra_in_rule__Bundle__Alternatives1179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParceableExtra_in_rule__Bundle__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSerializableExtra_in_rule__Bundle__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatExtra_in_rule__Bundle__Alternatives1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleByteExtra_in_rule__Bundle__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLongExtra_in_rule__Bundle__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringExtra_in_rule__Bundle__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__0__Impl_in_rule__Intent_Impl__Group__01360 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__1_in_rule__Intent_Impl__Group__01363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__1__Impl_in_rule__Intent_Impl__Group__11421 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__2_in_rule__Intent_Impl__Group__11424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Intent_Impl__Group__1__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__2__Impl_in_rule__Intent_Impl__Group__21483 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__3_in_rule__Intent_Impl__Group__21486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__NameAssignment_2_in_rule__Intent_Impl__Group__2__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__3__Impl_in_rule__Intent_Impl__Group__31543 = new BitSet(new long[]{0x00000000001BE000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__4_in_rule__Intent_Impl__Group__31546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Intent_Impl__Group__3__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__4__Impl_in_rule__Intent_Impl__Group__41605 = new BitSet(new long[]{0x00000000001BE000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__5_in_rule__Intent_Impl__Group__41608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_4__0_in_rule__Intent_Impl__Group__4__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__5__Impl_in_rule__Intent_Impl__Group__51666 = new BitSet(new long[]{0x00000000001BE000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__6_in_rule__Intent_Impl__Group__51669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_5__0_in_rule__Intent_Impl__Group__5__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__6__Impl_in_rule__Intent_Impl__Group__61727 = new BitSet(new long[]{0x00000000001BE000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__7_in_rule__Intent_Impl__Group__61730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_6__0_in_rule__Intent_Impl__Group__6__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__7__Impl_in_rule__Intent_Impl__Group__71788 = new BitSet(new long[]{0x00000000001BE000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__8_in_rule__Intent_Impl__Group__71791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__0_in_rule__Intent_Impl__Group__7__Impl1818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__8__Impl_in_rule__Intent_Impl__Group__81849 = new BitSet(new long[]{0x00000000001BE000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__9_in_rule__Intent_Impl__Group__81852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_8__0_in_rule__Intent_Impl__Group__8__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__9__Impl_in_rule__Intent_Impl__Group__91910 = new BitSet(new long[]{0x00000000001BE000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__10_in_rule__Intent_Impl__Group__91913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__0_in_rule__Intent_Impl__Group__9__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group__10__Impl_in_rule__Intent_Impl__Group__101971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Intent_Impl__Group__10__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_4__0__Impl_in_rule__Intent_Impl__Group_4__02052 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_4__1_in_rule__Intent_Impl__Group_4__02055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Intent_Impl__Group_4__0__Impl2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_4__1__Impl_in_rule__Intent_Impl__Group_4__12114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__TypeAssignment_4_1_in_rule__Intent_Impl__Group_4__1__Impl2141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_5__0__Impl_in_rule__Intent_Impl__Group_5__02175 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_5__1_in_rule__Intent_Impl__Group_5__02178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Intent_Impl__Group_5__0__Impl2206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_5__1__Impl_in_rule__Intent_Impl__Group_5__12237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__DataAssignment_5_1_in_rule__Intent_Impl__Group_5__1__Impl2264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_6__0__Impl_in_rule__Intent_Impl__Group_6__02298 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_6__1_in_rule__Intent_Impl__Group_6__02301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Intent_Impl__Group_6__0__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_6__1__Impl_in_rule__Intent_Impl__Group_6__12360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__ExceptionNameAssignment_6_1_in_rule__Intent_Impl__Group_6__1__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__0__Impl_in_rule__Intent_Impl__Group_7__02421 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__1_in_rule__Intent_Impl__Group_7__02424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Intent_Impl__Group_7__0__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__1__Impl_in_rule__Intent_Impl__Group_7__12483 = new BitSet(new long[]{0x0000000FFE200000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__2_in_rule__Intent_Impl__Group_7__12486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Intent_Impl__Group_7__1__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__2__Impl_in_rule__Intent_Impl__Group_7__22545 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__3_in_rule__Intent_Impl__Group_7__22548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__ExtrasAssignment_7_2_in_rule__Intent_Impl__Group_7__2__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__3__Impl_in_rule__Intent_Impl__Group_7__32605 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__4_in_rule__Intent_Impl__Group_7__32608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7_3__0_in_rule__Intent_Impl__Group_7__3__Impl2635 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7__4__Impl_in_rule__Intent_Impl__Group_7__42666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Intent_Impl__Group_7__4__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7_3__0__Impl_in_rule__Intent_Impl__Group_7_3__02735 = new BitSet(new long[]{0x0000000FFE200000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7_3__1_in_rule__Intent_Impl__Group_7_3__02738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Intent_Impl__Group_7_3__0__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_7_3__1__Impl_in_rule__Intent_Impl__Group_7_3__12797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__ExtrasAssignment_7_3_1_in_rule__Intent_Impl__Group_7_3__1__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_8__0__Impl_in_rule__Intent_Impl__Group_8__02858 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_8__1_in_rule__Intent_Impl__Group_8__02861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Intent_Impl__Group_8__0__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_8__1__Impl_in_rule__Intent_Impl__Group_8__12920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__SucessCallbackAssignment_8_1_in_rule__Intent_Impl__Group_8__1__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__0__Impl_in_rule__Intent_Impl__Group_9__02981 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__1_in_rule__Intent_Impl__Group_9__02984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Intent_Impl__Group_9__0__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__1__Impl_in_rule__Intent_Impl__Group_9__13043 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__2_in_rule__Intent_Impl__Group_9__13046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Intent_Impl__Group_9__1__Impl3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__2__Impl_in_rule__Intent_Impl__Group_9__23105 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__3_in_rule__Intent_Impl__Group_9__23108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__PermissionsAssignment_9_2_in_rule__Intent_Impl__Group_9__2__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__3__Impl_in_rule__Intent_Impl__Group_9__33165 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__4_in_rule__Intent_Impl__Group_9__33168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9_3__0_in_rule__Intent_Impl__Group_9__3__Impl3195 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9__4__Impl_in_rule__Intent_Impl__Group_9__43226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Intent_Impl__Group_9__4__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9_3__0__Impl_in_rule__Intent_Impl__Group_9_3__03295 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9_3__1_in_rule__Intent_Impl__Group_9_3__03298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Intent_Impl__Group_9_3__0__Impl3326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__Group_9_3__1__Impl_in_rule__Intent_Impl__Group_9_3__13357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Intent_Impl__PermissionsAssignment_9_3_1_in_rule__Intent_Impl__Group_9_3__1__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__0__Impl_in_rule__Bundle_Impl__Group__03418 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__1_in_rule__Bundle_Impl__Group__03421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Bundle_Impl__Group__0__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__1__Impl_in_rule__Bundle_Impl__Group__13480 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__2_in_rule__Bundle_Impl__Group__13483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__NameAssignment_1_in_rule__Bundle_Impl__Group__1__Impl3510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__2__Impl_in_rule__Bundle_Impl__Group__23540 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__3_in_rule__Bundle_Impl__Group__23543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Bundle_Impl__Group__2__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__3__Impl_in_rule__Bundle_Impl__Group__33602 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__4_in_rule__Bundle_Impl__Group__33605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Bundle_Impl__Group__3__Impl3633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__4__Impl_in_rule__Bundle_Impl__Group__43664 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__5_in_rule__Bundle_Impl__Group__43667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__ValueAssignment_4_in_rule__Bundle_Impl__Group__4__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Bundle_Impl__Group__5__Impl_in_rule__Bundle_Impl__Group__53724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Bundle_Impl__Group__5__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group__0__Impl_in_rule__Callback__Group__03795 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Callback__Group__1_in_rule__Callback__Group__03798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group__1__Impl_in_rule__Callback__Group__13856 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Callback__Group__2_in_rule__Callback__Group__13859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Callback__Group__1__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group__2__Impl_in_rule__Callback__Group__23918 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Callback__Group__3_in_rule__Callback__Group__23921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__NameAssignment_2_in_rule__Callback__Group__2__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group__3__Impl_in_rule__Callback__Group__33978 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Callback__Group__4_in_rule__Callback__Group__33981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Callback__Group__3__Impl4009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group__4__Impl_in_rule__Callback__Group__44040 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Callback__Group__5_in_rule__Callback__Group__44043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group_4__0_in_rule__Callback__Group__4__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group__5__Impl_in_rule__Callback__Group__54101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Callback__Group__5__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group_4__0__Impl_in_rule__Callback__Group_4__04172 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Callback__Group_4__1_in_rule__Callback__Group_4__04175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Callback__Group_4__0__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__Group_4__1__Impl_in_rule__Callback__Group_4__14234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Callback__DataAssignment_4_1_in_rule__Callback__Group_4__1__Impl4261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Permissions__Group__0__Impl_in_rule__Permissions__Group__04295 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Permissions__Group__1_in_rule__Permissions__Group__04298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Permissions__Group__1__Impl_in_rule__Permissions__Group__14356 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Permissions__Group__2_in_rule__Permissions__Group__14359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Permissions__Group__1__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Permissions__Group__2__Impl_in_rule__Permissions__Group__24418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Permissions__NameAssignment_2_in_rule__Permissions__Group__2__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__0__Impl_in_rule__DoubleExtra__Group__04500 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__1_in_rule__DoubleExtra__Group__04503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__DoubleExtra__Group__0__Impl4531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__1__Impl_in_rule__DoubleExtra__Group__14562 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__2_in_rule__DoubleExtra__Group__14565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleExtra__NameAssignment_1_in_rule__DoubleExtra__Group__1__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__2__Impl_in_rule__DoubleExtra__Group__24622 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__3_in_rule__DoubleExtra__Group__24625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__DoubleExtra__Group__2__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__3__Impl_in_rule__DoubleExtra__Group__34684 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__4_in_rule__DoubleExtra__Group__34687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DoubleExtra__Group__3__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__4__Impl_in_rule__DoubleExtra__Group__44746 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__5_in_rule__DoubleExtra__Group__44749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleExtra__ValueAssignment_4_in_rule__DoubleExtra__Group__4__Impl4776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DoubleExtra__Group__5__Impl_in_rule__DoubleExtra__Group__54806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__DoubleExtra__Group__5__Impl4834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__0__Impl_in_rule__IntExtra__Group__04877 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__1_in_rule__IntExtra__Group__04880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__IntExtra__Group__0__Impl4908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__1__Impl_in_rule__IntExtra__Group__14939 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__2_in_rule__IntExtra__Group__14942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntExtra__NameAssignment_1_in_rule__IntExtra__Group__1__Impl4969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__2__Impl_in_rule__IntExtra__Group__24999 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__3_in_rule__IntExtra__Group__25002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__IntExtra__Group__2__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__3__Impl_in_rule__IntExtra__Group__35061 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__4_in_rule__IntExtra__Group__35064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__IntExtra__Group__3__Impl5092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__4__Impl_in_rule__IntExtra__Group__45123 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__5_in_rule__IntExtra__Group__45126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntExtra__ValueAssignment_4_in_rule__IntExtra__Group__4__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntExtra__Group__5__Impl_in_rule__IntExtra__Group__55183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__IntExtra__Group__5__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__0__Impl_in_rule__CharSequenceExtra__Group__05254 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__1_in_rule__CharSequenceExtra__Group__05257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CharSequenceExtra__Group__0__Impl5285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__1__Impl_in_rule__CharSequenceExtra__Group__15316 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__2_in_rule__CharSequenceExtra__Group__15319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__NameAssignment_1_in_rule__CharSequenceExtra__Group__1__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__2__Impl_in_rule__CharSequenceExtra__Group__25376 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__3_in_rule__CharSequenceExtra__Group__25379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__CharSequenceExtra__Group__2__Impl5407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__3__Impl_in_rule__CharSequenceExtra__Group__35438 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__4_in_rule__CharSequenceExtra__Group__35441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CharSequenceExtra__Group__3__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__4__Impl_in_rule__CharSequenceExtra__Group__45500 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__5_in_rule__CharSequenceExtra__Group__45503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__ValueAssignment_4_in_rule__CharSequenceExtra__Group__4__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharSequenceExtra__Group__5__Impl_in_rule__CharSequenceExtra__Group__55560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__CharSequenceExtra__Group__5__Impl5588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__0__Impl_in_rule__CharExtra__Group__05631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__1_in_rule__CharExtra__Group__05634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CharExtra__Group__0__Impl5662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__1__Impl_in_rule__CharExtra__Group__15693 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__2_in_rule__CharExtra__Group__15696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharExtra__NameAssignment_1_in_rule__CharExtra__Group__1__Impl5723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__2__Impl_in_rule__CharExtra__Group__25753 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__3_in_rule__CharExtra__Group__25756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__CharExtra__Group__2__Impl5784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__3__Impl_in_rule__CharExtra__Group__35815 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__4_in_rule__CharExtra__Group__35818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__CharExtra__Group__3__Impl5846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__4__Impl_in_rule__CharExtra__Group__45877 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__5_in_rule__CharExtra__Group__45880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharExtra__ValueAssignment_4_in_rule__CharExtra__Group__4__Impl5907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CharExtra__Group__5__Impl_in_rule__CharExtra__Group__55937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__CharExtra__Group__5__Impl5965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__0__Impl_in_rule__BundleExtra__Group__06008 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__1_in_rule__BundleExtra__Group__06011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__BundleExtra__Group__0__Impl6039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__1__Impl_in_rule__BundleExtra__Group__16070 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__2_in_rule__BundleExtra__Group__16073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BundleExtra__NameAssignment_1_in_rule__BundleExtra__Group__1__Impl6100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__2__Impl_in_rule__BundleExtra__Group__26130 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__3_in_rule__BundleExtra__Group__26133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BundleExtra__Group__2__Impl6161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__3__Impl_in_rule__BundleExtra__Group__36192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__4_in_rule__BundleExtra__Group__36195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BundleExtra__Group__3__Impl6223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__4__Impl_in_rule__BundleExtra__Group__46254 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__5_in_rule__BundleExtra__Group__46257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BundleExtra__ValueAssignment_4_in_rule__BundleExtra__Group__4__Impl6284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BundleExtra__Group__5__Impl_in_rule__BundleExtra__Group__56314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BundleExtra__Group__5__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__0__Impl_in_rule__ParceableExtra__Group__06385 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__1_in_rule__ParceableExtra__Group__06388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__ParceableExtra__Group__0__Impl6416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__1__Impl_in_rule__ParceableExtra__Group__16447 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__2_in_rule__ParceableExtra__Group__16450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParceableExtra__NameAssignment_1_in_rule__ParceableExtra__Group__1__Impl6477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__2__Impl_in_rule__ParceableExtra__Group__26507 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__3_in_rule__ParceableExtra__Group__26510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ParceableExtra__Group__2__Impl6538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__3__Impl_in_rule__ParceableExtra__Group__36569 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__4_in_rule__ParceableExtra__Group__36572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ParceableExtra__Group__3__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__4__Impl_in_rule__ParceableExtra__Group__46631 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__5_in_rule__ParceableExtra__Group__46634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParceableExtra__ValueAssignment_4_in_rule__ParceableExtra__Group__4__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ParceableExtra__Group__5__Impl_in_rule__ParceableExtra__Group__56691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ParceableExtra__Group__5__Impl6719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__0__Impl_in_rule__SerializableExtra__Group__06762 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__1_in_rule__SerializableExtra__Group__06765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SerializableExtra__Group__0__Impl6793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__1__Impl_in_rule__SerializableExtra__Group__16824 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__2_in_rule__SerializableExtra__Group__16827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SerializableExtra__NameAssignment_1_in_rule__SerializableExtra__Group__1__Impl6854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__2__Impl_in_rule__SerializableExtra__Group__26884 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__3_in_rule__SerializableExtra__Group__26887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__SerializableExtra__Group__2__Impl6915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__3__Impl_in_rule__SerializableExtra__Group__36946 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__4_in_rule__SerializableExtra__Group__36949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SerializableExtra__Group__3__Impl6977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__4__Impl_in_rule__SerializableExtra__Group__47008 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__5_in_rule__SerializableExtra__Group__47011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SerializableExtra__ValueAssignment_4_in_rule__SerializableExtra__Group__4__Impl7038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SerializableExtra__Group__5__Impl_in_rule__SerializableExtra__Group__57068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__SerializableExtra__Group__5__Impl7096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__0__Impl_in_rule__FloatExtra__Group__07139 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__1_in_rule__FloatExtra__Group__07142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__FloatExtra__Group__0__Impl7170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__1__Impl_in_rule__FloatExtra__Group__17201 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__2_in_rule__FloatExtra__Group__17204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatExtra__NameAssignment_1_in_rule__FloatExtra__Group__1__Impl7231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__2__Impl_in_rule__FloatExtra__Group__27261 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__3_in_rule__FloatExtra__Group__27264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FloatExtra__Group__2__Impl7292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__3__Impl_in_rule__FloatExtra__Group__37323 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__4_in_rule__FloatExtra__Group__37326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__FloatExtra__Group__3__Impl7354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__4__Impl_in_rule__FloatExtra__Group__47385 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__5_in_rule__FloatExtra__Group__47388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatExtra__ValueAssignment_4_in_rule__FloatExtra__Group__4__Impl7415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FloatExtra__Group__5__Impl_in_rule__FloatExtra__Group__57445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FloatExtra__Group__5__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__0__Impl_in_rule__ByteExtra__Group__07516 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__1_in_rule__ByteExtra__Group__07519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ByteExtra__Group__0__Impl7547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__1__Impl_in_rule__ByteExtra__Group__17578 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__2_in_rule__ByteExtra__Group__17581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ByteExtra__NameAssignment_1_in_rule__ByteExtra__Group__1__Impl7608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__2__Impl_in_rule__ByteExtra__Group__27638 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__3_in_rule__ByteExtra__Group__27641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ByteExtra__Group__2__Impl7669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__3__Impl_in_rule__ByteExtra__Group__37700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__4_in_rule__ByteExtra__Group__37703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ByteExtra__Group__3__Impl7731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__4__Impl_in_rule__ByteExtra__Group__47762 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__5_in_rule__ByteExtra__Group__47765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ByteExtra__ValueAssignment_4_in_rule__ByteExtra__Group__4__Impl7792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ByteExtra__Group__5__Impl_in_rule__ByteExtra__Group__57822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ByteExtra__Group__5__Impl7850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__0__Impl_in_rule__LongExtra__Group__07893 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__1_in_rule__LongExtra__Group__07896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__LongExtra__Group__0__Impl7924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__1__Impl_in_rule__LongExtra__Group__17955 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__2_in_rule__LongExtra__Group__17958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LongExtra__NameAssignment_1_in_rule__LongExtra__Group__1__Impl7985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__2__Impl_in_rule__LongExtra__Group__28015 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__3_in_rule__LongExtra__Group__28018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__LongExtra__Group__2__Impl8046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__3__Impl_in_rule__LongExtra__Group__38077 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__4_in_rule__LongExtra__Group__38080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__LongExtra__Group__3__Impl8108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__4__Impl_in_rule__LongExtra__Group__48139 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__5_in_rule__LongExtra__Group__48142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LongExtra__ValueAssignment_4_in_rule__LongExtra__Group__4__Impl8169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LongExtra__Group__5__Impl_in_rule__LongExtra__Group__58199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__LongExtra__Group__5__Impl8227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__0__Impl_in_rule__StringExtra__Group__08270 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__1_in_rule__StringExtra__Group__08273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__StringExtra__Group__0__Impl8301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__1__Impl_in_rule__StringExtra__Group__18332 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__2_in_rule__StringExtra__Group__18335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringExtra__NameAssignment_1_in_rule__StringExtra__Group__1__Impl8362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__2__Impl_in_rule__StringExtra__Group__28392 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__3_in_rule__StringExtra__Group__28395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__StringExtra__Group__2__Impl8423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__3__Impl_in_rule__StringExtra__Group__38454 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__4_in_rule__StringExtra__Group__38457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__StringExtra__Group__3__Impl8485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__4__Impl_in_rule__StringExtra__Group__48516 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__5_in_rule__StringExtra__Group__48519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringExtra__ValueAssignment_4_in_rule__StringExtra__Group__4__Impl8546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringExtra__Group__5__Impl_in_rule__StringExtra__Group__58576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__StringExtra__Group__5__Impl8604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent_Impl__NameAssignment_28652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent_Impl__TypeAssignment_4_18683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent_Impl__DataAssignment_5_18714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Intent_Impl__ExceptionNameAssignment_6_18745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundle_in_rule__Intent_Impl__ExtrasAssignment_7_28776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBundle_in_rule__Intent_Impl__ExtrasAssignment_7_3_18807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCallback_in_rule__Intent_Impl__SucessCallbackAssignment_8_18838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePermissions_in_rule__Intent_Impl__PermissionsAssignment_9_28869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePermissions_in_rule__Intent_Impl__PermissionsAssignment_9_3_18900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Bundle_Impl__NameAssignment_18931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Bundle_Impl__ValueAssignment_48962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Callback__NameAssignment_28993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Callback__DataAssignment_4_19024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Permissions__NameAssignment_29055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DoubleExtra__NameAssignment_19107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DoubleExtra__ValueAssignment_49138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntExtra__NameAssignment_19169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__IntExtra__ValueAssignment_49200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CharSequenceExtra__NameAssignment_19231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CharSequenceExtra__ValueAssignment_49262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CharExtra__NameAssignment_19293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CharExtra__ValueAssignment_49324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BundleExtra__NameAssignment_19355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BundleExtra__ValueAssignment_49386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ParceableExtra__NameAssignment_19417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ParceableExtra__ValueAssignment_49448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SerializableExtra__NameAssignment_19479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SerializableExtra__ValueAssignment_49510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FloatExtra__NameAssignment_19541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FloatExtra__ValueAssignment_49572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ByteExtra__NameAssignment_19603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ByteExtra__ValueAssignment_49634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LongExtra__NameAssignment_19665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LongExtra__ValueAssignment_49696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringExtra__NameAssignment_19727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__StringExtra__ValueAssignment_49758 = new BitSet(new long[]{0x0000000000000002L});
    }


}