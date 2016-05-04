/**
 */
package yawlnet.yawltypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import pnmldatatypes.PnmldatatypesPackage;
import pnmldatatypes.impl.PnmldatatypesPackageImpl;
import yawlnet.yawltypes.Arc;
import yawlnet.yawltypes.ArcType;
import yawlnet.yawltypes.ArcTypes;
import yawlnet.yawltypes.Place;
import yawlnet.yawltypes.PlaceType;
import yawlnet.yawltypes.PlaceTypes;
import yawlnet.yawltypes.Transition;
import yawlnet.yawltypes.TransitionType;
import yawlnet.yawltypes.TransitionTypes;
import yawlnet.yawltypes.YAWLNetArcAnnotation;
import yawlnet.yawltypes.YAWLnet;
import yawlnet.yawltypes.YawltypesFactory;
import yawlnet.yawltypes.YawltypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YawltypesPackageImpl extends EPackageImpl implements YawltypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yawLnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yawlNetArcAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arcTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see yawlnet.yawltypes.YawltypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YawltypesPackageImpl() {
		super(eNS_URI, YawltypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link YawltypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YawltypesPackage init() {
		if (isInited) return (YawltypesPackage)EPackage.Registry.INSTANCE.getEPackage(YawltypesPackage.eNS_URI);

		// Obtain or create and register package
		YawltypesPackageImpl theYawltypesPackage = (YawltypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof YawltypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new YawltypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PnmlcoremodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PnmldatatypesPackageImpl thePnmldatatypesPackage = (PnmldatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PnmldatatypesPackage.eNS_URI) instanceof PnmldatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PnmldatatypesPackage.eNS_URI) : PnmldatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theYawltypesPackage.createPackageContents();
		thePnmldatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theYawltypesPackage.initializePackageContents();
		thePnmldatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYawltypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(YawltypesPackage.eNS_URI, theYawltypesPackage);
		return theYawltypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_Type() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Split() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Join() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Type() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Inscription() {
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYAWLnet() {
		return yawLnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionType() {
		return transitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionType_Text() {
		return (EAttribute)transitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceType() {
		return placeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceType_Text() {
		return (EAttribute)placeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArcType() {
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArcType_Text() {
		return (EAttribute)arcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYAWLNetArcAnnotation() {
		return yawlNetArcAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYAWLNetArcAnnotation_Text() {
		return (EAttribute)yawlNetArcAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionTypes() {
		return transitionTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlaceTypes() {
		return placeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArcTypes() {
		return arcTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YawltypesFactory getYawltypesFactory() {
		return (YawltypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__TYPE);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SPLIT);
		createEReference(transitionEClass, TRANSITION__JOIN);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__TYPE);
		createEReference(arcEClass, ARC__INSCRIPTION);

		yawLnetEClass = createEClass(YAW_LNET);

		transitionTypeEClass = createEClass(TRANSITION_TYPE);
		createEAttribute(transitionTypeEClass, TRANSITION_TYPE__TEXT);

		placeTypeEClass = createEClass(PLACE_TYPE);
		createEAttribute(placeTypeEClass, PLACE_TYPE__TEXT);

		arcTypeEClass = createEClass(ARC_TYPE);
		createEAttribute(arcTypeEClass, ARC_TYPE__TEXT);

		yawlNetArcAnnotationEClass = createEClass(YAWL_NET_ARC_ANNOTATION);
		createEAttribute(yawlNetArcAnnotationEClass, YAWL_NET_ARC_ANNOTATION__TEXT);

		// Create enums
		transitionTypesEEnum = createEEnum(TRANSITION_TYPES);
		placeTypesEEnum = createEEnum(PLACE_TYPES);
		arcTypesEEnum = createEEnum(ARC_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);
		PnmldatatypesPackage thePnmldatatypesPackage = (PnmldatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(PnmldatatypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPlace());
		transitionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getTransition());
		arcEClass.getESuperTypes().add(thePnmlcoremodelPackage.getArc());
		yawLnetEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPetriNetType());
		transitionTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		placeTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		arcTypeEClass.getESuperTypes().add(thePnmlcoremodelPackage.getAttribute());
		yawlNetArcAnnotationEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());

		// Initialize classes and features; add operations and parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_Type(), this.getPlaceType(), null, "type", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Split(), this.getTransitionType(), null, "split", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Join(), this.getTransitionType(), null, "join", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Type(), this.getArcType(), null, "type", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Inscription(), this.getYAWLNetArcAnnotation(), null, "inscription", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yawLnetEClass, YAWLnet.class, "YAWLnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionTypeEClass, TransitionType.class, "TransitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionType_Text(), this.getTransitionTypes(), "text", null, 0, 1, TransitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeTypeEClass, PlaceType.class, "PlaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceType_Text(), this.getPlaceTypes(), "text", null, 0, 1, PlaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcTypeEClass, ArcType.class, "ArcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArcType_Text(), this.getArcTypes(), "text", null, 0, 1, ArcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yawlNetArcAnnotationEClass, YAWLNetArcAnnotation.class, "YAWLNetArcAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYAWLNetArcAnnotation_Text(), thePnmldatatypesPackage.getPositiveInteger(), "text", "1", 1, 1, YAWLNetArcAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transitionTypesEEnum, TransitionTypes.class, "TransitionTypes");
		addEEnumLiteral(transitionTypesEEnum, TransitionTypes.AND);
		addEEnumLiteral(transitionTypesEEnum, TransitionTypes.XOR);
		addEEnumLiteral(transitionTypesEEnum, TransitionTypes.OR);

		initEEnum(placeTypesEEnum, PlaceTypes.class, "PlaceTypes");
		addEEnumLiteral(placeTypesEEnum, PlaceTypes.NORMAL);
		addEEnumLiteral(placeTypesEEnum, PlaceTypes.START);
		addEEnumLiteral(placeTypesEEnum, PlaceTypes.END);

		initEEnum(arcTypesEEnum, ArcTypes.class, "ArcTypes");
		addEEnumLiteral(arcTypesEEnum, ArcTypes.NORMAL);
		addEEnumLiteral(arcTypesEEnum, ArcTypes.RESETARC);

		// Create resource
		createResource(eNS_URI);
	}

} //YawltypesPackageImpl
