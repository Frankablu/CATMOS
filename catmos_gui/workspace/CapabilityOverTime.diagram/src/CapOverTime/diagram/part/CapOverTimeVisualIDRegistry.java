/*
 * 
 */
package CapOverTime.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CapOverTimeVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "CapabilityOverTime.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.MODEL_ID
					.equals(view.getType())) {
				return CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
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
				CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
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
		if (CapOverTime.CapOverTimePackage.eINSTANCE.getCapabilityOverTime()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((CapOverTime.CapabilityOverTime) domainElement)) {
			return CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID;
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
		String containerModelID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
				.getModelID(containerView);
		if (!CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"CapOverTime".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID:
			if (CapOverTime.CapOverTimePackage.eINSTANCE.getTimePeriod()
					.isSuperTypeOf(domainElement.eClass())) {
				return CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID;
			}
			break;
		case CapOverTime.diagram.edit.parts.TimePeriodTimePeriodOurObjectsCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.CapOverTimePackage.eINSTANCE.getCapability()
					.isSuperTypeOf(domainElement.eClass())) {
				return CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID;
			}
			break;
		case CapOverTime.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.CapOverTimePackage.eINSTANCE.getMeasurement()
					.isSuperTypeOf(domainElement.eClass())) {
				return CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID;
			}
			break;
		case CapOverTime.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.CapOverTimePackage.eINSTANCE.getQualitativeValue()
					.isSuperTypeOf(domainElement.eClass())) {
				return CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID;
			}
			break;
		case CapOverTime.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.CapOverTimePackage.eINSTANCE.getQualitativeValue()
					.isSuperTypeOf(domainElement.eClass())) {
				return CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID;
			}
			break;
		case CapOverTime.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.CapOverTimePackage.eINSTANCE.getQualitativeValue()
					.isSuperTypeOf(domainElement.eClass())) {
				return CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
				.getModelID(containerView);
		if (!CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"CapOverTime".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.TimePeriodStartDateEndDateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CapOverTime.diagram.edit.parts.TimePeriodTimePeriodOurObjectsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CapOverTime.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.MeasurementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CapOverTime.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CapOverTime.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CapOverTime.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.QualitativeValueNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.QualitativeValueName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.QualitativeValueName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.TimePeriodTimePeriodOurObjectsCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			if (CapOverTime.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(CapOverTime.CapabilityOverTime element) {
		return true;
	}

}
