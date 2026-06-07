package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Customer;

public class Main {

	public static void main(String[] args) {
		String config_file = "/com/nit/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file);
		Customer cust = (Customer) context.getBean("custId");
		cust.display();
	}

}
