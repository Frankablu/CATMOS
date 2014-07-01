/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package internalusage.impl;

import internalusage.InternalusageFactory;
import internalusage.InternalusagePackage;
import internalusage.Main;
import internalusage.ValuePair;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InternalusagePackageImpl extends EPackageImpl implements InternalusagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuePairEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see internalusage.InternalusagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private InternalusagePackageImpl()
  {
    super(eNS_URI, InternalusageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link InternalusagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static InternalusagePackage init()
  {
    if (isInited) return (InternalusagePackage)EPackage.Registry.INSTANCE.getEPackage(InternalusagePackage.eNS_URI);

    // Obtain or create and register package
    InternalusagePackageImpl theInternalusagePackage = (InternalusagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InternalusagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InternalusagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theInternalusagePackage.createPackageContents();

    // Initialize created meta-data
    theInternalusagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theInternalusagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(InternalusagePackage.eNS_URI, theInternalusagePackage);
    return theInternalusagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMain()
  {
    return mainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMain_ValuePairs()
  {
    return (EReference)mainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuePair()
  {
    return valuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuePair_Name()
  {
    return (EAttribute)valuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuePair_Value()
  {
    return (EAttribute)valuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalusageFactory getInternalusageFactory()
  {
    return (InternalusageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mainEClass = createEClass(MAIN);
    createEReference(mainEClass, MAIN__VALUE_PAIRS);

    valuePairEClass = createEClass(VALUE_PAIR);
    createEAttribute(valuePairEClass, VALUE_PAIR__NAME);
    createEAttribute(valuePairEClass, VALUE_PAIR__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMain_ValuePairs(), this.getValuePair(), null, "valuePairs", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valuePairEClass, ValuePair.class, "ValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValuePair_Name(), ecorePackage.getEString(), "name", null, 0, 1, ValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValuePair_Value(), ecorePackage.getEString(), "value", null, 0, 1, ValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf.diagram
    createGmfAnnotations();
    // gmf.compartment
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf.diagram";		
    addAnnotation
      (mainEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.compartment";			
    addAnnotation
      (getMain_ValuePairs(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });	
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (valuePairEClass, 
       source, 
       new String[] 
       {
       "label", "name"
       });
  }

} //InternalusagePackageImpl
