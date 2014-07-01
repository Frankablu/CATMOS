/*
 * 
 */
package SimpleScenario.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ComponentEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ComponentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SimpleScenario.diagram.edit.policies.ComponentItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(
				EditPolicyRoles.OPEN_ROLE,
				new SimpleScenario.diagram.edit.policies.OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ComponentFigure();
	}

	/**
	 * @generated
	 */
	public ComponentFigure getPrimaryShape() {
		return (ComponentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentNameEditPart) {
			((SimpleScenario.diagram.edit.parts.ComponentNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureComponentLabelFigure());
			return true;
		}
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponentProvidesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponentUpgradesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponentRequiresCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentNameEditPart) {
			return true;
		}
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponentProvidesCompartmentFigure();
			pane.remove(((SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponentUpgradesCompartmentFigure();
			pane.remove(((SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getComponentRequiresCompartmentFigure();
			pane.remove(((SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart) {
			return getPrimaryShape().getComponentProvidesCompartmentFigure();
		}
		if (editPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart) {
			return getPrimaryShape().getComponentUpgradesCompartmentFigure();
		}
		if (editPart instanceof SimpleScenario.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart) {
			return getPrimaryShape().getComponentRequiresCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(SimpleScenario.diagram.part.SimpleScenarioVisualIDRegistry
				.getType(SimpleScenario.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgradeUpgrading_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgradeUpgrading_4003) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgrade_3003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class ComponentFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fComponentProvidesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fComponentUpgradesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fComponentRequiresCompartmentFigure;

		/**
		 * @generated
		 */
		public ComponentFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureComponentLabelFigure = new WrappingLabel();

			fFigureComponentLabelFigure.setText("Component");
			fFigureComponentLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureComponentLabelFigure);

			fComponentProvidesCompartmentFigure = new RectangleFigure();

			fComponentProvidesCompartmentFigure.setOutline(false);

			this.add(fComponentProvidesCompartmentFigure);

			fComponentUpgradesCompartmentFigure = new RectangleFigure();

			fComponentUpgradesCompartmentFigure.setOutline(false);

			this.add(fComponentUpgradesCompartmentFigure);

			fComponentRequiresCompartmentFigure = new RectangleFigure();

			fComponentRequiresCompartmentFigure.setOutline(false);

			this.add(fComponentRequiresCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentLabelFigure() {
			return fFigureComponentLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getComponentProvidesCompartmentFigure() {
			return fComponentProvidesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getComponentUpgradesCompartmentFigure() {
			return fComponentUpgradesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getComponentRequiresCompartmentFigure() {
			return fComponentRequiresCompartmentFigure;
		}

	}

}
