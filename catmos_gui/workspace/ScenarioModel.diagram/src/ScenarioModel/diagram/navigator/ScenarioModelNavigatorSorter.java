/*
 * 
 */
package ScenarioModel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ScenarioModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7023;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7022;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem) {
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem item = (ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
