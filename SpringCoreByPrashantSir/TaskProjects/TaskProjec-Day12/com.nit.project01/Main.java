package com.nit.project01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/project01/applicationContext.xml");

        FoodCart cart = context.getBean("foodCart", FoodCart.class);
        
        System.out.println(cart);
    }
}