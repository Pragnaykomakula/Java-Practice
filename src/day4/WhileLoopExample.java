package day4;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        int count = 0;
        double average;


        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while(num != 0){
            sum = sum + num;
            count++;

            System.out.print("Enter another number(0 to stop): ");
            num = sc.nextInt();
        }
        if(count > 0){
            average = (double) sum / count;
            System.out.print("\nsum = " + sum);
            System.out.print("\naverage = " + average);
        }
        else{
            System.out.print("No numbers Entered");
        }
        sc.close();
    }
}
