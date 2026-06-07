package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.ElectricityBillGenerator;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ElectricityBillGenerator bill = context.getBean("electricityBill", ElectricityBillGenerator.class);

		IO.println("Total Bill: " + bill.generateBill());
	}
}
