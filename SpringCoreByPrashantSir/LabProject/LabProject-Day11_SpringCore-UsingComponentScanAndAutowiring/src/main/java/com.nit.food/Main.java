package com.nit.food;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        DeliveryAgent deliveryAgent =
                context.getBean(DeliveryAgent.class);

        deliveryAgent.deliverOrder();

        context.close();
    }
}
