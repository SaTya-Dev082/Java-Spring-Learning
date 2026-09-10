package com.satya.springdemo.icodiconcept.order;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.satya.springdemo.icodiconcept.payment.PaymentService;

@Service
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(@Qualifier("CashPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void createOrder() {

        System.out.println("Creating order...");
        paymentService.amount(70);
        System.out.println("Order created successfully.");

    }
}
