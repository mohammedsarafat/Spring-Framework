package com.nit.smartparkingmanagementsystem;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Getter
@Setter
public class ParkingReport {

    private double totalRevenue = 0;

    public ParkingReport() {

        System.out.println("**************************************");
        System.out.println("Parking Report Engine Initialized...");
        System.out.println("**************************************");
    }

    public void generateReport() {

        System.out.println("--------------------------------------");
        System.out.println("Generating Daily Parking Report...");
        System.out.println("Reading parking records...");
        System.out.println("Calculating total revenue...");
        System.out.println("Generating PDF report...");
        System.out.println("Storing report in database...");
        System.out.println("Daily Parking Report Generated Successfully.");
        System.out.println("--------------------------------------");
    }
}
