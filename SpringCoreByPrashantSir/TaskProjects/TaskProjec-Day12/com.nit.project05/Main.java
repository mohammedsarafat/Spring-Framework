package com.nit.project05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/project05/applicationContext.xml");

        EmailConfig config =
                context.getBean("emailConfig", EmailConfig.class);

        System.out.println(config);
    }
}