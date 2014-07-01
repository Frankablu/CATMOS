/*
 * 
 */
package CapOverTime.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class CapabilityDecomposesItemSemanticEditPolicy extends
		CapOverTime.diagram.edit.policies.CapOverTimeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CapabilityDecomposesItemSemanticEditPolicy() {
		super(
				CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityDecomposes_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
