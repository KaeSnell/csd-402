/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Mikaela Snell
 * June 8th 2025
 * M1 Programming Assignment
 * This program demonstrates calculating the joules of energy needed to heat
 * a certain water amount to a final temperature from an initial temperature using Java
 */
import java.util.Scanner;

public class WaterHeaterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the kilograms of water being heated: ");
        double waterkilos = input.nextDouble();

        System.out.print("Please enter the initial water temperature in celsius: ");
        double initialtemp = input.nextDouble();

        System.out.print("In celsius, please enter the temperature are you heating the water to: ");
        double finaltemp = input.nextDouble();

        double energy = waterkilos * (finaltemp - initialtemp) * 4184;

        System.out.println("The energy needed to heat " + waterkilos + " kilograms of water is " + energy + " joules.");

        input.close();
    }
    
}
