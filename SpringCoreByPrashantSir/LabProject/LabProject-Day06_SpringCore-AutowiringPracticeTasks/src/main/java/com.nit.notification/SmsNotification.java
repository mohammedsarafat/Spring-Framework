package com.nit.notification;

import org.springframework.stereotype.Component;

@Component("smsNotification")
public class SmsNotification implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification Sent Successfully");
    }
}
