package com.nit.project04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/project04/applicationContext.xml");

        Mall mall = context.getBean("mall", Mall.class);

        System.out.println(mall);
    }
}
