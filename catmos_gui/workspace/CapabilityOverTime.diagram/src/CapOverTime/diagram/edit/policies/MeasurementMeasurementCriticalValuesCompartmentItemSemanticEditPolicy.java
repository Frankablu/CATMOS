/*
 * 
 */
package CapOverTime.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MeasurementMeasurementCriticalValuesCompartmentItemSemanticEditPolicy
		extends
		CapOverTime.diagram.edit.policies.CapOverTimeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MeasurementMeasurementCriticalValuesCompartmentItemSemanticEditPolicy() {
		super(
				CapOverTime.diagram.providers.CapOverTimeElementTypes.Measurement_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3003 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.QualitativeValueCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
