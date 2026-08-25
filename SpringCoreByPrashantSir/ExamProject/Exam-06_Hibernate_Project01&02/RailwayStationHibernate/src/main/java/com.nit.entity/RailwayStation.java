package com.nit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "railway_station")
public class RailwayStation {

    @Id
    private int stationId;

    private String stationName;
    private String city;
    private int platformCount;

    public RailwayStation() {
    }

    public RailwayStation(int stationId, String stationName,
                          String city, int platformCount) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.city = city;
        this.platformCount = platformCount;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPlatformCount() {
        return platformCount;
    }

    public void setPlatformCount(int platformCount) {
        this.platformCount = platformCount;
    }

    @Override
    public String toString() {
        return "RailwayStation{" +
                "stationId=" + stationId +
                ", stationName='" + stationName + '\'' +
                ", city='" + city + '\'' +
                ", platformCount=" + platformCount +
                '}';
    }
}
