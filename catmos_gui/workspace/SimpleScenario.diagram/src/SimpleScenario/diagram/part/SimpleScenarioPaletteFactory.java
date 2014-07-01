/*
 * 
 */
package SimpleScenario.diagram.part;

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
public class SimpleScenarioPaletteFactory {

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
				SimpleScenario.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createCapability1CreationTool());
		paletteContainer.add(createCapabilityUpgrade2CreationTool());
		paletteContainer.add(createComponent3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				SimpleScenario.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDecomposes1CreationTool());
		paletteContainer.add(createSatisfies2CreationTool());
		paletteContainer.add(createUpgrading3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapability1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001);
		types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3001);
		types.add(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_3002);
		NodeToolEntry entry = new NodeToolEntry(
				SimpleScenario.diagram.part.Messages.Capability1CreationTool_title,
				SimpleScenario.diagram.part.Messages.Capability1CreationTool_desc,
				types);
		entry.setId("createCapability1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleScenario.diagram.providers.SimpleScenarioElementTypes
				.getImageDescriptor(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Capability_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapabilityUpgrade2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				SimpleScenario.diagram.part.Messages.CapabilityUpgrade2CreationTool_title,
				SimpleScenario.diagram.part.Messages.CapabilityUpgrade2CreationTool_desc,
				Collections
						.singletonList(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgrade_3003));
		entry.setId("createCapabilityUpgrade2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleScenario.diagram.providers.SimpleScenarioElementTypes
				.getImageDescriptor(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgrade_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				SimpleScenario.diagram.part.Messages.Component3CreationTool_title,
				SimpleScenario.diagram.part.Messages.Component3CreationTool_desc,
				Collections
						.singletonList(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Component_2002));
		entry.setId("createComponent3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleScenario.diagram.providers.SimpleScenarioElementTypes
				.getImageDescriptor(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.Component_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecomposes1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				SimpleScenario.diagram.part.Messages.Decomposes1CreationTool_title,
				SimpleScenario.diagram.part.Messages.Decomposes1CreationTool_desc,
				Collections
						.singletonList(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001));
		entry.setId("createDecomposes1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleScenario.diagram.providers.SimpleScenarioElementTypes
				.getImageDescriptor(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityDecomposes_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSatisfies2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				SimpleScenario.diagram.part.Messages.Satisfies2CreationTool_title,
				SimpleScenario.diagram.part.Messages.Satisfies2CreationTool_desc,
				Collections
						.singletonList(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002));
		entry.setId("createSatisfies2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleScenario.diagram.providers.SimpleScenarioElementTypes
				.getImageDescriptor(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilitySatisfies_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUpgrading3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				SimpleScenario.diagram.part.Messages.Upgrading3CreationTool_title,
				SimpleScenario.diagram.part.Messages.Upgrading3CreationTool_desc,
				Collections
						.singletonList(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgradeUpgrading_4003));
		entry.setId("createUpgrading3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimpleScenario.diagram.providers.SimpleScenarioElementTypes
				.getImageDescriptor(SimpleScenario.diagram.providers.SimpleScenarioElementTypes.CapabilityUpgradeUpgrading_4003));
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
