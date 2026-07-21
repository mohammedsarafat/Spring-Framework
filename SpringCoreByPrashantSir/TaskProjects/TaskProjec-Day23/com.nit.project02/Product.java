package com.nit.project02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

    @Value("${Product_name}")
    private String productName;

    @Value("${Product_id}")
    private String productId;

    @Value("${Product_price}")
    private double productPrice;

    @Value("${Customer_isPremium}")
    private boolean premium;

    public double getFinalPrice() {

        if (premium) {
            return productPrice - (productPrice * 20 / 100);
        }

        return productPrice;
    }

    public void display() {

        System.out.println("Product Name       : " + productName);
        System.out.println("Product ID         : " + productId);
        System.out.println("Original Price     : " + productPrice);
        System.out.println("Premium Customer   : " + premium);
        System.out.println("Final Price        : " + getFinalPrice());

    }

}

