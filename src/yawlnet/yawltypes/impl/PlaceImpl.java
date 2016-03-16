/**
 */
package yawlnet.yawltypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import yawlnet.yawltypes.Place;
import yawlnet.yawltypes.PlaceType;
import yawlnet.yawltypes.YawltypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.yawltypes.impl.PlaceImpl#getMarking <em>Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl implements Place {
	/**
	 * The cached value of the '{@link #getMarking() <em>Marking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected PlaceType marking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawltypesPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceType getMarking() {
		if (marking != null && marking.eIsProxy()) {
			InternalEObject oldMarking = (InternalEObject)marking;
			marking = (PlaceType)eResolveProxy(oldMarking);
			if (marking != oldMarking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YawltypesPackage.PLACE__MARKING, oldMarking, marking));
			}
		}
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceType basicGetMarking() {
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarking(PlaceType newMarking) {
		PlaceType oldMarking = marking;
		marking = newMarking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawltypesPackage.PLACE__MARKING, oldMarking, marking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YawltypesPackage.PLACE__MARKING:
				if (resolve) return getMarking();
				return basicGetMarking();
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
			case YawltypesPackage.PLACE__MARKING:
				setMarking((PlaceType)newValue);
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
			case YawltypesPackage.PLACE__MARKING:
				setMarking((PlaceType)null);
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
			case YawltypesPackage.PLACE__MARKING:
				return marking != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
