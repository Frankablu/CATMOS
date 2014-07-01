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
 * A representation of the model object '<em><b>Capability Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.CapabilityChange#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.CapabilityChange#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getCapabilityChange()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface CapabilityChange extends EObject
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
   * @see ScenarioModel.ScenarioModelPackage#getCapabilityChange_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.CapabilityChange#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
   * The list contents are of type {@link ScenarioModel.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capabilities</em>' containment reference list.
   * @see ScenarioModel.ScenarioModelPackage#getCapabilityChange_Capabilities()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Capability> getCapabilities();

} // CapabilityChange
