/**
 * The type Vehicle.
 */
public class Vehicle {


    private String type;
    private String brand;
    private int model;
    private int numPassengers;
    private int numWheels;
    private String color;


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
    public Vehicle(String type, String brand, int model, int numPassengers, int numWheels, String color) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.numPassengers = numPassengers;
        this.numWheels = numWheels;
        this.color = color;

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
     * Gets model.
     *
     * @return the model
     */
    public int getModel() {
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

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", numPassengers=" + numPassengers +
                ", numWheels=" + numWheels +
                ", color='" + color + '\'' +
                '}';
    }
}