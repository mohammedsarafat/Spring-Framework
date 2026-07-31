package com.nit.shipment;

public class DTDC implements IShipment {

    private String trackingId;

    public DTDC(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public boolean verifyShipment() {

        int first = trackingId.indexOf("/");
        int last = trackingId.lastIndexOf("/");

        if(first==-1 || last==-1 || first==last)
            return false;

        String courier = trackingId.substring(0,first);
        String branch = trackingId.substring(first+1,last);
        String number = trackingId.substring(last+1);

        return courier.equals("DTDC")
                && branch.length()==3
                && number.length()==8;
    }
}
