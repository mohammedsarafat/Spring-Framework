package com.nit.shopping;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService =
                context.getBean(OrderService.class);

        orderService.placeOrder();

        context.close();
    }
}
