/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Mikaela Snell
 * June 29th, 2025
 * M4 Assignment: Average Array
 * This class calculates the average for a given array
 * @author snell
 */
public class AverageArray {

    public static short average (short[] array) {
        // I originally had the sum be short as well
        // however I got an overflow error that caused the average to be incorrect
        int sum = 0;
        for (short num: array) {
             sum += num;
        }
        return (short)(sum / array.length);
    }
        
    public static int average (int [ ] array){
        // Since int is a relatively narrow window as well
        // I changed the sum to long to be safe
        long sum = 0;
        for (int num: array) {
            sum += num;
        }
        return (int)(sum / array.length);
    }
    
    public static long average (long [ ] array){
        // I'm not too sure how to handle overflow here. 
        // One of my tests did have the overflow issue, but I don't know what else to cast the sum to
        // Or any other methods to help the issue
        long sum = 0;
        for (long num: array) {
            sum += num;
        }
        return (long)(sum / array.length);
    }
    
    public static double average (double [ ] array){
        double sum = 0;
        for (double num: array) {
            sum += num;
        }
        return (double)(sum / array.length);
    }
}

