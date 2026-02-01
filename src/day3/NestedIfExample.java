package day3;
import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username;
        String password;
        String correctUsername = "Admin";
        String correctPassword = "admin@1234";

        System.out.print("Enter Username: ");
        username = sc.nextLine();

        System.out.print("Enter Password: ");
        password = sc.nextLine();

        if(username.equalsIgnoreCase(correctUsername)){
            if(password.equals(correctPassword)) {
                System.out.println("\nYou have entered correct username and password");
            }else
                System.out.println("\nyou have entered wrong password");
            }
            else{
                System.out.println("\nyou have entered wrong username");
            }

            sc.close();
        }



}

