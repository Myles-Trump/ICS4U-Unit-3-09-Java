/*
* The "TowTruck" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-13
*/

public class TowTruck extends Truck {


    /**
    * 6.
    */
    public static final int C6 = 6;

    /**
    * Calling methods from its superclass (Truck).
    */
    public TowTruck() {
        super();
    }

    // The  class has one unique field

    /**
    * Defining and setting number of wheels.
    */
    private int numOfWheels = C6;

    // methods

    /**
    * The towVehicle() method lets the user tow a vehicle.
    */
    public void towVehicle() {
        System.out.println("\nYou have towed someone's vehicle!");
    }
    /**
    * The numberOfWheels() method lets the user check the number of wheels.
    */
    public void numberOfWheels() {
        System.out.println("\nYou tow truck has " + numOfWheels + " wheels.");
    }
}
