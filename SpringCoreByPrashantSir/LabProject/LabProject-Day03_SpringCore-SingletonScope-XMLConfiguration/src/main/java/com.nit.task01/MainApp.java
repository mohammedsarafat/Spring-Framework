package com.nit.task01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Create Spring Container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/task01/applicationContext.xml");

        // Retrieve bean first time
        ConfigurationManager config1 =
                context.getBean("configurationManager", ConfigurationManager.class);

        // Retrieve bean second time
        ConfigurationManager config2 =
                context.getBean("configurationManager", ConfigurationManager.class);

        // Print object references
        System.out.println("First Object  : " + config1);
        System.out.println("Second Object : " + config2);

        // Check whether both references point to same object
        System.out.println("Are both objects same? : " + (config1 == config2));

        System.out.println();

        // Print properties
        System.out.println("Configuration Details");
        System.out.println("---------------------");

        System.out.println("Application Name : "
                + config1.getApplicationName());

        System.out.println("Environment      : "
                + config1.getEnvironment());

        // Close Spring container
        ((ClassPathXmlApplicationContext) context).close();
    }
}
