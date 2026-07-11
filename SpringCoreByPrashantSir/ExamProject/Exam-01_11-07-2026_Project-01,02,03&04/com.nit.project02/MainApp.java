package com.nit.project02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/project02/applicationContext.xml");

        Customer customer = context.getBean("customer", Customer.class);

        System.out.println(customer);
    }
}
