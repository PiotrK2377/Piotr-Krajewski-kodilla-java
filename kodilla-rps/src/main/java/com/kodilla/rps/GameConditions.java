package com.kodilla.rps;


import java.util.Scanner;

public class GameConditions {


    int rounds;
    String closeOpen;
    Scanner scanner = new Scanner(System.in);

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public String getCloseOpen() {
        return closeOpen = scanner.next();
    }

    public void setCloseOpen(String closeOpen) {
        this.closeOpen = closeOpen;
    }
}
