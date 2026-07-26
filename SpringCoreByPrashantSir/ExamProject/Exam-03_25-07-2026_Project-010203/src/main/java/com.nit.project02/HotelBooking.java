package com.nit.project02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HotelBooking {

    @Value("${guest.name}")
    private String guestName;

    @Value("${room.price}")
    private double roomPrice;

    @Value("${number.of.days}")
    private int numberOfDays;

    @Value("${food.charges}")
    private double foodCharges;

    @Value("${service.tax}")
    private double serviceTaxPercentage;

    public void displayBill() {

        double roomCharges = roomPrice * numberOfDays;
        double subtotal = roomCharges + foodCharges;
        double serviceTax = subtotal * serviceTaxPercentage / 100;
        double finalBill = subtotal + serviceTax;

        System.out.println("========== Hotel Booking Bill ==========");
        System.out.println("Guest Name          : " + guestName);
        System.out.println("Room Price/Day      : " + roomPrice);
        System.out.println("Number of Days      : " + numberOfDays);
        System.out.println("Food Charges        : " + foodCharges);
        System.out.println("Service Tax (%)     : " + serviceTaxPercentage);

        System.out.println("----------------------------------------");
        System.out.println("Room Charges        : " + roomCharges);
        System.out.println("Subtotal            : " + subtotal);
        System.out.println("Service Tax         : " + serviceTax);
        System.out.println("Final Bill          : " + finalBill);
        System.out.println("========================================");
    }
}
