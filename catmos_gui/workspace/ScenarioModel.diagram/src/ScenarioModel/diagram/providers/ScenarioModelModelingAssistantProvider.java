/*
 * 
 */
package ScenarioModel.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class ScenarioModelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ScenarioModel.diagram.edit.parts.ScenarioEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_2001);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.FindTradeOffs_2002);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.ThroughLifePlanning_2003);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_2004);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValueDictionary_2005);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Component_2006);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3002);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3003);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3004);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.ExistingComponent_3005);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.AcquirableComponent_3006);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.ComponentU_3010);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireHigh_3007);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireLow_3008);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Budget_3009);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.ExistingComponent_3011);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.AcquirableComponent_3012);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.ComponentU_3016);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireHigh_3013);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireLow_3014);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Budget_3015);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3017);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3019);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityUpgrade_3021);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3018);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3020);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.ComponentComponentCostsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Cost_3025);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityChange_3022);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityChangeCapabilityChangeCapabilitiesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3023);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3024);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
			return types;
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) {
			return ((ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.Capability2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.Capability3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.Capability4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) {
			return ((ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.ComponentEditPart) {
			return ((ScenarioModel.diagram.edit.parts.ComponentEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementEditPart) {
			return ((ScenarioModel.diagram.edit.parts.MeasurementEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability4EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) {
			return ((ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.Capability2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.Capability3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.Capability4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) {
			return ((ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.ComponentEditPart) {
			return ((ScenarioModel.diagram.edit.parts.ComponentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementEditPart) {
			return ((ScenarioModel.diagram.edit.parts.MeasurementEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) {
			return ((ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.Capability2EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.Capability3EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ScenarioModel.diagram.edit.parts.Capability4EditPart) {
			return ((ScenarioModel.diagram.edit.parts.Capability4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(ScenarioModel.diagram.part.Messages.ScenarioModelModelingAssistantProviderMessage);
		dialog.setTitle(ScenarioModel.diagram.part.Messages.ScenarioModelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}