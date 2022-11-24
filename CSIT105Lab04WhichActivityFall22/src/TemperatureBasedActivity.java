package csit105lab04whichactivityfall22;

/**
 * Class for Lab 4
 * @author Stephen T. Brower ( put your name in the javadoc comment block
 * for the recommendedActivity method )
 * Note: normally, I ask for you to put your name with an author tag at 
 * the Javadoc comment block before the class header – but for this lab, 
 * put your name in the Javadoc comment block for the recommendedActivity() 
 * method below
 */
public class TemperatureBasedActivity {

    private int outdoorTemperature;

    /**
     * Constructor
     *
     * @param initialOutdoorTemperature initial value for the outdoorTemperature
     * field.
     */
    public TemperatureBasedActivity(int initialOutdoorTemperature) {
        outdoorTemperature = initialOutdoorTemperature;
    }

    /**
     * getOutdoorTemperature method returns the value from the
     * outdoorTemperature field
     *
     * @return value from the outdoorTemperature field
     */
    public int getOutdoorTemperature() {
        return outdoorTemperature;
    }

    /**
     * setOutdoorTemperature method assigns a new value for the
     * outdoorTemperature field
     *
     * @param newOutdoorTemperature new value for the outdoorTemperature field
     */
    public void setOutdoorTemperature(int newOutdoorTemperature) {
        outdoorTemperature = newOutdoorTemperature;
    }

    /**
     * the recommendedActivity method returns a suggested activity based on the
     * value currently in outdoorTemperature
     * 
     * Adebayo Opemipo
     * 
     * Note: normally, I ask for you to put your name with an author tag at 
     * the Javadoc comment block before the class header – but for this lab, 
     * put your name in this block 
     *
     * @return a String with the recommended activity
     */
    public String recommendedActivity() {
        String recommendedActivityToReturn;

        if( outdoorTemperature <= 10){
            recommendedActivityToReturn = "chess";
        }
        else if(outdoorTemperature >10 && outdoorTemperature <33 ){
            recommendedActivityToReturn = "skiing";
        }
        else if(outdoorTemperature >32 && outdoorTemperature <51 ){
            recommendedActivityToReturn = "Golf";
        }
        else if(outdoorTemperature >50 && outdoorTemperature <81 ){
            recommendedActivityToReturn = "Tennis";
        }
        else if(outdoorTemperature >80 && outdoorTemperature <101 ){
            recommendedActivityToReturn = "Swimming";
        }
        else{
            recommendedActivityToReturn = "move north";
        }

        return recommendedActivityToReturn;
    }
}
