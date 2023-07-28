import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose wisely from [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();

        boolean flag = true;
        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = SCISSORS;
        } else {
            System.out.println("Your choice is not a wise one. Please choose again...");
            flag = false;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        String computersMove = "";

        String resultFromGame = "";
        switch (computerRandomNumber) {
            case 0:
                computersMove = ROCK;
                if (playerMove.equals(ROCK)) {
                    resultFromGame = "Draw";
                } else if (playerMove.equals(PAPER)) {
                    resultFromGame = "You Win";
                } else if (playerMove.equals(SCISSORS)) {
                    resultFromGame = "You Lose";
                }
                break;

            case 1:
                computersMove = PAPER;
                if (playerMove.equals(ROCK)) {
                    resultFromGame = "You Lose";
                } else if (playerMove.equals(PAPER)) {
                    resultFromGame = "Draw";
                } else if (playerMove.equals(SCISSORS)) {
                    resultFromGame = "You Win";
                }
                break;

            case 2:
                computersMove = SCISSORS;
                if (playerMove.equals(ROCK)) {
                    resultFromGame = "You Win";
                } else if (playerMove.equals(PAPER)) {
                    resultFromGame = "You Lose";
                } else if (playerMove.equals(SCISSORS)) {
                    resultFromGame = "Draw";
                }
                break;
        }
        if (flag ) {
            System.out.printf("The super mega giga smart computer chose: %s%n", computersMove);
            System.out.println(resultFromGame);
        }
    }
}
