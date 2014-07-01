/*
 * 
 */
package SimpleScenario.diagram.providers;

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
		ElementInitializers cached = SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
