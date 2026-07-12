package com.nit.project03;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vehicle {

	private int vehicleId;
	private String vehicleName;
	private Manufacturer manufacturer;
	private List<String> features;
	private Set<String> fuelTypes;
	private Map<String, String> serviceSchedule;

	public Vehicle(int vehicleId, String vehicleName, Manufacturer manufacturer, List<String> features,
			Set<String> fuelTypes, Map<String, String> serviceSchedule) {

		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.manufacturer = manufacturer;
		this.features = features;
		this.fuelTypes = fuelTypes;
		this.serviceSchedule = serviceSchedule;
	}

	@Override
	public String toString() {
		return "Vehicle Details\n" 
				+ "--------------------" 
				+ "\nVehicle Id        : " + vehicleId
				+ "\nVehicle Name      : " + vehicleName 
				+ "\nManufacturer      : " + manufacturer
				+ "\nFeatures          : " + features 
				+ "\nFuel Types        : " + fuelTypes 
				+ "\nService Schedule  : " + serviceSchedule;
	}
}
