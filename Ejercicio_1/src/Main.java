import java.util.Scanner;

/**
 * Main class start of execution
 * @author  Juan Esteban Patiño
 * @version 1.0.0'
 */
public class Main {

    /**
     * Instance the class Solar system.
     */
    static SolarSystem solarSystem = new SolarSystem("Solar System");
    /**
     *Instance od the class Scanner input
     */
    static Scanner input = new Scanner(System.in);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        execution();
    }

    /**
     * method involving the program solution logic
     */
    private static void execution() {
        int options = 0;

        System.out.println("select action to realice \n" +
                "1 Calculate distance for two objects \n" +
                "2 Calculate gravitational attraction of planets \n" +
                "3 Wiew list planets");
        options = input.nextInt();
        try {
            if (options >= 1 && options <= 3) {

                String date1;
                String date2;

                PlanetaryObject planet1 = null;
                PlanetaryObject planet2 = null;
                double calculate;
                switch (options) {
                    case 1:
                        clearBuffer();
                        solarSystem.viewPlatenarySystem();
                        System.out.println("Enter data for the first planet : ");
                        date1 = input.nextLine();
                        planet1 = solarSystem.getDataObject(date1);
                        if (planet1 == null) {
                            System.out.println("the planet doesn't exist");
                        } else {
                            System.out.println("Enter data for the second planet : ");
                            date2 = input.nextLine();
                            planet2 = solarSystem.getDataObject(date2);
                            if (planet2 == null) {
                                System.out.println("the planet doesn't exist");
                            } else {
                                System.out.println("the distance for the 2 planets entered is : \n"
                                        + (planet1.calculateDistance(planet2) / 1000) + "Km");
                            }
                        }
                        continueProgram();
                        break;
                    case 2:
                        clearBuffer();
                        System.out.println("Enter data for the first planet : ");
                        date1 = input.nextLine();
                        date2 = "";
                        planet1 = solarSystem.getDataObject(date1);
                        planet2 = null;
                        if (planet1 == null) {
                            System.out.println("the planet doesn't exist");
                        } else System.out.println("Enter data for the second planet : ");
                        date2 = input.nextLine();
                        planet2 = solarSystem.getDataObject(date2);
                        if (planet2 == null) {
                            System.out.println("the planet doesn't exist");
                        } else {
                            calculate = planet1.getGravitationAttraction(planet2);
                            System.out.println("The gravitational attraction of the planets is: " + calculate + "newton");
                        }
                        continueProgram();
                        break;
                    case 3:
                        solarSystem.viewPlatenarySystem();
                        continueProgram();

                }

            } else {
                throw new ExcepcionsData("Invalid option");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            continueProgram();
        }
    }

    /**
     * Method to clear the cache from the memory buffer.
     */
    public static void clearBuffer() {
        input.nextLine();
    }

    /**
     * Method for the user to select whether to continue or close
     */
    public static void continueProgram() {
        System.out.println("You wish to continue? (y/n)");
        char follow = input.next().charAt(0);
        if (String.valueOf(follow).equalsIgnoreCase("Y")) {
            execution();
        } else {
            System.out.println("Program terminated.");
            System.exit(0);
        }
    }
}
