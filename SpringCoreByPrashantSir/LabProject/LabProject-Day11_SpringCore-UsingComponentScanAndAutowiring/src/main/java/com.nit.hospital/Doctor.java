package com.nit.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Doctor {

    @Autowired
    private Patient patient;

    public void consult() {

        System.out.println("Doctor is consulting the patient.");

        patient.getPatientDetails();
    }
}
