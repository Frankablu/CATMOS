/*
 * 
 */
package SimpleScenario.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class SimpleScenarioEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getVisualID(view)) {

			case SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.ScenarioEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.CapabilityEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.CapabilityNameColourEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.ComponentEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.ComponentNameEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.Capability2EditPart(
						view);

			case SimpleScenario.diagram.edit.parts.CapabilityNameColour2EditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.CapabilityNameColour2EditPart(
						view);

			case SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.Capability3EditPart(
						view);

			case SimpleScenario.diagram.edit.parts.CapabilityNameColour3EditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.CapabilityNameColour3EditPart(
						view);

			case SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.CapabilityUpgradeNameEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.CapabilityUpgradeNameEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.CapabilityDecomposesEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.CapabilitySatisfiesEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case SimpleScenario.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart(
						view);

			case SimpleScenario.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new SimpleScenario.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
