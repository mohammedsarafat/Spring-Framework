package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.controller.RideController;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        RideController controller =
                context.getBean(RideController.class);

        controller.bookCar(500);

        controller.bookBike(150);

        controller.bookAuto(100);
    }
}
