/**
 */
package calculusv2.util;

import calculusv2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see calculusv2.Calculusv2Package
 * @generated
 */
public class Calculusv2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Calculusv2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calculusv2Switch() {
		if (modelPackage == null) {
			modelPackage = Calculusv2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Calculusv2Package.CALCULUS: {
				Calculus calculus = (Calculus)theEObject;
				T result = caseCalculus(calculus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.CALCULUS_ELEMENT: {
				CalculusElement calculusElement = (CalculusElement)theEObject;
				T result = caseCalculusElement(calculusElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.USABLE_EXPRESSION: {
				UsableExpression usableExpression = (UsableExpression)theEObject;
				T result = caseUsableExpression(usableExpression);
				if (result == null) result = caseCalculusElement(usableExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.FINAL_EXPRESSION: {
				FinalExpression finalExpression = (FinalExpression)theEObject;
				T result = caseFinalExpression(finalExpression);
				if (result == null) result = caseCalculusElement(finalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.INPUT_ARGS: {
				InputArgs inputArgs = (InputArgs)theEObject;
				T result = caseInputArgs(inputArgs);
				if (result == null) result = caseUsableExpression(inputArgs);
				if (result == null) result = caseCalculusElement(inputArgs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseUsableExpression(operation);
				if (result == null) result = caseCalculusElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.UNARY_OPERATION: {
				UnaryOperation unaryOperation = (UnaryOperation)theEObject;
				T result = caseUnaryOperation(unaryOperation);
				if (result == null) result = caseOperation(unaryOperation);
				if (result == null) result = caseUsableExpression(unaryOperation);
				if (result == null) result = caseCalculusElement(unaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.OPPOSE: {
				Oppose oppose = (Oppose)theEObject;
				T result = caseOppose(oppose);
				if (result == null) result = caseUnaryOperation(oppose);
				if (result == null) result = caseOperation(oppose);
				if (result == null) result = caseUsableExpression(oppose);
				if (result == null) result = caseCalculusElement(oppose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.RECIPROCAL: {
				Reciprocal reciprocal = (Reciprocal)theEObject;
				T result = caseReciprocal(reciprocal);
				if (result == null) result = caseUnaryOperation(reciprocal);
				if (result == null) result = caseOperation(reciprocal);
				if (result == null) result = caseUsableExpression(reciprocal);
				if (result == null) result = caseCalculusElement(reciprocal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.BINARY_OPERATION: {
				BinaryOperation binaryOperation = (BinaryOperation)theEObject;
				T result = caseBinaryOperation(binaryOperation);
				if (result == null) result = caseOperation(binaryOperation);
				if (result == null) result = caseUsableExpression(binaryOperation);
				if (result == null) result = caseCalculusElement(binaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.SUM: {
				Sum sum = (Sum)theEObject;
				T result = caseSum(sum);
				if (result == null) result = caseBinaryOperation(sum);
				if (result == null) result = caseOperation(sum);
				if (result == null) result = caseUsableExpression(sum);
				if (result == null) result = caseCalculusElement(sum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.PRODUCTS: {
				Products products = (Products)theEObject;
				T result = caseProducts(products);
				if (result == null) result = caseBinaryOperation(products);
				if (result == null) result = caseOperation(products);
				if (result == null) result = caseUsableExpression(products);
				if (result == null) result = caseCalculusElement(products);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.SUBSTRACTION: {
				Substraction substraction = (Substraction)theEObject;
				T result = caseSubstraction(substraction);
				if (result == null) result = caseBinaryOperation(substraction);
				if (result == null) result = caseOperation(substraction);
				if (result == null) result = caseUsableExpression(substraction);
				if (result == null) result = caseCalculusElement(substraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseBinaryOperation(division);
				if (result == null) result = caseOperation(division);
				if (result == null) result = caseUsableExpression(division);
				if (result == null) result = caseCalculusElement(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.CONSTANTE: {
				Constante constante = (Constante)theEObject;
				T result = caseConstante(constante);
				if (result == null) result = caseUsableExpression(constante);
				if (result == null) result = caseCalculusElement(constante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.RESULT: {
				Result result = (Result)theEObject;
				T theResult = caseResult(result);
				if (theResult == null) theResult = caseFinalExpression(result);
				if (theResult == null) theResult = caseCalculusElement(result);
				if (theResult == null) theResult = defaultCase(theEObject);
				return theResult;
			}
			case Calculusv2Package.PIPE_SUPER: {
				PipeSuper pipeSuper = (PipeSuper)theEObject;
				T result = casePipeSuper(pipeSuper);
				if (result == null) result = caseCalculusElement(pipeSuper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.PIPE: {
				Pipe pipe = (Pipe)theEObject;
				T result = casePipe(pipe);
				if (result == null) result = casePipeSuper(pipe);
				if (result == null) result = caseCalculusElement(pipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Calculusv2Package.PIPE_FINAL: {
				PipeFinal pipeFinal = (PipeFinal)theEObject;
				T result = casePipeFinal(pipeFinal);
				if (result == null) result = casePipeSuper(pipeFinal);
				if (result == null) result = caseCalculusElement(pipeFinal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculus(Calculus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculus Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculus Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculusElement(CalculusElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usable Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsableExpression(UsableExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalExpression(FinalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Args</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Args</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputArgs(InputArgs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperation(UnaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oppose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oppose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOppose(Oppose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reciprocal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reciprocal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReciprocal(Reciprocal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperation(BinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSum(Sum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Products</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Products</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProducts(Products object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstraction(Substraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstante(Constante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResult(Result object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipe Super</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipe Super</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipeSuper(PipeSuper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipe(Pipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipe Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipe Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipeFinal(PipeFinal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Calculusv2Switch
