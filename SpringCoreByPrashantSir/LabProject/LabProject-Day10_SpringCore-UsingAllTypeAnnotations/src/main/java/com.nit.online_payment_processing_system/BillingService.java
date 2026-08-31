package com.nit.online_payment_processing_system;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillingService {

    private PaymentService paymentService;

    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void generateBill() {

        System.out.println("Generating Bill...");

        paymentService.pay(2500);

        System.out.println("Bill Generated Successfully.");
    }
}
