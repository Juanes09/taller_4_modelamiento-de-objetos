import java.util.ArrayList;

/**
 * The type Solar system.
 * @author  Juan Esteban Patiño
 * @version 1.0
 */
public class SolarSystem {


    String name;
    public ArrayList<PlanetaryObject> planetarySystem = new ArrayList<>();

    /**
     * Method that instantiates and creates an object of type solar system.
     * @param name the name
     */
    public SolarSystem(String name) {
        this.name = name;
        createPlanetarySystem();
    }


    private void createPlanetarySystem() {
        planetarySystem.add(new StarObject("Sun", 1.9891E30, 1392000));

        planetarySystem.add(new Planet("Mercury", 3.302E23, 57909175, 4879.4, "iron planet"));
        planetarySystem.add(new Planet("Venus", 5.9742E24, 108200000, 12103.6, "rocky planet"));
        planetarySystem.add(new Planet("Earth", 5.9742E24, 149597870, 12742, "Blue planet"));
        planetarySystem.add(new Planet("Mars", 6.4191E23, 227936640, 6779, "Red planet"));
        planetarySystem.add(new Planet("Jupiter", 1.8987E27, 778412010, 139822, "Gas giant"));
        planetarySystem.add(new Planet("Saturn", 5.6851E26, 1426725400f, 116464, "Ringed planet"));
        planetarySystem.add(new Planet("Uranus", 8.6849E25, 2870972200f, 50724, "Icy planet"));
        planetarySystem.add(new Planet("Neptune", 1.0244E26, 4498252900f, 49244, "Eighth planet"));
        planetarySystem.add(new Planet("Pluto", 1.25E22, 5913520000f, 2320, "The smallest"));
    }

    /**
     * Method for viewing the list of planets
     */
    public  void viewPlatenarySystem(){
        for (int i = 0; i < planetarySystem.size(); i++) {
            System.out.println(planetarySystem.get(i).toString());
        }
    }

    /**
     * Get data object planetary object.
     * @param name the name
     * @return the planetary object
     */
    public PlanetaryObject getDataObject(String name){
        for (PlanetaryObject planetObject: planetarySystem) {
            if (planetObject.name.toUpperCase().contains(name.toUpperCase()));
            return planetObject;
        }

        return null;
    }

}
