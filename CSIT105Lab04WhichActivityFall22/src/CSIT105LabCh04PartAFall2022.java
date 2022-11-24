package csit105lab04whichactivityfall22;

import java.util.Scanner;

/**
 * Source for paper based lab for Ch 4
 *
 * @author Stephen Brower
 */
public class CSIT105LabCh04PartAFall2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // declare variables
        Scanner input = new Scanner(System.in);
        double bonus, sales;

        // get data
        System.out.print("Enter the sales amount for the month: ");
        sales = input.nextDouble();

        // calculate data
        if (sales < 5000.0) {
            bonus = 200.00;
        } else if (sales < 7500.0) {
            bonus = 500.00;
        } else if (sales < 10000.0) {
            bonus = 750.00;
        } else if (sales < 20000.0) {
            bonus = 1000.00;
        } else {
            bonus = 1250.00;
        }

        // display results
        System.out.printf("\nGiven $%,.2f in sales, the bonus is $%,.2f\n", 
                sales, bonus);
        
    } // end main method
} // end class
