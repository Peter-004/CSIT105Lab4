package csit105labch09f22;

/**
 * CruiseShip class for Lab Ch 09
 * @author Adebayo Opemipo
 */
public class CruiseShip extends Ship {

    private int numPassengers;

    /**
     * Constructor
     * @param initialShipName initial value for the shipName field
     * @param initialYearBuilt initial value for the yearBuilt field
     * @param initialShipRegistry initial value for the shipRegistry field
     * @param initialNumPassengers initial value for the numPassengers field
     */
    public CruiseShip( String initialShipName,String  initialYearBuilt, String initialShipRegistry, int initialNumPassengers){
        super(initialShipName, initialYearBuilt, initialShipRegistry);
        numPassengers = initialNumPassengers;
    }

    /**
     * getNumPassengers method retrieves the value from the numPassengers field
     * @return the value of numPassengers field
     */
    public int getNumPassengers(){
        return numPassengers;
    }

    /**
     * setNumPassengers method assigns a value to the numPassengers field
     * @param newNumPassengers the value to be assigned by the method
     */
    public void setNumPassengers(int newNumPassengers){
        numPassengers = newNumPassengers;
    }

    /**
     * toString method returns a full detail of the ship
     * @return a String representing the ship
     */
    public String toString(){
        return "Cruise Ship: " + getShipName() + " - Year: " + getYearBuilt() + " - Reg: " + getShipRegistry() +
                " - # Passengers: " + numPassengers;
    }
}

/*

Note:

In CruiseShip you will have 1 private field: numPassengers which is an int

The Constructor will receive: initialShipName, initialYearBuilt and initialShipRegistry all as Strings
                                and initialNumPassengers  as int

You will implement the methods:
getNumPassengers()
setNumPassengers()  receives newNumPassengers an int
toString()

*/

