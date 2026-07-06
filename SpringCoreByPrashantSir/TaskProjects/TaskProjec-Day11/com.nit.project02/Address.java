package com.nit.project02;

public class Address
{
    private String city;
    private int pincode;

    public Address()
    {
        System.out.println("Address Object Created...");
    }

    public void setCity(String city)
    {
        System.out.println("Address city setter called");
        this.city = city;
    }

    public void setPincode(int pincode)
    {
        System.out.println("Address pincode setter called");
        this.pincode = pincode;
    }

    @Override
    public String toString()
    {
        return "Address [city=" + city +
               ", pincode=" + pincode + "]";
    }
}