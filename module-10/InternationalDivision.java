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

public class InternationalDivision extends Division{
    private final String country;
    private final String languageSpoken;
    
    public InternationalDivision(String companyDivName, int accountNumber, String country, String languageSpoken){
        super(companyDivName, accountNumber);
        this.country = country;
        this.languageSpoken = languageSpoken;
    }
    
    @Override
    public void display(){
        System.out.print(companyDivName + " is part of our International Division, and operates out of ");
        System.out.print(country + ". The primary language spoken there is " + languageSpoken + ". ");
        System.out.print("The account number for " + companyDivName + " is " + accountNumber + ".");
}
    
}