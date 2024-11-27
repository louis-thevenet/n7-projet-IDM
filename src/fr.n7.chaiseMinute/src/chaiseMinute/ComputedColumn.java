/**
 */
package chaiseMinute;

import algorithm.Algorithm;
import algorithm.ColumnArgument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computed Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chaiseMinute.ComputedColumn#getFunction <em>Function</em>}</li>
 *   <li>{@link chaiseMinute.ComputedColumn#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see chaiseMinute.ChaiseMinutePackage#getComputedColumn()
 * @model
 * @generated
 */
public interface ComputedColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Algorithm)
	 * @see chaiseMinute.ChaiseMinutePackage#getComputedColumn_Function()
	 * @model
	 * @generated
	 */
	Algorithm getFunction();

	/**
	 * Sets the value of the '{@link chaiseMinute.ComputedColumn#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Algorithm value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(ColumnArgument)
	 * @see chaiseMinute.ChaiseMinutePackage#getComputedColumn_Output()
	 * @model
	 * @generated
	 */
	ColumnArgument getOutput();

	/**
	 * Sets the value of the '{@link chaiseMinute.ComputedColumn#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(ColumnArgument value);

} // ComputedColumn
