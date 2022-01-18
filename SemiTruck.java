/*
* The "SemiTruck" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-13
*/

public class SemiTruck extends Truck {


    /**
    * 6.
    */
    public static final int C6 = 6;

    /**
    * 18.
    */
    public static final int C18 = 18;

    /**
    * Calling methods from its superclass (Truck).
    */
    public SemiTruck() {
        super();
    }

    // The  class has one unique field

    /**
    * Defining and setting number of wheels.
    */
    private int numOfWheels = C18;

    /**
    * State of cargo.
    */
    private int cargoState = 1;

    // methods

    /**
    * The toggleCargo() method lets the user tow a vehicle.
    */
    public void toggleCargo() {
        if (cargoState == 1) {
            cargoState = 0;
            numOfWheels = C6;
            System.out.println("\nYou have removed your cargo!");
        } else if (cargoState == 0) {
            cargoState = 1;
            numOfWheels = C18;
            System.out.println("\nYou have added cargo!");
        }
    }
    /**
    * The numberOfWheels() method lets the user check the number of wheels.
    */
    public void numberOfWheels() {
        System.out.println("\nYou semi-truck has " + numOfWheels + " wheels.");
    }
}
