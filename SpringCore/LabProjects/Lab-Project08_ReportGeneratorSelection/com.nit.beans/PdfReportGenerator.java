package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("pdfReportGenerator")
public class PdfReportGenerator implements ReportGenerator {

	@Override
	public void generateReport(String data) {
		System.out.println("PDF Report Generated : " + data);
	}
}
