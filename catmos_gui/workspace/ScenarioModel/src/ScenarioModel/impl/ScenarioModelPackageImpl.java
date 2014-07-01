/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.AcquirableComponent;
import ScenarioModel.Budget;
import ScenarioModel.Capability;
import ScenarioModel.CapabilityChange;
import ScenarioModel.CapabilityProvision;
import ScenarioModel.CapabilityUpgrade;
import ScenarioModel.Component;
import ScenarioModel.ComponentU;
import ScenarioModel.Constraint;
import ScenarioModel.Cost;
import ScenarioModel.DesireHigh;
import ScenarioModel.DesireLow;
import ScenarioModel.ExistingComponent;
import ScenarioModel.FindTradeOffs;
import ScenarioModel.Measurement;
import ScenarioModel.OurObject;
import ScenarioModel.QualitativeValue;
import ScenarioModel.QualitativeValueDictionary;
import ScenarioModel.RunConfiguration;
import ScenarioModel.Scenario;
import ScenarioModel.ScenarioModelFactory;
import ScenarioModel.ScenarioModelPackage;
import ScenarioModel.ThroughLifePlanning;

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
public class ScenarioModelPackageImpl extends EPackageImpl implements ScenarioModelPackage
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
  private EClass capabilityProvisionEClass = null;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualitativeValueDictionaryEClass = null;

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
  private EClass costEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capabilityUpgradeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass capabilityChangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass findTradeOffsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass throughLifePlanningEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentUEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass existingComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acquirableComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass desireHighEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass desireLowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass budgetEClass = null;

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
   * @see ScenarioModel.ScenarioModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ScenarioModelPackageImpl()
  {
    super(eNS_URI, ScenarioModelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ScenarioModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ScenarioModelPackage init()
  {
    if (isInited) return (ScenarioModelPackage)EPackage.Registry.INSTANCE.getEPackage(ScenarioModelPackage.eNS_URI);

    // Obtain or create and register package
    ScenarioModelPackageImpl theScenarioModelPackage = (ScenarioModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScenarioModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScenarioModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theScenarioModelPackage.createPackageContents();

    // Initialize created meta-data
    theScenarioModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theScenarioModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ScenarioModelPackage.eNS_URI, theScenarioModelPackage);
    return theScenarioModelPackage;
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
  public EReference getCapability_Accumulation()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_Measurements()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_Decomposes()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_SatisfiedBy()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapability_Satisfies()
  {
    return (EReference)capabilityEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapabilityProvision()
  {
    return capabilityProvisionEClass;
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
  public EClass getQualitativeValueDictionary()
  {
    return qualitativeValueDictionaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualitativeValueDictionary_Name()
  {
    return (EAttribute)qualitativeValueDictionaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualitativeValueDictionary_GreaterThan()
  {
    return (EReference)qualitativeValueDictionaryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualitativeValueDictionary_LessThan()
  {
    return (EReference)qualitativeValueDictionaryEClass.getEStructuralFeatures().get(2);
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
  public EReference getComponent_Costs()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCost()
  {
    return costEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCost_Name()
  {
    return (EAttribute)costEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCost_Amount()
  {
    return (EAttribute)costEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCost_StartAfter()
  {
    return (EAttribute)costEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCost_RepeatDuration()
  {
    return (EAttribute)costEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCost_StopAfter()
  {
    return (EAttribute)costEClass.getEStructuralFeatures().get(4);
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
  public EReference getCapabilityUpgrade_CapabilityChanges()
  {
    return (EReference)capabilityUpgradeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCapabilityChange()
  {
    return capabilityChangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCapabilityChange_Name()
  {
    return (EAttribute)capabilityChangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCapabilityChange_Capabilities()
  {
    return (EReference)capabilityChangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRunConfiguration()
  {
    return runConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunConfiguration_Name()
  {
    return (EAttribute)runConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunConfiguration_PopSize()
  {
    return (EAttribute)runConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunConfiguration_GenCount()
  {
    return (EAttribute)runConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFindTradeOffs()
  {
    return findTradeOffsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFindTradeOffs_Components()
  {
    return (EReference)findTradeOffsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFindTradeOffs_Constraints()
  {
    return (EReference)findTradeOffsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThroughLifePlanning()
  {
    return throughLifePlanningEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThroughLifePlanning_Components()
  {
    return (EReference)throughLifePlanningEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThroughLifePlanning_StartDate()
  {
    return (EAttribute)throughLifePlanningEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThroughLifePlanning_EndDate()
  {
    return (EAttribute)throughLifePlanningEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThroughLifePlanning_Constraints()
  {
    return (EReference)throughLifePlanningEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentU()
  {
    return componentUEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentU_Name()
  {
    return (EAttribute)componentUEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponentU_Quantity()
  {
    return (EAttribute)componentUEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExistingComponent()
  {
    return existingComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExistingComponent_StartDate()
  {
    return (EAttribute)existingComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExistingComponent_EndDate()
  {
    return (EAttribute)existingComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcquirableComponent()
  {
    return acquirableComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAcquirableComponent_AcquisitionTime()
  {
    return (EAttribute)acquirableComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAcquirableComponent_LifeSpan()
  {
    return (EAttribute)acquirableComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesireHigh()
  {
    return desireHighEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesireHigh_Name()
  {
    return (EAttribute)desireHighEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesireLow()
  {
    return desireLowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesireLow_Name()
  {
    return (EAttribute)desireLowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBudget()
  {
    return budgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBudget_Name()
  {
    return (EAttribute)budgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBudget_Amount()
  {
    return (EAttribute)budgetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBudget_StartDate()
  {
    return (EAttribute)budgetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBudget_RepeatDuration()
  {
    return (EAttribute)budgetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBudget_EndDate()
  {
    return (EAttribute)budgetEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioModelFactory getScenarioModelFactory()
  {
    return (ScenarioModelFactory)getEFactoryInstance();
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
    createEReference(capabilityEClass, CAPABILITY__ACCUMULATION);
    createEReference(capabilityEClass, CAPABILITY__MEASUREMENTS);
    createEReference(capabilityEClass, CAPABILITY__DECOMPOSES);
    createEReference(capabilityEClass, CAPABILITY__SATISFIED_BY);
    createEReference(capabilityEClass, CAPABILITY__SATISFIES);

    capabilityProvisionEClass = createEClass(CAPABILITY_PROVISION);

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

    qualitativeValueDictionaryEClass = createEClass(QUALITATIVE_VALUE_DICTIONARY);
    createEAttribute(qualitativeValueDictionaryEClass, QUALITATIVE_VALUE_DICTIONARY__NAME);
    createEReference(qualitativeValueDictionaryEClass, QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN);
    createEReference(qualitativeValueDictionaryEClass, QUALITATIVE_VALUE_DICTIONARY__LESS_THAN);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEAttribute(componentEClass, COMPONENT__START_DATE);
    createEAttribute(componentEClass, COMPONENT__END_DATE);
    createEReference(componentEClass, COMPONENT__PROVIDES);
    createEReference(componentEClass, COMPONENT__UPGRADES);
    createEReference(componentEClass, COMPONENT__REQUIRES);
    createEReference(componentEClass, COMPONENT__COSTS);

    costEClass = createEClass(COST);
    createEAttribute(costEClass, COST__NAME);
    createEAttribute(costEClass, COST__AMOUNT);
    createEAttribute(costEClass, COST__START_AFTER);
    createEAttribute(costEClass, COST__REPEAT_DURATION);
    createEAttribute(costEClass, COST__STOP_AFTER);

    capabilityUpgradeEClass = createEClass(CAPABILITY_UPGRADE);
    createEAttribute(capabilityUpgradeEClass, CAPABILITY_UPGRADE__NAME);
    createEAttribute(capabilityUpgradeEClass, CAPABILITY_UPGRADE__TARGET_COMPONENT);
    createEReference(capabilityUpgradeEClass, CAPABILITY_UPGRADE__UPGRADING);
    createEReference(capabilityUpgradeEClass, CAPABILITY_UPGRADE__CAPABILITY_CHANGES);

    capabilityChangeEClass = createEClass(CAPABILITY_CHANGE);
    createEAttribute(capabilityChangeEClass, CAPABILITY_CHANGE__NAME);
    createEReference(capabilityChangeEClass, CAPABILITY_CHANGE__CAPABILITIES);

    runConfigurationEClass = createEClass(RUN_CONFIGURATION);
    createEAttribute(runConfigurationEClass, RUN_CONFIGURATION__NAME);
    createEAttribute(runConfigurationEClass, RUN_CONFIGURATION__POP_SIZE);
    createEAttribute(runConfigurationEClass, RUN_CONFIGURATION__GEN_COUNT);

    findTradeOffsEClass = createEClass(FIND_TRADE_OFFS);
    createEReference(findTradeOffsEClass, FIND_TRADE_OFFS__COMPONENTS);
    createEReference(findTradeOffsEClass, FIND_TRADE_OFFS__CONSTRAINTS);

    throughLifePlanningEClass = createEClass(THROUGH_LIFE_PLANNING);
    createEReference(throughLifePlanningEClass, THROUGH_LIFE_PLANNING__COMPONENTS);
    createEAttribute(throughLifePlanningEClass, THROUGH_LIFE_PLANNING__START_DATE);
    createEAttribute(throughLifePlanningEClass, THROUGH_LIFE_PLANNING__END_DATE);
    createEReference(throughLifePlanningEClass, THROUGH_LIFE_PLANNING__CONSTRAINTS);

    componentUEClass = createEClass(COMPONENT_U);
    createEAttribute(componentUEClass, COMPONENT_U__NAME);
    createEAttribute(componentUEClass, COMPONENT_U__QUANTITY);

    existingComponentEClass = createEClass(EXISTING_COMPONENT);
    createEAttribute(existingComponentEClass, EXISTING_COMPONENT__START_DATE);
    createEAttribute(existingComponentEClass, EXISTING_COMPONENT__END_DATE);

    acquirableComponentEClass = createEClass(ACQUIRABLE_COMPONENT);
    createEAttribute(acquirableComponentEClass, ACQUIRABLE_COMPONENT__ACQUISITION_TIME);
    createEAttribute(acquirableComponentEClass, ACQUIRABLE_COMPONENT__LIFE_SPAN);

    constraintEClass = createEClass(CONSTRAINT);

    desireHighEClass = createEClass(DESIRE_HIGH);
    createEAttribute(desireHighEClass, DESIRE_HIGH__NAME);

    desireLowEClass = createEClass(DESIRE_LOW);
    createEAttribute(desireLowEClass, DESIRE_LOW__NAME);

    budgetEClass = createEClass(BUDGET);
    createEAttribute(budgetEClass, BUDGET__NAME);
    createEAttribute(budgetEClass, BUDGET__AMOUNT);
    createEAttribute(budgetEClass, BUDGET__START_DATE);
    createEAttribute(budgetEClass, BUDGET__REPEAT_DURATION);
    createEAttribute(budgetEClass, BUDGET__END_DATE);
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
    capabilityProvisionEClass.getESuperTypes().add(this.getCapability());
    qualitativeValueDictionaryEClass.getESuperTypes().add(this.getOurObject());
    componentEClass.getESuperTypes().add(this.getOurObject());
    runConfigurationEClass.getESuperTypes().add(this.getOurObject());
    findTradeOffsEClass.getESuperTypes().add(this.getRunConfiguration());
    throughLifePlanningEClass.getESuperTypes().add(this.getRunConfiguration());
    existingComponentEClass.getESuperTypes().add(this.getComponentU());
    acquirableComponentEClass.getESuperTypes().add(this.getComponentU());
    desireHighEClass.getESuperTypes().add(this.getConstraint());
    desireLowEClass.getESuperTypes().add(this.getConstraint());
    budgetEClass.getESuperTypes().add(this.getConstraint());

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
    initEReference(getCapability_Accumulation(), this.getMeasurement(), null, "accumulation", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_Measurements(), this.getMeasurement(), null, "measurements", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_Decomposes(), this.getCapability(), null, "decomposes", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_SatisfiedBy(), this.getCapability(), this.getCapability_Satisfies(), "satisfiedBy", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapability_Satisfies(), this.getCapability(), this.getCapability_SatisfiedBy(), "satisfies", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(capabilityProvisionEClass, CapabilityProvision.class, "CapabilityProvision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

    initEClass(qualitativeValueDictionaryEClass, QualitativeValueDictionary.class, "QualitativeValueDictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualitativeValueDictionary_Name(), ecorePackage.getEString(), "name", null, 0, 1, QualitativeValueDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualitativeValueDictionary_GreaterThan(), this.getQualitativeValueDictionary(), this.getQualitativeValueDictionary_LessThan(), "greaterThan", null, 0, 1, QualitativeValueDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualitativeValueDictionary_LessThan(), this.getQualitativeValueDictionary(), this.getQualitativeValueDictionary_GreaterThan(), "lessThan", null, 0, 1, QualitativeValueDictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Provides(), this.getCapability(), null, "provides", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Upgrades(), this.getCapabilityUpgrade(), null, "upgrades", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Requires(), this.getCapability(), null, "requires", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Costs(), this.getCost(), null, "costs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(costEClass, Cost.class, "Cost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCost_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCost_Amount(), ecorePackage.getEFloatObject(), "amount", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCost_StartAfter(), ecorePackage.getEString(), "startAfter", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCost_RepeatDuration(), ecorePackage.getEString(), "repeatDuration", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCost_StopAfter(), ecorePackage.getEString(), "stopAfter", null, 0, 1, Cost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(capabilityUpgradeEClass, CapabilityUpgrade.class, "CapabilityUpgrade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCapabilityUpgrade_Name(), ecorePackage.getEString(), "name", null, 0, 1, CapabilityUpgrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCapabilityUpgrade_TargetComponent(), ecorePackage.getEString(), "targetComponent", null, 0, 1, CapabilityUpgrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapabilityUpgrade_Upgrading(), this.getComponent(), null, "upgrading", null, 0, 1, CapabilityUpgrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapabilityUpgrade_CapabilityChanges(), this.getCapabilityChange(), null, "capabilityChanges", null, 0, -1, CapabilityUpgrade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(capabilityChangeEClass, CapabilityChange.class, "CapabilityChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCapabilityChange_Name(), ecorePackage.getEString(), "name", null, 0, 1, CapabilityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCapabilityChange_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, CapabilityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runConfigurationEClass, RunConfiguration.class, "RunConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRunConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, RunConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRunConfiguration_PopSize(), ecorePackage.getEIntegerObject(), "popSize", null, 0, 1, RunConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRunConfiguration_GenCount(), ecorePackage.getEIntegerObject(), "genCount", null, 0, 1, RunConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(findTradeOffsEClass, FindTradeOffs.class, "FindTradeOffs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFindTradeOffs_Components(), this.getComponentU(), null, "components", null, 0, -1, FindTradeOffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFindTradeOffs_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, FindTradeOffs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(throughLifePlanningEClass, ThroughLifePlanning.class, "ThroughLifePlanning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getThroughLifePlanning_Components(), this.getComponentU(), null, "components", null, 0, -1, ThroughLifePlanning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getThroughLifePlanning_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, ThroughLifePlanning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getThroughLifePlanning_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, ThroughLifePlanning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getThroughLifePlanning_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, ThroughLifePlanning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentUEClass, ComponentU.class, "ComponentU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponentU_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponentU_Quantity(), ecorePackage.getEIntegerObject(), "quantity", null, 0, 1, ComponentU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(existingComponentEClass, ExistingComponent.class, "ExistingComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExistingComponent_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, ExistingComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExistingComponent_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, ExistingComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acquirableComponentEClass, AcquirableComponent.class, "AcquirableComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAcquirableComponent_AcquisitionTime(), ecorePackage.getEString(), "acquisitionTime", null, 0, 1, AcquirableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAcquirableComponent_LifeSpan(), ecorePackage.getEString(), "lifeSpan", null, 0, 1, AcquirableComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(desireHighEClass, DesireHigh.class, "DesireHigh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesireHigh_Name(), ecorePackage.getEString(), "name", null, 0, 1, DesireHigh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(desireLowEClass, DesireLow.class, "DesireLow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesireLow_Name(), ecorePackage.getEString(), "name", null, 0, 1, DesireLow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(budgetEClass, Budget.class, "Budget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBudget_Name(), ecorePackage.getEString(), "name", null, 0, 1, Budget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBudget_Amount(), ecorePackage.getEFloatObject(), "amount", null, 0, 1, Budget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBudget_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, Budget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBudget_RepeatDuration(), ecorePackage.getEString(), "repeatDuration", null, 0, 1, Budget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBudget_EndDate(), ecorePackage.getEString(), "endDate", null, 0, 1, Budget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    addAnnotation
      (getComponent_Costs(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });					
    addAnnotation
      (getCapabilityUpgrade_CapabilityChanges(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getCapabilityChange_Capabilities(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getFindTradeOffs_Components(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getFindTradeOffs_Constraints(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getThroughLifePlanning_Components(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getThroughLifePlanning_Constraints(), 
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
      (capabilityProvisionEClass, 
       source, 
       new String[] 
       {
       "label", "name"
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
    addAnnotation
      (qualitativeValueDictionaryEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (componentEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });						
    addAnnotation
      (costEClass, 
       source, 
       new String[] 
       {
       "label", "name,amount",
       "label.pattern", "{0} : {1}"
       });		
    addAnnotation
      (capabilityUpgradeEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });				
    addAnnotation
      (capabilityChangeEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });			
    addAnnotation
      (findTradeOffsEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });				
    addAnnotation
      (throughLifePlanningEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });				
    addAnnotation
      (componentUEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (existingComponentEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (acquirableComponentEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (desireHighEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (desireLowEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });		
    addAnnotation
      (budgetEClass, 
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
    addAnnotation
      (getQualitativeValueDictionary_GreaterThan(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "style", "dash",
       "color", "0,56,186"
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

} //ScenarioModelPackageImpl