package com.nit.bankmanagementsystem;

import org.springframework.stereotype.Component;

@Component
public class BankStartup {

    public BankStartup() {

        System.out.println("================================");

        System.out.println("Starting Bank Server...");
        System.out.println("Verifying Security Certificates...");
        System.out.println("Connecting to Database...");
        System.out.println("Establishing Network Connection...");

        System.out.println("Bank is Ready");

        System.out.println("================================");
    }
}
