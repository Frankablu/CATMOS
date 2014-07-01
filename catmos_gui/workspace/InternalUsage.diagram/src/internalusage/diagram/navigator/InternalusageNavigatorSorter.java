/*
 * 
 */
package internalusage.diagram.navigator;

import internalusage.diagram.part.InternalusageVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class InternalusageNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 2003;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 2002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof InternalusageNavigatorItem) {
			InternalusageNavigatorItem item = (InternalusageNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return InternalusageVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
