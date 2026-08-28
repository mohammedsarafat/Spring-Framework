package com.nit.smartparkingmanagementsystem;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ParkingOperation parkingOperation =
                context.getBean(ParkingOperation.class);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SMART PARKING MANAGEMENT SYSTEM =====");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Show Available Parking Slots");
            System.out.println("4. Generate Daily Parking Report");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    parkingOperation.vehicleEntry();
                    break;

                case 2:
                    parkingOperation.vehicleExit();
                    break;

                case 3:
                    parkingOperation.showAvailableSlots();
                    break;

                case 4:

                    ParkingReport parkingReport =
                            context.getBean(ParkingReport.class);

                    parkingReport.generateReport();
                    break;

                case 5:

                    System.out.println(
                            "Thank you for using Smart Parking System.");

                    context.close();
                    scanner.close();

                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
