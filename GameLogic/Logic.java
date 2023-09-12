package org.example.GameLogic;

import java.util.Random;

public class Logic {
    private static int PLAYER = 0;
    private static int COMPUTER = 0;
    private final static String PLAYER_WIN = "Player WIN.";
    private final static String COMPUTER_WIN = "Computer WIN.";
    private final static String NO_ONE_WIN = "No one win!!!";

    public String computerCommand() {
        Types[] type = Types.values();
        int randIndex = new Random().nextInt(type.length);
        return String.valueOf(type[randIndex]).toLowerCase();
    }

    public String winningLogic(String playerCommand, String computerCommand) {

        String winner = "";

        if (playerCommand.equals("rock") && computerCommand.equals("paper")
                || playerCommand.equals("paper") && computerCommand.equals("scissors")
                || playerCommand.equals("scissors") && computerCommand.equals("rock")) {
                increasePlayerPoint();
                winner = PLAYER_WIN;
        } else if (computerCommand.equals("rock") && playerCommand.equals("paper")
                || computerCommand.equals("paper") && playerCommand.equals("scissors")
                || computerCommand.equals("scissors") && playerCommand.equals("rock")) {
            increaseComputerPoint();
            winner = COMPUTER_WIN;
        } else if (computerCommand.equals("rock") && playerCommand.equals("rock")
                || computerCommand.equals("paper") && playerCommand.equals("paper")
                || computerCommand.equals("scissors") && playerCommand.equals("scissors")) {
            winner = NO_ONE_WIN;
        }
        return winner;
    }

    public int getPlayerPoint() {
        return PLAYER;
    }

    public int getComputerPoint() {
        return COMPUTER;
    }

    private void increasePlayerPoint() {
        PLAYER++;
    }

    private void increaseComputerPoint() {
        COMPUTER++;
    }
}
