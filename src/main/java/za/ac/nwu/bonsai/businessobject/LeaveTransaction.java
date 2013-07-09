package za.ac.nwu.bonsai.businessobject;

import java.util.Date;

public class LeaveTransaction {

    private LeaveType type;
    private Date fromDate;
    private Date toDate;
    private double totalDays;

    public LeaveTransaction() {
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

    public double getTotalDays() {
        return totalDays;
    }

    public void setType(LeaveType type) {
        this.type = type;
    }


    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setTotalDays(double totalDays) {
        this.totalDays = totalDays;
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


