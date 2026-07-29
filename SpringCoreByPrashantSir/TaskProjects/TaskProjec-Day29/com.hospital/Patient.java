package com.hospital;

import org.springframework.stereotype.Component;

@Component
public class Patient {

    public void getPatientDetails() {
        System.out.println("Patient Name: Rahul");
        System.out.println("Disease: Fever");
    }
}
