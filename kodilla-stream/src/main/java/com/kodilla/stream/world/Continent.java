package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String nameContinent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }
    public boolean removeCountry(Country country) {
        return countryList.remove(country);
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
