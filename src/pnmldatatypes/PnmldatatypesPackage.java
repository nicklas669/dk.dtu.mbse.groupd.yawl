/**
 */
package pnmldatatypes;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pnmldatatypes.PnmldatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface PnmldatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pnmldatatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/datatypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pnmldatatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PnmldatatypesPackage eINSTANCE = pnmldatatypes.impl.PnmldatatypesPackageImpl.init();

	/**
	 * The meta object id for the '<em>Positive Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger
	 * @see pnmldatatypes.impl.PnmldatatypesPackageImpl#getPositiveInteger()
	 * @generated
	 */
	int POSITIVE_INTEGER = 0;

	/**
	 * The meta object id for the '<em>Non Negative Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger
	 * @see pnmldatatypes.impl.PnmldatatypesPackageImpl#getNonNegativeInteger()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER = 1;


	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger <em>Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Integer</em>'.
	 * @see org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger
	 * @model instanceClass="org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger"
	 * @generated
	 */
	EDataType getPositiveInteger();

	/**
	 * Returns the meta object for data type '{@link org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger <em>Non Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Integer</em>'.
	 * @see org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger
	 * @model instanceClass="org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger"
	 * @generated
	 */
	EDataType getNonNegativeInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PnmldatatypesFactory getPnmldatatypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>Positive Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.datatypes.pnmldatatypes.PositiveInteger
		 * @see pnmldatatypes.impl.PnmldatatypesPackageImpl#getPositiveInteger()
		 * @generated
		 */
		EDataType POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

		/**
		 * The meta object literal for the '<em>Non Negative Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.pnml.tools.epnk.datatypes.pnmldatatypes.NonNegativeInteger
		 * @see pnmldatatypes.impl.PnmldatatypesPackageImpl#getNonNegativeInteger()
		 * @generated
		 */
		EDataType NON_NEGATIVE_INTEGER = eINSTANCE.getNonNegativeInteger();

	}

} //PnmldatatypesPackage
