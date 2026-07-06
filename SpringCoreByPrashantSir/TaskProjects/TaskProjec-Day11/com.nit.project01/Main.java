package com.nit.project01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/project01/applicationContext.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book);

        ((ClassPathXmlApplicationContext) context).close();
    }
}