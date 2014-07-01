/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.Capability;
import ScenarioModel.CapabilityUpgrade;
import ScenarioModel.Component;
import ScenarioModel.Cost;
import ScenarioModel.Measurement;
import ScenarioModel.ScenarioModelPackage;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.impl.ComponentImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ScenarioModel.impl.ComponentImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ScenarioModel.impl.ComponentImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link ScenarioModel.impl.ComponentImpl#getUpgrades <em>Upgrades</em>}</li>
 *   <li>{@link ScenarioModel.impl.ComponentImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link ScenarioModel.impl.ComponentImpl#getCosts <em>Costs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends OurObjectImpl implements Component
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
   * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvides()
   * @generated
   * @ordered
   */
  protected EList<Capability> provides;

  /**
   * The cached value of the '{@link #getUpgrades() <em>Upgrades</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpgrades()
   * @generated
   * @ordered
   */
  protected EList<CapabilityUpgrade> upgrades;

  /**
   * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequires()
   * @generated
   * @ordered
   */
  protected EList<Capability> requires;

  /**
   * The cached value of the '{@link #getCosts() <em>Costs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCosts()
   * @generated
   * @ordered
   */
  protected EList<Cost> costs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return ScenarioModelPackage.Literals.COMPONENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.COMPONENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.COMPONENT__START_DATE, oldStartDate, startDate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.COMPONENT__END_DATE, oldEndDate, endDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getProvides()
  {
    if (provides == null)
    {
      provides = new EObjectContainmentEList<Capability>(Capability.class, this, ScenarioModelPackage.COMPONENT__PROVIDES);
    }
    return provides;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CapabilityUpgrade> getUpgrades()
  {
    if (upgrades == null)
    {
      upgrades = new EObjectContainmentEList<CapabilityUpgrade>(CapabilityUpgrade.class, this, ScenarioModelPackage.COMPONENT__UPGRADES);
    }
    return upgrades;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getRequires()
  {
    if (requires == null)
    {
      requires = new EObjectContainmentEList<Capability>(Capability.class, this, ScenarioModelPackage.COMPONENT__REQUIRES);
    }
    return requires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Cost> getCosts()
  {
    if (costs == null)
    {
      costs = new EObjectContainmentEList<Cost>(Cost.class, this, ScenarioModelPackage.COMPONENT__COSTS);
    }
    return costs;
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
      case ScenarioModelPackage.COMPONENT__PROVIDES:
        return ((InternalEList<?>)getProvides()).basicRemove(otherEnd, msgs);
      case ScenarioModelPackage.COMPONENT__UPGRADES:
        return ((InternalEList<?>)getUpgrades()).basicRemove(otherEnd, msgs);
      case ScenarioModelPackage.COMPONENT__REQUIRES:
        return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
      case ScenarioModelPackage.COMPONENT__COSTS:
        return ((InternalEList<?>)getCosts()).basicRemove(otherEnd, msgs);
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
      case ScenarioModelPackage.COMPONENT__NAME:
        return getName();
      case ScenarioModelPackage.COMPONENT__START_DATE:
        return getStartDate();
      case ScenarioModelPackage.COMPONENT__END_DATE:
        return getEndDate();
      case ScenarioModelPackage.COMPONENT__PROVIDES:
        return getProvides();
      case ScenarioModelPackage.COMPONENT__UPGRADES:
        return getUpgrades();
      case ScenarioModelPackage.COMPONENT__REQUIRES:
        return getRequires();
      case ScenarioModelPackage.COMPONENT__COSTS:
        return getCosts();
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
      case ScenarioModelPackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case ScenarioModelPackage.COMPONENT__START_DATE:
        setStartDate((String)newValue);
        return;
      case ScenarioModelPackage.COMPONENT__END_DATE:
        setEndDate((String)newValue);
        return;
      case ScenarioModelPackage.COMPONENT__PROVIDES:
        getProvides().clear();
        getProvides().addAll((Collection<? extends Capability>)newValue);
        return;
      case ScenarioModelPackage.COMPONENT__UPGRADES:
        getUpgrades().clear();
        getUpgrades().addAll((Collection<? extends CapabilityUpgrade>)newValue);
        return;
      case ScenarioModelPackage.COMPONENT__REQUIRES:
        getRequires().clear();
        getRequires().addAll((Collection<? extends Capability>)newValue);
        return;
      case ScenarioModelPackage.COMPONENT__COSTS:
        getCosts().clear();
        getCosts().addAll((Collection<? extends Cost>)newValue);
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
      case ScenarioModelPackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScenarioModelPackage.COMPONENT__START_DATE:
        setStartDate(START_DATE_EDEFAULT);
        return;
      case ScenarioModelPackage.COMPONENT__END_DATE:
        setEndDate(END_DATE_EDEFAULT);
        return;
      case ScenarioModelPackage.COMPONENT__PROVIDES:
        getProvides().clear();
        return;
      case ScenarioModelPackage.COMPONENT__UPGRADES:
        getUpgrades().clear();
        return;
      case ScenarioModelPackage.COMPONENT__REQUIRES:
        getRequires().clear();
        return;
      case ScenarioModelPackage.COMPONENT__COSTS:
        getCosts().clear();
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
      case ScenarioModelPackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScenarioModelPackage.COMPONENT__START_DATE:
        return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
      case ScenarioModelPackage.COMPONENT__END_DATE:
        return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
      case ScenarioModelPackage.COMPONENT__PROVIDES:
        return provides != null && !provides.isEmpty();
      case ScenarioModelPackage.COMPONENT__UPGRADES:
        return upgrades != null && !upgrades.isEmpty();
      case ScenarioModelPackage.COMPONENT__REQUIRES:
        return requires != null && !requires.isEmpty();
      case ScenarioModelPackage.COMPONENT__COSTS:
        return costs != null && !costs.isEmpty();
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

} //ComponentImpl
