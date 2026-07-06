package com.nit.project04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/project04/applicationContext.xml");

        Patient patient = context.getBean("patient", Patient.class);

        patient.display();

        ((ClassPathXmlApplicationContext) context).close();
    }
}