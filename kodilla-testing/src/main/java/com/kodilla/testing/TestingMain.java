package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - first unit test:");

        Calculator calculator = new Calculator(20,11);

        int resultA = calculator.getA();
        int resultB = calculator.getB();
        int resultAB = resultA + resultB;
        int resultAdd = calculator.add();

        if (resultAB == resultAdd) {
            System.out.println("Test add calculator OK");
        } else {
            System.out.println("Error add calculator");
        }

        Calculator calculator1 = new Calculator(45,17);

        int resultA1 = calculator1.getA();
        int resultB1 = calculator1.getB();
        int resultA1B1 = resultA1 - resultB1;
        int resultSub = calculator1.subtract();

        if (resultA1B1 == resultSub) {
            System.out.println("Test subtract calculator OK");
        } else {
            System.out.println("Error subtract calculator");
        }
    }
}
