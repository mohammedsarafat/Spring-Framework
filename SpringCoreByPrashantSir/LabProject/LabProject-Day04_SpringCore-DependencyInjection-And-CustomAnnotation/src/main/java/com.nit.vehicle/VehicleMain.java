package com.nit.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Class<Vehicle> obj = Vehicle.class;
        VehicleInfo vehicleInfo = obj.getAnnotation(VehicleInfo.class);
        IO.println("Brand   : " + vehicleInfo.brand());
        IO.println("Model   : " + vehicleInfo.model());
        IO.println("Year    : " + vehicleInfo.manufactureYear());
        IO.println("--------------------------------------");
        System.out.println("Brand   : " + vehicleInfo.brand());
        IO.println("Model   : " + vehicleInfo.model());
        IO.println("Year    : " + vehicleInfo.manufactureYear());
    }
}
