/**
 */
package SimpleScenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Upgrade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleScenario.CapabilityUpgrade#getName <em>Name</em>}</li>
 *   <li>{@link SimpleScenario.CapabilityUpgrade#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link SimpleScenario.CapabilityUpgrade#getUpgrading <em>Upgrading</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleScenario.SimpleScenarioPackage#getCapabilityUpgrade()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface CapabilityUpgrade extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see SimpleScenario.SimpleScenarioPackage#getCapabilityUpgrade_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link SimpleScenario.CapabilityUpgrade#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Component</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Component</em>' attribute.
   * @see #setTargetComponent(String)
   * @see SimpleScenario.SimpleScenarioPackage#getCapabilityUpgrade_TargetComponent()
   * @model
   * @generated
   */
  String getTargetComponent();

  /**
   * Sets the value of the '{@link SimpleScenario.CapabilityUpgrade#getTargetComponent <em>Target Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Component</em>' attribute.
   * @see #getTargetComponent()
   * @generated
   */
  void setTargetComponent(String value);

  /**
   * Returns the value of the '<em><b>Upgrading</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upgrading</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upgrading</em>' reference.
   * @see #setUpgrading(Component)
   * @see SimpleScenario.SimpleScenarioPackage#getCapabilityUpgrade_Upgrading()
   * @model annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,255'"
   * @generated
   */
  Component getUpgrading();

  /**
   * Sets the value of the '{@link SimpleScenario.CapabilityUpgrade#getUpgrading <em>Upgrading</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upgrading</em>' reference.
   * @see #getUpgrading()
   * @generated
   */
  void setUpgrading(Component value);

} // CapabilityUpgrade
