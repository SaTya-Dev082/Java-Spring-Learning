package com.satya.springdemo.componentpractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ComponentPracticeRunner implements CommandLineRunner {

    /*
     * private final AccountService accountService;
     * 
     * public ComponentPracticeRunner(
     * AccountService accountService) {
     * this.accountService = accountService;
     * }
     * 
     * @Override
     * public void run(String... args) {
     * 
     * System.out.println(
     * "===== COMPONENT PRACTICE =====");
     * 
     * accountService.createAccount(
     * "robot",
     * "123456");
     * }
     */

    // Using is a Bean
    private final AccountService accountService;
    private final ApplicationContext context;

    public ComponentPracticeRunner(
            AccountService accountService,
            ApplicationContext context) {
        this.accountService = accountService;
        this.context = context;
    }
    @Override
    public void run(String... args) {
        boolean exists = context.containsBean("passwordUtils");

        System.out.println(
                "PasswordUtils Bean exists: " + exists);
    }
}
