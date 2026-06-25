package com.nit.service;

import org.springframework.stereotype.Service;

@Service("bikeService")
public class BikeService implements VehicleService {

    @Override
    public void performService() {
        System.out.println("Bike maintenance service completed.");
    }
}
