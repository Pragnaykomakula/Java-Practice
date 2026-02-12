package day6;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] fruits;
        String target;
        boolean isFound = false;

        fruits = new String[3];



        for(int i = 0;i< fruits.length;i++){
            System.out.print("Enter a fruit: ");
            fruits[i] = sc.nextLine();
        }
        System.out.print("Enter a fruit to find in the array: ");
        target = sc.nextLine();

        for(int i = 0 ;i < fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.print("\nIndex num of the target is: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array");
        }

        sc.close();
    }
}
