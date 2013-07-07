package za.ac.nwu.bonsai.service;

import org.kuali.rice.kim.api.identity.Person;
import za.ac.nwu.bonsai.businessobject.LeaveApplication;
import za.ac.nwu.bonsai.businessobject.LeaveBalance;
import za.ac.nwu.bonsai.businessobject.LeaveTransaction;

import java.io.File;
import java.util.Date;
import java.util.List;

public interface LeaveService {

	List<LeaveBalance> getLeaveBalances(Person person);

    List<LeaveTransaction> getLeaveTransactionsForCurrentYear(Person person);

	List<LeaveTransaction> getLeaveTransactions(Person person, Date fromDate, Date toDate);

	File generateLeaveApplicationHardCopy(LeaveApplication leaveApplication);


}
