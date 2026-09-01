package com.nit.online_payment_processing_system;

public class CreditCardPayment implements PaymentService {

    @Override
    public void pay(double amount) {

        System.out.println("Payment completed using Credit Card.");
        System.out.println("Amount : " + amount);
    }
}
