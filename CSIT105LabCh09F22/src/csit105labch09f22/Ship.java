package csit105labch09f22;

/**
 * Ship class for Lab Ch 09
 * @author Adebayo Opemipo
 */
public class Ship {
    private String shipName;
    private String yearBuilt;
    private String shipRegistry;

    /**
     * Constructor
     * @param initialShipName initial value for the shipName field
     * @param initialYearBuilt initial value for the yearBuilt field
     * @param initialShipRegistry initial value for the shipRegistry field
     */
    public Ship(String initialShipName, String initialYearBuilt, String initialShipRegistry){
        shipName = initialShipName;
        yearBuilt = initialYearBuilt;
        shipRegistry = initialShipRegistry;
    }

    /**
     * getShipName method retrieves the value from the shipName field
     * @return value of the shipName field
     */
    public String getShipName(){
        return shipName;
    }

    /**
     * getYearBuilt method retrieves the value from the yearBuilt field
     * @return value of the yearBuilt field
     */
    public String getYearBuilt() {
        return yearBuilt;
    }

    /**
     * getShipRegistry method retrieves the value from the shipRegistry field
     * @return value of the shipRegistry field
     */
    public String getShipRegistry() {
        return shipRegistry;
    }

    /**
     * setShipName method assigns a value to the shipName field
     * @param newShipName the value to be assigned by the method
     */
    public void setShipName(String newShipName){
        shipName = newShipName;
    }

    /**
     * setYearBuilt method assigns a value to the yearBuilt field
     * @param newYearBuilt the value to be assigned by the method
     */
     public void setYearBuilt(String newYearBuilt){
        yearBuilt = newYearBuilt;
     }

    /**
     * setShipRegistry method assigns a value to the shipRegistry field
     * @param newShipRegistry the value to be assigned by the method
     */
     public void setShipRegistry(String newShipRegistry){
        shipRegistry = newShipRegistry;
     }

    /**
     * toString method returns a full detail of the ship
     * @return a String representing the ship
     */
     public String toString(){
        return "Ship: " + shipName + " - Year: " + yearBuilt + " - Reg: " + shipRegistry;
     }
}

/*
Note: 

In Ship, you will have 3 private fields: shipName, yearBuilt and shipRegistry all as Strings

The Constructor will receive: initialShipName, initialYearBuilt and initialShipRegistry all as Strings

You will implement the methods:
getShipName()
getYearBuilt()
getShipRegistry()
setShipName()   receives newShipName a String
setYearBuilt()  receives newYearBuilt a String
setShipRegistry() receives newShipRegistry a String
toString()

Note: 
yearBuilt is a String so that it could handle the ship: Argo from 1300 BC
https://en.wikipedia.org/wiki/Argo
Sadly, it didn't make it into the driver

*/
