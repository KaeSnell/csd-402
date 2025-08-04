/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * August 3rd, 2025
 * M10 Assignment: Class Abstraction
 * This program demonstrates class abstraction with concrete subclasses
 * @author snell
 */

public class UseDivision {
    Division[] companies = new Division[4];

    public UseDivision() {
        companies[0] = new DomesticDivision("Eighsevendo Merch", 2925, "Minnesota");
        companies[1] = new DomesticDivision("Eighsevendo TV", 3061, "California");
        companies[2] = new InternationalDivision("Eighsevendo Games", 7369, "Sweden", "Swedish");
        companies[3] = new InternationalDivision("Eighsevendo Books", 8508, "Ireland", "English and Gaeilge");
    }
    
    public void displayAll(){
        for (Division division: companies){
            division.display();
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        UseDivision compDiv = new UseDivision();
        compDiv.displayAll();
    }
}