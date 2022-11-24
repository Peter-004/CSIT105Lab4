package csit105labch09f22;

/**
 * CargoShip class for Lab Ch 09.
 * @author Adebayo Opemipo
 */
public class CargoShip extends Ship {
    private int cargoCapacity;

    /**
     * Constructor
     * @param initialShipName initial value for the shipName field
     * @param initialYearBuilt initial value for the yearBuilt field
     * @param initialShipRegistry initial value for the shipRegistry field
     * @param initialCargoCapacity initial value for the cargoCapacity field
     */
    public CargoShip(String initialShipName, String initialYearBuilt, String initialShipRegistry, int initialCargoCapacity){
        super(initialShipName,initialYearBuilt, initialShipRegistry);
        cargoCapacity = initialCargoCapacity;
    }

    /**
     * getCargoCapacity method retrieves the value from the cargoCapacity field
     * @return the value of the cargoCapacity field
     */
    public int getCargoCapacity(){
        return cargoCapacity;
    }

    /**
     * setCargoCapacity method assigns a value to the cargoCapacity field
     * @param newCargoCapacity the value to be assigned by the method
     */
    public void setCargoCapacity(int newCargoCapacity){
        cargoCapacity = newCargoCapacity;
    }

    /**
     * toString method returns a full detail of the ship
     * @return a String representing the ship
     */
    public String toString(){
        return String.format("Cargo Ship: %s - Year: %s - Reg: %s - tonnage: %,d",
                getShipName(), getYearBuilt(), getShipRegistry(), cargoCapacity);
    }
}

/*

Note:

In CargoShip you will have 1 private field: cargoCapacity  which is an int

The Constructor will receive: initialShipName, initialYearBuilt and initialShipRegistry all as Strings
                                and initialCargoCapacity   as int

You will implement the methods:
getCargoCapacity()
setCargoCapacity()  receives newCargoCapacity  an int
toString()

*/
