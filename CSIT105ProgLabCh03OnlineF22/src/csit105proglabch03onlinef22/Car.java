package csit105proglabch03onlinef22;

/**
 * Car class for Lab for Ch 3.
 * Look at the "Demo - writing the Car class" videos
 * in the Module: "Ch 03 A First Look at Classes and Objects - overview".
 * Then look at the video on the "Lab Ch 03 ( classes part 1 )" assignment
 * where Brower will instruct you on what changes to make to this file.
 * @author Adebayo Opemipo
 */
public class Car {
    // declare class fields aka attributes of Car
    private int yearModel;
    private String make;
    private int speed;

    /**
     * Constructor ( when you do a new Car()...this Constructor
     * is run and will assign starting values to the class fields.
     * @param initialYearModel value for the yearModel field
     * @param initialMake value for the make field
     */
    public Car(int initialYearModel, String initialMake) {        
        // assign the value passed to the yearModel field
        yearModel = initialYearModel; 
        
        // assign the value passed to the make field
        make = initialMake; 
        
        // default the speed to 0
        speed = 0;  
    }

    /**
     * the getYearModel method returns the value from the yearModel field
     * @return value from the yearModel field
     */
    public int getYearModel() {
        // pass back the value from the yearModel field
        return yearModel;
    }

    /**
     * the setYearModel method assigns a new value for the yearModel field
     * @param newYearModel new value for the yearModel field
     */
    public void setYearModel(int newYearModel) {
        // change the value in the yearModel field to the value passed
        yearModel = newYearModel;  
    }

    /**
     * the getMake method returns the value from the make field
     * @return value from the make field
     */
    public String getMake() {
        // pass back the value from the make field
        return make;
    }

    /**
     * the setMake method assigns a new value for the make field
     * @param newMake new value for the make field
     */
    public void setMake(String newMake) {
        // change the value in the make field to the value passed
        make = newMake;
    }

    /**
     * the getSpeed method returns the value from the speed field
     * @return value from the speed field
     */
    public int getSpeed() {
        return speed;
    }
    
    
    // *** the video on the "Lab Ch 03 ( classes part 1 )" assignment
    // *** will instruct you on what changes to make here.

    /**
     * the accelerate method increases the speed of the car by 5
     */
    public void accelerate(){
        speed += 5;
    }

    public void brake(){
	    speed -= 5;
    }
}
