package com.nit.project02;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("startup")
public class ParkingOperation {

    @Autowired
    private ApplicationContext context;

    public void menu() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("========= Smart Parking =========");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Show Available Parking Slots");
            System.out.println("4. Generate Daily Parking Report");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.println("Vehicle Entered Successfully.");
                break;

            case 2:

                System.out.println("Vehicle Exited Successfully.");
                break;

            case 3:

                System.out.println("Available Parking Slots : 120");
                break;

            case 4:

                ParkingReport report = context.getBean(ParkingReport.class);
                report.generateReport();
                break;

            case 5:

                System.out.println("Thank You...");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice.");

            }

        }

    }

}
