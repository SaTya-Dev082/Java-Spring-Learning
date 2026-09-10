package com.satya.springdemo.icodiconcept.payment;

import org.springframework.stereotype.Component;


// Sample PaymentService class
/* 
@Component 
public class PaymentService {
    
    public void amount(double amount){
        System.out.println("Payment of amount: " + amount + " is successful.");
    }
}

*/


// Interface for PaymentService
@Component 
public interface PaymentService{
    void amount(double amount);
}