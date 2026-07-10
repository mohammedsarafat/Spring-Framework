package com.nit.strategy;

public class MyntraStrategy implements ShoppingStrategy {

    @Override
    public double applyDiscount(double amount) {

        if (amount >= 4000) {
            return amount - (amount * 30 / 100);
        } else {
            return amount - (amount * 10 / 100);
        }

    }

}
