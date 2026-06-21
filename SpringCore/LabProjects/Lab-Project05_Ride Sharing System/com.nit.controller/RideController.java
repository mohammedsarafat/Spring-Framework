package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.beans.Auto;
import com.nit.beans.Bike;
import com.nit.beans.Car;
import com.nit.beans.PaymentMethod;

@Component
public class RideController {

	@Autowired
	private Car car;

	@Autowired
	private Bike bike;

	@Autowired
	private Auto auto;

	@Autowired
	@Qualifier("card")
	private PaymentMethod cardPayment;

	@Autowired
	@Qualifier("wallet")
	private PaymentMethod walletPayment;

	@Autowired
	@Qualifier("cash")
	private PaymentMethod cashPayment;

	public void bookCar(double amount) {
		System.out.println(car.ride());
		System.out.println(cardPayment.pay(amount));
		System.out.println();
	}

	public void bookBike(double amount) {
		System.out.println(bike.ride());
		System.out.println(walletPayment.pay(amount));
		System.out.println();
	}

	public void bookAuto(double amount) {
		System.out.println(auto.ride());
		System.out.println(cashPayment.pay(amount));
		System.out.println();
	}
}
