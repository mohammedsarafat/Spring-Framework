package com.nit.appliance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.power.PowerSource;

@Component("airConditioner")
public class AirConditioner implements Appliance {

    @Autowired
    @Qualifier("batteryPower")
    private PowerSource powerSource;

    @Override
    public void operate() {
        System.out.println("Air Conditioner cooling using "
                + powerSource.supplyPower());
    }
}
