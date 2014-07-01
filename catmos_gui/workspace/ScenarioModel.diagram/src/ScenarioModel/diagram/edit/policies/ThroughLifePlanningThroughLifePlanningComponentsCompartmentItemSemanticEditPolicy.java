/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ThroughLifePlanningThroughLifePlanningComponentsCompartmentItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ThroughLifePlanningThroughLifePlanningComponentsCompartmentItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.ThroughLifePlanning_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.ExistingComponent_3011 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.ExistingComponent2CreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.AcquirableComponent_3012 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.AcquirableComponent2CreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.ComponentU_3016 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.ComponentU2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
