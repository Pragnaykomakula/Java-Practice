package day6;

import java.util.Scanner;

public class BankingProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("--------------------------------");
            System.out.println("WELCOME TO BANK PROGRAMMING");
            System.out.println("--------------------------------");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.println("--------------------------------");

            System.out.print("Enter your choice(1-4): ");
            choice = sc.nextInt();
            System.out.println("--------------------------------");


            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice,Please choose between (1 - 4)");
            }

            System.out.println("--------------------------------");
            System.out.println("Thank you have a nice day");
            System.out.println("--------------------------------");


        }

        }
        static void showBalance(double balance){
            System.out.printf("$%.2f \n",balance);
        }
        static double deposit(){

        double amount;

        System.out.print("Enter an amount to deposited: ");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("Negative Number are Invalid");
            return 0;
        }else{
            return amount;
        }

    }
        static double withdraw(double balance){
        double amount;

            System.out.print("Enter an amount to withdraw: ");
            amount = sc.nextDouble();

            if(amount > balance){
                System.out.println("Insufficient Balance");
                return 0;
            }else if(amount < 0){
                System.out.println("Amount cant be negative");
                return 0;
            }else{
                return amount;
            }


        }
}

