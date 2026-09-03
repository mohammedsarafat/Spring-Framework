package com.nit.onlinefooddeliverysystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private int customerId;
    private String customerName;

    public void showCustomer() {

        System.out.println("Customer Created");
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + customerName);

    }
}
