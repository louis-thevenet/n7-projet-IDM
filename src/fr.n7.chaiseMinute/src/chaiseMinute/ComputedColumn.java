/**
 */
package chaiseMinute;

import algorithm.Algorithm;
import function.ColumnArgument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computed Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chaiseMinute.ComputedColumn#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link chaiseMinute.ComputedColumn#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see chaiseMinute.ChaiseMinutePackage#getComputedColumn()
 * @model
 * @generated
 */
public interface ComputedColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' containment reference.
	 * @see #setAlgorithm(Algorithm)
	 * @see chaiseMinute.ChaiseMinutePackage#getComputedColumn_Algorithm()
	 * @model containment="true"
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link chaiseMinute.ComputedColumn#getAlgorithm <em>Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' containment reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algorithm value);

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
