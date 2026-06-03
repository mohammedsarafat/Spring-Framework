package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.WishMessageGenerator;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        WishMessageGenerator generator =
                context.getBean("wishGenerator", WishMessageGenerator.class);

        IO.println(generator.generateWishMessage());
    }
}
