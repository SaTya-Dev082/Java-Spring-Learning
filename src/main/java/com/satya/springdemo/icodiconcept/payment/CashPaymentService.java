package com.satya.springdemo.icodiconcept.payment;

import org.springframework.stereotype.Component;

@Component("CashPaymentService")
public class CashPaymentService implements PaymentService {

    @Override
    public void amount(double amount) {
        System.out.println("Paid by Cash of amount: " + amount + " is successful.");
    }

}
