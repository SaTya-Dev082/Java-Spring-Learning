package com.satya.springdemo.beanpractice;

import org.springframework.stereotype.Component;

@Component
public class PriceCalculator {
    public double calculatePrice(double price, int quantity) {
        return price * quantity;
    }
}
