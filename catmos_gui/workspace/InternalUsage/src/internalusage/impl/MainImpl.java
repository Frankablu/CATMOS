/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package internalusage.impl;

import internalusage.InternalusagePackage;
import internalusage.Main;
import internalusage.ValuePair;

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
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link internalusage.impl.MainImpl#getValuePairs <em>Value Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainImpl extends EObjectImpl implements Main
{
  /**
   * The cached value of the '{@link #getValuePairs() <em>Value Pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuePairs()
   * @generated
   * @ordered
   */
  protected EList<ValuePair> valuePairs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainImpl()
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
    return InternalusagePackage.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ValuePair> getValuePairs()
  {
    if (valuePairs == null)
    {
      valuePairs = new EObjectContainmentEList<ValuePair>(ValuePair.class, this, InternalusagePackage.MAIN__VALUE_PAIRS);
    }
    return valuePairs;
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
      case InternalusagePackage.MAIN__VALUE_PAIRS:
        return ((InternalEList<?>)getValuePairs()).basicRemove(otherEnd, msgs);
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
      case InternalusagePackage.MAIN__VALUE_PAIRS:
        return getValuePairs();
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
      case InternalusagePackage.MAIN__VALUE_PAIRS:
        getValuePairs().clear();
        getValuePairs().addAll((Collection<? extends ValuePair>)newValue);
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
      case InternalusagePackage.MAIN__VALUE_PAIRS:
        getValuePairs().clear();
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
      case InternalusagePackage.MAIN__VALUE_PAIRS:
        return valuePairs != null && !valuePairs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MainImpl
