package za.ac.nwu.bonsai.businessobject;


import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

public class LeaveApplication extends PersistableBusinessObjectBase {

	private static final long serialVersionUID = 1L;

	private long id;
	private LeaveType leaveType;
	private Date dateFrom;
	private Date dateTo;
	private String reason;
	private String contactNumber;
	private String contactAddress;
	private String personId;

	public LeaveApplication(){
		this.dateFrom = DateUtils.addDays(new Date(),1);
		this.dateTo = DateUtils.addDays(new Date(),2);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}
}
