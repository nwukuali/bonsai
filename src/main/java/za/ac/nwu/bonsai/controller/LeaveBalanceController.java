package za.ac.nwu.bonsai.controller;

import org.kuali.rice.core.api.resourceloader.GlobalResourceLoader;
import org.kuali.rice.kim.api.identity.AuthenticationService;
import org.kuali.rice.kim.api.identity.Person;
import org.kuali.rice.kim.api.identity.PersonService;
import org.kuali.rice.krad.util.GlobalVariables;
import org.kuali.rice.krad.web.controller.UifControllerBase;
import org.kuali.rice.krad.web.form.UifFormBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import za.ac.nwu.bonsai.service.LeaveService;
import za.ac.nwu.bonsai.form.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/leavebalance")
public class LeaveBalanceController extends UifControllerBase {

	private LeaveService leaveService;
	private PersonService personService;
	private AuthenticationService authenticationService;

//	public LeaveBalanceController(LeaveService leaveService/*, PersonService personService, AuthenticationService authenticationService*/) {
//		this.leaveService = leaveService;
//		this.personService = personService;
//		this.authenticationService = authenticationService;
//	}

	public LeaveBalanceController(){
		GlobalResourceLoader.logAllContents();
		this.leaveService = GlobalResourceLoader.getService("leaveService");
	}

	@Override
	protected LeaveBalanceForm createInitialForm(HttpServletRequest request) {
//		String principalName = authenticationService.getPrincipalName(request);
//		Person person = personService.getPerson(principalName);
		Person person = GlobalVariables.getUserSession().getPerson();
		return new LeaveBalanceForm(leaveService.getLeaveBalances(person));
	}

	@Override
	@RequestMapping(params = "methodToCall=start")
	public ModelAndView start(@ModelAttribute("KualiForm") UifFormBase form, BindingResult result,
	                          HttpServletRequest request, HttpServletResponse response) {
		return super.start(form, result, request, response);
	}
}
