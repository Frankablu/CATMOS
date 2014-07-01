/*
 * 
 */
package SimpleScenario.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class SimpleScenarioNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem) {
			SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem item = (SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
