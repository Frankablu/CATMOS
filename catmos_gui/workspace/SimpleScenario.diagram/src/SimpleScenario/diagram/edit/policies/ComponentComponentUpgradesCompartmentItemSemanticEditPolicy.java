/*
 * 
 */
package SimpleScenario.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentComponentUpgradesCompartmentItemSemanticEditPolicy
		extends
		SimpleScenario.diagram.edit.policies.SimpleScenarioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentUpgradesCompartmentItemSemanticEditPolicy() {
		super(
				SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Component_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgrade_3003 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleScenario.diagram.edit.commands.CapabilityUpgradeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
