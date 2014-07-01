/*
 * 
 */
package internalusage.diagram.part;

import internalusage.Main;
import internalusage.ValuePair;
import internalusage.diagram.edit.parts.MainEditPart;
import internalusage.diagram.edit.parts.ValuePairEditPart;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class InternalusageDiagramUpdater {

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
	public static List<InternalusageNodeDescriptor> getSemanticChildren(
			View view) {
		switch (InternalusageVisualIDRegistry.getVisualID(view)) {
		case MainEditPart.VISUAL_ID:
			return getMain_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InternalusageNodeDescriptor> getMain_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Main modelElement = (Main) view.getElement();
		LinkedList<InternalusageNodeDescriptor> result = new LinkedList<InternalusageNodeDescriptor>();
		for (Iterator<?> it = modelElement.getValuePairs().iterator(); it
				.hasNext();) {
			ValuePair childElement = (ValuePair) it.next();
			int visualID = InternalusageVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ValuePairEditPart.VISUAL_ID) {
				result.add(new InternalusageNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<InternalusageLinkDescriptor> getContainedLinks(View view) {
		switch (InternalusageVisualIDRegistry.getVisualID(view)) {
		case MainEditPart.VISUAL_ID:
			return getMain_1000ContainedLinks(view);
		case ValuePairEditPart.VISUAL_ID:
			return getValuePair_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InternalusageLinkDescriptor> getIncomingLinks(View view) {
		switch (InternalusageVisualIDRegistry.getVisualID(view)) {
		case ValuePairEditPart.VISUAL_ID:
			return getValuePair_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InternalusageLinkDescriptor> getOutgoingLinks(View view) {
		switch (InternalusageVisualIDRegistry.getVisualID(view)) {
		case ValuePairEditPart.VISUAL_ID:
			return getValuePair_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InternalusageLinkDescriptor> getMain_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InternalusageLinkDescriptor> getValuePair_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InternalusageLinkDescriptor> getValuePair_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<InternalusageLinkDescriptor> getValuePair_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
