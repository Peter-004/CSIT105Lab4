package csit105labch09f22;

/**
 * Driver for Lab for Ch 09. Uses Ship, CruiseShip, and CargoShip
 *
 * @author Stephen T. Brower, modified by Adebayo Opemipo
 */
public class CSIT105LabCh09F22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalNumberOfPassengers = 0;
        int totalCargoCapacity = 0;

        // *****************************************************************//
        // create an array of ships
        Ship[] arrayOfShips = {new Ship("Black Pearl", "1725", "London"),
            new CruiseShip("Titanic", "1911", "Liverpool, UK", 3327),
            new CargoShip("SS Edmund Fitzgerald", "1958", "Milwaukee, WI", 26000),
            new CruiseShip("SS Minnow", "1964", "Gilligan's Island", 7),
            new CargoShip("Maersk Alabama", "1998", "Norfolk, VA", 17375),
            new CruiseShip("Costa Concordia", "2005", "Genoa, Italy", 3780),
            new Ship("Leif Erikson's Ship", "999", "Iceland")};   // The exact name of Leif Erikson's ship is not known

        System.out.println("=".repeat(35));
        System.out.println("===    Run of all V4 testers    ===");
        System.out.println("=".repeat(35));

        System.out.println("\n" + "=".repeat(80) + "\n");

        MiniBatchTesterShipV4.main(args);

        System.out.println("\n" + "=".repeat(80) + "\n");

        MiniBatchTesterCargoShipV4.main(args);

        System.out.println("\n" + "=".repeat(80) + "\n");

        MiniBatchTesterCruiseShipV4.main(args);

        System.out.println("\n" + "=".repeat(80) + "\n");

        System.out.println("<>".repeat(35));
        System.out.println("\n\nVisually Inspect the results of each of the three testers\n\n");

        System.out.println("=".repeat(35));
        System.out.println("===    End of all V4 testers    ===");
        System.out.println("=".repeat(35));

        // *****************************************************************//
        // display Array of Ships
        System.out.println("\nArray of Ships");
        for (int i = 0; i < arrayOfShips.length; i++) {
            System.out.printf("%2d %-20s %4s %-20s ", i, arrayOfShips[i].getShipName(),
                    arrayOfShips[i].getYearBuilt(), arrayOfShips[i].getShipRegistry());

            if(arrayOfShips[i] instanceof CruiseShip ){
                totalNumberOfPassengers += ((CruiseShip)arrayOfShips[i]).getNumPassengers();
                System.out.printf("%,d%n",((CruiseShip)arrayOfShips[i]).getNumPassengers());
            }
            else if(arrayOfShips[i] instanceof CargoShip ){
                totalCargoCapacity += ((CargoShip)arrayOfShips[i]).getCargoCapacity();
                System.out.printf("%,d%n",((CargoShip)arrayOfShips[i]).getCargoCapacity());
            }
            else{
                System.out.println("neither");
            }

        }

        System.out.println("\nFor array of Ships");
        System.out.printf("\tTotal number of passengers: %,d\n", totalNumberOfPassengers);
        System.out.printf("\tTotal cargo capacity: %,d\n", totalCargoCapacity);

    }

}

/*
 * Note: years, tonnage, and passenger capacities pillaged from wikipedia
 *      https://en.wikipedia.org/wiki/Titanic
 *      https://en.wikipedia.org/wiki/MV_Tygra  ( previously Maersk Alabama)
 *      https://en.wikipedia.org/wiki/Costa_Concordia
 *      https://en.wikipedia.org/wiki/S._S._Minnow
 *      https://en.wikipedia.org/wiki/Black_Pearl
 *      https://en.wikipedia.org/wiki/SS_Edmund_Fitzgerald
 *          ** immortalized in song "The Wreck of the Edmund Fitzgerald" by Gordon Lightfoot
 *				https://en.wikipedia.org/wiki/The_Wreck_of_the_Edmund_Fitzgerald
 *      https://en.wikipedia.org/wiki/Leif_Erikson
 *
 *      Please sail responsibly.
*/
