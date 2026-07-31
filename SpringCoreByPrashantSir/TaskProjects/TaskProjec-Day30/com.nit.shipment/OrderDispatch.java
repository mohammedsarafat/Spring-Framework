package com.nit.shipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dispatch")
public class OrderDispatch {

    private IShipment shipment;

    @Autowired
    public void setShipment(IShipment shipment) {
        this.shipment = shipment;
    }

    public void dispatchOrder() {

        if(shipment.verifyShipment())
            System.out.println("Order dispatched via " + courierName());
        else
            System.out.println("Shipment details invalid, please recheck tracking ID");
    }

    public String courierName() {

        if(shipment instanceof Bluedart)
            return "Bluedart";

        if(shipment instanceof Delhivery)
            return "Delhivery";

        if(shipment instanceof DTDC)
            return "DTDC";

        if(shipment instanceof Fedex)
            return "Fedex";

        return "Unknown";
    }
}
