package com.nit.service;

import org.springframework.stereotype.Service;

@Service("carService")
public class CarService implements VehicleService {

    @Override
    public void performService() {
        System.out.println("Car maintenance service completed.");
    }
}
