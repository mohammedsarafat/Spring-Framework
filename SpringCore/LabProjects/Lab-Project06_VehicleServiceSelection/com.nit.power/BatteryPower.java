package com.nit.power;

import org.springframework.stereotype.Component;

@Component("batteryPower")
public class BatteryPower implements PowerSource {

    @Override
    public String supplyPower() {
        return "Battery Power";
    }
}
