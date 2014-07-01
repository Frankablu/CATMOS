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
 * A representation of the model object '<em><b>Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.Cost#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.Cost#getAmount <em>Amount</em>}</li>
 *   <li>{@link ScenarioModel.Cost#getStartAfter <em>Start After</em>}</li>
 *   <li>{@link ScenarioModel.Cost#getRepeatDuration <em>Repeat Duration</em>}</li>
 *   <li>{@link ScenarioModel.Cost#getStopAfter <em>Stop After</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getCost()
 * @model annotation="gmf.node label='name,amount' label.pattern='{0} : {1}'"
 * @generated
 */
public interface Cost extends EObject
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
   * @see ScenarioModel.ScenarioModelPackage#getCost_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.Cost#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(Float)
   * @see ScenarioModel.ScenarioModelPackage#getCost_Amount()
   * @model
   * @generated
   */
  Float getAmount();

  /**
   * Sets the value of the '{@link ScenarioModel.Cost#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(Float value);

  /**
   * Returns the value of the '<em><b>Start After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start After</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start After</em>' attribute.
   * @see #setStartAfter(String)
   * @see ScenarioModel.ScenarioModelPackage#getCost_StartAfter()
   * @model
   * @generated
   */
  String getStartAfter();

  /**
   * Sets the value of the '{@link ScenarioModel.Cost#getStartAfter <em>Start After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start After</em>' attribute.
   * @see #getStartAfter()
   * @generated
   */
  void setStartAfter(String value);

  /**
   * Returns the value of the '<em><b>Repeat Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeat Duration</em>' attribute.
   * @see #setRepeatDuration(String)
   * @see ScenarioModel.ScenarioModelPackage#getCost_RepeatDuration()
   * @model
   * @generated
   */
  String getRepeatDuration();

  /**
   * Sets the value of the '{@link ScenarioModel.Cost#getRepeatDuration <em>Repeat Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeat Duration</em>' attribute.
   * @see #getRepeatDuration()
   * @generated
   */
  void setRepeatDuration(String value);

  /**
   * Returns the value of the '<em><b>Stop After</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop After</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop After</em>' attribute.
   * @see #setStopAfter(String)
   * @see ScenarioModel.ScenarioModelPackage#getCost_StopAfter()
   * @model
   * @generated
   */
  String getStopAfter();

  /**
   * Sets the value of the '{@link ScenarioModel.Cost#getStopAfter <em>Stop After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop After</em>' attribute.
   * @see #getStopAfter()
   * @generated
   */
  void setStopAfter(String value);

} // Cost
