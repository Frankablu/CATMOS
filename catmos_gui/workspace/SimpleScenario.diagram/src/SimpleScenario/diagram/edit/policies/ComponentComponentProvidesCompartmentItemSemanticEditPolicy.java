/*
 * 
 */
package SimpleScenario.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ComponentComponentProvidesCompartmentItemSemanticEditPolicy
		extends
		SimpleScenario.diagram.edit.policies.SimpleScenarioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentProvidesCompartmentItemSemanticEditPolicy() {
		super(
				SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Component_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3001 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleScenario.diagram.edit.commands.Capability2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
