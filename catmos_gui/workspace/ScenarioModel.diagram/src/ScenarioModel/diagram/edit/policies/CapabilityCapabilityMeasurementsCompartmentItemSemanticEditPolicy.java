/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CapabilityCapabilityMeasurementsCompartmentItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CapabilityCapabilityMeasurementsCompartmentItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.MeasurementCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}