package com.nit.project02;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ParkingReport {

    public ParkingReport() {

        System.out.println();
        System.out.println("Loading Parking Report Engine...");
        System.out.println("Reading Parking Records...");
        System.out.println("Calculating Revenue...");
        System.out.println("Generating PDF...");
        System.out.println("Saving Report...");
        System.out.println();

    }

    public void generateReport() {

        System.out.println("Daily Parking Report Generated Successfully.");

    }

}

