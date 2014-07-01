/*
 * 
 */
package CapOverTime.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CapabilityItemSemanticEditPolicy extends
		CapOverTime.diagram.edit.policies.CapOverTimeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CapabilityItemSemanticEditPolicy() {
		super(
				CapOverTime.diagram.providers.CapOverTimeElementTypes.Capability_3001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(incomingLink) == CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(incomingLink) == CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(outgoingLink) == CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(outgoingLink) == CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(outgoingLink) == CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
					.getVisualID(node)) {
			case CapOverTime.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
							.getVisualID(cnode)) {
					case CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (CapOverTime.diagram.part.CapOverTimeVisualIDRegistry
									.getVisualID(incomingLink) == CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityAccumulation_4001 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.CapabilityAccumulationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityDecomposes_4002 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.CapabilityDecomposesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilitySatisfies_4003 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.CapabilitySatisfiesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityAccumulation_4001 == req
				.getElementType()) {
			return null;
		}
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityDecomposes_4002 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.CapabilityDecomposesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilitySatisfies_4003 == req
				.getElementType()) {
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.CapabilitySatisfiesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.CapabilityAccumulationReorientCommand(
					req));
		case CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.CapabilityDecomposesReorientCommand(
					req));
		case CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return getGEFWrapper(new CapOverTime.diagram.edit.commands.CapabilitySatisfiesReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
