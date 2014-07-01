/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class FindTradeOffsFindTradeOffsConstraintsCompartmentItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FindTradeOffsFindTradeOffsConstraintsCompartmentItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.FindTradeOffs_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireHigh_3007 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.DesireHighCreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.DesireLow_3008 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.DesireLowCreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.Budget_3009 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.BudgetCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
