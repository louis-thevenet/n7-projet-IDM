/**
 */
package calculus.impl;

import calculus.CalculusPackage;
import calculus.Expression;
import calculus.Sum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calculus.impl.SumImpl#getName <em>Name</em>}</li>
 *   <li>{@link calculus.impl.SumImpl#getFirst <em>First</em>}</li>
 *   <li>{@link calculus.impl.SumImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link calculus.impl.SumImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SumImpl extends MinimalEObjectImpl.Container implements Sum {
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
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected Expression first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected Expression second;

	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected String op = OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CalculusPackage.Literals.SUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (Expression)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculusPackage.SUM__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirst(Expression newFirst) {
		Expression oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculusPackage.SUM__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSecond() {
		if (second != null && second.eIsProxy()) {
			InternalEObject oldSecond = (InternalEObject)second;
			second = (Expression)eResolveProxy(oldSecond);
			if (second != oldSecond) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CalculusPackage.SUM__SECOND, oldSecond, second));
			}
		}
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecond(Expression newSecond) {
		Expression oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculusPackage.SUM__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculusPackage.SUM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOp(String newOp) {
		String oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CalculusPackage.SUM__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CalculusPackage.SUM__NAME:
				return getName();
			case CalculusPackage.SUM__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case CalculusPackage.SUM__SECOND:
				if (resolve) return getSecond();
				return basicGetSecond();
			case CalculusPackage.SUM__OP:
				return getOp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CalculusPackage.SUM__NAME:
				setName((String)newValue);
				return;
			case CalculusPackage.SUM__FIRST:
				setFirst((Expression)newValue);
				return;
			case CalculusPackage.SUM__SECOND:
				setSecond((Expression)newValue);
				return;
			case CalculusPackage.SUM__OP:
				setOp((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CalculusPackage.SUM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CalculusPackage.SUM__FIRST:
				setFirst((Expression)null);
				return;
			case CalculusPackage.SUM__SECOND:
				setSecond((Expression)null);
				return;
			case CalculusPackage.SUM__OP:
				setOp(OP_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CalculusPackage.SUM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CalculusPackage.SUM__FIRST:
				return first != null;
			case CalculusPackage.SUM__SECOND:
				return second != null;
			case CalculusPackage.SUM__OP:
				return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //SumImpl
