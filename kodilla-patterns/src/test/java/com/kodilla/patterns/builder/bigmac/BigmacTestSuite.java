package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(true)
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Onion")
                .ingredient("Cheese")
                .ingredient("Bacon")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(3, howManyIngredients);
        assertTrue(bigmac.getBun());
        assertEquals(2, bigmac.getBurgers());
        assertEquals("Barbecue",bigmac.getSauce());
    }
}
