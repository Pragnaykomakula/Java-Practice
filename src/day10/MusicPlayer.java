package day10;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        String filePath = "src//day10//music.wav";
        File file  = new File(filePath);

        try (Scanner sc = new Scanner(System.in); AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = " ";
            System.out.println("--- Java Jukebox Initialized ---");

            while (!response.equals("Q")){
                System.out.println("P -> Play");
                System.out.println("S -> Stop");
                System.out.println("R -> Reset");
                System.out.println("Q -> Quit");
                System.out.print("\nEnter your choice: ");
                response = sc.nextLine().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid response");
                }
            }
            System.out.println("Goodbye!");

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported File Format");
        }
        catch (LineUnavailableException e) {
            System.out.println("Line not Found!");
        }
        catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
