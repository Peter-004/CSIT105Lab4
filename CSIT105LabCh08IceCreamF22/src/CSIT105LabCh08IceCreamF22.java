package csit105labch08icecreamf22;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Starter file for Lab for Ch 8 ( and Ch 7 Part 3)
 * Because of the shortened time, this starter file has been
 * provided with: the arrays declared, reading the file but doesn’t load
 * data to the arrays, displays the arrays at the end but
 * without the averages
 *
 * @author ??????
 */
public class CSIT105LabCh08IceCreamF22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String filename = "IceCreamRatings.txt";
        String badDataFileName = "BadData.txt";
        String lineRead;
        final int MAX_NUM_ICE_CREAMS = 60;
        String[] iceCreamName = new String[MAX_NUM_ICE_CREAMS];
        double[][] iceCreamRatingByMonth = new double[MAX_NUM_ICE_CREAMS][12];
        int numIceCreams = 0;
        double[] monthTotal = new double[12];
        String[] months = {"Jan", "Feb", "Mar",
                "Apr", "May", "Jun", "Jul",
                "Aug", "Sep", "Oct",
                "Nov", "Dec"};
        int numBad = 0;
        int rowTotal = 0;

        // Open the file to read from.
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        // Open the file to write to.
        PrintWriter outputFile = new PrintWriter(badDataFileName);

        // while file has data and array not full
        while (inputFile.hasNext() && numIceCreams < MAX_NUM_ICE_CREAMS) {
            // read an entire line from the file
            lineRead = inputFile.nextLine();

            // if right number of tokens
            //      load the arrays
            //      then 
            numIceCreams++;
            // else {
            //      outputFile.println(lineRead);
            //      numBad++;
            // }
        }
        // close the files
        inputFile.close();
        outputFile.close();
        // echo back what we read
        // display column headers
        System.out.printf("\n%-35s ", "Ice Cream Name");
        for (int month = 1; month <= 12; month++) {
            System.out.printf("%3s ", months[month - 1]);
        }
        System.out.printf("%7s\n\n", "Average");

        // display data
        for (int iceCream = 0; iceCream < numIceCreams; iceCream++) {
            rowTotal = 0;

            // display iceCream as row header
            System.out.printf("%-35s ", iceCreamName[iceCream]);

            // display month data
            for (int month = 0; month < 12; month++) {
                System.out.printf("%3.1f ", iceCreamRatingByMonth[iceCream][month]);
                // total row
                rowTotal += iceCreamRatingByMonth[iceCream][month];
                // total col
                monthTotal[month] += iceCreamRatingByMonth[iceCream][month];
            }
            // calculate and display average
            System.out.printf("%7d\n", rowTotal); // <== needs a fix

        }
        // display month averages

        System.out.printf("\n%-35s ", Average);
        for (int month = 0; month < 12; month++) {
            System.out.printf("%3.1f ", monthTotal[month]); // <== needs a fix
        }
        System.out.println();

        System.out.println("\n" + numIceCreams + " ice creams loaded from file " + filename);
        System.out.println(numBad + " bad rows written to file " + badDataFileName);


    }

}
