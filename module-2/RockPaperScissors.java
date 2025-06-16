/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * June 15th, 2025
 * M2 Assignment: Rock-Paper-Scissors
 * This program plays a short game of rock-paper-scissors against a computer
 * @author snell
 */

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Computer's rock paper or scissors selection
        int computerChoice = 1 + (int)(Math.random() * 3);
        
        // Translate to rock paper or scissors
        String computerRPS = "";
        if (computerChoice == 1) computerRPS = "Rock";
        else if (computerChoice == 2) computerRPS = "Paper";
        else if (computerChoice == 3) computerRPS = "Scissors";

        // Introduce game, ask for users input
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Please enter your choice:");
        System.out.println("1 for Rock, 2 for Paper, and 3 for Scissors:");
        System.out.print("> ");
        int userChoice = input.nextInt();
        
        // Translate user selection
        String userRPS = "";
        if (userChoice ==1) userRPS = "Rock";
        else if (userChoice == 2) userRPS = "Paper";
        else if (userChoice == 3) userRPS = "Scissors";
        else userRPS = "You didn't choose a valid number";
        
        // Display the choices
        System.out.println("Computer chose: " + computerRPS);
        System.out.println("You chose: " + userRPS);

        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } 
        else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println(userRPS + " beats " + computerRPS + ", you win!");
        } 
        else {
            System.out.println(computerRPS + " beats " + userRPS + ", the computer wins!");
        }
    }
}