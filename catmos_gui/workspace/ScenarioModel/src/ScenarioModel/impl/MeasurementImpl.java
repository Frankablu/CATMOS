/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.Measurement;
import ScenarioModel.QualitativeValue;
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
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.MeasurementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.impl.MeasurementImpl#getCriticalValue <em>Critical Value</em>}</li>
 *   <li>{@link ScenarioModel.impl.MeasurementImpl#getBenchmarkValue <em>Benchmark Value</em>}</li>
 *   <li>{@link ScenarioModel.impl.MeasurementImpl#getProvidedValue <em>Provided Value</em>}</li>
 *   <li>{@link ScenarioModel.impl.MeasurementImpl#getCriticalValues <em>Critical Values</em>}</li>
 *   <li>{@link ScenarioModel.impl.MeasurementImpl#getBenchmarkValues <em>Benchmark Values</em>}</li>
 *   <li>{@link ScenarioModel.impl.MeasurementImpl#getProvidedValues <em>Provided Values</em>}</li>
 *   <li>{@link ScenarioModel.impl.MeasurementImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementImpl extends EObjectImpl implements Measurement
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
   * The default value of the '{@link #getCriticalValue() <em>Critical Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriticalValue()
   * @generated
   * @ordered
   */
  protected static final Float CRITICAL_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCriticalValue() <em>Critical Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriticalValue()
   * @generated
   * @ordered
   */
  protected Float criticalValue = CRITICAL_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getBenchmarkValue() <em>Benchmark Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBenchmarkValue()
   * @generated
   * @ordered
   */
  protected static final Float BENCHMARK_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBenchmarkValue() <em>Benchmark Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBenchmarkValue()
   * @generated
   * @ordered
   */
  protected Float benchmarkValue = BENCHMARK_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getProvidedValue() <em>Provided Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedValue()
   * @generated
   * @ordered
   */
  protected static final Float PROVIDED_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProvidedValue() <em>Provided Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedValue()
   * @generated
   * @ordered
   */
  protected Float providedValue = PROVIDED_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCriticalValues() <em>Critical Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriticalValues()
   * @generated
   * @ordered
   */
  protected EList<QualitativeValue> criticalValues;

  /**
   * The cached value of the '{@link #getBenchmarkValues() <em>Benchmark Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBenchmarkValues()
   * @generated
   * @ordered
   */
  protected EList<QualitativeValue> benchmarkValues;

  /**
   * The cached value of the '{@link #getProvidedValues() <em>Provided Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedValues()
   * @generated
   * @ordered
   */
  protected EList<QualitativeValue> providedValues;

  /**
   * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected static final String SCRIPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected String script = SCRIPT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MeasurementImpl()
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
    return ScenarioModelPackage.Literals.MEASUREMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.MEASUREMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getCriticalValue()
  {
    return criticalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCriticalValue(Float newCriticalValue)
  {
    Float oldCriticalValue = criticalValue;
    criticalValue = newCriticalValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUE, oldCriticalValue, criticalValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getBenchmarkValue()
  {
    return benchmarkValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBenchmarkValue(Float newBenchmarkValue)
  {
    Float oldBenchmarkValue = benchmarkValue;
    benchmarkValue = newBenchmarkValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUE, oldBenchmarkValue, benchmarkValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getProvidedValue()
  {
    return providedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvidedValue(Float newProvidedValue)
  {
    Float oldProvidedValue = providedValue;
    providedValue = newProvidedValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUE, oldProvidedValue, providedValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualitativeValue> getCriticalValues()
  {
    if (criticalValues == null)
    {
      criticalValues = new EObjectContainmentEList<QualitativeValue>(QualitativeValue.class, this, ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUES);
    }
    return criticalValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualitativeValue> getBenchmarkValues()
  {
    if (benchmarkValues == null)
    {
      benchmarkValues = new EObjectContainmentEList<QualitativeValue>(QualitativeValue.class, this, ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUES);
    }
    return benchmarkValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QualitativeValue> getProvidedValues()
  {
    if (providedValues == null)
    {
      providedValues = new EObjectContainmentEList<QualitativeValue>(QualitativeValue.class, this, ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUES);
    }
    return providedValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(String newScript)
  {
    String oldScript = script;
    script = newScript;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.MEASUREMENT__SCRIPT, oldScript, script));
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
      case ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUES:
        return ((InternalEList<?>)getCriticalValues()).basicRemove(otherEnd, msgs);
      case ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUES:
        return ((InternalEList<?>)getBenchmarkValues()).basicRemove(otherEnd, msgs);
      case ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUES:
        return ((InternalEList<?>)getProvidedValues()).basicRemove(otherEnd, msgs);
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
      case ScenarioModelPackage.MEASUREMENT__NAME:
        return getName();
      case ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUE:
        return getCriticalValue();
      case ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUE:
        return getBenchmarkValue();
      case ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUE:
        return getProvidedValue();
      case ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUES:
        return getCriticalValues();
      case ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUES:
        return getBenchmarkValues();
      case ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUES:
        return getProvidedValues();
      case ScenarioModelPackage.MEASUREMENT__SCRIPT:
        return getScript();
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
      case ScenarioModelPackage.MEASUREMENT__NAME:
        setName((String)newValue);
        return;
      case ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUE:
        setCriticalValue((Float)newValue);
        return;
      case ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUE:
        setBenchmarkValue((Float)newValue);
        return;
      case ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUE:
        setProvidedValue((Float)newValue);
        return;
      case ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUES:
        getCriticalValues().clear();
        getCriticalValues().addAll((Collection<? extends QualitativeValue>)newValue);
        return;
      case ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUES:
        getBenchmarkValues().clear();
        getBenchmarkValues().addAll((Collection<? extends QualitativeValue>)newValue);
        return;
      case ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUES:
        getProvidedValues().clear();
        getProvidedValues().addAll((Collection<? extends QualitativeValue>)newValue);
        return;
      case ScenarioModelPackage.MEASUREMENT__SCRIPT:
        setScript((String)newValue);
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
      case ScenarioModelPackage.MEASUREMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUE:
        setCriticalValue(CRITICAL_VALUE_EDEFAULT);
        return;
      case ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUE:
        setBenchmarkValue(BENCHMARK_VALUE_EDEFAULT);
        return;
      case ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUE:
        setProvidedValue(PROVIDED_VALUE_EDEFAULT);
        return;
      case ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUES:
        getCriticalValues().clear();
        return;
      case ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUES:
        getBenchmarkValues().clear();
        return;
      case ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUES:
        getProvidedValues().clear();
        return;
      case ScenarioModelPackage.MEASUREMENT__SCRIPT:
        setScript(SCRIPT_EDEFAULT);
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
      case ScenarioModelPackage.MEASUREMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUE:
        return CRITICAL_VALUE_EDEFAULT == null ? criticalValue != null : !CRITICAL_VALUE_EDEFAULT.equals(criticalValue);
      case ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUE:
        return BENCHMARK_VALUE_EDEFAULT == null ? benchmarkValue != null : !BENCHMARK_VALUE_EDEFAULT.equals(benchmarkValue);
      case ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUE:
        return PROVIDED_VALUE_EDEFAULT == null ? providedValue != null : !PROVIDED_VALUE_EDEFAULT.equals(providedValue);
      case ScenarioModelPackage.MEASUREMENT__CRITICAL_VALUES:
        return criticalValues != null && !criticalValues.isEmpty();
      case ScenarioModelPackage.MEASUREMENT__BENCHMARK_VALUES:
        return benchmarkValues != null && !benchmarkValues.isEmpty();
      case ScenarioModelPackage.MEASUREMENT__PROVIDED_VALUES:
        return providedValues != null && !providedValues.isEmpty();
      case ScenarioModelPackage.MEASUREMENT__SCRIPT:
        return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
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
    result.append(", criticalValue: ");
    result.append(criticalValue);
    result.append(", benchmarkValue: ");
    result.append(benchmarkValue);
    result.append(", providedValue: ");
    result.append(providedValue);
    result.append(", script: ");
    result.append(script);
    result.append(')');
    return result.toString();
  }

} //MeasurementImpl
