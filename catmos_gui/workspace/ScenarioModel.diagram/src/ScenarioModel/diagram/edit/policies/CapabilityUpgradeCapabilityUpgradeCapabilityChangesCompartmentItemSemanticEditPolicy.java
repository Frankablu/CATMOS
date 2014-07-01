/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityUpgrade_3021);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityChange_3022 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.CapabilityChangeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
