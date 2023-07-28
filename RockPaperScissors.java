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

        if (playerMove.equals("r") || playerMove.equals("rock")){
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")){
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")){
            playerMove = SCISSORS;
        } else {
            System.out.println("Your choice is not a wise one. Please choose again...");
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computersMove = "";

        String resultFromGame = "";
        switch (computerRandomNumber){
            case 1 :
                computersMove = ROCK;
                if (playerMove.equals(ROCK)){
                    resultFromGame = "Draw";
                } else if (playerMove.equals(PAPER)) {
                    resultFromGame = "You Win";
                } else {
                    resultFromGame = "You Lose";
                }
                break;

            case 2:
                computersMove = PAPER;
                if (playerMove.equals(ROCK)){
                    resultFromGame = "You Lose";
                } else if (playerMove.equals(PAPER)) {
                    resultFromGame = "Draw";
                } else {
                    resultFromGame = "You Win";
                }
                break;

            case 3:
                computersMove = SCISSORS;
                if (playerMove.equals(ROCK)){
                    resultFromGame = "You Win";
                } else if (playerMove.equals(PAPER)) {
                    resultFromGame = "You Lose";
                } else {
                    resultFromGame = "Draw";
                }
                break;
        }
        System.out.printf("The super mega giga smart computer chose: %s%n", computersMove);
        System.out.println(resultFromGame);


    }
}