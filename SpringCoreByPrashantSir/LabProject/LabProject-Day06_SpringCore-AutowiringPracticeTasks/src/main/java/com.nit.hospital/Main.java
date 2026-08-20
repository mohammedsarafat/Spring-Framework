package com.nit.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext-hospital.xml");

        Doctor doctor = context.getBean(Doctor.class);

        doctor.diagnose();
    }
}
