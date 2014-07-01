/*
 * 
 */
package CapOverTime.diagram.part;

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

/**
 * @generated
 */
public class CapOverTimeDiagramUpdater {

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
	public static List<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> getSemanticChildren(
			View view) {
		switch (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
				.getVisualID(view)) {
		case CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID:
			return getCapabilityOverTime_1000SemanticChildren(view);
		case CapOverTime.diagram.edit.parts.TimePeriodTimePeriodOurObjectsCompartmentEditPart.VISUAL_ID:
			return getTimePeriodTimePeriodOurObjectsCompartment_7001SemanticChildren(view);
		case CapOverTime.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID:
			return getCapabilityCapabilityMeasurementsCompartment_7002SemanticChildren(view);
		case CapOverTime.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID:
			return getMeasurementMeasurementCriticalValuesCompartment_7003SemanticChildren(view);
		case CapOverTime.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID:
			return getMeasurementMeasurementBenchmarkValuesCompartment_7004SemanticChildren(view);
		case CapOverTime.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID:
			return getMeasurementMeasurementProvidedValuesCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> getCapabilityOverTime_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CapOverTime.CapabilityOverTime modelElement = (CapOverTime.CapabilityOverTime) view
				.getElement();
		LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTimePeriods().iterator(); it
				.hasNext();) {
			CapOverTime.TimePeriod childElement = (CapOverTime.TimePeriod) it
					.next();
			int visualID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID) {
				result.add(new CapOverTime.diagram.part.CapOverTimeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> getTimePeriodTimePeriodOurObjectsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CapOverTime.TimePeriod modelElement = (CapOverTime.TimePeriod) containerView
				.getElement();
		LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOurObjects().iterator(); it
				.hasNext();) {
			CapOverTime.OurObject childElement = (CapOverTime.OurObject) it
					.next();
			int visualID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID) {
				result.add(new CapOverTime.diagram.part.CapOverTimeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> getCapabilityCapabilityMeasurementsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CapOverTime.Capability modelElement = (CapOverTime.Capability) containerView
				.getElement();
		LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMeasurements().iterator(); it
				.hasNext();) {
			CapOverTime.Measurement childElement = (CapOverTime.Measurement) it
					.next();
			int visualID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID) {
				result.add(new CapOverTime.diagram.part.CapOverTimeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> getMeasurementMeasurementCriticalValuesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CapOverTime.Measurement modelElement = (CapOverTime.Measurement) containerView
				.getElement();
		LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCriticalValues().iterator(); it
				.hasNext();) {
			CapOverTime.QualitativeValue childElement = (CapOverTime.QualitativeValue) it
					.next();
			int visualID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID) {
				result.add(new CapOverTime.diagram.part.CapOverTimeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> getMeasurementMeasurementBenchmarkValuesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CapOverTime.Measurement modelElement = (CapOverTime.Measurement) containerView
				.getElement();
		LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBenchmarkValues().iterator(); it
				.hasNext();) {
			CapOverTime.QualitativeValue childElement = (CapOverTime.QualitativeValue) it
					.next();
			int visualID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID) {
				result.add(new CapOverTime.diagram.part.CapOverTimeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> getMeasurementMeasurementProvidedValuesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CapOverTime.Measurement modelElement = (CapOverTime.Measurement) containerView
				.getElement();
		LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProvidedValues().iterator(); it
				.hasNext();) {
			CapOverTime.QualitativeValue childElement = (CapOverTime.QualitativeValue) it
					.next();
			int visualID = CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID) {
				result.add(new CapOverTime.diagram.part.CapOverTimeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getContainedLinks(
			View view) {
		switch (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
				.getVisualID(view)) {
		case CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID:
			return getCapabilityOverTime_1000ContainedLinks(view);
		case CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID:
			return getTimePeriod_2001ContainedLinks(view);
		case CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_3001ContainedLinks(view);
		case CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getMeasurement_3002ContainedLinks(view);
		case CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getQualitativeValue_3003ContainedLinks(view);
		case CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getQualitativeValue_3004ContainedLinks(view);
		case CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getQualitativeValue_3005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getIncomingLinks(
			View view) {
		switch (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
				.getVisualID(view)) {
		case CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID:
			return getTimePeriod_2001IncomingLinks(view);
		case CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_3001IncomingLinks(view);
		case CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getMeasurement_3002IncomingLinks(view);
		case CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getQualitativeValue_3003IncomingLinks(view);
		case CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getQualitativeValue_3004IncomingLinks(view);
		case CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getQualitativeValue_3005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
				.getVisualID(view)) {
		case CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID:
			return getTimePeriod_2001OutgoingLinks(view);
		case CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_3001OutgoingLinks(view);
		case CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getMeasurement_3002OutgoingLinks(view);
		case CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getQualitativeValue_3003OutgoingLinks(view);
		case CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getQualitativeValue_3004OutgoingLinks(view);
		case CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getQualitativeValue_3005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getCapabilityOverTime_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getTimePeriod_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getCapability_3001ContainedLinks(
			View view) {
		CapOverTime.Capability modelElement = (CapOverTime.Capability) view
				.getElement();
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getMeasurement_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getQualitativeValue_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getQualitativeValue_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getQualitativeValue_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getTimePeriod_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getCapability_3001IncomingLinks(
			View view) {
		CapOverTime.Capability modelElement = (CapOverTime.Capability) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getMeasurement_3002IncomingLinks(
			View view) {
		CapOverTime.Measurement modelElement = (CapOverTime.Measurement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Accumulation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getQualitativeValue_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getQualitativeValue_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getQualitativeValue_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getTimePeriod_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getCapability_3001OutgoingLinks(
			View view) {
		CapOverTime.Capability modelElement = (CapOverTime.Capability) view
				.getElement();
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getMeasurement_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getQualitativeValue_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getQualitativeValue_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getQualitativeValue_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getIncomingFeatureModelFacetLinks_Capability_Accumulation_4001(
			CapOverTime.Measurement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CapOverTime.CapOverTimePackage.eINSTANCE
					.getCapability_Accumulation()) {
				result.add(new CapOverTime.diagram.part.CapOverTimeLinkDescriptor(
						setting.getEObject(),
						target,
						CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityAccumulation_4001,
						CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
			CapOverTime.Capability target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CapOverTime.CapOverTimePackage.eINSTANCE
					.getCapability_Decomposes()) {
				result.add(new CapOverTime.diagram.part.CapOverTimeLinkDescriptor(
						setting.getEObject(),
						target,
						CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityDecomposes_4002,
						CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
			CapOverTime.Capability target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CapOverTime.CapOverTimePackage.eINSTANCE
					.getCapability_Satisfies()) {
				result.add(new CapOverTime.diagram.part.CapOverTimeLinkDescriptor(
						setting.getEObject(),
						target,
						CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilitySatisfies_4003,
						CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(
			CapOverTime.Capability source) {
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		CapOverTime.Measurement destination = source.getAccumulation();
		if (destination == null) {
			return result;
		}
		result.add(new CapOverTime.diagram.part.CapOverTimeLinkDescriptor(
				source,
				destination,
				CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityAccumulation_4001,
				CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(
			CapOverTime.Capability source) {
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		for (Iterator<?> destinations = source.getDecomposes().iterator(); destinations
				.hasNext();) {
			CapOverTime.Capability destination = (CapOverTime.Capability) destinations
					.next();
			result.add(new CapOverTime.diagram.part.CapOverTimeLinkDescriptor(
					source,
					destination,
					CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityDecomposes_4002,
					CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(
			CapOverTime.Capability source) {
		LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor> result = new LinkedList<CapOverTime.diagram.part.CapOverTimeLinkDescriptor>();
		for (Iterator<?> destinations = source.getSatisfies().iterator(); destinations
				.hasNext();) {
			CapOverTime.Capability destination = (CapOverTime.Capability) destinations
					.next();
			result.add(new CapOverTime.diagram.part.CapOverTimeLinkDescriptor(
					source,
					destination,
					CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilitySatisfies_4003,
					CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
		}
		return result;
	}

}
