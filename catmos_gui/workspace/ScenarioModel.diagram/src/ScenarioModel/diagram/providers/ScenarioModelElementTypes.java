/*
 * 
 */
package ScenarioModel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ScenarioModelElementTypes {

	/**
	 * @generated
	 */
	private ScenarioModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Scenario_1000 = getElementType("ScenarioModel.diagram.Scenario_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityProvision_2001 = getElementType("ScenarioModel.diagram.CapabilityProvision_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FindTradeOffs_2002 = getElementType("ScenarioModel.diagram.FindTradeOffs_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ThroughLifePlanning_2003 = getElementType("ScenarioModel.diagram.ThroughLifePlanning_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_2004 = getElementType("ScenarioModel.diagram.Capability_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QualitativeValueDictionary_2005 = getElementType("ScenarioModel.diagram.QualitativeValueDictionary_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Component_2006 = getElementType("ScenarioModel.diagram.Component_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Measurement_3001 = getElementType("ScenarioModel.diagram.Measurement_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QualitativeValue_3002 = getElementType("ScenarioModel.diagram.QualitativeValue_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QualitativeValue_3003 = getElementType("ScenarioModel.diagram.QualitativeValue_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QualitativeValue_3004 = getElementType("ScenarioModel.diagram.QualitativeValue_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExistingComponent_3005 = getElementType("ScenarioModel.diagram.ExistingComponent_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AcquirableComponent_3006 = getElementType("ScenarioModel.diagram.AcquirableComponent_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DesireHigh_3007 = getElementType("ScenarioModel.diagram.DesireHigh_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DesireLow_3008 = getElementType("ScenarioModel.diagram.DesireLow_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Budget_3009 = getElementType("ScenarioModel.diagram.Budget_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentU_3010 = getElementType("ScenarioModel.diagram.ComponentU_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExistingComponent_3011 = getElementType("ScenarioModel.diagram.ExistingComponent_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AcquirableComponent_3012 = getElementType("ScenarioModel.diagram.AcquirableComponent_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DesireHigh_3013 = getElementType("ScenarioModel.diagram.DesireHigh_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DesireLow_3014 = getElementType("ScenarioModel.diagram.DesireLow_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Budget_3015 = getElementType("ScenarioModel.diagram.Budget_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentU_3016 = getElementType("ScenarioModel.diagram.ComponentU_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityProvision_3017 = getElementType("ScenarioModel.diagram.CapabilityProvision_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityProvision_3018 = getElementType("ScenarioModel.diagram.CapabilityProvision_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_3019 = getElementType("ScenarioModel.diagram.Capability_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_3020 = getElementType("ScenarioModel.diagram.Capability_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityUpgrade_3021 = getElementType("ScenarioModel.diagram.CapabilityUpgrade_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityChange_3022 = getElementType("ScenarioModel.diagram.CapabilityChange_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityProvision_3023 = getElementType("ScenarioModel.diagram.CapabilityProvision_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_3024 = getElementType("ScenarioModel.diagram.Capability_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Cost_3025 = getElementType("ScenarioModel.diagram.Cost_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityAccumulation_4001 = getElementType("ScenarioModel.diagram.CapabilityAccumulation_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityDecomposes_4002 = getElementType("ScenarioModel.diagram.CapabilityDecomposes_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilitySatisfies_4003 = getElementType("ScenarioModel.diagram.CapabilitySatisfies_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QualitativeValueDictionaryGreaterThan_4004 = getElementType("ScenarioModel.diagram.QualitativeValueDictionaryGreaterThan_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityUpgradeUpgrading_4005 = getElementType("ScenarioModel.diagram.CapabilityUpgradeUpgrading_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Scenario_1000,
					ScenarioModel.ScenarioModelPackage.eINSTANCE.getScenario());

			elements.put(CapabilityProvision_2001,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapabilityProvision());

			elements.put(FindTradeOffs_2002,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getFindTradeOffs());

			elements.put(ThroughLifePlanning_2003,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getThroughLifePlanning());

			elements.put(Capability_2004,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability());

			elements.put(QualitativeValueDictionary_2005,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getQualitativeValueDictionary());

			elements.put(Component_2006,
					ScenarioModel.ScenarioModelPackage.eINSTANCE.getComponent());

			elements.put(Measurement_3001,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getMeasurement());

			elements.put(QualitativeValue_3002,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getQualitativeValue());

			elements.put(QualitativeValue_3003,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getQualitativeValue());

			elements.put(QualitativeValue_3004,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getQualitativeValue());

			elements.put(ExistingComponent_3005,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getExistingComponent());

			elements.put(AcquirableComponent_3006,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getAcquirableComponent());

			elements.put(DesireHigh_3007,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getDesireHigh());

			elements.put(DesireLow_3008,
					ScenarioModel.ScenarioModelPackage.eINSTANCE.getDesireLow());

			elements.put(Budget_3009,
					ScenarioModel.ScenarioModelPackage.eINSTANCE.getBudget());

			elements.put(ComponentU_3010,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getComponentU());

			elements.put(ExistingComponent_3011,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getExistingComponent());

			elements.put(AcquirableComponent_3012,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getAcquirableComponent());

			elements.put(DesireHigh_3013,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getDesireHigh());

			elements.put(DesireLow_3014,
					ScenarioModel.ScenarioModelPackage.eINSTANCE.getDesireLow());

			elements.put(Budget_3015,
					ScenarioModel.ScenarioModelPackage.eINSTANCE.getBudget());

			elements.put(ComponentU_3016,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getComponentU());

			elements.put(CapabilityProvision_3017,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapabilityProvision());

			elements.put(CapabilityProvision_3018,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapabilityProvision());

			elements.put(Capability_3019,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability());

			elements.put(Capability_3020,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability());

			elements.put(CapabilityUpgrade_3021,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapabilityUpgrade());

			elements.put(CapabilityChange_3022,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapabilityChange());

			elements.put(CapabilityProvision_3023,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapabilityProvision());

			elements.put(Capability_3024,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability());

			elements.put(Cost_3025,
					ScenarioModel.ScenarioModelPackage.eINSTANCE.getCost());

			elements.put(CapabilityAccumulation_4001,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Accumulation());

			elements.put(CapabilityDecomposes_4002,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Decomposes());

			elements.put(CapabilitySatisfies_4003,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Satisfies());

			elements.put(QualitativeValueDictionaryGreaterThan_4004,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getQualitativeValueDictionary_GreaterThan());

			elements.put(CapabilityUpgradeUpgrading_4005,
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapabilityUpgrade_Upgrading());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Scenario_1000);
			KNOWN_ELEMENT_TYPES.add(CapabilityProvision_2001);
			KNOWN_ELEMENT_TYPES.add(FindTradeOffs_2002);
			KNOWN_ELEMENT_TYPES.add(ThroughLifePlanning_2003);
			KNOWN_ELEMENT_TYPES.add(Capability_2004);
			KNOWN_ELEMENT_TYPES.add(QualitativeValueDictionary_2005);
			KNOWN_ELEMENT_TYPES.add(Component_2006);
			KNOWN_ELEMENT_TYPES.add(Measurement_3001);
			KNOWN_ELEMENT_TYPES.add(QualitativeValue_3002);
			KNOWN_ELEMENT_TYPES.add(QualitativeValue_3003);
			KNOWN_ELEMENT_TYPES.add(QualitativeValue_3004);
			KNOWN_ELEMENT_TYPES.add(ExistingComponent_3005);
			KNOWN_ELEMENT_TYPES.add(AcquirableComponent_3006);
			KNOWN_ELEMENT_TYPES.add(DesireHigh_3007);
			KNOWN_ELEMENT_TYPES.add(DesireLow_3008);
			KNOWN_ELEMENT_TYPES.add(Budget_3009);
			KNOWN_ELEMENT_TYPES.add(ComponentU_3010);
			KNOWN_ELEMENT_TYPES.add(ExistingComponent_3011);
			KNOWN_ELEMENT_TYPES.add(AcquirableComponent_3012);
			KNOWN_ELEMENT_TYPES.add(DesireHigh_3013);
			KNOWN_ELEMENT_TYPES.add(DesireLow_3014);
			KNOWN_ELEMENT_TYPES.add(Budget_3015);
			KNOWN_ELEMENT_TYPES.add(ComponentU_3016);
			KNOWN_ELEMENT_TYPES.add(CapabilityProvision_3017);
			KNOWN_ELEMENT_TYPES.add(CapabilityProvision_3018);
			KNOWN_ELEMENT_TYPES.add(Capability_3019);
			KNOWN_ELEMENT_TYPES.add(Capability_3020);
			KNOWN_ELEMENT_TYPES.add(CapabilityUpgrade_3021);
			KNOWN_ELEMENT_TYPES.add(CapabilityChange_3022);
			KNOWN_ELEMENT_TYPES.add(CapabilityProvision_3023);
			KNOWN_ELEMENT_TYPES.add(Capability_3024);
			KNOWN_ELEMENT_TYPES.add(Cost_3025);
			KNOWN_ELEMENT_TYPES.add(CapabilityAccumulation_4001);
			KNOWN_ELEMENT_TYPES.add(CapabilityDecomposes_4002);
			KNOWN_ELEMENT_TYPES.add(CapabilitySatisfies_4003);
			KNOWN_ELEMENT_TYPES.add(QualitativeValueDictionaryGreaterThan_4004);
			KNOWN_ELEMENT_TYPES.add(CapabilityUpgradeUpgrading_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return Scenario_1000;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID:
			return CapabilityProvision_2001;
		case ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID:
			return FindTradeOffs_2002;
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID:
			return ThroughLifePlanning_2003;
		case ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return Capability_2004;
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID:
			return QualitativeValueDictionary_2005;
		case ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return Component_2006;
		case ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return Measurement_3001;
		case ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return QualitativeValue_3002;
		case ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return QualitativeValue_3003;
		case ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return QualitativeValue_3004;
		case ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID:
			return ExistingComponent_3005;
		case ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID:
			return AcquirableComponent_3006;
		case ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID:
			return DesireHigh_3007;
		case ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID:
			return DesireLow_3008;
		case ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID:
			return Budget_3009;
		case ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID:
			return ComponentU_3010;
		case ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID:
			return ExistingComponent_3011;
		case ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID:
			return AcquirableComponent_3012;
		case ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID:
			return DesireHigh_3013;
		case ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID:
			return DesireLow_3014;
		case ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID:
			return Budget_3015;
		case ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID:
			return ComponentU_3016;
		case ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID:
			return CapabilityProvision_3017;
		case ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID:
			return CapabilityProvision_3018;
		case ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return Capability_3019;
		case ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return Capability_3020;
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return CapabilityUpgrade_3021;
		case ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID:
			return CapabilityChange_3022;
		case ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID:
			return CapabilityProvision_3023;
		case ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID:
			return Capability_3024;
		case ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID:
			return Cost_3025;
		case ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
			return CapabilityAccumulation_4001;
		case ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return CapabilityDecomposes_4002;
		case ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return CapabilitySatisfies_4003;
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID:
			return QualitativeValueDictionaryGreaterThan_4004;
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
			return CapabilityUpgradeUpgrading_4005;
		}
		return null;
	}

}
