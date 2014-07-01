/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class FindTradeOffsFindTradeOffsComponentsCompartmentItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FindTradeOffsFindTradeOffsComponentsCompartmentItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.FindTradeOffs_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.ExistingComponent_3005 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.ExistingComponentCreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.AcquirableComponent_3006 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.AcquirableComponentCreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.ComponentU_3010 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.ComponentUCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
