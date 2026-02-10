package day5;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();

        int guess;
        int attempts = 0;
        int randomNumber = rc.nextInt(0,11);

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Guess a number between(1 - 10)");

        do{
            System.out.print("Enter a guess: ");
            guess = sc.nextInt();
            attempts++;
                    if(guess > randomNumber){
                        System.out.println("TOO HIGH,Enter Lower Number");
                    } else if (guess < randomNumber){
                        System.out.println("TOO LOW,Enter Higher Number");
                    }else{
                        System.out.println("CORRECT");
                        System.out.println("Number Attempts is: "+ attempts);
                    }
        }while(guess != randomNumber);
        sc.close();
    }
}
