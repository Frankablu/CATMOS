/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ThroughLifePlanningThroughLifePlanningConstraintsCompartmentItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ThroughLifePlanningThroughLifePlanningConstraintsCompartmentItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.ThroughLifePlanning_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireHigh_3013 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.DesireHigh2CreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireLow_3014 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.DesireLow2CreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.Budget_3015 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.Budget2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
