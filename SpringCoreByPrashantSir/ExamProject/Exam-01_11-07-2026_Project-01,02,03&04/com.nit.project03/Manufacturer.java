package com.nit.project03;
public class Manufacturer {

	private int manufacturerId;
	private String manufacturerName;
	private String country;

	public Manufacturer(int manufacturerId, String manufacturerName, String country) {

		this.manufacturerId = manufacturerId;
		this.manufacturerName = manufacturerName;
		this.country = country;
	}

	@Override
	public String toString() {
		return manufacturerName + " (ID : " + manufacturerId + ", Country : " + country + ")";
	}
}

