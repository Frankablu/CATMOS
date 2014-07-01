/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime.impl;

import CapOverTime.CapOverTimePackage;
import CapOverTime.OurObject;
import CapOverTime.TimePeriod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CapOverTime.impl.TimePeriodImpl#getName <em>Name</em>}</li>
 *   <li>{@link CapOverTime.impl.TimePeriodImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link CapOverTime.impl.TimePeriodImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link CapOverTime.impl.TimePeriodImpl#getOurObjects <em>Our Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimePeriodImpl extends EObjectImpl implements TimePeriod
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
   * The cached value of the '{@link #getOurObjects() <em>Our Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOurObjects()
   * @generated
   * @ordered
   */
  protected EList<OurObject> ourObjects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimePeriodImpl()
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
    return CapOverTimePackage.Literals.TIME_PERIOD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CapOverTimePackage.TIME_PERIOD__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CapOverTimePackage.TIME_PERIOD__START_DATE, oldStartDate, startDate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CapOverTimePackage.TIME_PERIOD__END_DATE, oldEndDate, endDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OurObject> getOurObjects()
  {
    if (ourObjects == null)
    {
      ourObjects = new EObjectContainmentEList<OurObject>(OurObject.class, this, CapOverTimePackage.TIME_PERIOD__OUR_OBJECTS);
    }
    return ourObjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CapOverTimePackage.TIME_PERIOD__OUR_OBJECTS:
        return ((InternalEList<?>)getOurObjects()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CapOverTimePackage.TIME_PERIOD__NAME:
        return getName();
      case CapOverTimePackage.TIME_PERIOD__START_DATE:
        return getStartDate();
      case CapOverTimePackage.TIME_PERIOD__END_DATE:
        return getEndDate();
      case CapOverTimePackage.TIME_PERIOD__OUR_OBJECTS:
        return getOurObjects();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CapOverTimePackage.TIME_PERIOD__NAME:
        setName((String)newValue);
        return;
      case CapOverTimePackage.TIME_PERIOD__START_DATE:
        setStartDate((String)newValue);
        return;
      case CapOverTimePackage.TIME_PERIOD__END_DATE:
        setEndDate((String)newValue);
        return;
      case CapOverTimePackage.TIME_PERIOD__OUR_OBJECTS:
        getOurObjects().clear();
        getOurObjects().addAll((Collection<? extends OurObject>)newValue);
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
      case CapOverTimePackage.TIME_PERIOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CapOverTimePackage.TIME_PERIOD__START_DATE:
        setStartDate(START_DATE_EDEFAULT);
        return;
      case CapOverTimePackage.TIME_PERIOD__END_DATE:
        setEndDate(END_DATE_EDEFAULT);
        return;
      case CapOverTimePackage.TIME_PERIOD__OUR_OBJECTS:
        getOurObjects().clear();
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
      case CapOverTimePackage.TIME_PERIOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CapOverTimePackage.TIME_PERIOD__START_DATE:
        return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
      case CapOverTimePackage.TIME_PERIOD__END_DATE:
        return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
      case CapOverTimePackage.TIME_PERIOD__OUR_OBJECTS:
        return ourObjects != null && !ourObjects.isEmpty();
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
    result.append(", startDate: ");
    result.append(startDate);
    result.append(", endDate: ");
    result.append(endDate);
    result.append(')');
    return result.toString();
  }

} //TimePeriodImpl
