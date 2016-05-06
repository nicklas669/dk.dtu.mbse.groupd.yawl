/**
 */
package yawlnet.yawltypes;

import org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger;
import org.pnml.tools.epnk.pnmlcoremodel.Label;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YAWL Net Arc Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link yawlnet.yawltypes.YAWLNetArcAnnotation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see yawlnet.yawltypes.YawltypesPackage#getYAWLNetArcAnnotation()
 * @model
 * @generated
 */
public interface YAWLNetArcAnnotation extends Label {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(PositiveInteger)
	 * @see yawlnet.yawltypes.YawltypesPackage#getYAWLNetArcAnnotation_Text()
	 * @model default="1" dataType="org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger" required="true"
	 * @generated
	 */
	PositiveInteger getText();

	/**
	 * Sets the value of the '{@link yawlnet.yawltypes.YAWLNetArcAnnotation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(PositiveInteger value);

} // YAWLNetArcAnnotation
