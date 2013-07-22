package za.ac.nwu.bonsai.document;

import org.kuali.rice.krad.document.TransactionalDocumentBase;
import za.ac.nwu.bonsai.businessobject.LeaveApplication;

public class LeaveApplicationDocument extends TransactionalDocumentBase {

	private static final long serialVersionUID = 1L;
	
	private Long leaveApplicationId;
	private LeaveApplication leaveApplication;
	
	public LeaveApplicationDocument() {
		super();
	}

	public LeaveApplicationDocument(LeaveApplication leaveApplication) {
		this.leaveApplication = leaveApplication;
	}
	
	public void setLeaveApplication(LeaveApplication leaveApplication) {
		this.leaveApplication = leaveApplication;
	}

	public LeaveApplication getLeaveApplication() {
		return leaveApplication;
	}

	public Long getLeaveApplicationId() {
		return leaveApplicationId;
	}

	public void setLeaveApplicationId(Long leaveApplicationId) {
		this.leaveApplicationId = leaveApplicationId;
	}
}