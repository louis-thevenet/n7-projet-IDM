/*
 * generated by Xtext 2.32.0
 */
package fr.n7;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CHAISEMINUTETEXTStandaloneSetup extends CHAISEMINUTETEXTStandaloneSetupGenerated {

	public static void doSetup() {
		new CHAISEMINUTETEXTStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
