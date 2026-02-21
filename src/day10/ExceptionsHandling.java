package day10;

import java.util.Scanner;

public class ExceptionsHandling {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);



        try{
            int num1;
            int num2;

            System.out.print("Enter 1st Num: ");
            num1 = sc.nextInt();

            System.out.print("Enter 2nd Num: ");
            num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Division of num1 and num2 is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        }catch (Exception e){
            System.out.println("Error: Something went wrong with your input.");
        }

        sc.close();
    }

}

