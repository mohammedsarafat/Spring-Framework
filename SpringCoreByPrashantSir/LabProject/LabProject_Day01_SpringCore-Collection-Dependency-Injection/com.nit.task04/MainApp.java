package com.nit.task04;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nit/task04/applicationContext.xml");
        DepartmentAllocation bean = context.getBean("department",DepartmentAllocation.class);
        IO.println(bean);
    }
}
