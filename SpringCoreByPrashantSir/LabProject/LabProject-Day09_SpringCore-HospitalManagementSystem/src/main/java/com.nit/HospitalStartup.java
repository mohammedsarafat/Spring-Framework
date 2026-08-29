package com.nit;

import org.springframework.stereotype.Component;

@Component
public class HospitalStartup {

    public HospitalStartup() {

        System.out.println("======================================");
        System.out.println("Starting Hospital Server...");
        System.out.println("Verifying Doctor Credentials...");
        System.out.println("Connecting to Patient Database...");
        System.out.println("Establishing Network Connection...");
        System.out.println("Hospital is Ready");
        System.out.println("======================================");
    }
}
