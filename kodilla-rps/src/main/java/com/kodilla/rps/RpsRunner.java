package com.kodilla.rps;


import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Computer computer = new Computer();
        Game game = new Game();
        GameConditions gameConditions = new GameConditions();

        boolean end = false;

        System.out.println("Enter your name: ");
        String name = scanner.next();
        player.setName(name);
        System.out.println(player.getName() + " how many wins rounds do you could play ?");
        int rounds = scanner.nextInt();
        gameConditions.setRounds(rounds);
        
        while (!end) {
            
            game.play(player, computer);
            
            if (game.getWins() >= gameConditions.getRounds() || game.getLosses() >= gameConditions.getRounds()) {
                countingScore(player, game);
                String close = exitGame(scanner, gameConditions);
                if (close == null) break;

                end = newGame(close, scanner, end);
            }

            if (endCurrentGame(scanner, player)) break;

            end = newGame(player.getValueMove(), scanner, end);

        }
    }

    private static boolean endCurrentGame(Scanner scanner, Player player) {
        if (player.getValueMove().equals("x")) {
            System.out.println("Are you sure finish the game ? \n[y] Yes");
            String closedOne = scanner.next();
            if (closedOne.equals("y")) {
                System.out.println("GAME OVER");
                return true;
            }
        }
        return false;
    }

    private static String exitGame(Scanner scanner, GameConditions gameConditions) {
        System.out.println("Chose: [x] End Game / [n] New Game");
        String close = gameConditions.getCloseOpen();
        gameConditions.setCloseOpen(close);
        if (close.equals("x")) {
            System.out.println("Are you sure finish the game ? \n[y] Yes");
            String closed1 = scanner.next();
            if (closed1.equals("y")) {
                System.out.println("GAME OVER");
                return null;
            }
        }
        return close;
    }

    private static void countingScore(Player player, Game game) {
        if (game.getWins() > game.getLosses()) {
            System.out.println(player.getName() + " wins " + game.getWins() + " times");
        } else {
            System.out.println("Computer wins " + game.getLosses() + " times");
        }
    }

    private static boolean newGame(String player, Scanner scanner, boolean end) {
        if (player.equals("n")) {
            System.out.println("Are you sure you want to end the current game ? \n[y] Yes");
            String closedTwo = scanner.next();
            if (closedTwo.equals("y")) {
                System.out.println("New game has started");
                end = true;
                RpsRunner.main(new String[0]);
            }
        }
        return end;
    }
    
}
