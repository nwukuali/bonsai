package za.ac.nwu.bonsai.form;

import org.kuali.rice.krad.web.form.UifFormBase;
import za.ac.nwu.bonsai.businessobject.LeaveBalance;
import za.ac.nwu.bonsai.businessobject.LeaveTransaction;

import java.util.List;

public class DashboardForm extends UifFormBase{

    private LeaveBalanceForm leaveBalanceForm;
    private LeaveTransactionForm leaveTransactionForm;

    public DashboardForm(LeaveBalanceForm leaveBalanceForm, LeaveTransactionForm leaveTransactionForm) {
        super();
        this.leaveBalanceForm = leaveBalanceForm;
        this.leaveTransactionForm = leaveTransactionForm;
    }

    public List<LeaveBalance> getLeaveBalances() {
        return leaveBalanceForm.getLeaveBalances();
    }

    public List<LeaveTransaction> getTransactions() {
        return leaveTransactionForm.getTransactions();
    }
}
