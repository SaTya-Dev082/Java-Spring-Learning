package com.satya.springdemo.applicationcontextpractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRunner implements CommandLineRunner {

    private final ApplicationContext context;

    public ApplicationContextRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {

        System.out.println("===== APPLICATION CONTEXT PRACTICE =====");

        // 1. Get Bean by type
        GreetingService service1 = context.getBean(GreetingService.class);

        service1.sayHello();

        // 2. Get Bean by name
        GreetingService service2 = context.getBean(
                "greetingService",
                GreetingService.class);

        // 3. Check Bean exists
        boolean exists = context.containsBean("greetingService");

        System.out.println("Bean exists: " + exists);

        // 4. Check singleton
        System.out.println(
                "Same object: " + (service1 == service2));

        // 5. Print Bean object
        System.out.println("Service 1: " + service1);
        System.out.println("Service 2: " + service2);
    }
}
