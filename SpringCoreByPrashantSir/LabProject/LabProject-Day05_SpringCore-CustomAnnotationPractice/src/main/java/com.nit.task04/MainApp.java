package com.nit.task04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	 public static void main(String[] args) {

	        ApplicationContext context =
	                new ClassPathXmlApplicationContext("com/nit/task04/applicationContext.xml");

	        Employee employee =
	                context.getBean("employee", Employee.class);

	        System.out.println(employee);
	    }
	}
