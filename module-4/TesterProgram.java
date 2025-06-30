/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * June 29th, 2025
 * M4 Assignment: Average Array
 * This program tests the average array overload method
 * @author snell
 */
import java.util.Scanner;
import java.util.Random;
        
public class TesterProgram {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
                
        // Instructions for the user
        System.out.println("This program calculates the average of four random arrays, of different data types. ");
        System.out.println("One short, one int, one long, and one double.");
        System.out.println("How long do you want each array to be? Please enter a valid integer.");
        
        // Array info for the input loop
        String[] arrayTypes = {"short", "int", "long", "double"};
        int[] lengths = new int[4];
        
        // Input loop to get each array length from the user
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the length for the " + arrayTypes[i] + " array: ");
            lengths[i] = input.nextInt();
        }
        
        // Giving the users chosen length to the new arrays
        short[] shortArray = new short[lengths[0]];
        int[] intArray = new int[lengths[1]];
        long[] longArray = new long[lengths[2]];
        double[] doubleArray = new double[lengths[3]];
        
        // Filling in the arrays with random values, keeping in mind data type limitations
        for (int i = 0; i < lengths[0]; i++) {
           // There was no nextShort for random, so entered the range manually
            shortArray[i] = (short)(random.nextInt(65536) - 32768);
        }
        for (int i = 0; i < lengths[1]; i++) {
            intArray[i] = random.nextInt();
        }
        for (int i = 0; i < lengths[2]; i++) {
            longArray[i] = random.nextLong();
        }
        for (int i = 0; i < lengths[3]; i++) {
            doubleArray[i] = random.nextDouble() * 1000;
        }
        
        // Printing out the original array elements along with the average value
        System.out.println();
        System.out.println("The short array is: ");
        PrintArray.print(shortArray);
        System.out.println("The average is: ");
        System.out.println(String.format("%,d", AverageArray.average(shortArray)));

        System.out.println();
        System.out.println("The int array is: ");
        PrintArray.print(intArray);
        System.out.println("The average is: ");
        System.out.println(String.format("%,d",AverageArray.average(intArray)));

        System.out.println();
        System.out.println("The long array is: ");
        PrintArray.print(longArray);
        System.out.println("The average is: ");
        System.out.println(String.format("%,d", AverageArray.average(longArray)));

        System.out.println();
        System.out.println("The double array is: ");
        PrintArray.print(doubleArray);
        System.out.println("The average is: ");
        System.out.println(String.format("%,f", AverageArray.average(doubleArray)));
    }
}
  