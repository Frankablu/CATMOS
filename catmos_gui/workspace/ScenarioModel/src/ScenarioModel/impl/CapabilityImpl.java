/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ScenarioModel.impl;

import ScenarioModel.Capability;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getSearchObjective <em>Search Objective</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getStandAlone <em>Stand Alone</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getReuse <em>Reuse</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getColour <em>Colour</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getSequentialScheduling <em>Sequential Scheduling</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getAccumulation <em>Accumulation</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getDecomposes <em>Decomposes</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 *   <li>{@link ScenarioModel.impl.CapabilityImpl#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityImpl extends OurObjectImpl implements Capability
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
   * The default value of the '{@link #getSearchObjective() <em>Search Objective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchObjective()
   * @generated
   * @ordered
   */
  protected static final Boolean SEARCH_OBJECTIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSearchObjective() <em>Search Objective</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchObjective()
   * @generated
   * @ordered
   */
  protected Boolean searchObjective = SEARCH_OBJECTIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getStandAlone() <em>Stand Alone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStandAlone()
   * @generated
   * @ordered
   */
  protected static final Boolean STAND_ALONE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStandAlone() <em>Stand Alone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStandAlone()
   * @generated
   * @ordered
   */
  protected Boolean standAlone = STAND_ALONE_EDEFAULT;

  /**
   * The default value of the '{@link #getReuse() <em>Reuse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReuse()
   * @generated
   * @ordered
   */
  protected static final Integer REUSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReuse() <em>Reuse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReuse()
   * @generated
   * @ordered
   */
  protected Integer reuse = REUSE_EDEFAULT;

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
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final Float STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected Float status = STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getColour() <em>Colour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColour()
   * @generated
   * @ordered
   */
  protected static final String COLOUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColour() <em>Colour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColour()
   * @generated
   * @ordered
   */
  protected String colour = COLOUR_EDEFAULT;

  /**
   * The default value of the '{@link #getSequentialScheduling() <em>Sequential Scheduling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequentialScheduling()
   * @generated
   * @ordered
   */
  protected static final Boolean SEQUENTIAL_SCHEDULING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSequentialScheduling() <em>Sequential Scheduling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequentialScheduling()
   * @generated
   * @ordered
   */
  protected Boolean sequentialScheduling = SEQUENTIAL_SCHEDULING_EDEFAULT;

  /**
   * The cached value of the '{@link #getAccumulation() <em>Accumulation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccumulation()
   * @generated
   * @ordered
   */
  protected Measurement accumulation;

  /**
   * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeasurements()
   * @generated
   * @ordered
   */
  protected EList<Measurement> measurements;

  /**
   * The cached value of the '{@link #getDecomposes() <em>Decomposes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecomposes()
   * @generated
   * @ordered
   */
  protected EList<Capability> decomposes;

  /**
   * The cached value of the '{@link #getSatisfiedBy() <em>Satisfied By</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSatisfiedBy()
   * @generated
   * @ordered
   */
  protected EList<Capability> satisfiedBy;

  /**
   * The cached value of the '{@link #getSatisfies() <em>Satisfies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSatisfies()
   * @generated
   * @ordered
   */
  protected EList<Capability> satisfies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CapabilityImpl()
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
    return ScenarioModelPackage.Literals.CAPABILITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getSearchObjective()
  {
    return searchObjective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchObjective(Boolean newSearchObjective)
  {
    Boolean oldSearchObjective = searchObjective;
    searchObjective = newSearchObjective;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__SEARCH_OBJECTIVE, oldSearchObjective, searchObjective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getStandAlone()
  {
    return standAlone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStandAlone(Boolean newStandAlone)
  {
    Boolean oldStandAlone = standAlone;
    standAlone = newStandAlone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__STAND_ALONE, oldStandAlone, standAlone));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getReuse()
  {
    return reuse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReuse(Integer newReuse)
  {
    Integer oldReuse = reuse;
    reuse = newReuse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__REUSE, oldReuse, reuse));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__START_DATE, oldStartDate, startDate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__END_DATE, oldEndDate, endDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(Float newStatus)
  {
    Float oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColour()
  {
    return colour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColour(String newColour)
  {
    String oldColour = colour;
    colour = newColour;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__COLOUR, oldColour, colour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getSequentialScheduling()
  {
    return sequentialScheduling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequentialScheduling(Boolean newSequentialScheduling)
  {
    Boolean oldSequentialScheduling = sequentialScheduling;
    sequentialScheduling = newSequentialScheduling;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__SEQUENTIAL_SCHEDULING, oldSequentialScheduling, sequentialScheduling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Measurement getAccumulation()
  {
    if (accumulation != null && accumulation.eIsProxy())
    {
      InternalEObject oldAccumulation = (InternalEObject)accumulation;
      accumulation = (Measurement)eResolveProxy(oldAccumulation);
      if (accumulation != oldAccumulation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioModelPackage.CAPABILITY__ACCUMULATION, oldAccumulation, accumulation));
      }
    }
    return accumulation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Measurement basicGetAccumulation()
  {
    return accumulation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccumulation(Measurement newAccumulation)
  {
    Measurement oldAccumulation = accumulation;
    accumulation = newAccumulation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScenarioModelPackage.CAPABILITY__ACCUMULATION, oldAccumulation, accumulation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Measurement> getMeasurements()
  {
    if (measurements == null)
    {
      measurements = new EObjectContainmentEList<Measurement>(Measurement.class, this, ScenarioModelPackage.CAPABILITY__MEASUREMENTS);
    }
    return measurements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getDecomposes()
  {
    if (decomposes == null)
    {
      decomposes = new EObjectResolvingEList<Capability>(Capability.class, this, ScenarioModelPackage.CAPABILITY__DECOMPOSES);
    }
    return decomposes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getSatisfiedBy()
  {
    if (satisfiedBy == null)
    {
      satisfiedBy = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, ScenarioModelPackage.CAPABILITY__SATISFIED_BY, ScenarioModelPackage.CAPABILITY__SATISFIES);
    }
    return satisfiedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getSatisfies()
  {
    if (satisfies == null)
    {
      satisfies = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this, ScenarioModelPackage.CAPABILITY__SATISFIES, ScenarioModelPackage.CAPABILITY__SATISFIED_BY);
    }
    return satisfies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ScenarioModelPackage.CAPABILITY__SATISFIED_BY:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSatisfiedBy()).basicAdd(otherEnd, msgs);
      case ScenarioModelPackage.CAPABILITY__SATISFIES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSatisfies()).basicAdd(otherEnd, msgs);
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
      case ScenarioModelPackage.CAPABILITY__MEASUREMENTS:
        return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
      case ScenarioModelPackage.CAPABILITY__SATISFIED_BY:
        return ((InternalEList<?>)getSatisfiedBy()).basicRemove(otherEnd, msgs);
      case ScenarioModelPackage.CAPABILITY__SATISFIES:
        return ((InternalEList<?>)getSatisfies()).basicRemove(otherEnd, msgs);
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
      case ScenarioModelPackage.CAPABILITY__NAME:
        return getName();
      case ScenarioModelPackage.CAPABILITY__SEARCH_OBJECTIVE:
        return getSearchObjective();
      case ScenarioModelPackage.CAPABILITY__STAND_ALONE:
        return getStandAlone();
      case ScenarioModelPackage.CAPABILITY__REUSE:
        return getReuse();
      case ScenarioModelPackage.CAPABILITY__START_DATE:
        return getStartDate();
      case ScenarioModelPackage.CAPABILITY__END_DATE:
        return getEndDate();
      case ScenarioModelPackage.CAPABILITY__STATUS:
        return getStatus();
      case ScenarioModelPackage.CAPABILITY__COLOUR:
        return getColour();
      case ScenarioModelPackage.CAPABILITY__SEQUENTIAL_SCHEDULING:
        return getSequentialScheduling();
      case ScenarioModelPackage.CAPABILITY__ACCUMULATION:
        if (resolve) return getAccumulation();
        return basicGetAccumulation();
      case ScenarioModelPackage.CAPABILITY__MEASUREMENTS:
        return getMeasurements();
      case ScenarioModelPackage.CAPABILITY__DECOMPOSES:
        return getDecomposes();
      case ScenarioModelPackage.CAPABILITY__SATISFIED_BY:
        return getSatisfiedBy();
      case ScenarioModelPackage.CAPABILITY__SATISFIES:
        return getSatisfies();
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
      case ScenarioModelPackage.CAPABILITY__NAME:
        setName((String)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__SEARCH_OBJECTIVE:
        setSearchObjective((Boolean)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__STAND_ALONE:
        setStandAlone((Boolean)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__REUSE:
        setReuse((Integer)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__START_DATE:
        setStartDate((String)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__END_DATE:
        setEndDate((String)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__STATUS:
        setStatus((Float)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__COLOUR:
        setColour((String)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__SEQUENTIAL_SCHEDULING:
        setSequentialScheduling((Boolean)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__ACCUMULATION:
        setAccumulation((Measurement)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__MEASUREMENTS:
        getMeasurements().clear();
        getMeasurements().addAll((Collection<? extends Measurement>)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__DECOMPOSES:
        getDecomposes().clear();
        getDecomposes().addAll((Collection<? extends Capability>)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__SATISFIED_BY:
        getSatisfiedBy().clear();
        getSatisfiedBy().addAll((Collection<? extends Capability>)newValue);
        return;
      case ScenarioModelPackage.CAPABILITY__SATISFIES:
        getSatisfies().clear();
        getSatisfies().addAll((Collection<? extends Capability>)newValue);
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
      case ScenarioModelPackage.CAPABILITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY__SEARCH_OBJECTIVE:
        setSearchObjective(SEARCH_OBJECTIVE_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY__STAND_ALONE:
        setStandAlone(STAND_ALONE_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY__REUSE:
        setReuse(REUSE_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY__START_DATE:
        setStartDate(START_DATE_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY__END_DATE:
        setEndDate(END_DATE_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY__COLOUR:
        setColour(COLOUR_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY__SEQUENTIAL_SCHEDULING:
        setSequentialScheduling(SEQUENTIAL_SCHEDULING_EDEFAULT);
        return;
      case ScenarioModelPackage.CAPABILITY__ACCUMULATION:
        setAccumulation((Measurement)null);
        return;
      case ScenarioModelPackage.CAPABILITY__MEASUREMENTS:
        getMeasurements().clear();
        return;
      case ScenarioModelPackage.CAPABILITY__DECOMPOSES:
        getDecomposes().clear();
        return;
      case ScenarioModelPackage.CAPABILITY__SATISFIED_BY:
        getSatisfiedBy().clear();
        return;
      case ScenarioModelPackage.CAPABILITY__SATISFIES:
        getSatisfies().clear();
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
      case ScenarioModelPackage.CAPABILITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScenarioModelPackage.CAPABILITY__SEARCH_OBJECTIVE:
        return SEARCH_OBJECTIVE_EDEFAULT == null ? searchObjective != null : !SEARCH_OBJECTIVE_EDEFAULT.equals(searchObjective);
      case ScenarioModelPackage.CAPABILITY__STAND_ALONE:
        return STAND_ALONE_EDEFAULT == null ? standAlone != null : !STAND_ALONE_EDEFAULT.equals(standAlone);
      case ScenarioModelPackage.CAPABILITY__REUSE:
        return REUSE_EDEFAULT == null ? reuse != null : !REUSE_EDEFAULT.equals(reuse);
      case ScenarioModelPackage.CAPABILITY__START_DATE:
        return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
      case ScenarioModelPackage.CAPABILITY__END_DATE:
        return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
      case ScenarioModelPackage.CAPABILITY__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
      case ScenarioModelPackage.CAPABILITY__COLOUR:
        return COLOUR_EDEFAULT == null ? colour != null : !COLOUR_EDEFAULT.equals(colour);
      case ScenarioModelPackage.CAPABILITY__SEQUENTIAL_SCHEDULING:
        return SEQUENTIAL_SCHEDULING_EDEFAULT == null ? sequentialScheduling != null : !SEQUENTIAL_SCHEDULING_EDEFAULT.equals(sequentialScheduling);
      case ScenarioModelPackage.CAPABILITY__ACCUMULATION:
        return accumulation != null;
      case ScenarioModelPackage.CAPABILITY__MEASUREMENTS:
        return measurements != null && !measurements.isEmpty();
      case ScenarioModelPackage.CAPABILITY__DECOMPOSES:
        return decomposes != null && !decomposes.isEmpty();
      case ScenarioModelPackage.CAPABILITY__SATISFIED_BY:
        return satisfiedBy != null && !satisfiedBy.isEmpty();
      case ScenarioModelPackage.CAPABILITY__SATISFIES:
        return satisfies != null && !satisfies.isEmpty();
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
    result.append(", searchObjective: ");
    result.append(searchObjective);
    result.append(", standAlone: ");
    result.append(standAlone);
    result.append(", reuse: ");
    result.append(reuse);
    result.append(", startDate: ");
    result.append(startDate);
    result.append(", endDate: ");
    result.append(endDate);
    result.append(", status: ");
    result.append(status);
    result.append(", colour: ");
    result.append(colour);
    result.append(", sequentialScheduling: ");
    result.append(sequentialScheduling);
    result.append(')');
    return result.toString();
  }

} //CapabilityImpl
