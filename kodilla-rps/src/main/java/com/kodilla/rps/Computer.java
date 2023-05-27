package com.kodilla.rps;

import java.util.Random;

public class Computer extends Player {

    Random random = new Random();
    private int value;

    @Override
    public int getValue() {
        return value = random.nextInt(3) + 1;
    }

}
