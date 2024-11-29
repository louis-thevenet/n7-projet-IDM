/**
 */
package algorithm.impl;

import algorithm.Algorithm;
import algorithm.AlgorithmFactory;
import algorithm.AlgorithmPackage;

import function.FunctionPackage;

import function.impl.FunctionPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgorithmPackageImpl extends EPackageImpl implements AlgorithmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see algorithm.AlgorithmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgorithmPackageImpl() {
		super(eNS_URI, AlgorithmFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AlgorithmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgorithmPackage init() {
		if (isInited) return (AlgorithmPackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlgorithmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlgorithmPackageImpl theAlgorithmPackage = registeredAlgorithmPackage instanceof AlgorithmPackageImpl ? (AlgorithmPackageImpl)registeredAlgorithmPackage : new AlgorithmPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);
		FunctionPackageImpl theFunctionPackage = (FunctionPackageImpl)(registeredPackage instanceof FunctionPackageImpl ? registeredPackage : FunctionPackage.eINSTANCE);

		// Create package meta-data objects
		theAlgorithmPackage.createPackageContents();
		theFunctionPackage.createPackageContents();

		// Initialize created meta-data
		theAlgorithmPackage.initializePackageContents();
		theFunctionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgorithmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgorithmPackage.eNS_URI, theAlgorithmPackage);
		return theAlgorithmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgorithm_Functions() {
		return (EReference)algorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmFactory getAlgorithmFactory() {
		return (AlgorithmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		algorithmEClass = createEClass(ALGORITHM);
		createEReference(algorithmEClass, ALGORITHM__FUNCTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FunctionPackage theFunctionPackage = (FunctionPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(algorithmEClass, Algorithm.class, "Algorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgorithm_Functions(), theFunctionPackage.getFunction(), null, "functions", null, 0, -1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AlgorithmPackageImpl
