package com.nit;

public class Fedex implements IShipment {

    private String vendorCode;
    private String trackingNumber;

    public Fedex(String vendorCode,
                 String trackingNumber) {

        this.vendorCode = vendorCode;
        this.trackingNumber = trackingNumber;
    }

    @Override
    public boolean verifyShipment() {

        boolean validVendor =
                vendorCode.equals("FEDEX-IN")
                || vendorCode.equals("FEDEX-US");

        boolean validTracking =
                trackingNumber.length() == 10;

        return validVendor && validTracking;
    }
}
