package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("cash")
public class CashPayment implements PaymentMethod{

	@Override
	public String pay(double amount) {
		return "Paid "+amount+" in Cash";
	}
}
