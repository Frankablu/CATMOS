/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.Cost;
import ScenarioModel.ScenarioModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.CostImpl#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.impl.CostImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link ScenarioModel.impl.CostImpl#getStartAfter <em>Start After</em>}</li>
 *   <li>{@link ScenarioModel.impl.CostImpl#getRepeatDuration <em>Repeat Duration</em>}</li>
 *   <li>{@link ScenarioModel.impl.CostImpl#getStopAfter <em>Stop After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostImpl extends EObjectImpl implements Cost
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
   * The default value of the '{@link #getStartAfter() <em>Start After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartAfter()
   * @generated
   * @ordered
   */
  protected static final String START_AFTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartAfter() <em>Start After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartAfter()
   * @generated
   * @ordered
   */
  protected String startAfter = START_AFTER_EDEFAULT;

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
   * The default value of the '{@link #getStopAfter() <em>Stop After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopAfter()
   * @generated
   * @ordered
   */
  protected static final String STOP_AFTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStopAfter() <em>Stop After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopAfter()
   * @generated
   * @ordered
   */
  protected String stopAfter = STOP_AFTER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CostImpl()
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
    return ScenarioModelPackage.Literals.COST;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.COST__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.COST__AMOUNT, oldAmount, amount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStartAfter()
  {
    return startAfter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartAfter(String newStartAfter)
  {
    String oldStartAfter = startAfter;
    startAfter = newStartAfter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.COST__START_AFTER, oldStartAfter, startAfter));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.COST__REPEAT_DURATION, oldRepeatDuration, repeatDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStopAfter()
  {
    return stopAfter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStopAfter(String newStopAfter)
  {
    String oldStopAfter = stopAfter;
    stopAfter = newStopAfter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.COST__STOP_AFTER, oldStopAfter, stopAfter));
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
      case ScenarioModelPackage.COST__NAME:
        return getName();
      case ScenarioModelPackage.COST__AMOUNT:
        return getAmount();
      case ScenarioModelPackage.COST__START_AFTER:
        return getStartAfter();
      case ScenarioModelPackage.COST__REPEAT_DURATION:
        return getRepeatDuration();
      case ScenarioModelPackage.COST__STOP_AFTER:
        return getStopAfter();
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
      case ScenarioModelPackage.COST__NAME:
        setName((String)newValue);
        return;
      case ScenarioModelPackage.COST__AMOUNT:
        setAmount((Float)newValue);
        return;
      case ScenarioModelPackage.COST__START_AFTER:
        setStartAfter((String)newValue);
        return;
      case ScenarioModelPackage.COST__REPEAT_DURATION:
        setRepeatDuration((String)newValue);
        return;
      case ScenarioModelPackage.COST__STOP_AFTER:
        setStopAfter((String)newValue);
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
      case ScenarioModelPackage.COST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScenarioModelPackage.COST__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
        return;
      case ScenarioModelPackage.COST__START_AFTER:
        setStartAfter(START_AFTER_EDEFAULT);
        return;
      case ScenarioModelPackage.COST__REPEAT_DURATION:
        setRepeatDuration(REPEAT_DURATION_EDEFAULT);
        return;
      case ScenarioModelPackage.COST__STOP_AFTER:
        setStopAfter(STOP_AFTER_EDEFAULT);
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
      case ScenarioModelPackage.COST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScenarioModelPackage.COST__AMOUNT:
        return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
      case ScenarioModelPackage.COST__START_AFTER:
        return START_AFTER_EDEFAULT == null ? startAfter != null : !START_AFTER_EDEFAULT.equals(startAfter);
      case ScenarioModelPackage.COST__REPEAT_DURATION:
        return REPEAT_DURATION_EDEFAULT == null ? repeatDuration != null : !REPEAT_DURATION_EDEFAULT.equals(repeatDuration);
      case ScenarioModelPackage.COST__STOP_AFTER:
        return STOP_AFTER_EDEFAULT == null ? stopAfter != null : !STOP_AFTER_EDEFAULT.equals(stopAfter);
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
    result.append(", startAfter: ");
    result.append(startAfter);
    result.append(", repeatDuration: ");
    result.append(repeatDuration);
    result.append(", stopAfter: ");
    result.append(stopAfter);
    result.append(')');
    return result.toString();
  }

} //CostImpl
