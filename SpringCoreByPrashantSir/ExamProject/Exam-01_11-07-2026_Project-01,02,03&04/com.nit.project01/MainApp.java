package com.nit.project01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/project01/applicationContext.xml");

        University university =
                context.getBean("university", University.class);

        System.out.println(university);
    }
}
