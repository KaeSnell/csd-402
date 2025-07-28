/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * July 27th, 2025
 * M9 Assignment: File Creation 
 * This program allows the user to create a file named data.file if it doesn't exist and fill it with 10 random numbers. 
 * If data.file already exists, it appends a new set of 10 random numbers to the file.
 * @author snell
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();
        
        try{
            // Create the file, it it already exists, skip this step
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File Succesfully Created");
            }
            
          FileWriter fw = new FileWriter(file, true);
          PrintWriter pw = new PrintWriter(fw);
            
          // Write to the file, adding 10 random numbers
          System.out.println("Filing the file with data.");
            for(int i = 0; i < 10; i++){
                int num = random.nextInt(100);
                pw.print(num + " ");
            }
            // End the writing on a new line, close the file
            pw.println();
            pw.close();

        } 
        catch(IOException ioe){
            System.out.println("Error saving data: " + ioe.getMessage());
        }
        
        try{
            // Open the file, and read the contents
            Scanner reader = new Scanner(file);
            System.out.println("\nContents of data.file:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close(); 
        }
        catch (IOException ioe) {
            System.out.println("Error reading data: " + ioe.getMessage());
        }
    
}
}