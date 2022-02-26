import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Transport.
 */
public class Transport extends Vehicle {

    /**
     * Instantiates a new Vehicle.
     *
     * @param type the type
     * @param brand the brand
     * @param color the color
     * @param model the model
     * @param numPassengers the num passengers
     * @param numWheels the num wheels
     */

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    /**
     * The Category.
     */
    String category;

    /**
     * The Input.
     */
    Scanner input = new Scanner(System.in);
    /**
     * The Option.
     */
    char option;
    /**
     * The Type vehicle.
     */
    String typeVehicle;

    /**
     * Instantiates a new Transport.
     *
     * @param type          the type
     * @param brand         the brand
     * @param color         the color
     * @param model         the model
     * @param numPassengers the num passengers
     * @param numWheels     the num wheels
     * @param typeVehicle   the type vehicle
     */
    public Transport(String type, String brand, String color, int model, int numPassengers, int numWheels, String typeVehicle) {
        super(type, brand, color, model, numPassengers, numWheels);
        this.typeVehicle = typeVehicle;
    }

    /**
     * Menu start
     */
    public void menu() {
        System.out.println("**********************************************");
        System.out.println("********** Vehicle Creation System **********");
        System.out.println("**********************************************");
        System.out.println("What action do you wish to take ? \n" +
                "1 Create vehicles \n" +
                "2 View Vehicles \n" +
                "3 Exit ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                createVehicle();
                break;
            case 2:
                viewVehicle();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    /**
     * Method to create an object of type vehicle
     */
    public void createVehicle() {
        // for (int i = 1; i <= 10; i++) {
        clearBuffer();
        System.out.println(" select an option :  \n" +
                " 1 Car \n" +
                " 2 Truck \n" +
                " 3 Motorcycle \n" +
                " 4 Boat \n" +
                " 5 Bike");
        option = input.next().charAt(0);

        switch (option) {
            case '1':
                setType("Car");
                createCar();
                continueProgram();
                clearBuffer();
                break;
            case '2':
                setType("Truck");
                createTruck();
                continueProgram();
                clearBuffer();
                break;
            case '3':
                setType("Motorcycle");
                createMotorcycle();
                continueProgram();
                clearBuffer();
                break;
            case '4':
                setType("Boat");
                createBoat();
                continueProgram();
                clearBuffer();
                break;
            case '5':
                setType("Bike");
                createBike();
                continueProgram();
                clearBuffer();
                break;
        }
    }
    //  }

    /**
     * Method to create an object of type car
     */
    public void createCar() {
        vehicles.add(new Vehicle(getType(), getBrand(), getColor(), getModel(), getNumPassengers(), getNumWheels()));
        typeTransport();

    }

    /**
     * Method to create an object of type truck
     */
    private void createTruck() {
        vehicles.add(new Vehicle(getType(), getBrand(), getColor(), getModel(), getNumPassengers(), getNumWheels()));
        typeTransport();

    }

    /**
     * Method to create an object of type motorcycle
     */
    private void createMotorcycle() {

        vehicles.add(new Vehicle(getType(), getBrand(), getColor(), getModel(), getNumPassengers(), getNumWheels()));
        typeTransport();


    }

    /**
     * Method to create an object of type boat
     */
    private void createBoat() {
        vehicles.add(new Vehicle(getType(), getBrand(), getColor(), getModel(), getNumPassengers(), getNumWheels()));
        typeTransport();
    }

    private void createBike() {
        vehicles.add(new Vehicle(getType(), getBrand(), getColor(), getModel(), getNumPassengers(), getNumWheels()));
        typeTransport();
    }

    /**
     * Method of displaying the list of vehicles
     */
    public void viewVehicle() {
        try {
            if (vehicles.size() == 0) {
                throw new ArrayIndexOutOfBoundsException("This list is empty");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("list vehicles, and your category :" + "{ " + typeVehicle + " " + vehicles.get(i) + "}");
        }

    }

    public void clearBuffer() {
        input.nextLine();
    }

    /**
     * Method for specifying the vehicle category
     */
    public void typeTransport() {
        System.out.println("Insert vehicle category ");
        category = input.nextLine();
        String firstChar = category.substring(0, 1).toUpperCase();
        String rest = category.substring(1, category.length());
        category = firstChar + rest;
        typeVehicle = category;
    }


    /**
     * Method to continue or exit the program
     */
    public void continueProgram() {
        System.out.println("You wish to continue? (y/n)");
        char follow = input.nextLine().charAt(0);
        if (String.valueOf(follow).equalsIgnoreCase("Y")) {
            menu();
        } else {
            System.out.println("Program terminated.");
            System.exit(0);
        }
    }
}







