/**
 */
package yawlnet.yawltypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.yawltypes.Place#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see yawlnet.yawltypes.YawltypesPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(PlaceType)
	 * @see yawlnet.yawltypes.YawltypesPackage#getPlace_Type()
	 * @model containment="true"
	 * @generated
	 */
	PlaceType getType();

	/**
	 * Sets the value of the '{@link yawlnet.yawltypes.Place#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PlaceType value);

} // Place
