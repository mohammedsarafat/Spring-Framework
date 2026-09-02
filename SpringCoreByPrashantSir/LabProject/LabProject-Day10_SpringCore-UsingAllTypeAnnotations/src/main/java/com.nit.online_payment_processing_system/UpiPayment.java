package com.nit.online_payment_processing_system;

public class UpiPayment implements PaymentService {

    @Override
    public void pay(double amount) {

        System.out.println("Payment completed using UPI.");
        System.out.println("Amount : " + amount);
    }
}
