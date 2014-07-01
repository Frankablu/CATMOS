/*
 * 
 */
package CapOverTime.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CapabilityCapabilityMeasurementsCompartmentItemSemanticEditPolicy
		extends
		CapOverTime.diagram.edit.policies.CapOverTimeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CapabilityCapabilityMeasurementsCompartmentItemSemanticEditPolicy() {
		super(
				CapOverTime.diagram.providers.CapOverTimeElementTypes.Capability_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.Measurement_3002 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.MeasurementCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
