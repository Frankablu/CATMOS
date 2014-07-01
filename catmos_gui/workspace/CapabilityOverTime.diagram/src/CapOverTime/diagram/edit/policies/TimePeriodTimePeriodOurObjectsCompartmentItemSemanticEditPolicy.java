/*
 * 
 */
package CapOverTime.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TimePeriodTimePeriodOurObjectsCompartmentItemSemanticEditPolicy
		extends
		CapOverTime.diagram.edit.policies.CapOverTimeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TimePeriodTimePeriodOurObjectsCompartmentItemSemanticEditPolicy() {
		super(
				CapOverTime.diagram.providers.CapOverTimeElementTypes.TimePeriod_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.Capability_3001 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.CapabilityCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
