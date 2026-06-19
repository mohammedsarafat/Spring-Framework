package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService{

	@Override
	public void send(String message) {
		IO.println("Email sent: "+message);
	}
}
