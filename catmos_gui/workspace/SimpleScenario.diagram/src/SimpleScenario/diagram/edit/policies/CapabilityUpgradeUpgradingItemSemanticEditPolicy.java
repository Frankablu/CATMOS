/*
 * 
 */
package SimpleScenario.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class CapabilityUpgradeUpgradingItemSemanticEditPolicy
		extends
		SimpleScenario.diagram.edit.policies.SimpleScenarioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CapabilityUpgradeUpgradingItemSemanticEditPolicy() {
		super(
				SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgradeUpgrading_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
