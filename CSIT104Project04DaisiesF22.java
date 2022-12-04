package csit104project04daisiesf22;

import java.util.Scanner;
import java.util.Random;

/**
 * Project 4
 *
 * You are changing option G, option M, and the gatheringMessage() method
 *
 * @author Stephen Brower, modified by Adebayo Opemipo Peter
 */
public class CSIT104Project04DaisiesF22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // declare variables.
        final int NUM_ROWS = 10;	// number of rows for array
        final int NUM_COLS = 10;	// number of columns for array
        final int MAX_VALUE = 500;	// maximum value for random numbers
        final double GATHER_PERCENT = 0.8; // percent of daisies to gather
        int[][] daisyFields = new int[NUM_ROWS][NUM_COLS]; // 2D array of ints
        // note: a prior version of the project had a ragged array, this is not ragged
        Random randomNumbers = new Random(); // for generating random numbers
        String userChoice;
        int rowEntered, colEntered;
        int daisiesGatheredAtSpot, totalDaisiesGathered = 0;
        int numGatherings = 0;
        Scanner keyboard = new Scanner(System.in);
        
        // your additional variables

        // populate array
        for (int row = 0; row < daisyFields.length; row++) {
            for (int col = 0; col < daisyFields[row].length; col++) {
                daisyFields[row][col] = randomNumbers.nextInt(MAX_VALUE) + 1; // generates a random number 1.MAX_VALUE
            }
        }

        do {
            // display array
            displayArray(daisyFields);

            System.out.printf("\nTotal Daisies Gathered: %,d (%s)\n",
                    totalDaisiesGathered, gatheringMessage(totalDaisiesGathered));

            // get command from user
            System.out.print("\nEnter Command (G,M,Q): ");
            userChoice = keyboard.nextLine();

            switch (userChoice.toUpperCase()) {
                case "Q":
                    System.out.printf("\nYou gathered a total of %,d daisies in %d number of gatherings\n\n%s\n",
                            totalDaisiesGathered, numGatherings, gatheringMessage(totalDaisiesGathered));
                    System.out.println("\nGood bye!");
                    break;
                case "G":
                    ////////////////////////////////////////////////////////////
                    // you need to restrict the row value the user can enter  //
                    //                                                        //
                    System.out.print("\nEnter row: ");
                    rowEntered = keyboard.nextInt();

                    /* your logic here to not allow the rowEntered to be < 0
                       and not >= NUM_ROWS*/
                    while(rowEntered < 0 || rowEntered>= NUM_ROWS){
                        System.out.print("\nEnter row: ");
                        rowEntered = keyboard.nextInt();
                    }
                    ////////////////////////////////////////////////////////////
                    ////////////////////////////////////////////////////////////
                    // you need to restrict the col value the user can enter  //
                    //                                                        //
                    System.out.print("Enter col: ");
                    colEntered = keyboard.nextInt();

                    keyboard.nextLine(); // consume the CR in the buffer

                    /* your logic here to not allow the colEntered to be < 0
                       and not >= NUM_COLS
                       Note: a prior version of the project had a ragged array and I
                       switched it to a fixed number of columns */
                    while(colEntered < 0 || colEntered >= NUM_COLS){
                        System.out.print("Enter col: ");
                        colEntered = keyboard.nextInt();

                        keyboard.nextLine();
                    }
                    ////////////////////////////////////////////////////////////

                    // display daisies at spot
                    System.out.printf("\nDaisies at (%d,%d): %d", rowEntered, colEntered, daisyFields[rowEntered][colEntered]);

                    // calculate number of daisies gathered
                    daisiesGatheredAtSpot = (int) (daisyFields[rowEntered][colEntered] * GATHER_PERCENT);

                    // accumulate daisies
                    totalDaisiesGathered += daisiesGatheredAtSpot;

                    // remove daisies from spot ( imagine a plucking sound )
                    daisyFields[rowEntered][colEntered] -= daisiesGatheredAtSpot;

                    // report daisies gathered
                    System.out.printf(", gathered %d daisies\n", daisiesGatheredAtSpot);

                    numGatherings++;

                    break;
                case "M":
                    ////////////////////////////////////////////////////////////
                    // you need to find 'a' spot with the most daisies        //
                    // and display the row/col                                //
                    ////////////////////////////////////////////////////////////

                    /* Finding maximum in a 2d array
                        int max = daisyFields[0][0];
                        for(int[] i : daisyFields){
                            for(int j : i){

                                if(j > max){
                                    max = j;
                                }
                            }
                        }
                     */

                    //returning the index of the maximum int in a 2d array
                    int row = 0,col = 0;
                    int max = daisyFields[0][0];
                    for(int index = 0; index < NUM_ROWS; index++){
                        for(int j = 1; j < NUM_COLS; j++){
                            if( daisyFields[index][j] > max){
                                max = daisyFields[index][j];
                                row = index;
                                col = j;
                            }
                        }
                    }
                    System.out.println("Maximum daisies "+"("+ max + ")"+ " found at " + row + ","+ col);
                    break;
                default:
                    System.out.println("\nInvalid command");
            }

        } while (!(userChoice.equalsIgnoreCase("Q")));

    }

    /**
     * the displayArray method displays the 2D array of int to the console
     *
     * @param arrayToDisplay the 2D array to be displayed
     */
    public static void displayArray(int[][] arrayToDisplay) {

        int maxRowLength = 0;

        // if the array is ragged, then determine the most number of columns
        for (int i = 0; i < arrayToDisplay.length; i++) {
            if (arrayToDisplay[i].length > maxRowLength) {
                maxRowLength = arrayToDisplay[i].length;
            }
        }

        System.out.printf("\n%3s  ", " ");
        for (int col = 0; col < maxRowLength; col++) {
            System.out.printf("%3d ", col);
        }
        System.out.println();
        System.out.printf("%3s  ", " ");
        for (int col = 0; col < maxRowLength; col++) {
            System.out.printf("%3s ", "---");
        }
        System.out.println();
        for (int row = 0; row < arrayToDisplay.length; row++) {
            System.out.printf("%3d: ", row);
            for (int col = 0; col < arrayToDisplay[row].length; col++) {
                System.out.printf("%3d ", arrayToDisplay[row][col]);
            }
            System.out.println();
        }

    }

    /**
     * the gatheringMessage method will determine an appropriate message based
     * on the totalDaisiesGathered
     *
     * @param totalDaisiesGathered the value to consider for the message
     * @return a String based on totalDaisiesGathered
     */
    public static String gatheringMessage(int totalDaisiesGathered) {
        String gatheringMessage;


        ////////////////////////////////////////////////////////////

        /* your logic here to determine gatheringMessage 
           based on totalDaisiesGathered */
 
            if(totalDaisiesGathered == 0)gatheringMessage = "What? No daisies picked";
            else if(totalDaisiesGathered > 0 && totalDaisiesGathered < 500){
                gatheringMessage = "That isn't too much daisies";
            }
            else if(totalDaisiesGathered > 499 && totalDaisiesGathered < 1000){
                gatheringMessage = "That's an acceptable number of daisies";
            }
            else if(totalDaisiesGathered > 999 && totalDaisiesGathered < 2000){
                gatheringMessage = "Fantastic!";
            }
            else{
                gatheringMessage = "That's getting too much";
            }
        

        ////////////////////////////////////////////////////////////
        return gatheringMessage;
    }
}
