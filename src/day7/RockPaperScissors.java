package day7;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();

        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "Yes";

        do{
            System.out.print("Enter your choice (rock/paper/scissors): ");
            playerChoice = sc.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid Choice");
                continue;
            }
            computerChoice = choices[rc.nextInt(3)];
            System.out.println("Computer's choice is: "+ computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie");
            }
            else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock")||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You win");

            }
            else{
                System.out.println("You Loose");
            }
            System.out.print("Play again(yes/no): ");
            playAgain = sc.nextLine().toLowerCase();
        } while(playAgain.equals("yes"));

        System.out.println("Thanks for Playing");

    }
}
