/*
 * 
 */
package ScenarioModel.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class ScenarioModelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ScenarioModelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem> result = new ArrayList<ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup) {
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup group = (ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem) {
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem navigatorItem = (ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
				.getVisualID(view)) {

		case ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup target = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityDecomposes_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup source = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityDecomposes_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_QualitativeValueDictionary_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_QualitativeValueDictionary_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Measurement_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementMeasurementCriticalValuesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementMeasurementBenchmarkValuesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementMeasurementProvidedValuesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ExistingComponent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.AcquirableComponent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.DesireHigh2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.DesireLow2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Budget2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ThroughLifePlanningThroughLifePlanningComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentU2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityProvision_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityProvision_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityProvision_3017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityProvision_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityUpgrade_3021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityUpgradeCapabilityUpgradeCapabilityChangesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup target = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilitySatisfies_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup source = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilitySatisfies_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Capability_3024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Capability_3024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Component_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentComponentProvidesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentComponentRequiresCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentComponentUpgradesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentComponentCostsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CostEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ExistingComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.AcquirableComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.DesireHighEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.DesireLowEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsConstraintsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.BudgetEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.FindTradeOffsFindTradeOffsComponentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentUEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilityChangeEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityChangeCapabilityChangeCapabilitiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityChangeCapabilityChangeCapabilitiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Capability_3019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Capability_3019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityProvision_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityProvision_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.ScenarioEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup links = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Scenario_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.FindTradeOffsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ThroughLifePlanningEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryGreaterThanEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup target = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_QualitativeValueDictionaryGreaterThan_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup source = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_QualitativeValueDictionaryGreaterThan_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.QualitativeValueDictionaryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilityUpgradeUpgradingEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup target = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityUpgradeUpgrading_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup source = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityUpgradeUpgrading_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.ComponentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityUpgradeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Capability_3020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Capability_3020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityProvision_3023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityProvision_3023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionCapabilityProvisionMeasurementsCompartment4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup target = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityAccumulation_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup source = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_CapabilityAccumulation_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityProvision4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.Capability4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ScenarioModel.diagram.edit.parts.CapabilityEditPart.VISUAL_ID: {
			LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem> result = new LinkedList<ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem>();
			Node sv = (Node) view;
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup outgoinglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Capability_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup incominglinks = new ScenarioModel.diagram.navigator.ScenarioModelNavigatorGroup(
					ScenarioModel.diagram.part.Messages.NavigatorGroupName_Capability_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityCapabilityMeasurementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.MeasurementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
							.getType(ScenarioModel.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ScenarioModel.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(ScenarioModel.diagram.part.ScenarioModelVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem> result = new ArrayList<ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ScenarioModel.diagram.navigator.ScenarioModelNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem) {
			ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem abstractNavigatorItem = (ScenarioModel.diagram.navigator.ScenarioModelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}