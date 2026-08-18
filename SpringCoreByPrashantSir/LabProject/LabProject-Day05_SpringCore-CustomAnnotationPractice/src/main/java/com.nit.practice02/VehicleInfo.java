package com.nit.practice02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface VehicleInfo {

    String brand();

    String model();

    int manufactureYear();
}
