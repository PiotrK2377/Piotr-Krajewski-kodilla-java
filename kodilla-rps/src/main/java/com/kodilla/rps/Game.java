package com.kodilla.rps;

public class Game {

    int wins = 0;
    int losses = 0;
    int tied = 0;


    public void play(Player player, Computer computer) {
        System.out.println("Choose: [1]Rock / [2]Paper / [3]Scissors / [x]Game Exit / [n] New Game");
        int movePlayer = player.getValue();
        int moveComputer = computer.getValue();

        if ((movePlayer == 1 && moveComputer == 3) || (movePlayer == 2 && moveComputer == 1) || (movePlayer == 3 && moveComputer == 2)) {
            wins++;
            System.out.println("You win");

        } else if(movePlayer == moveComputer) {
            tied++;
            System.out.println("You tied");
        } else if (movePlayer > 3) {
            System.out.println(player.getName() + " select a number between 1 and 3");
        } else {
            losses++;
            System.out.println("You lost");
        }

        if (movePlayer == 1) {
            System.out.println(player.getName() + " choose Rock");
        } else if (movePlayer == 2) {
            System.out.println(player.getName() + " choose Paper");
        } else if (movePlayer == 3) {
            System.out.println(player.getName() + " choose Scissors");
        }

        if (moveComputer == 1) {
            System.out.println("Computer choose Rock");
        } else if (moveComputer == 2) {
            System.out.println("Computer choose Paper");
        } else if (moveComputer == 3) {
            System.out.println("Computer choose Scissors");
        }

        System.out.println("Wins: " + wins + "|" + " Lost: "  + losses + "|" + " Tied: " + tied);
        System.out.println("--------------------------");

    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTied() {
        return tied;
    }
}
