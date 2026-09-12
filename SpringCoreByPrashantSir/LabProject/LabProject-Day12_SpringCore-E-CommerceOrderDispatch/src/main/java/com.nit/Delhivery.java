package com.nit;

public class Delhivery implements IShipment {

    private String trackingId;

    public Delhivery(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public boolean verifyShipment() {

        int hashIndex =
                trackingId.indexOf("#");

        if (hashIndex == -1) {
            return false;
        }

        String courierCode =
                trackingId.substring(0, 2);

        String stateCode =
                trackingId.substring(2, hashIndex);

        String shipmentNumber =
                trackingId.substring(hashIndex + 1);

        return courierCode.equals("DL")
                && stateCode.length() == 2
                && shipmentNumber.length() == 12;
    }
}
