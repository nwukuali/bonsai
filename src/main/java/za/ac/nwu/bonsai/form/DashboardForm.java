package za.ac.nwu.bonsai.form;

import org.kuali.rice.krad.web.form.UifFormBase;
import za.ac.nwu.bonsai.businessobject.LeaveBalance;
import za.ac.nwu.bonsai.businessobject.LeaveTransaction;
import za.ac.nwu.bonsai.util.ActionListWrapper;

import java.util.ArrayList;
import java.util.List;

public class DashboardForm extends UifFormBase{

    private LeaveBalanceForm leaveBalanceForm;
    private LeaveTransactionForm leaveTransactionForm;

    private List<ActionListWrapper> actionList;

    public DashboardForm() {
        super();
    }

    public DashboardForm(LeaveBalanceForm leaveBalanceForm, LeaveTransactionForm leaveTransactionForm) {
        super();
        this.leaveBalanceForm = leaveBalanceForm;
        this.leaveTransactionForm = leaveTransactionForm;
        this.actionList = new ArrayList<ActionListWrapper>();
    }

    public List<LeaveBalance> getLeaveBalances() {
        return leaveBalanceForm.getLeaveBalances();
    }

    public List<LeaveTransaction> getTransactions() {
        return leaveTransactionForm.getTransactions();
    }

    public List<ActionListWrapper> getActionList() {
        return actionList;
    }

    public void setActionList(List<ActionListWrapper> actionList) {
        this.actionList = actionList;
    }
}


