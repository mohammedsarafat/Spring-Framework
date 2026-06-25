package com.nit.center;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.service.VehicleService;

@Component
public class ServiceCenter {

    @Autowired
    @Qualifier("carService")
    private VehicleService vehicleService;

    public void serviceVehicle() {
        vehicleService.performService();
    }
}
