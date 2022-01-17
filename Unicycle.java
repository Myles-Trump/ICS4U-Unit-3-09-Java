/*
* The "Unicycle" class
*
* @author Myles Trump
* @version 1.0
* @since 2022-01-13
*/

public class Unicycle extends Bike {

    /**
    * Calling methods from its superclass (Bike).
    */
    public Unicycle() {
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

    /**
    * Defining and setting your lean.
    */
    private int lean = 0;

    // getters

    /**
    * The getter for lean.
    */
    public void getLean() {
        System.out.print("\nYour lean is " + lean + ". (Positive is leaning");
        System.out.println(" forward, negative is leaning back.)")
    }

    // methods

    /**
    * The method additiveLean() lets the user change how much they are leaning.
    */
    public int additiveLean(final int addedLean) {
        if (lean + addedLean <= C20 || lean + addedLean >= -C20) {
            lean = lean + addedLean;
            System.out.println("Your lean was set to " + lean + " degrees.");
        } else if (lean + addedLean > C20 || lean + addedLean < -C20) {
            System.out.println("Haha, you fell over! Your lean was reset.");
            lean = 0;
        }
    }
}
