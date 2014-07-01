/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.AcquirableComponent;
import ScenarioModel.ScenarioModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acquirable Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.AcquirableComponentImpl#getAcquisitionTime <em>Acquisition Time</em>}</li>
 *   <li>{@link ScenarioModel.impl.AcquirableComponentImpl#getLifeSpan <em>Life Span</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcquirableComponentImpl extends ComponentUImpl implements AcquirableComponent
{
  /**
   * The default value of the '{@link #getAcquisitionTime() <em>Acquisition Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcquisitionTime()
   * @generated
   * @ordered
   */
  protected static final String ACQUISITION_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcquisitionTime() <em>Acquisition Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcquisitionTime()
   * @generated
   * @ordered
   */
  protected String acquisitionTime = ACQUISITION_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getLifeSpan() <em>Life Span</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifeSpan()
   * @generated
   * @ordered
   */
  protected static final String LIFE_SPAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLifeSpan() <em>Life Span</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifeSpan()
   * @generated
   * @ordered
   */
  protected String lifeSpan = LIFE_SPAN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AcquirableComponentImpl()
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
    return ScenarioModelPackage.Literals.ACQUIRABLE_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAcquisitionTime()
  {
    return acquisitionTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcquisitionTime(String newAcquisitionTime)
  {
    String oldAcquisitionTime = acquisitionTime;
    acquisitionTime = newAcquisitionTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.ACQUIRABLE_COMPONENT__ACQUISITION_TIME, oldAcquisitionTime, acquisitionTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLifeSpan()
  {
    return lifeSpan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLifeSpan(String newLifeSpan)
  {
    String oldLifeSpan = lifeSpan;
    lifeSpan = newLifeSpan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.ACQUIRABLE_COMPONENT__LIFE_SPAN, oldLifeSpan, lifeSpan));
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
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT__ACQUISITION_TIME:
        return getAcquisitionTime();
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT__LIFE_SPAN:
        return getLifeSpan();
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
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT__ACQUISITION_TIME:
        setAcquisitionTime((String)newValue);
        return;
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT__LIFE_SPAN:
        setLifeSpan((String)newValue);
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
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT__ACQUISITION_TIME:
        setAcquisitionTime(ACQUISITION_TIME_EDEFAULT);
        return;
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT__LIFE_SPAN:
        setLifeSpan(LIFE_SPAN_EDEFAULT);
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
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT__ACQUISITION_TIME:
        return ACQUISITION_TIME_EDEFAULT == null ? acquisitionTime != null : !ACQUISITION_TIME_EDEFAULT.equals(acquisitionTime);
      case ScenarioModelPackage.ACQUIRABLE_COMPONENT__LIFE_SPAN:
        return LIFE_SPAN_EDEFAULT == null ? lifeSpan != null : !LIFE_SPAN_EDEFAULT.equals(lifeSpan);
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
    result.append(" (acquisitionTime: ");
    result.append(acquisitionTime);
    result.append(", lifeSpan: ");
    result.append(lifeSpan);
    result.append(')');
    return result.toString();
  }

} //AcquirableComponentImpl
