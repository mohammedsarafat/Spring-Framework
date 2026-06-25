package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.ReportService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ReportService rs = context.getBean(ReportService.class);

		rs.createReport("Employee Details");

		System.out.println("Application Executed Successfully");
	}
}
