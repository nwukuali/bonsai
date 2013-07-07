package za.ac.nwu.bonsai.util;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.kuali.rice.kim.api.identity.Person;
import org.kuali.rice.kim.impl.identity.EntityDefaultInfoCacheBo;
import org.kuali.rice.kim.impl.identity.PersonImpl;
import za.ac.nwu.bonsai.businessobject.LeaveApplication;
import za.ac.nwu.bonsai.businessobject.LeaveType;

import java.io.File;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;


public class PdfLeaveApplicationGeneratorTests {

	@Test
	public void testGenerate() throws Exception {
		//given
		PdfLeaveApplicationGenerator pdfLeaveApplicationGenerator = new PdfLeaveApplicationGenerator();
		//when
		File result = pdfLeaveApplicationGenerator.generate(new LeaveApplicationHardCopy(createTestPerson(), createTestLeaveApplication()));
		//then
		assertNotNull(result);
		assertTrue(result.exists());
		System.out.println(result.getAbsolutePath());
	}

	private Person createTestPerson() {
		EntityDefaultInfoCacheBo entityDefaultInfoCacheBo = new EntityDefaultInfoCacheBo();
		entityDefaultInfoCacheBo.setEmployeeId("24296546");
		entityDefaultInfoCacheBo.setLastName("van der Merwe");
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
