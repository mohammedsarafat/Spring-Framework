package com.nit.strategy;

public class ShoppingCart {

    private ShoppingStrategy strategy;

    public void setStrategy(ShoppingStrategy strategy) {

        this.strategy = strategy;

    }

    public double checkout(double amount) {

        return strategy.applyDiscount(amount);

    }

}
