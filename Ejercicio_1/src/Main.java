import java.util.Scanner;

public class Main {

    static SolarSystem solarSystem = new SolarSystem("Solar System");
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        execution();
    }

    private static void execution() {
        int options;

        System.out.println("select action to realice \n" +
                "1 Calculate distance for two objects \n" +
                "2 Calculate gravitational attraction of planets \n" +
                "3 Wiew list planets");
        options = input.nextInt();

        try {
            do {
                switch (options) {
                    case 1:
                        String date1;
                        String date2;
                        PlanetaryObject planet1;
                        PlanetaryObject planet2;
                        double calculate;
                        solarSystem.viewPlatenarySystem();
                        System.out.println("Enter data for the first planet : ");
                        date1 = input.next();
                        planet1 = solarSystem.getDataObject(date1);
                        planet2 = null;
                        if (planet1 == null) {
                            System.out.println("the planet doesn't exist");
                        } else {
                            System.out.println("Enter data for the second planet : ");
                            date2 = input.next();
                            planet2 = solarSystem.getDataObject(date2);
                            if (planet2 == null) {
                                System.out.println("the planet doesn't exist");
                            } else {
                                System.out.println("the distance for the 2 planets entered is : \n"
                                        + (planet1.calculateDistance(planet2) / 1000) + "Km");
                            }
                        }
                        execution();
                        date1 = "";
                        date2 = "";
                        planet1 = null;
                        planet2 = null;
                        break;
                    case 2:
                        System.out.println("Enter data for the first planet : ");
                        date1 = input.next();
                        planet1 = solarSystem.getDataObject(date1);
                        planet2 = null;
                        if (planet1 == null) {
                            System.out.println("the planet doesn't exist");
                        } else {
                            calculate = planet1.getGravitationAttraction(planet2);
                            System.out.println("The gravitational attraction of the planets is: " + calculate + "newton");
                        }
                        execution();
                        break;
                    case 3:
                        solarSystem.viewPlatenarySystem();
                        execution();

                    default:
                        System.out.println("Invalid selection");
                        execution();
                }
            }while (options < 1 || options >= 4);
        } catch (Exception e) {
            System.out.println("The operation invalidate" + e);
        }
    }
}
