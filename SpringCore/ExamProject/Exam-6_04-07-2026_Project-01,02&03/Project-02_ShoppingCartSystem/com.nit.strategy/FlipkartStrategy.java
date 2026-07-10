package com.nit.strategy;

public class FlipkartStrategy implements ShoppingStrategy {

    @Override
    public double applyDiscount(double amount) {

        if (amount >= 5000) {
            return amount - (amount * 25 / 100);
        } else if (amount >= 3000) {
            return amount - (amount * 15 / 100);
        } else {
            return amount - (amount * 7 / 100);
        }

    }
    
}
