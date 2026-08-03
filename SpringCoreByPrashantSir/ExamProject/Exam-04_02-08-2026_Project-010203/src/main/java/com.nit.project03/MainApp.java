package com.nit.project03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        VehicleInsurance insurance = context.getBean(VehicleInsurance.class);

        insurance.displayInsuranceDetails();
    }
}
