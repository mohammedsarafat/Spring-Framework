package com.nit.shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext-shopping.xml");

        ShoppingCart cart =
                context.getBean(ShoppingCart.class);

        cart.checkout();
    }
}
