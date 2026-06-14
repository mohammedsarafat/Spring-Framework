package com.nit.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.entity.CurrencyTransaction;
import com.nit.service.CurrencyConverterService;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Customer Name: ");
		String customerName = sc.nextLine();

		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter Source Currency: ");
		String sourceCurrency = sc.nextLine();

		System.out.print("Enter Target Currency: ");
		String targetCurrency = sc.nextLine();

		System.out.print("Enter Provider: ");
		String provider = sc.nextLine();

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CurrencyConverterService service = context.getBean(CurrencyConverterService.class);

		CurrencyTransaction transaction = new CurrencyTransaction(101, customerName, sourceCurrency, targetCurrency,
				amount);

		service.convertCurrency(transaction);

		sc.close();
	}
}
