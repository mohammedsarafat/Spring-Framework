package com.nit;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@DependsOn("hospitalStartup")
@Data
public class PatientService {

    private int patientCount = 0;

    public void registerPatient(String name) {

        patientCount++;

        System.out.println("Patient Registered Successfully.");
        System.out.println("Patient Name: " + name);
        System.out.println("Patient ID: " + patientCount);
    }

    public void searchPatient(String name) {

        System.out.println("Searching patient: " + name);

        if (patientCount > 0) {
            System.out.println("Patient search completed.");
        } else {
            System.out.println("No patients registered.");
        }
    }

    public void bookAppointment(String name) {

        System.out.println("Appointment booked successfully for: " + name);
    }
}
