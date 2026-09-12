package com.satya.springdemo.componentpractice;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final PasswordUtils passwordUtils;
    public AccountService(PasswordUtils passwordUtils) {
        this.passwordUtils = passwordUtils;
    }

    public void createAccount(String username, String password) {

        String hashedPassword = passwordUtils.hashPassword(password);

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Hashed Password: " + hashedPassword);
        System.out.println("Account created successfully.");
    }

}
