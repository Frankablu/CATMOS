/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class QualitativeValueDictionaryGreaterThanItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public QualitativeValueDictionaryGreaterThanItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValueDictionaryGreaterThan_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
