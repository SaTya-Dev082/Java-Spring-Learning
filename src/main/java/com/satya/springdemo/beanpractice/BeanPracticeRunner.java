package com.satya.springdemo.beanpractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

// @Component
public class BeanPracticeRunner implements CommandLineRunner {
    private final ApplicationContext context;

    public BeanPracticeRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("===== BEAN PRACTICE =====");

        ProductService productService = context.getBean(ProductService.class);

        // We can also retrieve the bean by its name and type:
        // context.getBean(ProductService.class);
        // context.getBean("productService", ProductService.class);
        productService.purchaseProduct();

        ProductService service1 = context.getBean(ProductService.class);
        ProductService service2 = context.getBean(ProductService.class);

        System.out.println("Service 1: " + service1);
        System.out.println("Service 2: " + service2);
        System.out.println("Same object? " + (service1 == service2));
    }
}
