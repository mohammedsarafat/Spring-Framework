package com.nit.power;

import org.springframework.stereotype.Component;

@Component("solarPower")
public class SolarPower implements PowerSource {

    @Override
    public String supplyPower() {
        return "Solar Power";
    }
}
