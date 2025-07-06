/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * July 5th, 2025
 * M5 Assignment: Array Location
 * This program returns the location of the biggest and smallest elements in an array
 * @author snell
 */

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class ArrayLocate {
    
    public static int [ ] locateLargest (double [ ][ ] arrayParam){
       // Establish new array to hold the location
       int [] largestLocation = new int [2];
       
       // Assume 0,0 is the location where the max number is
       double max = arrayParam[0][0];
       
       // Search through each row of each column for the largest number,
       // overwrite the location if a new larger number is found
       for (int i = 0; i < arrayParam.length; i++) {
         for (int j = 0; j < arrayParam[i].length; j++) {
             if (arrayParam[i][j] > max){
                 max = arrayParam[i][j];
                 largestLocation[0] = i;
                 largestLocation[1] = j;
          }
         }
        }
       return largestLocation;
    }
   
    public static int [ ] locateLargest (int [ ][ ] arrayParam){
       // Follow the same logic as above, replacing double with int
       int [] largestLocation = new int [2];
       int max = arrayParam[0][0];
      
       for (int i = 0; i < arrayParam.length; i++) {
         for (int j = 0; j < arrayParam[i].length; j++) {
             if (arrayParam[i][j] > max){
                 max = arrayParam[i][j];
                 largestLocation[0] = i;
                 largestLocation[1] = j;
          }
         }
        }
       return largestLocation;   
    }
        
    public static int [ ] locateSmallest (double [ ][ ] arrayParam){
        // Follow the same logic as before, replacing largest with smallest
       int [] smallestLocation = new int [2];
       double min = arrayParam[0][0];
       
       for (int i = 0; i < arrayParam.length; i++) {
         for (int j = 0; j < arrayParam[i].length; j++) {
             if (arrayParam[i][j] < min){
                 min = arrayParam[i][j];
                 smallestLocation[0] = i;
                 smallestLocation[1] = j;
           }
         }
       }
       return smallestLocation;
    }
            
    public static int [ ] locateSmallest (int [ ][ ] arrayParam){
        // Follow the same logic, replacing double with int
       int [] smallestLocation = new int [2];
       int min = arrayParam[0][0];
       
       for (int i = 0; i < arrayParam.length; i++) {
         for (int j = 0; j < arrayParam[i].length; j++) {
             if (arrayParam[i][j] < min){
                 min = arrayParam[i][j];
                 smallestLocation[0] = i;
                 smallestLocation[1] = j;
           }
         }
       }
       return smallestLocation;
    }
    
    // To reduce code, made an override print method for showing the user where the location is
    public static void printValue(String type, int value, int [] location){
    System.out.printf("The %s element is %d, located at row [%d] and column [%d].",
                      type, value, location[0], location[1]);
    }
    
    public static void printValue(String type, double value, int [] location){
    System.out.printf("The %s element is %1.2f, located at row [%d] and column [%d].",
                      type, value, location[0], location[1]);
    }
    
    /**
     * Added in input validation to ensure the program keeps running and gets a valid length,  
     * reviewed a tutorial to see how to do so in Java:
     * Citation: How to Input Validate Using While Loop in Java Tutorial (2020). Dr. Nina Javaher. YouTube. 
     * https://www.youtube.com/watch?v=FlMZhN9vzSI
     */
    
    public static int getLength(){
        Scanner input = new Scanner(System.in);
        int length = 0;
        
        while (true) {
            try {
                length = input.nextInt();

                if (length > 13) {
                    System.out.println("Please enter a number less than or equal to 13.");
                } else if (length < 1) {
                    System.out.println("Please enter a number greater than or equal to 1.");
                } else {
                    break;
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                input.next();
            }
        }

        return length;
    }
    
    // Main tester program to ensure that the locate code works
    public static void main(String[] args) {
       
       Random random = new Random();
       
       // Instructions for the user
       System.out.println("This program will locate the largest and the smallest element in a double and an integer array.");
       System.out.print("Please enter the row length for the arrays: ");
       int rowLength = getLength();
       System.out.print("Please enter the column length for the arrays: ");
       int colLength = getLength();
       
       // Create the double array using the users submission
       double[][] doubleArray = new double [rowLength][colLength];
       
       // Fill the arrays with random numbers, limited from 0 to 100
       for (int i = 0; i < rowLength; i++) {
           for (int j = 0; j < colLength; j++){
               doubleArray[i][j] = random.nextDouble() * 100;
        }
       }
       
       // Repeat for integer
       int [][] intArray = new int [rowLength][colLength];
       for (int i = 0; i < rowLength; i++) {
           for (int j = 0; j < colLength; j++){
               intArray[i][j] = random.nextInt(101);
        }
       }
       
       // Show the user the array so they can verify the location and value
       System.out.println();
       System.out.println("Double array:");
       
       // Added formating to show the column and row indices
       System.out.print("       ");
       for (int j = 0; j < colLength; j++) {
            System.out.printf("[%d]      ", j);  
        }
        
       System.out.println();
       for (int i = 0; i < rowLength; i++) {
            System.out.printf("[%d]", i);
            for (int j = 0; j < colLength; j++) {
                System.out.printf("%8.2f ", doubleArray[i][j]);
            }
            System.out.println();
        }
        
       // Attain the location and value of the largest and smallest double elements
       int[] bigDouble = ArrayLocate.locateLargest(doubleArray);
       int[] smallDouble = ArrayLocate.locateSmallest(doubleArray);
       double dmax = doubleArray[bigDouble[0]][bigDouble[1]];
       double dmin = doubleArray[smallDouble[0]][smallDouble[1]];
       
       System.out.println();
       printValue("largest", dmax, bigDouble);
       System.out.print(" ");
       printValue("smallest", dmin, smallDouble);
       System.out.println();
       
       // Repeat for the integer array
       System.out.println();
       System.out.println("Integer array:");
       
       System.out.print("     ");
            for (int j = 0; j < colLength; j++) {
                System.out.printf("[%d]   ", j);  
        }
            
        System.out.println();
        for (int i = 0; i < rowLength; i++) {
            System.out.print("[" + i + "]");
            for (int j = 0; j < colLength; j++) {
                System.out.printf("%5d ", intArray[i][j]);
            }  
          System.out.println();
        }
       int[] bigInt = ArrayLocate.locateLargest(intArray);
       int[] smallInt = ArrayLocate.locateSmallest(intArray);
       int imax = intArray[bigInt[0]][bigInt[1]];
       int imin = intArray[smallInt[0]][smallInt[1]];
       
       System.out.println();
       printValue("largest", imax, bigInt);
       System.out.print(" ");
       printValue("smallest", imin, smallInt);       
        
       }
    }

