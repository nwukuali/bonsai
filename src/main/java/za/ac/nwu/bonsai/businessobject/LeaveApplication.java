package za.ac.nwu.bonsai.businessobject;


import org.apache.commons.lang.time.DateUtils;
import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BON_LEAVE_APPS_T")
public class LeaveApplication extends PersistableBusinessObjectBase {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name = "TYPE", nullable = false)
	@Enumerated(EnumType.STRING)
	private LeaveType leaveType;

	@Column(name = "DT_FROM",nullable = false)
	private Date dateFrom;

	@Column(name = "DT_TO", nullable = false)
	private Date dateTo;

	@Column(name = "REASON", nullable = true)
	private String reason;

	@Column(name = "CONTACT_NBR", nullable = true)
	private String contactNumber;

	@Column(name = "CONTACT_ADR", nullable = true)
	private String contactAddress;

	@Column(name = "PERSON_ID")
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
}
