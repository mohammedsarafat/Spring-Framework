package com.nit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.entity.RailwayStation;

@Repository
public class RailwayStationDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public RailwayStationDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveStation(RailwayStation station) {

        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();

            session.save(station);

            session.getTransaction().commit();

        } finally {
            session.close();
        }
    }

    public RailwayStation getStationById(int stationId) {

        Session session = sessionFactory.openSession();

        try {
            return session.get(RailwayStation.class, stationId);
        } finally {
            session.close();
        }
    }
}
