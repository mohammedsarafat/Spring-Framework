package com.nit.appliance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.power.PowerSource;

@Component("fan")
public class Fan implements Appliance {

    @Autowired
    @Qualifier("electricityPower")
    private PowerSource powerSource;

    @Override
    public void operate() {
        System.out.println("Fan is running using "
                + powerSource.supplyPower());
    }
}
