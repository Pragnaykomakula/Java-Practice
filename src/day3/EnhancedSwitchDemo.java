package day3;

import java.util.Scanner;

public class EnhancedSwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day of the week: ");
        String day = sc.nextLine();

        switch(day){
            case "monday","tuesday","wednesday","thrusday","friday" -> System.out.println("weekday");
            case "saturday" , "sunday" -> System.out.println("Weekend");
            default -> System.out.println( day + " is not a weekday");
        }
        sc.close();
    }
}
