package csit105proglabch03onlinef22;

import java.util.Scanner;

/**
 * Look at the "Demo - writing the Car class" videos in the 
 * Module: "Ch 03 A First Look at Classes and Objects - overview"
 * then look at the video on the "Lab Ch 03 ( classes part 1 )" assignment
 * where Brower will instruct you on what changes to make to this file.
 * @author Adebayo Opemipo
 */
public class CSIT105ProgLabCh03OnlineF22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare local variables
        
        // to hold the values that the user will enter
        String makeEntered;
        int yearModelEntered;
        
        // to hold the Car object that will be instantiated below
        Car userCar;
        
        // Scanner object to get input from the user
        Scanner keyboard = new Scanner(System.in);
        
        // get data from user
        System.out.print("Enter the make of the Car: ");
        makeEntered = keyboard.nextLine();
        
        System.out.print("Enter the model year for the Car: ");
        yearModelEntered = keyboard.nextInt();
        
        // instantiate a Car object (userCar) using the values from the user
        userCar = new Car(yearModelEntered, makeEntered);
        
        // display the values from the Car object using the 'getters'
        displayCar(userCar, "\nHere are the values from the Car object:");
        
        //make the car go faster!
        userCar.accelerate();

        // display the values from the Car object using the 'getters' AFTER going faster
        displayCar(userCar, "\nAfter speeding up:");
        
        //make the car go slower!
        userCar.brake();
        
        // display the values from the Car object using the 'getters' AFTER going faster
        displayCar(userCar, "\nAfter slowing down:");
        
    }
    
    /**
     * the displayCar method displays a Car object to the console
     * @param carToDisplay the Car object to display on the console
     * @param heading a String value to display before the car 
     */
    public static void displayCar( Car carToDisplay, String heading ) {
        System.out.println(heading);
        System.out.println("Make: " + carToDisplay.getMake());
        System.out.println("Year: " + carToDisplay.getYearModel());
        System.out.println("Speed: " + carToDisplay.getSpeed());
    }
    
}