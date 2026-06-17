package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("paytmPaymentService")
public class PaytmPaymentService implements PaymentService{

	@Override
	public void pay(double amount) {
		IO.println("Paid ₹"+amount+" using Paytm");
	}
}
