package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Employee;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e1 =context.getBean(Employee.class);
		Employee e2 =context.getBean(Employee.class);
		
		IO.println(e1);
		IO.println(e2);
	}

}
