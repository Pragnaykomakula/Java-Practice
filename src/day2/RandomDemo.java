package day2;

import java.util.Random;

public class RandomDemo{
    public static void main(String[] args) {

        Random rc = new Random();

        int num1;
        num1= rc.nextInt(1,10);

        double num2;
        num2 = rc.nextDouble(1,6);

        boolean isHeads;
        isHeads = rc.nextBoolean();

        System.out.println("\nrandom number between 0-9 is :" + num1);
        System.out.println("\nrandom number between 0-9 is :" + num2);

        if(isHeads){
            System.out.println("\nyour toss is heads");
        }
        else{
            System.out.println("\nyour toss is tales");
        }

    }
}
