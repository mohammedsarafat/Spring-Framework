package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nit.appliance.Appliance;

@Controller
public class HomeController {

    @Autowired
    @Qualifier("light")
    private Appliance light;

    @Autowired
    @Qualifier("fan")
    private Appliance fan;

    @Autowired
    @Qualifier("airConditioner")
    private Appliance airConditioner;

    @Autowired
    @Qualifier("heater")
    private Appliance heater;

    public void controlLight() {
        light.operate();
    }

    public void controlFan() {
        fan.operate();
    }

    public void controlAC() {
        airConditioner.operate();
    }

    public void controlHeater() {
        heater.operate();
    }
}
