package com.nit;

import com.nit.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				com.nit.config.AppConfig.class);

		StudentService service = context.getBean(StudentService.class);

		Scanner scanner = new Scanner(System.in);

		// Task 1
		Integer count = service.getStudentCount();

		System.out.println("Number of Students : " + count);

		// Input
		System.out.print("\nEnter Student Id : ");

		int studentId = scanner.nextInt();

		// Task 2
		String name = service.getStudentName(studentId);

		System.out.println("\nStudent Name : " + name);

		// Task 3
		Double fees = service.getStudentFees(studentId);

		System.out.println("\nFees : " + fees);

		scanner.close();
		context.close();
	}
}
