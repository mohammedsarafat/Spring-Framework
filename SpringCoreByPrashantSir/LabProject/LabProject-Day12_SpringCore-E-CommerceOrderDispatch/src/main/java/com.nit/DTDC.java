package com.nit;

public class DTDC implements IShipment {

    private String trackingId;

    public DTDC(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public boolean verifyShipment() {

        int firstSlash =
                trackingId.indexOf("/");

        int lastSlash =
                trackingId.lastIndexOf("/");

        if (firstSlash == -1 ||
            lastSlash == -1 ||
            firstSlash == lastSlash) {

            return false;
        }

        String courierCode =
                trackingId.substring(0, firstSlash);

        String branchCode =
                trackingId.substring(
                        firstSlash + 1,
                        lastSlash
                );

        String number =
                trackingId.substring(lastSlash + 1);

        return courierCode.equals("DTDC")
                && branchCode.length() == 3
                && number.length() == 8;
    }
}
