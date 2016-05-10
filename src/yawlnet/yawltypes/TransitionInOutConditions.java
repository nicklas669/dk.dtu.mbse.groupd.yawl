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
 * This is a constraint saying that transitions in our YAWL net should have at least 1 input and at at least 1 output arc.
 *
 * @author Nicklas Hansen & Emil Hvid
 * @generated NOT
 */
public class TransitionInOutConditions extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();
		boolean inTooSmall = false, outTooSmall = false;
		String id = "";
		
		if (object instanceof YAWLnet) {
			EObject container = object.eContainer();
			if (container instanceof PetriNet) {
				Iterator<EObject> iterator = container.eAllContents();
				while (iterator.hasNext()) {
					EObject content = iterator.next();
					
					// Check if content is instance of Transition
					if (content instanceof Transition) {
						// Convert content to Transition
						Transition trans = (Transition) content;
						if (!(trans.getIn().size() >= 1)) {
							id = trans.getId();
							inTooSmall = true;
						}
						else if (!(trans.getOut().size() >= 1)) outTooSmall = true;
					}
				}
			}
		}
		if (inTooSmall)	return ctx.createFailureStatus("A transition ("+id+") does not have at least 1 input Arc!");
		if (outTooSmall) return ctx.createFailureStatus("A transition ("+id+") does not have at least 1 output Arc!");
		// otherwise return a success status
		
		return ctx.createSuccessStatus();
	}

}
