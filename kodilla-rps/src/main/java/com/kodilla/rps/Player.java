package com.kodilla.rps;

import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);
    private String name;
    private String value;

    private String endNewGame;

    public String getEndNewGame() {
        return endNewGame;
    }

    public void setEndNewGame(String endNewGame) {
        this.endNewGame = endNewGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
