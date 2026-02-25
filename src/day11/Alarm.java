package day11;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "src/day10/Music.wav";

        while (alarmTime == null){
            try{
                System.out.print("Enter a Time to set Alarm: ");
                String inputTime = sc.nextLine();

                alarmTime = LocalTime.parse(inputTime,formatter);

                System.out.println("Alarm set for: "+alarmTime);
            }
            catch (DateTimeException e){
                System.out.println("Invalid Input! Please enter valid Time");
            }
        }
        AlarmClock alarmClock = new AlarmClock(alarmTime,filePath,sc);
        Thread alarmThread  = new Thread(alarmClock);
        alarmThread.start();

    }
}
class AlarmClock implements Runnable{
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner sc;


    AlarmClock(LocalTime alarmTime,String filePath,Scanner sc){
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.sc = sc;
    }
    @Override
    public void run() {

        while(LocalTime.now().isBefore(alarmTime)){
            LocalTime now = LocalTime.now();
            System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Thread Interrupted");
            }
        }
        playSound(filePath);
    }
    private void playSound(String filePath){

        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("\nPress Enter to Stop Alarm");
            sc.nextLine();
            clip.close();

            sc.close();;

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
