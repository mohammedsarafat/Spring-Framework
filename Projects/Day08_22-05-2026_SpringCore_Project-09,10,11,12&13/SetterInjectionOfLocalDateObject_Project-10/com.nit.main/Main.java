package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.DatePrinter;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        DatePrinter printer = context.getBean("datePrinter", DatePrinter.class);

        printer.printDate();
    }
}
