package day3;
import java.util.Scanner;
public class WeightConveter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.print("Enter your wieght: ");
        weight = sc.nextDouble();

        System.out.println("press 1 for converting kg to lbs");
        System.out.println("press 2 for converting lbs to kg");


        System.out.print("Enter your choice between 1-2: ");
        choice = sc.nextInt();

        if(choice == 1){
            newWeight = weight * 0.453592;
            System.out.print("\nyour new weight: " + newWeight);
        } else if (choice == 2) {
            newWeight = weight * 2.20462;
            System.out.print("\nyour new weight: " + newWeight);
        }else {
            System.out.println("\ninvalid choice");
        }


        sc.close();
    }
}
