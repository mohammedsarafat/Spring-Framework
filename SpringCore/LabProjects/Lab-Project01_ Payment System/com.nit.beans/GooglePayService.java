package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("googlePayService")
public class GooglePayService implements PaymentService{

	@Override
	public void pay(double amount) {
		IO.println("Paid ₹"+amount+" using GooglePay");
	}
}
