package com.kodilla.rps;

import java.util.Random;

public class Computer  {

    Random random = new Random();
    private int valueComp;


    public int getValue() {
        return valueComp = random.nextInt(3) + 1;

    }

}
