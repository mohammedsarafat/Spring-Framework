package com.nit.shipment;

public class Bluedart implements IShipment {

    private String trackingId;

    public Bluedart(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public boolean verifyShipment() {

        int index = trackingId.indexOf("#");

        if(index==-1)
            return false;

        String code = trackingId.substring(0,index);
        String number = trackingId.substring(index+1);

        return code.equals("BD") && number.length()==10;
    }
}
