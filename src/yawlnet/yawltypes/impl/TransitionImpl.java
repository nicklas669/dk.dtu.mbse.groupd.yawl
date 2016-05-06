/**
 */
package yawlnet.yawltypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import yawlnet.yawltypes.Transition;
import yawlnet.yawltypes.TransitionType;
import yawlnet.yawltypes.YawltypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.yawltypes.impl.TransitionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link yawlnet.yawltypes.impl.TransitionImpl#getJoin <em>Join</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl implements Transition {
	/**
	 * The cached value of the '{@link #getSplit() <em>Split</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplit()
	 * @generated
	 * @ordered
	 */
	protected TransitionType split;

	/**
	 * The cached value of the '{@link #getJoin() <em>Join</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
	protected TransitionType join;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawltypesPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getSplit() {
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplit(TransitionType newSplit, NotificationChain msgs) {
		TransitionType oldSplit = split;
		split = newSplit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawltypesPackage.TRANSITION__SPLIT, oldSplit, newSplit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplit(TransitionType newSplit) {
		if (newSplit != split) {
			NotificationChain msgs = null;
			if (split != null)
				msgs = ((InternalEObject)split).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawltypesPackage.TRANSITION__SPLIT, null, msgs);
			if (newSplit != null)
				msgs = ((InternalEObject)newSplit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawltypesPackage.TRANSITION__SPLIT, null, msgs);
			msgs = basicSetSplit(newSplit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawltypesPackage.TRANSITION__SPLIT, newSplit, newSplit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getJoin() {
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoin(TransitionType newJoin, NotificationChain msgs) {
		TransitionType oldJoin = join;
		join = newJoin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YawltypesPackage.TRANSITION__JOIN, oldJoin, newJoin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoin(TransitionType newJoin) {
		if (newJoin != join) {
			NotificationChain msgs = null;
			if (join != null)
				msgs = ((InternalEObject)join).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YawltypesPackage.TRANSITION__JOIN, null, msgs);
			if (newJoin != null)
				msgs = ((InternalEObject)newJoin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YawltypesPackage.TRANSITION__JOIN, null, msgs);
			msgs = basicSetJoin(newJoin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawltypesPackage.TRANSITION__JOIN, newJoin, newJoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YawltypesPackage.TRANSITION__SPLIT:
				return basicSetSplit(null, msgs);
			case YawltypesPackage.TRANSITION__JOIN:
				return basicSetJoin(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YawltypesPackage.TRANSITION__SPLIT:
				return getSplit();
			case YawltypesPackage.TRANSITION__JOIN:
				return getJoin();
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
			case YawltypesPackage.TRANSITION__SPLIT:
				setSplit((TransitionType)newValue);
				return;
			case YawltypesPackage.TRANSITION__JOIN:
				setJoin((TransitionType)newValue);
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
			case YawltypesPackage.TRANSITION__SPLIT:
				setSplit((TransitionType)null);
				return;
			case YawltypesPackage.TRANSITION__JOIN:
				setJoin((TransitionType)null);
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
			case YawltypesPackage.TRANSITION__SPLIT:
				return split != null;
			case YawltypesPackage.TRANSITION__JOIN:
				return join != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
