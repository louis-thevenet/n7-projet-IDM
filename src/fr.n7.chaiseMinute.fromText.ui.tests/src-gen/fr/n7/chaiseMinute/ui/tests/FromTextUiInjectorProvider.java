/*
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.ui.tests;

import com.google.inject.Injector;
import fr.n7.chaiseMinute.fromText.ui.internal.FromTextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class FromTextUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FromTextActivator.getInstance().getInjector("fr.n7.chaiseMinute.FromText");
	}

}
