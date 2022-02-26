import java.util.Scanner;

/**
 * The type Vehicle.
 */
public class Vehicle {


    private String type;
    private String brand;
    private String color;
    private int model;
    private int numPassengers;
    private int numWheels;



    Scanner input = new Scanner(System.in);
    char option ;
    /**
     * Instantiates a new Vehicle.
     *
     * @param type          the type
     * @param brand         the brand
     * @param model         the model
     * @param numPassengers the num passengers
     * @param numWheels     the num wheels
     * @param color         the color
     */
    public Vehicle(String type, String brand, String color, int model, int numPassengers, int numWheels) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.numPassengers = numPassengers;
        this.numWheels = numWheels;


    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
        System.out.print("Enter brand : ");
        brand = input.next();
        return brand;
    }

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        System.out.print("Enter color : ");
        color = input.next();
        return color;

    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets model.
     *
     * @return the model
     */
    public int getModel() {
        System.out.print("Enter model : ");
        model = input.nextInt();
        return model;
    }
    /**
     * Sets model.
     *
     * @param model the model
     */
    public void setModel(int model) {
        this.model = model;
    }

    /**
     * Gets num passengers.
     *
     * @return the num passengers
     */
    public int getNumPassengers() {
        System.out.print("Enter numPassengers: ");
        numPassengers = input.nextInt();
        return numPassengers;
    }

    /**
     * Sets num passengers.
     *
     * @param numPassengers the num passengers
     */
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    /**
     * Gets num wheels.
     *
     * @return the num wheels
     */
    public int getNumWheels() {
        System.out.print("Enter numWheels : ");
        numWheels = input.nextInt();
        clearBuffer();
        return numWheels;
    }

    /**
     * Sets num wheels.
     *
     * @param numWheels the num wheels
     */
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }


    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model=" + model +
                ", numPassengers=" + numPassengers +
                ", numWheels=" + numWheels +
                '}';
    }

    public void clearBuffer(){
        input.next();
    }
}