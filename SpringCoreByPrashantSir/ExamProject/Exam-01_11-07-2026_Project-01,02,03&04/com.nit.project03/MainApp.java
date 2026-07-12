package com.nit.project03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/project03/applicationContext.xml");

		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

		System.out.println(vehicle);
	}
}
