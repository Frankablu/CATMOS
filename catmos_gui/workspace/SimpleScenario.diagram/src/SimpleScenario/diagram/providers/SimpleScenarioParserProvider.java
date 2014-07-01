/*
 * 
 */
package SimpleScenario.diagram.providers;

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
public class SimpleScenarioParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser capabilityNameColour_5001Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityNameColour_5001Parser() {
		if (capabilityNameColour_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability_Name(),
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability_Colour() };
			SimpleScenario.diagram.parsers.MessageFormatParser parser = new SimpleScenario.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityNameColour_5001Parser = parser;
		}
		return capabilityNameColour_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5005Parser() {
		if (componentName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleScenario.SimpleScenarioPackage.eINSTANCE
					.getComponent_Name() };
			SimpleScenario.diagram.parsers.MessageFormatParser parser = new SimpleScenario.diagram.parsers.MessageFormatParser(
					features);
			componentName_5005Parser = parser;
		}
		return componentName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityNameColour_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityNameColour_5002Parser() {
		if (capabilityNameColour_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability_Name(),
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability_Colour() };
			SimpleScenario.diagram.parsers.MessageFormatParser parser = new SimpleScenario.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityNameColour_5002Parser = parser;
		}
		return capabilityNameColour_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityNameColour_5003Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityNameColour_5003Parser() {
		if (capabilityNameColour_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability_Name(),
					SimpleScenario.SimpleScenarioPackage.eINSTANCE
							.getCapability_Colour() };
			SimpleScenario.diagram.parsers.MessageFormatParser parser = new SimpleScenario.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityNameColour_5003Parser = parser;
		}
		return capabilityNameColour_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityUpgradeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityUpgradeName_5004Parser() {
		if (capabilityUpgradeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SimpleScenario.SimpleScenarioPackage.eINSTANCE
					.getCapabilityUpgrade_Name() };
			SimpleScenario.diagram.parsers.MessageFormatParser parser = new SimpleScenario.diagram.parsers.MessageFormatParser(
					features);
			capabilityUpgradeName_5004Parser = parser;
		}
		return capabilityUpgradeName_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SimpleScenario.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID:
			return getCapabilityNameColour_5001Parser();
		case SimpleScenario.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5005Parser();
		case SimpleScenario.diagram.edit.parts.CapabilityNameColour2EditPart.VISUAL_ID:
			return getCapabilityNameColour_5002Parser();
		case SimpleScenario.diagram.edit.parts.CapabilityNameColour3EditPart.VISUAL_ID:
			return getCapabilityNameColour_5003Parser();
		case SimpleScenario.diagram.edit.parts.CapabilityUpgradeNameEditPart.VISUAL_ID:
			return getCapabilityUpgradeName_5004Parser();
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
			return getParser(SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
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
			if (SimpleScenario.diagram.providers.SimpleScenarioElementTypes
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
