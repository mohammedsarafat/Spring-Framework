package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Book;

public class Test
{
    public static void main(String[] args)
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/nit/resources/applicationContext.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
