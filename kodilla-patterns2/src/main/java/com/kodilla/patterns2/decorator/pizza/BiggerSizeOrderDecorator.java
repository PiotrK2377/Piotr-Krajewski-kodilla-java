package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BiggerSizeOrderDecorator extends AbstractPizzaOrderDecorator {

    public BiggerSizeOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        //cost = 2x
        return super.getCost().multiply(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " - variant Bigger Size";
    }
}
