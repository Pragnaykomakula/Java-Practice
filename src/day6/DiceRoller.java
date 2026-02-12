package day6;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();

        int numOfDice;
        int total = 0;

        System.out.print("Enter a number of dice to roll: ");
        numOfDice = sc.nextInt();

       if(numOfDice > 0){
           for(int i = 0;i < numOfDice ; i++){
               int roll = rc.nextInt(1,7);
               System.out.println("you have rolled: "+ roll);
               printDie(roll);
               System.out.println();
               total += roll;

           }
           System.out.print("Total num of roll: "+ total);
       }else{
           System.out.println("Invalid number");
       }




    }
    static void printDie(int roll){
        String die1 = """
                  -----
                |       |
                |   ●   |
                |       |
                  -----
                """;
        String die2 = """
                  -----
                | ●     |
                |       |
                |     ● |
                  -----
                """;

        String die3 = """
                  -----
                | ●     |
                |   ●   |
                |     ● |
                  -----
                """;

        String die4 = """
                  -----
                | ●   ● |
                |       |
                | ●   ● |
                  -----
                """;

        String die5= """
                  -----
                | ●   ● |
                |   ●   |
                | ●   ● |
                  -----
                """;

        String die6= """
                  -----
                | ●   ● |
                | ●   ● |
                | ●   ● |
                  -----
                """;
        switch (roll){
            case 1 -> System.out.println((die1));
            case 2 -> System.out.println((die2));
            case 3 -> System.out.println((die3));
            case 4 -> System.out.println((die4));
            case 5 -> System.out.println((die5));
            case 6 -> System.out.println((die6));
            default -> System.out.println("Invalid roll");


        }

    }

}
