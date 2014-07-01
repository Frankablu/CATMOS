package org.xtext.serializer;

import ScenarioModel.AcquirableComponent;
import ScenarioModel.Budget;
import ScenarioModel.Capability;
import ScenarioModel.CapabilityChange;
import ScenarioModel.CapabilityProvision;
import ScenarioModel.CapabilityUpgrade;
import ScenarioModel.Component;
import ScenarioModel.ComponentU;
import ScenarioModel.Constraint;
import ScenarioModel.Cost;
import ScenarioModel.DesireHigh;
import ScenarioModel.DesireLow;
import ScenarioModel.ExistingComponent;
import ScenarioModel.FindTradeOffs;
import ScenarioModel.Measurement;
import ScenarioModel.OurObject;
import ScenarioModel.QualitativeValue;
import ScenarioModel.QualitativeValueDictionary;
import ScenarioModel.RunConfiguration;
import ScenarioModel.Scenario;
import ScenarioModel.ScenarioModelPackage;
import ScenarioModel.ThroughLifePlanning;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.services.ScenarioGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractScenarioSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ScenarioGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ScenarioModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ScenarioModelPackage.ACQUIRABLE_COMPONENT:
				if(context == grammarAccess.getAcquirableComponentRule() ||
				   context == grammarAccess.getComponentURule()) {
					sequence_AcquirableComponent(context, (AcquirableComponent) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.BUDGET:
				if(context == grammarAccess.getBudgetRule() ||
				   context == grammarAccess.getConstraintRule()) {
					sequence_Budget(context, (Budget) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.CAPABILITY:
				if(context == grammarAccess.getCapabilityRule() ||
				   context == grammarAccess.getCapability_ImplRule() ||
				   context == grammarAccess.getOurObjectRule()) {
					sequence_Capability_Impl(context, (Capability) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.CAPABILITY_CHANGE:
				if(context == grammarAccess.getCapabilityChangeRule()) {
					sequence_CapabilityChange(context, (CapabilityChange) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.CAPABILITY_PROVISION:
				if(context == grammarAccess.getCapabilityRule() ||
				   context == grammarAccess.getCapabilityProvisionRule() ||
				   context == grammarAccess.getOurObjectRule()) {
					sequence_CapabilityProvision(context, (CapabilityProvision) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.CAPABILITY_UPGRADE:
				if(context == grammarAccess.getCapabilityUpgradeRule()) {
					sequence_CapabilityUpgrade(context, (CapabilityUpgrade) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule() ||
				   context == grammarAccess.getOurObjectRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.COMPONENT_U:
				if(context == grammarAccess.getComponentURule() ||
				   context == grammarAccess.getComponentU_ImplRule()) {
					sequence_ComponentU_Impl(context, (ComponentU) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getConstraint_ImplRule()) {
					sequence_Constraint_Impl(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.COST:
				if(context == grammarAccess.getCostRule() ||
				   context == grammarAccess.getCost_ImplRule()) {
					sequence_Cost_Impl(context, (Cost) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.DESIRE_HIGH:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDesireHighRule()) {
					sequence_DesireHigh(context, (DesireHigh) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.DESIRE_LOW:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDesireLowRule()) {
					sequence_DesireLow(context, (DesireLow) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.EXISTING_COMPONENT:
				if(context == grammarAccess.getComponentURule() ||
				   context == grammarAccess.getExistingComponentRule()) {
					sequence_ExistingComponent(context, (ExistingComponent) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.FIND_TRADE_OFFS:
				if(context == grammarAccess.getFindTradeOffsRule() ||
				   context == grammarAccess.getOurObjectRule()) {
					sequence_FindTradeOffs(context, (FindTradeOffs) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.MEASUREMENT:
				if(context == grammarAccess.getMeasurementRule()) {
					sequence_Measurement(context, (Measurement) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.OUR_OBJECT:
				if(context == grammarAccess.getOurObjectRule() ||
				   context == grammarAccess.getOurObject_ImplRule()) {
					sequence_OurObject_Impl(context, (OurObject) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.QUALITATIVE_VALUE:
				if(context == grammarAccess.getQualitativeValueRule()) {
					sequence_QualitativeValue(context, (QualitativeValue) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.QUALITATIVE_VALUE_DICTIONARY:
				if(context == grammarAccess.getOurObjectRule() ||
				   context == grammarAccess.getQualitativeValueDictionaryRule()) {
					sequence_QualitativeValueDictionary(context, (QualitativeValueDictionary) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.RUN_CONFIGURATION:
				if(context == grammarAccess.getOurObjectRule() ||
				   context == grammarAccess.getRunConfiguration_ImplRule()) {
					sequence_RunConfiguration_Impl(context, (RunConfiguration) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.SCENARIO:
				if(context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			case ScenarioModelPackage.THROUGH_LIFE_PLANNING:
				if(context == grammarAccess.getOurObjectRule() ||
				   context == grammarAccess.getThroughLifePlanningRule()) {
					sequence_ThroughLifePlanning(context, (ThroughLifePlanning) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString quantity=EIntegerObject? acquisitionTime=EString? lifeSpan=EString?)
	 */
	protected void sequence_AcquirableComponent(EObject context, AcquirableComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString amount=EFloatOurObject? startDate=EString? repeatDuration=EString? endDate=EString?)
	 */
	protected void sequence_Budget(EObject context, Budget semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (capabilities+=CapabilityProvision capabilities+=CapabilityProvision*)?)
	 */
	protected void sequence_CapabilityChange(EObject context, CapabilityChange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         searchObjective?='searchObjective'? 
	 *         name=EString 
	 *         reuse=EIntegerObject? 
	 *         startDate=EString? 
	 *         endDate=EString? 
	 *         (measurements+=Measurement measurements+=Measurement*)?
	 *     )
	 */
	protected void sequence_CapabilityProvision(EObject context, CapabilityProvision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         targetComponent=EString? 
	 *         upgrading=[Component|EString]? 
	 *         (capabilityChanges+=CapabilityChange capabilityChanges+=CapabilityChange*)?
	 *     )
	 */
	protected void sequence_CapabilityUpgrade(EObject context, CapabilityUpgrade semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         standAlone?='standAlone'? 
	 *         searchObjective?='searchObjective'? 
	 *         sequentialScheduling?='sequentialScheduling'? 
	 *         name=EString 
	 *         reuse=EIntegerObject? 
	 *         accumulation=[Measurement|EString]? 
	 *         startDate=EString? 
	 *         endDate=EString? 
	 *         (measurements+=Measurement measurements+=Measurement*)? 
	 *         (decomposes+=[Capability|EString] decomposes+=[Capability|EString]*)? 
	 *         (satisfiedBy+=[Capability|EString] satisfiedBy+=[Capability|EString]*)?
	 *     )
	 */
	protected void sequence_Capability_Impl(EObject context, Capability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString quantity=EIntegerObject?)
	 */
	protected void sequence_ComponentU_Impl(EObject context, ComponentU semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (provides+=CapabilityProvision provides+=CapabilityProvision*)? 
	 *         (upgrades+=CapabilityUpgrade upgrades+=CapabilityUpgrade*)? 
	 *         (requires+=Capability requires+=Capability*)? 
	 *         (costs+=Cost costs+=Cost*)?
	 *     )
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Constraint}
	 */
	protected void sequence_Constraint_Impl(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString amount=EFloatOurObject? (startAfter=EString? repeatDuration=EString? stopAfter=EString?)?)
	 */
	protected void sequence_Cost_Impl(EObject context, Cost semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_DesireHigh(EObject context, DesireHigh semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScenarioModelPackage.Literals.DESIRE_HIGH__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScenarioModelPackage.Literals.DESIRE_HIGH__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDesireHighAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_DesireLow(EObject context, DesireLow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScenarioModelPackage.Literals.DESIRE_LOW__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScenarioModelPackage.Literals.DESIRE_LOW__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDesireLowAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString quantity=EIntegerObject? startDate=EString? endDate=EString?)
	 */
	protected void sequence_ExistingComponent(EObject context, ExistingComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         popSize=EIntegerObject? 
	 *         genCount=EIntegerObject? 
	 *         (components+=ComponentU components+=ComponentU*)? 
	 *         (constraints+=Constraint constraints+=Constraint*)?
	 *     )
	 */
	protected void sequence_FindTradeOffs(EObject context, FindTradeOffs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         criticalValue=EFloatOurObject? 
	 *         benchmarkValue=EFloatOurObject? 
	 *         providedValue=EFloatOurObject? 
	 *         (criticalValues+=QualitativeValue criticalValues+=QualitativeValue*)? 
	 *         (benchmarkValues+=QualitativeValue benchmarkValues+=QualitativeValue*)? 
	 *         (providedValues+=QualitativeValue providedValues+=QualitativeValue*)? 
	 *         script=EString?
	 *     )
	 */
	protected void sequence_Measurement(EObject context, Measurement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OurObject}
	 */
	protected void sequence_OurObject_Impl(EObject context, OurObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString lessThan=[QualitativeValueDictionary|EString]? greaterThan=[QualitativeValueDictionary|EString]?)
	 */
	protected void sequence_QualitativeValueDictionary(EObject context, QualitativeValueDictionary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_QualitativeValue(EObject context, QualitativeValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScenarioModelPackage.Literals.QUALITATIVE_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScenarioModelPackage.Literals.QUALITATIVE_VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQualitativeValueAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString popSize=EIntegerObject? genCount=EIntegerObject?)
	 */
	protected void sequence_RunConfiguration_Impl(EObject context, RunConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((OurObjects+=OurObject OurObjects+=OurObject*)?)
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         popSize=EIntegerObject? 
	 *         genCount=EIntegerObject? 
	 *         startDate=EString? 
	 *         endDate=EString? 
	 *         (components+=ComponentU components+=ComponentU*)? 
	 *         (constraints+=Constraint constraints+=Constraint*)?
	 *     )
	 */
	protected void sequence_ThroughLifePlanning(EObject context, ThroughLifePlanning semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
