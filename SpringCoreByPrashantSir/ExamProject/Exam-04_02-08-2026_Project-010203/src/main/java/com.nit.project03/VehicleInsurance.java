package com.nit.project03;

public class VehicleInsurance {

    private String ownerName;
    private String vehicleNumber;
    private String vehicleType;
    private double insuranceAmount;
    private double premiumPercentage;
    private double gstPercentage;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public double getPremiumPercentage() {
        return premiumPercentage;
    }

    public void setPremiumPercentage(double premiumPercentage) {
        this.premiumPercentage = premiumPercentage;
    }

    public double getGstPercentage() {
        return gstPercentage;
    }

    public void setGstPercentage(double gstPercentage) {
        this.gstPercentage = gstPercentage;
    }

    public void displayInsuranceDetails() {

        double premiumAmount = insuranceAmount * premiumPercentage / 100;
        double gstAmount = premiumAmount * gstPercentage / 100;
        double renewalAmount = premiumAmount + gstAmount;

        System.out.println("====== Vehicle Insurance Renewal ======");
        System.out.println("Owner Name          : " + ownerName);
        System.out.println("Vehicle Number      : " + vehicleNumber);
        System.out.println("Vehicle Type        : " + vehicleType);
        System.out.println("Insurance Amount    : " + insuranceAmount);
        System.out.println("Premium Percentage  : " + premiumPercentage + "%");
        System.out.println("GST Percentage      : " + gstPercentage + "%");

        System.out.println("---------------------------------------");
        System.out.println("Premium Amount      : " + premiumAmount);
        System.out.println("GST Amount          : " + gstAmount);
        System.out.println("Renewal Amount      : " + renewalAmount);
    }
}
