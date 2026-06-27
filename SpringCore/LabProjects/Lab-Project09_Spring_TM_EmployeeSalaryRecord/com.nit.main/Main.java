package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Employee;
import com.nit.beans.EmployeeService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		EmployeeService service = context.getBean(EmployeeService.class);

		Employee emp = new Employee(101, "RAJBALA", "IT", 50000);

		service.saveEmployeeSalary(emp);

		System.out.println("Transaction Completed Successfully");

		context.close();
	}
}
