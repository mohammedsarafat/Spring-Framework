package com.nit.service;

import com.nit.dao.RailwayStationDAO;
import com.nit.entity.RailwayStation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RailwayStationService {

    private RailwayStationDAO railwayStationDAO;

    @Autowired
    public RailwayStationService(RailwayStationDAO railwayStationDAO) {
        this.railwayStationDAO = railwayStationDAO;
    }

    public void addStation(RailwayStation station) {
        railwayStationDAO.saveStation(station);
    }

    public RailwayStation findStation(int stationId) {
        return railwayStationDAO.getStationById(stationId);
    }
}
