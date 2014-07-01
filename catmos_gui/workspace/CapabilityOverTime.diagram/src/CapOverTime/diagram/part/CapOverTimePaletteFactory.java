/*
 * 
 */
package CapOverTime.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class CapOverTimePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				CapOverTime.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCapability1CreationTool());
		paletteContainer.add(createMeasurement2CreationTool());
		paletteContainer.add(createQualitativeValue3CreationTool());
		paletteContainer.add(createTimePeriod4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				CapOverTime.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAccumulation1CreationTool());
		paletteContainer.add(createDecomposes2CreationTool());
		paletteContainer.add(createSatisfies3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapability1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				CapOverTime.diagram.part.Messages.Capability1CreationTool_title,
				CapOverTime.diagram.part.Messages.Capability1CreationTool_desc,
				Collections
						.singletonList(CapOverTime.diagram.providers.CapOverTimeElementTypes.Capability_3001));
		entry.setId("createCapability1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CapOverTime.diagram.providers.CapOverTimeElementTypes
				.getImageDescriptor(CapOverTime.diagram.providers.CapOverTimeElementTypes.Capability_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeasurement2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				CapOverTime.diagram.part.Messages.Measurement2CreationTool_title,
				CapOverTime.diagram.part.Messages.Measurement2CreationTool_desc,
				Collections
						.singletonList(CapOverTime.diagram.providers.CapOverTimeElementTypes.Measurement_3002));
		entry.setId("createMeasurement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CapOverTime.diagram.providers.CapOverTimeElementTypes
				.getImageDescriptor(CapOverTime.diagram.providers.CapOverTimeElementTypes.Measurement_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createQualitativeValue3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3003);
		types.add(CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3004);
		types.add(CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3005);
		NodeToolEntry entry = new NodeToolEntry(
				CapOverTime.diagram.part.Messages.QualitativeValue3CreationTool_title,
				CapOverTime.diagram.part.Messages.QualitativeValue3CreationTool_desc,
				types);
		entry.setId("createQualitativeValue3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CapOverTime.diagram.providers.CapOverTimeElementTypes
				.getImageDescriptor(CapOverTime.diagram.providers.CapOverTimeElementTypes.QualitativeValue_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimePeriod4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				CapOverTime.diagram.part.Messages.TimePeriod4CreationTool_title,
				CapOverTime.diagram.part.Messages.TimePeriod4CreationTool_desc,
				Collections
						.singletonList(CapOverTime.diagram.providers.CapOverTimeElementTypes.TimePeriod_2001));
		entry.setId("createTimePeriod4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CapOverTime.diagram.providers.CapOverTimeElementTypes
				.getImageDescriptor(CapOverTime.diagram.providers.CapOverTimeElementTypes.TimePeriod_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAccumulation1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				CapOverTime.diagram.part.Messages.Accumulation1CreationTool_title,
				CapOverTime.diagram.part.Messages.Accumulation1CreationTool_desc,
				Collections
						.singletonList(CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityAccumulation_4001));
		entry.setId("createAccumulation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CapOverTime.diagram.providers.CapOverTimeElementTypes
				.getImageDescriptor(CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityAccumulation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecomposes2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				CapOverTime.diagram.part.Messages.Decomposes2CreationTool_title,
				CapOverTime.diagram.part.Messages.Decomposes2CreationTool_desc,
				Collections
						.singletonList(CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityDecomposes_4002));
		entry.setId("createDecomposes2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CapOverTime.diagram.providers.CapOverTimeElementTypes
				.getImageDescriptor(CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilityDecomposes_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSatisfies3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				CapOverTime.diagram.part.Messages.Satisfies3CreationTool_title,
				CapOverTime.diagram.part.Messages.Satisfies3CreationTool_desc,
				Collections
						.singletonList(CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilitySatisfies_4003));
		entry.setId("createSatisfies3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CapOverTime.diagram.providers.CapOverTimeElementTypes
				.getImageDescriptor(CapOverTime.diagram.providers.CapOverTimeElementTypes.CapabilitySatisfies_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
