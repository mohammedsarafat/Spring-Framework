package com.nit.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeliveryAgent {

    @Autowired
    private Restaurant restaurant;

    public void deliverOrder() {

        System.out.println("Delivery Agent received the order.");

        restaurant.prepareFood();

        System.out.println("Order Delivered Successfully.");
    }
}
