package com.nit;

public class ZomatoDelivery implements DeliveryService {

	@Override
	public void deliverOrder() {
		IO.println("Order is deliver using Zomato delivery.");
	}

}
