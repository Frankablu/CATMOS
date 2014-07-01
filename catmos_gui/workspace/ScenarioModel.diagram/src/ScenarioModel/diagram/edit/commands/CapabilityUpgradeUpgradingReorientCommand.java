/*
 * 
 */
package ScenarioModel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class CapabilityUpgradeUpgradingReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public CapabilityUpgradeUpgradingReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof ScenarioModel.CapabilityUpgrade) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ScenarioModel.Component && newEnd instanceof ScenarioModel.CapabilityUpgrade)) {
			return false;
		}
		return ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCapabilityUpgradeUpgrading_4005(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ScenarioModel.Component && newEnd instanceof ScenarioModel.Component)) {
			return false;
		}
		return ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCapabilityUpgradeUpgrading_4005(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setUpgrading(null);
		getNewSource().setUpgrading(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setUpgrading(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.CapabilityUpgrade getOldSource() {
		return (ScenarioModel.CapabilityUpgrade) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.CapabilityUpgrade getNewSource() {
		return (ScenarioModel.CapabilityUpgrade) newEnd;
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.Component getOldTarget() {
		return (ScenarioModel.Component) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.Component getNewTarget() {
		return (ScenarioModel.Component) newEnd;
	}
}
