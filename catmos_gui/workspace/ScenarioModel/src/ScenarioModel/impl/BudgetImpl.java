/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.Budget;
import ScenarioModel.ScenarioModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.BudgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.impl.BudgetImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link ScenarioModel.impl.BudgetImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ScenarioModel.impl.BudgetImpl#getRepeatDuration <em>Repeat Duration</em>}</li>
 *   <li>{@link ScenarioModel.impl.BudgetImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BudgetImpl extends ConstraintImpl implements Budget
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected static final Float AMOUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected Float amount = AMOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartDate()
   * @generated
   * @ordered
   */
  protected static final String START_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartDate()
   * @generated
   * @ordered
   */
  protected String startDate = START_DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getRepeatDuration() <em>Repeat Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatDuration()
   * @generated
   * @ordered
   */
  protected static final String REPEAT_DURATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepeatDuration() <em>Repeat Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeatDuration()
   * @generated
   * @ordered
   */
  protected String repeatDuration = REPEAT_DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndDate()
   * @generated
   * @ordered
   */
  protected static final String END_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndDate()
   * @generated
   * @ordered
   */
  protected String endDate = END_DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BudgetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ScenarioModelPackage.Literals.BUDGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.BUDGET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmount(Float newAmount)
  {
    Float oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.BUDGET__AMOUNT, oldAmount, amount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStartDate()
  {
    return startDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartDate(String newStartDate)
  {
    String oldStartDate = startDate;
    startDate = newStartDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.BUDGET__START_DATE, oldStartDate, startDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRepeatDuration()
  {
    return repeatDuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeatDuration(String newRepeatDuration)
  {
    String oldRepeatDuration = repeatDuration;
    repeatDuration = newRepeatDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.BUDGET__REPEAT_DURATION, oldRepeatDuration, repeatDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndDate()
  {
    return endDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndDate(String newEndDate)
  {
    String oldEndDate = endDate;
    endDate = newEndDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.BUDGET__END_DATE, oldEndDate, endDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ScenarioModelPackage.BUDGET__NAME:
        return getName();
      case ScenarioModelPackage.BUDGET__AMOUNT:
        return getAmount();
      case ScenarioModelPackage.BUDGET__START_DATE:
        return getStartDate();
      case ScenarioModelPackage.BUDGET__REPEAT_DURATION:
        return getRepeatDuration();
      case ScenarioModelPackage.BUDGET__END_DATE:
        return getEndDate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScenarioModelPackage.BUDGET__NAME:
        setName((String)newValue);
        return;
      case ScenarioModelPackage.BUDGET__AMOUNT:
        setAmount((Float)newValue);
        return;
      case ScenarioModelPackage.BUDGET__START_DATE:
        setStartDate((String)newValue);
        return;
      case ScenarioModelPackage.BUDGET__REPEAT_DURATION:
        setRepeatDuration((String)newValue);
        return;
      case ScenarioModelPackage.BUDGET__END_DATE:
        setEndDate((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ScenarioModelPackage.BUDGET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScenarioModelPackage.BUDGET__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
        return;
      case ScenarioModelPackage.BUDGET__START_DATE:
        setStartDate(START_DATE_EDEFAULT);
        return;
      case ScenarioModelPackage.BUDGET__REPEAT_DURATION:
        setRepeatDuration(REPEAT_DURATION_EDEFAULT);
        return;
      case ScenarioModelPackage.BUDGET__END_DATE:
        setEndDate(END_DATE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ScenarioModelPackage.BUDGET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScenarioModelPackage.BUDGET__AMOUNT:
        return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
      case ScenarioModelPackage.BUDGET__START_DATE:
        return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
      case ScenarioModelPackage.BUDGET__REPEAT_DURATION:
        return REPEAT_DURATION_EDEFAULT == null ? repeatDuration != null : !REPEAT_DURATION_EDEFAULT.equals(repeatDuration);
      case ScenarioModelPackage.BUDGET__END_DATE:
        return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", amount: ");
    result.append(amount);
    result.append(", startDate: ");
    result.append(startDate);
    result.append(", repeatDuration: ");
    result.append(repeatDuration);
    result.append(", endDate: ");
    result.append(endDate);
    result.append(')');
    return result.toString();
  }

} //BudgetImpl