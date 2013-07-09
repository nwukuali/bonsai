package za.ac.nwu.bonsai.service.impl;

import org.apache.commons.lang.time.DateUtils;
import org.kuali.rice.kim.api.identity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import za.ac.nwu.bonsai.businessobject.LeaveApplication;
import za.ac.nwu.bonsai.businessobject.LeaveBalance;
import za.ac.nwu.bonsai.businessobject.LeaveTransaction;
import za.ac.nwu.bonsai.businessobject.LeaveType;
import za.ac.nwu.bonsai.service.LeaveService;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

//Temporary stub service unjtil we have ws to HR in place
@Service(value = "leaveService")
public class StubLeaveServiceImpl implements LeaveService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<LeaveBalance> getLeaveBalances(Person person) {
        List<LeaveBalance> results = jdbcTemplate.query(
                "select * from BON_LEAVE_BALANCES where EMPLOYEE_NUMBER = ?",
                new Object[]{person.getEmployeeId()}, new RowMapper<LeaveBalance>() {
                /*new Object[]{"12927252"}, new RowMapper<LeaveBalance>() {*/

            @Override
            public LeaveBalance mapRow(ResultSet rs, int rowNum) throws SQLException {
                LeaveBalance leaveBalance = new LeaveBalance();
                leaveBalance.setType(LeaveType.toLeaveType(rs.getString("LEAVE")));
                leaveBalance.setCycleDaysBalanceToDate(rs.getDouble("CYCLE_BALANCE_TO_DATE"));
                leaveBalance.setCycleDaysTakenToDate(rs.getDouble("CYCLE_DAYS_TAKEN_TO_DATE"));
                leaveBalance.setEndOfCycleDaysBalance(rs.getDouble("END_OF_CYCLE_DATE"));
                leaveBalance.setFullCycleDays(rs.getDouble("FULL_CYCLE_DAYS"));
                return leaveBalance;
            }
        });
        return results;
    }

    @Override
    public List<LeaveTransaction> getLeaveTransactionsForCurrentYear(Person person) {
        List<LeaveTransaction> results = jdbcTemplate.query(
                "select * from BON_LEAVE_DETAIL where EMPLOYEE_NUMBER = ?",
                new Object[]{person.getEmployeeId()}, new RowMapper<LeaveTransaction>() {
                /*new Object[]{"12927252"}, new RowMapper<LeaveBalance>() {*/

            @Override
            public LeaveTransaction mapRow(ResultSet rs, int rowNum) throws SQLException {
               LeaveTransaction leaveTransaction = new LeaveTransaction();
               leaveTransaction.setType(LeaveType.toLeaveType(rs.getString("LEAVE_TYPE")));
               leaveTransaction.setFromDate(rs.getDate("DATE_START"));
               leaveTransaction.setToDate(rs.getDate("DATE_END"));
                leaveTransaction.setTotalDays(rs.getDouble("ABSENCE_DAYS"));
              return leaveTransaction;
            }
        });
        return results;


   /* @Override
    public List<LeaveTransaction> getLeaveTransactionsForCurrentYear(Person person) {
        return getLeaveTransactions(person, DateUtils.round(new Date(), Calendar.YEAR), new Date());
    }

    @Override
    public List<LeaveTransaction> getLeaveTransactions(Person person, Date fromDate, Date toDate) {
        try {
            String[] df = {"ddMMyyyy"};
            List<LeaveTransaction> results = new ArrayList<LeaveTransaction>();
            results.add(createTempLeaveTransaction(LeaveType.ANNUAL, DateUtils.parseDate("20130101", df), DateUtils.parseDate("20130115", df), 10));
            results.add(createTempLeaveTransaction(LeaveType.ANNUAL, DateUtils.parseDate("20130101", df), DateUtils.parseDate("20130115", df), 10));
            results.add(createTempLeaveTransaction(LeaveType.ANNUAL, DateUtils.parseDate("20130101", df), DateUtils.parseDate("20130115", df), 10));
            results.add(createTempLeaveTransaction(LeaveType.ANNUAL, DateUtils.parseDate("20130101", df), DateUtils.parseDate("20130115", df), 10));
            return results;
        } catch (ParseException e) {
            throw new RuntimeException("Unable to get temp leave transactions", e);
        }*/


//        List<LeaveTransaction> results = jdbcTemplate.query(
//                "select * from leave_transactions where employee_id = ? and from_date >= ? and to_date <= ?",
//                new Object[]{person.getEmployeeId(), fromDate, toDate}, new RowMapper<LeaveTransaction>() {
//
//            @Override
//            public LeaveTransaction mapRow(ResultSet rs, int rowNum) throws SQLException {
//                return new LeaveTransaction.LeaveTransactionBuilder().
//                        withType(LeaveType.toLeaveType(rs.getString("type"))).
//                        from(rs.getDate("date_from")).
//                        to(rs.getDate("date_to")).
//                        days(rs.getInt("total_days")).
//                        build();
//            }
//        });
//        return results;
    }

	@Override
	public File generateLeaveApplicationHardCopy(LeaveApplication leaveApplication) {
		throw new RuntimeException("Not yet implemented!!!");
	}

	//TODO: Remove once jdbtemplates in place
    private LeaveTransaction createTempLeaveTransaction(LeaveType type, Date fromDate, Date toDate, int totalDays) {
        return new LeaveTransaction.LeaveTransactionBuilder().
                withType(type).from(fromDate).to(toDate).days(totalDays).build();
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
