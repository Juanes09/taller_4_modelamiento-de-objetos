public class PlanetaryObject {

    private double mass;
    private double density;
    private double diameter;
    private double averageDistance;
    String name;
    String ordering="distance";
    final static double G = 6.6726E-11;
    private PlanetaryObject referenceData;

    public PlanetaryObject(String name , double mass , double diameter) {
        this.name = name;
        this.mass = mass;
        this.averageDistance = 0L;
        this.diameter = diameter;
    }

    public PlanetaryObject(String name, double mass, double averageDistance, double diameter,PlanetaryObject referenceData) {
        this.mass = mass;
        this.diameter = diameter;
        this.averageDistance = averageDistance;
        this.name = name;
        this.referenceData = referenceData;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getAverageDistance() {
        return averageDistance;
    }

    public void setAverageDistance(double averageDistance) {
        this.averageDistance = averageDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlanetaryObject getReferenceData() {
        return referenceData;
    }

    public void setReferenceData(PlanetaryObject referenceData) {
        this.referenceData = referenceData;
    }

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
        if (!objectInitial.referenceData.referenceData.equals(objectInitial.referenceData)) {
            distance += calculateDistanceObjectData(objectInitial.referenceData);
        }
        return distance;
    }

    public double calculateDistance(PlanetaryObject planetObject) {
        double distance1=calculateDistanceObjectData(this);
        double distance2=calculateDistanceObjectData(planetObject);

        return Math.abs(distance1-distance2)*1000; //metros
    }

   // @Override
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


    @Override
    public String toString() {
        return "{" +
                "name = " + name +
                "mass=" + mass +
                "density=" + density +
                "diameter=" + diameter +
                '}';
    }
}
