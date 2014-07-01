/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ScenarioModel.ScenarioModelPackage
 * @generated
 */
public interface ScenarioModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScenarioModelFactory eINSTANCE = ScenarioModel.impl.ScenarioModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Our Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Our Object</em>'.
   * @generated
   */
  OurObject createOurObject();

  /**
   * Returns a new object of class '<em>Capability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability</em>'.
   * @generated
   */
  Capability createCapability();

  /**
   * Returns a new object of class '<em>Capability Provision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability Provision</em>'.
   * @generated
   */
  CapabilityProvision createCapabilityProvision();

  /**
   * Returns a new object of class '<em>Measurement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Measurement</em>'.
   * @generated
   */
  Measurement createMeasurement();

  /**
   * Returns a new object of class '<em>Qualitative Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualitative Value</em>'.
   * @generated
   */
  QualitativeValue createQualitativeValue();

  /**
   * Returns a new object of class '<em>Qualitative Value Dictionary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualitative Value Dictionary</em>'.
   * @generated
   */
  QualitativeValueDictionary createQualitativeValueDictionary();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Cost</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cost</em>'.
   * @generated
   */
  Cost createCost();

  /**
   * Returns a new object of class '<em>Capability Upgrade</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability Upgrade</em>'.
   * @generated
   */
  CapabilityUpgrade createCapabilityUpgrade();

  /**
   * Returns a new object of class '<em>Capability Change</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability Change</em>'.
   * @generated
   */
  CapabilityChange createCapabilityChange();

  /**
   * Returns a new object of class '<em>Run Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Run Configuration</em>'.
   * @generated
   */
  RunConfiguration createRunConfiguration();

  /**
   * Returns a new object of class '<em>Find Trade Offs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Find Trade Offs</em>'.
   * @generated
   */
  FindTradeOffs createFindTradeOffs();

  /**
   * Returns a new object of class '<em>Through Life Planning</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Through Life Planning</em>'.
   * @generated
   */
  ThroughLifePlanning createThroughLifePlanning();

  /**
   * Returns a new object of class '<em>Component U</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component U</em>'.
   * @generated
   */
  ComponentU createComponentU();

  /**
   * Returns a new object of class '<em>Existing Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Existing Component</em>'.
   * @generated
   */
  ExistingComponent createExistingComponent();

  /**
   * Returns a new object of class '<em>Acquirable Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acquirable Component</em>'.
   * @generated
   */
  AcquirableComponent createAcquirableComponent();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Desire High</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Desire High</em>'.
   * @generated
   */
  DesireHigh createDesireHigh();

  /**
   * Returns a new object of class '<em>Desire Low</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Desire Low</em>'.
   * @generated
   */
  DesireLow createDesireLow();

  /**
   * Returns a new object of class '<em>Budget</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Budget</em>'.
   * @generated
   */
  Budget createBudget();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ScenarioModelPackage getScenarioModelPackage();

} //ScenarioModelFactory
