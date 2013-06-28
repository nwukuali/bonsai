package za.ac.nwu.bonsai.form;

import org.kuali.rice.krad.web.form.UifFormBase;

import za.ac.nwu.bonsai.businessobject.LeaveApplication;

public class LeaveApplicationForm extends UifFormBase {//DocumentFormBase{

	private static final long serialVersionUID = 1L;
	
	private LeaveApplication leaveApplication;

	public LeaveApplicationForm() {
		super();
	}

	public LeaveApplicationForm(LeaveApplication leaveApplication) {
		this.leaveApplication = leaveApplication;
	}
	
	public void setLeaveApplication(LeaveApplication leaveApplication) {
		this.leaveApplication = leaveApplication;
	}

	public LeaveApplication getLeaveApplication() {
		return leaveApplication;
	}
	
	// TODO : Should return our document type as soon as it is known/available
//	@Override
//    protected String getDefaultDocumentTypeName() {
//		
//        return "bonsai.leave.application";
//    }
}
