/**
 */
package SimpleScenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SimpleScenario.SimpleScenarioPackage
 * @generated
 */
public interface SimpleScenarioFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleScenarioFactory eINSTANCE = SimpleScenario.impl.SimpleScenarioFactoryImpl.init();

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
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Capability Upgrade</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Capability Upgrade</em>'.
   * @generated
   */
  CapabilityUpgrade createCapabilityUpgrade();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimpleScenarioPackage getSimpleScenarioPackage();

} //SimpleScenarioFactory
