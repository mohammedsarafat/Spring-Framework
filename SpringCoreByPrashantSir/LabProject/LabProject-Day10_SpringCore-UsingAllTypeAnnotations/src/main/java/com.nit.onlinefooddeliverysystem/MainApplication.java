package com.nit.onlinefooddeliverysystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService =
                context.getBean(OrderService.class);

        orderService.placeOrder();

        Customer customer1 =
                context.getBean(Customer.class);

        customer1.showCustomer();

        Customer customer2 =
                context.getBean(Customer.class);

        customer2.showCustomer();

        System.out.println("Customer Object 1 : " + customer1);
        System.out.println("Customer Object 2 : " + customer2);

        System.out.println(
                "Are both Customer objects different? "
                        + (customer1 != customer2)
        );

        context.close();
    }
}
