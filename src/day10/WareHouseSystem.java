package day10;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WareHouseSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean found = false;

        ArrayList<InventoryItem<String>> inventory = new ArrayList<>();

        inventory.add(new InventoryItem<>("solar panels"));
        inventory.add(new InventoryItem<>("battery pack"));
        inventory.add(new InventoryItem<>("wiring harness"));

        String fileName = "List.txt";

        try(FileWriter writer = new FileWriter(fileName)){
            for(InventoryItem<String> item : inventory){
                writer.write(item.toString()+"\n");
            }
            System.out.println("Warehouse log updated successfully!");
        } catch (IOException e) {
            System.out.println("Input and Output error");;
        }

        System.out.print("Enter item name to search for: ");
        String search = sc.nextLine().toLowerCase();

        for(InventoryItem<String> items : inventory){
            if(search.equals(items.data)){
                System.out.println("You have found " + items.data);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in inventory.");
        }
        sc.close();
    }
}
class InventoryItem<T>{
    T data;
    LocalDate receivedDate;
    static int counter = 1;
    int serialNumber;

    InventoryItem(T data){
        this.data = data;
        this.receivedDate = LocalDate.now();
        this.serialNumber = counter++;
    }
    public String toString(){
        return serialNumber+") Item: " + data + " | Received: " + receivedDate + counter;
    }
}
