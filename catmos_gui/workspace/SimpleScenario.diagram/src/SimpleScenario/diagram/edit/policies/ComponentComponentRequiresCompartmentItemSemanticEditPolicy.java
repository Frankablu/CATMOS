/*
 * 
 */
package SimpleScenario.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentComponentRequiresCompartmentItemSemanticEditPolicy
		extends
		SimpleScenario.diagram.edit.policies.SimpleScenarioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentRequiresCompartmentItemSemanticEditPolicy() {
		super(
				SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Component_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3002 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleScenario.diagram.edit.commands.Capability3CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
