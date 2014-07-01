/*
 * 
 */
package SimpleScenario.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ScenarioItemSemanticEditPolicy
		extends
		SimpleScenario.diagram.edit.policies.SimpleScenarioBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ScenarioItemSemanticEditPolicy() {
		super(
				SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Scenario_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleScenario.diagram.edit.commands.CapabilityCreateCommand(
					req));
		}
		if (SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Component_2002 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleScenario.diagram.edit.commands.ComponentCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
