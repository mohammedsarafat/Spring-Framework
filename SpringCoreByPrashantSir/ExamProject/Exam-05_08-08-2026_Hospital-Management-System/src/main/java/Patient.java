package com.nit;

import lombok.Data;

@Data
public class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private String disease;
    private String doctorName;
    private String contactNumber;

}
