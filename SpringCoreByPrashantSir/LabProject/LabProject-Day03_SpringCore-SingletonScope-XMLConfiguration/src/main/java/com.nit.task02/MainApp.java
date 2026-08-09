package com.nit.task02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Create Spring Container
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "com/nit/task02/applicationContext.xml");

        // Retrieve bean first time
        AmbulanceService service1 =
                context.getBean(
                        "ambulanceService",
                        AmbulanceService.class);

        // Retrieve bean second time
        AmbulanceService service2 =
                context.getBean(
                        "ambulanceService",
                        AmbulanceService.class);

        System.out.println("=================================");
        System.out.println("       OBJECT REFERENCES");
        System.out.println("=================================");

        System.out.println("Service 1 : " + service1);
        System.out.println("Service 2 : " + service2);

        // Verify Singleton
        System.out.println();
        System.out.println("Are both objects same? "
                + (service1 == service2));

        // Display service details
        System.out.println();

        service1.displayServiceDetails();

        // Close Spring Container
        ((ClassPathXmlApplicationContext) context).close();
    }
}
