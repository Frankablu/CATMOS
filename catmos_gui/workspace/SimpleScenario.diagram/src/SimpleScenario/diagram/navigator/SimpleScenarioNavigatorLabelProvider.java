/*
 * 
 */
package SimpleScenario.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class SimpleScenarioNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem
				&& !isOwnView(((SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SimpleScenario.diagram.navigator.SimpleScenarioNavigatorGroup) {
			SimpleScenario.diagram.navigator.SimpleScenarioNavigatorGroup group = (SimpleScenario.diagram.navigator.SimpleScenarioNavigatorGroup) element;
			return SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem) {
			SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem navigatorItem = (SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getVisualID(view)) {
		case SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?SimpleScenario?Scenario", SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Scenario_1000); //$NON-NLS-1$
		case SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?SimpleScenario?Capability", SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001); //$NON-NLS-1$
		case SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?SimpleScenario?Component", SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Component_2002); //$NON-NLS-1$
		case SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?SimpleScenario?Capability", SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3001); //$NON-NLS-1$
		case SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?SimpleScenario?Capability", SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3002); //$NON-NLS-1$
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?SimpleScenario?CapabilityUpgrade", SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgrade_3003); //$NON-NLS-1$
		case SimpleScenario.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?SimpleScenario?Capability?decomposes", SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001); //$NON-NLS-1$
		case SimpleScenario.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?SimpleScenario?Capability?satisfies", SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002); //$NON-NLS-1$
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?SimpleScenario?CapabilityUpgrade?upgrading", SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgradeUpgrading_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& SimpleScenario.diagram.providers.SimpleScenarioElementTypes
						.isKnownElementType(elementType)) {
			image = SimpleScenario.diagram.providers.SimpleScenarioElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SimpleScenario.diagram.navigator.SimpleScenarioNavigatorGroup) {
			SimpleScenario.diagram.navigator.SimpleScenarioNavigatorGroup group = (SimpleScenario.diagram.navigator.SimpleScenarioNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem) {
			SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem navigatorItem = (SimpleScenario.diagram.navigator.SimpleScenarioNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getVisualID(view)) {
		case SimpleScenario.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getScenario_1000Text(view);
		case SimpleScenario.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_2001Text(view);
		case SimpleScenario.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2002Text(view);
		case SimpleScenario.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getCapability_3001Text(view);
		case SimpleScenario.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getCapability_3002Text(view);
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getCapabilityUpgrade_3003Text(view);
		case SimpleScenario.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return getCapabilityDecomposes_4001Text(view);
		case SimpleScenario.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return getCapabilitySatisfies_4002Text(view);
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
			return getCapabilityUpgradeUpgrading_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getScenario_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCapability_2001Text(View view) {
		IParser parser = SimpleScenario.diagram.providers.SimpleScenarioParserProvider
				.getParser(
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001,
						view.getElement() != null ? view.getElement() : view,
						SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
								.getType(SimpleScenario.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_2002Text(View view) {
		IParser parser = SimpleScenario.diagram.providers.SimpleScenarioParserProvider
				.getParser(
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Component_2002,
						view.getElement() != null ? view.getElement() : view,
						SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
								.getType(SimpleScenario.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapability_3001Text(View view) {
		IParser parser = SimpleScenario.diagram.providers.SimpleScenarioParserProvider
				.getParser(
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3001,
						view.getElement() != null ? view.getElement() : view,
						SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
								.getType(SimpleScenario.diagram.edit.parts.CapabilityNameColour2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapability_3002Text(View view) {
		IParser parser = SimpleScenario.diagram.providers.SimpleScenarioParserProvider
				.getParser(
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3002,
						view.getElement() != null ? view.getElement() : view,
						SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
								.getType(SimpleScenario.diagram.edit.parts.CapabilityNameColour3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityUpgrade_3003Text(View view) {
		IParser parser = SimpleScenario.diagram.providers.SimpleScenarioParserProvider
				.getParser(
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgrade_3003,
						view.getElement() != null ? view.getElement() : view,
						SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
								.getType(SimpleScenario.diagram.edit.parts.CapabilityUpgradeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityDecomposes_4001Text(View view) {
		IParser parser = SimpleScenario.diagram.providers.SimpleScenarioParserProvider
				.getParser(
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilitySatisfies_4002Text(View view) {
		IParser parser = SimpleScenario.diagram.providers.SimpleScenarioParserProvider
				.getParser(
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityUpgradeUpgrading_4003Text(View view) {
		IParser parser = SimpleScenario.diagram.providers.SimpleScenarioParserProvider
				.getParser(
						SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgradeUpgrading_4003,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimpleScenario.diagram.part.SimpleScenarioDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SimpleScenario.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
						.getModelID(view));
	}

}
