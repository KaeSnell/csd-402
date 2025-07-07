/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * July 6th, 2025
 * M6 Assignment: Fan Class
 * This program writes a fan class with modification methods
 * and creates two fan objects
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
               return "The fan is " + color + " with a " + radius + " inch radius, and is turned on speed " + speed + ".";
           }
           else{
               return "The fan is " + color + " with a " + radius + " inch radius, and is turned off.";
           }
       }             
    
    public static void main(String[] args) {
        
        // Creating and showing the initial fan
        Fan initialFan = new Fan();
        System.out.println("We offer many fans here, depending on request.");
        System.out.println("Here is the default fan info: " + initialFan.toString());
        
        // Creating a fan using the argumetns
        Fan customFan = new Fan(Fan.MEDIUM, true, 8, "yellow");
        System.out.println("Here is another model: " + customFan.toString());
        
        // Testing setter methods
        System.out.println("The default fans can be modified as needed.");
        
        initialFan.setColor("purple");
        initialFan.setOn(true);
        initialFan.setRadius(2);
        initialFan.setSpeed(Fan.SLOW);
        
        System.out.println("Here is the initial fan, modified per a custom order: " + initialFan.toString());
        
        // Testing the getter methods
        System.out.print("The fans can be customized, from any color " + initialFan.getColor() + " to " + customFan.getColor());
        System.out.print(", or having a radius from " + initialFan.getRadius() + " to " + customFan.getRadius() + " inches, any modification can be requested.");
    }
}

