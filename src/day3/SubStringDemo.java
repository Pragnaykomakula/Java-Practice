package day3;
import java.util.Scanner;

public class SubStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email id: ");
        email = sc.nextLine();

        if(email.contains(" ")) {
            System.out.println("Invalid! email should not contain white spaces");
        }
        else if(email.contains("@")){
                username = email.substring(0,email.indexOf("@"));
                domain = email.substring(email.indexOf("@")+1);
                System.out.println("username: " + username);
                System.out.println("domain: " + domain);
            }else{
                System.out.println("Invalid! email id.Email should contain @ character");
            }



        sc.close();
    }
}
