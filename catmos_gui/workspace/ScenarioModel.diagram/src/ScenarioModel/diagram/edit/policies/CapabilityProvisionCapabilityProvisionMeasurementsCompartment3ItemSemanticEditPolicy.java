/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CapabilityProvisionCapabilityProvisionMeasurementsCompartment3ItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CapabilityProvisionCapabilityProvisionMeasurementsCompartment3ItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3018);
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
