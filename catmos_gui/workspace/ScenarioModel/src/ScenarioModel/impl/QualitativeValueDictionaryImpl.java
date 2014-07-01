/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.QualitativeValueDictionary;
import ScenarioModel.ScenarioModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualitative Value Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.QualitativeValueDictionaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.impl.QualitativeValueDictionaryImpl#getGreaterThan <em>Greater Than</em>}</li>
 *   <li>{@link ScenarioModel.impl.QualitativeValueDictionaryImpl#getLessThan <em>Less Than</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualitativeValueDictionaryImpl extends OurObjectImpl implements QualitativeValueDictionary
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
   * The cached value of the '{@link #getGreaterThan() <em>Greater Than</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreaterThan()
   * @generated
   * @ordered
   */
  protected QualitativeValueDictionary greaterThan;

  /**
   * The cached value of the '{@link #getLessThan() <em>Less Than</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLessThan()
   * @generated
   * @ordered
   */
  protected QualitativeValueDictionary lessThan;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualitativeValueDictionaryImpl()
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
    return ScenarioModelPackage.Literals.QUALITATIVE_VALUE_DICTIONARY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeValueDictionary getGreaterThan()
  {
    if (greaterThan != null && greaterThan.eIsProxy())
    {
      InternalEObject oldGreaterThan = (InternalEObject)greaterThan;
      greaterThan = (QualitativeValueDictionary)eResolveProxy(oldGreaterThan);
      if (greaterThan != oldGreaterThan)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN, oldGreaterThan, greaterThan));
      }
    }
    return greaterThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeValueDictionary basicGetGreaterThan()
  {
    return greaterThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGreaterThan(QualitativeValueDictionary newGreaterThan, NotificationChain msgs)
  {
    QualitativeValueDictionary oldGreaterThan = greaterThan;
    greaterThan = newGreaterThan;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN, oldGreaterThan, newGreaterThan);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreaterThan(QualitativeValueDictionary newGreaterThan)
  {
    if (newGreaterThan != greaterThan)
    {
      NotificationChain msgs = null;
      if (greaterThan != null)
        msgs = ((InternalEObject)greaterThan).eInverseRemove(this, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN, QualitativeValueDictionary.class, msgs);
      if (newGreaterThan != null)
        msgs = ((InternalEObject)newGreaterThan).eInverseAdd(this, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN, QualitativeValueDictionary.class, msgs);
      msgs = basicSetGreaterThan(newGreaterThan, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN, newGreaterThan, newGreaterThan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeValueDictionary getLessThan()
  {
    if (lessThan != null && lessThan.eIsProxy())
    {
      InternalEObject oldLessThan = (InternalEObject)lessThan;
      lessThan = (QualitativeValueDictionary)eResolveProxy(oldLessThan);
      if (lessThan != oldLessThan)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN, oldLessThan, lessThan));
      }
    }
    return lessThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeValueDictionary basicGetLessThan()
  {
    return lessThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLessThan(QualitativeValueDictionary newLessThan, NotificationChain msgs)
  {
    QualitativeValueDictionary oldLessThan = lessThan;
    lessThan = newLessThan;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN, oldLessThan, newLessThan);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLessThan(QualitativeValueDictionary newLessThan)
  {
    if (newLessThan != lessThan)
    {
      NotificationChain msgs = null;
      if (lessThan != null)
        msgs = ((InternalEObject)lessThan).eInverseRemove(this, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN, QualitativeValueDictionary.class, msgs);
      if (newLessThan != null)
        msgs = ((InternalEObject)newLessThan).eInverseAdd(this, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN, QualitativeValueDictionary.class, msgs);
      msgs = basicSetLessThan(newLessThan, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN, newLessThan, newLessThan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN:
        if (greaterThan != null)
          msgs = ((InternalEObject)greaterThan).eInverseRemove(this, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN, QualitativeValueDictionary.class, msgs);
        return basicSetGreaterThan((QualitativeValueDictionary)otherEnd, msgs);
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN:
        if (lessThan != null)
          msgs = ((InternalEObject)lessThan).eInverseRemove(this, ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN, QualitativeValueDictionary.class, msgs);
        return basicSetLessThan((QualitativeValueDictionary)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN:
        return basicSetGreaterThan(null, msgs);
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN:
        return basicSetLessThan(null, msgs);
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
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__NAME:
        return getName();
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN:
        if (resolve) return getGreaterThan();
        return basicGetGreaterThan();
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN:
        if (resolve) return getLessThan();
        return basicGetLessThan();
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
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__NAME:
        setName((String)newValue);
        return;
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN:
        setGreaterThan((QualitativeValueDictionary)newValue);
        return;
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN:
        setLessThan((QualitativeValueDictionary)newValue);
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
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN:
        setGreaterThan((QualitativeValueDictionary)null);
        return;
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN:
        setLessThan((QualitativeValueDictionary)null);
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
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__GREATER_THAN:
        return greaterThan != null;
      case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY__LESS_THAN:
        return lessThan != null;
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
    result.append(')');
    return result.toString();
  }

} //QualitativeValueDictionaryImpl
