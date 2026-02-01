package day3;
import java.util.Scanner;
public class TernaryExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your marks: ");
        int marks = sc.nextInt();

        String grade = (marks >= 90) ? "A" : (marks >= 60 ? "B" : "C");

        System.out.println("Your grade is: " + grade);

        sc.close();
    }
}
