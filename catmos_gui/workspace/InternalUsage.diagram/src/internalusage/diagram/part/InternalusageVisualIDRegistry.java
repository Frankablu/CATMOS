/*
 * 
 */
package internalusage.diagram.part;

import internalusage.InternalusagePackage;
import internalusage.Main;
import internalusage.diagram.edit.parts.MainEditPart;
import internalusage.diagram.edit.parts.ValuePairEditPart;
import internalusage.diagram.edit.parts.ValuePairNameEditPart;

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
public class InternalusageVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "InternalUsage.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MainEditPart.MODEL_ID.equals(view.getType())) {
				return MainEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return internalusage.diagram.part.InternalusageVisualIDRegistry
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
				InternalusageDiagramEditorPlugin.getInstance().logError(
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
		if (InternalusagePackage.eINSTANCE.getMain().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Main) domainElement)) {
			return MainEditPart.VISUAL_ID;
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
		String containerModelID = internalusage.diagram.part.InternalusageVisualIDRegistry
				.getModelID(containerView);
		if (!MainEditPart.MODEL_ID.equals(containerModelID)
				&& !"internalusage".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MainEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = internalusage.diagram.part.InternalusageVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MainEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MainEditPart.VISUAL_ID:
			if (InternalusagePackage.eINSTANCE.getValuePair().isSuperTypeOf(
					domainElement.eClass())) {
				return ValuePairEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = internalusage.diagram.part.InternalusageVisualIDRegistry
				.getModelID(containerView);
		if (!MainEditPart.MODEL_ID.equals(containerModelID)
				&& !"internalusage".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MainEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = internalusage.diagram.part.InternalusageVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MainEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MainEditPart.VISUAL_ID:
			if (ValuePairEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValuePairEditPart.VISUAL_ID:
			if (ValuePairNameEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(Main element) {
		return true;
	}

}
