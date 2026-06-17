package com.nit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.PaymentProcessor;
import com.nit.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PaymentProcessor p = context.getBean(PaymentProcessor.class);
		p.processPayment(2500);
	}

}
