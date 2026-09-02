package com.nit.online_payment_processing_system;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService =
                context.getBean(OrderService.class);

        orderService.placeOrder();

        BillingService billingService =
                context.getBean(BillingService.class);

        billingService.generateBill();

        context.close();
    }
}
