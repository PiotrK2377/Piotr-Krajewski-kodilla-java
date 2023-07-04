package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private List<Flight> flights;

    public FlightService() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> findFlightsFrom(String fromAirport) {
        return flights.stream()
                .filter(flight -> flight.getFromAirport().equals(fromAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String toAirport) {
        return flights.stream()
                .filter(flight -> flight.getToAirport().equals(toAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsVia(String fromAirport, String toAirport) {
        List<Flight> flightsVia = new ArrayList<>();
        findFlightsViaRecursive(fromAirport, toAirport, new ArrayList<>(), flightsVia);
        return flightsVia;
    }

    private void findFlightsViaRecursive(String currentAirport, String toAirport, List<Flight> visitedFlights, List<Flight> flightsVia) {
        if (currentAirport.equals(toAirport)) {
            flightsVia.addAll(visitedFlights);
            return;
        }

        List<Flight> possibleFlights = flights.stream()
                .filter(flight -> flight.getFromAirport().equals(currentAirport))
                .collect(Collectors.toList());

        for (Flight flight : possibleFlights) {
            if (!visitedFlights.contains(flight)) {
                List<Flight> flightsCopy = new ArrayList<>(visitedFlights);
                flightsCopy.add(flight);
                findFlightsViaRecursive(flight.getToAirport(), toAirport, flightsCopy, flightsVia);
            }
        }
    }

}
