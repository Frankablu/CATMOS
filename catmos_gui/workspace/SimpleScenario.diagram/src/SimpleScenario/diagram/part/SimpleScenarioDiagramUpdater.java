/*
 * 
 */
package SimpleScenario.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class SimpleScenarioDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> getSemanticChildren(
			View view) {
		switch (SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getVisualID(view)) {
		case SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getScenario_1000SemanticChildren(view);
		case SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID:
			return getComponentComponentProvidesCompartment_7001SemanticChildren(view);
		case SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID:
			return getComponentComponentUpgradesCompartment_7002SemanticChildren(view);
		case SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID:
			return getComponentComponentRequiresCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> getScenario_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleScenario.Scenario modelElement = (SimpleScenario.Scenario) view
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOurObjects().iterator(); it
				.hasNext();) {
			SimpleScenario.OurObject childElement = (SimpleScenario.OurObject) it
					.next();
			int visualID = SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID) {
				result.add(new SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID) {
				result.add(new SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> getComponentComponentProvidesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleScenario.Component modelElement = (SimpleScenario.Component) containerView
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProvides().iterator(); it
				.hasNext();) {
			SimpleScenario.Capability childElement = (SimpleScenario.Capability) it
					.next();
			int visualID = SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID) {
				result.add(new SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> getComponentComponentUpgradesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleScenario.Component modelElement = (SimpleScenario.Component) containerView
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUpgrades().iterator(); it
				.hasNext();) {
			SimpleScenario.CapabilityUpgrade childElement = (SimpleScenario.CapabilityUpgrade) it
					.next();
			int visualID = SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID) {
				result.add(new SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> getComponentComponentRequiresCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleScenario.Component modelElement = (SimpleScenario.Component) containerView
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRequires().iterator(); it
				.hasNext();) {
			SimpleScenario.Capability childElement = (SimpleScenario.Capability) it
					.next();
			int visualID = SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID) {
				result.add(new SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getContainedLinks(
			View view) {
		switch (SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getVisualID(view)) {
		case SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getScenario_1000ContainedLinks(view);
		case SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_2001ContainedLinks(view);
		case SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2002ContainedLinks(view);
		case SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getCapability_3001ContainedLinks(view);
		case SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getCapability_3002ContainedLinks(view);
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getCapabilityUpgrade_3003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getIncomingLinks(
			View view) {
		switch (SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getVisualID(view)) {
		case SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_2001IncomingLinks(view);
		case SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2002IncomingLinks(view);
		case SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getCapability_3001IncomingLinks(view);
		case SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getCapability_3002IncomingLinks(view);
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getCapabilityUpgrade_3003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getVisualID(view)) {
		case SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_2001OutgoingLinks(view);
		case SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2002OutgoingLinks(view);
		case SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getCapability_3001OutgoingLinks(view);
		case SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getCapability_3002OutgoingLinks(view);
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getCapabilityUpgrade_3003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getScenario_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapability_2001ContainedLinks(
			View view) {
		SimpleScenario.Capability modelElement = (SimpleScenario.Capability) view
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getComponent_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapability_3001ContainedLinks(
			View view) {
		SimpleScenario.Capability modelElement = (SimpleScenario.Capability) view
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapability_3002ContainedLinks(
			View view) {
		SimpleScenario.Capability modelElement = (SimpleScenario.Capability) view
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapabilityUpgrade_3003ContainedLinks(
			View view) {
		SimpleScenario.CapabilityUpgrade modelElement = (SimpleScenario.CapabilityUpgrade) view
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapability_2001IncomingLinks(
			View view) {
		SimpleScenario.Capability modelElement = (SimpleScenario.Capability) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getComponent_2002IncomingLinks(
			View view) {
		SimpleScenario.Component modelElement = (SimpleScenario.Component) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapability_3001IncomingLinks(
			View view) {
		SimpleScenario.Capability modelElement = (SimpleScenario.Capability) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapability_3002IncomingLinks(
			View view) {
		SimpleScenario.Capability modelElement = (SimpleScenario.Capability) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapabilityUpgrade_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapability_2001OutgoingLinks(
			View view) {
		SimpleScenario.Capability modelElement = (SimpleScenario.Capability) view
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getComponent_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapability_3001OutgoingLinks(
			View view) {
		SimpleScenario.Capability modelElement = (SimpleScenario.Capability) view
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapability_3002OutgoingLinks(
			View view) {
		SimpleScenario.Capability modelElement = (SimpleScenario.Capability) view
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getCapabilityUpgrade_3003OutgoingLinks(
			View view) {
		SimpleScenario.CapabilityUpgrade modelElement = (SimpleScenario.CapabilityUpgrade) view
				.getElement();
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getIncomingFeatureModelFacetLinks_Capability_Decomposes_4001(
			SimpleScenario.Capability target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == SimpleScenario.SimpleScenarioPackage.eINSTANCE
					.getCapability_Decomposes()) {
				result.add(new SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor(
						setting.getEObject(),
						target,
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001,
						SimpleScenario.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getIncomingFeatureModelFacetLinks_Capability_Satisfies_4002(
			SimpleScenario.Capability target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == SimpleScenario.SimpleScenarioPackage.eINSTANCE
					.getCapability_Satisfies()) {
				result.add(new SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor(
						setting.getEObject(),
						target,
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002,
						SimpleScenario.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getIncomingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4003(
			SimpleScenario.Component target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == SimpleScenario.SimpleScenarioPackage.eINSTANCE
					.getCapabilityUpgrade_Upgrading()) {
				result.add(new SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor(
						setting.getEObject(),
						target,
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgradeUpgrading_4003,
						SimpleScenario.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4001(
			SimpleScenario.Capability source) {
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		for (Iterator<?> destinations = source.getDecomposes().iterator(); destinations
				.hasNext();) {
			SimpleScenario.Capability destination = (SimpleScenario.Capability) destinations
					.next();
			result.add(new SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor(
					source,
					destination,
					SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001,
					SimpleScenario.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4002(
			SimpleScenario.Capability source) {
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		for (Iterator<?> destinations = source.getSatisfies().iterator(); destinations
				.hasNext();) {
			SimpleScenario.Capability destination = (SimpleScenario.Capability) destinations
					.next();
			result.add(new SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor(
					source,
					destination,
					SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002,
					SimpleScenario.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getOutgoingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4003(
			SimpleScenario.CapabilityUpgrade source) {
		LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> result = new LinkedList<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor>();
		SimpleScenario.Component destination = source.getUpgrading();
		if (destination == null) {
			return result;
		}
		result.add(new SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor(
				source,
				destination,
				SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgradeUpgrading_4003,
				SimpleScenario.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<SimpleScenario.diagram.part.SimpleScenarioNodeDescriptor> getSemanticChildren(
				View view) {
			return SimpleScenarioDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getContainedLinks(
				View view) {
			return SimpleScenarioDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getIncomingLinks(
				View view) {
			return SimpleScenarioDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SimpleScenario.diagram.part.SimpleScenarioLinkDescriptor> getOutgoingLinks(
				View view) {
			return SimpleScenarioDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
