/**
 */
package calculusv2.impl;

import calculusv2.BinaryOperation;
import calculusv2.Calculus;
import calculusv2.CalculusElement;
import calculusv2.Calculusv2Factory;
import calculusv2.Calculusv2Package;
import calculusv2.Constante;
import calculusv2.Division;
import calculusv2.FinalExpression;
import calculusv2.InputArgs;
import calculusv2.Operation;
import calculusv2.Pipe;
import calculusv2.PipeFinal;
import calculusv2.Products;
import calculusv2.Result;
import calculusv2.Substraction;
import calculusv2.Sum;
import calculusv2.UnaryOperation;
import calculusv2.UsableExpression;

import org.eclipse.emf.ecore.EAttribute;
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
public class Calculusv2PackageImpl extends EPackageImpl implements Calculusv2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculusElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usableExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputArgsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipeFinalEClass = null;

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
	 * @see calculusv2.Calculusv2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Calculusv2PackageImpl() {
		super(eNS_URI, Calculusv2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Calculusv2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Calculusv2Package init() {
		if (isInited) return (Calculusv2Package)EPackage.Registry.INSTANCE.getEPackage(Calculusv2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredCalculusv2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Calculusv2PackageImpl theCalculusv2Package = registeredCalculusv2Package instanceof Calculusv2PackageImpl ? (Calculusv2PackageImpl)registeredCalculusv2Package : new Calculusv2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCalculusv2Package.createPackageContents();

		// Initialize created meta-data
		theCalculusv2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCalculusv2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Calculusv2Package.eNS_URI, theCalculusv2Package);
		return theCalculusv2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculus() {
		return calculusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculus_Elements() {
		return (EReference)calculusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalculus_Name() {
		return (EAttribute)calculusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculusElement() {
		return calculusElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculusElement_Calculus() {
		return (EReference)calculusElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCalculusElement_Name() {
		return (EAttribute)calculusElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsableExpression() {
		return usableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsableExpression_UsedBy() {
		return (EReference)usableExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalExpression() {
		return finalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputArgs() {
		return inputArgsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryOperation() {
		return unaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryOperation_Before() {
		return (EReference)unaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryOperation() {
		return binaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryOperation_BeforeFirst() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryOperation_BeforeSecond() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSum() {
		return sumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProducts() {
		return productsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstraction() {
		return substractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstante() {
		return constanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPipe() {
		return pipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipe_Source() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipe_Target() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPipeFinal() {
		return pipeFinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeFinal_Source() {
		return (EReference)pipeFinalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeFinal_Target() {
		return (EReference)pipeFinalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calculusv2Factory getCalculusv2Factory() {
		return (Calculusv2Factory)getEFactoryInstance();
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
		calculusEClass = createEClass(CALCULUS);
		createEReference(calculusEClass, CALCULUS__ELEMENTS);
		createEAttribute(calculusEClass, CALCULUS__NAME);

		calculusElementEClass = createEClass(CALCULUS_ELEMENT);
		createEReference(calculusElementEClass, CALCULUS_ELEMENT__CALCULUS);
		createEAttribute(calculusElementEClass, CALCULUS_ELEMENT__NAME);

		usableExpressionEClass = createEClass(USABLE_EXPRESSION);
		createEReference(usableExpressionEClass, USABLE_EXPRESSION__USED_BY);

		finalExpressionEClass = createEClass(FINAL_EXPRESSION);

		inputArgsEClass = createEClass(INPUT_ARGS);

		operationEClass = createEClass(OPERATION);

		unaryOperationEClass = createEClass(UNARY_OPERATION);
		createEReference(unaryOperationEClass, UNARY_OPERATION__BEFORE);

		binaryOperationEClass = createEClass(BINARY_OPERATION);
		createEReference(binaryOperationEClass, BINARY_OPERATION__BEFORE_FIRST);
		createEReference(binaryOperationEClass, BINARY_OPERATION__BEFORE_SECOND);

		sumEClass = createEClass(SUM);

		productsEClass = createEClass(PRODUCTS);

		substractionEClass = createEClass(SUBSTRACTION);

		divisionEClass = createEClass(DIVISION);

		constanteEClass = createEClass(CONSTANTE);

		resultEClass = createEClass(RESULT);

		pipeEClass = createEClass(PIPE);
		createEReference(pipeEClass, PIPE__SOURCE);
		createEReference(pipeEClass, PIPE__TARGET);

		pipeFinalEClass = createEClass(PIPE_FINAL);
		createEReference(pipeFinalEClass, PIPE_FINAL__SOURCE);
		createEReference(pipeFinalEClass, PIPE_FINAL__TARGET);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		usableExpressionEClass.getESuperTypes().add(this.getCalculusElement());
		finalExpressionEClass.getESuperTypes().add(this.getCalculusElement());
		inputArgsEClass.getESuperTypes().add(this.getUsableExpression());
		operationEClass.getESuperTypes().add(this.getUsableExpression());
		unaryOperationEClass.getESuperTypes().add(this.getOperation());
		binaryOperationEClass.getESuperTypes().add(this.getOperation());
		sumEClass.getESuperTypes().add(this.getBinaryOperation());
		productsEClass.getESuperTypes().add(this.getBinaryOperation());
		substractionEClass.getESuperTypes().add(this.getBinaryOperation());
		divisionEClass.getESuperTypes().add(this.getBinaryOperation());
		constanteEClass.getESuperTypes().add(this.getUsableExpression());
		resultEClass.getESuperTypes().add(this.getFinalExpression());
		pipeEClass.getESuperTypes().add(this.getCalculusElement());
		pipeFinalEClass.getESuperTypes().add(this.getCalculusElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(calculusEClass, Calculus.class, "Calculus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculus_Elements(), this.getCalculusElement(), this.getCalculusElement_Calculus(), "elements", null, 0, -1, Calculus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculus_Name(), ecorePackage.getEString(), "name", null, 1, 1, Calculus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculusElementEClass, CalculusElement.class, "CalculusElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculusElement_Calculus(), this.getCalculus(), this.getCalculus_Elements(), "calculus", null, 1, 1, CalculusElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculusElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, CalculusElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usableExpressionEClass, UsableExpression.class, "UsableExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsableExpression_UsedBy(), this.getPipe(), this.getPipe_Source(), "usedBy", null, 0, -1, UsableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalExpressionEClass, FinalExpression.class, "FinalExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputArgsEClass, InputArgs.class, "InputArgs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryOperationEClass, UnaryOperation.class, "UnaryOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOperation_Before(), this.getUsableExpression(), null, "before", null, 1, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryOperationEClass, BinaryOperation.class, "BinaryOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperation_BeforeFirst(), this.getPipe(), null, "beforeFirst", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperation_BeforeSecond(), this.getPipe(), null, "beforeSecond", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sumEClass, Sum.class, "Sum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productsEClass, Products.class, "Products", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(substractionEClass, Substraction.class, "Substraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pipeEClass, Pipe.class, "Pipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipe_Source(), this.getUsableExpression(), this.getUsableExpression_UsedBy(), "source", null, 1, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipe_Target(), this.getOperation(), null, "target", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipeFinalEClass, PipeFinal.class, "PipeFinal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeFinal_Source(), this.getUsableExpression(), null, "source", null, 1, 1, PipeFinal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeFinal_Target(), this.getFinalExpression(), null, "target", null, 1, 1, PipeFinal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Calculusv2PackageImpl
