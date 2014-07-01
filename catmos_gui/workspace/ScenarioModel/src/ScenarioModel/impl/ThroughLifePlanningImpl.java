/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.ComponentU;
import ScenarioModel.Constraint;
import ScenarioModel.ScenarioModelPackage;
import ScenarioModel.ThroughLifePlanning;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Through Life Planning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.ThroughLifePlanningImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link ScenarioModel.impl.ThroughLifePlanningImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ScenarioModel.impl.ThroughLifePlanningImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ScenarioModel.impl.ThroughLifePlanningImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThroughLifePlanningImpl extends RunConfigurationImpl implements ThroughLifePlanning
{
  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<ComponentU> components;

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
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ThroughLifePlanningImpl()
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
    return ScenarioModelPackage.Literals.THROUGH_LIFE_PLANNING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComponentU> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<ComponentU>(ComponentU.class, this, ScenarioModelPackage.THROUGH_LIFE_PLANNING__COMPONENTS);
    }
    return components;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.THROUGH_LIFE_PLANNING__START_DATE, oldStartDate, startDate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.THROUGH_LIFE_PLANNING__END_DATE, oldEndDate, endDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ScenarioModelPackage.THROUGH_LIFE_PLANNING__CONSTRAINTS);
    }
    return constraints;
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
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__COMPONENTS:
        return getComponents();
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__START_DATE:
        return getStartDate();
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__END_DATE:
        return getEndDate();
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__CONSTRAINTS:
        return getConstraints();
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
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends ComponentU>)newValue);
        return;
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__START_DATE:
        setStartDate((String)newValue);
        return;
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__END_DATE:
        setEndDate((String)newValue);
        return;
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__COMPONENTS:
        getComponents().clear();
        return;
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__START_DATE:
        setStartDate(START_DATE_EDEFAULT);
        return;
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__END_DATE:
        setEndDate(END_DATE_EDEFAULT);
        return;
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__CONSTRAINTS:
        getConstraints().clear();
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
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__COMPONENTS:
        return components != null && !components.isEmpty();
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__START_DATE:
        return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__END_DATE:
        return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
      case ScenarioModelPackage.THROUGH_LIFE_PLANNING__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
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
    result.append(" (startDate: ");
    result.append(startDate);
    result.append(", endDate: ");
    result.append(endDate);
    result.append(')');
    return result.toString();
  }

} //ThroughLifePlanningImpl
