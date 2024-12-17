/**
 */
package calculusv2.tests;

import calculusv2.Calculusv2Factory;
import calculusv2.Reciprocal;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reciprocal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReciprocalTest extends TestCase {

	/**
	 * The fixture for this Reciprocal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reciprocal fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReciprocalTest.class);
	}

	/**
	 * Constructs a new Reciprocal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReciprocalTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reciprocal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Reciprocal fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reciprocal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reciprocal getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Calculusv2Factory.eINSTANCE.createReciprocal());
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

} //ReciprocalTest
