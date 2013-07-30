package za.ac.nwu.bonsai.kew.resolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kuali.rice.kew.actionrequest.ActionRequestValue;
import org.kuali.rice.kew.engine.RouteContext;
import org.kuali.rice.kns.workflow.attribute.QualifierResolverBase;

/*
 * This resolver gets the applicants id from the document and adds
 *  it to the qualifier which is fed to the ParentGroupDerivedRoleService
 */

public class NotificationPrinciplesResolver extends QualifierResolverBase {

	@Override
	public List<Map<String, String>> resolve(RouteContext context) {
		List<Map<String, String>> qualifiers = new ArrayList<Map<String, String>>();

		Map<String, String> qualifier = new HashMap<String, String>();
		
		String principleIds = context.getRouteHeader().getRoutedByPrincipalId();
		
		List<ActionRequestValue> actionRequestValues = context.getRouteHeader().getActionRequests();
		
		for (ActionRequestValue actionRequestValue : actionRequestValues) {
			if (actionRequestValue.getActionTaken().isApproval()) {
				principleIds = principleIds + ";" + actionRequestValue.getPrincipalId();
			}
		}
		
		qualifier.put("principleIds", principleIds);
		
		qualifiers.add(qualifier);

		return qualifiers;
	}

}
