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
 *   <li>{@link calculusv2.impl.PipeFinalImpl#getSourcePipeFinal <em>Source Pipe Final</em>}</li>
 *   <li>{@link calculusv2.impl.PipeFinalImpl#getTargetPipeFinal <em>Target Pipe Final</em>}</li>
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
	 * The cached value of the '{@link #getSourcePipeFinal() <em>Source Pipe Final</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePipeFinal()
	 * @generated
	 * @ordered
	 */
	protected UsableExpression sourcePipeFinal;

	/**
	 * The cached value of the '{@link #getTargetPipeFinal() <em>Target Pipe Final</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPipeFinal()
	 * @generated
	 * @ordered
	 */
	protected FinalExpression targetPipeFinal;

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
	public UsableExpression getSourcePipeFinal() {
		if (sourcePipeFinal != null && sourcePipeFinal.eIsProxy()) {
			InternalEObject oldSourcePipeFinal = (InternalEObject)sourcePipeFinal;
			sourcePipeFinal = (UsableExpression)eResolveProxy(oldSourcePipeFinal);
			if (sourcePipeFinal != oldSourcePipeFinal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.PIPE_FINAL__SOURCE_PIPE_FINAL, oldSourcePipeFinal, sourcePipeFinal));
			}
		}
		return sourcePipeFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsableExpression basicGetSourcePipeFinal() {
		return sourcePipeFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePipeFinal(UsableExpression newSourcePipeFinal) {
		UsableExpression oldSourcePipeFinal = sourcePipeFinal;
		sourcePipeFinal = newSourcePipeFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE_FINAL__SOURCE_PIPE_FINAL, oldSourcePipeFinal, sourcePipeFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalExpression getTargetPipeFinal() {
		if (targetPipeFinal != null && targetPipeFinal.eIsProxy()) {
			InternalEObject oldTargetPipeFinal = (InternalEObject)targetPipeFinal;
			targetPipeFinal = (FinalExpression)eResolveProxy(oldTargetPipeFinal);
			if (targetPipeFinal != oldTargetPipeFinal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Calculusv2Package.PIPE_FINAL__TARGET_PIPE_FINAL, oldTargetPipeFinal, targetPipeFinal));
			}
		}
		return targetPipeFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalExpression basicGetTargetPipeFinal() {
		return targetPipeFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPipeFinal(FinalExpression newTargetPipeFinal, NotificationChain msgs) {
		FinalExpression oldTargetPipeFinal = targetPipeFinal;
		targetPipeFinal = newTargetPipeFinal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE_FINAL__TARGET_PIPE_FINAL, oldTargetPipeFinal, newTargetPipeFinal);
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
	public void setTargetPipeFinal(FinalExpression newTargetPipeFinal) {
		if (newTargetPipeFinal != targetPipeFinal) {
			NotificationChain msgs = null;
			if (targetPipeFinal != null)
				msgs = ((InternalEObject)targetPipeFinal).eInverseRemove(this, Calculusv2Package.FINAL_EXPRESSION__BEFORE, FinalExpression.class, msgs);
			if (newTargetPipeFinal != null)
				msgs = ((InternalEObject)newTargetPipeFinal).eInverseAdd(this, Calculusv2Package.FINAL_EXPRESSION__BEFORE, FinalExpression.class, msgs);
			msgs = basicSetTargetPipeFinal(newTargetPipeFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Calculusv2Package.PIPE_FINAL__TARGET_PIPE_FINAL, newTargetPipeFinal, newTargetPipeFinal));
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
			case Calculusv2Package.PIPE_FINAL__TARGET_PIPE_FINAL:
				if (targetPipeFinal != null)
					msgs = ((InternalEObject)targetPipeFinal).eInverseRemove(this, Calculusv2Package.FINAL_EXPRESSION__BEFORE, FinalExpression.class, msgs);
				return basicSetTargetPipeFinal((FinalExpression)otherEnd, msgs);
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
			case Calculusv2Package.PIPE_FINAL__TARGET_PIPE_FINAL:
				return basicSetTargetPipeFinal(null, msgs);
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
			case Calculusv2Package.PIPE_FINAL__SOURCE_PIPE_FINAL:
				if (resolve) return getSourcePipeFinal();
				return basicGetSourcePipeFinal();
			case Calculusv2Package.PIPE_FINAL__TARGET_PIPE_FINAL:
				if (resolve) return getTargetPipeFinal();
				return basicGetTargetPipeFinal();
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
			case Calculusv2Package.PIPE_FINAL__SOURCE_PIPE_FINAL:
				setSourcePipeFinal((UsableExpression)newValue);
				return;
			case Calculusv2Package.PIPE_FINAL__TARGET_PIPE_FINAL:
				setTargetPipeFinal((FinalExpression)newValue);
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
			case Calculusv2Package.PIPE_FINAL__SOURCE_PIPE_FINAL:
				setSourcePipeFinal((UsableExpression)null);
				return;
			case Calculusv2Package.PIPE_FINAL__TARGET_PIPE_FINAL:
				setTargetPipeFinal((FinalExpression)null);
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
			case Calculusv2Package.PIPE_FINAL__SOURCE_PIPE_FINAL:
				return sourcePipeFinal != null;
			case Calculusv2Package.PIPE_FINAL__TARGET_PIPE_FINAL:
				return targetPipeFinal != null;
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
