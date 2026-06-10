package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Library;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Library library = context.getBean("library", Library.class);

		library.displayLibraryDetails();
	}
}
