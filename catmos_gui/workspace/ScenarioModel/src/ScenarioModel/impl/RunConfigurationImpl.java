/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.RunConfiguration;
import ScenarioModel.ScenarioModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.RunConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.impl.RunConfigurationImpl#getPopSize <em>Pop Size</em>}</li>
 *   <li>{@link ScenarioModel.impl.RunConfigurationImpl#getGenCount <em>Gen Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunConfigurationImpl extends OurObjectImpl implements RunConfiguration
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
   * The default value of the '{@link #getPopSize() <em>Pop Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopSize()
   * @generated
   * @ordered
   */
  protected static final Integer POP_SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPopSize() <em>Pop Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPopSize()
   * @generated
   * @ordered
   */
  protected Integer popSize = POP_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getGenCount() <em>Gen Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenCount()
   * @generated
   * @ordered
   */
  protected static final Integer GEN_COUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGenCount() <em>Gen Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenCount()
   * @generated
   * @ordered
   */
  protected Integer genCount = GEN_COUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RunConfigurationImpl()
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
    return ScenarioModelPackage.Literals.RUN_CONFIGURATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.RUN_CONFIGURATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getPopSize()
  {
    return popSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopSize(Integer newPopSize)
  {
    Integer oldPopSize = popSize;
    popSize = newPopSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.RUN_CONFIGURATION__POP_SIZE, oldPopSize, popSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getGenCount()
  {
    return genCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenCount(Integer newGenCount)
  {
    Integer oldGenCount = genCount;
    genCount = newGenCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.RUN_CONFIGURATION__GEN_COUNT, oldGenCount, genCount));
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
      case ScenarioModelPackage.RUN_CONFIGURATION__NAME:
        return getName();
      case ScenarioModelPackage.RUN_CONFIGURATION__POP_SIZE:
        return getPopSize();
      case ScenarioModelPackage.RUN_CONFIGURATION__GEN_COUNT:
        return getGenCount();
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
      case ScenarioModelPackage.RUN_CONFIGURATION__NAME:
        setName((String)newValue);
        return;
      case ScenarioModelPackage.RUN_CONFIGURATION__POP_SIZE:
        setPopSize((Integer)newValue);
        return;
      case ScenarioModelPackage.RUN_CONFIGURATION__GEN_COUNT:
        setGenCount((Integer)newValue);
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
      case ScenarioModelPackage.RUN_CONFIGURATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScenarioModelPackage.RUN_CONFIGURATION__POP_SIZE:
        setPopSize(POP_SIZE_EDEFAULT);
        return;
      case ScenarioModelPackage.RUN_CONFIGURATION__GEN_COUNT:
        setGenCount(GEN_COUNT_EDEFAULT);
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
      case ScenarioModelPackage.RUN_CONFIGURATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScenarioModelPackage.RUN_CONFIGURATION__POP_SIZE:
        return POP_SIZE_EDEFAULT == null ? popSize != null : !POP_SIZE_EDEFAULT.equals(popSize);
      case ScenarioModelPackage.RUN_CONFIGURATION__GEN_COUNT:
        return GEN_COUNT_EDEFAULT == null ? genCount != null : !GEN_COUNT_EDEFAULT.equals(genCount);
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
    result.append(", popSize: ");
    result.append(popSize);
    result.append(", genCount: ");
    result.append(genCount);
    result.append(')');
    return result.toString();
  }

} //RunConfigurationImpl