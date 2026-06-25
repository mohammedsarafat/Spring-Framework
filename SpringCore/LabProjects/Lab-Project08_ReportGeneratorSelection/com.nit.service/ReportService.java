package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.beans.ReportGenerator;

@Component
public class ReportService {

	@Autowired
	@Qualifier("pdfReportGenerator")
	private ReportGenerator generator;

	public void createReport(String data) {
		generator.generateReport(data);
	}
}
