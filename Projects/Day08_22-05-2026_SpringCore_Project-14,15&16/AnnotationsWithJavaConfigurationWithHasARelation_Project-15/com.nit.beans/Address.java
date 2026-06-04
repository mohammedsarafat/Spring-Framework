package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("Hyderabad")
    private String city;

    @Value("Telangana")
    private String state;

    public void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}
