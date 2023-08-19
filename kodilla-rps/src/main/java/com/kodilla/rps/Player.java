package com.kodilla.rps;

import java.util.Scanner;

public class Player {


    private String name;
    private String valueMove;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MoveType getValueMove() {
        String move = valueMove.toLowerCase();
        switch (move) {
            case "1":
                return MoveType.ROCK;
            case "2":
                return MoveType.PAPER;
            case "3":
                return MoveType.SCISSORS;
            case "n":
                return MoveType.NEW;
            case "x":
                return MoveType.EXIT;
            default:
               throw new WrongMoveException("The selection range is 1 to 3 and x or n, try again correctly");
        }
    }
    public void setValue(String valueMove) {
        this.valueMove = valueMove;
    }
}
