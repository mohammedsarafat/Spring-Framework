package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Course;
import com.nit.beans.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student) context.getBean("sId");
		s.display();
		IO.println();
		Course c = (Course) context.getBean("cId");
		c.display();

	}

}
