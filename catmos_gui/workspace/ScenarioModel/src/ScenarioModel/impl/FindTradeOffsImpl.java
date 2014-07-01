/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.ComponentU;
import ScenarioModel.Constraint;
import ScenarioModel.FindTradeOffs;
import ScenarioModel.ScenarioModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find Trade Offs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.FindTradeOffsImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link ScenarioModel.impl.FindTradeOffsImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FindTradeOffsImpl extends RunConfigurationImpl implements FindTradeOffs
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
  protected FindTradeOffsImpl()
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
    return ScenarioModelPackage.Literals.FIND_TRADE_OFFS;
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
      components = new EObjectContainmentEList<ComponentU>(ComponentU.class, this, ScenarioModelPackage.FIND_TRADE_OFFS__COMPONENTS);
    }
    return components;
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
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, ScenarioModelPackage.FIND_TRADE_OFFS__CONSTRAINTS);
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
      case ScenarioModelPackage.FIND_TRADE_OFFS__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case ScenarioModelPackage.FIND_TRADE_OFFS__CONSTRAINTS:
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
      case ScenarioModelPackage.FIND_TRADE_OFFS__COMPONENTS:
        return getComponents();
      case ScenarioModelPackage.FIND_TRADE_OFFS__CONSTRAINTS:
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
      case ScenarioModelPackage.FIND_TRADE_OFFS__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends ComponentU>)newValue);
        return;
      case ScenarioModelPackage.FIND_TRADE_OFFS__CONSTRAINTS:
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
      case ScenarioModelPackage.FIND_TRADE_OFFS__COMPONENTS:
        getComponents().clear();
        return;
      case ScenarioModelPackage.FIND_TRADE_OFFS__CONSTRAINTS:
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
      case ScenarioModelPackage.FIND_TRADE_OFFS__COMPONENTS:
        return components != null && !components.isEmpty();
      case ScenarioModelPackage.FIND_TRADE_OFFS__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FindTradeOffsImpl
