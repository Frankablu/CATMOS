/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Upgrade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.CapabilityUpgrade#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.CapabilityUpgrade#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link ScenarioModel.CapabilityUpgrade#getUpgrading <em>Upgrading</em>}</li>
 *   <li>{@link ScenarioModel.CapabilityUpgrade#getCapabilityChanges <em>Capability Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getCapabilityUpgrade()
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
   * @see ScenarioModel.ScenarioModelPackage#getCapabilityUpgrade_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.CapabilityUpgrade#getName <em>Name</em>}' attribute.
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
   * @see ScenarioModel.ScenarioModelPackage#getCapabilityUpgrade_TargetComponent()
   * @model
   * @generated
   */
  String getTargetComponent();

  /**
   * Sets the value of the '{@link ScenarioModel.CapabilityUpgrade#getTargetComponent <em>Target Component</em>}' attribute.
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
   * @see ScenarioModel.ScenarioModelPackage#getCapabilityUpgrade_Upgrading()
   * @model annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,255'"
   * @generated
   */
  Component getUpgrading();

  /**
   * Sets the value of the '{@link ScenarioModel.CapabilityUpgrade#getUpgrading <em>Upgrading</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upgrading</em>' reference.
   * @see #getUpgrading()
   * @generated
   */
  void setUpgrading(Component value);

  /**
   * Returns the value of the '<em><b>Capability Changes</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.CapabilityChange}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capability Changes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capability Changes</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getCapabilityUpgrade_CapabilityChanges()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<CapabilityChange> getCapabilityChanges();

} // CapabilityUpgrade
