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

public abstract class Division {
    
    protected String companyDivName;
    protected int accountNumber;
    
    public abstract void display();
    
    public Division(String companyDivName, int accountNumber){
        this.companyDivName = companyDivName;
        this.accountNumber = accountNumber;
    }
}
