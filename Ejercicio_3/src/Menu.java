
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * class menu
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
     * instance od the class get format on the number
     */
    static DecimalFormat numFormat = new DecimalFormat("#.00");


    /**
     * Data array.
     */
    public void dataArray() {
        System.out.println(" Ingrese cantidad de elementos del arreglo");
        size = input.nextInt();
        number = new Double[size];
        numFormat = new DecimalFormat("#.00");
        getData();
    }

    /**
     * Get data double [ ].
     *
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
