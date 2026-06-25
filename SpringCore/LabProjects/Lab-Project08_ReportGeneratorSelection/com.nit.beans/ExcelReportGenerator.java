package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("excelReportGenerator")
public class ExcelReportGenerator implements ReportGenerator {

	@Override
	public void generateReport(String data) {
		System.out.println("Excel Report Generated : " + data);
	}
}
