package day8;

import java.util.Scanner;

public class RunTImePoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Notifications n1;
        int choice;

        System.out.print("Enter you choice (1 EMail/ 2 SMS): ");
        choice = sc.nextInt();

        if(choice == 1){
            n1 = new EmailNotifications();
            n1.sendAlert();
        } else if (choice == 2) {
            n1 = new SMSNotification();
            n1.sendAlert();
        }
    }
}

class Notifications{
    void sendAlert(){
        System.out.println("Sending a standard system alert...");
    }
}

class EmailNotifications extends Notifications{
    @Override
    void sendAlert() {
        System.out.println("Sending EMAIL: Alert! New login detected.");
    }
}

class SMSNotification extends Notifications{
    @Override
    void sendAlert(){
        System.out.println("Sending SMS: Alert! New login detected.");
    }
}
