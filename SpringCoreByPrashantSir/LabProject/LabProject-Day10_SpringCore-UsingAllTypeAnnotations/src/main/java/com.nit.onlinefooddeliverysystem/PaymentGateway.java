package com.nit.onlinefooddeliverysystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentGateway {

    private String gatewayName;

    public void startGateway() {

        System.out.println("Payment Gateway Started...");

    }
}
