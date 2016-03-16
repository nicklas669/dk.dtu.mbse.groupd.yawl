/**
 */
package yawlnet.yawltypes;

import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transistion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.yawltypes.Transistion#getSplit <em>Split</em>}</li>
 *   <li>{@link yawlnet.yawltypes.Transistion#getJoin <em>Join</em>}</li>
 * </ul>
 *
 * @see yawlnet.yawltypes.YawltypesPackage#getTransistion()
 * @model
 * @generated
 */
public interface Transistion extends Transition {
	/**
	 * Returns the value of the '<em><b>Split</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split</em>' reference.
	 * @see #setSplit(TransitionType)
	 * @see yawlnet.yawltypes.YawltypesPackage#getTransistion_Split()
	 * @model
	 * @generated
	 */
	TransitionType getSplit();

	/**
	 * Sets the value of the '{@link yawlnet.yawltypes.Transistion#getSplit <em>Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split</em>' reference.
	 * @see #getSplit()
	 * @generated
	 */
	void setSplit(TransitionType value);

	/**
	 * Returns the value of the '<em><b>Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' reference.
	 * @see #setJoin(TransitionType)
	 * @see yawlnet.yawltypes.YawltypesPackage#getTransistion_Join()
	 * @model
	 * @generated
	 */
	TransitionType getJoin();

	/**
	 * Sets the value of the '{@link yawlnet.yawltypes.Transistion#getJoin <em>Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' reference.
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(TransitionType value);

} // Transistion
