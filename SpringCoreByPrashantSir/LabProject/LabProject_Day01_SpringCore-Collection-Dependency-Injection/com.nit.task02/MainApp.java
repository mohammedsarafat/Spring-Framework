package com.nit.task02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/nit/task02/applicationContext.xml");
        TrainingInstitute bean = context.getBean("medicine",TrainingInstitute.class);
		IO.println(bean);
	}
}
