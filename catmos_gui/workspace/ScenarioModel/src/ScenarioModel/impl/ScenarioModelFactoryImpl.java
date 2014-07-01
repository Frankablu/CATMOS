/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioModelFactoryImpl extends EFactoryImpl implements ScenarioModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScenarioModelFactory init()
  {
    try
    {
      ScenarioModelFactory theScenarioModelFactory = (ScenarioModelFactory)EPackage.Registry.INSTANCE.getEFactory("ScenarioModel"); 
      if (theScenarioModelFactory != null)
      {
        return theScenarioModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ScenarioModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ScenarioModelPackage.SCENARIO: return createScenario();
      case ScenarioModelPackage.OUR_OBJECT: return createOurObject();
      case ScenarioModelPackage.CAPABILITY: return createCapability();
      case ScenarioModelPackage.CAPABILITY_PROVISION: return createCapabilityProvision();
      case ScenarioModelPackage.MEASUREMENT: return createMeasurement();
      case ScenarioModelPackage.QUALITATIVE_VALUE: return createQualitativeValue();
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY: return createQualitativeValueDictionary();
      case ScenarioModelPackage.COMPONENT: return createComponent();
      case ScenarioModelPackage.COST: return createCost();
      case ScenarioModelPackage.CAPABILITY_UPGRADE: return createCapabilityUpgrade();
      case ScenarioModelPackage.CAPABILITY_CHANGE: return createCapabilityChange();
      case ScenarioModelPackage.RUN_CONFIGURATION: return createRunConfiguration();
      case ScenarioModelPackage.FIND_TRADE_OFFS: return createFindTradeOffs();
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING: return createThroughLifePlanning();
      case ScenarioModelPackage.COMPONENT_U: return createComponentU();
      case ScenarioModelPackage.EXISTING_COMPONENT: return createExistingComponent();
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT: return createAcquirableComponent();
      case ScenarioModelPackage.CONSTRAINT: return createConstraint();
      case ScenarioModelPackage.DESIRE_HIGH: return createDesireHigh();
      case ScenarioModelPackage.DESIRE_LOW: return createDesireLow();
      case ScenarioModelPackage.BUDGET: return createBudget();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OurObject createOurObject()
  {
    OurObjectImpl ourObject = new OurObjectImpl();
    return ourObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Capability createCapability()
  {
    CapabilityImpl capability = new CapabilityImpl();
    return capability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapabilityProvision createCapabilityProvision()
  {
    CapabilityProvisionImpl capabilityProvision = new CapabilityProvisionImpl();
    return capabilityProvision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Measurement createMeasurement()
  {
    MeasurementImpl measurement = new MeasurementImpl();
    return measurement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeValue createQualitativeValue()
  {
    QualitativeValueImpl qualitativeValue = new QualitativeValueImpl();
    return qualitativeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeValueDictionary createQualitativeValueDictionary()
  {
    QualitativeValueDictionaryImpl qualitativeValueDictionary = new QualitativeValueDictionaryImpl();
    return qualitativeValueDictionary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cost createCost()
  {
    CostImpl cost = new CostImpl();
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapabilityUpgrade createCapabilityUpgrade()
  {
    CapabilityUpgradeImpl capabilityUpgrade = new CapabilityUpgradeImpl();
    return capabilityUpgrade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CapabilityChange createCapabilityChange()
  {
    CapabilityChangeImpl capabilityChange = new CapabilityChangeImpl();
    return capabilityChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunConfiguration createRunConfiguration()
  {
    RunConfigurationImpl runConfiguration = new RunConfigurationImpl();
    return runConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FindTradeOffs createFindTradeOffs()
  {
    FindTradeOffsImpl findTradeOffs = new FindTradeOffsImpl();
    return findTradeOffs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThroughLifePlanning createThroughLifePlanning()
  {
    ThroughLifePlanningImpl throughLifePlanning = new ThroughLifePlanningImpl();
    return throughLifePlanning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentU createComponentU()
  {
    ComponentUImpl componentU = new ComponentUImpl();
    return componentU;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistingComponent createExistingComponent()
  {
    ExistingComponentImpl existingComponent = new ExistingComponentImpl();
    return existingComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AcquirableComponent createAcquirableComponent()
  {
    AcquirableComponentImpl acquirableComponent = new AcquirableComponentImpl();
    return acquirableComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DesireHigh createDesireHigh()
  {
    DesireHighImpl desireHigh = new DesireHighImpl();
    return desireHigh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DesireLow createDesireLow()
  {
    DesireLowImpl desireLow = new DesireLowImpl();
    return desireLow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Budget createBudget()
  {
    BudgetImpl budget = new BudgetImpl();
    return budget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioModelPackage getScenarioModelPackage()
  {
    return (ScenarioModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ScenarioModelPackage getPackage()
  {
    return ScenarioModelPackage.eINSTANCE;
  }

} //ScenarioModelFactoryImpl
