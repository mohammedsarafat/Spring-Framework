package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	@Value("100")
	int qty;
	@Value("250")
	double price;
	
	public void tot_price() {
		double tot_price = qty*price;
		IO.println("Total Price is: "+tot_price);
	}
}
