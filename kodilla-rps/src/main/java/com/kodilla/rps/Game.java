package com.kodilla.rps;



public class Game {


    int wins = 0;
    int losses = 0;
    int tied = 0;
    public void play(Player player, Computer computer) {

        System.out.println("Choose: [1]Rock / [2]Paper / [3]Scissors ");

        int movePlayer = player.getValue();
        int moveComputer = computer.getValue();

        if ((movePlayer == 1 && moveComputer == 3) || (movePlayer == 2 && moveComputer == 1) || (movePlayer == 3 && moveComputer == 2)) {
            wins++;
            System.out.println("You win");

        } else if(movePlayer == moveComputer) {
            tied++;
            System.out.println("You tied");
        } else if (movePlayer > 3) {
            System.out.println("Value out of range");
        } else {
            losses++;
            System.out.println("You lost");

        }
        System.out.println("Wins: " + wins + "/" + " Lost: "  + losses + "/" + "Tied:" + tied);
    }


}
