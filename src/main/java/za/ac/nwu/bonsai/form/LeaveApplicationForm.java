package za.ac.nwu.bonsai.form;

import org.kuali.rice.krad.web.form.TransactionalDocumentFormBase;

public class LeaveApplicationForm extends TransactionalDocumentFormBase {

	private static final long serialVersionUID = 1L;

	public LeaveApplicationForm() {
		super();
	}
	
	@Override
    protected String getDefaultDocumentTypeName() {
        return "LeaveApplicationDocumentType";
    }
	
}
