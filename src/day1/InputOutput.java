package day1;

import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("my name is:");
        String name = sc.nextLine();

        System.out.println("age");
        int age = sc.nextInt();

        sc.close();
    }
}