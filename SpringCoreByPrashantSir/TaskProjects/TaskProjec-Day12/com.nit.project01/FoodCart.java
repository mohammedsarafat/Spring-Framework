package com.nit.project01;

import java.util.List;

public class FoodCart {

    private List<String> dishes;

    // No-Argument Constructor
    public FoodCart() {
    }

    // Getter
    public List<String> getDishes() {
        return dishes;
    }

    // Setter
    public void setDishes(List<String> dishes) {
        this.dishes = dishes;
    }

    // toString()
    @Override
    public String toString() {
        return "FoodCart [dishes=" + dishes + "]";
    }
}