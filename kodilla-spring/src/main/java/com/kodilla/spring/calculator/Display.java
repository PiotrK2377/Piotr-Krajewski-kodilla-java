package com.kodilla.spring.calculator;

import org.springframework.stereotype.Repository;

@Repository
public class Display {

    public void displayValue(double val) {
        System.out.println("The calculated value is: " + val);
    }
}
