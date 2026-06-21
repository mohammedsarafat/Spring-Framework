package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPayment implements PaymentMethod{

	@Override
	public String pay(double amount) {
		return "Paid "+amount+" in Card";
	}
}
