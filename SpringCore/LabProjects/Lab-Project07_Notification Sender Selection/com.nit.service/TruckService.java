package com.nit.service;

import org.springframework.stereotype.Service;

@Service("truckService")
public class TruckService implements VehicleService {

    @Override
    public void performService() {
        System.out.println("Truck maintenance service completed.");
    }
}
