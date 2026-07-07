package com.nit.project03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/project03/applicationContext.xml");

        RechargePlan recharge =
                context.getBean("rechargePlan", RechargePlan.class);

        System.out.println(recharge);
    }
}