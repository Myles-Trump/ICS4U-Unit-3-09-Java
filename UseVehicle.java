/*
* The "UseVehicle" program lets the user use their vehicle
*
* @author  Myles Trump
* @version 1.0
* @since   2022-01-01
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class UseVehicle {

  /**
  * 3.
  */
  public static final int C3 = 3;

  /**
  * 4.
  */
  public static final int C4 = 4;

  /**
  * 5.
  */
  public static final int C5 = 5;

  /**
  * 6.
  */
  public static final int C6 = 6;

  /**
  * Prevent instantiation.
  * Throw an exception IllegalStateException.
  * if this ever is called
  *
  * @throws IllegalStateException
  *
  */
  private UseVehicle() {
    throw new IllegalStateException("Cannot be instantiated");
  }

  /**
  * The start of bikeChoices() function.
  */
  public static final void bikeChoices() {
    Unicycle uniVariable = new Unicycle();
    Tricycle triVariable = new Tricycle();
    int userInputted = 0;
    int userInputted1 = 0;

    final Scanner whichBike = new Scanner(System.in);
    try {
      System.out.print("\nWould you like to (input 1) use the unicycle, ");
      System.out.print(" or (input 2) use the tricycle?: ");
      switch (whichBike.nextInt()) {
        case 1:
          while (userInputted != C4) {
            final Scanner userInput = new Scanner(System.in);
            System.out.print("\nWould you like to (input 1) change your ");
            System.out.print("cadence, (input 2) change your lean, (input 3) ");
            System.out.print("check how many wheels you have, or (input 4) ");
            System.out.print("exit?: ");
            userInputted = userInput.nextInt();
            switch (userInputted) {
              case 1:
                final Scanner newCadence = new Scanner(System.in);
                uniVariable.getCadence();
                System.out.print("\nEnter your new cadence: ");
                int newCad = newCadence.nextInt();
                if (newCad < 0) {
                  System.out.println("\nYou can't have a negative cadence!");
                } else {
                  uniVariable.newCadence(newCad);
                  System.out.println("\nCadence updated!");
                }
                break;
              case 2:
                uniVariable.getLean();
                System.out.print("\nEnter your new lean (20 to -20): ");
                final Scanner newLean = new Scanner(System.in);
                uniVariable.additiveLean(newLean.nextInt());
                break;
              case C3:
                uniVariable.numberOfWheels();
                break;
              case C4:
                break;
              default:
                System.out.println("\nYou have entered an invalid input!");
                break;
            }
          }
          break;
        case 2:
          while (userInputted != C4) {
            final Scanner userInput = new Scanner(System.in);
            System.out.print("\nWould you like to (input 1) change your ");
            System.out.print("cadence, (input 2) honk your horn, (input 3) ");
            System.out.print("check how many wheels you have, or (input 4) ");
            System.out.print("exit?: ");
            userInputted = userInput.nextInt();
            switch (userInputted) {
              case 1:
                final Scanner newCadence = new Scanner(System.in);
                triVariable.getCadence();
                System.out.print("\nEnter your new cadence: ");
                int newCad = newCadence.nextInt();
                if (newCad < 0) {
                  System.out.println("\nYou can't have a negative cadence!");
                } else {
                  triVariable.newCadence(newCad);
                  System.out.println("\nCadence updated!");
                }
                break;
              case 2:
                triVariable.honkHorn();
                break;
              case C3:
                triVariable.numberOfWheels();
                break;
              case C4:
                break;
              default:
                System.out.println("\nYou have entered an invalid input!");
                break;
            }
          }
          break;
        default:
          System.out.println("You have entered an invalid input!");
          break;
     }
    } catch (java.util.InputMismatchException errorCode) {
      System.out.println("\nYou have not entered a valid input.");
    }
  System.out.println("\nDone.");
  }

  /**
  * The start of truckChoices() function.
  */
  public static final void truckChoices() {
    TowTruck towVariable = new TowTruck();
    SemiTruck semiVariable = new SemiTruck();
    int userInputted = 0;
    int userInputted1 = 0;

    final Scanner whichVehicle = new Scanner(System.in);
    try {
      System.out.print("\nWould you like to (input 1) use the unicycle, ");
      System.out.print("(input 2) use the tricycle, (input 3) use the ");
      System.out.print("tow truck, or (input 4) use the semi-truck?: ");
      switch (whichVehicle.nextInt()) {
        case 1:
          final Scanner licensePlateChoice = new Scanner(System.in);
          System.out.print("\nEnter your tow truck's license plate: ");
          String setPlate = licensePlateChoice.nextLine();
          towVariable.setLicensePlate(setPlate);

          while (userInputted1 != C6) {
            final Scanner userInput1 = new Scanner(System.in);
            System.out.print("\nWould you like to (input 1) interact with the");
            System.out.print(" license plate, (input 2) interact with the ");
            System.out.print("truck's speed, (input 3) cycle the air, ");
            System.out.print("(input 4) check the number of wheels, (input 5)");
            System.out.print(" tow a vehicle, or (input 6) exit?: ");
            userInputted1 = userInput1.nextInt();
            switch (userInputted1) {
              case 1:
                final Scanner userChoice = new Scanner(System.in);
                System.out.print("\nYour license plate is "
                  + towVariable.getLicensePlate()
                  + ", would you like to change it? (y/n): ");
                switch (userChoice.nextLine()) {
                  case "y":
                    final Scanner newPlate = new Scanner(System.in);
                    System.out.print("\nEnter a new plate: ");
                    String plateChoice = newPlate.nextLine();
                    towVariable.setLicensePlate(plateChoice);
                    break;
                  default:
                    break;
                }
                break;
              case 2:
                towVariable.currentSpeed();
                towVariable.maximumSpeed();
                final Scanner newChoice2 = new Scanner(System.in);
                System.out.print("\nWould you like to (input 1) ");
                System.out.print("accelerate, (input 2) use the ");
                System.out.print("brakes, or (input 3) exit?: ");
                switch (newChoice2.nextInt()) {
                  case 1:
                    final Scanner accel = new Scanner(System.in);
                    System.out.print("\nHow much do you want to ");
                    System.out.print("accelerate? (mph): ");
                    towVariable.accelerate(accel.nextInt());
                    break;
                  case 2:
                    final Scanner brake = new Scanner(System.in);
                    System.out.print("\nHow much do you want to ");
                    System.out.print("brake? (mph): ");
                    towVariable.brake(brake.nextInt());
                    break;
                  default:
                    System.out.print("\nYou have entered an ");
                    System.out.print("invalid input.");
                    break;
                }
                break;
              case C3:
                towVariable.provideAir();
                break;
              case C4:
                towVariable.numberOfWheels();
                break;
              case C5:
                towVariable.towVehicle();
                break;
              case C6:
                break;
              default:
                break;
            }
          }
          break;
        case 2:
          final Scanner licensePlateChoice1 = new Scanner(System.in);
          System.out.print("\nEnter your tow truck's license plate: ");
          String setPlate1 = licensePlateChoice1.nextLine();
          semiVariable.setLicensePlate(setPlate1);

          while (userInputted1 != C6) {
            final Scanner userInput1 = new Scanner(System.in);
            System.out.print("\nWould you like to (input 1) interact with the");
            System.out.print(" license plate, (input 2) interact with the ");
            System.out.print("truck's speed, (input 3) cycle the air, ");
            System.out.print("(input 4) check the number of wheels, (input 5)");
            System.out.print(" toggle your cargo, or (input 6) exit?: ");
            userInputted1 = userInput1.nextInt();
            switch (userInputted1) {
              case 1:
                final Scanner userChoice = new Scanner(System.in);
                System.out.print("\nYour license plate is "
                  + semiVariable.getLicensePlate()
                  + ", would you like to change it? (y/n): ");
                switch (userChoice.nextLine()) {
                  case "y":
                    final Scanner newPlate = new Scanner(System.in);
                    System.out.print("\nEnter a new plate: ");
                    String plateChoice = newPlate.nextLine();
                    semiVariable.setLicensePlate(plateChoice);
                    break;
                  default:
                    break;
                }
                break;
              case 2:
                semiVariable.currentSpeed();
                semiVariable.maximumSpeed();
                final Scanner newChoice2 = new Scanner(System.in);
                System.out.print("\nWould you like to (input 1) ");
                System.out.print("accelerate, (input 2) use the ");
                System.out.print("brakes, or (input 3) exit?: ");
                switch (newChoice2.nextInt()) {
                  case 1:
                    final Scanner accel = new Scanner(System.in);
                    System.out.print("\nHow much do you want to ");
                    System.out.print("accelerate? (mph): ");
                    semiVariable.accelerate(accel.nextInt());
                    break;
                  case 2:
                    final Scanner brake = new Scanner(System.in);
                    System.out.print("\nHow much do you want to ");
                    System.out.print("brake? (mph): ");
                    semiVariable.brake(brake.nextInt());
                    break;
                  default:
                    System.out.print("\nYou have entered an ");
                    System.out.print("invalid input.");
                    break;
                }
                break;
              case C3:
                semiVariable.provideAir();
                break;
              case C4:
                semiVariable.numberOfWheels();
                break;
              case C5:
                semiVariable.toggleCargo();
                break;
              case C6:
                break;
              default:
                break;
            }
          }
          break;
        default:
          System.out.println("You have entered an invalid input!");
          break;
     }
    } catch (java.util.InputMismatchException errorCode) {
      System.out.println("\nYou have not entered a valid input.");
    }
  System.out.println("\nDone.");
  }

  /**
  * The starting main() function.
  *
  * @param args No args will be used
  */
  public static void main(final String[] args) {
    final Scanner biOrTr = new Scanner(System.in);
    System.out.print("Do you want to use a (input 1) bike type or a (input 2)");
    System.out.print(" truck type?: ");
    int bikeOrTruck = biOrTr.nextInt();
    switch (bikeOrTruck) {
      case 1:
        bikeChoices();
        break;
      case 2:
        truckChoices();
        break;
      default:
        System.out.println("\nYou have not entered a valid input!");
        break;
    }
  }
}
