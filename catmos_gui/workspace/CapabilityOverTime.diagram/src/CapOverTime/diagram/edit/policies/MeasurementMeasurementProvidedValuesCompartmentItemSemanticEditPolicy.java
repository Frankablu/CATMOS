/*
 * 
 */
package CapOverTime.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MeasurementMeasurementProvidedValuesCompartmentItemSemanticEditPolicy
		extends
		CapOverTime.diagram.edit.policies.CapOverTimeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MeasurementMeasurementProvidedValuesCompartmentItemSemanticEditPolicy() {
		super(
				CapOverTime.diagram.providers.CapOverTimeElementTypes.Measurement_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3005 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.QualitativeValue3CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
