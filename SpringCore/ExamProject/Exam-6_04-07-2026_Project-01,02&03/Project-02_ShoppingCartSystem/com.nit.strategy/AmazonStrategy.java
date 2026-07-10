package com.nit.strategy;

public class AmazonStrategy implements ShoppingStrategy {

    @Override
    public double applyDiscount(double amount) {

        if (amount >= 5000) {
            return amount - (amount * 20 / 100);
        } else if (amount >= 3000) {
            return amount - (amount * 10 / 100);
        } else {
            return amount - (amount * 5 / 100);
        }

    }
    
}
