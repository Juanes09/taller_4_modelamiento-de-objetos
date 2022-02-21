/**
 * The type Star object.
 * @author  Juan esteban Patiño
 * @version 1.0
 */
public class StarObject extends PlanetaryObject {
    /**
     * Instantiates a new Star object.
     *
     * @param name     the name
     * @param mass     the mass
     * @param diameter the diameter
     */
    public StarObject(String name, double mass, double diameter) {
        super(name, mass, diameter);
        this.setReferenceData(String.valueOf(this));
    }
}
