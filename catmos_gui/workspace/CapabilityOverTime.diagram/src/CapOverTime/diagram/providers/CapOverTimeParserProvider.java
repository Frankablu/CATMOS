/*
 * 
 */
package CapOverTime.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CapOverTimeParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser timePeriodStartDateEndDate_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTimePeriodStartDateEndDate_5006Parser() {
		if (timePeriodStartDateEndDate_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getTimePeriod_StartDate(),
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getTimePeriod_EndDate() };
			CapOverTime.diagram.parsers.MessageFormatParser parser = new CapOverTime.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} - {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} - {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} - {1}"); //$NON-NLS-1$
			timePeriodStartDateEndDate_5006Parser = parser;
		}
		return timePeriodStartDateEndDate_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityNameColour_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityNameColour_5005Parser() {
		if (capabilityNameColour_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getCapability_Name(),
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getCapability_Colour() };
			CapOverTime.diagram.parsers.MessageFormatParser parser = new CapOverTime.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityNameColour_5005Parser = parser;
		}
		return capabilityNameColour_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser measurementName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getMeasurementName_5004Parser() {
		if (measurementName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { CapOverTime.CapOverTimePackage.eINSTANCE
					.getMeasurement_Name() };
			CapOverTime.diagram.parsers.MessageFormatParser parser = new CapOverTime.diagram.parsers.MessageFormatParser(
					features);
			measurementName_5004Parser = parser;
		}
		return measurementName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser qualitativeValueName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getQualitativeValueName_5001Parser() {
		if (qualitativeValueName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CapOverTime.CapOverTimePackage.eINSTANCE
					.getQualitativeValue_Name() };
			CapOverTime.diagram.parsers.MessageFormatParser parser = new CapOverTime.diagram.parsers.MessageFormatParser(
					features);
			qualitativeValueName_5001Parser = parser;
		}
		return qualitativeValueName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser qualitativeValueName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getQualitativeValueName_5002Parser() {
		if (qualitativeValueName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CapOverTime.CapOverTimePackage.eINSTANCE
					.getQualitativeValue_Name() };
			CapOverTime.diagram.parsers.MessageFormatParser parser = new CapOverTime.diagram.parsers.MessageFormatParser(
					features);
			qualitativeValueName_5002Parser = parser;
		}
		return qualitativeValueName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser qualitativeValueName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getQualitativeValueName_5003Parser() {
		if (qualitativeValueName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { CapOverTime.CapOverTimePackage.eINSTANCE
					.getQualitativeValue_Name() };
			CapOverTime.diagram.parsers.MessageFormatParser parser = new CapOverTime.diagram.parsers.MessageFormatParser(
					features);
			qualitativeValueName_5003Parser = parser;
		}
		return qualitativeValueName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CapOverTime.diagram.edit.parts.TimePeriodStartDateEndDateEditPart.VISUAL_ID:
			return getTimePeriodStartDateEndDate_5006Parser();
		case CapOverTime.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID:
			return getCapabilityNameColour_5005Parser();
		case CapOverTime.diagram.edit.parts.MeasurementNameEditPart.VISUAL_ID:
			return getMeasurementName_5004Parser();
		case CapOverTime.diagram.edit.parts.QualitativeValueNameEditPart.VISUAL_ID:
			return getQualitativeValueName_5001Parser();
		case CapOverTime.diagram.edit.parts.QualitativeValueName2EditPart.VISUAL_ID:
			return getQualitativeValueName_5002Parser();
		case CapOverTime.diagram.edit.parts.QualitativeValueName3EditPart.VISUAL_ID:
			return getQualitativeValueName_5003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CapOverTime.diagram.providers.CapOverTimeElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
