package com.nit.online_payment_processing_system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public PaymentService creditCardPayment() {

        return new CreditCardPayment();
    }

    @Bean
    public PaymentService upiPayment() {

        return new UpiPayment();
    }

    @Bean
    public OrderService orderService() {

        return new OrderService();
    }

    @Bean
    public BillingService billingService() {

        return new BillingService();
    }
}
