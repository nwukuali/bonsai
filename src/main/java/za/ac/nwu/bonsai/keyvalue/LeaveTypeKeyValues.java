package za.ac.nwu.bonsai.keyvalue;

import java.util.ArrayList;
import java.util.List;

import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.core.api.util.KeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;

import za.ac.nwu.bonsai.businessobject.LeaveType;

public class LeaveTypeKeyValues extends KeyValuesBase {

	private static final long serialVersionUID = 1L;

	@Override
	public List<KeyValue> getKeyValues() {
		
		List<KeyValue> keyValues = new ArrayList<KeyValue>();
		LeaveType[] types = LeaveType.class.getEnumConstants();
		
		keyValues.add(new ConcreteKeyValue("",""));
		
		for (LeaveType type : types) {
			keyValues.add(new ConcreteKeyValue(type.getName(), type.getName()));
		}
		
		return keyValues;
	}

}
