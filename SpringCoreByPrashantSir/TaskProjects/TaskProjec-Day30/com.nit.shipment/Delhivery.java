package com.nit.shipment;

public class Delhivery implements IShipment {

    private String trackingId;

    public Delhivery(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public boolean verifyShipment() {

        int index = trackingId.indexOf("#");

        if(index==-1)
            return false;

        String courier = trackingId.substring(0,2);
        String state = trackingId.substring(2,index);
        String number = trackingId.substring(index+1);

        return courier.equals("DL")
                && state.length()==2
                && number.length()==12;
    }
}
