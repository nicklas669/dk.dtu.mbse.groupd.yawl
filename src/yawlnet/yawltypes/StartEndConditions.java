package yawlnet.yawltypes;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

/**
 * This is a constraint saying that a YAWL net should have exactly one start place and one
 * end place.
 *
 * @author Nicklas Hansen & Emil Hvid
 * Inspiration from ekki@dtu.dk
 * @generated NOT
 */
public class StartEndConditions extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();
		if (object instanceof YAWLnet) {
			EObject container = object.eContainer();
			if (container instanceof PetriNet) {
				int startCount = 0;
				int endCount = 0;
				boolean startHasArcs = false, endHasArcs = false;
				Iterator<EObject> iterator = container.eAllContents();
				while (iterator.hasNext()) {
					EObject content = iterator.next();

					// TODO count number of places that are start places
					//      and number of places that are end places
					
					// Check if content is instance of Place
					if (content instanceof Place) {
						// Convert content to Place
						Place place = (Place) content;
						// Check type of Place
						PlaceType placetype = place.getType();
						if (placetype != null) {
							switch (placetype.getText().getValue()) {
							// If Place's type is start or end, increment counter for it
							case PlaceTypes.END_VALUE:
								endCount++;
								// If end place has any outgoing arcs
								if (place.getOut().size() > 0) endHasArcs = true;
								break;
							case PlaceTypes.START_VALUE:
								startCount++;
								// If start place has any incoming arcs
								if (place.getIn().size() > 0) startHasArcs = true;
								break;
							}
						}
					}
				}
				if (startCount != 1 || endCount != 1) {
					// if there is not exactly one start place and exactly one
					// end place, return a failure status.
					return ctx.createFailureStatus("The YAWL net "+(new Object[] {container})+" does not have exactly one start place and one end place.");
					//return ctx.createFailureStatus(new Object[] {container});
					//return ctx.create
					
				}
				
				if (endHasArcs)	return ctx.createFailureStatus("An end place has output Arcs!");
				if (startHasArcs) return ctx.createFailureStatus("A start place has input Arcs!");
				
			}

		} 
		// otherwise return a success status
		return ctx.createSuccessStatus();
	}

}
