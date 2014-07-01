/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.util;

import ScenarioModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ScenarioModel.ScenarioModelPackage
 * @generated
 */
public class ScenarioModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ScenarioModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ScenarioModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioModelSwitch<Adapter> modelSwitch =
    new ScenarioModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseOurObject(OurObject object)
      {
        return createOurObjectAdapter();
      }
      @Override
      public Adapter caseCapability(Capability object)
      {
        return createCapabilityAdapter();
      }
      @Override
      public Adapter caseCapabilityProvision(CapabilityProvision object)
      {
        return createCapabilityProvisionAdapter();
      }
      @Override
      public Adapter caseMeasurement(Measurement object)
      {
        return createMeasurementAdapter();
      }
      @Override
      public Adapter caseQualitativeValue(QualitativeValue object)
      {
        return createQualitativeValueAdapter();
      }
      @Override
      public Adapter caseQualitativeValueDictionary(QualitativeValueDictionary object)
      {
        return createQualitativeValueDictionaryAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseCost(Cost object)
      {
        return createCostAdapter();
      }
      @Override
      public Adapter caseCapabilityUpgrade(CapabilityUpgrade object)
      {
        return createCapabilityUpgradeAdapter();
      }
      @Override
      public Adapter caseCapabilityChange(CapabilityChange object)
      {
        return createCapabilityChangeAdapter();
      }
      @Override
      public Adapter caseRunConfiguration(RunConfiguration object)
      {
        return createRunConfigurationAdapter();
      }
      @Override
      public Adapter caseFindTradeOffs(FindTradeOffs object)
      {
        return createFindTradeOffsAdapter();
      }
      @Override
      public Adapter caseThroughLifePlanning(ThroughLifePlanning object)
      {
        return createThroughLifePlanningAdapter();
      }
      @Override
      public Adapter caseComponentU(ComponentU object)
      {
        return createComponentUAdapter();
      }
      @Override
      public Adapter caseExistingComponent(ExistingComponent object)
      {
        return createExistingComponentAdapter();
      }
      @Override
      public Adapter caseAcquirableComponent(AcquirableComponent object)
      {
        return createAcquirableComponentAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseDesireHigh(DesireHigh object)
      {
        return createDesireHighAdapter();
      }
      @Override
      public Adapter caseDesireLow(DesireLow object)
      {
        return createDesireLowAdapter();
      }
      @Override
      public Adapter caseBudget(Budget object)
      {
        return createBudgetAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.OurObject <em>Our Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.OurObject
   * @generated
   */
  public Adapter createOurObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.Capability
   * @generated
   */
  public Adapter createCapabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.CapabilityProvision <em>Capability Provision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.CapabilityProvision
   * @generated
   */
  public Adapter createCapabilityProvisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.Measurement <em>Measurement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.Measurement
   * @generated
   */
  public Adapter createMeasurementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.QualitativeValue <em>Qualitative Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.QualitativeValue
   * @generated
   */
  public Adapter createQualitativeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.QualitativeValueDictionary <em>Qualitative Value Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.QualitativeValueDictionary
   * @generated
   */
  public Adapter createQualitativeValueDictionaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.Cost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.Cost
   * @generated
   */
  public Adapter createCostAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.CapabilityUpgrade <em>Capability Upgrade</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.CapabilityUpgrade
   * @generated
   */
  public Adapter createCapabilityUpgradeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.CapabilityChange <em>Capability Change</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.CapabilityChange
   * @generated
   */
  public Adapter createCapabilityChangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.RunConfiguration <em>Run Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.RunConfiguration
   * @generated
   */
  public Adapter createRunConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.FindTradeOffs <em>Find Trade Offs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.FindTradeOffs
   * @generated
   */
  public Adapter createFindTradeOffsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.ThroughLifePlanning <em>Through Life Planning</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.ThroughLifePlanning
   * @generated
   */
  public Adapter createThroughLifePlanningAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.ComponentU <em>Component U</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.ComponentU
   * @generated
   */
  public Adapter createComponentUAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.ExistingComponent <em>Existing Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.ExistingComponent
   * @generated
   */
  public Adapter createExistingComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.AcquirableComponent <em>Acquirable Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.AcquirableComponent
   * @generated
   */
  public Adapter createAcquirableComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.DesireHigh <em>Desire High</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.DesireHigh
   * @generated
   */
  public Adapter createDesireHighAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.DesireLow <em>Desire Low</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.DesireLow
   * @generated
   */
  public Adapter createDesireLowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ScenarioModel.Budget <em>Budget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ScenarioModel.Budget
   * @generated
   */
  public Adapter createBudgetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ScenarioModelAdapterFactory
