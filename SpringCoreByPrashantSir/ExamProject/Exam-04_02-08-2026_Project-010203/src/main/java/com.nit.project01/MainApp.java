package com.nit.project01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MovieBooking booking = context.getBean(MovieBooking.class);

        booking.displayBookingDetails();
    }
}
