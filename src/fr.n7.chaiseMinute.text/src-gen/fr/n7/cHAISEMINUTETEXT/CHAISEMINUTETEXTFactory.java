/**
 * generated by Xtext 2.32.0
 */
package fr.n7.cHAISEMINUTETEXT;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.n7.cHAISEMINUTETEXT.CHAISEMINUTETEXTPackage
 * @generated
 */
public interface CHAISEMINUTETEXTFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CHAISEMINUTETEXTFactory eINSTANCE = fr.n7.cHAISEMINUTETEXT.impl.CHAISEMINUTETEXTFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Chaise Minute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chaise Minute</em>'.
   * @generated
   */
  ChaiseMinute createChaiseMinute();

  /**
   * Returns a new object of class '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table</em>'.
   * @generated
   */
  Table createTable();

  /**
   * Returns a new object of class '<em>Index Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Column</em>'.
   * @generated
   */
  IndexColumn createIndexColumn();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns a new object of class '<em>Column Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Data</em>'.
   * @generated
   */
  ColumnData createColumnData();

  /**
   * Returns a new object of class '<em>Computed Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Computed Column</em>'.
   * @generated
   */
  ComputedColumn createComputedColumn();

  /**
   * Returns a new object of class '<em>Imported Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Imported Column</em>'.
   * @generated
   */
  ImportedColumn createImportedColumn();

  /**
   * Returns a new object of class '<em>Algorithm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Algorithm</em>'.
   * @generated
   */
  Algorithm createAlgorithm();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Column Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Argument</em>'.
   * @generated
   */
  ColumnArgument createColumnArgument();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CHAISEMINUTETEXTPackage getCHAISEMINUTETEXTPackage();

} //CHAISEMINUTETEXTFactory
