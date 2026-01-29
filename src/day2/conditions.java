package day2;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        isStudent = true;


        //Block 1
        if(name.isEmpty()){
            System.out.println("\nyou didn't enter the name");
        }
        else{
            System.out.println("\nyour name is "+ name);
        }


        //Block 2
        if(age >= 65){
            System.out.println("your are a senior citizen");
        }
        else if (age >= 18){
            System.out.println("your are an adult");
        }
        else if (age < 0 ) {
            System.out.println("you are not born yet");
        }
        else if (age == 0) {
            System.out.println("your are a baby");
        }


        //Block 3
        if(isStudent){
            System.out.println("you are a student");
        }
        else{
            System.out.println("you are not a student");
        }

        sc.close();
    }
}
