/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * July 27th, 2025
 * M9 Assignment: ArrayList Error Catching
 * This program allows the user to select an array element to see, and catches errors if the user enters an invalid index number.
 * @author snell
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MuppetArrayList {

    public static void main(String[] args) {
        ArrayList<String> muppets = new ArrayList<>();
        muppets.add("Kermit the Frog");
        muppets.add("Miss Piggy");
        muppets.add("Fozzie Bear");
        muppets.add("Gonzo the Great");
        muppets.add("Rizzo the Rat");
        muppets.add("Beaker");
        muppets.add("The Swedish Chef");
        muppets.add("Statler and Waldorf");
        muppets.add("Rowlf the Dog");
        muppets.add("Scooter");
        
        
        // Use a ‘for-each’ loop to print the ArrayList collection
        System.out.println("Here are 10 members of The Muppets:");
        int i = 1;
        for (String muppet : muppets) {
            System.out.println(i + ". " + muppet);
            i++;
        }
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            // Ask a user which element they would like to see again. Showing and asking for the index in regular user values, and converting to Java index values
            System.out.println("Which muppet would you like to see again? Please enter a number 1 - 10, or enter 'exit' to quit the program");
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
              System.out.println("Now exiting program. Goodbye!");
              break;
            }
              
            try{
                Integer num = Integer.parseInt(input);
                int index = num - 1;
                
                /**
                 Optional: Method to catch out of bounds using logic instead of a catch
                 if (num >= 1 && num <= 10) {
                 System.out.println("You chose " + num + ". " + muppets.get(index));
                 } else {
                    System.out.println("Number out of range. Please enter a number between 1 and 10.");
                 }
                */
                
                
                // If using the optional method, comment out this print line and the out of bounds exception catch
                System.out.println("You chose " + num + ". " + muppets.get(index));
                
            }catch(IndexOutOfBoundsException e){
            System.out.println("Exception: Out of Bounds Input");
        } catch (NumberFormatException e) {
            System.out.println("Exception: Invalid input (not a number)");
        }
            }

    scanner.close();
}
}
