package com.nit.shipment;

public class Fedex implements IShipment {

    private String vendorCode;
    private String trackingNumber;

    public Fedex(String vendorCode, String trackingNumber) {
        this.vendorCode = vendorCode;
        this.trackingNumber = trackingNumber;
    }

    @Override
    public boolean verifyShipment() {

        boolean vendor =
                vendorCode.equals("FEDEX-IN")
                        || vendorCode.equals("FEDEX-US");

        return vendor && trackingNumber.length()==10;
    }
}
