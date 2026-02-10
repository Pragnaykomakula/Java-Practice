package day4;
import java.util.Scanner;

public class LogicalOperatorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double attendancePercentage;
        int marks;
        boolean validIdCard;

        System.out.print("Enter Attendance Percentage: ");
        attendancePercentage = sc.nextDouble();

        System.out.print("Enter marks: ");
        marks = sc.nextInt();

        System.out.print("Do you have valid Id card (true/false): ");
        validIdCard = sc.nextBoolean();

      if(!validIdCard) {
          System.out.print("\nYou are not Allowed");
      } else if (attendancePercentage >=75 && marks >=50) {
          System.out.println("\nYou are fully eligible");
      }else if (attendancePercentage >= 75 || marks >=50){
          System.out.println("\nYou are conditionally eligible");
      }else{
          System.out.println("You are not Eligible");
      }


        sc.close();
    }

}
