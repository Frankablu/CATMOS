/*
 * 
 */
package internalusage.diagram.providers;

import internalusage.diagram.part.InternalusageDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = InternalusageDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			InternalusageDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
