/**
 */
package pnmldatatypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pnmldatatypes.PnmldatatypesPackage
 * @generated
 */
public interface PnmldatatypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PnmldatatypesFactory eINSTANCE = pnmldatatypes.impl.PnmldatatypesFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PnmldatatypesPackage getPnmldatatypesPackage();

} //PnmldatatypesFactory
