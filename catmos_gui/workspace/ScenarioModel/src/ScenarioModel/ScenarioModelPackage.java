/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;

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
 * @see ScenarioModel.ScenarioModelFactory
 * @model kind="package"
 * @generated
 */
public interface ScenarioModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ScenarioModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "ScenarioModel";

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
  ScenarioModelPackage eINSTANCE = ScenarioModel.impl.ScenarioModelPackageImpl.init();

  /**
   * The meta object id for the '{@link ScenarioModel.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.ScenarioImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 0;

  /**
   * The feature id for the '<em><b>Our Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__OUR_OBJECTS = 0;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.OurObjectImpl <em>Our Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.OurObjectImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getOurObject()
   * @generated
   */
  int OUR_OBJECT = 1;

  /**
   * The number of structural features of the '<em>Our Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUR_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.CapabilityImpl <em>Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.CapabilityImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCapability()
   * @generated
   */
  int CAPABILITY = 2;

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
   * The feature id for the '<em><b>Sequential Scheduling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__SEQUENTIAL_SCHEDULING = OUR_OBJECT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Accumulation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__ACCUMULATION = OUR_OBJECT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__MEASUREMENTS = OUR_OBJECT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Decomposes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__DECOMPOSES = OUR_OBJECT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__SATISFIED_BY = OUR_OBJECT_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Satisfies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__SATISFIES = OUR_OBJECT_FEATURE_COUNT + 13;

  /**
   * The number of structural features of the '<em>Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_FEATURE_COUNT = OUR_OBJECT_FEATURE_COUNT + 14;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.CapabilityProvisionImpl <em>Capability Provision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.CapabilityProvisionImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCapabilityProvision()
   * @generated
   */
  int CAPABILITY_PROVISION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__NAME = CAPABILITY__NAME;

  /**
   * The feature id for the '<em><b>Search Objective</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__SEARCH_OBJECTIVE = CAPABILITY__SEARCH_OBJECTIVE;

  /**
   * The feature id for the '<em><b>Stand Alone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__STAND_ALONE = CAPABILITY__STAND_ALONE;

  /**
   * The feature id for the '<em><b>Reuse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__REUSE = CAPABILITY__REUSE;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__START_DATE = CAPABILITY__START_DATE;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__END_DATE = CAPABILITY__END_DATE;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__STATUS = CAPABILITY__STATUS;

  /**
   * The feature id for the '<em><b>Colour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__COLOUR = CAPABILITY__COLOUR;

  /**
   * The feature id for the '<em><b>Sequential Scheduling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__SEQUENTIAL_SCHEDULING = CAPABILITY__SEQUENTIAL_SCHEDULING;

  /**
   * The feature id for the '<em><b>Accumulation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__ACCUMULATION = CAPABILITY__ACCUMULATION;

  /**
   * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__MEASUREMENTS = CAPABILITY__MEASUREMENTS;

  /**
   * The feature id for the '<em><b>Decomposes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__DECOMPOSES = CAPABILITY__DECOMPOSES;

  /**
   * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__SATISFIED_BY = CAPABILITY__SATISFIED_BY;

  /**
   * The feature id for the '<em><b>Satisfies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION__SATISFIES = CAPABILITY__SATISFIES;

  /**
   * The number of structural features of the '<em>Capability Provision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_PROVISION_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.MeasurementImpl <em>Measurement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.MeasurementImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getMeasurement()
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
   * The meta object id for the '{@link ScenarioModel.impl.QualitativeValueImpl <em>Qualitative Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.QualitativeValueImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getQualitativeValue()
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
   * The meta object id for the '{@link ScenarioModel.impl.QualitativeValueDictionaryImpl <em>Qualitative Value Dictionary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.QualitativeValueDictionaryImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getQualitativeValueDictionary()
   * @generated
   */
  int QUALITATIVE_VALUE_DICTIONARY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_VALUE_DICTIONARY__NAME = OUR_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Greater Than</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN = OUR_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Less Than</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_VALUE_DICTIONARY__LESS_THAN = OUR_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Qualitative Value Dictionary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALITATIVE_VALUE_DICTIONARY_FEATURE_COUNT = OUR_OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.ComponentImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = OUR_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__START_DATE = OUR_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__END_DATE = OUR_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Provides</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PROVIDES = OUR_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Upgrades</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__UPGRADES = OUR_OBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Requires</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__REQUIRES = OUR_OBJECT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Costs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__COSTS = OUR_OBJECT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = OUR_OBJECT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.CostImpl <em>Cost</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.CostImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCost()
   * @generated
   */
  int COST = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COST__NAME = 0;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COST__AMOUNT = 1;

  /**
   * The feature id for the '<em><b>Start After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COST__START_AFTER = 2;

  /**
   * The feature id for the '<em><b>Repeat Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COST__REPEAT_DURATION = 3;

  /**
   * The feature id for the '<em><b>Stop After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COST__STOP_AFTER = 4;

  /**
   * The number of structural features of the '<em>Cost</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COST_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.CapabilityUpgradeImpl <em>Capability Upgrade</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.CapabilityUpgradeImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCapabilityUpgrade()
   * @generated
   */
  int CAPABILITY_UPGRADE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_UPGRADE__NAME = 0;

  /**
   * The feature id for the '<em><b>Target Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_UPGRADE__TARGET_COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Upgrading</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_UPGRADE__UPGRADING = 2;

  /**
   * The feature id for the '<em><b>Capability Changes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_UPGRADE__CAPABILITY_CHANGES = 3;

  /**
   * The number of structural features of the '<em>Capability Upgrade</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_UPGRADE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.CapabilityChangeImpl <em>Capability Change</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.CapabilityChangeImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCapabilityChange()
   * @generated
   */
  int CAPABILITY_CHANGE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_CHANGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_CHANGE__CAPABILITIES = 1;

  /**
   * The number of structural features of the '<em>Capability Change</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_CHANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.RunConfigurationImpl <em>Run Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.RunConfigurationImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getRunConfiguration()
   * @generated
   */
  int RUN_CONFIGURATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_CONFIGURATION__NAME = OUR_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pop Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_CONFIGURATION__POP_SIZE = OUR_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Gen Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_CONFIGURATION__GEN_COUNT = OUR_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Run Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_CONFIGURATION_FEATURE_COUNT = OUR_OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.FindTradeOffsImpl <em>Find Trade Offs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.FindTradeOffsImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getFindTradeOffs()
   * @generated
   */
  int FIND_TRADE_OFFS = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_TRADE_OFFS__NAME = RUN_CONFIGURATION__NAME;

  /**
   * The feature id for the '<em><b>Pop Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_TRADE_OFFS__POP_SIZE = RUN_CONFIGURATION__POP_SIZE;

  /**
   * The feature id for the '<em><b>Gen Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_TRADE_OFFS__GEN_COUNT = RUN_CONFIGURATION__GEN_COUNT;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_TRADE_OFFS__COMPONENTS = RUN_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_TRADE_OFFS__CONSTRAINTS = RUN_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Find Trade Offs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIND_TRADE_OFFS_FEATURE_COUNT = RUN_CONFIGURATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.ThroughLifePlanningImpl <em>Through Life Planning</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.ThroughLifePlanningImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getThroughLifePlanning()
   * @generated
   */
  int THROUGH_LIFE_PLANNING = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROUGH_LIFE_PLANNING__NAME = RUN_CONFIGURATION__NAME;

  /**
   * The feature id for the '<em><b>Pop Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROUGH_LIFE_PLANNING__POP_SIZE = RUN_CONFIGURATION__POP_SIZE;

  /**
   * The feature id for the '<em><b>Gen Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROUGH_LIFE_PLANNING__GEN_COUNT = RUN_CONFIGURATION__GEN_COUNT;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROUGH_LIFE_PLANNING__COMPONENTS = RUN_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROUGH_LIFE_PLANNING__START_DATE = RUN_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROUGH_LIFE_PLANNING__END_DATE = RUN_CONFIGURATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROUGH_LIFE_PLANNING__CONSTRAINTS = RUN_CONFIGURATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Through Life Planning</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THROUGH_LIFE_PLANNING_FEATURE_COUNT = RUN_CONFIGURATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.ComponentUImpl <em>Component U</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.ComponentUImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getComponentU()
   * @generated
   */
  int COMPONENT_U = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_U__NAME = 0;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_U__QUANTITY = 1;

  /**
   * The number of structural features of the '<em>Component U</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_U_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.ExistingComponentImpl <em>Existing Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.ExistingComponentImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getExistingComponent()
   * @generated
   */
  int EXISTING_COMPONENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTING_COMPONENT__NAME = COMPONENT_U__NAME;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTING_COMPONENT__QUANTITY = COMPONENT_U__QUANTITY;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTING_COMPONENT__START_DATE = COMPONENT_U_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTING_COMPONENT__END_DATE = COMPONENT_U_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Existing Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTING_COMPONENT_FEATURE_COUNT = COMPONENT_U_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.AcquirableComponentImpl <em>Acquirable Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.AcquirableComponentImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getAcquirableComponent()
   * @generated
   */
  int ACQUIRABLE_COMPONENT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACQUIRABLE_COMPONENT__NAME = COMPONENT_U__NAME;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACQUIRABLE_COMPONENT__QUANTITY = COMPONENT_U__QUANTITY;

  /**
   * The feature id for the '<em><b>Acquisition Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACQUIRABLE_COMPONENT__ACQUISITION_TIME = COMPONENT_U_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Life Span</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACQUIRABLE_COMPONENT__LIFE_SPAN = COMPONENT_U_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Acquirable Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACQUIRABLE_COMPONENT_FEATURE_COUNT = COMPONENT_U_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.ConstraintImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 17;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.DesireHighImpl <em>Desire High</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.DesireHighImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getDesireHigh()
   * @generated
   */
  int DESIRE_HIGH = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIRE_HIGH__NAME = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Desire High</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIRE_HIGH_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.DesireLowImpl <em>Desire Low</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.DesireLowImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getDesireLow()
   * @generated
   */
  int DESIRE_LOW = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIRE_LOW__NAME = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Desire Low</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIRE_LOW_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link ScenarioModel.impl.BudgetImpl <em>Budget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ScenarioModel.impl.BudgetImpl
   * @see ScenarioModel.impl.ScenarioModelPackageImpl#getBudget()
   * @generated
   */
  int BUDGET = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET__NAME = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET__AMOUNT = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET__START_DATE = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Repeat Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET__REPEAT_DURATION = CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET__END_DATE = CONSTRAINT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Budget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUDGET_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 5;


  /**
   * Returns the meta object for class '{@link ScenarioModel.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see ScenarioModel.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.Scenario#getOurObjects <em>Our Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Our Objects</em>'.
   * @see ScenarioModel.Scenario#getOurObjects()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_OurObjects();

  /**
   * Returns the meta object for class '{@link ScenarioModel.OurObject <em>Our Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Our Object</em>'.
   * @see ScenarioModel.OurObject
   * @generated
   */
  EClass getOurObject();

  /**
   * Returns the meta object for class '{@link ScenarioModel.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability</em>'.
   * @see ScenarioModel.Capability
   * @generated
   */
  EClass getCapability();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Capability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.Capability#getName()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Name();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Capability#getSearchObjective <em>Search Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Search Objective</em>'.
   * @see ScenarioModel.Capability#getSearchObjective()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_SearchObjective();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Capability#getStandAlone <em>Stand Alone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stand Alone</em>'.
   * @see ScenarioModel.Capability#getStandAlone()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_StandAlone();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Capability#getReuse <em>Reuse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reuse</em>'.
   * @see ScenarioModel.Capability#getReuse()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Reuse();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Capability#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see ScenarioModel.Capability#getStartDate()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_StartDate();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Capability#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see ScenarioModel.Capability#getEndDate()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_EndDate();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Capability#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see ScenarioModel.Capability#getStatus()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Status();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Capability#getColour <em>Colour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Colour</em>'.
   * @see ScenarioModel.Capability#getColour()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Colour();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Capability#getSequentialScheduling <em>Sequential Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequential Scheduling</em>'.
   * @see ScenarioModel.Capability#getSequentialScheduling()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_SequentialScheduling();

  /**
   * Returns the meta object for the reference '{@link ScenarioModel.Capability#getAccumulation <em>Accumulation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Accumulation</em>'.
   * @see ScenarioModel.Capability#getAccumulation()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Accumulation();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.Capability#getMeasurements <em>Measurements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Measurements</em>'.
   * @see ScenarioModel.Capability#getMeasurements()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Measurements();

  /**
   * Returns the meta object for the reference list '{@link ScenarioModel.Capability#getDecomposes <em>Decomposes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Decomposes</em>'.
   * @see ScenarioModel.Capability#getDecomposes()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Decomposes();

  /**
   * Returns the meta object for the reference list '{@link ScenarioModel.Capability#getSatisfiedBy <em>Satisfied By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Satisfied By</em>'.
   * @see ScenarioModel.Capability#getSatisfiedBy()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_SatisfiedBy();

  /**
   * Returns the meta object for the reference list '{@link ScenarioModel.Capability#getSatisfies <em>Satisfies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Satisfies</em>'.
   * @see ScenarioModel.Capability#getSatisfies()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Satisfies();

  /**
   * Returns the meta object for class '{@link ScenarioModel.CapabilityProvision <em>Capability Provision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability Provision</em>'.
   * @see ScenarioModel.CapabilityProvision
   * @generated
   */
  EClass getCapabilityProvision();

  /**
   * Returns the meta object for class '{@link ScenarioModel.Measurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measurement</em>'.
   * @see ScenarioModel.Measurement
   * @generated
   */
  EClass getMeasurement();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Measurement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.Measurement#getName()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_Name();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Measurement#getCriticalValue <em>Critical Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Critical Value</em>'.
   * @see ScenarioModel.Measurement#getCriticalValue()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_CriticalValue();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Measurement#getBenchmarkValue <em>Benchmark Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Benchmark Value</em>'.
   * @see ScenarioModel.Measurement#getBenchmarkValue()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_BenchmarkValue();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Measurement#getProvidedValue <em>Provided Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Provided Value</em>'.
   * @see ScenarioModel.Measurement#getProvidedValue()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_ProvidedValue();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.Measurement#getCriticalValues <em>Critical Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Critical Values</em>'.
   * @see ScenarioModel.Measurement#getCriticalValues()
   * @see #getMeasurement()
   * @generated
   */
  EReference getMeasurement_CriticalValues();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.Measurement#getBenchmarkValues <em>Benchmark Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Benchmark Values</em>'.
   * @see ScenarioModel.Measurement#getBenchmarkValues()
   * @see #getMeasurement()
   * @generated
   */
  EReference getMeasurement_BenchmarkValues();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.Measurement#getProvidedValues <em>Provided Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provided Values</em>'.
   * @see ScenarioModel.Measurement#getProvidedValues()
   * @see #getMeasurement()
   * @generated
   */
  EReference getMeasurement_ProvidedValues();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Measurement#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Script</em>'.
   * @see ScenarioModel.Measurement#getScript()
   * @see #getMeasurement()
   * @generated
   */
  EAttribute getMeasurement_Script();

  /**
   * Returns the meta object for class '{@link ScenarioModel.QualitativeValue <em>Qualitative Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualitative Value</em>'.
   * @see ScenarioModel.QualitativeValue
   * @generated
   */
  EClass getQualitativeValue();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.QualitativeValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.QualitativeValue#getName()
   * @see #getQualitativeValue()
   * @generated
   */
  EAttribute getQualitativeValue_Name();

  /**
   * Returns the meta object for class '{@link ScenarioModel.QualitativeValueDictionary <em>Qualitative Value Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualitative Value Dictionary</em>'.
   * @see ScenarioModel.QualitativeValueDictionary
   * @generated
   */
  EClass getQualitativeValueDictionary();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.QualitativeValueDictionary#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.QualitativeValueDictionary#getName()
   * @see #getQualitativeValueDictionary()
   * @generated
   */
  EAttribute getQualitativeValueDictionary_Name();

  /**
   * Returns the meta object for the reference '{@link ScenarioModel.QualitativeValueDictionary#getGreaterThan <em>Greater Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Greater Than</em>'.
   * @see ScenarioModel.QualitativeValueDictionary#getGreaterThan()
   * @see #getQualitativeValueDictionary()
   * @generated
   */
  EReference getQualitativeValueDictionary_GreaterThan();

  /**
   * Returns the meta object for the reference '{@link ScenarioModel.QualitativeValueDictionary#getLessThan <em>Less Than</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Less Than</em>'.
   * @see ScenarioModel.QualitativeValueDictionary#getLessThan()
   * @see #getQualitativeValueDictionary()
   * @generated
   */
  EReference getQualitativeValueDictionary_LessThan();

  /**
   * Returns the meta object for class '{@link ScenarioModel.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see ScenarioModel.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Component#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see ScenarioModel.Component#getStartDate()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_StartDate();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Component#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see ScenarioModel.Component#getEndDate()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_EndDate();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.Component#getProvides <em>Provides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provides</em>'.
   * @see ScenarioModel.Component#getProvides()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Provides();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.Component#getUpgrades <em>Upgrades</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Upgrades</em>'.
   * @see ScenarioModel.Component#getUpgrades()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Upgrades();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.Component#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requires</em>'.
   * @see ScenarioModel.Component#getRequires()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Requires();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.Component#getCosts <em>Costs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Costs</em>'.
   * @see ScenarioModel.Component#getCosts()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Costs();

  /**
   * Returns the meta object for class '{@link ScenarioModel.Cost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cost</em>'.
   * @see ScenarioModel.Cost
   * @generated
   */
  EClass getCost();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Cost#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.Cost#getName()
   * @see #getCost()
   * @generated
   */
  EAttribute getCost_Name();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Cost#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see ScenarioModel.Cost#getAmount()
   * @see #getCost()
   * @generated
   */
  EAttribute getCost_Amount();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Cost#getStartAfter <em>Start After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start After</em>'.
   * @see ScenarioModel.Cost#getStartAfter()
   * @see #getCost()
   * @generated
   */
  EAttribute getCost_StartAfter();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Cost#getRepeatDuration <em>Repeat Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeat Duration</em>'.
   * @see ScenarioModel.Cost#getRepeatDuration()
   * @see #getCost()
   * @generated
   */
  EAttribute getCost_RepeatDuration();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Cost#getStopAfter <em>Stop After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stop After</em>'.
   * @see ScenarioModel.Cost#getStopAfter()
   * @see #getCost()
   * @generated
   */
  EAttribute getCost_StopAfter();

  /**
   * Returns the meta object for class '{@link ScenarioModel.CapabilityUpgrade <em>Capability Upgrade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability Upgrade</em>'.
   * @see ScenarioModel.CapabilityUpgrade
   * @generated
   */
  EClass getCapabilityUpgrade();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.CapabilityUpgrade#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.CapabilityUpgrade#getName()
   * @see #getCapabilityUpgrade()
   * @generated
   */
  EAttribute getCapabilityUpgrade_Name();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.CapabilityUpgrade#getTargetComponent <em>Target Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Component</em>'.
   * @see ScenarioModel.CapabilityUpgrade#getTargetComponent()
   * @see #getCapabilityUpgrade()
   * @generated
   */
  EAttribute getCapabilityUpgrade_TargetComponent();

  /**
   * Returns the meta object for the reference '{@link ScenarioModel.CapabilityUpgrade#getUpgrading <em>Upgrading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Upgrading</em>'.
   * @see ScenarioModel.CapabilityUpgrade#getUpgrading()
   * @see #getCapabilityUpgrade()
   * @generated
   */
  EReference getCapabilityUpgrade_Upgrading();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.CapabilityUpgrade#getCapabilityChanges <em>Capability Changes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Capability Changes</em>'.
   * @see ScenarioModel.CapabilityUpgrade#getCapabilityChanges()
   * @see #getCapabilityUpgrade()
   * @generated
   */
  EReference getCapabilityUpgrade_CapabilityChanges();

  /**
   * Returns the meta object for class '{@link ScenarioModel.CapabilityChange <em>Capability Change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability Change</em>'.
   * @see ScenarioModel.CapabilityChange
   * @generated
   */
  EClass getCapabilityChange();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.CapabilityChange#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.CapabilityChange#getName()
   * @see #getCapabilityChange()
   * @generated
   */
  EAttribute getCapabilityChange_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.CapabilityChange#getCapabilities <em>Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Capabilities</em>'.
   * @see ScenarioModel.CapabilityChange#getCapabilities()
   * @see #getCapabilityChange()
   * @generated
   */
  EReference getCapabilityChange_Capabilities();

  /**
   * Returns the meta object for class '{@link ScenarioModel.RunConfiguration <em>Run Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run Configuration</em>'.
   * @see ScenarioModel.RunConfiguration
   * @generated
   */
  EClass getRunConfiguration();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.RunConfiguration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.RunConfiguration#getName()
   * @see #getRunConfiguration()
   * @generated
   */
  EAttribute getRunConfiguration_Name();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.RunConfiguration#getPopSize <em>Pop Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pop Size</em>'.
   * @see ScenarioModel.RunConfiguration#getPopSize()
   * @see #getRunConfiguration()
   * @generated
   */
  EAttribute getRunConfiguration_PopSize();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.RunConfiguration#getGenCount <em>Gen Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gen Count</em>'.
   * @see ScenarioModel.RunConfiguration#getGenCount()
   * @see #getRunConfiguration()
   * @generated
   */
  EAttribute getRunConfiguration_GenCount();

  /**
   * Returns the meta object for class '{@link ScenarioModel.FindTradeOffs <em>Find Trade Offs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Find Trade Offs</em>'.
   * @see ScenarioModel.FindTradeOffs
   * @generated
   */
  EClass getFindTradeOffs();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.FindTradeOffs#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see ScenarioModel.FindTradeOffs#getComponents()
   * @see #getFindTradeOffs()
   * @generated
   */
  EReference getFindTradeOffs_Components();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.FindTradeOffs#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see ScenarioModel.FindTradeOffs#getConstraints()
   * @see #getFindTradeOffs()
   * @generated
   */
  EReference getFindTradeOffs_Constraints();

  /**
   * Returns the meta object for class '{@link ScenarioModel.ThroughLifePlanning <em>Through Life Planning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Through Life Planning</em>'.
   * @see ScenarioModel.ThroughLifePlanning
   * @generated
   */
  EClass getThroughLifePlanning();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.ThroughLifePlanning#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see ScenarioModel.ThroughLifePlanning#getComponents()
   * @see #getThroughLifePlanning()
   * @generated
   */
  EReference getThroughLifePlanning_Components();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.ThroughLifePlanning#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see ScenarioModel.ThroughLifePlanning#getStartDate()
   * @see #getThroughLifePlanning()
   * @generated
   */
  EAttribute getThroughLifePlanning_StartDate();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.ThroughLifePlanning#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see ScenarioModel.ThroughLifePlanning#getEndDate()
   * @see #getThroughLifePlanning()
   * @generated
   */
  EAttribute getThroughLifePlanning_EndDate();

  /**
   * Returns the meta object for the containment reference list '{@link ScenarioModel.ThroughLifePlanning#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraints</em>'.
   * @see ScenarioModel.ThroughLifePlanning#getConstraints()
   * @see #getThroughLifePlanning()
   * @generated
   */
  EReference getThroughLifePlanning_Constraints();

  /**
   * Returns the meta object for class '{@link ScenarioModel.ComponentU <em>Component U</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component U</em>'.
   * @see ScenarioModel.ComponentU
   * @generated
   */
  EClass getComponentU();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.ComponentU#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.ComponentU#getName()
   * @see #getComponentU()
   * @generated
   */
  EAttribute getComponentU_Name();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.ComponentU#getQuantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quantity</em>'.
   * @see ScenarioModel.ComponentU#getQuantity()
   * @see #getComponentU()
   * @generated
   */
  EAttribute getComponentU_Quantity();

  /**
   * Returns the meta object for class '{@link ScenarioModel.ExistingComponent <em>Existing Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Existing Component</em>'.
   * @see ScenarioModel.ExistingComponent
   * @generated
   */
  EClass getExistingComponent();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.ExistingComponent#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see ScenarioModel.ExistingComponent#getStartDate()
   * @see #getExistingComponent()
   * @generated
   */
  EAttribute getExistingComponent_StartDate();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.ExistingComponent#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see ScenarioModel.ExistingComponent#getEndDate()
   * @see #getExistingComponent()
   * @generated
   */
  EAttribute getExistingComponent_EndDate();

  /**
   * Returns the meta object for class '{@link ScenarioModel.AcquirableComponent <em>Acquirable Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acquirable Component</em>'.
   * @see ScenarioModel.AcquirableComponent
   * @generated
   */
  EClass getAcquirableComponent();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.AcquirableComponent#getAcquisitionTime <em>Acquisition Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acquisition Time</em>'.
   * @see ScenarioModel.AcquirableComponent#getAcquisitionTime()
   * @see #getAcquirableComponent()
   * @generated
   */
  EAttribute getAcquirableComponent_AcquisitionTime();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.AcquirableComponent#getLifeSpan <em>Life Span</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Life Span</em>'.
   * @see ScenarioModel.AcquirableComponent#getLifeSpan()
   * @see #getAcquirableComponent()
   * @generated
   */
  EAttribute getAcquirableComponent_LifeSpan();

  /**
   * Returns the meta object for class '{@link ScenarioModel.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see ScenarioModel.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for class '{@link ScenarioModel.DesireHigh <em>Desire High</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Desire High</em>'.
   * @see ScenarioModel.DesireHigh
   * @generated
   */
  EClass getDesireHigh();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.DesireHigh#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.DesireHigh#getName()
   * @see #getDesireHigh()
   * @generated
   */
  EAttribute getDesireHigh_Name();

  /**
   * Returns the meta object for class '{@link ScenarioModel.DesireLow <em>Desire Low</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Desire Low</em>'.
   * @see ScenarioModel.DesireLow
   * @generated
   */
  EClass getDesireLow();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.DesireLow#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.DesireLow#getName()
   * @see #getDesireLow()
   * @generated
   */
  EAttribute getDesireLow_Name();

  /**
   * Returns the meta object for class '{@link ScenarioModel.Budget <em>Budget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Budget</em>'.
   * @see ScenarioModel.Budget
   * @generated
   */
  EClass getBudget();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Budget#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ScenarioModel.Budget#getName()
   * @see #getBudget()
   * @generated
   */
  EAttribute getBudget_Name();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Budget#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amount</em>'.
   * @see ScenarioModel.Budget#getAmount()
   * @see #getBudget()
   * @generated
   */
  EAttribute getBudget_Amount();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Budget#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see ScenarioModel.Budget#getStartDate()
   * @see #getBudget()
   * @generated
   */
  EAttribute getBudget_StartDate();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Budget#getRepeatDuration <em>Repeat Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repeat Duration</em>'.
   * @see ScenarioModel.Budget#getRepeatDuration()
   * @see #getBudget()
   * @generated
   */
  EAttribute getBudget_RepeatDuration();

  /**
   * Returns the meta object for the attribute '{@link ScenarioModel.Budget#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see ScenarioModel.Budget#getEndDate()
   * @see #getBudget()
   * @generated
   */
  EAttribute getBudget_EndDate();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ScenarioModelFactory getScenarioModelFactory();

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
     * The meta object literal for the '{@link ScenarioModel.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.ScenarioImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Our Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__OUR_OBJECTS = eINSTANCE.getScenario_OurObjects();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.OurObjectImpl <em>Our Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.OurObjectImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getOurObject()
     * @generated
     */
    EClass OUR_OBJECT = eINSTANCE.getOurObject();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.CapabilityImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCapability()
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
     * The meta object literal for the '<em><b>Sequential Scheduling</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__SEQUENTIAL_SCHEDULING = eINSTANCE.getCapability_SequentialScheduling();

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
     * The meta object literal for the '{@link ScenarioModel.impl.CapabilityProvisionImpl <em>Capability Provision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.CapabilityProvisionImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCapabilityProvision()
     * @generated
     */
    EClass CAPABILITY_PROVISION = eINSTANCE.getCapabilityProvision();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.MeasurementImpl <em>Measurement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.MeasurementImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getMeasurement()
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
     * The meta object literal for the '{@link ScenarioModel.impl.QualitativeValueImpl <em>Qualitative Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.QualitativeValueImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getQualitativeValue()
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

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.QualitativeValueDictionaryImpl <em>Qualitative Value Dictionary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.QualitativeValueDictionaryImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getQualitativeValueDictionary()
     * @generated
     */
    EClass QUALITATIVE_VALUE_DICTIONARY = eINSTANCE.getQualitativeValueDictionary();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALITATIVE_VALUE_DICTIONARY__NAME = eINSTANCE.getQualitativeValueDictionary_Name();

    /**
     * The meta object literal for the '<em><b>Greater Than</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN = eINSTANCE.getQualitativeValueDictionary_GreaterThan();

    /**
     * The meta object literal for the '<em><b>Less Than</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALITATIVE_VALUE_DICTIONARY__LESS_THAN = eINSTANCE.getQualitativeValueDictionary_LessThan();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.ComponentImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__START_DATE = eINSTANCE.getComponent_StartDate();

    /**
     * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__END_DATE = eINSTANCE.getComponent_EndDate();

    /**
     * The meta object literal for the '<em><b>Provides</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PROVIDES = eINSTANCE.getComponent_Provides();

    /**
     * The meta object literal for the '<em><b>Upgrades</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__UPGRADES = eINSTANCE.getComponent_Upgrades();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__REQUIRES = eINSTANCE.getComponent_Requires();

    /**
     * The meta object literal for the '<em><b>Costs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__COSTS = eINSTANCE.getComponent_Costs();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.CostImpl <em>Cost</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.CostImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCost()
     * @generated
     */
    EClass COST = eINSTANCE.getCost();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COST__NAME = eINSTANCE.getCost_Name();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COST__AMOUNT = eINSTANCE.getCost_Amount();

    /**
     * The meta object literal for the '<em><b>Start After</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COST__START_AFTER = eINSTANCE.getCost_StartAfter();

    /**
     * The meta object literal for the '<em><b>Repeat Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COST__REPEAT_DURATION = eINSTANCE.getCost_RepeatDuration();

    /**
     * The meta object literal for the '<em><b>Stop After</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COST__STOP_AFTER = eINSTANCE.getCost_StopAfter();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.CapabilityUpgradeImpl <em>Capability Upgrade</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.CapabilityUpgradeImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCapabilityUpgrade()
     * @generated
     */
    EClass CAPABILITY_UPGRADE = eINSTANCE.getCapabilityUpgrade();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY_UPGRADE__NAME = eINSTANCE.getCapabilityUpgrade_Name();

    /**
     * The meta object literal for the '<em><b>Target Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY_UPGRADE__TARGET_COMPONENT = eINSTANCE.getCapabilityUpgrade_TargetComponent();

    /**
     * The meta object literal for the '<em><b>Upgrading</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY_UPGRADE__UPGRADING = eINSTANCE.getCapabilityUpgrade_Upgrading();

    /**
     * The meta object literal for the '<em><b>Capability Changes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY_UPGRADE__CAPABILITY_CHANGES = eINSTANCE.getCapabilityUpgrade_CapabilityChanges();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.CapabilityChangeImpl <em>Capability Change</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.CapabilityChangeImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getCapabilityChange()
     * @generated
     */
    EClass CAPABILITY_CHANGE = eINSTANCE.getCapabilityChange();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY_CHANGE__NAME = eINSTANCE.getCapabilityChange_Name();

    /**
     * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY_CHANGE__CAPABILITIES = eINSTANCE.getCapabilityChange_Capabilities();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.RunConfigurationImpl <em>Run Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.RunConfigurationImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getRunConfiguration()
     * @generated
     */
    EClass RUN_CONFIGURATION = eINSTANCE.getRunConfiguration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN_CONFIGURATION__NAME = eINSTANCE.getRunConfiguration_Name();

    /**
     * The meta object literal for the '<em><b>Pop Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN_CONFIGURATION__POP_SIZE = eINSTANCE.getRunConfiguration_PopSize();

    /**
     * The meta object literal for the '<em><b>Gen Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN_CONFIGURATION__GEN_COUNT = eINSTANCE.getRunConfiguration_GenCount();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.FindTradeOffsImpl <em>Find Trade Offs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.FindTradeOffsImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getFindTradeOffs()
     * @generated
     */
    EClass FIND_TRADE_OFFS = eINSTANCE.getFindTradeOffs();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIND_TRADE_OFFS__COMPONENTS = eINSTANCE.getFindTradeOffs_Components();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIND_TRADE_OFFS__CONSTRAINTS = eINSTANCE.getFindTradeOffs_Constraints();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.ThroughLifePlanningImpl <em>Through Life Planning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.ThroughLifePlanningImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getThroughLifePlanning()
     * @generated
     */
    EClass THROUGH_LIFE_PLANNING = eINSTANCE.getThroughLifePlanning();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THROUGH_LIFE_PLANNING__COMPONENTS = eINSTANCE.getThroughLifePlanning_Components();

    /**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THROUGH_LIFE_PLANNING__START_DATE = eINSTANCE.getThroughLifePlanning_StartDate();

    /**
     * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THROUGH_LIFE_PLANNING__END_DATE = eINSTANCE.getThroughLifePlanning_EndDate();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THROUGH_LIFE_PLANNING__CONSTRAINTS = eINSTANCE.getThroughLifePlanning_Constraints();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.ComponentUImpl <em>Component U</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.ComponentUImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getComponentU()
     * @generated
     */
    EClass COMPONENT_U = eINSTANCE.getComponentU();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_U__NAME = eINSTANCE.getComponentU_Name();

    /**
     * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_U__QUANTITY = eINSTANCE.getComponentU_Quantity();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.ExistingComponentImpl <em>Existing Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.ExistingComponentImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getExistingComponent()
     * @generated
     */
    EClass EXISTING_COMPONENT = eINSTANCE.getExistingComponent();

    /**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXISTING_COMPONENT__START_DATE = eINSTANCE.getExistingComponent_StartDate();

    /**
     * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXISTING_COMPONENT__END_DATE = eINSTANCE.getExistingComponent_EndDate();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.AcquirableComponentImpl <em>Acquirable Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.AcquirableComponentImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getAcquirableComponent()
     * @generated
     */
    EClass ACQUIRABLE_COMPONENT = eINSTANCE.getAcquirableComponent();

    /**
     * The meta object literal for the '<em><b>Acquisition Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACQUIRABLE_COMPONENT__ACQUISITION_TIME = eINSTANCE.getAcquirableComponent_AcquisitionTime();

    /**
     * The meta object literal for the '<em><b>Life Span</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACQUIRABLE_COMPONENT__LIFE_SPAN = eINSTANCE.getAcquirableComponent_LifeSpan();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.ConstraintImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.DesireHighImpl <em>Desire High</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.DesireHighImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getDesireHigh()
     * @generated
     */
    EClass DESIRE_HIGH = eINSTANCE.getDesireHigh();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIRE_HIGH__NAME = eINSTANCE.getDesireHigh_Name();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.DesireLowImpl <em>Desire Low</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.DesireLowImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getDesireLow()
     * @generated
     */
    EClass DESIRE_LOW = eINSTANCE.getDesireLow();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESIRE_LOW__NAME = eINSTANCE.getDesireLow_Name();

    /**
     * The meta object literal for the '{@link ScenarioModel.impl.BudgetImpl <em>Budget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ScenarioModel.impl.BudgetImpl
     * @see ScenarioModel.impl.ScenarioModelPackageImpl#getBudget()
     * @generated
     */
    EClass BUDGET = eINSTANCE.getBudget();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUDGET__NAME = eINSTANCE.getBudget_Name();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUDGET__AMOUNT = eINSTANCE.getBudget_Amount();

    /**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUDGET__START_DATE = eINSTANCE.getBudget_StartDate();

    /**
     * The meta object literal for the '<em><b>Repeat Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUDGET__REPEAT_DURATION = eINSTANCE.getBudget_RepeatDuration();

    /**
     * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUDGET__END_DATE = eINSTANCE.getBudget_EndDate();

  }

} //ScenarioModelPackage
