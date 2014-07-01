/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

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
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ScenarioItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.Scenario_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_2001 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.CapabilityProvisionCreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.FindTradeOffs_2002 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.FindTradeOffsCreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.ThroughLifePlanning_2003 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.ThroughLifePlanningCreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_2004 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.CapabilityCreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValueDictionary_2005 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.QualitativeValueDictionaryCreateCommand(
					req));
		}
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.Component_2006 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.ComponentCreateCommand(
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
