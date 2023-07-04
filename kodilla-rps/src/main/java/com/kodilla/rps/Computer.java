package com.kodilla.rps;

import java.util.Random;

public class Computer  {

    Random random = new Random();
    private int valueMove;


    public int getValueMove() {
        return valueMove = random.nextInt(3) + 1;

    }

}
