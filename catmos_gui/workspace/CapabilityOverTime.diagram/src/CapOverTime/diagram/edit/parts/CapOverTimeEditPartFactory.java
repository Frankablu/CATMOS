/*
 * 
 */
package CapOverTime.diagram.edit.parts;

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
public class CapOverTimeEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(view)) {

			case CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart(
						view);

			case CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.TimePeriodEditPart(
						view);

			case CapOverTime.diagram.edit.parts.TimePeriodStartDateEndDateEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.TimePeriodStartDateEndDateEditPart(
						view);

			case CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.CapabilityEditPart(
						view);

			case CapOverTime.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.CapabilityNameColourEditPart(
						view);

			case CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.MeasurementEditPart(
						view);

			case CapOverTime.diagram.edit.parts.MeasurementNameEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.MeasurementNameEditPart(
						view);

			case CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.QualitativeValueEditPart(
						view);

			case CapOverTime.diagram.edit.parts.QualitativeValueNameEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.QualitativeValueNameEditPart(
						view);

			case CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.QualitativeValue2EditPart(
						view);

			case CapOverTime.diagram.edit.parts.QualitativeValueName2EditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.QualitativeValueName2EditPart(
						view);

			case CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.QualitativeValue3EditPart(
						view);

			case CapOverTime.diagram.edit.parts.QualitativeValueName3EditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.QualitativeValueName3EditPart(
						view);

			case CapOverTime.diagram.edit.parts.TimePeriodTimePeriodOurObjectsCompartmentEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.TimePeriodTimePeriodOurObjectsCompartmentEditPart(
						view);

			case CapOverTime.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart(
						view);

			case CapOverTime.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart(
						view);

			case CapOverTime.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart(
						view);

			case CapOverTime.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart(
						view);

			case CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart(
						view);

			case CapOverTime.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.WrappingLabelEditPart(
						view);

			case CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart(
						view);

			case CapOverTime.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.WrappingLabel2EditPart(
						view);

			case CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart(
						view);

			case CapOverTime.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new CapOverTime.diagram.edit.parts.WrappingLabel3EditPart(
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
