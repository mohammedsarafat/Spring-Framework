package com.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        DeliveryAgent agent = context.getBean(DeliveryAgent.class);
        agent.deliverOrder();
    }
}
