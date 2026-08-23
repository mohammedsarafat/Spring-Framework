package com.nit.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext-employee.xml");

        EmployeeService employeeService =
                context.getBean("employeeService", EmployeeService.class);

        employeeService.displayEmployeeDetails();
    }
}
