package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("classroom")
public class ClassroomDelivery implements DeliveryMode{

	@Override
	public String deliver(String courseName) {
		
		return "In-Person Classroom";
	}
}
