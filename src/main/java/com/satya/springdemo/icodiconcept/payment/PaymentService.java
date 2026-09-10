package com.satya.springdemo.icodiconcept.payment;

import org.springframework.stereotype.Component;

@Component 
public class PaymentService {
    
    public void amount(double amount){
        System.out.println("Payment of amount: " + amount + " is successful.");
    }
}
