/**
 */
package yawlnet.yawltypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl;

import yawlnet.yawltypes.Transistion;
import yawlnet.yawltypes.TransitionType;
import yawlnet.yawltypes.YawltypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transistion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.yawltypes.impl.TransistionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link yawlnet.yawltypes.impl.TransistionImpl#getJoin <em>Join</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransistionImpl extends TransitionImpl implements Transistion {
	/**
	 * The cached value of the '{@link #getSplit() <em>Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplit()
	 * @generated
	 * @ordered
	 */
	protected TransitionType split;

	/**
	 * The cached value of the '{@link #getJoin() <em>Join</em>}' reference.
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
	protected TransistionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawltypesPackage.Literals.TRANSISTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getSplit() {
		if (split != null && split.eIsProxy()) {
			InternalEObject oldSplit = (InternalEObject)split;
			split = (TransitionType)eResolveProxy(oldSplit);
			if (split != oldSplit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawltypesPackage.TRANSISTION__SPLIT, oldSplit, split));
			}
		}
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType basicGetSplit() {
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplit(TransitionType newSplit) {
		TransitionType oldSplit = split;
		split = newSplit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawltypesPackage.TRANSISTION__SPLIT, oldSplit, split));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getJoin() {
		if (join != null && join.eIsProxy()) {
			InternalEObject oldJoin = (InternalEObject)join;
			join = (TransitionType)eResolveProxy(oldJoin);
			if (join != oldJoin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawltypesPackage.TRANSISTION__JOIN, oldJoin, join));
			}
		}
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType basicGetJoin() {
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoin(TransitionType newJoin) {
		TransitionType oldJoin = join;
		join = newJoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawltypesPackage.TRANSISTION__JOIN, oldJoin, join));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YawltypesPackage.TRANSISTION__SPLIT:
				if (resolve) return getSplit();
				return basicGetSplit();
			case YawltypesPackage.TRANSISTION__JOIN:
				if (resolve) return getJoin();
				return basicGetJoin();
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
			case YawltypesPackage.TRANSISTION__SPLIT:
				setSplit((TransitionType)newValue);
				return;
			case YawltypesPackage.TRANSISTION__JOIN:
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
			case YawltypesPackage.TRANSISTION__SPLIT:
				setSplit((TransitionType)null);
				return;
			case YawltypesPackage.TRANSISTION__JOIN:
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
			case YawltypesPackage.TRANSISTION__SPLIT:
				return split != null;
			case YawltypesPackage.TRANSISTION__JOIN:
				return join != null;
		}
		return super.eIsSet(featureID);
	}

} //TransistionImpl
