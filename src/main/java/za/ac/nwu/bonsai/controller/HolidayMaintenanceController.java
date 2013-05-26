package za.ac.nwu.bonsai.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kuali.rice.krad.uif.UifParameters;
import org.kuali.rice.krad.uif.container.CollectionGroup;
import org.kuali.rice.krad.uif.util.ObjectPropertyUtils;
import org.kuali.rice.krad.web.controller.UifControllerBase;
import org.kuali.rice.krad.web.form.UifFormBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import za.ac.nwu.bonsai.businessobject.Holiday;
import za.ac.nwu.bonsai.form.HolidayMaintenanceForm;
import za.ac.nwu.bonsai.service.HolidayMaintenanceService;

//http://localhost:8080/bonsai/mvc/holidayMaintenance?viewId=HolidayFormView&methodToCall=start

@Controller
@RequestMapping(value = "/holidayMaintenance")
public class HolidayMaintenanceController extends UifControllerBase {

	@Autowired
	private HolidayMaintenanceService maintenanceService ;
	
	@Override
	protected HolidayMaintenanceForm createInitialForm(HttpServletRequest request) {
		return new HolidayMaintenanceForm();
	}
	
	@Override
	@RequestMapping(params = "methodToCall=start")
	public ModelAndView start(@ModelAttribute("KualiForm") UifFormBase form, BindingResult result,
	                          HttpServletRequest request, HttpServletResponse response) {
		
		((HolidayMaintenanceForm)form).setHolidayList(maintenanceService.getHolidays());
		
		return super.start(form, result, request, response);
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, params = "methodToCall=addLine")
	public ModelAndView addLine(@ModelAttribute("KualiForm") UifFormBase uifForm,
								BindingResult result, HttpServletRequest request,
								HttpServletResponse response) {
		
		Map<String, Object> newHolidays = uifForm.getNewCollectionLines();
		
		for (Map.Entry<String, Object> entry : newHolidays.entrySet()) {
			Holiday holiday = (Holiday) entry.getValue();
			maintenanceService.createHoliday(holiday);
		}
		

		return super.addLine(uifForm, result, request, response);
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, params = "methodToCall=saveLine")
    public ModelAndView saveLine(@ModelAttribute("KualiForm") UifFormBase uifForm, BindingResult result,
            HttpServletRequest request, HttpServletResponse response) {

		String selectedCollectionPath = uifForm.getActionParamaterValue(UifParameters.SELLECTED_COLLECTION_PATH);
		String selectedLine = uifForm.getActionParamaterValue(UifParameters.SELECTED_LINE_INDEX);
		
		Collection<Object> collection = ObjectPropertyUtils.getPropertyValue(uifForm, selectedCollectionPath);
		Object saveLine = ((List<Object>) collection).get(Integer.parseInt(selectedLine));
		
		maintenanceService.updateHoliday((Holiday) saveLine);
		
        return super.saveLine(uifForm, result, request, response);
    }
	
	@Override
	@RequestMapping(method = RequestMethod.POST, params = "methodToCall=deleteLine")
    public ModelAndView deleteLine(@ModelAttribute("KualiForm") UifFormBase uifForm, BindingResult result,
            HttpServletRequest request, HttpServletResponse response) {
		
		String selectedCollectionPath = uifForm.getActionParamaterValue(UifParameters.SELLECTED_COLLECTION_PATH);
		String selectedLine = uifForm.getActionParamaterValue(UifParameters.SELECTED_LINE_INDEX);
		
		Collection<Object> collection = ObjectPropertyUtils.getPropertyValue(uifForm, selectedCollectionPath);
		Object deleteLine = ((List<Object>) collection).get(Integer.parseInt(selectedLine));
		
		maintenanceService.deleteHoliday((Holiday) deleteLine);

        return super.deleteLine(uifForm, result, request, response);
    }

}
