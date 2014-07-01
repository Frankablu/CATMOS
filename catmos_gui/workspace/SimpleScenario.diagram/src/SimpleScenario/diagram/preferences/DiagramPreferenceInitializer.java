/*
 * 
 */
package SimpleScenario.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		SimpleScenario.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		SimpleScenario.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		SimpleScenario.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		SimpleScenario.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		SimpleScenario.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
