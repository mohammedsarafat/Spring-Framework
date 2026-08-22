package com.nit.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

    @Autowired
    @Qualifier("emailNotification")
    private NotificationService notificationService;

    public void notifyUser() {

        System.out.println("Notification Manager Started");

        notificationService.sendNotification();
    }
}
