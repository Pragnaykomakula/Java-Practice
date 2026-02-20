package day9;

public class WrapperClass {
    public static void main(String[] args) {

        String s1 = "450";
        String s2 = "550";

        int val1 = Integer.parseInt(s1);
        int val2 = Integer.parseInt(s2);

        Integer obj1 = val1;
        Integer obj2 = val2;

        int price = obj1 + obj2;

        char firstChar = s1.charAt(0);

        System.out.println("Total price:" + price);
        System.out.println("Is the first character a digit?"+ Character.isDigit(firstChar));



    }
}
