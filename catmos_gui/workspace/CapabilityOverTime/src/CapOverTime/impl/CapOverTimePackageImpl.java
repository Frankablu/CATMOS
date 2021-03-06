/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime.impl;

import CapOverTime.CapOverTimeFactory;
import CapOverTime.CapOverTimePackage;
import CapOverTime.Capability;
import CapOverTime.CapabilityOverTime;
import CapOverTime.Measurement;
import CapOverTime.OurObject;
import CapOverTime.QualitativeValue;
import CapOverTime.TimePeriod;

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
public class CapOverTimePackageImpl extends EPackageImpl implements CapOverTimePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capabilityOverTimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timePeriodEClass = null;

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
  private EClass measurementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualitativeValueEClass = null;

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
   * @see CapOverTime.CapOverTimePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CapOverTimePackageImpl()
  {
    super(eNS_URI, CapOverTimeFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link CapOverTimePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CapOverTimePackage init()
  {
    if (isInited) return (CapOverTimePackage)EPackage.Registry.INSTANCE.getEPackage(CapOverTimePackage.eNS_URI);

    // Obtain or create and register package
    CapOverTimePackageImpl theCapOverTimePackage = (CapOverTimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CapOverTimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CapOverTimePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCapOverTimePackage.createPackageContents();

    // Initialize created meta-data
    theCapOverTimePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCapOverTimePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CapOverTimePackage.eNS_URI, theCapOverTimePackage);
    return theCapOverTimePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapabilityOverTime()
  {
    return capabilityOverTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapabilityOverTime_TimePeriods()
  {
    return (EReference)capabilityOverTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimePeriod()
  {
    return timePeriodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimePeriod_Name()
  {
    return (EAttribute)timePeriodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimePeriod_StartDate()
  {
    return (EAttribute)timePeriodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimePeriod_EndDate()
  {
    return (EAttribute)timePeriodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimePeriod_OurObjects()
  {
    return (EReference)timePeriodEClass.getEStructuralFeatures().get(3);
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
  public EReference getCapability_Accumulation()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_Measurements()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_Decomposes()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_SatisfiedBy()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_Satisfies()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMeasurement()
  {
    return measurementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasurement_Name()
  {
    return (EAttribute)measurementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasurement_CriticalValue()
  {
    return (EAttribute)measurementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasurement_BenchmarkValue()
  {
    return (EAttribute)measurementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasurement_ProvidedValue()
  {
    return (EAttribute)measurementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMeasurement_CriticalValues()
  {
    return (EReference)measurementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMeasurement_BenchmarkValues()
  {
    return (EReference)measurementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMeasurement_ProvidedValues()
  {
    return (EReference)measurementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasurement_Script()
  {
    return (EAttribute)measurementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualitativeValue()
  {
    return qualitativeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualitativeValue_Name()
  {
    return (EAttribute)qualitativeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapOverTimeFactory getCapOverTimeFactory()
  {
    return (CapOverTimeFactory)getEFactoryInstance();
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
    capabilityOverTimeEClass = createEClass(CAPABILITY_OVER_TIME);
    createEReference(capabilityOverTimeEClass, CAPABILITY_OVER_TIME__TIME_PERIODS);

    timePeriodEClass = createEClass(TIME_PERIOD);
    createEAttribute(timePeriodEClass, TIME_PERIOD__NAME);
    createEAttribute(timePeriodEClass, TIME_PERIOD__START_DATE);
    createEAttribute(timePeriodEClass, TIME_PERIOD__END_DATE);
    createEReference(timePeriodEClass, TIME_PERIOD__OUR_OBJECTS);

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
    createEReference(capabilityEClass, CAPABILITY__ACCUMULATION);
    createEReference(capabilityEClass, CAPABILITY__MEASUREMENTS);
    createEReference(capabilityEClass, CAPABILITY__DECOMPOSES);
    createEReference(capabilityEClass, CAPABILITY__SATISFIED_BY);
    createEReference(capabilityEClass, CAPABILITY__SATISFIES);

    measurementEClass = createEClass(MEASUREMENT);
    createEAttribute(measurementEClass, MEASUREMENT__NAME);
    createEAttribute(measurementEClass, MEASUREMENT__CRITICAL_VALUE);
    createEAttribute(measurementEClass, MEASUREMENT__BENCHMARK_VALUE);
    createEAttribute(measurementEClass, MEASUREMENT__PROVIDED_VALUE);
    createEReference(measurementEClass, MEASUREMENT__CRITICAL_VALUES);
    createEReference(measurementEClass, MEASUREMENT__BENCHMARK_VALUES);
    createEReference(measurementEClass, MEASUREMENT__PROVIDED_VALUES);
    createEAttribute(measurementEClass, MEASUREMENT__SCRIPT);

    qualitativeValueEClass = createEClass(QUALITATIVE_VALUE);
    createEAttribute(qualitativeValueEClass, QUALITATIVE_VALUE__NAME);
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

    // Initialize classes and features; add operations and parameters
    initEClass(capabilityOverTimeEClass, CapabilityOverTime.class, "CapabilityOverTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCapabilityOverTime_TimePeriods(), this.getTimePeriod(), null, "timePeriods", null, 0, -1, CapabilityOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timePeriodEClass, TimePeriod.class, "TimePeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimePeriod_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimePeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimePeriod_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, TimePeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimePeriod_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, TimePeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTimePeriod_OurObjects(), this.getOurObject(), null, "ourObjects", null, 0, -1, TimePeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getCapability_Accumulation(), this.getMeasurement(), null, "accumulation", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_Measurements(), this.getMeasurement(), null, "measurements", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_Decomposes(), this.getCapability(), null, "decomposes", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_SatisfiedBy(), this.getCapability(), this.getCapability_Satisfies(), "satisfiedBy", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_Satisfies(), this.getCapability(), this.getCapability_SatisfiedBy(), "satisfies", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(measurementEClass, Measurement.class, "Measurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeasurement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasurement_CriticalValue(), ecorePackage.getEFloatObject(), "criticalValue", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasurement_BenchmarkValue(), ecorePackage.getEFloatObject(), "benchmarkValue", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasurement_ProvidedValue(), ecorePackage.getEFloatObject(), "providedValue", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasurement_CriticalValues(), this.getQualitativeValue(), null, "criticalValues", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasurement_BenchmarkValues(), this.getQualitativeValue(), null, "benchmarkValues", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMeasurement_ProvidedValues(), this.getQualitativeValue(), null, "providedValues", null, 0, -1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasurement_Script(), ecorePackage.getEString(), "script", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualitativeValueEClass, QualitativeValue.class, "QualitativeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualitativeValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, QualitativeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
      (capabilityOverTimeEClass, 
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
      (getCapabilityOverTime_TimePeriods(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getTimePeriod_OurObjects(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });				
    addAnnotation
      (getCapability_Measurements(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });					
    addAnnotation
      (getMeasurement_CriticalValues(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getMeasurement_BenchmarkValues(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getMeasurement_ProvidedValues(), 
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
      (timePeriodEClass, 
       source, 
       new String[] 
       {
       "label", "startDate,endDate",
       "label.pattern", "{0} - {1}"
       });			
    addAnnotation
      (capabilityEClass, 
       source, 
       new String[] 
       {
       "label", "name,colour",
       "label.pattern", "{0} : {1}"
       });						
    addAnnotation
      (measurementEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });					
    addAnnotation
      (qualitativeValueEClass, 
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
      (getCapability_Accumulation(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash",
       "color", "0,0,255"
       });			
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
  }

} //CapOverTimePackageImpl
