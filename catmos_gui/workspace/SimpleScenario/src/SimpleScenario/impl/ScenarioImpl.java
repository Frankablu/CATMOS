/**
 */
package SimpleScenario.impl;

import SimpleScenario.OurObject;
import SimpleScenario.Scenario;
import SimpleScenario.SimpleScenarioPackage;

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
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleScenario.impl.ScenarioImpl#getOurObjects <em>Our Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends EObjectImpl implements Scenario
{
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
  protected ScenarioImpl()
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
    return SimpleScenarioPackage.Literals.SCENARIO;
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
      ourObjects = new EObjectContainmentEList<OurObject>(OurObject.class, this, SimpleScenarioPackage.SCENARIO__OUR_OBJECTS);
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
      case SimpleScenarioPackage.SCENARIO__OUR_OBJECTS:
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
      case SimpleScenarioPackage.SCENARIO__OUR_OBJECTS:
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
      case SimpleScenarioPackage.SCENARIO__OUR_OBJECTS:
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
      case SimpleScenarioPackage.SCENARIO__OUR_OBJECTS:
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
      case SimpleScenarioPackage.SCENARIO__OUR_OBJECTS:
        return ourObjects != null && !ourObjects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScenarioImpl
