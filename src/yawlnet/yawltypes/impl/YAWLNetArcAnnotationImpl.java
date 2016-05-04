/**
 */
package yawlnet.yawltypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger;
import org.pnml.tools.epnk.pnmlcoremodel.impl.LabelImpl;

import pnmldatatypes.PnmldatatypesFactory;
import pnmldatatypes.PnmldatatypesPackage;
import yawlnet.yawltypes.YAWLNetArcAnnotation;
import yawlnet.yawltypes.YawltypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YAWL Net Arc Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.yawltypes.impl.YAWLNetArcAnnotationImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YAWLNetArcAnnotationImpl extends LabelImpl implements YAWLNetArcAnnotation {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final PositiveInteger TEXT_EDEFAULT = (PositiveInteger)PnmldatatypesFactory.eINSTANCE.createFromString(PnmldatatypesPackage.eINSTANCE.getPositiveInteger(), "1");

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected PositiveInteger text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YAWLNetArcAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawltypesPackage.Literals.YAWL_NET_ARC_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInteger getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(PositiveInteger newText) {
		PositiveInteger oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YawltypesPackage.YAWL_NET_ARC_ANNOTATION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YawltypesPackage.YAWL_NET_ARC_ANNOTATION__TEXT:
				return getText();
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
			case YawltypesPackage.YAWL_NET_ARC_ANNOTATION__TEXT:
				setText((PositiveInteger)newValue);
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
			case YawltypesPackage.YAWL_NET_ARC_ANNOTATION__TEXT:
				setText(TEXT_EDEFAULT);
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
			case YawltypesPackage.YAWL_NET_ARC_ANNOTATION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //YAWLNetArcAnnotationImpl
