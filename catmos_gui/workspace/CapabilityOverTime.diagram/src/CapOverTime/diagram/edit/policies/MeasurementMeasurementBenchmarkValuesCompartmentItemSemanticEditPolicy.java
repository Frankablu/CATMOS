/*
 * 
 */
package CapOverTime.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MeasurementMeasurementBenchmarkValuesCompartmentItemSemanticEditPolicy
		extends
		CapOverTime.diagram.edit.policies.CapOverTimeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MeasurementMeasurementBenchmarkValuesCompartmentItemSemanticEditPolicy() {
		super(
				CapOverTime.diagram.providers.CapOverTimeElementTypes.Measurement_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3004 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.QualitativeValue2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
