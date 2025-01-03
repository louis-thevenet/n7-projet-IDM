/**
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.tabouretSeconde.tabouretSeconde;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computed Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.chaiseMinute.tabouretSeconde.tabouretSeconde.ComputedColumn#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see fr.n7.chaiseMinute.tabouretSeconde.tabouretSeconde.TabouretSecondePackage#getComputedColumn()
 * @model
 * @generated
 */
public interface ComputedColumn extends Column
{
  /**
   * Returns the value of the '<em><b>Algorithm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithm</em>' containment reference.
   * @see #setAlgorithm(Algorithm)
   * @see fr.n7.chaiseMinute.tabouretSeconde.tabouretSeconde.TabouretSecondePackage#getComputedColumn_Algorithm()
   * @model containment="true"
   * @generated
   */
  Algorithm getAlgorithm();

  /**
   * Sets the value of the '{@link fr.n7.chaiseMinute.tabouretSeconde.tabouretSeconde.ComputedColumn#getAlgorithm <em>Algorithm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algorithm</em>' containment reference.
   * @see #getAlgorithm()
   * @generated
   */
  void setAlgorithm(Algorithm value);

} // ComputedColumn
