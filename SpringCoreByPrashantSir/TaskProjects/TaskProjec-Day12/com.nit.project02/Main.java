package com.nit.project02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/project02/applicationContext.xml");

        StudentEnrollment student =
                context.getBean("studentEnrollment", StudentEnrollment.class);

        System.out.println(student);
    }
}