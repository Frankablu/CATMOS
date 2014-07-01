/*
 * 
 */
package ScenarioModel.diagram.navigator;

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
public class ScenarioModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem
				&& !isOwnView(((ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem) element)
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
		if (element instanceof ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup) {
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup group = (ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup) element;
			return ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem) {
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem navigatorItem = (ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem) element;
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
		switch (ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getVisualID(view)) {
		case ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?ComponentU", ScenarioModel.diagram.providers.ScenarioModelElementTypes.ComponentU_3016); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?ScenarioModel?Capability?decomposes", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?ComponentU", ScenarioModel.diagram.providers.ScenarioModelElementTypes.ComponentU_3010); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?DesireHigh", ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireHigh_3013); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?Cost", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Cost_3025); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?AcquirableComponent", ScenarioModel.diagram.providers.ScenarioModelElementTypes.AcquirableComponent_3006); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ScenarioModel?QualitativeValueDictionary", ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValueDictionary_2005); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?ExistingComponent", ScenarioModel.diagram.providers.ScenarioModelElementTypes.ExistingComponent_3005); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?Budget", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Budget_3009); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?QualitativeValue", ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3004); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?Measurement", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?DesireHigh", ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireHigh_3007); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ScenarioModel?ThroughLifePlanning", ScenarioModel.diagram.providers.ScenarioModelElementTypes.ThroughLifePlanning_2003); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?CapabilityProvision", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3018); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?CapabilityProvision", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3017); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?QualitativeValue", ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3002); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?CapabilityUpgrade", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityUpgrade_3021); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?ScenarioModel?Capability?satisfies", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?Capability", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3024); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ScenarioModel?Component", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Component_2006); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ScenarioModel?FindTradeOffs", ScenarioModel.diagram.providers.ScenarioModelElementTypes.FindTradeOffs_2002); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?CapabilityChange", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityChange_3022); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?Capability", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3019); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ScenarioModel?CapabilityProvision", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_2001); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?Budget", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Budget_3015); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?ExistingComponent", ScenarioModel.diagram.providers.ScenarioModelElementTypes.ExistingComponent_3011); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?AcquirableComponent", ScenarioModel.diagram.providers.ScenarioModelElementTypes.AcquirableComponent_3012); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?ScenarioModel?Scenario", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Scenario_1000); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?QualitativeValue", ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3003); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?DesireLow", ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireLow_3014); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?ScenarioModel?QualitativeValueDictionary?greaterThan", ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValueDictionaryGreaterThan_4004); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?ScenarioModel?CapabilityUpgrade?upgrading", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityUpgradeUpgrading_4005); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?Capability", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3020); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?CapabilityProvision", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3023); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?ScenarioModel?Capability?accumulation", ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityAccumulation_4001); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?ScenarioModel?DesireLow", ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireLow_3008); //$NON-NLS-1$
		case ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?ScenarioModel?Capability", ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_2004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& ScenarioModel.diagram.providers.ScenarioModelElementTypes
						.isKnownElementType(elementType)) {
			image = ScenarioModel.diagram.providers.ScenarioModelElementTypes
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
		if (element instanceof ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup) {
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup group = (ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem) {
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem navigatorItem = (ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem) element;
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
		switch (ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getVisualID(view)) {
		case ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID:
			return getComponentU_3016Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return getCapabilityDecomposes_4002Text(view);
		case ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID:
			return getComponentU_3010Text(view);
		case ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID:
			return getDesireHigh_3013Text(view);
		case ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID:
			return getCost_3025Text(view);
		case ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID:
			return getAcquirableComponent_3006Text(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID:
			return getQualitativeValueDictionary_2005Text(view);
		case ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID:
			return getExistingComponent_3005Text(view);
		case ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID:
			return getBudget_3009Text(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getQualitativeValue_3004Text(view);
		case ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getMeasurement_3001Text(view);
		case ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID:
			return getDesireHigh_3007Text(view);
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID:
			return getThroughLifePlanning_2003Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID:
			return getCapabilityProvision_3018Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID:
			return getCapabilityProvision_3017Text(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getQualitativeValue_3002Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID:
			return getCapabilityUpgrade_3021Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return getCapabilitySatisfies_4003Text(view);
		case ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID:
			return getCapability_3024Text(view);
		case ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_2006Text(view);
		case ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID:
			return getFindTradeOffs_2002Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID:
			return getCapabilityChange_3022Text(view);
		case ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID:
			return getCapability_3019Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID:
			return getCapabilityProvision_2001Text(view);
		case ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID:
			return getBudget_3015Text(view);
		case ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID:
			return getExistingComponent_3011Text(view);
		case ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID:
			return getAcquirableComponent_3012Text(view);
		case ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getScenario_1000Text(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getQualitativeValue_3003Text(view);
		case ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID:
			return getDesireLow_3014Text(view);
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID:
			return getQualitativeValueDictionaryGreaterThan_4004Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID:
			return getCapabilityUpgradeUpgrading_4005Text(view);
		case ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID:
			return getCapability_3020Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID:
			return getCapabilityProvision_3023Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
			return getCapabilityAccumulation_4001Text(view);
		case ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID:
			return getDesireLow_3008Text(view);
		case ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_2004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getQualitativeValueDictionary_2005Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValueDictionary_2005,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExistingComponent_3005Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.ExistingComponent_3005,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.ExistingComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapability_3024Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3024,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityNameColour4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityProvision_2001Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_2001,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQualitativeValue_3003Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3003,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.QualitativeValueName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityProvision_3018Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3018,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityUpgradeUpgrading_4005Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityUpgradeUpgrading_4005,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAcquirableComponent_3006Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.AcquirableComponent_3006,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.AcquirableComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBudget_3009Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.Budget_3009,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.BudgetNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesireLow_3008Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireLow_3008,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.DesireLowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMeasurement_3001Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.MeasurementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQualitativeValue_3002Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3002,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.QualitativeValueNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_2006Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.Component_2006,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDesireHigh_3007Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireHigh_3007,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.DesireHighNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityProvision_3023Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3023,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionName4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getThroughLifePlanning_2003Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.ThroughLifePlanning_2003,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.ThroughLifePlanningNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAcquirableComponent_3012Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.AcquirableComponent_3012,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.AcquirableComponentName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapability_3019Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3019,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityNameColour2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExistingComponent_3011Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.ExistingComponent_3011,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.ExistingComponentName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesireHigh_3013Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireHigh_3013,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.DesireHighName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityUpgrade_3021Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityUpgrade_3021,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityUpgradeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQualitativeValueDictionaryGreaterThan_4004Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValueDictionaryGreaterThan_4004,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityAccumulation_4001Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityAccumulation_4001,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapability_3020Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3020,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityNameColour3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentU_3010Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.ComponentU_3010,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.ComponentUNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityChange_3022Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityChange_3022,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityChangeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBudget_3015Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.Budget_3015,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.BudgetName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityProvision_3017Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3017,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityDecomposes_4002Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesireLow_3014Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireLow_3014,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.DesireLowName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQualitativeValue_3004Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3004,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.QualitativeValueName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilitySatisfies_4003Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapability_2004Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_2004,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFindTradeOffs_2002Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.FindTradeOffs_2002,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.FindTradeOffsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentU_3016Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.ComponentU_3016,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.ComponentUName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCost_3025Text(View view) {
		IParser parser = ScenarioModel.diagram.providers.ScenarioModelParserProvider
				.getParser(
						ScenarioModel.diagram.providers.ScenarioModelElementTypes.Cost_3025,
						view.getElement() != null ? view.getElement() : view,
						ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
								.getType(ScenarioModel.diagram.edit.parts.CostNameAmountEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ScenarioModel.diagram.part.ScenarioModelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5030); //$NON-NLS-1$
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
		return ScenarioModel.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
						.getModelID(view));
	}

}