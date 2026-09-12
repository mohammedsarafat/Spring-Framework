package com.nit;

public class Bluedart implements IShipment {

    private String trackingId;

    public Bluedart(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public boolean verifyShipment() {

        int index = trackingId.indexOf("#");

        if (index == -1) {
            return false;
        }

        String courierCode =
                trackingId.substring(0, index);

        String shipmentNumber =
                trackingId.substring(index + 1);

        return courierCode.equals("BD")
                && shipmentNumber.length() == 10;
    }
}
