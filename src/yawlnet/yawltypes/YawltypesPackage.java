/**
 */
package yawlnet.yawltypes;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

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
 * @see yawlnet.yawltypes.YawltypesFactory
 * @model kind="package"
 * @generated
 */
public interface YawltypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yawltypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://compute.dtu.dk/mbse/groupdpetrinet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupdpn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YawltypesPackage eINSTANCE = yawlnet.yawltypes.impl.YawltypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.impl.PlaceImpl
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = PnmlcoremodelPackage.PLACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PnmlcoremodelPackage.PLACE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOOLSPECIFIC = PnmlcoremodelPackage.PLACE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__GRAPHICS = PnmlcoremodelPackage.PLACE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__UNKNOWN = PnmlcoremodelPackage.PLACE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUT = PnmlcoremodelPackage.PLACE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__IN = PnmlcoremodelPackage.PLACE__IN;

	/**
	 * The feature id for the '<em><b>Marking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__MARKING = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PnmlcoremodelPackage.PLACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.impl.TransistionImpl <em>Transistion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.impl.TransistionImpl
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getTransistion()
	 * @generated
	 */
	int TRANSISTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION__ID = PnmlcoremodelPackage.TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION__NAME = PnmlcoremodelPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION__TOOLSPECIFIC = PnmlcoremodelPackage.TRANSITION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION__GRAPHICS = PnmlcoremodelPackage.TRANSITION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION__UNKNOWN = PnmlcoremodelPackage.TRANSITION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION__OUT = PnmlcoremodelPackage.TRANSITION__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION__IN = PnmlcoremodelPackage.TRANSITION__IN;

	/**
	 * The feature id for the '<em><b>Split</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION__SPLIT = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION__JOIN = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transistion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSISTION_FEATURE_COUNT = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.impl.ArcImpl
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = PnmlcoremodelPackage.ARC__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PnmlcoremodelPackage.ARC__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TOOLSPECIFIC = PnmlcoremodelPackage.ARC__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__GRAPHICS = PnmlcoremodelPackage.ARC__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__UNKNOWN = PnmlcoremodelPackage.ARC__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = PnmlcoremodelPackage.ARC__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = PnmlcoremodelPackage.ARC__TARGET;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TYPE = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PnmlcoremodelPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.impl.YAWLnetImpl <em>YAW Lnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.impl.YAWLnetImpl
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getYAWLnet()
	 * @generated
	 */
	int YAW_LNET = 3;

	/**
	 * The number of structural features of the '<em>YAW Lnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAW_LNET_FEATURE_COUNT = PnmlcoremodelPackage.PETRI_NET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.impl.TransitionTypeImpl
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.impl.PlaceTypeImpl <em>Place Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.impl.PlaceTypeImpl
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getPlaceType()
	 * @generated
	 */
	int PLACE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The number of structural features of the '<em>Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.impl.ArcTypeImpl <em>Arc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.impl.ArcTypeImpl
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getArcType()
	 * @generated
	 */
	int ARC_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__TOOLSPECIFIC = PnmlcoremodelPackage.ATTRIBUTE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__GRAPHICS = PnmlcoremodelPackage.ATTRIBUTE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE__UNKNOWN = PnmlcoremodelPackage.ATTRIBUTE__UNKNOWN;

	/**
	 * The number of structural features of the '<em>Arc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_TYPE_FEATURE_COUNT = PnmlcoremodelPackage.ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.TransitionTypes <em>Transition Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.TransitionTypes
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getTransitionTypes()
	 * @generated
	 */
	int TRANSITION_TYPES = 7;

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.PlaceTypes <em>Place Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.PlaceTypes
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getPlaceTypes()
	 * @generated
	 */
	int PLACE_TYPES = 8;

	/**
	 * The meta object id for the '{@link yawlnet.yawltypes.ArcTypes <em>Arc Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see yawlnet.yawltypes.ArcTypes
	 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getArcTypes()
	 * @generated
	 */
	int ARC_TYPES = 9;


	/**
	 * Returns the meta object for class '{@link yawlnet.yawltypes.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see yawlnet.yawltypes.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the reference '{@link yawlnet.yawltypes.Place#getMarking <em>Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marking</em>'.
	 * @see yawlnet.yawltypes.Place#getMarking()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Marking();

	/**
	 * Returns the meta object for class '{@link yawlnet.yawltypes.Transistion <em>Transistion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transistion</em>'.
	 * @see yawlnet.yawltypes.Transistion
	 * @generated
	 */
	EClass getTransistion();

	/**
	 * Returns the meta object for the reference '{@link yawlnet.yawltypes.Transistion#getSplit <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Split</em>'.
	 * @see yawlnet.yawltypes.Transistion#getSplit()
	 * @see #getTransistion()
	 * @generated
	 */
	EReference getTransistion_Split();

	/**
	 * Returns the meta object for the reference '{@link yawlnet.yawltypes.Transistion#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Join</em>'.
	 * @see yawlnet.yawltypes.Transistion#getJoin()
	 * @see #getTransistion()
	 * @generated
	 */
	EReference getTransistion_Join();

	/**
	 * Returns the meta object for class '{@link yawlnet.yawltypes.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see yawlnet.yawltypes.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link yawlnet.yawltypes.Arc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see yawlnet.yawltypes.Arc#getType()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Type();

	/**
	 * Returns the meta object for class '{@link yawlnet.yawltypes.YAWLnet <em>YAW Lnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YAW Lnet</em>'.
	 * @see yawlnet.yawltypes.YAWLnet
	 * @generated
	 */
	EClass getYAWLnet();

	/**
	 * Returns the meta object for class '{@link yawlnet.yawltypes.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see yawlnet.yawltypes.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for class '{@link yawlnet.yawltypes.PlaceType <em>Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Type</em>'.
	 * @see yawlnet.yawltypes.PlaceType
	 * @generated
	 */
	EClass getPlaceType();

	/**
	 * Returns the meta object for class '{@link yawlnet.yawltypes.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc Type</em>'.
	 * @see yawlnet.yawltypes.ArcType
	 * @generated
	 */
	EClass getArcType();

	/**
	 * Returns the meta object for enum '{@link yawlnet.yawltypes.TransitionTypes <em>Transition Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Types</em>'.
	 * @see yawlnet.yawltypes.TransitionTypes
	 * @generated
	 */
	EEnum getTransitionTypes();

	/**
	 * Returns the meta object for enum '{@link yawlnet.yawltypes.PlaceTypes <em>Place Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Place Types</em>'.
	 * @see yawlnet.yawltypes.PlaceTypes
	 * @generated
	 */
	EEnum getPlaceTypes();

	/**
	 * Returns the meta object for enum '{@link yawlnet.yawltypes.ArcTypes <em>Arc Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arc Types</em>'.
	 * @see yawlnet.yawltypes.ArcTypes
	 * @generated
	 */
	EEnum getArcTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YawltypesFactory getYawltypesFactory();

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
		 * The meta object literal for the '{@link yawlnet.yawltypes.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.impl.PlaceImpl
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Marking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__MARKING = eINSTANCE.getPlace_Marking();

		/**
		 * The meta object literal for the '{@link yawlnet.yawltypes.impl.TransistionImpl <em>Transistion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.impl.TransistionImpl
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getTransistion()
		 * @generated
		 */
		EClass TRANSISTION = eINSTANCE.getTransistion();

		/**
		 * The meta object literal for the '<em><b>Split</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSISTION__SPLIT = eINSTANCE.getTransistion_Split();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSISTION__JOIN = eINSTANCE.getTransistion_Join();

		/**
		 * The meta object literal for the '{@link yawlnet.yawltypes.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.impl.ArcImpl
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TYPE = eINSTANCE.getArc_Type();

		/**
		 * The meta object literal for the '{@link yawlnet.yawltypes.impl.YAWLnetImpl <em>YAW Lnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.impl.YAWLnetImpl
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getYAWLnet()
		 * @generated
		 */
		EClass YAW_LNET = eINSTANCE.getYAWLnet();

		/**
		 * The meta object literal for the '{@link yawlnet.yawltypes.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.impl.TransitionTypeImpl
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getTransitionType()
		 * @generated
		 */
		EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '{@link yawlnet.yawltypes.impl.PlaceTypeImpl <em>Place Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.impl.PlaceTypeImpl
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getPlaceType()
		 * @generated
		 */
		EClass PLACE_TYPE = eINSTANCE.getPlaceType();

		/**
		 * The meta object literal for the '{@link yawlnet.yawltypes.impl.ArcTypeImpl <em>Arc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.impl.ArcTypeImpl
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getArcType()
		 * @generated
		 */
		EClass ARC_TYPE = eINSTANCE.getArcType();

		/**
		 * The meta object literal for the '{@link yawlnet.yawltypes.TransitionTypes <em>Transition Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.TransitionTypes
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getTransitionTypes()
		 * @generated
		 */
		EEnum TRANSITION_TYPES = eINSTANCE.getTransitionTypes();

		/**
		 * The meta object literal for the '{@link yawlnet.yawltypes.PlaceTypes <em>Place Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.PlaceTypes
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getPlaceTypes()
		 * @generated
		 */
		EEnum PLACE_TYPES = eINSTANCE.getPlaceTypes();

		/**
		 * The meta object literal for the '{@link yawlnet.yawltypes.ArcTypes <em>Arc Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see yawlnet.yawltypes.ArcTypes
		 * @see yawlnet.yawltypes.impl.YawltypesPackageImpl#getArcTypes()
		 * @generated
		 */
		EEnum ARC_TYPES = eINSTANCE.getArcTypes();

	}

} //YawltypesPackage
