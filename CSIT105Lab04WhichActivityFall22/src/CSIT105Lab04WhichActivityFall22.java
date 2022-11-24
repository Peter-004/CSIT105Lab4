package csit105lab04whichactivityfall22;

import java.util.Scanner;

/**
 * Driver for Lab Ch 4.
 * For this lab, you are modifying the TemperatureBasedActivity.java file
 * @author Stephen T. Brower
 */
public class CSIT105Lab04WhichActivityFall22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temperatureEntered;

        TemperatureBasedActivity activity;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the outdoor temperature: ");
        temperatureEntered = input.nextInt();

        activity = new TemperatureBasedActivity(temperatureEntered);

        System.out.printf("\nAt %d degrees I recommend: %s\n",
                temperatureEntered, activity.recommendedActivity());

    }
    
}
