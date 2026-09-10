package com.satya.springdemo.icodiconcept.order;

import org.springframework.stereotype.Service;

import com.satya.springdemo.icodiconcept.payment.PaymentService;

@Service
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void createOrder() {

        System.out.println("Creating order...");
        paymentService.amount(82);
        System.out.println("Order created successfully.");
        
    }
}
