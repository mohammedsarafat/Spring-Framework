package com.nit.model;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("TASK 1 - SETTER INJECTION");
        System.out.println("==================================================================");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("task1_setter.xml");
        Employee emp1 = (Employee) context1.getBean("employee");
        System.out.println(emp1);
        
        System.out.println("\n==================================================================");
        System.out.println("TASK 2 - CONSTRUCTOR INJECTION");
        System.out.println("==================================================================");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("task2_constructor.xml");
        Employee emp2 = (Employee) context2.getBean("employee");
        System.out.println(emp2);

        System.out.println("\n==================================================================");
        System.out.println("TASK 3 - AUTOWIRE (byName)");
        System.out.println("==================================================================");
        ApplicationContext context3 = new ClassPathXmlApplicationContext("task3_autowire_byname.xml");
        Employee emp3 = (Employee) context3.getBean("employee");
        System.out.println(emp3);

        System.out.println("\n==================================================================");
        System.out.println("TASK 4 - AUTOWIRE (byType)");
        System.out.println("==================================================================");
        ApplicationContext context4 = new ClassPathXmlApplicationContext("task4_autowire_bytype.xml");
        Employee emp4 = (Employee) context4.getBean("employee");
        System.out.println(emp4);
    }
}
