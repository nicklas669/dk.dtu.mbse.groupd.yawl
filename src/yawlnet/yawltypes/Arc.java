/**
 */
package yawlnet.yawltypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.yawltypes.Arc#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see yawlnet.yawltypes.YawltypesPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends org.pnml.tools.epnk.pnmlcoremodel.Arc {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ArcType)
	 * @see yawlnet.yawltypes.YawltypesPackage#getArc_Type()
	 * @model
	 * @generated
	 */
	ArcType getType();

	/**
	 * Sets the value of the '{@link yawlnet.yawltypes.Arc#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ArcType value);

} // Arc
