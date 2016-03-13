/**
 */
package yawl.yawltypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl;

import yawl.yawltypes.Transistion;
import yawl.yawltypes.Type;
import yawl.yawltypes.yawltypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transistion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawl.yawltypes.impl.TransistionImpl#getSplit <em>Split</em>}</li>
 *   <li>{@link yawl.yawltypes.impl.TransistionImpl#getJoin <em>Join</em>}</li>
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
	protected Type split;

	/**
	 * The cached value of the '{@link #getJoin() <em>Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
	protected Type join;

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
		return yawltypesPackage.Literals.TRANSISTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSplit() {
		if (split != null && split.eIsProxy()) {
			InternalEObject oldSplit = (InternalEObject)split;
			split = (Type)eResolveProxy(oldSplit);
			if (split != oldSplit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, yawltypesPackage.TRANSISTION__SPLIT, oldSplit, split));
			}
		}
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSplit() {
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplit(Type newSplit) {
		Type oldSplit = split;
		split = newSplit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, yawltypesPackage.TRANSISTION__SPLIT, oldSplit, split));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getJoin() {
		if (join != null && join.eIsProxy()) {
			InternalEObject oldJoin = (InternalEObject)join;
			join = (Type)eResolveProxy(oldJoin);
			if (join != oldJoin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, yawltypesPackage.TRANSISTION__JOIN, oldJoin, join));
			}
		}
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetJoin() {
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoin(Type newJoin) {
		Type oldJoin = join;
		join = newJoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, yawltypesPackage.TRANSISTION__JOIN, oldJoin, join));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case yawltypesPackage.TRANSISTION__SPLIT:
				if (resolve) return getSplit();
				return basicGetSplit();
			case yawltypesPackage.TRANSISTION__JOIN:
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
			case yawltypesPackage.TRANSISTION__SPLIT:
				setSplit((Type)newValue);
				return;
			case yawltypesPackage.TRANSISTION__JOIN:
				setJoin((Type)newValue);
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
			case yawltypesPackage.TRANSISTION__SPLIT:
				setSplit((Type)null);
				return;
			case yawltypesPackage.TRANSISTION__JOIN:
				setJoin((Type)null);
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
			case yawltypesPackage.TRANSISTION__SPLIT:
				return split != null;
			case yawltypesPackage.TRANSISTION__JOIN:
				return join != null;
		}
		return super.eIsSet(featureID);
	}

} //TransistionImpl
