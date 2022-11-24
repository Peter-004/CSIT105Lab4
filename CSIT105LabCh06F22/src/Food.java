package csit105labch06f22;

/**
 * Food Class provided for Lab 6 - originally written by Stephen Brower
 *
 * @author Stephen Brower ( see line 71 )
 */
public class Food {

    private String description;
    private double price;

    /**
     * Constructor
     *
     * @param initialDescription value for the description field
     * @param initialPrice value for the price field
     */
    public Food(String initialDescription, double initialPrice) {
        description = initialDescription;
        price = initialPrice;
    }

    /**
     * getDescription method returns value in the description field
     *
     * @return value in the description field
     */
    public String getDescription() {
        return description;
    }

    /**
     * getPrice method returns value in the price field
     *
     * @return value in the price field
     */
    public double getPrice() {
        return price;
    }

    /**
     * setDesciption method assigns a new value for description field
     *
     * @param newDescription new value for description field
     */
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    /**
     * setPrice method assigns a new value for the price field
     *
     * @param newPrice new value for the price field
     */
    public void setPrice(double newPrice) {

        price = newPrice;
    }

    /**
     * markdown method reduces the price by 10%
     */
    public void markdown() {            // DO NOT CHANGE THIS METHOD!
        double percentReduction = .1;

        price = (double) Math.round(price * (1 - percentReduction) * 100) / 100;
    }

    /**
     * markdown method reduces the price by a certain percentage
     *
     * @param percentReduction value for the reduction percentage
     */
    public void markdown(double percentReduction){
        price = (double) Math.round(price * (1 - percentReduction) * 100) / 100;
    }

    /**
     * toString method returns a description of food
     *
     * @return a String representing the Food
     */
    public String toString(){
        return description + " " + price;
    }

    /**
     * equals method compares two strings
     * @param otherFood an instance of Food to compare
     * @return a boolean after comparison
     */
    public boolean equals(Food otherFood){
        boolean equivalent;

        if(description.equalsIgnoreCase(otherFood.getDescription())
        && price == otherFood.getPrice()){
            equivalent = true;
        }
        else{
            equivalent = false;
        }

        return equivalent;

    }
    /* ==================== delta for Lab is below ========================= */

    /* author for the additional methods: Adebayo Opemipo Peter */
    
}
