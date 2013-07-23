package za.ac.nwu.bonsai.form;

import org.kuali.rice.krad.web.form.TransactionalDocumentFormBase;

import za.ac.nwu.bonsai.businessobject.LeaveApplication;

public class LeaveApplicationForm extends TransactionalDocumentFormBase {

	private static final long serialVersionUID = 1L;
	
	private LeaveApplication leaveApplication;

	public LeaveApplicationForm() {
		super();
	}
	
	@Override
    protected String getDefaultDocumentTypeName() {
        return "LeaveApplicationDocumentType";
    }

	public LeaveApplication getLeaveApplication() {
		return leaveApplication;
	}

	public void setLeaveApplication(LeaveApplication leaveApplication) {
		this.leaveApplication = leaveApplication;
	}
	
}
