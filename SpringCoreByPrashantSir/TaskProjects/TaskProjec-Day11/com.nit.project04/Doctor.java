package com.nit.project04;

public class Doctor
{
    private String doctorName;
    private String specialization;

    public Doctor(String doctorName, String specialization)
    {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    @Override
    public String toString()
    {
        return "Doctor Name     : " + doctorName +
               "\nSpecialization : " + specialization;
    }
}