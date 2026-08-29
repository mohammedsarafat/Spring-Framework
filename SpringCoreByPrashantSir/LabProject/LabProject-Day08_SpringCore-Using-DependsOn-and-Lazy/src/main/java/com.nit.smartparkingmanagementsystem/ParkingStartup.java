package com.nit.smartparkingmanagementsystem;

import org.springframework.stereotype.Component;

@Component
public class ParkingStartup {

    public ParkingStartup() {

        System.out.println("======================================");
        System.out.println("Initializing Parking Infrastructure...");
        System.out.println("======================================");

        System.out.println("Activating Parking Gate Sensors...");
        System.out.println("Initializing CCTV Cameras...");
        System.out.println("Connecting Payment Gateway...");
        System.out.println("Starting Vehicle Detection System...");

        System.out.println("======================================");
        System.out.println("Parking System Ready");
        System.out.println("======================================");
    }
}
