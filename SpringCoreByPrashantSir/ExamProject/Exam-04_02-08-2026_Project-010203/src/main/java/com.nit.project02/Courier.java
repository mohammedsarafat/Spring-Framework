package com.nit.project02;

public class Courier {

    private String senderName;
    private String receiverName;
    private double packageWeight;
    private double distance;
    private double chargePerKilogram;
    private double deliveryCharge;
    private double gstPercentage;


    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getChargePerKilogram() {
        return chargePerKilogram;
    }

    public void setChargePerKilogram(double chargePerKilogram) {
        this.chargePerKilogram = chargePerKilogram;
    }

    public double getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public double getGstPercentage() {
        return gstPercentage;
    }

    public void setGstPercentage(double gstPercentage) {
        this.gstPercentage = gstPercentage;
    }

    public void displayCourierDetails() {

        double weightCharge = packageWeight * chargePerKilogram;
        double totalCharge = weightCharge + deliveryCharge;
        double gstAmount = totalCharge * gstPercentage / 100;
        double finalDeliveryCharge = totalCharge + gstAmount;

        System.out.println("========== Courier Details ==========");
        System.out.println("Sender Name          : " + senderName);
        System.out.println("Receiver Name        : " + receiverName);
        System.out.println("Package Weight (kg)  : " + packageWeight);
        System.out.println("Distance (km)        : " + distance);
        System.out.println("Charge Per Kg        : " + chargePerKilogram);
        System.out.println("Delivery Charge      : " + deliveryCharge);
        System.out.println("GST Percentage       : " + gstPercentage + "%");

        System.out.println("-------------------------------------");
        System.out.println("Weight Charge        : " + weightCharge);
        System.out.println("Total Charge         : " + totalCharge);
        System.out.println("GST Amount           : " + gstAmount);
        System.out.println("Final Delivery Charge: " + finalDeliveryCharge);
    }
}
