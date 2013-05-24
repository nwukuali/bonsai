package za.ac.nwu.bonsai.service;

import org.kuali.rice.kim.api.identity.Person;
import za.ac.nwu.bonsai.businessobject.LeaveBalance;

import java.util.List;

public interface LeaveService {

	List<LeaveBalance> getLeaveBalances(Person person);

//	List<LeaveTransactions> getLeaveTransactions(Person person, Date from, Date to);


}
