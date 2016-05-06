/**
 */
package yawlnet.yawltypes.impl;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

import yawlnet.yawltypes.YAWLnet;
import yawlnet.yawltypes.YawltypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YAW Lnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class YAWLnetImpl extends PetriNetTypeImpl implements YAWLnet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public YAWLnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YawltypesPackage.Literals.YAW_LNET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// The toString() must return the URI which must be unique for this Petri net type.
		return "http://dk.dtu.imm.se.mbse-pn.groupg.yawlnet";
	}

} //YAWLnetImpl
