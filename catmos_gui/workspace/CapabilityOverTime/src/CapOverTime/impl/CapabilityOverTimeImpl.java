/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CapOverTime.impl;

import CapOverTime.CapOverTimePackage;
import CapOverTime.CapabilityOverTime;
import CapOverTime.TimePeriod;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Over Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CapOverTime.impl.CapabilityOverTimeImpl#getTimePeriods <em>Time Periods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityOverTimeImpl extends EObjectImpl implements CapabilityOverTime
{
  /**
   * The cached value of the '{@link #getTimePeriods() <em>Time Periods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimePeriods()
   * @generated
   * @ordered
   */
  protected EList<TimePeriod> timePeriods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CapabilityOverTimeImpl()
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
    return CapOverTimePackage.Literals.CAPABILITY_OVER_TIME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TimePeriod> getTimePeriods()
  {
    if (timePeriods == null)
    {
      timePeriods = new EObjectContainmentEList<TimePeriod>(TimePeriod.class, this, CapOverTimePackage.CAPABILITY_OVER_TIME__TIME_PERIODS);
    }
    return timePeriods;
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
      case CapOverTimePackage.CAPABILITY_OVER_TIME__TIME_PERIODS:
        return ((InternalEList<?>)getTimePeriods()).basicRemove(otherEnd, msgs);
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
      case CapOverTimePackage.CAPABILITY_OVER_TIME__TIME_PERIODS:
        return getTimePeriods();
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
      case CapOverTimePackage.CAPABILITY_OVER_TIME__TIME_PERIODS:
        getTimePeriods().clear();
        getTimePeriods().addAll((Collection<? extends TimePeriod>)newValue);
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
      case CapOverTimePackage.CAPABILITY_OVER_TIME__TIME_PERIODS:
        getTimePeriods().clear();
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
      case CapOverTimePackage.CAPABILITY_OVER_TIME__TIME_PERIODS:
        return timePeriods != null && !timePeriods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CapabilityOverTimeImpl
