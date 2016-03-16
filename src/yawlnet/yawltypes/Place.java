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
 *   <li>{@link yawlnet.yawltypes.Place#getMarking <em>Marking</em>}</li>
 * </ul>
 *
 * @see yawlnet.yawltypes.YawltypesPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Marking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marking</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marking</em>' reference.
	 * @see #setMarking(PlaceType)
	 * @see yawlnet.yawltypes.YawltypesPackage#getPlace_Marking()
	 * @model
	 * @generated
	 */
	PlaceType getMarking();

	/**
	 * Sets the value of the '{@link yawlnet.yawltypes.Place#getMarking <em>Marking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking</em>' reference.
	 * @see #getMarking()
	 * @generated
	 */
	void setMarking(PlaceType value);

} // Place
