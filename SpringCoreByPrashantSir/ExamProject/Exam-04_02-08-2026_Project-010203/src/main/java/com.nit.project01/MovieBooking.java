package com.nit.project01;

public class MovieBooking {

    private String customerName;
    private String movieName;
    private int numberOfTickets;
    private double ticketPrice;
    private double convenienceCharge;
    private double discountPercentage;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getConvenienceCharge() {
        return convenienceCharge;
    }

    public void setConvenienceCharge(double convenienceCharge) {
        this.convenienceCharge = convenienceCharge;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void displayBookingDetails() {

        double ticketCost = numberOfTickets * ticketPrice;
        double discountAmount = ticketCost * discountPercentage / 100;
        double amountAfterDiscount = ticketCost - discountAmount;
        double finalBookingAmount = amountAfterDiscount + convenienceCharge;

        System.out.println("========= Movie Ticket Booking =========");
        System.out.println("Customer Name        : " + customerName);
        System.out.println("Movie Name           : " + movieName);
        System.out.println("Number of Tickets    : " + numberOfTickets);
        System.out.println("Ticket Price         : " + ticketPrice);
        System.out.println("Convenience Charge   : " + convenienceCharge);
        System.out.println("Discount Percentage  : " + discountPercentage + "%");

        System.out.println("----------------------------------------");
        System.out.println("Ticket Cost          : " + ticketCost);
        System.out.println("Discount Amount      : " + discountAmount);
        System.out.println("Amount After Discount: " + amountAfterDiscount);
        System.out.println("Final Booking Amount : " + finalBookingAmount);
    }
}
