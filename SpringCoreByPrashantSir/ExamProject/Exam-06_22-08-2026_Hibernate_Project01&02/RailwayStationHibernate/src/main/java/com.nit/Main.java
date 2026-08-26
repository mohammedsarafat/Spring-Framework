package com.nit;

import com.nit.entity.RailwayStation;
import com.nit.service.RailwayStationService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        RailwayStationService service =
                context.getBean(RailwayStationService.class);

        RailwayStation station = new RailwayStation(
                101,
                "Chennai Central",
                "Chennai",
                17
        );

        service.addStation(station);

        System.out.println("Station inserted successfully.");

        RailwayStation result = service.findStation(101);

        if (result != null) {
            System.out.println("Station Details:");
            System.out.println("Station ID      : " + result.getStationId());
            System.out.println("Station Name    : " + result.getStationName());
            System.out.println("City            : " + result.getCity());
            System.out.println("Platform Count  : " + result.getPlatformCount());
        } else {
            System.out.println("Station not found.");
        }

        context.close();
    }
}
