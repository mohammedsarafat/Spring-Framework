package com.nit.project03;

@FlightInfo(
        airline = "IndiGo",
        flightType = "Domestic",
        terminal = "T1",
        baggageLimit = 25
)
public class Flight {

    private int flightId;
    private String flightName;
    private String source;
    private String destination;
    private String departureTime;
    private double ticketPrice;

    public Flight(int flightId, String flightName, String source,
                  String destination, String departureTime, double ticketPrice) {

        this.flightId = flightId;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.ticketPrice = ticketPrice;
    }

    public void display() {

        IO.println("========== Flight Details ==========");
        IO.println("Flight ID      : " + flightId);
        IO.println("Flight Name    : " + flightName);
        IO.println("Source         : " + source);
        IO.println("Destination    : " + destination);
        IO.println("Departure Time : " + departureTime);
        IO.println("Ticket Price   : " + ticketPrice);
    }
}
