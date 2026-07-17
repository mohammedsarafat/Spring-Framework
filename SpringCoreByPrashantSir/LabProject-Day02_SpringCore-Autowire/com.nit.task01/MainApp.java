package com.nit.task01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/task01/applicationContext.xml");

        Patient patient = context.getBean("patient", Patient.class);

        patient.displayPatientDetails();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
