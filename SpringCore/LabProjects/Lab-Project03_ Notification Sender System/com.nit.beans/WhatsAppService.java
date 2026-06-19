package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("whatsAppService")
public class WhatsAppService implements MessageService{

	@Override
	public void send(String message) {
		IO.println("SMS sent: "+message);
	}
}
