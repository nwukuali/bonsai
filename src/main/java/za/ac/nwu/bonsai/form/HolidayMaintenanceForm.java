package za.ac.nwu.bonsai.form;

import java.util.ArrayList;
import java.util.List;

import org.kuali.rice.krad.web.form.UifFormBase;

import za.ac.nwu.bonsai.businessobject.Holiday;

public class HolidayMaintenanceForm extends UifFormBase {
	
    private static final long serialVersionUID = -7525378097732916418L;

	private List<Holiday> holidayList = new ArrayList<Holiday>();
    
    public HolidayMaintenanceForm() {
        super();    
        
//        Date date1 = new Date(2013,1,1);
//        Date date2 = new Date(2013,1,1);
//        Date date3 = new Date(2013,1,1);
//        
//		holidayList.add(new Holiday("name1", date1, HolidayType.NWU, "description1"));
//        holidayList.add(new Holiday("name2", date2, HolidayType.PUBLIC, "description2"));
//        holidayList.add(new Holiday("name3", date3, HolidayType.NWU, "description554"));
//        
//        System.out.println("\n\n\nYYZXXAAAAAAAAa\n\n\n");
        
    }

    public List<Holiday> getHolidayList() {
		return holidayList;
	}

	public void setHolidayList(List<Holiday> holidayList) {
		this.holidayList = holidayList;
	}
	
}
