package com.satya.springdemo.beanpractice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanPracticeRunner implements CommandLineRunner {
    private final ApplicationContext context;

    public BeanPracticeRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("===== BEAN PRACTICE =====");

        ProductService productService = context.getBean(ProductService.class);

        productService.purchaseProduct();
    }

}
