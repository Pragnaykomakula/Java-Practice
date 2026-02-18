package day7;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {"1) Which device is known as the brain of the computer?",
                              "2) Which of the following is an Operating System? ",
                              "3) What does RAM stand for?",
                              "4) Which of the following is a programming language?",
                              "5) Which storage device has the largest capacity?"};

        String[][] options = {{ "1) Monitor","2) Keyboard","3) CPU","4) Mouse"},
                               {"1) MS Word","2) Windows","3) Google Chrome","4) Photoshop"},
                               {"1) Read Access Memory","2) Random Access Memory","3) Run Access Memory","4) Real Access Memory"},
                               {"1) HTML","2) HTTP","3) FTP","4) SMTP"},
                               {"1) CD","2) Pen Drive","3) Hard Disk","4) Floppy Disk"}};

        int[] answers ={3,2,2,1,3};
        int score = 0;
        int guess;

        System.out.println("----------------------------");
        System.out.println("----Welcome to Quiz Game----");
        System.out.println("----------------------------");
        System.out.println();


        for(int i = 0 ; i < questions.length ; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your Answer: ");
            guess = sc.nextInt();

            if(guess == answers[i]){
                System.out.println("CORRECT ANSWER");
                System.out.println();
                score ++;
            }else{
                System.out.println("INCORRECT ANSWER");
            }
        }

        System.out.println("YOUR SCORE IS: " + score);

        System.out.println("----------------------------");
        System.out.println("---------THANK YOU ---------");
        System.out.println("----------------------------");





        sc.close();
    }
}
