package com.nit.practice02;

public class MainApp {

    public static void main(String[] args) {

        Class<Vehicle> clazz = Vehicle.class;

        VehicleInfo info = clazz.getAnnotation(VehicleInfo.class);

        System.out.println("Brand   : " + info.brand());
        System.out.println("Model   : " + info.model());
        System.out.println("Year    : " + info.manufactureYear());
    }
}
