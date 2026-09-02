package com.nit.online_payment_processing_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderService {

    private PaymentService paymentService;

    @Autowired
    @Qualifier("upiPayment")
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {

        System.out.println("Order Created Successfully.");
        System.out.println("Processing Payment...");

        paymentService.pay(5000);

        System.out.println("Order Placed Successfully.");
    }
}
