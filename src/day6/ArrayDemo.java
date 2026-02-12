package day6;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What number of food do you want:  ");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length ; i++){

            System.out.print("Enter your food: ");
            foods[i] = sc.nextLine();
        }
        for(String food : foods){
            System.out.println(food);
        }


    }
}
