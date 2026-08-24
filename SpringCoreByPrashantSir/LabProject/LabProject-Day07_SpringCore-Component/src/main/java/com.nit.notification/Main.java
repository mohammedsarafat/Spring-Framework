package com.nit.notification;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        "com.nit.notification"
                );

        NotificationService service =
                context.getBean(NotificationService.class);

        service.sendNotification();

        context.close();
    }
}