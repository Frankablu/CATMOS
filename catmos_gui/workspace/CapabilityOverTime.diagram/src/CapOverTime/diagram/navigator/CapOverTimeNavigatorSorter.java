/*
 * 
 */
package CapOverTime.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class CapOverTimeNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7007;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof CapOverTime.diagram.navigator.CapOverTimeNavigatorItem) {
			CapOverTime.diagram.navigator.CapOverTimeNavigatorItem item = (CapOverTime.diagram.navigator.CapOverTimeNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
