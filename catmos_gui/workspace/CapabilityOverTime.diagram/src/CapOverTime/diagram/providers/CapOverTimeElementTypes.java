/*
 * 
 */
package CapOverTime.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class CapOverTimeElementTypes {

	/**
	 * @generated
	 */
	private CapOverTimeElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CapabilityOverTime_1000 = getElementType("CapabilityOverTime.diagram.CapabilityOverTime_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimePeriod_2001 = getElementType("CapabilityOverTime.diagram.TimePeriod_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_3001 = getElementType("CapabilityOverTime.diagram.Capability_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Measurement_3002 = getElementType("CapabilityOverTime.diagram.Measurement_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QualitativeValue_3003 = getElementType("CapabilityOverTime.diagram.QualitativeValue_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QualitativeValue_3004 = getElementType("CapabilityOverTime.diagram.QualitativeValue_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QualitativeValue_3005 = getElementType("CapabilityOverTime.diagram.QualitativeValue_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityAccumulation_4001 = getElementType("CapabilityOverTime.diagram.CapabilityAccumulation_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilityDecomposes_4002 = getElementType("CapabilityOverTime.diagram.CapabilityDecomposes_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapabilitySatisfies_4003 = getElementType("CapabilityOverTime.diagram.CapabilitySatisfies_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return CapOverTime.diagram.part.CapOverTimeDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CapabilityOverTime_1000,
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getCapabilityOverTime());

			elements.put(TimePeriod_2001,
					CapOverTime.CapOverTimePackage.eINSTANCE.getTimePeriod());

			elements.put(Capability_3001,
					CapOverTime.CapOverTimePackage.eINSTANCE.getCapability());

			elements.put(Measurement_3002,
					CapOverTime.CapOverTimePackage.eINSTANCE.getMeasurement());

			elements.put(QualitativeValue_3003,
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getQualitativeValue());

			elements.put(QualitativeValue_3004,
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getQualitativeValue());

			elements.put(QualitativeValue_3005,
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getQualitativeValue());

			elements.put(CapabilityAccumulation_4001,
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getCapability_Accumulation());

			elements.put(CapabilityDecomposes_4002,
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getCapability_Decomposes());

			elements.put(CapabilitySatisfies_4003,
					CapOverTime.CapOverTimePackage.eINSTANCE
							.getCapability_Satisfies());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CapabilityOverTime_1000);
			KNOWN_ELEMENT_TYPES.add(TimePeriod_2001);
			KNOWN_ELEMENT_TYPES.add(Capability_3001);
			KNOWN_ELEMENT_TYPES.add(Measurement_3002);
			KNOWN_ELEMENT_TYPES.add(QualitativeValue_3003);
			KNOWN_ELEMENT_TYPES.add(QualitativeValue_3004);
			KNOWN_ELEMENT_TYPES.add(QualitativeValue_3005);
			KNOWN_ELEMENT_TYPES.add(CapabilityAccumulation_4001);
			KNOWN_ELEMENT_TYPES.add(CapabilityDecomposes_4002);
			KNOWN_ELEMENT_TYPES.add(CapabilitySatisfies_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CapOverTime.diagram.edit.parts.CapabilityOverTimeEditPart.VISUAL_ID:
			return CapabilityOverTime_1000;
		case CapOverTime.diagram.edit.parts.TimePeriodEditPart.VISUAL_ID:
			return TimePeriod_2001;
		case CapOverTime.diagram.edit.parts.CapabilityEditPart.VISUAL_ID:
			return Capability_3001;
		case CapOverTime.diagram.edit.parts.MeasurementEditPart.VISUAL_ID:
			return Measurement_3002;
		case CapOverTime.diagram.edit.parts.QualitativeValueEditPart.VISUAL_ID:
			return QualitativeValue_3003;
		case CapOverTime.diagram.edit.parts.QualitativeValue2EditPart.VISUAL_ID:
			return QualitativeValue_3004;
		case CapOverTime.diagram.edit.parts.QualitativeValue3EditPart.VISUAL_ID:
			return QualitativeValue_3005;
		case CapOverTime.diagram.edit.parts.CapabilityAccumulationEditPart.VISUAL_ID:
			return CapabilityAccumulation_4001;
		case CapOverTime.diagram.edit.parts.CapabilityDecomposesEditPart.VISUAL_ID:
			return CapabilityDecomposes_4002;
		case CapOverTime.diagram.edit.parts.CapabilitySatisfiesEditPart.VISUAL_ID:
			return CapabilitySatisfies_4003;
		}
		return null;
	}

}
