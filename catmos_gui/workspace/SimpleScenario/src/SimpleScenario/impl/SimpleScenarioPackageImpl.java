/**
 */
package SimpleScenario.impl;

import SimpleScenario.Capability;
import SimpleScenario.CapabilityUpgrade;
import SimpleScenario.Component;
import SimpleScenario.OurObject;
import SimpleScenario.Scenario;
import SimpleScenario.SimpleScenarioFactory;
import SimpleScenario.SimpleScenarioPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleScenarioPackageImpl extends EPackageImpl implements SimpleScenarioPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ourObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capabilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capabilityUpgradeEClass = null;

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
   * @see SimpleScenario.SimpleScenarioPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimpleScenarioPackageImpl()
  {
    super(eNS_URI, SimpleScenarioFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SimpleScenarioPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimpleScenarioPackage init()
  {
    if (isInited) return (SimpleScenarioPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleScenarioPackage.eNS_URI);

    // Obtain or create and register package
    SimpleScenarioPackageImpl theSimpleScenarioPackage = (SimpleScenarioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleScenarioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleScenarioPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSimpleScenarioPackage.createPackageContents();

    // Initialize created meta-data
    theSimpleScenarioPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimpleScenarioPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimpleScenarioPackage.eNS_URI, theSimpleScenarioPackage);
    return theSimpleScenarioPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScenario()
  {
    return scenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenario_OurObjects()
  {
    return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOurObject()
  {
    return ourObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapability()
  {
    return capabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_Name()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_SearchObjective()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_StandAlone()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_Reuse()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_StartDate()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_EndDate()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_Status()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_Colour()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapability_SequentialScheduling()
  {
    return (EAttribute)capabilityEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_Decomposes()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_SatisfiedBy()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_Satisfies()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Name()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_StartDate()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_EndDate()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Provides()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Upgrades()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Requires()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapabilityUpgrade()
  {
    return capabilityUpgradeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapabilityUpgrade_Name()
  {
    return (EAttribute)capabilityUpgradeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapabilityUpgrade_TargetComponent()
  {
    return (EAttribute)capabilityUpgradeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapabilityUpgrade_Upgrading()
  {
    return (EReference)capabilityUpgradeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleScenarioFactory getSimpleScenarioFactory()
  {
    return (SimpleScenarioFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    scenarioEClass = createEClass(SCENARIO);
    createEReference(scenarioEClass, SCENARIO__OUR_OBJECTS);

    ourObjectEClass = createEClass(OUR_OBJECT);

    capabilityEClass = createEClass(CAPABILITY);
    createEAttribute(capabilityEClass, CAPABILITY__NAME);
    createEAttribute(capabilityEClass, CAPABILITY__SEARCH_OBJECTIVE);
    createEAttribute(capabilityEClass, CAPABILITY__STAND_ALONE);
    createEAttribute(capabilityEClass, CAPABILITY__REUSE);
    createEAttribute(capabilityEClass, CAPABILITY__START_DATE);
    createEAttribute(capabilityEClass, CAPABILITY__END_DATE);
    createEAttribute(capabilityEClass, CAPABILITY__STATUS);
    createEAttribute(capabilityEClass, CAPABILITY__COLOUR);
    createEAttribute(capabilityEClass, CAPABILITY__SEQUENTIAL_SCHEDULING);
    createEReference(capabilityEClass, CAPABILITY__DECOMPOSES);
    createEReference(capabilityEClass, CAPABILITY__SATISFIED_BY);
    createEReference(capabilityEClass, CAPABILITY__SATISFIES);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEAttribute(componentEClass, COMPONENT__START_DATE);
    createEAttribute(componentEClass, COMPONENT__END_DATE);
    createEReference(componentEClass, COMPONENT__PROVIDES);
    createEReference(componentEClass, COMPONENT__UPGRADES);
    createEReference(componentEClass, COMPONENT__REQUIRES);

    capabilityUpgradeEClass = createEClass(CAPABILITY_UPGRADE);
    createEAttribute(capabilityUpgradeEClass, CAPABILITY_UPGRADE__NAME);
    createEAttribute(capabilityUpgradeEClass, CAPABILITY_UPGRADE__TARGET_COMPONENT);
    createEReference(capabilityUpgradeEClass, CAPABILITY_UPGRADE__UPGRADING);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    capabilityEClass.getESuperTypes().add(this.getOurObject());
    componentEClass.getESuperTypes().add(this.getOurObject());

    // Initialize classes and features; add operations and parameters
    initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScenario_OurObjects(), this.getOurObject(), null, "OurObjects", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ourObjectEClass, OurObject.class, "OurObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_SearchObjective(), ecorePackage.getEBooleanObject(), "searchObjective", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_StandAlone(), ecorePackage.getEBooleanObject(), "standAlone", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_Reuse(), ecorePackage.getEIntegerObject(), "reuse", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_Status(), ecorePackage.getEFloatObject(), "status", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_Colour(), ecorePackage.getEString(), "colour", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapability_SequentialScheduling(), ecorePackage.getEBooleanObject(), "sequentialScheduling", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_Decomposes(), this.getCapability(), null, "decomposes", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_SatisfiedBy(), this.getCapability(), this.getCapability_Satisfies(), "satisfiedBy", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_Satisfies(), this.getCapability(), this.getCapability_SatisfiedBy(), "satisfies", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Provides(), this.getCapability(), null, "provides", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Upgrades(), this.getCapabilityUpgrade(), null, "upgrades", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Requires(), this.getCapability(), null, "requires", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(capabilityUpgradeEClass, CapabilityUpgrade.class, "CapabilityUpgrade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCapabilityUpgrade_Name(), ecorePackage.getEString(), "name", null, 0, 1, CapabilityUpgrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapabilityUpgrade_TargetComponent(), ecorePackage.getEString(), "targetComponent", null, 0, 1, CapabilityUpgrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapabilityUpgrade_Upgrading(), this.getComponent(), null, "upgrading", null, 0, 1, CapabilityUpgrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf.diagram
    createGmfAnnotations();
    // gmf.compartment
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.link
    createGmf_3Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf.diagram";		
    addAnnotation
      (scenarioEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });										
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.compartment";			
    addAnnotation
      (getScenario_OurObjects(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });						
    addAnnotation
      (getComponent_Provides(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getComponent_Upgrades(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getComponent_Requires(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (capabilityEClass, 
       source, 
       new String[] 
       {
       "label", "name,colour",
       "label.pattern", "{0} : {1}"
       });				
    addAnnotation
      (componentEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });					
    addAnnotation
      (capabilityUpgradeEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });	
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.link";					
    addAnnotation
      (getCapability_Decomposes(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash",
       "color", "0,0,255"
       });		
    addAnnotation
      (getCapability_Satisfies(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash",
       "color", "0,0,255"
       });							
    addAnnotation
      (getCapabilityUpgrade_Upgrading(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash",
       "color", "0,0,255"
       });
  }

} //SimpleScenarioPackageImpl
