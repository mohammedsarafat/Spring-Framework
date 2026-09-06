package com.nit.hospital;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Doctor doctor =
                context.getBean(Doctor.class);

        doctor.consult();

        context.close();
    }
}
