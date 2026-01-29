package day2;

import java.util.Scanner;

public class shopping{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String item;
        double price;
        int quantity;
        char currency;
        double total;

        System.out.print("enter your item name: ");
        item = sc.nextLine();

        System.out.print("enter price: ");
        price= sc.nextDouble();

        System.out.print("enter quantity: ");
        quantity = sc.nextInt();

        currency = '$';

        total = price * quantity;

        System.out.println( "\nyour item is " + item);
        System.out.println("price is " + price);
        System.out.println("quantity is "+ quantity);
        System.out.println("your total amount for this order is "+currency+total);


        sc.close();

    }
}
