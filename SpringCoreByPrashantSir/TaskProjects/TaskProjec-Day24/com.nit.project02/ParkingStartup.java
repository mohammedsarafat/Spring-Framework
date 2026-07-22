package com.nit.project02;

import org.springframework.stereotype.Component;

@Component("startup")
public class ParkingStartup {

    public ParkingStartup() {

        System.out.println("==================================");
        System.out.println("🚧 Activate Parking Gate Sensors");
        System.out.println("📷 Initialize CCTV Cameras");
        System.out.println("💳 Connect Payment Gateway");
        System.out.println("🖥️ Start Vehicle Detection System");
        System.out.println("✅ Parking System Ready");
        System.out.println("==================================");

    }
}
