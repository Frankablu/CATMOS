/*
 * 
 */
package ScenarioModel.diagram.preferences;

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
		ScenarioModel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		ScenarioModel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		ScenarioModel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		ScenarioModel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		ScenarioModel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
