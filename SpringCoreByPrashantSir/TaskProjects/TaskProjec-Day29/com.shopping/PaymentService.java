package com.shopping;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void makePayment() {
        System.out.println("Payment Completed Successfully.");
    }
}
