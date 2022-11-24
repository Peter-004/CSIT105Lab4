package csit105lab04whichactivityfall22;

import java.util.Scanner;

/**
 * Source for paper based lab for Ch 4
 *
 * @author Stephen Brower
 */
public class CSIT105LabCh04PartBFall2022 {

    public static void main(String[] args) {

        // declare variables
        int bagsOfGold;
        String keyColorEntered, slayDragonEntered;
        String keyColor, slayDragon;
        Scanner input = new Scanner(System.in);

        System.out.println("Wizard's Test to Enter the Citadel\n");

        // get data
        System.out.print("What color key does the warrior have? ");
        keyColorEntered = input.nextLine();

        System.out.print("Has the warrior slayed the dragon? ");
        slayDragonEntered = input.nextLine();

        System.out.print("How many bags of gold does the warrior possess? ");
        bagsOfGold = input.nextInt();

        // calculate data
        // transform String input to lower case so that if fits on a line on paper
        keyColor = keyColorEntered.toLowerCase();
        slayDragon = slayDragonEntered.toLowerCase();

        // display results
        if (keyColor.equals("gold") && (slayDragon.equals("yes") || bagsOfGold >= 100)) {
            System.out.println("\nThe warrior is worthy.");
        } else {
            System.out.println("\nThe warrior is not worthy.");
        }

    }
}
