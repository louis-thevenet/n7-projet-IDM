/**
 */
package algorithm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.Function#getPrevious <em>Previous</em>}</li>
 *   <li>{@link algorithm.Function#getNext <em>Next</em>}</li>
 *   <li>{@link algorithm.Function#getInput <em>Input</em>}</li>
 *   <li>{@link algorithm.Function#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link algorithm.Function#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Function)
	 * @see algorithm.AlgorithmPackage#getFunction_Previous()
	 * @see algorithm.Function#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Function getPrevious();

	/**
	 * Sets the value of the '{@link algorithm.Function#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Function value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link algorithm.Function#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Function)
	 * @see algorithm.AlgorithmPackage#getFunction_Next()
	 * @see algorithm.Function#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Function getNext();

	/**
	 * Sets the value of the '{@link algorithm.Function#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Function value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link algorithm.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see algorithm.AlgorithmPackage#getFunction_Input()
	 * @model
	 * @generated
	 */
	EList<Argument> getInput();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see algorithm.AlgorithmPackage#getFunction_Operation()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link algorithm.Function#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Function
