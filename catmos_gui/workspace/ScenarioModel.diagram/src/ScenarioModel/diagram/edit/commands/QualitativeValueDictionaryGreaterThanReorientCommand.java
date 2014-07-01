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
public class QualitativeValueDictionaryGreaterThanReorientCommand extends
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
	public QualitativeValueDictionaryGreaterThanReorientCommand(
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
		if (false == referenceOwner instanceof ScenarioModel.QualitativeValueDictionary) {
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
		if (!(oldEnd instanceof ScenarioModel.QualitativeValueDictionary && newEnd instanceof ScenarioModel.QualitativeValueDictionary)) {
			return false;
		}
		return ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistQualitativeValueDictionaryGreaterThan_4004(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ScenarioModel.QualitativeValueDictionary && newEnd instanceof ScenarioModel.QualitativeValueDictionary)) {
			return false;
		}
		return ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistQualitativeValueDictionaryGreaterThan_4004(
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
		getOldSource().setGreaterThan(null);
		getNewSource().setGreaterThan(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setGreaterThan(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.QualitativeValueDictionary getOldSource() {
		return (ScenarioModel.QualitativeValueDictionary) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.QualitativeValueDictionary getNewSource() {
		return (ScenarioModel.QualitativeValueDictionary) newEnd;
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.QualitativeValueDictionary getOldTarget() {
		return (ScenarioModel.QualitativeValueDictionary) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ScenarioModel.QualitativeValueDictionary getNewTarget() {
		return (ScenarioModel.QualitativeValueDictionary) newEnd;
	}
}
