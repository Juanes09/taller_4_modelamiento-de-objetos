/**
 * The type Planetary object.
 *
 * @author Juan Esteban Patiño
 * @version 1.0
 */
public abstract  class PlanetaryObject implements Comparable<PlanetaryObject> {

    private double mass;
    private double density;
    private double diameter;
    private double averageDistance;
    /**
     * The Name.
     */
    String name;
    /**
     * The Ordering.
     */
    String ordering="distance";

    /**
     * The constant G.
     */
    final static double G = 6.6726E-11;
    private String referenceData;

    /**
     * Instantiates a new Planetary object.
     *
     * @param name     the name
     * @param mass     the mass
     * @param diameter the diameter
     */
    public PlanetaryObject(String name , double mass , double diameter) {
        this.name = name;
        this.mass = mass;
        this.averageDistance = 0L;
        this.diameter = diameter;
    }

    /**
     * Instantiates a new Planetary object.
     *
     * @param name            the name
     * @param mass            the mass
     * @param density         the density
     * @param averageDistance the average distance
     * @param diameter        the diameter
     * @param referenceData   the reference data
     */
    public PlanetaryObject(String name, double mass, double density, double averageDistance, double diameter,String referenceData) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.averageDistance = averageDistance;
        this.name = name;
        this.referenceData = referenceData;
    }

    /**
     * The method for obtaining mass.
     *
     * @return the mass
     */
    public double getMass() {
        return mass;
    }

    /**
     * The method for establishing the value of the mass.
     *
     * @param mass the mass
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * The method for obtaining density.
     *
     * @return the density
     */
    public double getDensity() {
        return density;
    }

    /**
     * The method for establishing the value of the density.
     *
     * @param density the density
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * The method for obtaining diameter.
     *
     * @return the diameter
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * The method for establishing the value of the diameter.
     *
     * @param diameter the diameter
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * The method for obtaining average distance.
     *
     * @return the average distance
     */
    public double getAverageDistance() {
        return averageDistance;
    }

    /**
     * The method for establishing the value of the distance.
     *
     * @param averageDistance the average distance
     */
    public void setAverageDistance(double averageDistance) {
        this.averageDistance = averageDistance;
    }

    /**
     * The method for obtaining  name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * The method for establishing the value of the name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method for obtaining  reference data.
     *
     * @return the reference data
     */
    public String getReferenceData() {
        return referenceData;
    }

    /**
     * The method for establishing the value of the reference data.
     *
     * @param referenceData the reference data
     */
    public void setReferenceData(String referenceData) {
        this.referenceData = referenceData;
    }

    /**
     * The method for obtaining gravitation attraction.
     *
     * @param planetObject the planet object
     * @return the gravitation attraction
     */
    public double getGravitationAttraction(PlanetaryObject planetObject) {

        double distancyBetweenOjects = this.calculateDistance(planetObject);
        double numerator=(this.mass * planetObject.mass * PlanetaryObject.G);
        double distance=distancyBetweenOjects;
        double denominator = distance * distance;
        double attraction= numerator / denominator;
        return attraction;
    }

    private double calculateDistanceObjectData(PlanetaryObject objectInitial){
        double distance = objectInitial.averageDistance;
        if (!objectInitial.referenceData.equals(objectInitial.referenceData)) {
            distance += calculateDistanceObjectData(objectInitial);
        }
        return distance;
    }

    /**
     * Calculate distance double of two date
     *
     * @param planetObject the planet object
     * @return the double
     */
    public double calculateDistance(PlanetaryObject planetObject) {
        double distance1=calculateDistanceObjectData(this);
        double distance2=calculateDistanceObjectData(planetObject);

        return Math.abs(distance1-distance2)*1000; //metros
    }

    @Override
    public int compareTo(PlanetaryObject object) {
        switch (ordering) {
            case "name":
                return this.name.compareTo(object.name);
            case "distance":
                if (calculateDistanceObjectData(this) >= calculateDistanceObjectData(object)) {
                    return 1;
                }
                else {
                    return -1;
                }
            case "size":
                if (this.diameter >= object.diameter) {
                    return 1;
                }
                else {
                    return -1;
                }
            case "mass":
                if (this.mass >= object.mass) {
                    return 1;
                }
                else {
                    return -1;
                }
        }
        return 0;
    }

    /**
     * get the different values of the objects to print them on the console
     * @return data values
     */

    @Override
    public String toString() {
        return "{" + " name='" + name + '\'' +
                ", mass=" + mass +
                ", density=" + density +
                ", diameter=" + diameter +
                ", averageDistance=" + averageDistance +
                ", referenceData='" + referenceData + '\'' +
                '}';
    }
}
