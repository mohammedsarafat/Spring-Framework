package com.nit.onlinefooddeliverysystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderService {

    private int orderId;

    private RestaurantService restaurantService;

    private Customer customer;

    public void placeOrder() {

        customer.showCustomer();

        System.out.println("Order Placed Successfully...");

    }
}
