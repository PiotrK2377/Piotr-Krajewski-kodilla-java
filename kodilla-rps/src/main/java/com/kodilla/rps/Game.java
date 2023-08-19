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
        MoveType movePlayerEnum = player.getValueMove();
        int moveComputer = computer.getValueMove();

        gameConditions(movePlayerEnum, MoveType.values()[moveComputer - 1]);
        displayMovePlayer(player, movePlayerEnum);
        displayMoveComputer(MoveType.values()[moveComputer - 1], player);
        displayScore(player);

    }

    private void displayScore(Player player) {
        if (player.getValueMove().equals(MoveType.ROCK)|| player.getValueMove().equals(MoveType.PAPER) || player.getValueMove().equals(MoveType.SCISSORS)) {
            System.out.println("Wins: " + wins + "|" + " Lost: " + losses + "|" + " Tied: " + tied);
            System.out.println("--------------------------");
        }
    }

    private void displayMoveComputer(MoveType moveComputer, Player player) {
        if (moveComputer == MoveType.ROCK && !player.getValueMove().equals(MoveType.NEW) && !player.getValueMove().equals(MoveType.EXIT)) {
            System.out.println("Computer choose " + MoveType.ROCK);
        } else if (moveComputer == MoveType.PAPER && !player.getValueMove().equals(MoveType.NEW) && !player.getValueMove().equals(MoveType.EXIT)) {
            System.out.println("Computer choose " + MoveType.PAPER);
        } else if (moveComputer == MoveType.SCISSORS && !player.getValueMove().equals(MoveType.NEW) && !player.getValueMove().equals(MoveType.EXIT)) {
            System.out.println("Computer choose " + MoveType.SCISSORS);
        }
    }

    private void displayMovePlayer(Player player, MoveType movePlayer) {
        if (movePlayer == MoveType.EXIT || movePlayer == MoveType.NEW) {

        } else
        System.out.println(player.getName() + " choose " + movePlayer);
    }

    private void gameConditions(MoveType movePlayer, MoveType moveComputer) {
        if ((movePlayer == MoveType.ROCK && moveComputer == MoveType.SCISSORS) ||
                (movePlayer == MoveType.PAPER && moveComputer == MoveType.ROCK) ||
                (movePlayer == MoveType.SCISSORS && moveComputer == MoveType.PAPER)) {
            wins++;
            System.out.println("You win");
        } else if ((movePlayer == MoveType.ROCK && moveComputer == MoveType.ROCK) ||
                (movePlayer == MoveType.PAPER && moveComputer == MoveType.PAPER) ||
                (movePlayer == MoveType.SCISSORS && moveComputer == MoveType.SCISSORS)) {
            tied++;
            System.out.println("You tied");
        } else if ((movePlayer == MoveType.ROCK && moveComputer == MoveType.PAPER) ||
                (movePlayer == MoveType.PAPER && moveComputer == MoveType.SCISSORS) ||
                (movePlayer == MoveType.SCISSORS && moveComputer == MoveType.ROCK))  {
            losses++;
            System.out.println("You lost");
        }
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

}
