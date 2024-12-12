/**
 * generated by Xtext 2.32.0
 */
package fr.n7.cHAISEMINUTETEXT.impl;

import fr.n7.cHAISEMINUTETEXT.Algorithm;
import fr.n7.cHAISEMINUTETEXT.CHAISEMINUTETEXTPackage;
import fr.n7.cHAISEMINUTETEXT.Column;
import fr.n7.cHAISEMINUTETEXT.IndexColumn;
import fr.n7.cHAISEMINUTETEXT.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.cHAISEMINUTETEXT.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.cHAISEMINUTETEXT.impl.TableImpl#getIndexcolumn <em>Indexcolumn</em>}</li>
 *   <li>{@link fr.n7.cHAISEMINUTETEXT.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link fr.n7.cHAISEMINUTETEXT.impl.TableImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndexcolumn() <em>Indexcolumn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexcolumn()
   * @generated
   * @ordered
   */
  protected IndexColumn indexcolumn;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<Column> columns;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Algorithm> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableImpl()
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
    return CHAISEMINUTETEXTPackage.Literals.TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CHAISEMINUTETEXTPackage.TABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IndexColumn getIndexcolumn()
  {
    return indexcolumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexcolumn(IndexColumn newIndexcolumn, NotificationChain msgs)
  {
    IndexColumn oldIndexcolumn = indexcolumn;
    indexcolumn = newIndexcolumn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CHAISEMINUTETEXTPackage.TABLE__INDEXCOLUMN, oldIndexcolumn, newIndexcolumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIndexcolumn(IndexColumn newIndexcolumn)
  {
    if (newIndexcolumn != indexcolumn)
    {
      NotificationChain msgs = null;
      if (indexcolumn != null)
        msgs = ((InternalEObject)indexcolumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CHAISEMINUTETEXTPackage.TABLE__INDEXCOLUMN, null, msgs);
      if (newIndexcolumn != null)
        msgs = ((InternalEObject)newIndexcolumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CHAISEMINUTETEXTPackage.TABLE__INDEXCOLUMN, null, msgs);
      msgs = basicSetIndexcolumn(newIndexcolumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CHAISEMINUTETEXTPackage.TABLE__INDEXCOLUMN, newIndexcolumn, newIndexcolumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Column> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<Column>(Column.class, this, CHAISEMINUTETEXTPackage.TABLE__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Algorithm> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Algorithm>(Algorithm.class, this, CHAISEMINUTETEXTPackage.TABLE__CONSTRAINTS);
    }
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CHAISEMINUTETEXTPackage.TABLE__INDEXCOLUMN:
        return basicSetIndexcolumn(null, msgs);
      case CHAISEMINUTETEXTPackage.TABLE__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case CHAISEMINUTETEXTPackage.TABLE__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CHAISEMINUTETEXTPackage.TABLE__NAME:
        return getName();
      case CHAISEMINUTETEXTPackage.TABLE__INDEXCOLUMN:
        return getIndexcolumn();
      case CHAISEMINUTETEXTPackage.TABLE__COLUMNS:
        return getColumns();
      case CHAISEMINUTETEXTPackage.TABLE__CONSTRAINTS:
        return getConstraints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CHAISEMINUTETEXTPackage.TABLE__NAME:
        setName((String)newValue);
        return;
      case CHAISEMINUTETEXTPackage.TABLE__INDEXCOLUMN:
        setIndexcolumn((IndexColumn)newValue);
        return;
      case CHAISEMINUTETEXTPackage.TABLE__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
        return;
      case CHAISEMINUTETEXTPackage.TABLE__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Algorithm>)newValue);
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
    switch (featureID)
    {
      case CHAISEMINUTETEXTPackage.TABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CHAISEMINUTETEXTPackage.TABLE__INDEXCOLUMN:
        setIndexcolumn((IndexColumn)null);
        return;
      case CHAISEMINUTETEXTPackage.TABLE__COLUMNS:
        getColumns().clear();
        return;
      case CHAISEMINUTETEXTPackage.TABLE__CONSTRAINTS:
        getConstraints().clear();
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
    switch (featureID)
    {
      case CHAISEMINUTETEXTPackage.TABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CHAISEMINUTETEXTPackage.TABLE__INDEXCOLUMN:
        return indexcolumn != null;
      case CHAISEMINUTETEXTPackage.TABLE__COLUMNS:
        return columns != null && !columns.isEmpty();
      case CHAISEMINUTETEXTPackage.TABLE__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TableImpl