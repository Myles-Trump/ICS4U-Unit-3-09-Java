/*
* The "Truck" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-01
*/

public class Truck extends Vehicle {

    /**
    * 4.
    */
    public static final int C4 = 4;

    /**
    * Calling methods from its superclass (Vehicle).
    */
    public Truck() {
        super();
    }

    /**
    * Defining and setting number of wheels.
    */
    private int numOfWheels = C4;

    // Methods
    /**
    * The provideAir() method changes the rpm of the bike.
    */
    public void provideAir() {
        System.out.println("\nYou have recycled your air!");
    }
    /**
    * The numberOfWheels() method lets the user check the number of wheels.
    */
    public void numberOfWheels() {
        System.out.println("\nYour truck has " + numOfWheels + " wheels.");
    }
}
