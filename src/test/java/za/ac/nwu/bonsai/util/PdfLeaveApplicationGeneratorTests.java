package za.ac.nwu.bonsai.util;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.kuali.rice.kew.api.WorkflowDocument;
import org.kuali.rice.kim.api.identity.Person;
import org.kuali.rice.kim.api.identity.PersonService;
import org.kuali.rice.kim.impl.identity.EntityDefaultInfoCacheBo;
import org.kuali.rice.kim.impl.identity.PersonImpl;
import org.kuali.rice.krad.bo.DocumentHeader;
import org.mockito.Mockito;
import za.ac.nwu.bonsai.businessobject.LeaveApplication;
import za.ac.nwu.bonsai.businessobject.LeaveType;
import za.ac.nwu.bonsai.document.LeaveApplicationDocument;

import java.io.File;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;


public class PdfLeaveApplicationGeneratorTests {

	private static final String INITIATOR_PRINCIPAL_ID = "123";

	@Test
	public void testGenerate() throws Exception {
		//given
		PdfLeaveApplicationGenerator pdfLeaveApplicationGenerator = new PdfLeaveApplicationGenerator();
		PersonService personService = Mockito.mock(PersonService.class);
		//when
		Mockito.when(personService.getPerson(INITIATOR_PRINCIPAL_ID)).thenReturn(createTestPerson());
		File result = pdfLeaveApplicationGenerator.generate(new LeaveApplicationHardCopy(personService, createTestDocument()));
		//then
		assertNotNull(result);
		assertTrue(result.exists());
		System.out.println(result.getAbsolutePath());
	}

	private LeaveApplicationDocument createTestDocument() throws Exception{
		LeaveApplicationDocument leaveApplicationDocument = Mockito.mock(LeaveApplicationDocument.class);
		Mockito.when(leaveApplicationDocument.getLeaveApplication()).thenReturn(createTestLeaveApplication());
		DocumentHeader mockDocumentHeader = Mockito.mock(DocumentHeader.class);
		WorkflowDocument mockWorkFlowDocument = Mockito.mock(WorkflowDocument.class);
		Mockito.when(mockWorkFlowDocument.getPrincipalId()).thenReturn(INITIATOR_PRINCIPAL_ID);
		Mockito.when(mockDocumentHeader.getWorkflowDocument()).thenReturn(mockWorkFlowDocument);
		Mockito.when(leaveApplicationDocument.getDocumentHeader()).thenReturn(mockDocumentHeader);
		return leaveApplicationDocument;
	}

	private Person createTestPerson() {
		EntityDefaultInfoCacheBo entityDefaultInfoCacheBo = new EntityDefaultInfoCacheBo();
		entityDefaultInfoCacheBo.setEmployeeId("24296546");
		entityDefaultInfoCacheBo.setLastName("van der Merwe");
		entityDefaultInfoCacheBo.setFirstName("Johannes");
		entityDefaultInfoCacheBo.setMiddleName("Jacobus");
		entityDefaultInfoCacheBo.setName("Jan");
		return new PersonImpl(entityDefaultInfoCacheBo);
	}

	private LeaveApplication createTestLeaveApplication() throws Exception{
		LeaveApplication leaveApplication = new LeaveApplication();
		leaveApplication.setLeaveType(LeaveType.ANNUAL);
		leaveApplication.setContactAddress("Mauritius");
		leaveApplication.setContactNumber("1800 62334");
		leaveApplication.setDateFrom(DateUtils.parseDate("1990-03-04", new String[]{"yyyy-MM-dd"}));
		leaveApplication.setDateTo(DateUtils.parseDate("1991-05-10", new String[]{"yyyy-MM-dd"}));
		leaveApplication.setReason("None of your business!!!");
		return leaveApplication;
	}

}
