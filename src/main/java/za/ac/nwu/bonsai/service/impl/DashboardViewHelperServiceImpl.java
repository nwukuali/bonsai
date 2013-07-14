package za.ac.nwu.bonsai.service.impl;

import org.kuali.rice.core.api.resourceloader.GlobalResourceLoader;
import org.kuali.rice.kew.api.KewApiConstants;
import org.kuali.rice.kew.api.action.ActionItem;
import org.kuali.rice.kew.api.actionlist.ActionListService;
import org.kuali.rice.kew.api.document.Document;
import org.kuali.rice.kew.api.document.WorkflowDocumentService;
import org.kuali.rice.kim.api.identity.Person;
import org.kuali.rice.krad.uif.service.impl.ViewHelperServiceImpl;
import za.ac.nwu.bonsai.form.DashboardForm;
import za.ac.nwu.bonsai.util.ActionListWrapper;

import javax.xml.namespace.QName;
import java.util.List;

public class DashboardViewHelperServiceImpl extends ViewHelperServiceImpl {

    private ActionListService actionListService;
    private WorkflowDocumentService workflowDocumentService;

    public void populateActionListForUser(DashboardForm form, Person person) {
        ActionListWrapper actionListWrapper = new ActionListWrapper();

        List<ActionItem> actionItems = getActionListService().getActionItemsForPrincipal(person.getPrincipalId());

        if(actionItems != null) {
            for(ActionItem actionItem : actionItems) {
                //Populate actionListWrapper with each actionItem details
                Document document = getWorkflowDocumentService().getDocument(actionItem.getDocumentId());
                actionListWrapper.setRequestingUserId(document.getInitiatorPrincipalId());
                actionListWrapper.setDetails("<b>Name:</b> Chuck Norris  <b>Leave Dates:</b> 1900-01-01 to 2100-01-12");
                actionListWrapper.setDocumentId(actionItem.getDocumentId());
            }
        }

        actionListWrapper.setDetails("<b>Name:</b> Chuck Norris  <b>Leave Dates:</b> 1900-01-01 to 2100-01-12");
        actionListWrapper.setDocumentId("3016");

        form.getActionList().add(actionListWrapper);
    }

    private ActionListService getActionListService() {
        if (actionListService == null) {
            actionListService = (ActionListService) GlobalResourceLoader.getService(new QName(KewApiConstants.Namespaces.KEW_NAMESPACE_2_0, "actionListService"));
        }
        return actionListService;
    }

    private WorkflowDocumentService getWorkflowDocumentService() {
        if (workflowDocumentService == null) {
            workflowDocumentService = (WorkflowDocumentService) GlobalResourceLoader.getService(new QName(KewApiConstants.Namespaces.KEW_NAMESPACE_2_0, "workflowDocumentService"));
        }
        return workflowDocumentService;
    }

}
