package za.ac.nwu.bonsai.form;

import org.kuali.rice.krad.web.form.UifFormBase;
import za.ac.nwu.bonsai.businessobject.LeaveApplication;

public class LeaveApplicationForm extends UifFormBase{

	private LeaveApplication leaveApplication;

	public LeaveApplicationForm(LeaveApplication leaveApplication) {
		this.leaveApplication = leaveApplication;
	}

	public LeaveApplication getLeaveApplication() {
		return leaveApplication;
	}
}
