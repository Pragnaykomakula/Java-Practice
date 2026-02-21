package day10;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {

        String file = "secret.text";

        try(FileWriter writer = new FileWriter(file)){
            writer.write("Java File I/O is powerful");

            System.out.println("File written successfully!");
        }
        catch (IOException e ){
            System.out.println("An error occurred while writing.");
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}
