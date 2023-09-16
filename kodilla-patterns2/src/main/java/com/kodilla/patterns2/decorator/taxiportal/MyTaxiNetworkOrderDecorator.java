package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;
import java.util.Stack;

public class MyTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {

    public MyTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 30
        return super.getCost().add(new BigDecimal(30));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by MyTaxi Network";
    }
}
