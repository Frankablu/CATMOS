/**
 */
package SimpleScenario.impl;

import SimpleScenario.*;

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
public class SimpleScenarioFactoryImpl extends EFactoryImpl implements SimpleScenarioFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimpleScenarioFactory init()
  {
    try
    {
      SimpleScenarioFactory theSimpleScenarioFactory = (SimpleScenarioFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleScenarioPackage.eNS_URI);
      if (theSimpleScenarioFactory != null)
      {
        return theSimpleScenarioFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimpleScenarioFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleScenarioFactoryImpl()
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
      case SimpleScenarioPackage.SCENARIO: return createScenario();
      case SimpleScenarioPackage.OUR_OBJECT: return createOurObject();
      case SimpleScenarioPackage.CAPABILITY: return createCapability();
      case SimpleScenarioPackage.COMPONENT: return createComponent();
      case SimpleScenarioPackage.CAPABILITY_UPGRADE: return createCapabilityUpgrade();
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
  public SimpleScenarioPackage getSimpleScenarioPackage()
  {
    return (SimpleScenarioPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimpleScenarioPackage getPackage()
  {
    return SimpleScenarioPackage.eINSTANCE;
  }

} //SimpleScenarioFactoryImpl
