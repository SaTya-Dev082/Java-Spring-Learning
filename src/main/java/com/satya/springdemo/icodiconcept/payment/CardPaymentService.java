package com.satya.springdemo.icodiconcept.payment;

import org.springframework.stereotype.Component;

@Component
public class CardPaymentService implements PaymentService {

    @Override
    public void amount(double amount) {
        System.out.println("Paid by Card of amount: " + amount + " is successful.");
    }
    
}
