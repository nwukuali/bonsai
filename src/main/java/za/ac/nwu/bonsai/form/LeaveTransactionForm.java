package za.ac.nwu.bonsai.form;

import org.kuali.rice.krad.web.form.UifFormBase;
import za.ac.nwu.bonsai.businessobject.LeaveTransaction;

import java.util.ArrayList;
import java.util.List;

public class LeaveTransactionForm extends UifFormBase{

	private List<LeaveTransaction> transactions = new ArrayList<LeaveTransaction>();

    public LeaveTransactionForm(List<LeaveTransaction> transactions) {
        this.transactions = transactions;
    }

    public List<LeaveTransaction> getTransactions() {
        return transactions;
    }

}
