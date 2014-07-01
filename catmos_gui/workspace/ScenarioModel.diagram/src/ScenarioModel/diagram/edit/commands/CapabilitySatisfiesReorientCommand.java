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
public class CapabilitySatisfiesReorientCommand extends EditElementCommand {

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
	public CapabilitySatisfiesReorientCommand(
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
		if (false == referenceOwner instanceof ScenarioModel.Capability) {
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
		if (!(oldEnd instanceof ScenarioModel.Capability && newEnd instanceof ScenarioModel.Capability)) {
			return false;
		}
		return ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCapabilitySatisfies_4003(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ScenarioModel.Capability && newEnd instanceof ScenarioModel.Capability)) {
			return false;
		}
		return ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistCapabilitySatisfies_4003(
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
		getOldSource().getSatisfies().remove(getOldTarget());
		getNewSource().getSatisfies().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getSatisfies().remove(getOldTarget());
		getOldSource().getSatisfies().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.Capability getOldSource() {
		return (ScenarioModel.Capability) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.Capability getNewSource() {
		return (ScenarioModel.Capability) newEnd;
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.Capability getOldTarget() {
		return (ScenarioModel.Capability) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.Capability getNewTarget() {
		return (ScenarioModel.Capability) newEnd;
	}
}
