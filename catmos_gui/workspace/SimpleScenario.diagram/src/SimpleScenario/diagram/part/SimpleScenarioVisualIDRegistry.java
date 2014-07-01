/*
 * 
 */
package SimpleScenario.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SimpleScenarioVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "SimpleScenario.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SimpleScenario.diagram.edit.parts.ScenarioEditPart.MODEL_ID
					.equals(view.getType())) {
				return SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SimpleScenario.SimpleScenarioPackage.eINSTANCE.getScenario()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((SimpleScenario.Scenario) domainElement)) {
			return SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getModelID(containerView);
		if (!SimpleScenario.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"SimpleScenario".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SimpleScenario.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			if (SimpleScenario.SimpleScenarioPackage.eINSTANCE.getCapability()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID;
			}
			if (SimpleScenario.SimpleScenarioPackage.eINSTANCE.getComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID;
			}
			break;
		case SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID:
			if (SimpleScenario.SimpleScenarioPackage.eINSTANCE.getCapability()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID;
			}
			break;
		case SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID:
			if (SimpleScenario.SimpleScenarioPackage.eINSTANCE
					.getCapabilityUpgrade().isSuperTypeOf(
							domainElement.eClass())) {
				return SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID;
			}
			break;
		case SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID:
			if (SimpleScenario.SimpleScenarioPackage.eINSTANCE.getCapability()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getModelID(containerView);
		if (!SimpleScenario.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"SimpleScenario".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SimpleScenario.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.CapabilityNameColour2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.CapabilityNameColour3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.CapabilityUpgradeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
			if (SimpleScenario.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(SimpleScenario.Scenario element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID:
		case SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID:
		case SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return false;
		case SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
		case SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
		case SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
