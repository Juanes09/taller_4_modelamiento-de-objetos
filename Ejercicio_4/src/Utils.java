import java.util.ArrayList;
import java.util.Scanner;

/**
 * utils class extending vehicle class
 */
public class Utils extends Vehicle {

    /**
     * instance od the class Scanner input
     */
    Scanner input = new Scanner(System.in);
    /**
     * declaration of the arraylist of type vehicles, The Motors.
     */
    ArrayList<Vehicle> motors = new ArrayList<>();


    /**
     * Instantiates a new Utils.
     *
     * @param type          the type
     * @param brand         the brand
     * @param color         the color
     * @param model         the model
     * @param numPassengers the num passengers
     * @param numWheels     the num wheels

     */
    public Utils(String type, String brand , String color , int model, int numPassengers, int numWheels) {
        super(type, brand, color, model, numPassengers, numWheels);
    }

    /**
     * Data vehicle.
     * Method to set and obtain the values of vehicle attributes
     */
    public void dataVehicle() {
        String systemContinue = "y";

        for (int i = 0; i <= motors.size(); i++) {

            if (systemContinue.equalsIgnoreCase("SI")) {
                System.out.println("Enter the brand name of the " + getType());
                this.setType(input.nextLine());
                while ((getType().equals(""))) {
                    System.out.println("You must enter a valid entry, try again.");
                    this.setType(input.nextLine());
                }

                System.out.println("Enter the mark of the " + getBrand());
                this.setBrand((input.nextLine()));
                System.out.println("Enter the model of the" + getBrand());
                this.setModel(input.nextInt());
                System.out.println("Enter the color of the " + getBrand());
                this.setColor(input.nextLine());
                System.out.println("Enter the number of passengers for the " + getBrand());
                this.setNumPassengers((input.nextInt()));
                System.out.println("Enter the number of wheels " + getBrand());
                this.setNumWheels(input.nextInt());
                clearBuffer();

                motors.add(new Vehicle(getType(), getBrand(), getColor(), getModel(), getNumPassengers(), getNumWheels()));
                System.out.println("to continue enter  (y/n)");
                systemContinue = input.next();
            } else {
                break;
            }
        }

        listVehicles();
    }


    /**
     * List vehicles.
     * Method for listing vehicles
     */
    public void listVehicles() {
        for (int i = 1; i <= motors.size(); i++) {
            System.out.println(motors);
        }
    }

    /**
     * Clear buffer.
     * Method to clear the cache from the memory buffer.
     */
    public void clearBuffer() {
        input.nextLine();
    }
}