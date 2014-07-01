/*
 * 
 */
package CapOverTime.diagram.preferences;

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
		CapOverTime.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		CapOverTime.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		CapOverTime.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		CapOverTime.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		CapOverTime.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
