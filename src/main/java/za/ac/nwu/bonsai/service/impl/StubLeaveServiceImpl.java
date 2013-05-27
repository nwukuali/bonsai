package za.ac.nwu.bonsai.service.impl;

import org.kuali.rice.kim.api.identity.Person;
import org.springframework.stereotype.Service;
import za.ac.nwu.bonsai.businessobject.LeaveBalance;
import za.ac.nwu.bonsai.businessobject.LeaveType;
import za.ac.nwu.bonsai.service.LeaveService;

import java.util.ArrayList;
import java.util.List;

//Temporary stub service until we have ws to HR in place
@Service(value = "leaveService")
public class StubLeaveServiceImpl implements LeaveService{


	public StubLeaveServiceImpl(){
		System.out.println("HEREE!~!!!!!!!!!!!!!!");
	}

	@Override
	public List<LeaveBalance> getLeaveBalances(Person person) {
		List<LeaveBalance> result = retrieveLeaveBalancesFromTempTable(person);
		return result;
	}

	private List<LeaveBalance> retrieveLeaveBalancesFromTempTable(Person person) {
		//TODO: Read leave balances from a temp imported table - consider spring jdbc template
		List<LeaveBalance> balances = new ArrayList<LeaveBalance>();
		balances.add(createTempLeaveBalance(LeaveType.ANNUAL,10,20,30,40));
		balances.add(createTempLeaveBalance(LeaveType.SICK,10,20,30,40));
		balances.add(createTempLeaveBalance(LeaveType.STUDY,3.5,2.6,3,2.1));
		return balances;
	}

	private LeaveBalance createTempLeaveBalance(LeaveType type, double cycleDateBalanceToDate, double cycleDaysTakenToDate, double endOfCycleDaysBalance, double fullCyclesDays) {
		LeaveBalance balance = new LeaveBalance();
		balance.setType(type);
		balance.setCycleDaysBalanceToDate(cycleDateBalanceToDate);
		balance.setCycleDaysTakenToDate(cycleDaysTakenToDate);
		balance.setEndOfCycleDaysBalance(endOfCycleDaysBalance);
		balance.setFullCycleDays(fullCyclesDays);
		return balance;
	}
}
