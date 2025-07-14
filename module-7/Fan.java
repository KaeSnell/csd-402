/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Mikaela Snell
 * July 6th, 2025
 * M6 Assignment: Fan Class
 * This program writes a fan class with modification methods
 * @author snell
 */
public class Fan {
       
       // Setting the constants
       final static int STOPPED = 0;
       final static int SLOW = 1;
       final static int MEDIUM = 2;
       final static int FAST = 3;
       
       // Declaring the private attributes
       private int speed;
       private boolean on;
       private int radius;
       private String color;
       
       // Creating the setters
       public void setSpeed(int speed){
           this.speed = speed;
       }
       public void setOn(boolean on){
       this.on = on;
       }
       public void setRadius(int radius){
           this.radius = radius;
       }
       public void setColor(String color){
           this.color = color;
       }
       
       // Creating the getters
       public int getSpeed(){
           return speed;
       }
       public boolean getOn(){
           return on;
       }
       public int getRadius(){
           return radius;
       }
       public String getColor(){
           return color;
       }
      
       // Creating a no-argument constructor with the default values
       public Fan(){
          this.speed = STOPPED;
          this.on = false;
          this.radius = 6;
          this.color = "white";
       }
       
       // Creating the constructor that takes arguments
       public Fan(int speed, boolean on, int radius, String color){
           this.speed = speed;
           this.on = on;
           this.radius = radius;
           this.color = color;
       }
       
       // The to-string method for letting the user know the fans specs
       public String toString(){
           if(on){
               return "The fan is " + this.color + " with a " + this.radius + " inch radius, and is turned on speed " + this.speed + ".";
           }
           else{
               return "The fan is " + this.color + " with a " + this.radius + " inch radius, and is turned off.";
           }
       }             
}