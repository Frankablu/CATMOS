/*
 * 
 */
package ScenarioModel.diagram.providers;

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
public class ScenarioModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser capabilityProvisionName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityProvisionName_5005Parser() {
		if (capabilityProvisionName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapability_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityProvisionName_5005Parser = parser;
		}
		return capabilityProvisionName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser findTradeOffsName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getFindTradeOffsName_5012Parser() {
		if (findTradeOffsName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getRunConfiguration_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			findTradeOffsName_5012Parser = parser;
		}
		return findTradeOffsName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser throughLifePlanningName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getThroughLifePlanningName_5019Parser() {
		if (throughLifePlanningName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getRunConfiguration_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			throughLifePlanningName_5019Parser = parser;
		}
		return throughLifePlanningName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityNameColour_5020Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityNameColour_5020Parser() {
		if (capabilityNameColour_5020Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Name(),
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Colour() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityNameColour_5020Parser = parser;
		}
		return capabilityNameColour_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser qualitativeValueDictionaryName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getQualitativeValueDictionaryName_5021Parser() {
		if (qualitativeValueDictionaryName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getQualitativeValueDictionary_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			qualitativeValueDictionaryName_5021Parser = parser;
		}
		return qualitativeValueDictionaryName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5031Parser() {
		if (componentName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getComponent_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			componentName_5031Parser = parser;
		}
		return componentName_5031Parser;
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
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getMeasurement_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
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
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getQualitativeValue_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
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
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getQualitativeValue_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
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
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getQualitativeValue_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			qualitativeValueName_5003Parser = parser;
		}
		return qualitativeValueName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser existingComponentName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getExistingComponentName_5006Parser() {
		if (existingComponentName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getComponentU_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			existingComponentName_5006Parser = parser;
		}
		return existingComponentName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser acquirableComponentName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAcquirableComponentName_5007Parser() {
		if (acquirableComponentName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getComponentU_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			acquirableComponentName_5007Parser = parser;
		}
		return acquirableComponentName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser desireHighName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getDesireHighName_5008Parser() {
		if (desireHighName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getDesireHigh_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			desireHighName_5008Parser = parser;
		}
		return desireHighName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser desireLowName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getDesireLowName_5009Parser() {
		if (desireLowName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getDesireLow_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			desireLowName_5009Parser = parser;
		}
		return desireLowName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser budgetName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getBudgetName_5010Parser() {
		if (budgetName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getBudget_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			budgetName_5010Parser = parser;
		}
		return budgetName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentUName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getComponentUName_5011Parser() {
		if (componentUName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getComponentU_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			componentUName_5011Parser = parser;
		}
		return componentUName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser existingComponentName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getExistingComponentName_5013Parser() {
		if (existingComponentName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getComponentU_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			existingComponentName_5013Parser = parser;
		}
		return existingComponentName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser acquirableComponentName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getAcquirableComponentName_5014Parser() {
		if (acquirableComponentName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getComponentU_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			acquirableComponentName_5014Parser = parser;
		}
		return acquirableComponentName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser desireHighName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getDesireHighName_5015Parser() {
		if (desireHighName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getDesireHigh_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			desireHighName_5015Parser = parser;
		}
		return desireHighName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser desireLowName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getDesireLowName_5016Parser() {
		if (desireLowName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getDesireLow_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			desireLowName_5016Parser = parser;
		}
		return desireLowName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser budgetName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getBudgetName_5017Parser() {
		if (budgetName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getBudget_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			budgetName_5017Parser = parser;
		}
		return budgetName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentUName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getComponentUName_5018Parser() {
		if (componentUName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getComponentU_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			componentUName_5018Parser = parser;
		}
		return componentUName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityProvisionName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityProvisionName_5022Parser() {
		if (capabilityProvisionName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapability_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityProvisionName_5022Parser = parser;
		}
		return capabilityProvisionName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityProvisionName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityProvisionName_5023Parser() {
		if (capabilityProvisionName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapability_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityProvisionName_5023Parser = parser;
		}
		return capabilityProvisionName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityNameColour_5024Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityNameColour_5024Parser() {
		if (capabilityNameColour_5024Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Name(),
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Colour() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityNameColour_5024Parser = parser;
		}
		return capabilityNameColour_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityNameColour_5025Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityNameColour_5025Parser() {
		if (capabilityNameColour_5025Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Name(),
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Colour() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityNameColour_5025Parser = parser;
		}
		return capabilityNameColour_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityUpgradeName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityUpgradeName_5029Parser() {
		if (capabilityUpgradeName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapabilityUpgrade_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			capabilityUpgradeName_5029Parser = parser;
		}
		return capabilityUpgradeName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityChangeName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityChangeName_5028Parser() {
		if (capabilityChangeName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapabilityChange_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			capabilityChangeName_5028Parser = parser;
		}
		return capabilityChangeName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityProvisionName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityProvisionName_5026Parser() {
		if (capabilityProvisionName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { ScenarioModel.ScenarioModelPackage.eINSTANCE
					.getCapability_Name() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityProvisionName_5026Parser = parser;
		}
		return capabilityProvisionName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityNameColour_5027Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityNameColour_5027Parser() {
		if (capabilityNameColour_5027Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Name(),
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCapability_Colour() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			capabilityNameColour_5027Parser = parser;
		}
		return capabilityNameColour_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser costNameAmount_5030Parser;

	/**
	 * @generated
	 */
	private IParser getCostNameAmount_5030Parser() {
		if (costNameAmount_5030Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ScenarioModel.ScenarioModelPackage.eINSTANCE.getCost_Name(),
					ScenarioModel.ScenarioModelPackage.eINSTANCE
							.getCost_Amount() };
			ScenarioModel.diagram.parsers.MessageFormatParser parser = new ScenarioModel.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} : {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} : {1}"); //$NON-NLS-1$
			costNameAmount_5030Parser = parser;
		}
		return costNameAmount_5030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionNameEditPart.VISUAL_ID:
			return getCapabilityProvisionName_5005Parser();
		case ScenarioModel.diagram.edit.parts.FindTradeOffsNameEditPart.VISUAL_ID:
			return getFindTradeOffsName_5012Parser();
		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningNameEditPart.VISUAL_ID:
			return getThroughLifePlanningName_5019Parser();
		case ScenarioModel.diagram.edit.parts.CapabilityNameColourEditPart.VISUAL_ID:
			return getCapabilityNameColour_5020Parser();
		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryNameEditPart.VISUAL_ID:
			return getQualitativeValueDictionaryName_5021Parser();
		case ScenarioModel.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5031Parser();
		case ScenarioModel.diagram.edit.parts.MeasurementNameEditPart.VISUAL_ID:
			return getMeasurementName_5004Parser();
		case ScenarioModel.diagram.edit.parts.QualitativeValueNameEditPart.VISUAL_ID:
			return getQualitativeValueName_5001Parser();
		case ScenarioModel.diagram.edit.parts.QualitativeValueName2EditPart.VISUAL_ID:
			return getQualitativeValueName_5002Parser();
		case ScenarioModel.diagram.edit.parts.QualitativeValueName3EditPart.VISUAL_ID:
			return getQualitativeValueName_5003Parser();
		case ScenarioModel.diagram.edit.parts.ExistingComponentNameEditPart.VISUAL_ID:
			return getExistingComponentName_5006Parser();
		case ScenarioModel.diagram.edit.parts.AcquirableComponentNameEditPart.VISUAL_ID:
			return getAcquirableComponentName_5007Parser();
		case ScenarioModel.diagram.edit.parts.DesireHighNameEditPart.VISUAL_ID:
			return getDesireHighName_5008Parser();
		case ScenarioModel.diagram.edit.parts.DesireLowNameEditPart.VISUAL_ID:
			return getDesireLowName_5009Parser();
		case ScenarioModel.diagram.edit.parts.BudgetNameEditPart.VISUAL_ID:
			return getBudgetName_5010Parser();
		case ScenarioModel.diagram.edit.parts.ComponentUNameEditPart.VISUAL_ID:
			return getComponentUName_5011Parser();
		case ScenarioModel.diagram.edit.parts.ExistingComponentName2EditPart.VISUAL_ID:
			return getExistingComponentName_5013Parser();
		case ScenarioModel.diagram.edit.parts.AcquirableComponentName2EditPart.VISUAL_ID:
			return getAcquirableComponentName_5014Parser();
		case ScenarioModel.diagram.edit.parts.DesireHighName2EditPart.VISUAL_ID:
			return getDesireHighName_5015Parser();
		case ScenarioModel.diagram.edit.parts.DesireLowName2EditPart.VISUAL_ID:
			return getDesireLowName_5016Parser();
		case ScenarioModel.diagram.edit.parts.BudgetName2EditPart.VISUAL_ID:
			return getBudgetName_5017Parser();
		case ScenarioModel.diagram.edit.parts.ComponentUName2EditPart.VISUAL_ID:
			return getComponentUName_5018Parser();
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionName2EditPart.VISUAL_ID:
			return getCapabilityProvisionName_5022Parser();
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionName3EditPart.VISUAL_ID:
			return getCapabilityProvisionName_5023Parser();
		case ScenarioModel.diagram.edit.parts.CapabilityNameColour2EditPart.VISUAL_ID:
			return getCapabilityNameColour_5024Parser();
		case ScenarioModel.diagram.edit.parts.CapabilityNameColour3EditPart.VISUAL_ID:
			return getCapabilityNameColour_5025Parser();
		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeNameEditPart.VISUAL_ID:
			return getCapabilityUpgradeName_5029Parser();
		case ScenarioModel.diagram.edit.parts.CapabilityChangeNameEditPart.VISUAL_ID:
			return getCapabilityChangeName_5028Parser();
		case ScenarioModel.diagram.edit.parts.CapabilityProvisionName4EditPart.VISUAL_ID:
			return getCapabilityProvisionName_5026Parser();
		case ScenarioModel.diagram.edit.parts.CapabilityNameColour4EditPart.VISUAL_ID:
			return getCapabilityNameColour_5027Parser();
		case ScenarioModel.diagram.edit.parts.CostNameAmountEditPart.VISUAL_ID:
			return getCostNameAmount_5030Parser();
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
			return getParser(ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
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
			if (ScenarioModel.diagram.providers.ScenarioModelElementTypes
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
