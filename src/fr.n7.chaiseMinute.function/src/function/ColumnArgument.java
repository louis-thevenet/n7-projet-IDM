/**
 */
package function;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link function.ColumnArgument#getColumnPath <em>Column Path</em>}</li>
 * </ul>
 *
 * @see function.FunctionPackage#getColumnArgument()
 * @model
 * @generated
 */
public interface ColumnArgument extends Argument {
	/**
	 * Returns the value of the '<em><b>Column Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Path</em>' attribute.
	 * @see #setColumnPath(String)
	 * @see function.FunctionPackage#getColumnArgument_ColumnPath()
	 * @model
	 * @generated
	 */
	String getColumnPath();

	/**
	 * Sets the value of the '{@link function.ColumnArgument#getColumnPath <em>Column Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Path</em>' attribute.
	 * @see #getColumnPath()
	 * @generated
	 */
	void setColumnPath(String value);

} // ColumnArgument
