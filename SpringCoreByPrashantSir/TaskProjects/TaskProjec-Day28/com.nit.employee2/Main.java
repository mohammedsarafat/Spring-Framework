package com.nit.employee2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/employee2/applicationContext.xml");

        Employee employee = context.getBean(Employee.class);

        System.out.println(employee);
        
    }
}
