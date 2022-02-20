import java.util.InputMismatchException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * author Juan Esteban Patiño
 */
public class Ordering_Methods extends Menu {

    /**
     * This class has the purpose of capturing the information entered by keyboard.
     */
    Scanner input = new Scanner( System.in);
    /**
     * instance of the class to obtain formatting of a number in a smaller size
     */
    static DecimalFormat nFormat = new DecimalFormat("#.00");
    /**
     * This is declaration of the array that type Double
     */
    Double [] bubbleArray = new Double[size];

    /**
     *This method has the function to sort the array,
     * according to the option chosen by the user,
     * giving the possibility to organize either by the bubble method or by the quicksort method.
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
                    orderingOptions();
                    break;
                case 2:
                    quickSortOrdering(bubbleArray, 0,bubbleArray.length);
                    orderingOptions();
                    break;
                case 3:

                    break;
            }
        }catch (InputMismatchException exception){
            System.out.println("Invalid option, you must enter a whole number, try again.");
            input.nextInt();
        }
    }
    /**
     * Bubble sorting method
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
        Double bubbleArray[] = number;
        System.out.println("Arreglo ordenado con el metodo bubble sort");
        for (int k = 0 ; k < number.length; k ++){
            System.out.println(nFormat.format(bubbleArray[k]));
        }
    }
    /**
     * Quicksort ordering method.
     *
     * @param bubbleArray the bubble array
     * @param firstNum    the first num
     * @param lastNum     the last num
     */
    public void quickSortOrdering(Double[] bubbleArray, int  firstNum , int lastNum){
        bubbleArray = number;
        int x;
        int y;
        double pivot;
        double aux;

        x = firstNum;
        y = lastNum;
        pivot = bubbleArray[(firstNum + lastNum)/2];
        do {
            while (bubbleArray[x] < pivot){
                x++;
            }
            while (bubbleArray[y]>pivot){
                y--;
            }
            if (x <=y){
                aux = bubbleArray[x];
                bubbleArray[x] = bubbleArray[y];
                bubbleArray[y] = aux;
                x++;
                y--;
            }
        }while (x <= y);
        if (firstNum < y){
            quickSortOrdering(bubbleArray,firstNum,y);
        }
        if(x < lastNum){
            quickSortOrdering(bubbleArray,x,lastNum);
        }
        System.out.println("Arreglo ordenado con el metodo quicksort");
        for (int k = 0 ; k < bubbleArray.length; k ++){
            System.out.println(nFormat.format(bubbleArray[k]));
        }
    }
}
