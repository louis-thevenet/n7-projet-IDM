/**
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.cHAISEMINUTETEXT.util;

import fr.n7.chaiseMinute.cHAISEMINUTETEXT.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.CHAISEMINUTETEXTPackage
 * @generated
 */
public class CHAISEMINUTETEXTAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static CHAISEMINUTETEXTPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CHAISEMINUTETEXTAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = CHAISEMINUTETEXTPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
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
  protected CHAISEMINUTETEXTSwitch<Adapter> modelSwitch =
    new CHAISEMINUTETEXTSwitch<Adapter>() {
			@Override
			public Adapter caseChaiseMinute(ChaiseMinute object) {
				return createChaiseMinuteAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseIndexColumn(IndexColumn object) {
				return createIndexColumnAdapter();
			}
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseColumnData(ColumnData object) {
				return createColumnDataAdapter();
			}
			@Override
			public Adapter caseComputedColumn(ComputedColumn object) {
				return createComputedColumnAdapter();
			}
			@Override
			public Adapter caseImportedColumn(ImportedColumn object) {
				return createImportedColumnAdapter();
			}
			@Override
			public Adapter caseAlgorithm(Algorithm object) {
				return createAlgorithmAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseColumnArgument(ColumnArgument object) {
				return createColumnArgumentAdapter();
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
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute <em>Chaise Minute</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ChaiseMinute
	 * @generated
	 */
  public Adapter createChaiseMinuteAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Table
	 * @generated
	 */
  public Adapter createTableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.IndexColumn <em>Index Column</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.IndexColumn
	 * @generated
	 */
  public Adapter createIndexColumnAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Column
	 * @generated
	 */
  public Adapter createColumnAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnData <em>Column Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnData
	 * @generated
	 */
  public Adapter createColumnDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ComputedColumn <em>Computed Column</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ComputedColumn
	 * @generated
	 */
  public Adapter createComputedColumnAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ImportedColumn <em>Imported Column</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ImportedColumn
	 * @generated
	 */
  public Adapter createImportedColumnAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Algorithm
	 * @generated
	 */
  public Adapter createAlgorithmAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Function
	 * @generated
	 */
  public Adapter createFunctionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.Argument
	 * @generated
	 */
  public Adapter createArgumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnArgument <em>Column Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnArgument
	 * @generated
	 */
  public Adapter createColumnArgumentAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //CHAISEMINUTETEXTAdapterFactory
