package za.ac.nwu.bonsai.document;

import org.kuali.rice.krad.document.TransactionalDocumentBase;
import za.ac.nwu.bonsai.businessobject.LeaveApplication;

public class LeaveApplicationDocument extends TransactionalDocumentBase {

	private LeaveApplication leaveApplication;

	public LeaveApplicationDocument(LeaveApplication leaveApplication) {
		this.leaveApplication = leaveApplication;
	}

	public LeaveApplication getLeaveApplication() {
		return leaveApplication;
	}
}