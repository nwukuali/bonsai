package za.ac.nwu.bonsai.kew.resolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kuali.rice.kew.actionrequest.ActionRequestValue;
import org.kuali.rice.kew.engine.RouteContext;
import org.kuali.rice.kns.workflow.attribute.QualifierResolverBase;

import za.ac.nwu.bonsai.document.LeaveApplicationDocument;

/*
 * This resolver gets the applicants id from the document and adds
 *  it to the qualifier which is fed to the ParentGroupDerivedRoleService
 */

public class ResponsiblePersonResolver extends QualifierResolverBase {

	@Override
	public List<Map<String, String>> resolve(RouteContext context) {
		List<Map<String, String>> qualifiers = new ArrayList<Map<String, String>>();
		Map<String, String> qualifier = new HashMap<String, String>();
		
		LeaveApplicationDocument document = (LeaveApplicationDocument) getDocument(context);
		
		int currLevel = 0;
		String principleId = "";
		
		List<ActionRequestValue> actionRequestValues = context.getRouteHeader().getActionRequests();
		
		for (ActionRequestValue actionRequestValue : actionRequestValues) {
			int level = actionRequestValue.getRouteLevel();
			if ((level >= currLevel) && actionRequestValue.getActionTaken().isApproval()) {
				principleId = actionRequestValue.getPrincipalId();
				currLevel = level;
			}
		}
				
		if (principleId == null || principleId.isEmpty()) {
			principleId = document.getDocumentHeader().getWorkflowDocument().getRoutedByPrincipalId();
		}
		
		qualifier.put("principleId", principleId);
		
		qualifiers.add(qualifier);

		return qualifiers;
	}

}
