package za.ac.nwu.bonsai.util;


import org.joda.time.DateTime;
import org.kuali.rice.kim.api.identity.Person;
import za.ac.nwu.bonsai.businessobject.LeaveApplication;

public class LeaveApplicationHardCopy {

	public static final String INITIALS_AND_SURNAME = "initialsAndSurname";
	public static final String DEPARTMENT = "department";
	public static final String BUS_NUMBER = "busNumber";


	public static final String EMPLOYEE_NUMBER = "employeeNumber";

	private String initialsAndSurname;
	private String department;
	private String busNumber;
	private String extension;
	private String employeeNumber;
	private String typeOfLeave;
	private String dayFrom;
	private String monthFrom;
	private String yearFrom;
	private String dayTo;
	private String monthTo;
	private String yearTo;
	private String numberOfDays;
	private String reason;
	private String address;
	private String contactNumber;
	private String backupYes;
	private String backupNo;
	private String backupNotApplicable;

	public LeaveApplicationHardCopy(Person person, LeaveApplication leaveApplication){
		this.initialsAndSurname = person.getLastNameUnmasked();
		this.department = "ITC-BSS";
		this.busNumber = "52";
		this.extension = "x4670";
		this.employeeNumber = person.getEmployeeId();
		this.typeOfLeave = leaveApplication.getLeaveType().getName();
		DateTime fromDate = new DateTime(leaveApplication.getDateFrom());
		this.dayFrom = fromDate.toString("dd");
		this.monthFrom = fromDate.toString("MMM");
		this.yearFrom = fromDate.toString("yyyy");
		DateTime toDate = new DateTime(leaveApplication.getDateTo());
		this.dayTo = toDate.toString("dd");
		this.monthTo = toDate.toString("MMM");
		this.yearTo = toDate.toString("yyyy");
	}


	public String getInitialsAndSurname() {
		return initialsAndSurname;
	}

	public String getDepartment() {
		return department;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public String getExtension() {
		return extension;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public String getTypeOfLeave() {
		return typeOfLeave;
	}

	public String getDayFrom() {
		return dayFrom;
	}

	public String getMonthFrom() {
		return monthFrom;
	}

	public String getYearFrom() {
		return yearFrom;
	}

	public String getDayTo() {
		return dayTo;
	}

	public String getMonthTo() {
		return monthTo;
	}

	public String getYearTo() {
		return yearTo;
	}

	public String getNumberOfDays() {
		return numberOfDays;
	}

	public String getReason() {
		return reason;
	}

	public String getAddress() {
		return address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getBackupYes() {
		return backupYes;
	}

	public String getBackupNo() {
		return backupNo;
	}

	public String getBackupNotApplicable() {
		return backupNotApplicable;
	}
}
