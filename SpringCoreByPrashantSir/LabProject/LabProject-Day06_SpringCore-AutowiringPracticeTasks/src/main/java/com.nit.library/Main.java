package com.nit.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext-library.xml");

        Library library = context.getBean(Library.class);

        library.issueBook();
    }
}
