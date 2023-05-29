package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Gdansk", true);
        flights.put("New York", false);
        flights.put("Rome", true);
        flights.put("Warsaw", false);

        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();

        if (flights.containsKey(arrivalAirport) && flights.containsKey(departureAirport)) {
            return flights.get(arrivalAirport) && flights.get(departureAirport) ;

        } else {
            throw new RouteNotFoundException("There is no such airport on the map");
        }
    }

    public static void main(String[] args) {
        SearchFlight searchFlight = new SearchFlight();
        Flight flight1 = new Flight("Rome", "Brazil");

        try {
            boolean correctFlight = searchFlight.findFlight(flight1);
            if (correctFlight) {
                System.out.println("Flight available");
            } else {
                System.out.println("Flight unavailable");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Choose another flight. " + e.getMessage());
        } finally {
            System.out.println("The search engine has ended");
        }
    }
}
