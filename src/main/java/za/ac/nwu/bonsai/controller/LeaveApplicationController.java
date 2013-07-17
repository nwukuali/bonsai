package za.ac.nwu.bonsai.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kuali.rice.krad.web.controller.TransactionalDocumentControllerBase;
import org.kuali.rice.krad.web.form.UifFormBase;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import za.ac.nwu.bonsai.form.LeaveApplicationForm;

//http://localhost:8080/bonsai/mvc/leaveApplication?viewId=LeaveApplicationView&methodToCall=docHandler&command=initiate

@Controller
@RequestMapping(value = "/leaveApplication")
public class LeaveApplicationController extends TransactionalDocumentControllerBase {

	@Override
	protected LeaveApplicationForm createInitialForm(HttpServletRequest request) {
		return new LeaveApplicationForm();
	}

	@Override
	@RequestMapping(params = "methodToCall=start")
	public ModelAndView start(@ModelAttribute("KualiForm") UifFormBase form, BindingResult result,
	                          HttpServletRequest request, HttpServletResponse response) {
		
		return getUIFModelAndView(form);		
		
//		Temporarily short out permission checks
//		return super.start(form, result, request, response);
	}


}
