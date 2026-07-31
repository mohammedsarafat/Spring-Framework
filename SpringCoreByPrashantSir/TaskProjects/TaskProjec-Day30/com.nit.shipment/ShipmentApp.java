package com.nit.shipment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShipmentApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfiguration.class);

        OrderDispatch dispatch =
                context.getBean("dispatch", OrderDispatch.class);

        dispatch.dispatchOrder();
    }
}
