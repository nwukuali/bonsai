package za.ac.nwu.bonsai.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kuali.rice.krad.web.controller.MaintenanceDocumentController;
import org.kuali.rice.krad.web.form.UifFormBase;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:8080/bonsai/mvc/holidayMaintenance?viewId=HolidayFormView&methodToCall=start

@Controller
@RequestMapping(value = "/holidayMaintenance")
public class HolidayMaintenanceController extends MaintenanceDocumentController {
	
	@Override
	@RequestMapping(params = "methodToCall=start")
	public ModelAndView start(@ModelAttribute("KualiForm") UifFormBase form, BindingResult result,
	                          HttpServletRequest request, HttpServletResponse response) {
		
		return super.start(form, result, request, response);
	}

}
