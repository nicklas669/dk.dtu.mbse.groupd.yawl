/**
 */
package yawl.yawltypes;

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
 *   <li>{@link yawl.yawltypes.Transistion#getSplit <em>Split</em>}</li>
 *   <li>{@link yawl.yawltypes.Transistion#getJoin <em>Join</em>}</li>
 * </ul>
 *
 * @see yawl.yawltypes.yawltypesPackage#getTransistion()
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
	 * @see #setSplit(Type)
	 * @see yawl.yawltypes.yawltypesPackage#getTransistion_Split()
	 * @model
	 * @generated
	 */
	Type getSplit();

	/**
	 * Sets the value of the '{@link yawl.yawltypes.Transistion#getSplit <em>Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split</em>' reference.
	 * @see #getSplit()
	 * @generated
	 */
	void setSplit(Type value);

	/**
	 * Returns the value of the '<em><b>Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' reference.
	 * @see #setJoin(Type)
	 * @see yawl.yawltypes.yawltypesPackage#getTransistion_Join()
	 * @model
	 * @generated
	 */
	Type getJoin();

	/**
	 * Sets the value of the '{@link yawl.yawltypes.Transistion#getJoin <em>Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' reference.
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(Type value);

} // Transistion
