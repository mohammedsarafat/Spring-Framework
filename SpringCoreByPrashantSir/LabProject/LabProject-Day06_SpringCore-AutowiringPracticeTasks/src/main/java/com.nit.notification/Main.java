package com.nit.notification;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext-notification.xml");

        NotificationManager manager =
                context.getBean(NotificationManager.class);

        manager.notifyUser();
    }
}
