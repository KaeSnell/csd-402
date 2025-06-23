/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snel
 * June 22nd, 2025
 * M3 Assignment: nested for loops
 * This program demonstrates using nested for loops to print out a pattern
 * @author snell
 */

/**
*Code inspired by
*"Java Program #18 - Print Pyramid Star Pattern in Java" by Programming For Beginners
* https://www.youtube.com/watch?v=2ORtCWqcs7Y
*/

public class Nested_for_loop {
    public static void main(String[] args) {
        // establish the constant and variable types
        int ROWS = 7;
        int i, j, k, l, m;
        // first loop counting down the rows
         for (i = 1; i <= ROWS; i++) {
             // inner loop printing spaces to help align
            for (j = 1; j <= ROWS - i; j++) {
                System.out.print("   ");
            }
            // inner loop printing the left half of the squared numbers
            for (k = 1; k <= i; k++) {
                System.out.printf("%-3d", (int) Math.pow(2, k - 1));
            }
            // inner loop printing the right half of the squared numbers, descending order
            for (l = i - 1; l >= 1; l--) {
                System.out.printf("%-3d", (int) Math.pow(2, l - 1)); 
            }
            
            // calculating the number of spaces needed to align the @'s
            int spaces = (ROWS - i) * 3;
            
            // final loop for adding the formatting needed
            for (m = 0; m < spaces; m++){
               System.out.print(" ");
            }
            // print the @ and start a new line with each execution of the outer loop
            System.out.println("@");
        }
    }
}