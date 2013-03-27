
package itu.dk.aamj.intentdsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class IntentDslStandaloneSetup extends IntentDslStandaloneSetupGenerated{

	public static void doSetup() {
		new IntentDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

