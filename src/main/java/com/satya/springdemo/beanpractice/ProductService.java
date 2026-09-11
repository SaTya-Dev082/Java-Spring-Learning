package com.satya.springdemo.beanpractice;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final PriceCalculator priceCalculator;

    public ProductService(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    public void purchaseProduct() {
        double price = 25;
        int quantity = 3;

    double total = priceCalculator.calculatePrice(price, quantity);

        System.out.println("Product price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + total);
    }
}
