package day4;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch (operator) {

            case '+' -> result = num1 + num2;

            case '-' -> result = num1 - num2;

            case '*' -> result = num1 * num2;

            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    sc.close();
                    return;
                }
                result = num1 / num2;
            }

            default -> {
                System.out.println("Invalid operator");
                sc.close();
                return;
            }
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}
