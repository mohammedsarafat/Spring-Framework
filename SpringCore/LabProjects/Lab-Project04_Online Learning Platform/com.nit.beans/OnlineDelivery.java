package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("online")
public class OnlineDelivery implements DeliveryMode{

	@Override
	public String deliver(String courseName) {
		
		return "Live Online";
	}
}
