/**
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.tabouretSeconde.tabouretSeconde.tests;

import fr.n7.chaiseMinute.tabouretSeconde.tabouretSeconde.ComputedColumn;
import fr.n7.chaiseMinute.tabouretSeconde.tabouretSeconde.TabouretSecondeFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Computed Column</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputedColumnTest extends ColumnTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComputedColumnTest.class);
	}

	/**
	 * Constructs a new Computed Column test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputedColumnTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Computed Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComputedColumn getFixture() {
		return (ComputedColumn)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TabouretSecondeFactory.eINSTANCE.createComputedColumn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ComputedColumnTest
