/**
 */
package calculusv2.util;

import calculusv2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see calculusv2.Calculusv2Package
 * @generated
 */
public class Calculusv2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Calculusv2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calculusv2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Calculusv2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Calculusv2Switch<Adapter> modelSwitch =
		new Calculusv2Switch<Adapter>() {
			@Override
			public Adapter caseCalculus(Calculus object) {
				return createCalculusAdapter();
			}
			@Override
			public Adapter caseCalculusElement(CalculusElement object) {
				return createCalculusElementAdapter();
			}
			@Override
			public Adapter caseUsableExpression(UsableExpression object) {
				return createUsableExpressionAdapter();
			}
			@Override
			public Adapter caseFinalExpression(FinalExpression object) {
				return createFinalExpressionAdapter();
			}
			@Override
			public Adapter caseInputArgs(InputArgs object) {
				return createInputArgsAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseUnaryOperation(UnaryOperation object) {
				return createUnaryOperationAdapter();
			}
			@Override
			public Adapter caseBinaryOperation(BinaryOperation object) {
				return createBinaryOperationAdapter();
			}
			@Override
			public Adapter caseSum(Sum object) {
				return createSumAdapter();
			}
			@Override
			public Adapter caseProducts(Products object) {
				return createProductsAdapter();
			}
			@Override
			public Adapter caseSubstraction(Substraction object) {
				return createSubstractionAdapter();
			}
			@Override
			public Adapter caseDivision(Division object) {
				return createDivisionAdapter();
			}
			@Override
			public Adapter caseConstante(Constante object) {
				return createConstanteAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter casePipe(Pipe object) {
				return createPipeAdapter();
			}
			@Override
			public Adapter casePipeFinal(PipeFinal object) {
				return createPipeFinalAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.Calculus <em>Calculus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.Calculus
	 * @generated
	 */
	public Adapter createCalculusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.CalculusElement <em>Calculus Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.CalculusElement
	 * @generated
	 */
	public Adapter createCalculusElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.UsableExpression <em>Usable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.UsableExpression
	 * @generated
	 */
	public Adapter createUsableExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.FinalExpression <em>Final Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.FinalExpression
	 * @generated
	 */
	public Adapter createFinalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.InputArgs <em>Input Args</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.InputArgs
	 * @generated
	 */
	public Adapter createInputArgsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.UnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.UnaryOperation
	 * @generated
	 */
	public Adapter createUnaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.BinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.BinaryOperation
	 * @generated
	 */
	public Adapter createBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.Sum
	 * @generated
	 */
	public Adapter createSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.Products <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.Products
	 * @generated
	 */
	public Adapter createProductsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.Substraction <em>Substraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.Substraction
	 * @generated
	 */
	public Adapter createSubstractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.Constante
	 * @generated
	 */
	public Adapter createConstanteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.Result
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.Pipe
	 * @generated
	 */
	public Adapter createPipeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link calculusv2.PipeFinal <em>Pipe Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see calculusv2.PipeFinal
	 * @generated
	 */
	public Adapter createPipeFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Calculusv2AdapterFactory
