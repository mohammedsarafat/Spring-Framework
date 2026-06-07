package com.nit.beans;

public class Vehicle {
	private int vNumber;
	private String vName;
	private String vOwnerName;

	private Insurance i;
	
	public Vehicle(int vNumber, String vName, String vOwnerName, Insurance i) {
		super();
		this.vNumber = vNumber;
		this.vName = vName;
		this.vOwnerName = vOwnerName;
		this.i = i;
	}

	@Override
	public String toString() {
		return "Vehicle [vNumber=" + vNumber + ", vName=" + vName + ", vOwnerName=" + vOwnerName + "]";
	}

	public void display() {
		IO.println("Vehicle Number is: " + vNumber);
		IO.println("Vehicle Name is: " + vName);
		IO.println("Vehicle OwnerName is: " + vOwnerName);
		IO.println("Vehicle Insurance is: " + i);
	}
}
