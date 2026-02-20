package day9;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();

        System.out.println("--- Adding Items ---");
        groceries.add("Eggs");
        groceries.add("Milk");
        groceries.add("Bread");

        System.out.println("Current List: " + groceries);

        System.out.println("--- Searching the List ---");
        if(groceries.contains("Milk")){
            System.out.println("Milk is already on the list!");
        }

        System.out.println("--- Updating an Item ---");
        groceries.set(2,"Croissants");
        System.out.println("Updated List: " + groceries);


        System.out.println("--- Final Count ---");
        System.out.println(groceries.size());

        System.out.println("--- Checkout ---");
        groceries.clear();

        System.out.println("Cart cleared. Items left: " + groceries.size());

    }
}
