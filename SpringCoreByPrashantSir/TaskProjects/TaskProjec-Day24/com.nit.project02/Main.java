package com.nit.project02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ParkingOperation operation =
                context.getBean(ParkingOperation.class);

        operation.menu();

	}

}
