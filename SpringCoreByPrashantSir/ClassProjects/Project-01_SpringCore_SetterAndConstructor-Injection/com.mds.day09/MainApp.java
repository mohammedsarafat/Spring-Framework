package com.mds.day09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {

// Traditional approach
 System.out.println("\u001B[31m"+"with java approach");
 Resume resume=new Resume();
 resume.setDegree("b.tech");
 resume.setExperience(0);
 
 Student student1=new Student();
 student1.setId(101);
 student1.setAddress("hyd");
 student1.setName("prashant");
 student1.setResume(resume);


 System.out.println(student1);

 

System.out.println("\u001B[32m" + "with spring approach" + "\u001B[0m");
ApplicationContext context = new ClassPathXmlApplicationContext("com/mds/day09/applicationContext.xml");

Student bean = context.getBean("studentData", Student.class);
System.out.println(bean);


}
}
