/*
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.tabouretSeconde.tests

import com.google.inject.Inject
import fr.n7.chaiseMinute.tabouretSeconde.tabouretSeconde.ChaiseMinute
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(TabouretSecondeInjectorProvider)
class TabouretSecondeParsingTest {
	@Inject
	ParseHelper<ChaiseMinute> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}