package day5;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int result;

        System.out.print("Enter any number: ");
        num = sc.nextInt();

        for(int i=1 ; i<=10 ;i++){
           result = num * i;
            System.out.println(num + "*" + i +"="+" " + result);
        }
        sc.close();
    }
}
