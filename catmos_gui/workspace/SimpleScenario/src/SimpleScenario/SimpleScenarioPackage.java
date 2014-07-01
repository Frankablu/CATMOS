/**
 */
package SimpleScenario;

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
 * @see SimpleScenario.SimpleScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleScenarioPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "SimpleScenario";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "SimpleScenario";

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
  SimpleScenarioPackage eINSTANCE = SimpleScenario.impl.SimpleScenarioPackageImpl.init();

  /**
   * The meta object id for the '{@link SimpleScenario.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleScenario.impl.ScenarioImpl
   * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getScenario()
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
   * The meta object id for the '{@link SimpleScenario.impl.OurObjectImpl <em>Our Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleScenario.impl.OurObjectImpl
   * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getOurObject()
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
   * The meta object id for the '{@link SimpleScenario.impl.CapabilityImpl <em>Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleScenario.impl.CapabilityImpl
   * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getCapability()
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
   * The feature id for the '<em><b>Decomposes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__DECOMPOSES = OUR_OBJECT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__SATISFIED_BY = OUR_OBJECT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Satisfies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__SATISFIES = OUR_OBJECT_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_FEATURE_COUNT = OUR_OBJECT_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link SimpleScenario.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleScenario.impl.ComponentImpl
   * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 3;

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
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = OUR_OBJECT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link SimpleScenario.impl.CapabilityUpgradeImpl <em>Capability Upgrade</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleScenario.impl.CapabilityUpgradeImpl
   * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getCapabilityUpgrade()
   * @generated
   */
  int CAPABILITY_UPGRADE = 4;

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
   * The number of structural features of the '<em>Capability Upgrade</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_UPGRADE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link SimpleScenario.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see SimpleScenario.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the containment reference list '{@link SimpleScenario.Scenario#getOurObjects <em>Our Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Our Objects</em>'.
   * @see SimpleScenario.Scenario#getOurObjects()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_OurObjects();

  /**
   * Returns the meta object for class '{@link SimpleScenario.OurObject <em>Our Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Our Object</em>'.
   * @see SimpleScenario.OurObject
   * @generated
   */
  EClass getOurObject();

  /**
   * Returns the meta object for class '{@link SimpleScenario.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability</em>'.
   * @see SimpleScenario.Capability
   * @generated
   */
  EClass getCapability();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Capability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see SimpleScenario.Capability#getName()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Name();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Capability#getSearchObjective <em>Search Objective</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Search Objective</em>'.
   * @see SimpleScenario.Capability#getSearchObjective()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_SearchObjective();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Capability#getStandAlone <em>Stand Alone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stand Alone</em>'.
   * @see SimpleScenario.Capability#getStandAlone()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_StandAlone();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Capability#getReuse <em>Reuse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reuse</em>'.
   * @see SimpleScenario.Capability#getReuse()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Reuse();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Capability#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see SimpleScenario.Capability#getStartDate()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_StartDate();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Capability#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see SimpleScenario.Capability#getEndDate()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_EndDate();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Capability#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see SimpleScenario.Capability#getStatus()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Status();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Capability#getColour <em>Colour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Colour</em>'.
   * @see SimpleScenario.Capability#getColour()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Colour();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Capability#getSequentialScheduling <em>Sequential Scheduling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequential Scheduling</em>'.
   * @see SimpleScenario.Capability#getSequentialScheduling()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_SequentialScheduling();

  /**
   * Returns the meta object for the reference list '{@link SimpleScenario.Capability#getDecomposes <em>Decomposes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Decomposes</em>'.
   * @see SimpleScenario.Capability#getDecomposes()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Decomposes();

  /**
   * Returns the meta object for the reference list '{@link SimpleScenario.Capability#getSatisfiedBy <em>Satisfied By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Satisfied By</em>'.
   * @see SimpleScenario.Capability#getSatisfiedBy()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_SatisfiedBy();

  /**
   * Returns the meta object for the reference list '{@link SimpleScenario.Capability#getSatisfies <em>Satisfies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Satisfies</em>'.
   * @see SimpleScenario.Capability#getSatisfies()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Satisfies();

  /**
   * Returns the meta object for class '{@link SimpleScenario.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see SimpleScenario.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see SimpleScenario.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Component#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see SimpleScenario.Component#getStartDate()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_StartDate();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.Component#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see SimpleScenario.Component#getEndDate()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_EndDate();

  /**
   * Returns the meta object for the containment reference list '{@link SimpleScenario.Component#getProvides <em>Provides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Provides</em>'.
   * @see SimpleScenario.Component#getProvides()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Provides();

  /**
   * Returns the meta object for the containment reference list '{@link SimpleScenario.Component#getUpgrades <em>Upgrades</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Upgrades</em>'.
   * @see SimpleScenario.Component#getUpgrades()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Upgrades();

  /**
   * Returns the meta object for the containment reference list '{@link SimpleScenario.Component#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requires</em>'.
   * @see SimpleScenario.Component#getRequires()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Requires();

  /**
   * Returns the meta object for class '{@link SimpleScenario.CapabilityUpgrade <em>Capability Upgrade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability Upgrade</em>'.
   * @see SimpleScenario.CapabilityUpgrade
   * @generated
   */
  EClass getCapabilityUpgrade();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.CapabilityUpgrade#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see SimpleScenario.CapabilityUpgrade#getName()
   * @see #getCapabilityUpgrade()
   * @generated
   */
  EAttribute getCapabilityUpgrade_Name();

  /**
   * Returns the meta object for the attribute '{@link SimpleScenario.CapabilityUpgrade#getTargetComponent <em>Target Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Component</em>'.
   * @see SimpleScenario.CapabilityUpgrade#getTargetComponent()
   * @see #getCapabilityUpgrade()
   * @generated
   */
  EAttribute getCapabilityUpgrade_TargetComponent();

  /**
   * Returns the meta object for the reference '{@link SimpleScenario.CapabilityUpgrade#getUpgrading <em>Upgrading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Upgrading</em>'.
   * @see SimpleScenario.CapabilityUpgrade#getUpgrading()
   * @see #getCapabilityUpgrade()
   * @generated
   */
  EReference getCapabilityUpgrade_Upgrading();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimpleScenarioFactory getSimpleScenarioFactory();

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
     * The meta object literal for the '{@link SimpleScenario.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleScenario.impl.ScenarioImpl
     * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getScenario()
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
     * The meta object literal for the '{@link SimpleScenario.impl.OurObjectImpl <em>Our Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleScenario.impl.OurObjectImpl
     * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getOurObject()
     * @generated
     */
    EClass OUR_OBJECT = eINSTANCE.getOurObject();

    /**
     * The meta object literal for the '{@link SimpleScenario.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleScenario.impl.CapabilityImpl
     * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getCapability()
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
     * The meta object literal for the '{@link SimpleScenario.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleScenario.impl.ComponentImpl
     * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getComponent()
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
     * The meta object literal for the '{@link SimpleScenario.impl.CapabilityUpgradeImpl <em>Capability Upgrade</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleScenario.impl.CapabilityUpgradeImpl
     * @see SimpleScenario.impl.SimpleScenarioPackageImpl#getCapabilityUpgrade()
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

  }

} //SimpleScenarioPackage
