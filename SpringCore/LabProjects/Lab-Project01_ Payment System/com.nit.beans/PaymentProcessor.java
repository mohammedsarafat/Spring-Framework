package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {
	
	@Autowired()
	@Qualifier("googlePayService")
	private PaymentService p;
	
    public void processPayment(double amount) {    	
		p.pay(amount);
    }
    
}
