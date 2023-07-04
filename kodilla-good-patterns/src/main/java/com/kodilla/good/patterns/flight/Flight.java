package com.kodilla.good.patterns.flight;

import java.util.Objects;

public class Flight {
    private String fromAirport;
    private String toAirport;

    public Flight(String fromAirport, String toAirport) {
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(fromAirport, flight.fromAirport) && Objects.equals(toAirport, flight.toAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromAirport, toAirport);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fromAirport='" + fromAirport + '\'' +
                ", toAirport='" + toAirport + '\'' +
                '}';
    }
}
