/*
 * 
 */
package ScenarioModel.diagram.part;

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
public class ScenarioModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ScenarioModel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ScenarioModel.diagram.edit.parts.ScenarioEditPart.MODEL_ID
					.equals(view.getType())) {
				return ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
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
				ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
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
		if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getScenario()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ScenarioModel.Scenario) domainElement)) {
			return ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
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
		String containerModelID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getModelID(containerView);
		if (!ScenarioModel.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"ScenarioModel".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ScenarioModel.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapabilityProvision().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getFindTradeOffs()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getThroughLifePlanning().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getCapability()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getQualitativeValueDictionary().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getComponent()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getMeasurement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getQualitativeValue()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getQualitativeValue()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getQualitativeValue()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getExistingComponent().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getAcquirableComponent().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getComponentU()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getDesireHigh()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getDesireLow()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getBudget()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getExistingComponent().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getAcquirableComponent().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getComponentU()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getDesireHigh()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getDesireLow()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getBudget()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getMeasurement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapabilityProvision().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getCapability()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapabilityUpgrade().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapabilityProvision().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getCapability()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentComponentCostsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getCost()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment2EditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getMeasurement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getMeasurement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment2EditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getMeasurement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment3EditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getMeasurement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapabilityChange()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityChangeCapabilityChangeCapabilitiesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapabilityProvision().isSuperTypeOf(
							domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID;
			}
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getCapability()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment4EditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getMeasurement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment4EditPart.VISUAL_ID:
			if (ScenarioModel.ScenarioModelPackage.eINSTANCE.getMeasurement()
					.isSuperTypeOf(domainElement.eClass())) {
				return ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getModelID(containerView);
		if (!ScenarioModel.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"ScenarioModel".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ScenarioModel.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityProvisionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.FindTradeOffsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.ThroughLifePlanningNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ComponentComponentCostsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.MeasurementNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.QualitativeValueNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.QualitativeValueName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.QualitativeValueName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.ExistingComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.AcquirableComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.DesireHighNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.DesireLowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.BudgetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.ComponentUNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.ExistingComponentName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.AcquirableComponentName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.DesireHighName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.DesireLowName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.BudgetName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.ComponentUName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityProvisionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityProvisionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityNameColour2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityNameColour3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityUpgradeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityChangeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityChangeCapabilityChangeCapabilitiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityProvisionName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityNameColour4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CostNameAmountEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.ComponentComponentCostsCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment2EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment3EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityChangeCapabilityChangeCapabilitiesCompartmentEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment4EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment4EditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
			if (ScenarioModel.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(ScenarioModel.Scenario element) {
		return true;
	}

}
