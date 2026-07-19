package com.nit.project03;

public class Main {

	public static void main(String[] args) {

		Flight flight = new Flight(101, "IndiGo 6E-501", "Hyderabad", "Delhi", "10:30 AM", 5500.00);

		flight.display();

		IO.println();

		Class<?> cls = flight.getClass();

		FlightInfo info = cls.getAnnotation(FlightInfo.class);

		IO.println("======= Flight Annotation Details =======");
		IO.println("Airline        : " + info.airline());
		IO.println("Flight Type    : " + info.flightType());
		IO.println("Terminal       : " + info.terminal());
		IO.println("Baggage Limit  : " + info.baggageLimit() + " Kg");
	}
}
