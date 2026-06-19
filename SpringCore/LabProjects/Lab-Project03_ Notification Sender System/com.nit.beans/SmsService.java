package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements MessageService{

	@Override
	public void send(String message) {
		IO.println("SMS sent: "+message);
	}
}
