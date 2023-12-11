import java.util.Random;
import java.util.Scanner;

public class RockPaperAndScissors {
    private final static String ROCK = "Rock";
    private final static String PAPER = "Paper";
    private final static String SCISSORS = "Scissors";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //   String playerMove = "";
        int playerWin = 0;
        int computerWin = 0;
        while (playerWin < 10 && computerWin < 10) {
            System.out.println("Choose rock, paper or scissors");
            String player = scanner.nextLine();
            switch (player) {
                case "r":
                case "rock":
                    player = ROCK;
                    break;
                case "p":
                case "paper":
                    player = PAPER;
                    break;
                case "s":
                case "scissors":
                    player = SCISSORS;
                    break;
                default:
                    System.out.println("Invalid input! Try again...");
                    continue;
            }
            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);
            String computerMove = "";

            switch (computerRandomNumber) {
                case 1:
                    computerMove = ROCK;
                    break;
                case 2:
                    computerMove = PAPER;
                    break;
                case 0:
                    computerMove = SCISSORS;
                    break;
            }
            System.out.printf("The computer choose: %s.\n", computerMove);

            if ((computerMove.equals("Rock") && player.equals("Scissors"))
                    || (computerMove.equals("Scissors") && player.equals("Paper"))
                    || (computerMove.equals("Paper") && player.equals("Rock"))) {
                System.out.println("You LOSE");
                computerWin++;
            } else if ((player.equals("Rock") && computerMove.equals("Scissors"))
                    || (player.equals("Scissors") && computerMove.equals("Paper"))
                    || (player.equals("Paper") && computerMove.equals("Rock"))) {
                System.out.println("You WIN");
                playerWin++;
            } else
                System.out.println("DRAW");
            System.out.println(playerWin + ":" + computerWin);
        }
        if (playerWin>computerWin)
            System.out.printf("You WIN the game with %d:%d", playerWin, computerWin);
        else System.out.printf("You LOST the game with %d:%d", playerWin, computerWin);


    }
}
