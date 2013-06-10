package za.ac.nwu.bonsai.service.impl;

import org.apache.commons.lang.time.DateUtils;
import org.kuali.rice.kim.api.identity.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import za.ac.nwu.bonsai.businessobject.LeaveBalance;
import za.ac.nwu.bonsai.businessobject.LeaveTransaction;
import za.ac.nwu.bonsai.businessobject.LeaveType;
import za.ac.nwu.bonsai.service.LeaveService;

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

    private JdbcTemplate jdbcTemplate;

    @Override
    public List<LeaveBalance> getLeaveBalances(Person person) {
        List<LeaveBalance> balances = new ArrayList<LeaveBalance>();
        balances.add(createTempLeaveBalance(LeaveType.ANNUAL, 10, 20, 30, 40));
        balances.add(createTempLeaveBalance(LeaveType.SICK, 10, 20, 30, 40));
        balances.add(createTempLeaveBalance(LeaveType.STUDY, 3.5, 2.6, 3, 2.1));
        return balances;
    }

    @Override
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
        }


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
