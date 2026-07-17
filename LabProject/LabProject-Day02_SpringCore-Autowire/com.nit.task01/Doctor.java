package com.nit.task01;

public class Doctor {

    private String doctorId;
    private String doctorName;
    private String specialization;

    public Doctor() {
    }

    public Doctor(String doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor Id : " + doctorId +
               "\nDoctor Name : " + doctorName +
               "\nSpecialization : " + specialization;
    }
}
