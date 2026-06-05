package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Student;
import com.nit.config.appConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
		Student bean = context.getBean("st",Student.class);
		
		bean.displayStudent();
	}

}
