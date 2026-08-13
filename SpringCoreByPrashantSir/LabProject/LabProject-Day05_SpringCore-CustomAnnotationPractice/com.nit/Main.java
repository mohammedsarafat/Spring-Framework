package com.nit;

public class Main {

	public static void main(String[] args) {

		Class<Employee> employeeClass = Employee.class;

		EmployeeInfo info = employeeClass.getAnnotation(EmployeeInfo.class);

		System.out.println("Id :" + info.id());
		System.out.println("Name :" + info.name());
		System.out.println("Department :" + info.department());
	}
}
