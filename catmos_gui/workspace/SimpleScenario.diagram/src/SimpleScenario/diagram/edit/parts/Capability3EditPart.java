/*
 * 
 */
package SimpleScenario.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
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
public class Capability3EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

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
	public Capability3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new SimpleScenario.diagram.edit.policies.Capability3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
		return primaryShape = new CapabilityFigure();
	}

	/**
	 * @generated
	 */
	public CapabilityFigure getPrimaryShape() {
		return (CapabilityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityNameColour3EditPart) {
			((SimpleScenario.diagram.edit.parts.CapabilityNameColour3EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCapabilityLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityNameColour3EditPart) {
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
				.getType(SimpleScenario.diagram.edit.parts.CapabilityNameColour3EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001);
		types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityEditPart) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001);
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.Capability2EditPart) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001);
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.Capability3EditPart) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001);
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.CapabilityEditPart) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002);
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.Capability2EditPart) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002);
		}
		if (targetEditPart instanceof SimpleScenario.diagram.edit.parts.Capability3EditPart) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3001);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3002);
		} else if (relationshipType == SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3001);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001);
		types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3001);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3002);
		} else if (relationshipType == SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002) {
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3001);
			types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class CapabilityFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapabilityLabelFigure;

		/**
		 * @generated
		 */
		public CapabilityFigure() {
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

			fFigureCapabilityLabelFigure = new WrappingLabel();

			fFigureCapabilityLabelFigure.setText("Capability");

			this.add(fFigureCapabilityLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapabilityLabelFigure() {
			return fFigureCapabilityLabelFigure;
		}

	}

}