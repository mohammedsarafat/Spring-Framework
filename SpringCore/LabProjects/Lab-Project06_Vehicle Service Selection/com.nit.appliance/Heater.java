package com.nit.appliance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.power.PowerSource;

@Component("heater")
public class Heater implements Appliance {

    @Autowired
    @Qualifier("electricityPower")
    private PowerSource powerSource;

    @Override
    public void operate() {
        System.out.println("Heater heating using "
                + powerSource.supplyPower());
    }
}
