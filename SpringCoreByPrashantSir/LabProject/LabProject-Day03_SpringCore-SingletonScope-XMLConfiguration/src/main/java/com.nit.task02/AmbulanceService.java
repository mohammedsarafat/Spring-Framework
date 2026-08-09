package com.nit.task02;

public class AmbulanceService {

    private String serviceName;
    private String contactNumber;
    private String city;

    // Constructor Injection
    public AmbulanceService(String serviceName,
                            String contactNumber,
                            String city) {

        this.serviceName = serviceName;
        this.contactNumber = contactNumber;
        this.city = city;
    }

    public void displayServiceDetails() {

        System.out.println("=================================");
        System.out.println("      AMBULANCE SERVICE");
        System.out.println("=================================");
        System.out.println("Service Name   : " + serviceName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("City           : " + city);
        System.out.println("=================================");
    }
}
