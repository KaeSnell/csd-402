/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Mikaela Snell
 * August 3rd, 2025
 * M10 Assignment: Class Abstraction
 * This program demonstrates class abstraction with concrete subclasses
 * @author snell
 */

public class DomesticDivision extends Division{
    private final String state;
    
    public DomesticDivision(String companyDivName, int accountNumber, String state){
        super(companyDivName, accountNumber);
        this.state = state;
    }
    
    @Override
    public void display(){
        System.out.print(companyDivName + " is part of our Domestic Division, and operates out of ");
        System.out.print(state + ". ");
        System.out.print("The account number for " + companyDivName + " is " + accountNumber + ".");
    }
    }
