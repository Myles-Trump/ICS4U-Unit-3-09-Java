/*
* The "Tricycle" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-13
*/

public class Tricycle extends Bike {

    /**
    * Calling methods from its superclass (Bike).
    */
    public Tricycle() {
        super();
    }

    // The Bike class has one unique field

    /**
    * Defining and setting cadence.
    */
    private int cadence = 0;

    /**
    * Defining and setting number of wheels.
    */
    private int numOfWheels = 1;

    // methods

    /**
    * The honkHorn() method lets the user honk their horn.
    */
    public void honkHorn() {
        System.out.println("\nHonk honk!");
    }
}