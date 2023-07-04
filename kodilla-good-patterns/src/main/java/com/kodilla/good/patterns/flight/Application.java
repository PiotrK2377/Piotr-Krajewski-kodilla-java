package com.kodilla.good.patterns.flight;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        Flight flight1 = new Flight("Gdańsk", "Kraków");
        Flight flight2 = new Flight("Kraków", "Wrocław");
        Flight flight3 = new Flight("Warszawa", "Kraków");
        Flight flight4 = new Flight("Gdańsk", "Warszawa");
        Flight flight5 = new Flight("Gdańsk", "Zakopane");
        Flight flight6 = new Flight("Zakopane", "Wrocław");
        Flight flight7 = new Flight("Poznań","Radom");
        Flight flight8 = new Flight("Radom", "Kraków");

        flightService.addFlight(flight1);
        flightService.addFlight(flight2);
        flightService.addFlight(flight3);
        flightService.addFlight(flight4);
        flightService.addFlight(flight5);
        flightService.addFlight(flight6);
        flightService.addFlight(flight7);
        flightService.addFlight(flight8);


        List<Flight> flightsVia = flightService.findFlightsVia("Gdańsk", "Wrocław");
        System.out.println("\nFlights from Gdańsk to Wrocław with transfers:");
        flightsVia.forEach(flight -> System.out.println(flight.getFromAirport() +  " -> " + flight.getToAirport()));

        List<Flight> flightsToKrakow = flightService.findFlightsTo("Kraków");
        System.out.println("\nFlights to Kraków:");
        flightsToKrakow.forEach(flight -> System.out.println(flight.getFromAirport() + " -> " + flight.getToAirport()));

        List<Flight> flightsFromGdansk = flightService.findFlightsFrom("Gdańsk");
        System.out.println("\nFlights from Gdańsk:");
        flightsFromGdansk.forEach(flight -> System.out.println(flight.getFromAirport() + " -> " + flight.getToAirport()));

    }
}

