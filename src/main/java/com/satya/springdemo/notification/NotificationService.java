package com.satya.springdemo.notification;

import org.springframework.stereotype.Component;

@Component 
public class NotificationService {
    public void sendNotification(String message) {
        System.out.println("Notification: " + message);
    }
}
