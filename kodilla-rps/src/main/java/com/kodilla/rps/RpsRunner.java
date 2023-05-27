package com.kodilla.rps;


import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Player player = new Player();
        Computer computer = new Computer();
        Game game = new Game();

        Scanner scanner = new Scanner(System.in);

        boolean end = false;

        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println(name + " how many wins rounds do you could play ?");
        int rounds = scanner.nextInt();


        while (!end) {
            game.play(player,computer);
            System.out.println("Rounds left: " + rounds--);
            if(rounds == 0) {
                end = true;
            }

        }

    }
}
