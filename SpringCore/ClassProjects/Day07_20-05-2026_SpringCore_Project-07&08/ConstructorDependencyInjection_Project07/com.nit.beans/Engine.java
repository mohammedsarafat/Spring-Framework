package com.nit.beans;

public class Engine {
	private int e_id;
	private String e_type;
	private double e_price;

	public Engine(int e_id, String e_type, double e_price) {
		super();
		this.e_id = e_id;
		this.e_type = e_type;
		this.e_price = e_price;
	}

	@Override
	public String toString() {
		return "Engine [e_id=" + e_id + ", e_type=" + e_type + ", e_price=" + e_price + "]";
	}

	public void display() {
		IO.println("Engine Id is: " + e_id);
		IO.println("Engine Type is: " + e_type);
		IO.println("Engine Price is: " + e_price);
	}
}
