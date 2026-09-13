package com.nit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShipmentApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        JavaConfiguration.class
                );

        OrderDispatch dispatch =
                (OrderDispatch) context.getBean("dispatch");

        dispatch.dispatchOrder();

        context.close();
    }
}
