/**
 * @author Juan Esteban Patiño
 * @version 1.0
 */
public class Planet extends PlanetaryObject {

    /**
     * Instantiates a new Planet.
     *  @param name            the name
     * @param mass            the mass
     * @param density         the density
     * @param averageDistance the average distance
     * @param diameter        the diameter
     * @param referenceData   the reference data
     */


    public Planet(String name, double mass, double density, double averageDistance, double diameter, String referenceData) {
        super(name, mass, density, averageDistance, diameter, referenceData);
    }
}
