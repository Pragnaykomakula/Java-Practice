package day1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter name: ");
        String name = sc.nextLine();

        System.out.print("enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter cpga: ");
        double cgpa = sc.nextDouble();

        System.out.println("My name is:"+ name);
        System.out.println("age:"+ age);
        System.out.println("cgpa"+ cgpa);



        sc.close();
    }
}