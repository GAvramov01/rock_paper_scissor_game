package org.example;

import org.example.GameLogic.Logic;
import org.example.GameLogic.Player;
import org.example.GameLogic.Types;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();

        System.out.println("Enter you name:");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);

        System.out.println("Chose one of the options: ");

        Types[] types = Types.values();
        for (Types type : types) {
            System.out.println(type.toString().toLowerCase());
        }

        System.out.println("Let's play the game:");

        while (true) {

            String playerMove = scanner.nextLine();
            String computerMove = logic.computerCommand();
            System.out.println(logic.winningLogic(playerMove, computerMove));

            System.out.println("Player: " + logic.getPlayerPoint() + " / Computer: " + logic.getComputerPoint());
            System.out.println("Do you want to play again: ( yes / no )");

            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equals("no")) {
                break;
            }
        }
        System.out.println("Result: " + player.getName() + " - " + logic.getPlayerPoint() +
                " / Computer - " + logic.getComputerPoint());
    }
}