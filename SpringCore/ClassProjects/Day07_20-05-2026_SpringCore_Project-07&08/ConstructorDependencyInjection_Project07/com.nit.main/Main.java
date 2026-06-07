package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Car;
import com.nit.beans.Engine;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car c = (Car) context.getBean("cId");
		c.display();

		IO.println();

		Engine e = (Engine) context.getBean("eId");
		e.display();
	}

}
