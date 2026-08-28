package com.nit.smartparkingmanagementsystem;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("parkingStartup")
@Getter
@Setter
public class ParkingOperation {

    private int totalSlots = 100;
    private int occupiedSlots = 0;

    public void vehicleEntry() {

        if (occupiedSlots < totalSlots) {

            occupiedSlots++;

            System.out.println("Vehicle Entry Successful.");
            System.out.println("Occupied Slots: " + occupiedSlots);
            System.out.println("Available Slots: "
                    + (totalSlots - occupiedSlots));

        } else {

            System.out.println("Parking Full.");
        }
    }

    public void vehicleExit() {

        if (occupiedSlots > 0) {

            occupiedSlots--;

            System.out.println("Vehicle Exit Successful.");
            System.out.println("Available Slots: "
                    + (totalSlots - occupiedSlots));

        } else {

            System.out.println("No vehicles are currently parked.");
        }
    }

    public void showAvailableSlots() {

        System.out.println("Total Parking Slots: " + totalSlots);
        System.out.println("Occupied Slots: " + occupiedSlots);
        System.out.println("Available Slots: "
                + (totalSlots - occupiedSlots));
    }
}
