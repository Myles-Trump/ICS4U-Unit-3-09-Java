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

    /**
    * 20.
    */
    public static final int C20 = 20;

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
        System.out.println(" forward, negative is leaning back.)");
    }

    // methods

    /**
    * The method additiveLean() lets the user change how much they are leaning.
    * @return nothing
    * @param addedLean lean to be added
    */
    public int additiveLean(final int addedLean) {
        if (lean + addedLean > C20 || lean + addedLean < -C20) {
            System.out.println("Haha, you fell over! Your lean was reset.");
            lean = 0;
        } else if (lean + addedLean <= C20 && lean + addedLean >= -C20) {
            lean = lean + addedLean;
            System.out.println("Your lean was set to " + lean + " degrees.");
        }
        return addedLean;
    }

    /**
    * The numberOfWheels() method lets the user check the number of wheels.
    */
    public void numberOfWheels() {
        System.out.println("\nYou unicycle has " + numOfWheels + " wheels.");
    }
}
