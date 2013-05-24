package za.ac.nwu.bonsai.businessobject;

import org.kuali.rice.kim.api.identity.Person;

public class LeaveBalance {

	private LeaveType type;
	private double fullCycleDays;
	private double cycleDaysBalanceToDate;
	private double cycleDaysTakenToDate;
	private double endOfCycleDaysBalance;

	public LeaveType getType() {
		return type;
	}

	public void setType(LeaveType type) {
		this.type = type;
	}

	public double getFullCycleDays() {
		return fullCycleDays;
	}

	public void setFullCycleDays(double fullCycleDays) {
		this.fullCycleDays = fullCycleDays;
	}

	public double getCycleDaysBalanceToDate() {
		return cycleDaysBalanceToDate;
	}

	public void setCycleDaysBalanceToDate(double cycleDaysBalanceToDate) {
		this.cycleDaysBalanceToDate = cycleDaysBalanceToDate;
	}

	public double getCycleDaysTakenToDate() {
		return cycleDaysTakenToDate;
	}

	public void setCycleDaysTakenToDate(double cycleDaysTakenToDate) {
		this.cycleDaysTakenToDate = cycleDaysTakenToDate;
	}

	public double getEndOfCycleDaysBalance() {
		return endOfCycleDaysBalance;
	}

	public void setEndOfCycleDaysBalance(double endOfCycleDaysBalance) {
		this.endOfCycleDaysBalance = endOfCycleDaysBalance;
	}

}
