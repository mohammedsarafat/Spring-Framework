package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("htmlReportGenerator")
public class HtmlReportGenerator implements ReportGenerator {

	@Override
	public void generateReport(String data) {
		System.out.println("HTML Report Generated : " + data);
	}
}
