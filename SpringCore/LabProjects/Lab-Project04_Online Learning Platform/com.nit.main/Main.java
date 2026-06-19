package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.NotificationService;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		NotificationService n = context.getBean(NotificationService.class);
		n.notifyUser("Meeting at 4 PM");
	}

}
