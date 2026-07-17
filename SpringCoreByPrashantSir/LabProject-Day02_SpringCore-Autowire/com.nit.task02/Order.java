package com.nit.task02;

public class Order {

	private int orderId;
	private String customerName;
	private String foodItem;

	private DeliveryPartner deliveryPartner;

	public Order() {
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public DeliveryPartner getDeliveryPartner() {
		return deliveryPartner;
	}

	public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
		this.deliveryPartner = deliveryPartner;
	}

	public void displayOrderDetails() {

		System.out.println("Order Id : " + orderId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Food Item : " + foodItem);

		System.out.println("Delivery Partner");
		System.out.println(deliveryPartner);
	}
}
