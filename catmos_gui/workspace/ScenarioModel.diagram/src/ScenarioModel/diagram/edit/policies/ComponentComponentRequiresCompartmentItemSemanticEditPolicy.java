/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentComponentRequiresCompartmentItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentRequiresCompartmentItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.Component_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3018 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.CapabilityProvision3CreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3020 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.Capability3CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
