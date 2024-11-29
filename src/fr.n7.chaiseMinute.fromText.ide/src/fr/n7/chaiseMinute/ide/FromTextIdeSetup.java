/*
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.chaiseMinute.FromTextRuntimeModule;
import fr.n7.chaiseMinute.FromTextStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class FromTextIdeSetup extends FromTextStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new FromTextRuntimeModule(), new FromTextIdeModule()));
	}
	
}