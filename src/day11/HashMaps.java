package day11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        HashMap<String,Double> lists = new HashMap<>();

        lists.put("solar panels",299.99);
        lists.put("lights",19.99);
        lists.put("fan",25.99);
        lists.put("phones",199.99);

        System.out.print("Enter an item name: ");
        String choice = sc.nextLine().toLowerCase();

        if(lists.containsKey(choice)){
            System.out.println(lists.get(choice));
        }else{
            System.out.println("Not Found");
        }

    }
}
