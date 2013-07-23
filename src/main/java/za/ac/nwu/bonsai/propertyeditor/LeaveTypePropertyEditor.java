package za.ac.nwu.bonsai.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.io.Serializable;

import za.ac.nwu.bonsai.businessobject.LeaveType;

public class LeaveTypePropertyEditor extends PropertyEditorSupport implements Serializable {

	private static final long serialVersionUID = 1L;

	@Override
    public String getAsText() {
		LeaveType leaveType = (LeaveType) this.getValue();

        if (leaveType == null) {
            return null;
        }

        return leaveType.name();
    }

    @Override
    public void setAsText(String text) {
        this.setValue(LeaveType.toLeaveType(text));
    }

}
