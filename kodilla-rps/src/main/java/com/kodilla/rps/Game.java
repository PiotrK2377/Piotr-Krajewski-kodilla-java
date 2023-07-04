package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    int wins = 0;
    int losses = 0;
    int tied = 0;


    public void play(Player player, Computer computer) {
        System.out.println("Choose: [1]Rock / [2]Paper / [3]Scissors / [x]Game Exit / [n] New Game");
        String movePlayer = scanner.next();
        player.setValue(movePlayer);
        int moveComputer = computer.getValueMove();

        gameConditions(movePlayer, moveComputer);
        displayMovePlayer(player, movePlayer);
        displayMoveComputer(movePlayer, moveComputer);
        displayScore(movePlayer);

    }

    private void displayScore(String movePlayer) {
        if (movePlayer.equals("1") || movePlayer.equals("2") || movePlayer.equals("3")) {
            System.out.println("Wins: " + wins + "|" + " Lost: " + losses + "|" + " Tied: " + tied);
            System.out.println("--------------------------");
        }
    }

    private static void displayMoveComputer(String movePlayer, int moveComputer) {
        if (moveComputer == 1 && !movePlayer.equals("x") && !movePlayer.equals("n")) {
            System.out.println("Computer choose Rock");
        } else if (moveComputer == 2 && !movePlayer.equals("x") && !movePlayer.equals("n")) {
            System.out.println("Computer choose Paper");
        } else if (moveComputer == 3 && !movePlayer.equals("x") && !movePlayer.equals("n")) {
            System.out.println("Computer choose Scissors");
        }
    }

    private static void displayMovePlayer(Player player, String movePlayer) {
        if (movePlayer.equals("1")) {
            System.out.println(player.getName() + " choose Rock");
        } else if (movePlayer.equals("2")) {
            System.out.println(player.getName() + " choose Paper");
        } else if (movePlayer.equals("3")) {
            System.out.println(player.getName() + " choose Scissors");
        }
    }

    private void gameConditions(String movePlayer, int moveComputer) {
        if ((movePlayer.equals("1")  && moveComputer == 3) || (movePlayer.equals("2") && moveComputer == 1) || (movePlayer.equals("3") && moveComputer == 2)) {
            wins++;
            System.out.println("You win");

        } else if((movePlayer.equals("1") && moveComputer == 1) || (movePlayer.equals("2") && moveComputer == 2) || (movePlayer.equals("3") && moveComputer == 3)) {
            tied++;
            System.out.println("You tied");
        } else if (moveComputer == 1 && movePlayer.equals("3") || (moveComputer == 2 && movePlayer.equals("1")) || (moveComputer == 3 && movePlayer.equals("2"))){
            losses++;
            System.out.println("You lost");
        } else if (!movePlayer.equals("1") && !movePlayer.equals("2") && !movePlayer.equals("3") && !movePlayer.equals("x") && !movePlayer.equals("n")) {
            System.out.println("The selection range is 1 to 3 and x or n, try again correctly");
        }
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

}
