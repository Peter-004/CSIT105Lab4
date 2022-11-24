package csit105labch09f22;

/**
 * Tests CargoShip class
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class MiniBatchTesterCargoShipV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String shipName1 = "Old Rusty Hauler", shipName2 = "Oversized Barge";
        String yearBuilt1 = "1896", yearBuilt2 = "2019";
        String shipRegistry1 = "Location1", shipRegistry2 = "Over There";
        int tonage1 = 3200, tonage2 = 17;
        Ship myShip = new CargoShip(shipName1, yearBuilt1, shipRegistry1, tonage1);
        int returnValue = 0;

        System.out.println("\nShip as CargoShip Class Tester  Version 4\n");

        System.out.println("Creating Ship as CargoShip using values: " + shipName1 + " " + yearBuilt1 + " " + shipRegistry1
                + " " + tonage1);

        System.out.printf("\nship toString(): %s\t\n\n", myShip);

        System.out.printf("ship getShipName()     : %25s", myShip.getShipName());

        if (myShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myShip.getShipName().equals(shipName1)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        System.out.printf("ship getYearBuilt()    : %25s", myShip.getYearBuilt());

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

        if (myShip instanceof CargoShip) {
            System.out.printf("ship getCargoCapacity(): %25s", ((CargoShip) myShip).getCargoCapacity());

            if (((CargoShip) myShip).getCargoCapacity() == tonage1) {
                System.out.println(" -good");
            } else {
                System.out.println(" \t\t<== issue");
                returnValue++;
            }
        } else {
            System.out.println("\n*** not a CargoShip ship - can't get tonage***\t<== issue");
            returnValue++;
        }

        System.out.println("\nchanging ship via setters\nnew values: " + shipName2 + " " + yearBuilt2 + " " + shipRegistry2
                + "\n");

        myShip.setShipName(shipName2);
        myShip.setYearBuilt(yearBuilt2);
        myShip.setShipRegistry(shipRegistry2);

        if (myShip instanceof CargoShip) {

            ((CargoShip) myShip).setCargoCapacity(tonage2);
        } else {
            System.out.println("\n*** not a CargoShip ship - can't get tonage***\t<== issue");
            returnValue++;
        }

        System.out.printf("ship getShipName()     : %25s", myShip.getShipName());

        if (myShip.getShipName() == null) {
            System.out.println(" \t\t<== NULL issue");
            returnValue++;
        } else if (myShip.getShipName().equals(shipName2)) {
            System.out.println(" -good");
        } else {
            System.out.println(" \t\t<== issue");
            returnValue++;
        }

        System.out.printf("ship getYearBuilt()    : %25s", myShip.getYearBuilt());

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

        if (myShip instanceof CargoShip) {
            System.out.printf("ship getCargoCapacity(): %25s", ((CargoShip) myShip).getCargoCapacity());

            if (((CargoShip) myShip).getCargoCapacity() == tonage2) {
                System.out.println(" -good");
            } else {
                System.out.println(" \t\t<== issue");
                returnValue++;
            }
        } else {
            System.out.println("\n*** not a cruise ship - can't get tonage***\t<== issue");
            returnValue++;
        }

        if (returnValue == 0) {
            System.out.println("\nAll tests of CargoShip Good");
        } else {
            System.out.println("\n\t\t\t*** issues  -- CargoShip Happened -- ***\treturn value: " + returnValue);
        }

    }

}
