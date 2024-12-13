/**
 * generated by Xtext 2.32.0
 */
package fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl;

import fr.n7.chaiseMinute.cHAISEMINUTETEXT.CHAISEMINUTETEXTPackage;
import fr.n7.chaiseMinute.cHAISEMINUTETEXT.ColumnArgument;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.chaiseMinute.cHAISEMINUTETEXT.impl.ColumnArgumentImpl#getColumnpath <em>Columnpath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnArgumentImpl extends ArgumentImpl implements ColumnArgument
{
  /**
	 * The default value of the '{@link #getColumnpath() <em>Columnpath</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getColumnpath()
	 * @generated
	 * @ordered
	 */
  protected static final String COLUMNPATH_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getColumnpath() <em>Columnpath</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getColumnpath()
	 * @generated
	 * @ordered
	 */
  protected String columnpath = COLUMNPATH_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ColumnArgumentImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return CHAISEMINUTETEXTPackage.Literals.COLUMN_ARGUMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getColumnpath()
  {
		return columnpath;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setColumnpath(String newColumnpath)
  {
		String oldColumnpath = columnpath;
		columnpath = newColumnpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CHAISEMINUTETEXTPackage.COLUMN_ARGUMENT__COLUMNPATH, oldColumnpath, columnpath));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case CHAISEMINUTETEXTPackage.COLUMN_ARGUMENT__COLUMNPATH:
				return getColumnpath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case CHAISEMINUTETEXTPackage.COLUMN_ARGUMENT__COLUMNPATH:
				setColumnpath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case CHAISEMINUTETEXTPackage.COLUMN_ARGUMENT__COLUMNPATH:
				setColumnpath(COLUMNPATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case CHAISEMINUTETEXTPackage.COLUMN_ARGUMENT__COLUMNPATH:
				return COLUMNPATH_EDEFAULT == null ? columnpath != null : !COLUMNPATH_EDEFAULT.equals(columnpath);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (columnpath: ");
		result.append(columnpath);
		result.append(')');
		return result.toString();
	}

} //ColumnArgumentImpl
