package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testExtraCheesePizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), theCost);
    }

    @Test
    public void testExtraCheesePizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + extra cheese", description);
    }

    @Test
    public void testHamAndPineapplePizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new PineappleOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27), theCost);
    }

    @Test
    public void testHamAndPineapplePizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new PineappleOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + ham + pineapple", description);
    }

    @Test
    public void testBiggerSizeWithAllPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new PineappleOrderDecorator(theOrder);
        theOrder = new BiggerSizeOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(58), theCost);
    }

    @Test
    public void testBiggerSizeWithAllPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new PineappleOrderDecorator(theOrder);
        theOrder = new BiggerSizeOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + extra cheese + ham + pineapple - variant Bigger Size", description);
    }
}
