

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *author Juan Esteban Patiño
 */
public class Menu {

    /**
     *This class has the purpose of capturing the information entered by keyboard.
     */
    Scanner input = new Scanner(System.in);
    /**
     *  This variable get value of the size of array
     */
    static int size;
    /**
     * This is declaration of the array that type Double
     */
    static Double[] number;
    /**
     * instance of the class to obtain formatting of a number in a smaller size
     */
    static DecimalFormat numFormat = new DecimalFormat("#.00");


    /**
     * Method to specify the size of the array entered by the console
     */
    public void dataArray() {
        System.out.println(" Ingrese cantidad de elementos del arreglo");
        size = input.nextInt();
        number = new Double[size];
        numFormat = new DecimalFormat("#.00");
        getData();
    }

    /**
     * Gets the different values for the array
     * @return the double [ ]
     */
    public static Double[] getData() {
        System.out.println("The origin array :");
        for (int i = 0; i < number.length; i++) {
            number[i] = (Math.random() * 100);
            System.out.println(numFormat.format(number[i]));
        }
        return number;
    }
}
