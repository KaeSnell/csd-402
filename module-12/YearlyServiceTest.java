/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Mikaela Snell
 * August 7th, 2025
 * Assignment 12.2: Yearly Service
 * @author snell
 */

import java.util.Scanner;
        
public class YearlyServiceTest {
    Scanner scanner = new Scanner(System.in);  
    
    static final double STANDARD_SERVICE_CHARGE = 100.00;
    
    // 1st method with no parameters
    public static double yearlyService(){
        return STANDARD_SERVICE_CHARGE;
    }
    
    // 2nd method with 1 parameter
    public static double yearlyService(double oilCharge){
        return STANDARD_SERVICE_CHARGE + oilCharge;
    }
    
    // 3rd method with 2 parameters
    public static double yearlyService(double oilCharge, double tireRotation){
        return STANDARD_SERVICE_CHARGE + oilCharge + tireRotation;
    }
    
    public static void verifyInt(){
        
    }
    
    // 4th method with 3 parameters
    public static double yearlyService(double oilCharge, double tireRotation, double couponRate){
        double total = STANDARD_SERVICE_CHARGE + oilCharge + tireRotation;
        double finalTotal = total * ((100 - couponRate)/100);
        return finalTotal;
    }
    
    // Created a method to validate the input is a double
    public static double getValidDouble() {
    Scanner scanner = new Scanner(System.in);    
    while (true) {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble(); 
        } else {
            System.out.println("Please enter a valid number:");
            scanner.next();
        }
    }
}   
    // A method to verify the coupon is a number between 1 and 100
    public static double verifyCoupon(double coupon){
        while (true){
            if (coupon >= 1 && coupon <= 100){
                return coupon;
            }
            else {
            System.out.println("Please enter a coupon rate between 1 and 100:");
            coupon = getValidDouble();
        }
    }
    }
    
    // Make a main method to test the four yearlyService methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the name of your new automotive shop: ");
        String ShopName = scanner.nextLine();
        System.out.println("Shop " + ShopName + " right? That's got a nice ring to it!");
        System.out.println("Next, please enter in how much you want to charge for the following extra services.");
        
        System.out.println("First, please enter the regular prices.");
        System.out.print("A regular oil change is > $");
        double regOilCharge = getValidDouble();
        System.out.print("A regular tire rotation is > $");
        double regTireRotation = getValidDouble();
        System.out.print("What percentage off should the regular coupon rate be? > %");
        double regCouponRate = verifyCoupon(getValidDouble());
        
        System.out.print("Next, lets set the premium prices!");
        System.out.print("A premium oil change is > $");
        double premOilCharge = getValidDouble();
        System.out.print("A premium tire rotation is > $");
        double premTireRotation = getValidDouble();
        System.out.print("What percentage off should the premium coupon rate be? > %");
        double premCouponRate = verifyCoupon(getValidDouble());
         
         // Test each method twice
        System.out.println();
        System.out.println("Awesome! Let's see a couple of example prices to make sure that's right:");
        System.out.printf("A standard service will cost: $%.2f%n", yearlyService());
        System.out.printf("A standard service with a regular oil change: $%.2f%n", yearlyService(regOilCharge));
        System.out.printf("A full regular package (service, oil change, and tire rotation): $%.2f%n", yearlyService(regOilCharge, regTireRotation));
        System.out.printf("And with a regular coupon, that will be: $%.2f%n", yearlyService(regOilCharge, regTireRotation, regCouponRate));
        System.out.printf("Now for the premium prices! A service with a premium oil change: $%.2f%n", yearlyService(premOilCharge));
        System.out.printf("And a full premium package: $%.2f%n", yearlyService(premOilCharge, premTireRotation));
        System.out.printf("With a premium coupon, that comes to: $%.2f%n", yearlyService(premOilCharge, premTireRotation, premCouponRate));
        System.out.printf("Still, with standard service charge of $%.2f", yearlyService());
        System.out.print(" customers will come flocking in!");
    }
    
}
