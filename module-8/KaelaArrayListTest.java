/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * July 20th, 2025
 * M8 Assignment: ArrayList Test
 * This program allows the user to create an ArrayList, then it returns the largest value
 * @author snell
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;

public class KaelaArrayListTest {
    
    public static Integer max(ArrayList<Integer> list){
        // Method returns the largest value in the ArrayList.
        if (list.isEmpty()){
            return 0; //If the ArrayList is sent in empty, the method returns 0.
        }
        Collections.sort(list); // Using the sort function to return the largest number, rather than looping through them
        return list.get(list.size() - 1);
    }
    
    public static int UserChoice(Scanner input){
        // While true loop to validate the users input
        while (true) {
            try {
                int userInput = input.nextInt();
                if (userInput == 1 || userInput == 2) {
                    return userInput;
                }
                else{
                System.out.println("Invalid input. Please enter 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                input.nextLine(); // Used next line in case the user enters a non-int input
            }
        }
    }
    
    public static void printArray(ArrayList<Integer> list) {
        // Created a method for returning the users array in a normal format
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Initial while true loop to allow the user to test multiple arrays
        while (true){
            System.out.println("Do you want to create a new array?");
            System.out.println("Enter 1 for yes, and 2 for no");
            System.out.print("> ");
            
            // Validate the input
            int choice = UserChoice(input);
            
            // Once the user selects to create a new array, start getting the user input to assign to the array list
            if (choice == 1){
                // Create the array
               ArrayList<Integer> intArray = new ArrayList<>();
               
               // Print instructions
               System.out.println("Please enter integers for the array.");
               System.out.println("Seperate the numbers with a space and enter one after another, or hit enter after each number");
               System.out.println("The array will stop when you enter '0'");
               
                // Second while true loop to let the user continue entering numbers until they enter 0
                while (true) {
                    try {
                        int num = input.nextInt();
                        intArray.add(num);
                        if (num == 0) {
                            break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid integer.");
                        input.nextLine();
                    }
                }
                
                // Printing the array, to make it easier to verify that the largest number was returned
                // In case the user seperated each input with an enter or entered an invalid input
                System.out.println("Here is the array you entered: ");
                printArray(intArray);
                Integer largest = max(intArray);
                System.out.println("The largest number entered is: " + largest);
                System.out.println();

            } else {
                // Quit the program when the user selected 2
                System.out.println("Now quiting program. Goodbye!");
                break;
            }
        }

        input.close();
    }
}