package com.nit.task03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nit/task03/applicationContext.xml");
        
        LunchCombo bean = context.getBean("resturant",LunchCombo.class);
        IO.print(bean);
    }
}
