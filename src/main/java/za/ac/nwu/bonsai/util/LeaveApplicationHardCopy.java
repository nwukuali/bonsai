package za.ac.nwu.bonsai.util;


import org.joda.time.DateTime;
import org.kuali.rice.kim.api.identity.Person;
import org.kuali.rice.kim.api.identity.PersonService;
import org.kuali.rice.kim.api.services.KimApiServiceLocator;
import za.ac.nwu.bonsai.businessobject.LeaveApplication;
import za.ac.nwu.bonsai.document.LeaveApplicationDocument;

public class LeaveApplicationHardCopy {

	public static final String INITIALS_AND_SURNAME = "initialsAndSurname";
	public static final String DEPARTMENT = "department";
	public static final String BUS_NUMBER = "busNumber";
	public static final String EXTENSION = "extension";
	public static final String EMPLOYEE_NUMBER = "employeeNumber";
	public static final String TYPE_OF_LEAVE = "typeOfLeave";
	public static final String DAY_FROM = "dayFrom";
	public static final String MONTH_FROM = "monthFrom";
	public static final String YEAR_FROM = "yearFrom";
	public static final String DAY_TO = "dayTo";
	public static final String MONTH_TO = "monthTo";
	public static final String YEAR_TO = "yearTo";
	public static final String NUMBER_OF_DAYS = "numberOfDays";
	public static final String REASON = "reason";
	public static final String CONTACT_ADDRESS = "contactAddress";
	public static final String CONTACT_NUMBER = "contactNumber";
	public static final String BACKUP_YES = "backupYes";
	public static final String BACKUP_NO = "backupNo";
	public static final String BACKUP_NOT_APPLICABLE = "backupNotApplicable";
	public static final String DOCUMENT_NUMBER = "documentNumber";
	public static final String APPLICATION_DATE = "applicationDate";
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
	private String contactAddress;
	private String contactNumber;
	private String backupYes;
	private String backupNo;
	private String backupNotApplicable;
	private String documentNumber;
	private String applicationDate;
	//Aux service required to retireve relevant info
	private PersonService personService;

	public LeaveApplicationHardCopy(LeaveApplicationDocument document) {
		this(null, document);
	}

	//TO BE USED FOR TESTING PURPOSES ONLY
	LeaveApplicationHardCopy(PersonService personService, LeaveApplicationDocument leaveApplicationDocument) {
		this.personService = personService;

		LeaveApplication leaveApplication = leaveApplicationDocument.getLeaveApplication();
		Person applicant = getApplicant(leaveApplicationDocument);
		this.initialsAndSurname = String.format("%s %s", generateInitials(applicant), applicant.getLastNameUnmasked());
		this.department = "ITC-BSS";
		this.busNumber = "52";
		this.extension = "x4670";
		this.employeeNumber = applicant.getEmployeeId();
		this.typeOfLeave = leaveApplication.getLeaveType().getName();
		DateTime fromDate = new DateTime(leaveApplication.getDateFrom());
		this.dayFrom = fromDate.toString("dd");
		this.monthFrom = fromDate.toString("MMM");
		this.yearFrom = fromDate.toString("yyyy");
		DateTime toDate = new DateTime(leaveApplication.getDateTo());
		this.dayTo = toDate.toString("dd");
		this.monthTo = toDate.toString("MMM");
		this.yearTo = toDate.toString("yyyy");
		//todo: numberOfDays
		this.numberOfDays = "10";
		this.reason = leaveApplication.getReason();
		this.contactAddress = leaveApplication.getContactAddress();
		this.contactNumber = leaveApplication.getContactNumber();
		//todo: Backup????
//		this.backupYes = "X";
//		this.backupNo = "X";
//		this.backupNotApplicable = "X";
		//todo: doc #
		this.documentNumber = leaveApplicationDocument.getDocumentNumber();
		//todo: application date
//		this.applicationDate = getDate(document);
	}

	private Person getApplicant(LeaveApplicationDocument leaveApplicationDocument) {
		//todo: find initiator
		String principalId = leaveApplicationDocument.getDocumentHeader().getWorkflowDocument().getPrincipalId();
		return getPersonService().getPerson(principalId);
	}

	private String generateInitials(Person person) {
		StringBuilder result = new StringBuilder();
		if (person.getFirstNameUnmasked() != null){
			result.append(person.getFirstNameUnmasked().substring(0, 1));
		}
		if (person.getMiddleNameUnmasked() != null){
			result.append(person.getMiddleNameUnmasked().substring(0, 1));
		}
		return result.toString();
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

	public String getContactAddress() {
		return contactAddress;
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

	public String getDocumentNumber() {
		return documentNumber;
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	private PersonService getPersonService() {
		if (personService == null) {
			personService = KimApiServiceLocator.getPersonService();
		}
		return personService;
	}



}
