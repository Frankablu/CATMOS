/*
 * 
 */
package CapOverTime.diagram.providers;

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
		ElementInitializers cached = CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
