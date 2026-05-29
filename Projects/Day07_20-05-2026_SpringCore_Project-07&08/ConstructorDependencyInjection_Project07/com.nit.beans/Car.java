package com.nit.beans;

public class Car {
	private String c_name;
	private String c_model;
	private double c_price;
	private String color;
	
	private Engine e;
	
	public Car(String c_name, String c_model, double c_price, String color, Engine e) {
		super();
		this.c_name = c_name;
		this.c_model = c_model;
		this.c_price = c_price;
		this.color = color;
		this.e = e;
	}

	@Override
	public String toString() {
		return "Car [c_name=" + c_name + ", c_model=" + c_model + ", c_price=" + c_price + ", color=" + color + ", e="
				+ e + "]";
	}

	public void display() {
		IO.println("Car Name is: "+c_name);
		IO.println("Car Model is: "+c_model);
		IO.println("Car Price is: "+c_price);
		IO.println("Car Color is: "+color);
		IO.println("Car Engine is: "+e);
	}
}
