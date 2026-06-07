package com.nit.beans;

public class Passport {

    private String name;
    private String number;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport [name=" + name +
                ", number=" + number +
                ", country=" + country + "]";
    }
}
