/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CapabilityChangeCapabilityChangeCapabilitiesCompartmentItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CapabilityChangeCapabilityChangeCapabilitiesCompartmentItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityChange_3022);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3023 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.CapabilityProvision4CreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3024 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.Capability4CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
