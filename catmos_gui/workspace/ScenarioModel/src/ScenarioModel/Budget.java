/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ScenarioModel.Budget#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.Budget#getAmount <em>Amount</em>}</li>
 *   <li>{@link ScenarioModel.Budget#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ScenarioModel.Budget#getRepeatDuration <em>Repeat Duration</em>}</li>
 *   <li>{@link ScenarioModel.Budget#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see ScenarioModel.ScenarioModelPackage#getBudget()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Budget extends Constraint
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
   * @see ScenarioModel.ScenarioModelPackage#getBudget_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ScenarioModel.Budget#getName <em>Name</em>}' attribute.
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
   * @see ScenarioModel.ScenarioModelPackage#getBudget_Amount()
   * @model
   * @generated
   */
  Float getAmount();

  /**
   * Sets the value of the '{@link ScenarioModel.Budget#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(Float value);

  /**
   * Returns the value of the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Date</em>' attribute.
   * @see #setStartDate(String)
   * @see ScenarioModel.ScenarioModelPackage#getBudget_StartDate()
   * @model
   * @generated
   */
  String getStartDate();

  /**
   * Sets the value of the '{@link ScenarioModel.Budget#getStartDate <em>Start Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Date</em>' attribute.
   * @see #getStartDate()
   * @generated
   */
  void setStartDate(String value);

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
   * @see ScenarioModel.ScenarioModelPackage#getBudget_RepeatDuration()
   * @model
   * @generated
   */
  String getRepeatDuration();

  /**
   * Sets the value of the '{@link ScenarioModel.Budget#getRepeatDuration <em>Repeat Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeat Duration</em>' attribute.
   * @see #getRepeatDuration()
   * @generated
   */
  void setRepeatDuration(String value);

  /**
   * Returns the value of the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Date</em>' attribute.
   * @see #setEndDate(String)
   * @see ScenarioModel.ScenarioModelPackage#getBudget_EndDate()
   * @model
   * @generated
   */
  String getEndDate();

  /**
   * Sets the value of the '{@link ScenarioModel.Budget#getEndDate <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Date</em>' attribute.
   * @see #getEndDate()
   * @generated
   */
  void setEndDate(String value);

} // Budget
