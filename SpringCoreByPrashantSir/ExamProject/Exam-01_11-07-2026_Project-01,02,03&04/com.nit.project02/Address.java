package com.nit.project02;

public class Address {

    private String houseNo;
    private String city;
    private String state;
    private int pincode;

    public Address() {
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return houseNo + ", " + city + ", " + state + " - " + pincode;
    }
}
