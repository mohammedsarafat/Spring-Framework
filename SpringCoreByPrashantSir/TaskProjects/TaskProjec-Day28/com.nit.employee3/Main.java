package com.nit.employee3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


        Employee employee = context.getBean(Employee.class);

        System.out.println(employee);
        
    }
}
