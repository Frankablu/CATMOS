/*
 * 
 */
package ScenarioModel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MeasurementMeasurementCriticalValuesCompartmentItemSemanticEditPolicy
		extends
		ScenarioModel.diagram.edit.policies.ScenarioModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MeasurementMeasurementCriticalValuesCompartmentItemSemanticEditPolicy() {
		super(
				ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ScenarioModel.diagram.providers.ScenarioModelElementTypes.QualitativeValue_3002 == req
				.getElementType()) {
			return getGEFWrapper(new ScenarioModel.diagram.edit.commands.QualitativeValueCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
