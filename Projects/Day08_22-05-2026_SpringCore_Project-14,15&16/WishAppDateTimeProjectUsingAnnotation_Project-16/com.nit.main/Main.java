package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.WishMessageGenerator;
import com.nit.config.AppConfig;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        WishMessageGenerator generator =
                context.getBean(WishMessageGenerator.class);

        System.out.println(generator.generateWishMessage());
    }
}
