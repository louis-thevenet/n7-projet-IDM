/**
 */
package calculusv2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see calculusv2.Calculusv2Factory
 * @model kind="package"
 * @generated
 */
public interface Calculusv2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "calculusv2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://calculusv2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "calculusv2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Calculusv2Package eINSTANCE = calculusv2.impl.Calculusv2PackageImpl.init();

	/**
	 * The meta object id for the '{@link calculusv2.impl.CalculusImpl <em>Calculus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.CalculusImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getCalculus()
	 * @generated
	 */
	int CALCULUS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULUS__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULUS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Calculus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Calculus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calculusv2.CalculusElement <em>Calculus Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.CalculusElement
	 * @see calculusv2.impl.Calculusv2PackageImpl#getCalculusElement()
	 * @generated
	 */
	int CALCULUS_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULUS_ELEMENT__CALCULUS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULUS_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Calculus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULUS_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Calculus Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULUS_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link calculusv2.UsableExpression <em>Usable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.UsableExpression
	 * @see calculusv2.impl.Calculusv2PackageImpl#getUsableExpression()
	 * @generated
	 */
	int USABLE_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_EXPRESSION__CALCULUS = CALCULUS_ELEMENT__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_EXPRESSION__NAME = CALCULUS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_EXPRESSION__USED_BY = CALCULUS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Usable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_EXPRESSION_FEATURE_COUNT = CALCULUS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Usable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USABLE_EXPRESSION_OPERATION_COUNT = CALCULUS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.FinalExpression <em>Final Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.FinalExpression
	 * @see calculusv2.impl.Calculusv2PackageImpl#getFinalExpression()
	 * @generated
	 */
	int FINAL_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EXPRESSION__CALCULUS = CALCULUS_ELEMENT__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EXPRESSION__NAME = CALCULUS_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Final Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EXPRESSION_FEATURE_COUNT = CALCULUS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_EXPRESSION_OPERATION_COUNT = CALCULUS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.impl.InputArgsImpl <em>Input Args</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.InputArgsImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getInputArgs()
	 * @generated
	 */
	int INPUT_ARGS = 4;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARGS__CALCULUS = USABLE_EXPRESSION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARGS__NAME = USABLE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARGS__USED_BY = USABLE_EXPRESSION__USED_BY;

	/**
	 * The number of structural features of the '<em>Input Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARGS_FEATURE_COUNT = USABLE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_ARGS_OPERATION_COUNT = USABLE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.Operation <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.Operation
	 * @see calculusv2.impl.Calculusv2PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CALCULUS = USABLE_EXPRESSION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = USABLE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__USED_BY = USABLE_EXPRESSION__USED_BY;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = USABLE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = USABLE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.UnaryOperation <em>Unary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.UnaryOperation
	 * @see calculusv2.impl.Calculusv2PackageImpl#getUnaryOperation()
	 * @generated
	 */
	int UNARY_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__CALCULUS = OPERATION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__USED_BY = OPERATION__USED_BY;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION__BEFORE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.BinaryOperation <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.BinaryOperation
	 * @see calculusv2.impl.Calculusv2PackageImpl#getBinaryOperation()
	 * @generated
	 */
	int BINARY_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__CALCULUS = OPERATION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__USED_BY = OPERATION__USED_BY;

	/**
	 * The feature id for the '<em><b>Before First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__BEFORE_FIRST = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Before Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION__BEFORE_SECOND = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.impl.SumImpl <em>Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.SumImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getSum()
	 * @generated
	 */
	int SUM = 8;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__CALCULUS = BINARY_OPERATION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__USED_BY = BINARY_OPERATION__USED_BY;

	/**
	 * The feature id for the '<em><b>Before First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__BEFORE_FIRST = BINARY_OPERATION__BEFORE_FIRST;

	/**
	 * The feature id for the '<em><b>Before Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__BEFORE_SECOND = BINARY_OPERATION__BEFORE_SECOND;

	/**
	 * The number of structural features of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.impl.ProductsImpl <em>Products</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.ProductsImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getProducts()
	 * @generated
	 */
	int PRODUCTS = 9;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__CALCULUS = BINARY_OPERATION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__USED_BY = BINARY_OPERATION__USED_BY;

	/**
	 * The feature id for the '<em><b>Before First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__BEFORE_FIRST = BINARY_OPERATION__BEFORE_FIRST;

	/**
	 * The feature id for the '<em><b>Before Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS__BEFORE_SECOND = BINARY_OPERATION__BEFORE_SECOND;

	/**
	 * The number of structural features of the '<em>Products</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Products</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.impl.SubstractionImpl <em>Substraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.SubstractionImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getSubstraction()
	 * @generated
	 */
	int SUBSTRACTION = 10;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__CALCULUS = BINARY_OPERATION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__USED_BY = BINARY_OPERATION__USED_BY;

	/**
	 * The feature id for the '<em><b>Before First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__BEFORE_FIRST = BINARY_OPERATION__BEFORE_FIRST;

	/**
	 * The feature id for the '<em><b>Before Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION__BEFORE_SECOND = BINARY_OPERATION__BEFORE_SECOND;

	/**
	 * The number of structural features of the '<em>Substraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Substraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTRACTION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.DivisionImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 11;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CALCULUS = BINARY_OPERATION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NAME = BINARY_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__USED_BY = BINARY_OPERATION__USED_BY;

	/**
	 * The feature id for the '<em><b>Before First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__BEFORE_FIRST = BINARY_OPERATION__BEFORE_FIRST;

	/**
	 * The feature id for the '<em><b>Before Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__BEFORE_SECOND = BINARY_OPERATION__BEFORE_SECOND;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.impl.ConstanteImpl <em>Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.ConstanteImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getConstante()
	 * @generated
	 */
	int CONSTANTE = 12;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__CALCULUS = USABLE_EXPRESSION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__NAME = USABLE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__USED_BY = USABLE_EXPRESSION__USED_BY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VALUE = USABLE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = USABLE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_OPERATION_COUNT = USABLE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.impl.ResultImpl <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.ResultImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getResult()
	 * @generated
	 */
	int RESULT = 13;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__CALCULUS = FINAL_EXPRESSION__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT__NAME = FINAL_EXPRESSION__NAME;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_FEATURE_COUNT = FINAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_OPERATION_COUNT = FINAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.impl.PipeImpl <em>Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.PipeImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getPipe()
	 * @generated
	 */
	int PIPE = 14;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__CALCULUS = CALCULUS_ELEMENT__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__NAME = CALCULUS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__SOURCE = CALCULUS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__TARGET = CALCULUS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FEATURE_COUNT = CALCULUS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_OPERATION_COUNT = CALCULUS_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link calculusv2.impl.PipeFinalImpl <em>Pipe Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see calculusv2.impl.PipeFinalImpl
	 * @see calculusv2.impl.Calculusv2PackageImpl#getPipeFinal()
	 * @generated
	 */
	int PIPE_FINAL = 15;

	/**
	 * The feature id for the '<em><b>Calculus</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FINAL__CALCULUS = CALCULUS_ELEMENT__CALCULUS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FINAL__NAME = CALCULUS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FINAL__SOURCE = CALCULUS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FINAL__TARGET = CALCULUS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pipe Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FINAL_FEATURE_COUNT = CALCULUS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pipe Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FINAL_OPERATION_COUNT = CALCULUS_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link calculusv2.Calculus <em>Calculus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculus</em>'.
	 * @see calculusv2.Calculus
	 * @generated
	 */
	EClass getCalculus();

	/**
	 * Returns the meta object for the containment reference list '{@link calculusv2.Calculus#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see calculusv2.Calculus#getElements()
	 * @see #getCalculus()
	 * @generated
	 */
	EReference getCalculus_Elements();

	/**
	 * Returns the meta object for the attribute '{@link calculusv2.Calculus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see calculusv2.Calculus#getName()
	 * @see #getCalculus()
	 * @generated
	 */
	EAttribute getCalculus_Name();

	/**
	 * Returns the meta object for class '{@link calculusv2.CalculusElement <em>Calculus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculus Element</em>'.
	 * @see calculusv2.CalculusElement
	 * @generated
	 */
	EClass getCalculusElement();

	/**
	 * Returns the meta object for the container reference '{@link calculusv2.CalculusElement#getCalculus <em>Calculus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Calculus</em>'.
	 * @see calculusv2.CalculusElement#getCalculus()
	 * @see #getCalculusElement()
	 * @generated
	 */
	EReference getCalculusElement_Calculus();

	/**
	 * Returns the meta object for the attribute '{@link calculusv2.CalculusElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see calculusv2.CalculusElement#getName()
	 * @see #getCalculusElement()
	 * @generated
	 */
	EAttribute getCalculusElement_Name();

	/**
	 * Returns the meta object for class '{@link calculusv2.UsableExpression <em>Usable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usable Expression</em>'.
	 * @see calculusv2.UsableExpression
	 * @generated
	 */
	EClass getUsableExpression();

	/**
	 * Returns the meta object for the reference list '{@link calculusv2.UsableExpression#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By</em>'.
	 * @see calculusv2.UsableExpression#getUsedBy()
	 * @see #getUsableExpression()
	 * @generated
	 */
	EReference getUsableExpression_UsedBy();

	/**
	 * Returns the meta object for class '{@link calculusv2.FinalExpression <em>Final Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Expression</em>'.
	 * @see calculusv2.FinalExpression
	 * @generated
	 */
	EClass getFinalExpression();

	/**
	 * Returns the meta object for class '{@link calculusv2.InputArgs <em>Input Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Args</em>'.
	 * @see calculusv2.InputArgs
	 * @generated
	 */
	EClass getInputArgs();

	/**
	 * Returns the meta object for class '{@link calculusv2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see calculusv2.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link calculusv2.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operation</em>'.
	 * @see calculusv2.UnaryOperation
	 * @generated
	 */
	EClass getUnaryOperation();

	/**
	 * Returns the meta object for the reference '{@link calculusv2.UnaryOperation#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before</em>'.
	 * @see calculusv2.UnaryOperation#getBefore()
	 * @see #getUnaryOperation()
	 * @generated
	 */
	EReference getUnaryOperation_Before();

	/**
	 * Returns the meta object for class '{@link calculusv2.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see calculusv2.BinaryOperation
	 * @generated
	 */
	EClass getBinaryOperation();

	/**
	 * Returns the meta object for the reference '{@link calculusv2.BinaryOperation#getBeforeFirst <em>Before First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before First</em>'.
	 * @see calculusv2.BinaryOperation#getBeforeFirst()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_BeforeFirst();

	/**
	 * Returns the meta object for the reference '{@link calculusv2.BinaryOperation#getBeforeSecond <em>Before Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before Second</em>'.
	 * @see calculusv2.BinaryOperation#getBeforeSecond()
	 * @see #getBinaryOperation()
	 * @generated
	 */
	EReference getBinaryOperation_BeforeSecond();

	/**
	 * Returns the meta object for class '{@link calculusv2.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum</em>'.
	 * @see calculusv2.Sum
	 * @generated
	 */
	EClass getSum();

	/**
	 * Returns the meta object for class '{@link calculusv2.Products <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Products</em>'.
	 * @see calculusv2.Products
	 * @generated
	 */
	EClass getProducts();

	/**
	 * Returns the meta object for class '{@link calculusv2.Substraction <em>Substraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substraction</em>'.
	 * @see calculusv2.Substraction
	 * @generated
	 */
	EClass getSubstraction();

	/**
	 * Returns the meta object for class '{@link calculusv2.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see calculusv2.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link calculusv2.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constante</em>'.
	 * @see calculusv2.Constante
	 * @generated
	 */
	EClass getConstante();

	/**
	 * Returns the meta object for the attribute '{@link calculusv2.Constante#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see calculusv2.Constante#getValue()
	 * @see #getConstante()
	 * @generated
	 */
	EAttribute getConstante_Value();

	/**
	 * Returns the meta object for class '{@link calculusv2.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see calculusv2.Result
	 * @generated
	 */
	EClass getResult();

	/**
	 * Returns the meta object for class '{@link calculusv2.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe</em>'.
	 * @see calculusv2.Pipe
	 * @generated
	 */
	EClass getPipe();

	/**
	 * Returns the meta object for the reference '{@link calculusv2.Pipe#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see calculusv2.Pipe#getSource()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_Source();

	/**
	 * Returns the meta object for the reference '{@link calculusv2.Pipe#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see calculusv2.Pipe#getTarget()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_Target();

	/**
	 * Returns the meta object for class '{@link calculusv2.PipeFinal <em>Pipe Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe Final</em>'.
	 * @see calculusv2.PipeFinal
	 * @generated
	 */
	EClass getPipeFinal();

	/**
	 * Returns the meta object for the reference '{@link calculusv2.PipeFinal#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see calculusv2.PipeFinal#getSource()
	 * @see #getPipeFinal()
	 * @generated
	 */
	EReference getPipeFinal_Source();

	/**
	 * Returns the meta object for the reference '{@link calculusv2.PipeFinal#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see calculusv2.PipeFinal#getTarget()
	 * @see #getPipeFinal()
	 * @generated
	 */
	EReference getPipeFinal_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Calculusv2Factory getCalculusv2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link calculusv2.impl.CalculusImpl <em>Calculus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.CalculusImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getCalculus()
		 * @generated
		 */
		EClass CALCULUS = eINSTANCE.getCalculus();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULUS__ELEMENTS = eINSTANCE.getCalculus_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULUS__NAME = eINSTANCE.getCalculus_Name();

		/**
		 * The meta object literal for the '{@link calculusv2.CalculusElement <em>Calculus Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.CalculusElement
		 * @see calculusv2.impl.Calculusv2PackageImpl#getCalculusElement()
		 * @generated
		 */
		EClass CALCULUS_ELEMENT = eINSTANCE.getCalculusElement();

		/**
		 * The meta object literal for the '<em><b>Calculus</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULUS_ELEMENT__CALCULUS = eINSTANCE.getCalculusElement_Calculus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULUS_ELEMENT__NAME = eINSTANCE.getCalculusElement_Name();

		/**
		 * The meta object literal for the '{@link calculusv2.UsableExpression <em>Usable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.UsableExpression
		 * @see calculusv2.impl.Calculusv2PackageImpl#getUsableExpression()
		 * @generated
		 */
		EClass USABLE_EXPRESSION = eINSTANCE.getUsableExpression();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USABLE_EXPRESSION__USED_BY = eINSTANCE.getUsableExpression_UsedBy();

		/**
		 * The meta object literal for the '{@link calculusv2.FinalExpression <em>Final Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.FinalExpression
		 * @see calculusv2.impl.Calculusv2PackageImpl#getFinalExpression()
		 * @generated
		 */
		EClass FINAL_EXPRESSION = eINSTANCE.getFinalExpression();

		/**
		 * The meta object literal for the '{@link calculusv2.impl.InputArgsImpl <em>Input Args</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.InputArgsImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getInputArgs()
		 * @generated
		 */
		EClass INPUT_ARGS = eINSTANCE.getInputArgs();

		/**
		 * The meta object literal for the '{@link calculusv2.Operation <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.Operation
		 * @see calculusv2.impl.Calculusv2PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link calculusv2.UnaryOperation <em>Unary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.UnaryOperation
		 * @see calculusv2.impl.Calculusv2PackageImpl#getUnaryOperation()
		 * @generated
		 */
		EClass UNARY_OPERATION = eINSTANCE.getUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATION__BEFORE = eINSTANCE.getUnaryOperation_Before();

		/**
		 * The meta object literal for the '{@link calculusv2.BinaryOperation <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.BinaryOperation
		 * @see calculusv2.impl.Calculusv2PackageImpl#getBinaryOperation()
		 * @generated
		 */
		EClass BINARY_OPERATION = eINSTANCE.getBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Before First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__BEFORE_FIRST = eINSTANCE.getBinaryOperation_BeforeFirst();

		/**
		 * The meta object literal for the '<em><b>Before Second</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATION__BEFORE_SECOND = eINSTANCE.getBinaryOperation_BeforeSecond();

		/**
		 * The meta object literal for the '{@link calculusv2.impl.SumImpl <em>Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.SumImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getSum()
		 * @generated
		 */
		EClass SUM = eINSTANCE.getSum();

		/**
		 * The meta object literal for the '{@link calculusv2.impl.ProductsImpl <em>Products</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.ProductsImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getProducts()
		 * @generated
		 */
		EClass PRODUCTS = eINSTANCE.getProducts();

		/**
		 * The meta object literal for the '{@link calculusv2.impl.SubstractionImpl <em>Substraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.SubstractionImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getSubstraction()
		 * @generated
		 */
		EClass SUBSTRACTION = eINSTANCE.getSubstraction();

		/**
		 * The meta object literal for the '{@link calculusv2.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.DivisionImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link calculusv2.impl.ConstanteImpl <em>Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.ConstanteImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getConstante()
		 * @generated
		 */
		EClass CONSTANTE = eINSTANCE.getConstante();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTE__VALUE = eINSTANCE.getConstante_Value();

		/**
		 * The meta object literal for the '{@link calculusv2.impl.ResultImpl <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.ResultImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getResult()
		 * @generated
		 */
		EClass RESULT = eINSTANCE.getResult();

		/**
		 * The meta object literal for the '{@link calculusv2.impl.PipeImpl <em>Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.PipeImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getPipe()
		 * @generated
		 */
		EClass PIPE = eINSTANCE.getPipe();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__SOURCE = eINSTANCE.getPipe_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__TARGET = eINSTANCE.getPipe_Target();

		/**
		 * The meta object literal for the '{@link calculusv2.impl.PipeFinalImpl <em>Pipe Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see calculusv2.impl.PipeFinalImpl
		 * @see calculusv2.impl.Calculusv2PackageImpl#getPipeFinal()
		 * @generated
		 */
		EClass PIPE_FINAL = eINSTANCE.getPipeFinal();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE_FINAL__SOURCE = eINSTANCE.getPipeFinal_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE_FINAL__TARGET = eINSTANCE.getPipeFinal_Target();

	}

} //Calculusv2Package
