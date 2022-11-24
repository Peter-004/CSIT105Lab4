package csit105labch09f22;

/**
 * Tests Ship class
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class MiniBatchTesterShipV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String shipName1 = "Nautilus King of the Sea", shipName2 = "Nau Sea";
        String yearBuilt1 = "1492", yearBuilt2 = "2017";
        String shipRegistry1 = "Location1", shipRegistry2 = "Over There";
        Ship myShip = new Ship(shipName1, yearBuilt1, shipRegistry1);
        int returnValue = 0;

        System.out.println("\nShip Class Tester version 4\n");

        System.out.println("Creating ship using values: " + shipName1 + " " + yearBuilt1 + " " + shipRegistry1);

        System.out.printf("\nship toString(): %s\t{not required}\n\n", myShip);

        System.out.printf("ship getShipName() : %25s", myShip.getShipName());

        if (myShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myShip.getShipName().equals(shipName1)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        System.out.printf("ship getYearBuilt(): %25s", myShip.getYearBuilt());

        if (myShip.getYearBuilt() == yearBuilt1) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        System.out.printf("ship getShipRegistry(): %25s", myShip.getShipRegistry());

        if (myShip.getShipRegistry().equals(shipRegistry1)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        System.out.println("\nchanging ship via setters\nnew values: " + shipName2 + " " + yearBuilt2 + " " + shipRegistry2
                + "\n");

        myShip.setShipName(shipName2);
        myShip.setYearBuilt(yearBuilt2);
        myShip.setShipRegistry(shipRegistry2);

        System.out.printf("ship getShipName() : %25s", myShip.getShipName());

        if (myShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myShip.getShipName().equals(shipName2)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        System.out.printf("ship getYearBuilt(): %25s", myShip.getYearBuilt());

        if (myShip.getYearBuilt() == yearBuilt2) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        System.out.printf("ship getShipRegistry(): %25s", myShip.getShipRegistry());

        if (myShip.getShipRegistry().equals(shipRegistry2)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        if (returnValue == 0) {
            System.out.println("\nAll tests of Ship Good");
        } else {
            System.out.println("\n\t\t\t*** issues -- Ship Happened -- ***\treturn value: " + returnValue);
        }

    }

}
