/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see CapOverTime.CapOverTimeFactory
 * @model kind="package"
 * @generated
 */
public interface CapOverTimePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "CapOverTime";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "CapOverTime";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "p";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CapOverTimePackage eINSTANCE = CapOverTime.impl.CapOverTimePackageImpl.init();

  /**
   * The meta object id for the '{@link CapOverTime.impl.CapabilityOverTimeImpl <em>Capability Over Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see CapOverTime.impl.CapabilityOverTimeImpl
   * @see CapOverTime.impl.CapOverTimePackageImpl#getCapabilityOverTime()
   * @generated
   */
  int CAPABILITY_OVER_TIME = 0;

  /**
   * The feature id for the '<em><b>Time Periods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_OVER_TIME__TIME_PERIODS = 0;

  /**
   * The number of structural features of the '<em>Capability Over Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_OVER_TIME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link CapOverTime.impl.TimePeriodImpl <em>Time Period</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see CapOverTime.impl.TimePeriodImpl
   * @see CapOverTime.impl.CapOverTimePackageImpl#getTimePeriod()
   * @generated
   */
  int TIME_PERIOD = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_PERIOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_PERIOD__START_DATE = 1;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_PERIOD__END_DATE = 2;

  /**
   * The feature id for the '<em><b>Our Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_PERIOD__OUR_OBJECTS = 3;

  /**
   * The number of structural features of the '<em>Time Period</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_PERIOD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link CapOverTime.impl.OurObjectImpl <em>Our Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see CapOverTime.impl.OurObjectImpl
   * @see CapOverTime.impl.CapOverTimePackageImpl#getOurObject()
   * @generated
   */
  int OUR_OBJECT = 2;

  /**
   * The number of structural features of the '<em>Our Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUR_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link CapOverTime.impl.CapabilityImpl <em>Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see CapOverTime.impl.CapabilityImpl
   * @see CapOverTime.impl.CapOverTimePackageImpl#getCapability()
   * @generated
   */
  int CAPABILITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__NAME = OUR_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Search Objective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__SEARCH_OBJECTIVE = OUR_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stand Alone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__STAND_ALONE = OUR_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Reuse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__REUSE = OUR_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__START_DATE = OUR_OBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__END_DATE = OUR_OBJECT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__STATUS = OUR_OBJECT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Colour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__COLOUR = OUR_OBJECT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Accumulation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__ACCUMULATION = OUR_OBJECT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__MEASUREMENTS = OUR_OBJECT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Decomposes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__DECOMPOSES = OUR_OBJECT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__SATISFIED_BY = OUR_OBJECT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Satisfies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__SATISFIES = OUR_OBJECT_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_FEATURE_COUNT = OUR_OBJECT_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link CapOverTime.impl.MeasurementImpl <em>Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see CapOverTime.impl.MeasurementImpl
   * @see CapOverTime.impl.CapOverTimePackageImpl#getMeasurement()
   * @generated
   */
  int MEASUREMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Critical Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__CRITICAL_VALUE = 1;

  /**
   * The feature id for the '<em><b>Benchmark Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__BENCHMARK_VALUE = 2;

  /**
   * The feature id for the '<em><b>Provided Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__PROVIDED_VALUE = 3;

  /**
   * The feature id for the '<em><b>Critical Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__CRITICAL_VALUES = 4;

  /**
   * The feature id for the '<em><b>Benchmark Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__BENCHMARK_VALUES = 5;

  /**
   * The feature id for the '<em><b>Provided Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__PROVIDED_VALUES = 6;

  /**
   * The feature id for the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT__SCRIPT = 7;

  /**
   * The number of structural features of the '<em>Measurement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASUREMENT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link CapOverTime.impl.QualitativeValueImpl <em>Qualitative Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see CapOverTime.impl.QualitativeValueImpl
   * @see CapOverTime.impl.CapOverTimePackageImpl#getQualitativeValue()
   * @generated
   */
  int QUALITATIVE_VALUE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Qualitative Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_VALUE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link CapOverTime.CapabilityOverTime <em>Capability Over Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability Over Time</em>'.
   * @see CapOverTime.CapabilityOverTime
   * @generated
   */
  EClass getCapabilityOverTime();

  /**
   * Returns the meta object for the containment reference list '{@link CapOverTime.CapabilityOverTime#getTimePeriods <em>Time Periods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Time Periods</em>'.
   * @see CapOverTime.CapabilityOverTime#getTimePeriods()
   * @see #getCapabilityOverTime()
   * @generated
   */
  EReference getCapabilityOverTime_TimePeriods();

  /**
   * Returns the meta object for class '{@link CapOverTime.TimePeriod <em>Time Period</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Period</em>'.
   * @see CapOverTime.TimePeriod
   * @generated
   */
  EClass getTimePeriod();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.TimePeriod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see CapOverTime.TimePeriod#getName()
   * @see #getTimePeriod()
   * @generated
   */
  EAttribute getTimePeriod_Name();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.TimePeriod#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see CapOverTime.TimePeriod#getStartDate()
   * @see #getTimePeriod()
   * @generated
   */
  EAttribute getTimePeriod_StartDate();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.TimePeriod#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see CapOverTime.TimePeriod#getEndDate()
   * @see #getTimePeriod()
   * @generated
   */
  EAttribute getTimePeriod_EndDate();

  /**
   * Returns the meta object for the containment reference list '{@link CapOverTime.TimePeriod#getOurObjects <em>Our Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Our Objects</em>'.
   * @see CapOverTime.TimePeriod#getOurObjects()
   * @see #getTimePeriod()
   * @generated
   */
  EReference getTimePeriod_OurObjects();

  /**
   * Returns the meta object for class '{@link CapOverTime.OurObject <em>Our Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Our Object</em>'.
   * @see CapOverTime.OurObject
   * @generated
   */
  EClass getOurObject();

  /**
   * Returns the meta object for class '{@link CapOverTime.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability</em>'.
   * @see CapOverTime.Capability
   * @generated
   */
  EClass getCapability();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Capability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see CapOverTime.Capability#getName()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Name();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Capability#getSearchObjective <em>Search Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Search Objective</em>'.
   * @see CapOverTime.Capability#getSearchObjective()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_SearchObjective();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Capability#getStandAlone <em>Stand Alone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stand Alone</em>'.
   * @see CapOverTime.Capability#getStandAlone()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_StandAlone();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Capability#getReuse <em>Reuse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reuse</em>'.
   * @see CapOverTime.Capability#getReuse()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Reuse();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Capability#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see CapOverTime.Capability#getStartDate()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_StartDate();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Capability#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see CapOverTime.Capability#getEndDate()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_EndDate();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Capability#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see CapOverTime.Capability#getStatus()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Status();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Capability#getColour <em>Colour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Colour</em>'.
   * @see CapOverTime.Capability#getColour()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Colour();

  /**
   * Returns the meta object for the reference '{@link CapOverTime.Capability#getAccumulation <em>Accumulation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Accumulation</em>'.
   * @see CapOverTime.Capability#getAccumulation()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Accumulation();

  /**
   * Returns the meta object for the containment reference list '{@link CapOverTime.Capability#getMeasurements <em>Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Measurements</em>'.
   * @see CapOverTime.Capability#getMeasurements()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Measurements();

  /**
   * Returns the meta object for the reference list '{@link CapOverTime.Capability#getDecomposes <em>Decomposes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Decomposes</em>'.
   * @see CapOverTime.Capability#getDecomposes()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Decomposes();

  /**
   * Returns the meta object for the reference list '{@link CapOverTime.Capability#getSatisfiedBy <em>Satisfied By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Satisfied By</em>'.
   * @see CapOverTime.Capability#getSatisfiedBy()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_SatisfiedBy();

  /**
   * Returns the meta object for the reference list '{@link CapOverTime.Capability#getSatisfies <em>Satisfies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Satisfies</em>'.
   * @see CapOverTime.Capability#getSatisfies()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Satisfies();

  /**
   * Returns the meta object for class '{@link CapOverTime.Measurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measurement</em>'.
   * @see CapOverTime.Measurement
   * @generated
   */
  EClass getMeasurement();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Measurement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see CapOverTime.Measurement#getName()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_Name();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Measurement#getCriticalValue <em>Critical Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Critical Value</em>'.
   * @see CapOverTime.Measurement#getCriticalValue()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_CriticalValue();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Measurement#getBenchmarkValue <em>Benchmark Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Benchmark Value</em>'.
   * @see CapOverTime.Measurement#getBenchmarkValue()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_BenchmarkValue();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Measurement#getProvidedValue <em>Provided Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Provided Value</em>'.
   * @see CapOverTime.Measurement#getProvidedValue()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_ProvidedValue();

  /**
   * Returns the meta object for the containment reference list '{@link CapOverTime.Measurement#getCriticalValues <em>Critical Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Critical Values</em>'.
   * @see CapOverTime.Measurement#getCriticalValues()
   * @see #getMeasurement()
   * @generated
   */
  EReference getMeasurement_CriticalValues();

  /**
   * Returns the meta object for the containment reference list '{@link CapOverTime.Measurement#getBenchmarkValues <em>Benchmark Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Benchmark Values</em>'.
   * @see CapOverTime.Measurement#getBenchmarkValues()
   * @see #getMeasurement()
   * @generated
   */
  EReference getMeasurement_BenchmarkValues();

  /**
   * Returns the meta object for the containment reference list '{@link CapOverTime.Measurement#getProvidedValues <em>Provided Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provided Values</em>'.
   * @see CapOverTime.Measurement#getProvidedValues()
   * @see #getMeasurement()
   * @generated
   */
  EReference getMeasurement_ProvidedValues();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.Measurement#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Script</em>'.
   * @see CapOverTime.Measurement#getScript()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_Script();

  /**
   * Returns the meta object for class '{@link CapOverTime.QualitativeValue <em>Qualitative Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualitative Value</em>'.
   * @see CapOverTime.QualitativeValue
   * @generated
   */
  EClass getQualitativeValue();

  /**
   * Returns the meta object for the attribute '{@link CapOverTime.QualitativeValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see CapOverTime.QualitativeValue#getName()
   * @see #getQualitativeValue()
   * @generated
   */
  EAttribute getQualitativeValue_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CapOverTimeFactory getCapOverTimeFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link CapOverTime.impl.CapabilityOverTimeImpl <em>Capability Over Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see CapOverTime.impl.CapabilityOverTimeImpl
     * @see CapOverTime.impl.CapOverTimePackageImpl#getCapabilityOverTime()
     * @generated
     */
    EClass CAPABILITY_OVER_TIME = eINSTANCE.getCapabilityOverTime();

    /**
     * The meta object literal for the '<em><b>Time Periods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY_OVER_TIME__TIME_PERIODS = eINSTANCE.getCapabilityOverTime_TimePeriods();

    /**
     * The meta object literal for the '{@link CapOverTime.impl.TimePeriodImpl <em>Time Period</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see CapOverTime.impl.TimePeriodImpl
     * @see CapOverTime.impl.CapOverTimePackageImpl#getTimePeriod()
     * @generated
     */
    EClass TIME_PERIOD = eINSTANCE.getTimePeriod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_PERIOD__NAME = eINSTANCE.getTimePeriod_Name();

    /**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_PERIOD__START_DATE = eINSTANCE.getTimePeriod_StartDate();

    /**
     * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_PERIOD__END_DATE = eINSTANCE.getTimePeriod_EndDate();

    /**
     * The meta object literal for the '<em><b>Our Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIME_PERIOD__OUR_OBJECTS = eINSTANCE.getTimePeriod_OurObjects();

    /**
     * The meta object literal for the '{@link CapOverTime.impl.OurObjectImpl <em>Our Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see CapOverTime.impl.OurObjectImpl
     * @see CapOverTime.impl.CapOverTimePackageImpl#getOurObject()
     * @generated
     */
    EClass OUR_OBJECT = eINSTANCE.getOurObject();

    /**
     * The meta object literal for the '{@link CapOverTime.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see CapOverTime.impl.CapabilityImpl
     * @see CapOverTime.impl.CapOverTimePackageImpl#getCapability()
     * @generated
     */
    EClass CAPABILITY = eINSTANCE.getCapability();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

    /**
     * The meta object literal for the '<em><b>Search Objective</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__SEARCH_OBJECTIVE = eINSTANCE.getCapability_SearchObjective();

    /**
     * The meta object literal for the '<em><b>Stand Alone</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__STAND_ALONE = eINSTANCE.getCapability_StandAlone();

    /**
     * The meta object literal for the '<em><b>Reuse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__REUSE = eINSTANCE.getCapability_Reuse();

    /**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__START_DATE = eINSTANCE.getCapability_StartDate();

    /**
     * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__END_DATE = eINSTANCE.getCapability_EndDate();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__STATUS = eINSTANCE.getCapability_Status();

    /**
     * The meta object literal for the '<em><b>Colour</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__COLOUR = eINSTANCE.getCapability_Colour();

    /**
     * The meta object literal for the '<em><b>Accumulation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__ACCUMULATION = eINSTANCE.getCapability_Accumulation();

    /**
     * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__MEASUREMENTS = eINSTANCE.getCapability_Measurements();

    /**
     * The meta object literal for the '<em><b>Decomposes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__DECOMPOSES = eINSTANCE.getCapability_Decomposes();

    /**
     * The meta object literal for the '<em><b>Satisfied By</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__SATISFIED_BY = eINSTANCE.getCapability_SatisfiedBy();

    /**
     * The meta object literal for the '<em><b>Satisfies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__SATISFIES = eINSTANCE.getCapability_Satisfies();

    /**
     * The meta object literal for the '{@link CapOverTime.impl.MeasurementImpl <em>Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see CapOverTime.impl.MeasurementImpl
     * @see CapOverTime.impl.CapOverTimePackageImpl#getMeasurement()
     * @generated
     */
    EClass MEASUREMENT = eINSTANCE.getMeasurement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT__NAME = eINSTANCE.getMeasurement_Name();

    /**
     * The meta object literal for the '<em><b>Critical Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT__CRITICAL_VALUE = eINSTANCE.getMeasurement_CriticalValue();

    /**
     * The meta object literal for the '<em><b>Benchmark Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT__BENCHMARK_VALUE = eINSTANCE.getMeasurement_BenchmarkValue();

    /**
     * The meta object literal for the '<em><b>Provided Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT__PROVIDED_VALUE = eINSTANCE.getMeasurement_ProvidedValue();

    /**
     * The meta object literal for the '<em><b>Critical Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEASUREMENT__CRITICAL_VALUES = eINSTANCE.getMeasurement_CriticalValues();

    /**
     * The meta object literal for the '<em><b>Benchmark Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEASUREMENT__BENCHMARK_VALUES = eINSTANCE.getMeasurement_BenchmarkValues();

    /**
     * The meta object literal for the '<em><b>Provided Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEASUREMENT__PROVIDED_VALUES = eINSTANCE.getMeasurement_ProvidedValues();

    /**
     * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEASUREMENT__SCRIPT = eINSTANCE.getMeasurement_Script();

    /**
     * The meta object literal for the '{@link CapOverTime.impl.QualitativeValueImpl <em>Qualitative Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see CapOverTime.impl.QualitativeValueImpl
     * @see CapOverTime.impl.CapOverTimePackageImpl#getQualitativeValue()
     * @generated
     */
    EClass QUALITATIVE_VALUE = eINSTANCE.getQualitativeValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITATIVE_VALUE__NAME = eINSTANCE.getQualitativeValue_Name();

  }

} //CapOverTimePackage
