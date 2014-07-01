/*
 * 
 */
package ScenarioModel.diagram.part;

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
public class ScenarioModelDiagramUpdater {

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
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getVisualID(view)) {
		case ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getScenario_1000SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartmentEditPart.VISUAL_ID:
			return getCapabilityProvisionCapabilityProvisionMeasurementsCompartment_7001SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID:
			return getMeasurementMeasurementCriticalValuesCompartment_7002SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID:
			return getMeasurementMeasurementBenchmarkValuesCompartment_7003SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID:
			return getMeasurementMeasurementProvidedValuesCompartment_7004SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart.VISUAL_ID:
			return getFindTradeOffsFindTradeOffsComponentsCompartment_7005SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart.VISUAL_ID:
			return getFindTradeOffsFindTradeOffsConstraintsCompartment_7006SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart.VISUAL_ID:
			return getThroughLifePlanningThroughLifePlanningComponentsCompartment_7007SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart.VISUAL_ID:
			return getThroughLifePlanningThroughLifePlanningConstraintsCompartment_7008SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID:
			return getCapabilityCapabilityMeasurementsCompartment_7009SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID:
			return getComponentComponentProvidesCompartment_7010SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID:
			return getComponentComponentUpgradesCompartment_7011SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID:
			return getComponentComponentRequiresCompartment_7012SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.ComponentComponentCostsCompartmentEditPart.VISUAL_ID:
			return getComponentComponentCostsCompartment_7013SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment2EditPart.VISUAL_ID:
			return getCapabilityProvisionCapabilityProvisionMeasurementsCompartment_7014SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart.VISUAL_ID:
			return getCapabilityProvisionCapabilityProvisionMeasurementsCompartment_7015SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment2EditPart.VISUAL_ID:
			return getCapabilityCapabilityMeasurementsCompartment_7016SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment3EditPart.VISUAL_ID:
			return getCapabilityCapabilityMeasurementsCompartment_7017SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentEditPart.VISUAL_ID:
			return getCapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartment_7018SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityChangeCapabilityChangeCapabilitiesCompartmentEditPart.VISUAL_ID:
			return getCapabilityChangeCapabilityChangeCapabilitiesCompartment_7019SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment4EditPart.VISUAL_ID:
			return getCapabilityProvisionCapabilityProvisionMeasurementsCompartment_7020SemanticChildren(view);
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment4EditPart.VISUAL_ID:
			return getCapabilityCapabilityMeasurementsCompartment_7021SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getScenario_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Scenario modelElement = (ScenarioModel.Scenario) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOurObjects().iterator(); it
				.hasNext();) {
			ScenarioModel.OurObject childElement = (ScenarioModel.OurObject) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityProvisionCapabilityProvisionMeasurementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMeasurements().iterator(); it
				.hasNext();) {
			ScenarioModel.Measurement childElement = (ScenarioModel.Measurement) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getMeasurementMeasurementCriticalValuesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Measurement modelElement = (ScenarioModel.Measurement) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCriticalValues().iterator(); it
				.hasNext();) {
			ScenarioModel.QualitativeValue childElement = (ScenarioModel.QualitativeValue) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getMeasurementMeasurementBenchmarkValuesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Measurement modelElement = (ScenarioModel.Measurement) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBenchmarkValues().iterator(); it
				.hasNext();) {
			ScenarioModel.QualitativeValue childElement = (ScenarioModel.QualitativeValue) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getMeasurementMeasurementProvidedValuesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Measurement modelElement = (ScenarioModel.Measurement) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProvidedValues().iterator(); it
				.hasNext();) {
			ScenarioModel.QualitativeValue childElement = (ScenarioModel.QualitativeValue) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getFindTradeOffsFindTradeOffsComponentsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.FindTradeOffs modelElement = (ScenarioModel.FindTradeOffs) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			ScenarioModel.ComponentU childElement = (ScenarioModel.ComponentU) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getFindTradeOffsFindTradeOffsConstraintsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.FindTradeOffs modelElement = (ScenarioModel.FindTradeOffs) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it
				.hasNext();) {
			ScenarioModel.Constraint childElement = (ScenarioModel.Constraint) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getThroughLifePlanningThroughLifePlanningComponentsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.ThroughLifePlanning modelElement = (ScenarioModel.ThroughLifePlanning) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			ScenarioModel.ComponentU childElement = (ScenarioModel.ComponentU) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getThroughLifePlanningThroughLifePlanningConstraintsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.ThroughLifePlanning modelElement = (ScenarioModel.ThroughLifePlanning) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConstraints().iterator(); it
				.hasNext();) {
			ScenarioModel.Constraint childElement = (ScenarioModel.Constraint) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityCapabilityMeasurementsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMeasurements().iterator(); it
				.hasNext();) {
			ScenarioModel.Measurement childElement = (ScenarioModel.Measurement) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getComponentComponentProvidesCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Component modelElement = (ScenarioModel.Component) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProvides().iterator(); it
				.hasNext();) {
			ScenarioModel.Capability childElement = (ScenarioModel.Capability) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getComponentComponentUpgradesCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Component modelElement = (ScenarioModel.Component) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getUpgrades().iterator(); it
				.hasNext();) {
			ScenarioModel.CapabilityUpgrade childElement = (ScenarioModel.CapabilityUpgrade) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getComponentComponentRequiresCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Component modelElement = (ScenarioModel.Component) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRequires().iterator(); it
				.hasNext();) {
			ScenarioModel.Capability childElement = (ScenarioModel.Capability) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getComponentComponentCostsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Component modelElement = (ScenarioModel.Component) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCosts().iterator(); it.hasNext();) {
			ScenarioModel.Cost childElement = (ScenarioModel.Cost) it.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityProvisionCapabilityProvisionMeasurementsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMeasurements().iterator(); it
				.hasNext();) {
			ScenarioModel.Measurement childElement = (ScenarioModel.Measurement) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityProvisionCapabilityProvisionMeasurementsCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMeasurements().iterator(); it
				.hasNext();) {
			ScenarioModel.Measurement childElement = (ScenarioModel.Measurement) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityCapabilityMeasurementsCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMeasurements().iterator(); it
				.hasNext();) {
			ScenarioModel.Measurement childElement = (ScenarioModel.Measurement) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityCapabilityMeasurementsCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMeasurements().iterator(); it
				.hasNext();) {
			ScenarioModel.Measurement childElement = (ScenarioModel.Measurement) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.CapabilityUpgrade modelElement = (ScenarioModel.CapabilityUpgrade) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCapabilityChanges().iterator(); it
				.hasNext();) {
			ScenarioModel.CapabilityChange childElement = (ScenarioModel.CapabilityChange) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityChangeCapabilityChangeCapabilitiesCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.CapabilityChange modelElement = (ScenarioModel.CapabilityChange) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCapabilities().iterator(); it
				.hasNext();) {
			ScenarioModel.Capability childElement = (ScenarioModel.Capability) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityProvisionCapabilityProvisionMeasurementsCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMeasurements().iterator(); it
				.hasNext();) {
			ScenarioModel.Measurement childElement = (ScenarioModel.Measurement) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> getCapabilityCapabilityMeasurementsCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) containerView
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMeasurements().iterator(); it
				.hasNext();) {
			ScenarioModel.Measurement childElement = (ScenarioModel.Measurement) it
					.next();
			int visualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getContainedLinks(
			View view) {
		switch (ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getVisualID(view)) {
		case ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getScenario_1000ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID:
			return getCapabilityProvision_2001ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID:
			return getFindTradeOffs_2002ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID:
			return getThroughLifePlanning_2003ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_2004ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID:
			return getQualitativeValueDictionary_2005ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2006ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getMeasurement_3001ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getQualitativeValue_3002ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getQualitativeValue_3003ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getQualitativeValue_3004ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID:
			return getExistingComponent_3005ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID:
			return getAcquirableComponent_3006ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID:
			return getDesireHigh_3007ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID:
			return getDesireLow_3008ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID:
			return getBudget_3009ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID:
			return getComponentU_3010ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID:
			return getExistingComponent_3011ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID:
			return getAcquirableComponent_3012ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID:
			return getDesireHigh_3013ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID:
			return getDesireLow_3014ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID:
			return getBudget_3015ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID:
			return getComponentU_3016ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID:
			return getCapabilityProvision_3017ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID:
			return getCapabilityProvision_3018ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getCapability_3019ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getCapability_3020ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getCapabilityUpgrade_3021ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID:
			return getCapabilityChange_3022ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID:
			return getCapabilityProvision_3023ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID:
			return getCapability_3024ContainedLinks(view);
		case ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID:
			return getCost_3025ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getVisualID(view)) {
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID:
			return getCapabilityProvision_2001IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID:
			return getFindTradeOffs_2002IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID:
			return getThroughLifePlanning_2003IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_2004IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID:
			return getQualitativeValueDictionary_2005IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2006IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getMeasurement_3001IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getQualitativeValue_3002IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getQualitativeValue_3003IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getQualitativeValue_3004IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID:
			return getExistingComponent_3005IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID:
			return getAcquirableComponent_3006IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID:
			return getDesireHigh_3007IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID:
			return getDesireLow_3008IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID:
			return getBudget_3009IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID:
			return getComponentU_3010IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID:
			return getExistingComponent_3011IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID:
			return getAcquirableComponent_3012IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID:
			return getDesireHigh_3013IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID:
			return getDesireLow_3014IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID:
			return getBudget_3015IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID:
			return getComponentU_3016IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID:
			return getCapabilityProvision_3017IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID:
			return getCapabilityProvision_3018IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getCapability_3019IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getCapability_3020IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getCapabilityUpgrade_3021IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID:
			return getCapabilityChange_3022IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID:
			return getCapabilityProvision_3023IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID:
			return getCapability_3024IncomingLinks(view);
		case ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID:
			return getCost_3025IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getVisualID(view)) {
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID:
			return getCapabilityProvision_2001OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID:
			return getFindTradeOffs_2002OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID:
			return getThroughLifePlanning_2003OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_2004OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID:
			return getQualitativeValueDictionary_2005OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2006OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getMeasurement_3001OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getQualitativeValue_3002OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getQualitativeValue_3003OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getQualitativeValue_3004OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID:
			return getExistingComponent_3005OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID:
			return getAcquirableComponent_3006OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID:
			return getDesireHigh_3007OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID:
			return getDesireLow_3008OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID:
			return getBudget_3009OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID:
			return getComponentU_3010OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID:
			return getExistingComponent_3011OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID:
			return getAcquirableComponent_3012OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID:
			return getDesireHigh_3013OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID:
			return getDesireLow_3014OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID:
			return getBudget_3015OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID:
			return getComponentU_3016OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID:
			return getCapabilityProvision_3017OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID:
			return getCapabilityProvision_3018OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getCapability_3019OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getCapability_3020OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getCapabilityUpgrade_3021OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID:
			return getCapabilityChange_3022OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID:
			return getCapabilityProvision_3023OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID:
			return getCapability_3024OutgoingLinks(view);
		case ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID:
			return getCost_3025OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getScenario_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_2001ContainedLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getFindTradeOffs_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getThroughLifePlanning_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_2004ContainedLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValueDictionary_2005ContainedLinks(
			View view) {
		ScenarioModel.QualitativeValueDictionary modelElement = (ScenarioModel.QualitativeValueDictionary) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_QualitativeValueDictionary_GreaterThan_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getComponent_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getMeasurement_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValue_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValue_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValue_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getExistingComponent_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getAcquirableComponent_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireHigh_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireLow_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getBudget_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getComponentU_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getExistingComponent_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getAcquirableComponent_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireHigh_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireLow_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getBudget_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getComponentU_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_3017ContainedLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_3018ContainedLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_3019ContainedLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_3020ContainedLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityUpgrade_3021ContainedLinks(
			View view) {
		ScenarioModel.CapabilityUpgrade modelElement = (ScenarioModel.CapabilityUpgrade) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityChange_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_3023ContainedLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_3024ContainedLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCost_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_2001IncomingLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getFindTradeOffs_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getThroughLifePlanning_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_2004IncomingLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValueDictionary_2005IncomingLinks(
			View view) {
		ScenarioModel.QualitativeValueDictionary modelElement = (ScenarioModel.QualitativeValueDictionary) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_QualitativeValueDictionary_GreaterThan_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getComponent_2006IncomingLinks(
			View view) {
		ScenarioModel.Component modelElement = (ScenarioModel.Component) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getMeasurement_3001IncomingLinks(
			View view) {
		ScenarioModel.Measurement modelElement = (ScenarioModel.Measurement) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Accumulation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValue_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValue_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValue_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getExistingComponent_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getAcquirableComponent_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireHigh_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireLow_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getBudget_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getComponentU_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getExistingComponent_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getAcquirableComponent_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireHigh_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireLow_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getBudget_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getComponentU_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_3017IncomingLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_3018IncomingLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_3019IncomingLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_3020IncomingLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityUpgrade_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityChange_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_3023IncomingLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_3024IncomingLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCost_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_2001OutgoingLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getFindTradeOffs_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getThroughLifePlanning_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_2004OutgoingLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValueDictionary_2005OutgoingLinks(
			View view) {
		ScenarioModel.QualitativeValueDictionary modelElement = (ScenarioModel.QualitativeValueDictionary) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_QualitativeValueDictionary_GreaterThan_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getComponent_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getMeasurement_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValue_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValue_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getQualitativeValue_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getExistingComponent_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getAcquirableComponent_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireHigh_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireLow_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getBudget_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getComponentU_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getExistingComponent_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getAcquirableComponent_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireHigh_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getDesireLow_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getBudget_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getComponentU_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_3017OutgoingLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_3018OutgoingLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_3019OutgoingLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_3020OutgoingLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityUpgrade_3021OutgoingLinks(
			View view) {
		ScenarioModel.CapabilityUpgrade modelElement = (ScenarioModel.CapabilityUpgrade) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityChange_3022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapabilityProvision_3023OutgoingLinks(
			View view) {
		ScenarioModel.CapabilityProvision modelElement = (ScenarioModel.CapabilityProvision) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCapability_3024OutgoingLinks(
			View view) {
		ScenarioModel.Capability modelElement = (ScenarioModel.Capability) view
				.getElement();
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getCost_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Capability_Accumulation_4001(
			ScenarioModel.Measurement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapability_Accumulation()) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
						setting.getEObject(),
						target,
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityAccumulation_4001,
						ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Capability_Decomposes_4002(
			ScenarioModel.Capability target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapability_Decomposes()) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
						setting.getEObject(),
						target,
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002,
						ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getIncomingFeatureModelFacetLinks_Capability_Satisfies_4003(
			ScenarioModel.Capability target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapability_Satisfies()) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
						setting.getEObject(),
						target,
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003,
						ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getIncomingFeatureModelFacetLinks_QualitativeValueDictionary_GreaterThan_4004(
			ScenarioModel.QualitativeValueDictionary target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getQualitativeValueDictionary_GreaterThan()) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
						setting.getEObject(),
						target,
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValueDictionaryGreaterThan_4004,
						ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getIncomingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4005(
			ScenarioModel.Component target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapabilityUpgrade_Upgrading()) {
				result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
						setting.getEObject(),
						target,
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityUpgradeUpgrading_4005,
						ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capability_Accumulation_4001(
			ScenarioModel.Capability source) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		ScenarioModel.Measurement destination = source.getAccumulation();
		if (destination == null) {
			return result;
		}
		result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
				source,
				destination,
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityAccumulation_4001,
				ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capability_Decomposes_4002(
			ScenarioModel.Capability source) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getDecomposes().iterator(); destinations
				.hasNext();) {
			ScenarioModel.Capability destination = (ScenarioModel.Capability) destinations
					.next();
			result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
					source,
					destination,
					ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002,
					ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capability_Satisfies_4003(
			ScenarioModel.Capability source) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		for (Iterator<?> destinations = source.getSatisfies().iterator(); destinations
				.hasNext();) {
			ScenarioModel.Capability destination = (ScenarioModel.Capability) destinations
					.next();
			result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
					source,
					destination,
					ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003,
					ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_QualitativeValueDictionary_GreaterThan_4004(
			ScenarioModel.QualitativeValueDictionary source) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		ScenarioModel.QualitativeValueDictionary destination = source
				.getGreaterThan();
		if (destination == null) {
			return result;
		}
		result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
				source,
				destination,
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValueDictionaryGreaterThan_4004,
				ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_CapabilityUpgrade_Upgrading_4005(
			ScenarioModel.CapabilityUpgrade source) {
		LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor> result = new LinkedList<ScenarioModel.diagram.part.ScenarioModelLinkDescriptor>();
		ScenarioModel.Component destination = source.getUpgrading();
		if (destination == null) {
			return result;
		}
		result.add(new ScenarioModel.diagram.part.ScenarioModelLinkDescriptor(
				source,
				destination,
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityUpgradeUpgrading_4005,
				ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID));
		return result;
	}

}