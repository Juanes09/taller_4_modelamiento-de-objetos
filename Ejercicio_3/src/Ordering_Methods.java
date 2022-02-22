import java.util.InputMismatchException;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * The type Ordering methods.
 * @ author Juan Esteban Patiño
 * @ version 1.0
 */
public class Ordering_Methods extends Menu {
    /**
     * instance od the class Scanner
     */
    Scanner input = new Scanner( System.in);
    /**
     * instance od the class get format on the number
     */
    static DecimalFormat nFormat = new DecimalFormat("#.00");
    //Double [] bubbleArray = new Double[size];


    /**
     * Method to select the way to sort the array
     */
    public void orderingOptions(){
        try {
            int option;
            System.out.println("Seleccione un metodo de ordenamiento \n" +
                    "1 Metodo Bubble Sort \n" +
                    "2 Metodo QuickSort \n" +
                    "3 Salir");
            option = input.nextInt();

            switch (option){
                case 1:
                    bubbleOrdering();
                    viewOrdering();
                    break;
                case 2:
                    quicksortOrdering(number, 0,number.length-1);
                    viewOrdering();
                    break;
                case 3:
                    break;
            }
        }catch (InputMismatchException exception){
            System.out.println("Invalid option, you must enter a whole number, try again.");
            input.nextInt();
        }
        exit();
    }


    /**
     * method Bubble ordering.
     */
    public static void bubbleOrdering(){

        Double aux;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < number.length - 1; j++) {
                if (number[j] > number[j + 1]) {
                    aux = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = aux;
                }
            }
        }
        System.out.println("Order with bubblesort");
    }

    /**
     * method Quicksort ordering.
     *
     * @param array    the array
     * @param firstNum the first num
     * @param lastNum  the last num
     */
    public static void quicksortOrdering(Double array[], int  firstNum , int lastNum) {

        double pivot = array[firstNum];
        int x = firstNum;
        int y = lastNum;
        double aux;

        while (x < y) {
            while (array[x] <= pivot && x < y) x++;
            while (array[y] > pivot) y--;

            if (x < y) {
                aux = array[x];
                array[x] = array[y];
                array[y] = aux;
            }
        }
        array[firstNum] = array[y];
        array[y] = pivot;

        if (firstNum < y -1) quicksortOrdering(array,firstNum,y - 1);
        if (y+1 < lastNum) quicksortOrdering(array,y + 1, lastNum);

        System.out.println("Order with quicksort");
    }

    /**
     *  method to view ordering
     */
    private void viewOrdering() {
        for (int p = 0; p < number.length ; p++) {
            System.out.println(numFormat.format(number[p]));
        }
        }

    /**
     * method to continue or exit the program
     */
    public void exit(){
            System.out.println("Desea continuar (y/n) ");
            char next = input.next().charAt(0);
            if (next == 'y'){
                dataArray();
                orderingOptions();

            }else {
                System.exit(0);
            }
        }
    }
