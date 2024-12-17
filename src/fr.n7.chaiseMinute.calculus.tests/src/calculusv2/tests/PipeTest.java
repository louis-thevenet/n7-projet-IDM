/**
 */
package calculusv2.tests;

import calculusv2.Calculusv2Factory;
import calculusv2.Pipe;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PipeTest extends TestCase {

	/**
	 * The fixture for this Pipe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pipe fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PipeTest.class);
	}

	/**
	 * Constructs a new Pipe test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pipe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Pipe fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pipe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pipe getFixture() {
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
		setFixture(Calculusv2Factory.eINSTANCE.createPipe());
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

} //PipeTest
