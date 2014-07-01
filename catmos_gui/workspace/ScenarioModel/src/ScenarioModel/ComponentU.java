/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component U</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.ComponentU#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.ComponentU#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getComponentU()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ComponentU extends EObject
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
   * @see ScenarioModel.ScenarioModelPackage#getComponentU_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.ComponentU#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Quantity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity</em>' attribute.
   * @see #setQuantity(Integer)
   * @see ScenarioModel.ScenarioModelPackage#getComponentU_Quantity()
   * @model
   * @generated
   */
  Integer getQuantity();

  /**
   * Sets the value of the '{@link ScenarioModel.ComponentU#getQuantity <em>Quantity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity</em>' attribute.
   * @see #getQuantity()
   * @generated
   */
  void setQuantity(Integer value);

} // ComponentU
