/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * July 13th, 2025
 * M7 Assignment: Fan Collection
 * This program uses the fan class to make a collection of fans
 * and displays them without using the toString() method
 */
import java.util.ArrayList;
        
public class UseFans {
    
    //Method for taking a collection of Fan instances for displaying, without using the toString() method
    public static void displayAllFans(ArrayList<Fan> fan){
        for (Fan i : fan){
            displayFan(i);
        }
        
        
    }
    
    //Method that takes a single instance of a Fan for displaying without using the toString() method
    public static void displayFan(Fan fan){
        if (fan.getOn()){
            System.out.println("The fan is " + fan.getColor() + " with a " + fan.getRadius() + " inch radius, and is turned on speed " + fan.getSpeed() + ".");
        }
        else{
            System.out.println("The fan is " + fan.getColor() + " with a " + fan.getRadius() + " inch radius, and is turned off.");
        }
    }
  
    public static void main(String[] args){
        //Create a collection of Fan instances
        ArrayList<Fan> fanCollection = new ArrayList<Fan>();
        
        Fan fan1 = new Fan();
        fanCollection.add(fan1);
        
        Fan fan2 = new Fan(Fan.FAST, true, 10, "purple");
        fanCollection.add(fan2);
        
        Fan fan3 = new Fan(Fan.STOPPED, false, 8, "cyan");
        fanCollection.add(fan3);
        
        //Test Code
        displayFan(fan1);
        
        displayAllFans(fanCollection);
        
    }
    
   

}
