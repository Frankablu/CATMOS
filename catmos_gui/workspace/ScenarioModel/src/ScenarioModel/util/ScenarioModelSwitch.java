/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.util;

import ScenarioModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ScenarioModel.ScenarioModelPackage
 * @generated
 */
public class ScenarioModelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ScenarioModelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScenarioModelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ScenarioModelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ScenarioModelPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.OUR_OBJECT:
      {
        OurObject ourObject = (OurObject)theEObject;
        T result = caseOurObject(ourObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.CAPABILITY:
      {
        Capability capability = (Capability)theEObject;
        T result = caseCapability(capability);
        if (result == null) result = caseOurObject(capability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.CAPABILITY_PROVISION:
      {
        CapabilityProvision capabilityProvision = (CapabilityProvision)theEObject;
        T result = caseCapabilityProvision(capabilityProvision);
        if (result == null) result = caseCapability(capabilityProvision);
        if (result == null) result = caseOurObject(capabilityProvision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.MEASUREMENT:
      {
        Measurement measurement = (Measurement)theEObject;
        T result = caseMeasurement(measurement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.QUALITATIVE_VALUE:
      {
        QualitativeValue qualitativeValue = (QualitativeValue)theEObject;
        T result = caseQualitativeValue(qualitativeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY:
      {
        QualitativeValueDictionary qualitativeValueDictionary = (QualitativeValueDictionary)theEObject;
        T result = caseQualitativeValueDictionary(qualitativeValueDictionary);
        if (result == null) result = caseOurObject(qualitativeValueDictionary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseOurObject(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.COST:
      {
        Cost cost = (Cost)theEObject;
        T result = caseCost(cost);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.CAPABILITY_UPGRADE:
      {
        CapabilityUpgrade capabilityUpgrade = (CapabilityUpgrade)theEObject;
        T result = caseCapabilityUpgrade(capabilityUpgrade);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.CAPABILITY_CHANGE:
      {
        CapabilityChange capabilityChange = (CapabilityChange)theEObject;
        T result = caseCapabilityChange(capabilityChange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.RUN_CONFIGURATION:
      {
        RunConfiguration runConfiguration = (RunConfiguration)theEObject;
        T result = caseRunConfiguration(runConfiguration);
        if (result == null) result = caseOurObject(runConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.FIND_TRADE_OFFS:
      {
        FindTradeOffs findTradeOffs = (FindTradeOffs)theEObject;
        T result = caseFindTradeOffs(findTradeOffs);
        if (result == null) result = caseRunConfiguration(findTradeOffs);
        if (result == null) result = caseOurObject(findTradeOffs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING:
      {
        ThroughLifePlanning throughLifePlanning = (ThroughLifePlanning)theEObject;
        T result = caseThroughLifePlanning(throughLifePlanning);
        if (result == null) result = caseRunConfiguration(throughLifePlanning);
        if (result == null) result = caseOurObject(throughLifePlanning);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.COMPONENT_U:
      {
        ComponentU componentU = (ComponentU)theEObject;
        T result = caseComponentU(componentU);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.EXISTING_COMPONENT:
      {
        ExistingComponent existingComponent = (ExistingComponent)theEObject;
        T result = caseExistingComponent(existingComponent);
        if (result == null) result = caseComponentU(existingComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT:
      {
        AcquirableComponent acquirableComponent = (AcquirableComponent)theEObject;
        T result = caseAcquirableComponent(acquirableComponent);
        if (result == null) result = caseComponentU(acquirableComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.DESIRE_HIGH:
      {
        DesireHigh desireHigh = (DesireHigh)theEObject;
        T result = caseDesireHigh(desireHigh);
        if (result == null) result = caseConstraint(desireHigh);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.DESIRE_LOW:
      {
        DesireLow desireLow = (DesireLow)theEObject;
        T result = caseDesireLow(desireLow);
        if (result == null) result = caseConstraint(desireLow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ScenarioModelPackage.BUDGET:
      {
        Budget budget = (Budget)theEObject;
        T result = caseBudget(budget);
        if (result == null) result = caseConstraint(budget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Our Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Our Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOurObject(OurObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCapability(Capability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capability Provision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capability Provision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCapabilityProvision(CapabilityProvision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeasurement(Measurement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualitative Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualitative Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualitativeValue(QualitativeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualitative Value Dictionary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualitative Value Dictionary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualitativeValueDictionary(QualitativeValueDictionary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cost</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cost</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCost(Cost object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capability Upgrade</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capability Upgrade</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCapabilityUpgrade(CapabilityUpgrade object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Capability Change</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Capability Change</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCapabilityChange(CapabilityChange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunConfiguration(RunConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Find Trade Offs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Find Trade Offs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFindTradeOffs(FindTradeOffs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Through Life Planning</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Through Life Planning</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThroughLifePlanning(ThroughLifePlanning object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component U</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component U</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentU(ComponentU object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Existing Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Existing Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExistingComponent(ExistingComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acquirable Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acquirable Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcquirableComponent(AcquirableComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Desire High</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Desire High</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesireHigh(DesireHigh object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Desire Low</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Desire Low</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesireLow(DesireLow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Budget</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Budget</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBudget(Budget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ScenarioModelSwitch