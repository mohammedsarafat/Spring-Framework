package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.DiscountCalculator;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        DiscountCalculator calculator =
                context.getBean("discountCalculator", DiscountCalculator.class);

        System.out.println("Discounted Price: " + calculator.calculateDiscount());
    }
}
