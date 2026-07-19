package com.nit.project01;

public class Car {

	private int carId;
	private String carName;
	private String model;
	private String color;
	private double price;

	private Engine engine;

	public Car() {
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void display() {

		IO.println("========= Car Details =========");
		IO.println("Car ID      : " + carId);
		IO.println("Car Name    : " + carName);
		IO.println("Model       : " + model);
		IO.println("Color       : " + color);
		IO.println("Price       : " + price);

		IO.println();
		IO.println(engine);
	}
}
