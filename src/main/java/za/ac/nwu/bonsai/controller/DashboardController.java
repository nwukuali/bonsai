package za.ac.nwu.bonsai.controller;

import org.kuali.rice.kim.api.identity.Person;
import org.kuali.rice.krad.uif.service.ViewHelperService;
import org.kuali.rice.krad.util.GlobalVariables;
import org.kuali.rice.krad.web.controller.UifControllerBase;
import org.kuali.rice.krad.web.form.UifFormBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import za.ac.nwu.bonsai.form.DashboardForm;
import za.ac.nwu.bonsai.form.LeaveBalanceForm;
import za.ac.nwu.bonsai.form.LeaveTransactionForm;
import za.ac.nwu.bonsai.service.LeaveService;
import za.ac.nwu.bonsai.service.impl.DashboardViewHelperServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/dashboard")
public class DashboardController extends UifControllerBase {

	@Autowired
	private LeaveService leaveService;

    private Person person;

	@Override
	protected DashboardForm createInitialForm(HttpServletRequest request) {
        person = GlobalVariables.getUserSession().getPerson();

        LeaveBalanceForm leaveBalanceForm = new LeaveBalanceForm(leaveService.getLeaveBalances(person));
        LeaveTransactionForm leaveTransactionForm = new LeaveTransactionForm(leaveService.getLeaveTransactionsForCurrentYear(person));

        DashboardForm dashboardForm = new DashboardForm(leaveBalanceForm, leaveTransactionForm);

		return dashboardForm;
	}

	@Override
	@RequestMapping(params = "methodToCall=start")
	public ModelAndView start(@ModelAttribute("KualiForm") UifFormBase form, BindingResult result,
	                          HttpServletRequest request, HttpServletResponse response) {
        ((DashboardViewHelperServiceImpl) form.getView().getViewHelperService()).populateActionListForUser((DashboardForm) form, person);

		return super.start(form, result, request, response);
	}

    @RequestMapping(params = "methodToCall=showDocumentDialog")
    public ModelAndView showDocumentDialog(@ModelAttribute("KualiForm") UifFormBase form, BindingResult result,
                              HttpServletRequest request, HttpServletResponse response) {
        String dialogId = "showDocumentDialog";
        if(!hasDialogBeenDisplayed(dialogId, form)) {
            return showDialog(dialogId, form, request, response);
        }
        form.getDialogManager().removeAllDialogs();
        return getUIFModelAndView(form);
    }
}
