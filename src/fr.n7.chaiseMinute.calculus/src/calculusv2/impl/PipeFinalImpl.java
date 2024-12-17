/**
 */
package calculusv2.impl;

import calculusv2.Calculus;
import calculusv2.Calculusv2Package;
import calculusv2.FinalExpression;
import calculusv2.PipeFinal;
import calculusv2.UsableExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipe Final</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link calculusv2.impl.PipeFinalImpl#getCalculus <em>Calculus</em>}</li>
 *   <li>{@link calculusv2.impl.PipeFinalImpl#getName <em>Name</em>}</li>
 *   <li>{@link calculusv2.impl.PipeFinalImpl#getSource <em>Source</em>}</li>
 *   <li>{@link calculusv2.impl.PipeFinalImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipeFinalImpl extends MinimalEObjectImpl.Container implements PipeFinal {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected UsableExpression source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected FinalExpression target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipeFinalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Calculusv2Package.Literals.PIPE_FINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calculus getCalculus() {
		if (eContainerFeatureID() != Calculusv2Package.PIPE_FINAL__CALCULUS) return null;
		return (Calculus)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculus(Calculus newCalculus, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCalculus, Calculusv2Package.PIPE_FINAL__CALCULUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalculus(Calculus newCalculus) {
		if (newCalculus != eInternalContainer() || (eContainerFeatureID() != Calculusv2Package.PIPE_FINAL__CALCULUS && newCalculus != null)) {
			if (EcoreUtil.isAncestor(this, newCalculus))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCalculus != null)
				msgs = ((InternalEObject)newCalculus).eInverseAdd(this, Calculusv2Package.CALCULUS__ELEMENTS, Calculus.class, msgs);
			msgs = basicSetCalculus(newCalculus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE_FINAL__CALCULUS, newCalculus, newCalculus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE_FINAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsableExpression getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (UsableExpression)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.PIPE_FINAL__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsableExpression basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(UsableExpression newSource) {
		UsableExpression oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE_FINAL__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalExpression getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (FinalExpression)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.PIPE_FINAL__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalExpression basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(FinalExpression newTarget) {
		FinalExpression oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE_FINAL__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Calculusv2Package.PIPE_FINAL__CALCULUS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCalculus((Calculus)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Calculusv2Package.PIPE_FINAL__CALCULUS:
				return basicSetCalculus(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Calculusv2Package.PIPE_FINAL__CALCULUS:
				return eInternalContainer().eInverseRemove(this, Calculusv2Package.CALCULUS__ELEMENTS, Calculus.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Calculusv2Package.PIPE_FINAL__CALCULUS:
				return getCalculus();
			case Calculusv2Package.PIPE_FINAL__NAME:
				return getName();
			case Calculusv2Package.PIPE_FINAL__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Calculusv2Package.PIPE_FINAL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case Calculusv2Package.PIPE_FINAL__CALCULUS:
				setCalculus((Calculus)newValue);
				return;
			case Calculusv2Package.PIPE_FINAL__NAME:
				setName((String)newValue);
				return;
			case Calculusv2Package.PIPE_FINAL__SOURCE:
				setSource((UsableExpression)newValue);
				return;
			case Calculusv2Package.PIPE_FINAL__TARGET:
				setTarget((FinalExpression)newValue);
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
			case Calculusv2Package.PIPE_FINAL__CALCULUS:
				setCalculus((Calculus)null);
				return;
			case Calculusv2Package.PIPE_FINAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Calculusv2Package.PIPE_FINAL__SOURCE:
				setSource((UsableExpression)null);
				return;
			case Calculusv2Package.PIPE_FINAL__TARGET:
				setTarget((FinalExpression)null);
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
			case Calculusv2Package.PIPE_FINAL__CALCULUS:
				return getCalculus() != null;
			case Calculusv2Package.PIPE_FINAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Calculusv2Package.PIPE_FINAL__SOURCE:
				return source != null;
			case Calculusv2Package.PIPE_FINAL__TARGET:
				return target != null;
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
		result.append(')');
		return result.toString();
	}

} //PipeFinalImpl
