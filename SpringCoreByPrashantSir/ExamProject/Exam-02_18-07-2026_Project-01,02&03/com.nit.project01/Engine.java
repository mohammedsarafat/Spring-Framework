package com.nit.project01;


public class Engine {

    private int engineId;
    private String engineType;
    private int horsepower;
    private String fuelType;
    private double engineCapacity;
    private String manufacturer;

    public Engine() {
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine Details\n"
                + "Engine ID        : " + engineId + "\n"
                + "Engine Type      : " + engineType + "\n"
                + "Horse Power      : " + horsepower + "\n"
                + "Fuel Type        : " + fuelType + "\n"
                + "Engine Capacity  : " + engineCapacity + " L\n"
                + "Manufacturer     : " + manufacturer;
    }
}
