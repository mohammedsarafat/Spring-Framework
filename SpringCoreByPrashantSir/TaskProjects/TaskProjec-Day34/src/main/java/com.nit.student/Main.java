package com.nit.student;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentDao dao = context.getBean(StudentDao.class);

		System.out.println("Number of Students : " + dao.getStudentCount());

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Id : ");
		int studentId = sc.nextInt();

		System.out.println("Student Name : " + dao.getStudentNameById(studentId));

		System.out.println("Fees : " + dao.getStudentFeesById(studentId));

		sc.close();
		((AnnotationConfigApplicationContext) context).close();
	}
}
