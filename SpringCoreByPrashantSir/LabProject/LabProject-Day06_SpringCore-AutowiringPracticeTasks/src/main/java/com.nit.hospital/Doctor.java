package com.nit.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

    private Patient patient;

    @Autowired
    public Doctor(Patient patient) {
        this.patient = patient;
    }

    public void diagnose() {

        System.out.println("Doctor Started Diagnosis");

        patient.treatment();
    }
}
