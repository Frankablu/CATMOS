/*
 * 
 */
package ScenarioModel.diagram.edit.parts;

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
public class CapabilityProvision3EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3018;

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
	public CapabilityProvision3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ScenarioModel.diagram.edit.policies.CapabilityProvision3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new ScenarioModel.diagram.edit.policies.OpenDiagramEditPolicy());
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
		return primaryShape = new CapabilityProvisionFigure();
	}

	/**
	 * @generated
	 */
	public CapabilityProvisionFigure getPrimaryShape() {
		return (CapabilityProvisionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionName3EditPart) {
			((ScenarioModel.diagram.edit.parts.CapabilityProvisionName3EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCapabilityProvisionLabelFigure());
			return true;
		}
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getCapabilityProvisionMeasurementsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionName3EditPart) {
			return true;
		}
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getCapabilityProvisionMeasurementsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart) childEditPart)
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
		if (editPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart) {
			return getPrimaryShape()
					.getCapabilityProvisionMeasurementsCompartmentFigure();
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
		return getChildBySemanticHint(ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionName3EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityAccumulation_4001);
		types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementEditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityAccumulation_4001);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityEditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability2EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability3EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability4EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityEditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability2EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability3EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		}
		if (targetEditPart instanceof ScenarioModel.diagram.edit.parts.Capability4EditPart) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityAccumulation_4001) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Measurement_3001);
		} else if (relationshipType == ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_2001);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_2004);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3017);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3018);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3019);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3020);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3023);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3024);
		} else if (relationshipType == ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_2001);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_2004);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3017);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3018);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3019);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3020);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3023);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3024);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002);
		types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityDecomposes_4002) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_2001);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_2004);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3017);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3018);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3019);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3020);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3023);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3024);
		} else if (relationshipType == ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilitySatisfies_4003) {
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_2001);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_2004);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3017);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3018);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3019);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3020);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityProvision_3023);
			types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.Capability_3024);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class CapabilityProvisionFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapabilityProvisionLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fCapabilityProvisionMeasurementsCompartmentFigure;

		/**
		 * @generated
		 */
		public CapabilityProvisionFigure() {
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

			fFigureCapabilityProvisionLabelFigure = new WrappingLabel();
			fFigureCapabilityProvisionLabelFigure
					.setText("CapabilityProvision");
			fFigureCapabilityProvisionLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureCapabilityProvisionLabelFigure);

			fCapabilityProvisionMeasurementsCompartmentFigure = new RectangleFigure();
			fCapabilityProvisionMeasurementsCompartmentFigure.setOutline(false);

			this.add(fCapabilityProvisionMeasurementsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapabilityProvisionLabelFigure() {
			return fFigureCapabilityProvisionLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getCapabilityProvisionMeasurementsCompartmentFigure() {
			return fCapabilityProvisionMeasurementsCompartmentFigure;
		}

	}

}
