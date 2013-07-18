package za.ac.nwu.bonsai.persistence.ojb.conversion;

import org.apache.ojb.broker.accesslayer.conversions.ConversionException;
import org.apache.ojb.broker.accesslayer.conversions.FieldConversion;

import za.ac.nwu.bonsai.businessobject.LeaveType;

public class LeaveTypeConversion implements FieldConversion {

	private static final long serialVersionUID = 1L;

	@Override
	public Object javaToSql(Object source) throws ConversionException {
		if (Enum.class.isAssignableFrom(LeaveType.class)) {
			return ((LeaveType)source).getName();
		} else {
			throw new ConversionException("source is not a LeaveType");
		}
	}

	@Override
	public Object sqlToJava(Object source) throws ConversionException {
		return LeaveType.toLeaveType((String) source);
	}

}
