/*
 * 
 */
package CapOverTime.diagram.navigator;

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
public class CapOverTimeNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CapOverTime.diagram.navigator.CapOverTimeNavigatorItem
				&& !isOwnView(((CapOverTime.diagram.navigator.CapOverTimeNavigatorItem) element)
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
		if (element instanceof CapOverTime.diagram.navigator.CapOverTimeNavigatorGroup) {
			CapOverTime.diagram.navigator.CapOverTimeNavigatorGroup group = (CapOverTime.diagram.navigator.CapOverTimeNavigatorGroup) element;
			return CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CapOverTime.diagram.navigator.CapOverTimeNavigatorItem) {
			CapOverTime.diagram.navigator.CapOverTimeNavigatorItem navigatorItem = (CapOverTime.diagram.navigator.CapOverTimeNavigatorItem) element;
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
		switch (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
				.getVisualID(view)) {
		case CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?CapOverTime?QualitativeValue", CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3004); //$NON-NLS-1$
		case CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?CapOverTime?QualitativeValue", CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3005); //$NON-NLS-1$
		case CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?CapOverTime?Capability", CapOverTime.diagram.providers.CapOverTimeElementTypes.Capability_3001); //$NON-NLS-1$
		case CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?CapOverTime?Measurement", CapOverTime.diagram.providers.CapOverTimeElementTypes.Measurement_3002); //$NON-NLS-1$
		case CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?CapOverTime?Capability?decomposes", CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityDecomposes_4002); //$NON-NLS-1$
		case CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?CapOverTime?Capability?satisfies", CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilitySatisfies_4003); //$NON-NLS-1$
		case CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?CapOverTime?TimePeriod", CapOverTime.diagram.providers.CapOverTimeElementTypes.TimePeriod_2001); //$NON-NLS-1$
		case CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?CapOverTime?Capability?accumulation", CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityAccumulation_4001); //$NON-NLS-1$
		case CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?CapOverTime?CapabilityOverTime", CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityOverTime_1000); //$NON-NLS-1$
		case CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?CapOverTime?QualitativeValue", CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& CapOverTime.diagram.providers.CapOverTimeElementTypes
						.isKnownElementType(elementType)) {
			image = CapOverTime.diagram.providers.CapOverTimeElementTypes
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
		if (element instanceof CapOverTime.diagram.navigator.CapOverTimeNavigatorGroup) {
			CapOverTime.diagram.navigator.CapOverTimeNavigatorGroup group = (CapOverTime.diagram.navigator.CapOverTimeNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CapOverTime.diagram.navigator.CapOverTimeNavigatorItem) {
			CapOverTime.diagram.navigator.CapOverTimeNavigatorItem navigatorItem = (CapOverTime.diagram.navigator.CapOverTimeNavigatorItem) element;
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
		switch (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
				.getVisualID(view)) {
		case CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return getQualitativeValue_3004Text(view);
		case CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return getQualitativeValue_3005Text(view);
		case CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return getCapability_3001Text(view);
		case CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return getMeasurement_3002Text(view);
		case CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return getCapabilityDecomposes_4002Text(view);
		case CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return getCapabilitySatisfies_4003Text(view);
		case CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID:
			return getTimePeriod_2001Text(view);
		case CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
			return getCapabilityAccumulation_4001Text(view);
		case CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID:
			return getCapabilityOverTime_1000Text(view);
		case CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return getQualitativeValue_3003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getQualitativeValue_3003Text(View view) {
		IParser parser = CapOverTime.diagram.providers.CapOverTimeParserProvider
				.getParser(
						CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3003,
						view.getElement() != null ? view.getElement() : view,
						CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
								.getType(CapOverTime.diagram.edit.parts.QualitativeValueNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimePeriod_2001Text(View view) {
		IParser parser = CapOverTime.diagram.providers.CapOverTimeParserProvider
				.getParser(
						CapOverTime.diagram.providers.CapOverTimeElementTypes.TimePeriod_2001,
						view.getElement() != null ? view.getElement() : view,
						CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
								.getType(CapOverTime.diagram.edit.parts.TimePeriodStartDateEndDateEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilitySatisfies_4003Text(View view) {
		IParser parser = CapOverTime.diagram.providers.CapOverTimeParserProvider
				.getParser(
						CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilitySatisfies_4003,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityAccumulation_4001Text(View view) {
		IParser parser = CapOverTime.diagram.providers.CapOverTimeParserProvider
				.getParser(
						CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityAccumulation_4001,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapabilityOverTime_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCapabilityDecomposes_4002Text(View view) {
		IParser parser = CapOverTime.diagram.providers.CapOverTimeParserProvider
				.getParser(
						CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityDecomposes_4002,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMeasurement_3002Text(View view) {
		IParser parser = CapOverTime.diagram.providers.CapOverTimeParserProvider
				.getParser(
						CapOverTime.diagram.providers.CapOverTimeElementTypes.Measurement_3002,
						view.getElement() != null ? view.getElement() : view,
						CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
								.getType(CapOverTime.diagram.edit.parts.MeasurementNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapability_3001Text(View view) {
		IParser parser = CapOverTime.diagram.providers.CapOverTimeParserProvider
				.getParser(
						CapOverTime.diagram.providers.CapOverTimeElementTypes.Capability_3001,
						view.getElement() != null ? view.getElement() : view,
						CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
								.getType(CapOverTime.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQualitativeValue_3004Text(View view) {
		IParser parser = CapOverTime.diagram.providers.CapOverTimeParserProvider
				.getParser(
						CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3004,
						view.getElement() != null ? view.getElement() : view,
						CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
								.getType(CapOverTime.diagram.edit.parts.QualitativeValueName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQualitativeValue_3005Text(View view) {
		IParser parser = CapOverTime.diagram.providers.CapOverTimeParserProvider
				.getParser(
						CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3005,
						view.getElement() != null ? view.getElement() : view,
						CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
								.getType(CapOverTime.diagram.edit.parts.QualitativeValueName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
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
		return CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.MODEL_ID
				.equals(CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
						.getModelID(view));
	}

}
