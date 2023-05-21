package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent continent1 = new Continent("Africa");
        Country country1 = new Country("RPA", new BigDecimal("21434354656"));
        Country country2 = new Country("Egypt", new BigDecimal("32455657676"));
        Country country3 = new Country("Ethiopia", new BigDecimal("456789098765"));
        Country country4 = new Country("Sudan", new BigDecimal("2345689091111"));

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent1.addCountry(country4);

        Continent continent2 = new Continent("Asia");
        Country country5 = new Country("China", new BigDecimal("6324232444657"));
        Country country6 = new Country("India", new BigDecimal("6234589808695"));
        Country country7 = new Country("Japan", new BigDecimal("9734224242424"));

        continent2.addCountry(country5);
        continent2.addCountry(country6);
        continent2.addCountry(country7);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();
        BigDecimal calculatedWorldPopulation = new BigDecimal("25149414697984");

        //Then
        Assertions.assertEquals(worldPopulation,calculatedWorldPopulation);
    }
}
