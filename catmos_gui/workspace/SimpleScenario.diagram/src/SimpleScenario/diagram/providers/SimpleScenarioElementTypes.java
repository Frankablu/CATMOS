/*
 * 
 */
package SimpleScenario.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class SimpleScenarioElementTypes {

	/**
	 * @generated
	 */
	private SimpleScenarioElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Scenario_1000 = getElementType("SimpleScenario.diagram.Scenario_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_2001 = getElementType("SimpleScenario.diagram.Capability_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Component_2002 = getElementType("SimpleScenario.diagram.Component_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_3001 = getElementType("SimpleScenario.diagram.Capability_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_3002 = getElementType("SimpleScenario.diagram.Capability_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityUpgrade_3003 = getElementType("SimpleScenario.diagram.CapabilityUpgrade_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityDecomposes_4001 = getElementType("SimpleScenario.diagram.CapabilityDecomposes_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilitySatisfies_4002 = getElementType("SimpleScenario.diagram.CapabilitySatisfies_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityUpgradeUpgrading_4003 = getElementType("SimpleScenario.diagram.CapabilityUpgradeUpgrading_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
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
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getScenario());

			elements.put(Capability_2001,
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability());

			elements.put(Component_2002,
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getComponent());

			elements.put(Capability_3001,
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability());

			elements.put(Capability_3002,
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability());

			elements.put(CapabilityUpgrade_3003,
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapabilityUpgrade());

			elements.put(CapabilityDecomposes_4001,
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability_Decomposes());

			elements.put(CapabilitySatisfies_4002,
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability_Satisfies());

			elements.put(CapabilityUpgradeUpgrading_4003,
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(Capability_2001);
			KNOWN_ELEMENT_TYPES.add(Component_2002);
			KNOWN_ELEMENT_TYPES.add(Capability_3001);
			KNOWN_ELEMENT_TYPES.add(Capability_3002);
			KNOWN_ELEMENT_TYPES.add(CapabilityUpgrade_3003);
			KNOWN_ELEMENT_TYPES.add(CapabilityDecomposes_4001);
			KNOWN_ELEMENT_TYPES.add(CapabilitySatisfies_4002);
			KNOWN_ELEMENT_TYPES.add(CapabilityUpgradeUpgrading_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return Scenario_1000;
		case SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return Capability_2001;
		case SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return Component_2002;
		case SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return Capability_3001;
		case SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return Capability_3002;
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return CapabilityUpgrade_3003;
		case SimpleScenario.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return CapabilityDecomposes_4001;
		case SimpleScenario.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return CapabilitySatisfies_4002;
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
			return CapabilityUpgradeUpgrading_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return SimpleScenario.diagram.providers.SimpleScenarioElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return SimpleScenario.diagram.providers.SimpleScenarioElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return SimpleScenario.diagram.providers.SimpleScenarioElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
