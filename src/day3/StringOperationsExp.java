package day3;

import java.util.Scanner;

public class StringOperationsExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter firstname: ");
        String firstname = sc.nextLine();

        int length = firstname.length();
        System.out.println(length);

        String uppercase = firstname.toUpperCase();
        System.out.println(uppercase);

        String lowercase = firstname.toLowerCase();
        System.out.println(lowercase);

        if(firstname.isEmpty()){
            System.out.println("Invalid! string is empty");
        }else{
            System.out.println("your firstname: "+ firstname);
        }

        System.out.print("Enter lastname: ");
        String lastname = sc.nextLine();

        if(firstname.equalsIgnoreCase(lastname)){
            System.out.println("Invalid!first name cannot be same as last name");
        }else{
            System.out.println("your name is "+firstname + lastname);
        }

        System.out.println(firstname.charAt(3));
        System.out.println(lastname.indexOf('a'));
        System.out.println(firstname.lastIndexOf('a'));
        System.out.println(firstname.replace('a','e'));
        System.out.println(firstname.concat(lastname));

        sc.close();
    }
}
