package za.ac.nwu.bonsai.businessobject;

import java.util.Date;

public class LeaveTransaction {

    private LeaveType type;
    private Date fromDate;
    private Date toDate;
    private int totalDays;

    private LeaveTransaction() {
    }

    public LeaveType getType() {
        return type;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public static class LeaveTransactionBuilder {

        private LeaveTransaction leaveTransaction;

        public LeaveTransactionBuilder() {
            this.leaveTransaction = new LeaveTransaction();
        }

        public LeaveTransactionBuilder withType(LeaveType leaveType) {
            this.leaveTransaction.type = leaveType;
            return this;
        }

        public LeaveTransactionBuilder from(Date fromDate) {
            this.leaveTransaction.fromDate = fromDate;
            return this;
        }

        public LeaveTransactionBuilder to(Date toDate) {
            this.leaveTransaction.toDate = toDate;
            return this;
        }

        public LeaveTransactionBuilder days(int numberOfDays) {
            this.leaveTransaction.totalDays = numberOfDays;
            return this;
        }

        public LeaveTransaction build() {
            if (leaveTransaction.getType() == null || leaveTransaction.getFromDate() == null || leaveTransaction.getToDate() == null || leaveTransaction.getTotalDays() == -1) {
                throw new IllegalStateException("Leave transaction not properly built!");
            }
            return this.leaveTransaction;
        }

    }
}


