package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Employee;

public class Main {

	public static void main(String[] args) {
		String config_file="/com/nit/resources/applicationContext.xml";
		
		ApplicationContext context=new ClassPathXmlApplicationContext(config_file);
		Employee emp=(Employee) context.getBean("empId");
		
		emp.display();
		
		
         
	}

}

OUTPUT
------
Emp ID is: 101
Emp NAME is: Subham
Emp SALARY is: 50000.0
Emp DEPARTMENT is: Devloper
