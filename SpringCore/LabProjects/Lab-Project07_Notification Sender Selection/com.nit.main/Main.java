package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.center.ServiceCenter;
import com.nit.config.AppConfig;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ServiceCenter center =
                context.getBean(ServiceCenter.class);

        center.serviceVehicle();
    }
}
