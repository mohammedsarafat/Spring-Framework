package com.nit.beans;

public class ElectricityBillGenerator {

    private int unitsConsumed;
    private double ratePerUnit;

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    public double generateBill() {
        return unitsConsumed * ratePerUnit;
    }
}
