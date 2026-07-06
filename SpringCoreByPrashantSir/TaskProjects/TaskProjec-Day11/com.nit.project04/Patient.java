package com.nit.project04;

public class Patient
{
    private String name;
    private int age;
    private Doctor doctor;

    public Patient(String name, int age, Doctor doctor)
    {
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }

    public void display()
    {
        System.out.println("Patient Name  : " + name);
        System.out.println("Age           : " + age);
        System.out.println(doctor);
    }
}