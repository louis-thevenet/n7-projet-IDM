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
import calculusv2.Oppose;
import calculusv2.Pipe;
import calculusv2.PipeFinal;
import calculusv2.PipeSuper;
import calculusv2.Products;
import calculusv2.Reciprocal;
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
	private EClass opposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reciprocalEClass = null;

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
	private EClass pipeSuperEClass = null;

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
	public EReference getFinalExpression_Before() {
		return (EReference)finalExpressionEClass.getEStructuralFeatures().get(0);
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
	public EReference getOperation_Before() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
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
	public EClass getOppose() {
		return opposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReciprocal() {
		return reciprocalEClass;
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
	public EReference getBinaryOperation_BeforeSecond() {
		return (EReference)binaryOperationEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getConstante_Value() {
		return (EAttribute)constanteEClass.getEStructuralFeatures().get(0);
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
	public EClass getPipeSuper() {
		return pipeSuperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPipeSuper_SourcePipe() {
		return (EReference)pipeSuperEClass.getEStructuralFeatures().get(0);
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
	public EReference getPipe_TargetPipe() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(0);
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
	public EReference getPipeFinal_TargetPipeFinal() {
		return (EReference)pipeFinalEClass.getEStructuralFeatures().get(0);
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

		calculusElementEClass = createEClass(CALCULUS_ELEMENT);
		createEReference(calculusElementEClass, CALCULUS_ELEMENT__CALCULUS);
		createEAttribute(calculusElementEClass, CALCULUS_ELEMENT__NAME);

		usableExpressionEClass = createEClass(USABLE_EXPRESSION);
		createEReference(usableExpressionEClass, USABLE_EXPRESSION__USED_BY);

		finalExpressionEClass = createEClass(FINAL_EXPRESSION);
		createEReference(finalExpressionEClass, FINAL_EXPRESSION__BEFORE);

		inputArgsEClass = createEClass(INPUT_ARGS);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__BEFORE);

		unaryOperationEClass = createEClass(UNARY_OPERATION);

		opposeEClass = createEClass(OPPOSE);

		reciprocalEClass = createEClass(RECIPROCAL);

		binaryOperationEClass = createEClass(BINARY_OPERATION);
		createEReference(binaryOperationEClass, BINARY_OPERATION__BEFORE_SECOND);

		sumEClass = createEClass(SUM);

		productsEClass = createEClass(PRODUCTS);

		substractionEClass = createEClass(SUBSTRACTION);

		divisionEClass = createEClass(DIVISION);

		constanteEClass = createEClass(CONSTANTE);
		createEAttribute(constanteEClass, CONSTANTE__VALUE);

		resultEClass = createEClass(RESULT);

		pipeSuperEClass = createEClass(PIPE_SUPER);
		createEReference(pipeSuperEClass, PIPE_SUPER__SOURCE_PIPE);

		pipeEClass = createEClass(PIPE);
		createEReference(pipeEClass, PIPE__TARGET_PIPE);

		pipeFinalEClass = createEClass(PIPE_FINAL);
		createEReference(pipeFinalEClass, PIPE_FINAL__TARGET_PIPE_FINAL);
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
		opposeEClass.getESuperTypes().add(this.getUnaryOperation());
		reciprocalEClass.getESuperTypes().add(this.getUnaryOperation());
		binaryOperationEClass.getESuperTypes().add(this.getOperation());
		sumEClass.getESuperTypes().add(this.getBinaryOperation());
		productsEClass.getESuperTypes().add(this.getBinaryOperation());
		substractionEClass.getESuperTypes().add(this.getBinaryOperation());
		divisionEClass.getESuperTypes().add(this.getBinaryOperation());
		constanteEClass.getESuperTypes().add(this.getUsableExpression());
		resultEClass.getESuperTypes().add(this.getFinalExpression());
		pipeSuperEClass.getESuperTypes().add(this.getCalculusElement());
		pipeEClass.getESuperTypes().add(this.getPipeSuper());
		pipeFinalEClass.getESuperTypes().add(this.getPipeSuper());

		// Initialize classes, features, and operations; add parameters
		initEClass(calculusEClass, Calculus.class, "Calculus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculus_Elements(), this.getCalculusElement(), this.getCalculusElement_Calculus(), "elements", null, 0, -1, Calculus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculusElementEClass, CalculusElement.class, "CalculusElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculusElement_Calculus(), this.getCalculus(), this.getCalculus_Elements(), "calculus", null, 1, 1, CalculusElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalculusElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, CalculusElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usableExpressionEClass, UsableExpression.class, "UsableExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsableExpression_UsedBy(), this.getPipeSuper(), this.getPipeSuper_SourcePipe(), "usedBy", null, 0, -1, UsableExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalExpressionEClass, FinalExpression.class, "FinalExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalExpression_Before(), this.getPipeFinal(), this.getPipeFinal_TargetPipeFinal(), "before", null, 1, 1, FinalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputArgsEClass, InputArgs.class, "InputArgs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Before(), this.getPipe(), null, "before", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryOperationEClass, UnaryOperation.class, "UnaryOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opposeEClass, Oppose.class, "Oppose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reciprocalEClass, Reciprocal.class, "Reciprocal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOperationEClass, BinaryOperation.class, "BinaryOperation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperation_BeforeSecond(), this.getPipe(), null, "beforeSecond", null, 1, 1, BinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sumEClass, Sum.class, "Sum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productsEClass, Products.class, "Products", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(substractionEClass, Substraction.class, "Substraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionEClass, Division.class, "Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constanteEClass, Constante.class, "Constante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstante_Value(), ecorePackage.getEFloat(), "value", null, 1, 1, Constante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pipeSuperEClass, PipeSuper.class, "PipeSuper", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeSuper_SourcePipe(), this.getUsableExpression(), this.getUsableExpression_UsedBy(), "sourcePipe", null, 1, 1, PipeSuper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipeEClass, Pipe.class, "Pipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipe_TargetPipe(), this.getOperation(), null, "targetPipe", null, 1, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipeFinalEClass, PipeFinal.class, "PipeFinal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPipeFinal_TargetPipeFinal(), this.getFinalExpression(), this.getFinalExpression_Before(), "targetPipeFinal", null, 1, 1, PipeFinal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Calculusv2PackageImpl
