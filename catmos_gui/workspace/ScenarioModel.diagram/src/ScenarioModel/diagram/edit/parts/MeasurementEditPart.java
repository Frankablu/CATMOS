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
public class MeasurementEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public MeasurementEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ScenarioModel.diagram.edit.policies.MeasurementItemSemanticEditPolicy());
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
		return primaryShape = new MeasurementFigure();
	}

	/**
	 * @generated
	 */
	public MeasurementFigure getPrimaryShape() {
		return (MeasurementFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementNameEditPart) {
			((ScenarioModel.diagram.edit.parts.MeasurementNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMeasurementLabelFigure());
			return true;
		}
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getMeasurementCriticalValuesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getMeasurementBenchmarkValuesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getMeasurementProvidedValuesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getMeasurementCriticalValuesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getMeasurementBenchmarkValuesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getMeasurementProvidedValuesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart) {
			return getPrimaryShape()
					.getMeasurementCriticalValuesCompartmentFigure();
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart) {
			return getPrimaryShape()
					.getMeasurementBenchmarkValuesCompartmentFigure();
		}
		if (editPart instanceof ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart) {
			return getPrimaryShape()
					.getMeasurementProvidedValuesCompartmentFigure();
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
				.getType(ScenarioModel.diagram.edit.parts.MeasurementNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityAccumulation_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ScenarioModel.diagram.providers.ScenarioModelElementTypes.CapabilityAccumulation_4001) {
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
	public class MeasurementFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeasurementLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fMeasurementCriticalValuesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fMeasurementBenchmarkValuesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fMeasurementProvidedValuesCompartmentFigure;

		/**
		 * @generated
		 */
		public MeasurementFigure() {
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

			fFigureMeasurementLabelFigure = new WrappingLabel();
			fFigureMeasurementLabelFigure.setText("Measurement");
			fFigureMeasurementLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureMeasurementLabelFigure);

			fMeasurementCriticalValuesCompartmentFigure = new RectangleFigure();
			fMeasurementCriticalValuesCompartmentFigure.setOutline(false);

			this.add(fMeasurementCriticalValuesCompartmentFigure);

			fMeasurementBenchmarkValuesCompartmentFigure = new RectangleFigure();
			fMeasurementBenchmarkValuesCompartmentFigure.setOutline(false);

			this.add(fMeasurementBenchmarkValuesCompartmentFigure);

			fMeasurementProvidedValuesCompartmentFigure = new RectangleFigure();
			fMeasurementProvidedValuesCompartmentFigure.setOutline(false);

			this.add(fMeasurementProvidedValuesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeasurementLabelFigure() {
			return fFigureMeasurementLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getMeasurementCriticalValuesCompartmentFigure() {
			return fMeasurementCriticalValuesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getMeasurementBenchmarkValuesCompartmentFigure() {
			return fMeasurementBenchmarkValuesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getMeasurementProvidedValuesCompartmentFigure() {
			return fMeasurementProvidedValuesCompartmentFigure;
		}

	}

}
