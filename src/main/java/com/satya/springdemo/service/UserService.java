package com.satya.springdemo.service;

import org.springframework.stereotype.Service;

import com.satya.springdemo.notification.NotificationService;

@Service 
public class UserService {

    private final NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser() {

        System.out.println("Creating user...");

        notificationService.sendNotification(
                "Welcome! Your account has been created."
        );
    }
}
