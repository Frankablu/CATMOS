/*
 * 
 */
package SimpleScenario.diagram.providers;

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
public class SimpleScenarioModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof SimpleScenario.diagram.edit.parts.ScenarioEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Component_2002);
			return types;
		}
		if (editPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3001);
			return types;
		}
		if (editPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgrade_3003);
			return types;
		}
		if (editPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3002);
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
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityEditPart) {
			return ((SimpleScenario.diagram.edit.parts.CapabilityEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.Capability2EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.Capability3EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart) {
			return ((SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart) sourceEditPart)
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
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityEditPart) {
			return ((SimpleScenario.diagram.edit.parts.CapabilityEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentEditPart) {
			return ((SimpleScenario.diagram.edit.parts.ComponentEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.Capability2EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.Capability3EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability3EditPart) targetEditPart)
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
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityEditPart) {
			return ((SimpleScenario.diagram.edit.parts.CapabilityEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.Capability2EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.Capability3EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart) {
			return ((SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart) sourceEditPart)
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
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityEditPart) {
			return ((SimpleScenario.diagram.edit.parts.CapabilityEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentEditPart) {
			return ((SimpleScenario.diagram.edit.parts.ComponentEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.Capability2EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.Capability3EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability3EditPart) targetEditPart)
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
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityEditPart) {
			return ((SimpleScenario.diagram.edit.parts.CapabilityEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.Capability2EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.Capability3EditPart) {
			return ((SimpleScenario.diagram.edit.parts.Capability3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart) {
			return ((SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart) sourceEditPart)
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
				SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(SimpleScenario.diagram.part.Messages.SimpleScenarioModelingAssistantProviderMessage);
		dialog.setTitle(SimpleScenario.diagram.part.Messages.SimpleScenarioModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
