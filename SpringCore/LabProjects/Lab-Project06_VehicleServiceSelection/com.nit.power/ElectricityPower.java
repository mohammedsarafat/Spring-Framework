package com.nit.power;

import org.springframework.stereotype.Component;

@Component("electricityPower")
public class ElectricityPower implements PowerSource {

    @Override
    public String supplyPower() {
        return "Electricity";
    }
}
