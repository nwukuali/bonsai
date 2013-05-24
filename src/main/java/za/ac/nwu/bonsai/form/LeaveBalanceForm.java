package za.ac.nwu.bonsai.form;

import org.kuali.rice.krad.web.form.UifFormBase;
import za.ac.nwu.bonsai.businessobject.LeaveBalance;

import java.util.ArrayList;
import java.util.List;

public class LeaveBalanceForm extends UifFormBase{

	private List<LeaveBalance> leaveBalances = new ArrayList<LeaveBalance>();

	public LeaveBalanceForm(List<LeaveBalance> leaveBalances){
		this.leaveBalances = leaveBalances;
	}

	public List<LeaveBalance> getLeaveBalances() {
		return leaveBalances;
	}

}
