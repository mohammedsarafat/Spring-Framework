package com.nit.appliance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.power.PowerSource;

@Component("light")
public class Light implements Appliance {

    @Autowired
    @Qualifier("solarPower")
    private PowerSource powerSource;

    @Override
    public void operate() {
        System.out.println("Light is ON using "
                + powerSource.supplyPower());
    }
}
