package za.ac.nwu.bonsai.service;

import java.util.List;

import za.ac.nwu.bonsai.businessobject.Holiday;

public interface HolidayMaintenanceService {

	public void createHoliday(Holiday holiday);

	public List<Holiday> getHolidays();

	public void updateHoliday(Holiday holiday);
	
	public void deleteHoliday(Holiday holiday);


}
