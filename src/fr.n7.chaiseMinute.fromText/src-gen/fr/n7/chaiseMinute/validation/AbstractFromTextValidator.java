/*
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractFromTextValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://chaiseMinute"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://algorithm"));
		return result;
	}
}