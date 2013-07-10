package za.ac.nwu.bonsai.util;

import com.lowagie.text.Element;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import org.apache.commons.lang.WordUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import static za.ac.nwu.bonsai.util.LeaveApplicationHardCopy.*;

public class PdfLeaveApplicationGenerator {

	private final BaseFont baseFont;
	private final String templatePath = "/za/ac/nwu/bonsai/template/leave_application.pdf";
	private final MaskElement[] layout = {
		new MaskElement(INITIALS_AND_SURNAME, 55, 645),
		new MaskElement(DEPARTMENT, 200, 645),
		new MaskElement(BUS_NUMBER, 330, 645),
		new MaskElement(EXTENSION, 380, 645),
		new MaskElement(EMPLOYEE_NUMBER, 450, 645),

		new MaskElement(REASON, 210, 455),

		new MaskElement(TYPE_OF_LEAVE, 55, 405),
		new MaskElement(DAY_FROM, 175, 405),
		new MaskElement(MONTH_FROM, 220, 405),
		new MaskElement(YEAR_FROM, 270, 405),

		new MaskElement(DAY_TO, 350, 405),
		new MaskElement(MONTH_TO, 400, 405),
		new MaskElement(YEAR_TO, 450, 405),
		new MaskElement(NUMBER_OF_DAYS, 515, 405),

		new MaskElement(CONTACT_ADDRESS, 175, 335),
		new MaskElement(CONTACT_NUMBER, 290, 315),

		new MaskElement(BACKUP_YES, 330, 300),
		new MaskElement(BACKUP_NO, 390, 300),
		new MaskElement(BACKUP_NOT_APPLICABLE, 520, 300),


		new MaskElement(DOCUMENT_NUMBER, 220, 270),
		new MaskElement(APPLICATION_DATE, 430, 270),

		new MaskElement(DOCUMENT_NUMBER, 220, 190),
		new MaskElement(APPLICATION_DATE, 430, 190),

		new MaskElement(DOCUMENT_NUMBER, 220, 120),
		new MaskElement(APPLICATION_DATE, 430, 120),



	};

	public PdfLeaveApplicationGenerator() {
		try {
			baseFont = BaseFont.createFont(BaseFont.COURIER, BaseFont.CP1257, BaseFont.EMBEDDED);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public File generate(LeaveApplicationHardCopy leaveApplicationHardCopy) {
		try {
			File output = createLeaveFile();
			PdfReader reader = new PdfReader(this.getClass().getResourceAsStream(templatePath));
			PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(output));

			overlayLeaveDetails(stamper, leaveApplicationHardCopy);

			stamper.getWriter().setCloseStream(false);
			stamper.close();
			return output;
		} catch (Exception e) {
			throw new RuntimeException("Unable to generate leave application hard copy", e);
		}
	}

	private void overlayLeaveDetails(PdfStamper stamper, LeaveApplicationHardCopy leaveApplicationHardCopy) {
		PdfContentByte over = stamper.getOverContent(1);
		for (MaskElement maskElement : layout) {
			over.beginText();
			over.setFontAndSize(baseFont, 10);
			over.showTextAligned(Element.ALIGN_LEFT, getFormValue(leaveApplicationHardCopy, maskElement.getElement()), maskElement.getXPosition(), maskElement.getYPosition(), 0);
			over.endText();
		}
	}

	private String getFormValue(LeaveApplicationHardCopy leaveApplicationHardCopy, String element) {
		try {
			Method method = leaveApplicationHardCopy.getClass().getMethod("get" + WordUtils.capitalize(element));
			String result = (String)method.invoke(leaveApplicationHardCopy);
			return result != null ? result : "";
		} catch (Exception e) {
			throw new RuntimeException("Unable to get form value",e);
		}
	}

	private File createLeaveFile() {
		File result;
		try {
			result = File.createTempFile("LeaveApplication", ".pdf");
		} catch (IOException e) {
			throw new RuntimeException("Unable to create temp leave application file", e);
		}
		return result;
	}


	private class MaskElement {

		private String element;
		private int xPosition;
		private int yPosition;

		public MaskElement(String element, int xPosition, int yPosition) {
			this.element = element;
			this.xPosition = xPosition;
			this.yPosition = yPosition;
		}

		private String getElement() {
			return element;
		}

		private int getXPosition() {
			return xPosition;
		}

		private int getYPosition() {
			return yPosition;
		}
	}

}
