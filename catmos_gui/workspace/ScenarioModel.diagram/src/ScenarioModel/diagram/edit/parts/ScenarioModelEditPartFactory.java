/*
 * 
 */
package ScenarioModel.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class ScenarioModelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getVisualID(view)) {

			case ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ScenarioEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvisionNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvisionNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.FindTradeOffsNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.FindTradeOffsNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ThroughLifePlanningNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ThroughLifePlanningNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityNameColourEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.MeasurementEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.MeasurementNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.MeasurementNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.QualitativeValueEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.QualitativeValueNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.QualitativeValueNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.QualitativeValueName2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.QualitativeValueName2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.QualitativeValueName3EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.QualitativeValueName3EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ExistingComponentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ExistingComponentNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ExistingComponentNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.AcquirableComponentNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.AcquirableComponentNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.DesireHighEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.DesireHighNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.DesireHighNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.DesireLowEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.DesireLowNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.DesireLowNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.BudgetEditPart(view);

			case ScenarioModel.diagram.edit.parts.BudgetNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.BudgetNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentUEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentUNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentUNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ExistingComponentName2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ExistingComponentName2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.AcquirableComponentName2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.AcquirableComponentName2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.DesireHigh2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.DesireHighName2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.DesireHighName2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.DesireLow2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.DesireLowName2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.DesireLowName2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.Budget2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.BudgetName2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.BudgetName2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentU2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentUName2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentUName2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvisionName2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvisionName2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvisionName3EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvisionName3EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.Capability2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityNameColour2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityNameColour2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.Capability3EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityNameColour3EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityNameColour3EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityUpgradeNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityUpgradeNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityChangeNameEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityChangeNameEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvisionName4EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvisionName4EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.Capability4EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityNameColour4EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityNameColour4EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CostEditPart(view);

			case ScenarioModel.diagram.edit.parts.CostNameAmountEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CostNameAmountEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.ComponentComponentCostsCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.ComponentComponentCostsCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment3EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment3EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityChangeCapabilityChangeCapabilitiesCompartmentEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityChangeCapabilityChangeCapabilitiesCompartmentEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment4EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment4EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment4EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment4EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.WrappingLabel3EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.WrappingLabel4EditPart(
						view);

			case ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart(
						view);

			case ScenarioModel.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new ScenarioModel.diagram.edit.parts.WrappingLabel5EditPart(
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
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
