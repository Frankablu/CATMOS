/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.CapabilityChange;
import ScenarioModel.CapabilityUpgrade;
import ScenarioModel.Component;
import ScenarioModel.ScenarioModelPackage;

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
 * An implementation of the model object '<em><b>Capability Upgrade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.CapabilityUpgradeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityUpgradeImpl#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityUpgradeImpl#getUpgrading <em>Upgrading</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityUpgradeImpl#getCapabilityChanges <em>Capability Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityUpgradeImpl extends EObjectImpl implements CapabilityUpgrade
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
   * The default value of the '{@link #getTargetComponent() <em>Target Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetComponent()
   * @generated
   * @ordered
   */
  protected static final String TARGET_COMPONENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetComponent() <em>Target Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetComponent()
   * @generated
   * @ordered
   */
  protected String targetComponent = TARGET_COMPONENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getUpgrading() <em>Upgrading</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpgrading()
   * @generated
   * @ordered
   */
  protected Component upgrading;

  /**
   * The cached value of the '{@link #getCapabilityChanges() <em>Capability Changes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapabilityChanges()
   * @generated
   * @ordered
   */
  protected EList<CapabilityChange> capabilityChanges;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CapabilityUpgradeImpl()
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
    return ScenarioModelPackage.Literals.CAPABILITY_UPGRADE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY_UPGRADE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetComponent()
  {
    return targetComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetComponent(String newTargetComponent)
  {
    String oldTargetComponent = targetComponent;
    targetComponent = newTargetComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY_UPGRADE__TARGET_COMPONENT, oldTargetComponent, targetComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getUpgrading()
  {
    if (upgrading != null && upgrading.eIsProxy())
    {
      InternalEObject oldUpgrading = (InternalEObject)upgrading;
      upgrading = (Component)eResolveProxy(oldUpgrading);
      if (upgrading != oldUpgrading)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioModelPackage.CAPABILITY_UPGRADE__UPGRADING, oldUpgrading, upgrading));
      }
    }
    return upgrading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetUpgrading()
  {
    return upgrading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpgrading(Component newUpgrading)
  {
    Component oldUpgrading = upgrading;
    upgrading = newUpgrading;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY_UPGRADE__UPGRADING, oldUpgrading, upgrading));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CapabilityChange> getCapabilityChanges()
  {
    if (capabilityChanges == null)
    {
      capabilityChanges = new EObjectContainmentEList<CapabilityChange>(CapabilityChange.class, this, ScenarioModelPackage.CAPABILITY_UPGRADE__CAPABILITY_CHANGES);
    }
    return capabilityChanges;
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
      case ScenarioModelPackage.CAPABILITY_UPGRADE__CAPABILITY_CHANGES:
        return ((InternalEList<?>)getCapabilityChanges()).basicRemove(otherEnd, msgs);
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
      case ScenarioModelPackage.CAPABILITY_UPGRADE__NAME:
        return getName();
      case ScenarioModelPackage.CAPABILITY_UPGRADE__TARGET_COMPONENT:
        return getTargetComponent();
      case ScenarioModelPackage.CAPABILITY_UPGRADE__UPGRADING:
        if (resolve) return getUpgrading();
        return basicGetUpgrading();
      case ScenarioModelPackage.CAPABILITY_UPGRADE__CAPABILITY_CHANGES:
        return getCapabilityChanges();
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
      case ScenarioModelPackage.CAPABILITY_UPGRADE__NAME:
        setName((String)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY_UPGRADE__TARGET_COMPONENT:
        setTargetComponent((String)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY_UPGRADE__UPGRADING:
        setUpgrading((Component)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY_UPGRADE__CAPABILITY_CHANGES:
        getCapabilityChanges().clear();
        getCapabilityChanges().addAll((Collection<? extends CapabilityChange>)newValue);
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
      case ScenarioModelPackage.CAPABILITY_UPGRADE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY_UPGRADE__TARGET_COMPONENT:
        setTargetComponent(TARGET_COMPONENT_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY_UPGRADE__UPGRADING:
        setUpgrading((Component)null);
        return;
      case ScenarioModelPackage.CAPABILITY_UPGRADE__CAPABILITY_CHANGES:
        getCapabilityChanges().clear();
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
      case ScenarioModelPackage.CAPABILITY_UPGRADE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScenarioModelPackage.CAPABILITY_UPGRADE__TARGET_COMPONENT:
        return TARGET_COMPONENT_EDEFAULT == null ? targetComponent != null : !TARGET_COMPONENT_EDEFAULT.equals(targetComponent);
      case ScenarioModelPackage.CAPABILITY_UPGRADE__UPGRADING:
        return upgrading != null;
      case ScenarioModelPackage.CAPABILITY_UPGRADE__CAPABILITY_CHANGES:
        return capabilityChanges != null && !capabilityChanges.isEmpty();
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
    result.append(", targetComponent: ");
    result.append(targetComponent);
    result.append(')');
    return result.toString();
  }

} //CapabilityUpgradeImpl
