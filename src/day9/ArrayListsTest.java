package day9;

import java.util.ArrayList;

public class ArrayListsTest {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        System.out.println("--- Adding Scores ---");
        scores.add(85);
        scores.add(92);
        scores.add(78);

        System.out.println("First score: " + scores.get(0));

        System.out.println("-- Removing a Score ---");
        scores.remove(1);

        System.out.println("--- Final Score List ---");
        for(int score : scores){
            System.out.println(score);
        }


    }
}
