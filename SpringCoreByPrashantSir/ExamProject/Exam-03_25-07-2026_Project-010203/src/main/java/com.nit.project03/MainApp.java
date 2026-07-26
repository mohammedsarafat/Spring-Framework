package com.nit.project03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        IO.println("Spring Container Started");
        ResultService resultService = context.getBean(ResultService.class);
        resultService.generateResult();
    
    }
}
