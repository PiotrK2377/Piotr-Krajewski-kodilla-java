package com.kodilla.rps;

import java.util.Scanner;

public class Player {

    Scanner scanner = new Scanner(System.in);
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value = scanner.nextInt();
    }

    public void setValue(int value) {
        this.value = value;
    }
}
