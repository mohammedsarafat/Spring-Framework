package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Institute;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
        new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Institute institute =
        (Institute) context.getBean("institute");

       // System.out.println(institute);
        
        institute.display();
    }
}
