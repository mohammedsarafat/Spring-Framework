package com.nit.employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/employee/applicationContext.xml");

        Employee employee = context.getBean(Employee.class);

        System.out.println(employee);
    }
}
